package org.geeksexception.pse.stocks.api.model;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({ "count", "records" })
public class HistoricalCompanyStockInfo {

	@JsonProperty("count")
	private Integer count;
	
	@JsonProperty("records")
	private List<HistoricalCompanyStockInfoRecord> records = new ArrayList<HistoricalCompanyStockInfoRecord>();

	@JsonProperty("count")
	public Integer getCount() {
		return count;
	}

	@JsonProperty("count")
	public void setCount(Integer count) {
		this.count = count;
	}

	@JsonProperty("records")
	public List<HistoricalCompanyStockInfoRecord> getRecords() {
		return records;
	}

	@JsonProperty("records")
	public void setRecords(List<HistoricalCompanyStockInfoRecord> records) {
		this.records = records;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "HistoricalCompanyStockInfo [count=" + count + ", records="
				+ records + "]";
	}
	
}