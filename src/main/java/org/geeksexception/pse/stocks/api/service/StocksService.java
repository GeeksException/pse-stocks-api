package org.geeksexception.pse.stocks.api.service;

import java.util.ArrayList;
import java.util.List;

import org.geeksexception.pse.stocks.api.model.CompanyStockInfo;
import org.geeksexception.pse.stocks.api.model.CompanyStockInfoRecord;
import org.geeksexception.pse.stocks.api.model.HistoricalCompanyStockInfo;
import org.geeksexception.pse.stocks.api.model.HistoricalCompanyStockInfoRecord;
import org.geeksexception.pse.stocks.api.model.StockHistorySummary;
import org.geeksexception.pse.stocks.api.model.StockRecord;
import org.geeksexception.pse.stocks.api.model.Stocks;
import org.geeksexception.pse.stocks.api.util.HttpUtil;
import org.geeksexception.pse.stocks.api.util.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Provides an easy to use API for accessing the REST web service exposed
 * by PSEi
 * 
 * @author Geng
 *
 */
public class StocksService {
	
	private static final Logger log = LoggerFactory.getLogger(StocksService.class);
	
	private JsonUtil jsonUtil;
	
	private HttpUtil httpUtil;
	
	/**
	 * Default constructor
	 */
	public StocksService() {
		
		jsonUtil = JsonUtil.getInstance();
		httpUtil = HttpUtil.getInstance();
		
	}
	
	/**
	 * Retrieve all stocks with basic information
	 * 
	 * @return All stocks
	 */
	public List<StockHistorySummary> retrieveAllStocks() {
		
		String allStocks = httpUtil.getSecuritiesAndIndicesForPublic();
		log.debug("retrieveAllStocks: {}", allStocks);
		
		List<StockHistorySummary> summary = jsonUtil.readValueFromJsonStringToList(allStocks, 
				StockHistorySummary.class);
		log.debug("{}", summary);
		
		return summary == null ? new ArrayList<StockHistorySummary>() : summary;
		
	}
	
	private StockRecord findCompanyInfoBySymbol(String symbol) {
		
		String stocks = httpUtil.findSecurityOrCompany(symbol);
		StockRecord stockRecord = jsonUtil.readValueFromJsonString(stocks, Stocks.class)
				.getStockRecords().get(0);
		
		return stockRecord;
		
	}
	
	/**
	 * Provides a real time update of status of a given stock symbol
	 * 
	 * @param symbol The stock symbol
	 * @return Company status in real time
	 */
	public CompanyStockInfoRecord findBySymbol(String symbol) {
		
		StockRecord stockRecord = findCompanyInfoBySymbol(symbol);
		
		String companyInfo = httpUtil.getCompanyInfoByCompanyIdAndSecurityId(
				stockRecord.getListedCompanyId(), stockRecord.getSecurityId());
		log.debug("findBySymbol: {}", companyInfo);
		
		CompanyStockInfo companyStockInfo = jsonUtil.readValueFromJsonString(companyInfo, CompanyStockInfo.class);
		CompanyStockInfoRecord companyStockInfoRecord = 
				companyStockInfo == null ? new CompanyStockInfoRecord() : companyStockInfo.getStockHistoryRecords().get(0);
		log.debug("{}", companyStockInfoRecord);
		
		return companyStockInfoRecord;
		
	}
	
	/**
	 * Retrieves the last 30 historical record snapshots of the given stock symbol
	 * 
	 * @param symbol The stock symbol
	 * @return The last 30 historical record snapshots
	 */
	public List<HistoricalCompanyStockInfoRecord> retrieveCompanyMarketStatusHistory(String symbol) {
		
		StockRecord stockRecord = findCompanyInfoBySymbol(symbol);
		
		String companyDataSnapshot = httpUtil.getCompanyInfoHistoricalData(stockRecord.getSecurityId());
		log.debug("retrieveCompanyStatusMarketHistory: {}", companyDataSnapshot);
		
		List<HistoricalCompanyStockInfoRecord> companyMarketHistory = jsonUtil.readValueFromJsonString(
				companyDataSnapshot, HistoricalCompanyStockInfo.class).getRecords();
		log.debug("{}", companyMarketHistory);
		
		return companyMarketHistory;
		
	}
	
}