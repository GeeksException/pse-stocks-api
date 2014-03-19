package org.geeksexception.pse.stocks.api.model;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({ "count", "totalCount", "records" })
public class Stocks {

	@JsonProperty("count")
	private Integer count;
	
	@JsonProperty("totalCount")
	private Integer totalCount;
	
	@JsonProperty("records")
	private List<StockRecord> stockRecords = new ArrayList<StockRecord>();
	
	@JsonProperty("count")
	public Integer getCount() {
		return count;
	}

	@JsonProperty("count")
	public void setCount(Integer count) {
		this.count = count;
	}

	@JsonProperty("totalCount")
	public Integer getTotalCount() {
		return totalCount;
	}

	@JsonProperty("totalCount")
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	@JsonProperty("records")
	public List<StockRecord> getStockRecords() {
		return stockRecords;
	}

	@JsonProperty("records")
	public void setStockRecords(List<StockRecord> stockRecords) {
		this.stockRecords = stockRecords;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Stocks [count=" + count + ", totalCount=" + totalCount
				+ ", stockRecords=" + stockRecords + ", additionalProperties=" + "]";
	}
	
}