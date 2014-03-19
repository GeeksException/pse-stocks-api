package org.geeksexception.pse.stocks.api.service;

import java.util.List;

import static org.junit.Assert.*;

import org.geeksexception.pse.stocks.api.model.CompanyStockInfoRecord;
import org.geeksexception.pse.stocks.api.model.HistoricalCompanyStockInfoRecord;
import org.geeksexception.pse.stocks.api.model.StockHistorySummary;
import org.junit.Before;
import org.junit.Test;

public class StocksServiceTest {
	
	private StocksService stocksService;
	
	@Before
	public void setUp() {
		stocksService = new StocksService();
	}
	
	@Test
	public void testRetrieveAllStocks() {
		List<StockHistorySummary> summary = stocksService.retrieveAllStocks();
		
		assertNotNull(summary);
		assertTrue(summary.size() > 0);
	}
	
	@Test
	public void testFindBySymbol() {
		CompanyStockInfoRecord record = stocksService.findBySymbol("MWC");
		
		assertNotNull(record);
	}
	
	@Test
	public void testRetrieveCompanyStatusMarketSnapshot() {
		List<HistoricalCompanyStockInfoRecord> records = stocksService.retrieveCompanyMarketStatusHistory("MWC");
		
		assertNotNull(records);
		assertTrue(records.size() > 0);
	}
	
}