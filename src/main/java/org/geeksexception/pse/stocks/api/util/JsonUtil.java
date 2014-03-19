package org.geeksexception.pse.stocks.api.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.type.TypeFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JsonUtil {
	
	private static final Logger log = LoggerFactory.getLogger(JsonUtil.class);
	
	private static ObjectMapper OBJECT_MAPPER;
	
	private volatile static JsonUtil INSTANCE;
	
	private JsonUtil() { }
	
	public static JsonUtil getInstance() {
		if(INSTANCE == null) {
			synchronized(JsonUtil.class) {
				if(INSTANCE == null) {
					INSTANCE = new JsonUtil();
					OBJECT_MAPPER = new ObjectMapper();
				}
			}
		}
		
		return INSTANCE;
	}
	
	public <T> T readValueFromJsonString(String response, Class<T> clazz) {
		try {
			return OBJECT_MAPPER.readValue(response, clazz);
		} catch (JsonParseException e) { log.error("{}", e);
		} catch (JsonMappingException e) { log.error("{}", e);
		} catch (IOException e) { log.error("{}", e); }
		
		return null;
	}
	
	public <T> List<T> readValueFromJsonStringToList(String response, Class<T> clazz) {
		try {
			return OBJECT_MAPPER.readValue(
					response, 
					TypeFactory.defaultInstance().constructCollectionType(ArrayList.class, clazz));
		} catch (JsonParseException e) { log.error("{}", e);
		} catch (JsonMappingException e) { log.error("{}", e);
		} catch (IOException e) { log.error("{}", e); }
		
		return null;
	}
	
}