package org.geeksexception.pse.stocks.api.util;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HttpUtil {
	
	private static final Logger log = LoggerFactory.getLogger(HttpUtil.class);
	
	private volatile static HttpUtil INSTANCE;
	
	private final String baseUrl = "http://www.pse.com.ph/stockMarket";
	
	private HttpUtil() { }
	
	public static HttpUtil getInstance() {
		if(INSTANCE == null) {
			synchronized(HttpUtil.class) {
				if(INSTANCE == null) {
					INSTANCE = new HttpUtil();
				}
			}
		}
		
		return INSTANCE;
	}
	
	public String getSecuritiesAndIndicesForPublic() {
		
		HttpURLConnection connection = getConnection(baseUrl + "/home.html?method=getSecuritiesAndIndicesForPublic&ajax=true", "GET");
		
		String response = getResponse(connection);
		connection.disconnect();
		
		return response.replaceFirst("\\{.+?\\},", "");
	}
	
	public String findSecurityOrCompany(String symbol) {
		
		HttpURLConnection connection = getConnection(baseUrl + "/home.html?method=findSecurityOrCompany&ajax=true", "POST");
		
		try {
			DataOutputStream dataOutputStream;
			
			String payload =
					URLEncoder.encode("start", "UTF-8") + "=" +
					URLEncoder.encode("0", "UTF-8") + "&" +
					URLEncoder.encode("limit", "UTF-8") + "=" +
					URLEncoder.encode("1", "UTF-8") + "&" +
					URLEncoder.encode("query", "UTF-8") + "=" +
					URLEncoder.encode(symbol, "UTF-8");
			
			dataOutputStream = new DataOutputStream(connection.getOutputStream());
			
			dataOutputStream.writeBytes(payload);
			dataOutputStream.flush();
		} catch (IOException e) { log.error("{}", e); }
		
		String response = getResponse(connection);
		connection.disconnect();
		
		return response;
	}
	
	public String getCompanyInfoByCompanyIdAndSecurityId(String companyId, String securityId) {
		HttpURLConnection connection = getConnection(baseUrl + "/companyInfo.html?method=fetchHeaderData&ajax=true", "POST");
		
		try {
			DataOutputStream dataOutputStream;
			
			String payload =
					URLEncoder.encode("company", "UTF-8") + "=" +
					URLEncoder.encode(companyId, "UTF-8") + "&" +
					URLEncoder.encode("security", "UTF-8") + "=" +
					URLEncoder.encode(securityId, "UTF-8");
			
			dataOutputStream = new DataOutputStream(connection.getOutputStream());
			
			dataOutputStream.writeBytes(payload);
			dataOutputStream.flush();
		} catch (IOException e) { log.error("{}", e); }
		
		String response = getResponse(connection);
		connection.disconnect();
		
		return response;
	}
	
	public String getCompanyInfoHistoricalData(String securityId) {
		HttpURLConnection connection = getConnection(baseUrl + "/companyInfoHistoricalData.html?method=getRecentSecurityQuoteData&ajax=true", "POST");
		
		try {
			DataOutputStream dataOutputStream;
			
			String payload =
					URLEncoder.encode("security", "UTF-8") + "=" +
					URLEncoder.encode(securityId, "UTF-8");
			
			dataOutputStream = new DataOutputStream(connection.getOutputStream());
			
			dataOutputStream.writeBytes(payload);
			dataOutputStream.flush();
		} catch (IOException e) { log.error("{}", e); }
		
		String response = getResponse(connection);
		connection.disconnect();
		
		return response;
	}
	
	private HttpURLConnection getConnection(String urlString, String verb) {
		
		HttpURLConnection conn = null;
		try {
			URL url = new URL(urlString);
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod(verb);
			conn.setDoInput(true);
			conn.setDoOutput(true);
		} catch (IOException e) { log.error("{}", e); }
		
		return conn;
	}
	
	private String getResponse(HttpURLConnection conn) {
		
		String xml = "";
		
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String next = null;
			
			while ((next = reader.readLine()) != null)
				xml += next.equals("") ? next : next + "\n";
		} catch (IOException e) { log.error("{}", e); }
		
		return xml;
	}
	
}