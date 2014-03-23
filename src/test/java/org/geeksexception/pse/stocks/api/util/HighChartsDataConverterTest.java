package org.geeksexception.pse.stocks.api.util;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.geeksexception.pse.stocks.api.model.StockHistorySummary;
import org.junit.Test;

public class HighChartsDataConverterTest {
	
	@Test
	public void testConvertObject() throws IllegalArgumentException, IllegalAccessException {
		HighChartsDataConverter converter = HighChartsDataConverter.getInstance();
		assertNotNull(converter);
		
		StockHistorySummary stock = new StockHistorySummary();
		stock.setDateCreated(new Date(1147651200000L));
		assertEquals("[,0,,0.0,0.0,,,,1147651200000]", converter.convertObject(stock));
		
		StockHistorySummary stock2 = new StockHistorySummary();
		stock2.setDateCreated(new Date(1147737600000L));
		
		List<StockHistorySummary> stocks = new ArrayList<StockHistorySummary>();
		stocks.add(stock);
		stocks.add(stock2);
		
		assertEquals("[[,0,,0.0,0.0,,,,1147651200000],[,0,,0.0,0.0,,,,1147737600000]]", converter.convertObject(stocks));
	}
	
}