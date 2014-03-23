package org.geeksexception.pse.stocks.api.util;

import java.lang.reflect.Field;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HighChartsDataConverter {
	
	private static final Logger log = LoggerFactory.getLogger(HighChartsDataConverter.class);
	
	private volatile static HighChartsDataConverter INSTANCE;
	
	private HighChartsDataConverter() { }
	
	public static HighChartsDataConverter getInstance() {
		if(INSTANCE == null) {
			synchronized(HighChartsDataConverter.class) {
				if(INSTANCE == null) {
					INSTANCE = new HighChartsDataConverter();
				}
			}
		}
		
		return INSTANCE;
	}

	@SuppressWarnings("rawtypes")
	public String convertObject(Object obj) {
		
		StringBuilder data = new StringBuilder("[");
		
		if(isTypeOfList(obj)) {
			List value = (List) obj;
			
			String prefixList = "";
			for(Iterator iter = value.iterator();iter.hasNext();) {
				data.append(prefixList);
				prefixList = ", ";
				data.append(convertObject(iter.next()));
			}
		} else {
			Field[] fields = obj.getClass().getDeclaredFields();
			
			String prefix = "";
			for(Field field : fields) {
				data.append(prefix);
				prefix = ", ";
				field.setAccessible(true);
				
				try {
					if(field.getType() == Double.class) {
						Object value = field.get(obj);
						if(value == null) data.append(new Double(0.0));
						else data.append(value);
					}
					
					if(field.getType() == Long.class) {
						Object value = field.get(obj);
						if(value == null) data.append(new Long(0));
						else data.append(value);
					}
					
					if(field.getType() == String.class) {
						Object value = field.get(obj);
						if(value != null) data.append(value);
					}
					
					if(field.getType() == Date.class) {
						Date value = (Date) field.get(obj);
						if(value != null) data.append(value.getTime());
					}
				} catch (IllegalArgumentException e) { log.error("{}", e);
				} catch (IllegalAccessException e) { log.error("{}", e); }
			}
		}
		
		String chartData = data.append("]").toString();
		log.debug("Converted data : {}", chartData);
		
		return chartData;
	}
	
	@SuppressWarnings("rawtypes")
	private boolean isTypeOfList(Object obj) {
		for(Class clazz : obj.getClass().getInterfaces()) {
			if(clazz.equals(List.class)) {
				return true;
			}
		}
		
		return false;
	}
	
}