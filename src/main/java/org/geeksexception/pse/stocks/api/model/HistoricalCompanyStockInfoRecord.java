package org.geeksexception.pse.stocks.api.model;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.geeksexception.pse.stocks.api.deserializer.CustomJsonDateDeserializer;
import org.geeksexception.pse.stocks.api.deserializer.CustomJsonDoubleDeserializer;
import org.geeksexception.pse.stocks.api.deserializer.CustomJsonLongDeserializer;

@JsonPropertyOrder({
	"sqLow",
	"sqOpen",
	"sqHigh",
	"percChangeClose",
	"sqClose",
	"secQid",
	"changeClose",
	"totalValue",
	"totalVolume",
	"lastTradePrice",
	"avgPrice",
	"tradingDate",
	"sqPrevious"
})
public class HistoricalCompanyStockInfoRecord {
	
	private String id;
	
	@JsonProperty("sqLow")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	private Double sqLow;
	
	@JsonProperty("sqOpen")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	private Double sqOpen;
	
	@JsonProperty("sqHigh")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	private Double sqHigh;
	
	@JsonProperty("percChangeClose")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	private Double percChangeClose;
	
	@JsonProperty("sqClose")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	private Double sqClose;
	
	@JsonProperty("secQid")
	private String secQid;
	
	@JsonProperty("changeClose")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	private Double changeClose;
	
	@JsonProperty("totalValue")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	private Double totalValue;
	
	@JsonProperty("totalVolume")
	@JsonDeserialize(using = CustomJsonLongDeserializer.class)
	private Long totalVolume;
	
	@JsonProperty("lastTradePrice")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	private Double lastTradePrice;
	
	@JsonProperty("avgPrice")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	private Double avgPrice;
	
	@JsonProperty("tradingDate")
	@JsonDeserialize(using = CustomJsonDateDeserializer.class)
	private Date tradingDate;
	
	@JsonProperty("sqPrevious")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	private Double sqPrevious;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("sqLow")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public Double getSqLow() {
		return sqLow;
	}

	@JsonProperty("sqLow")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public void setSqLow(Double sqLow) {
		this.sqLow = sqLow;
	}

	@JsonProperty("sqOpen")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public Double getSqOpen() {
		return sqOpen;
	}

	@JsonProperty("sqOpen")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public void setSqOpen(Double sqOpen) {
		this.sqOpen = sqOpen;
	}

	@JsonProperty("sqHigh")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public Double getSqHigh() {
		return sqHigh;
	}

	@JsonProperty("sqHigh")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public void setSqHigh(Double sqHigh) {
		this.sqHigh = sqHigh;
	}

	@JsonProperty("percChangeClose")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public Double getPercChangeClose() {
		return percChangeClose;
	}

	@JsonProperty("percChangeClose")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public void setPercChangeClose(Double percChangeClose) {
		this.percChangeClose = percChangeClose;
	}

	@JsonProperty("sqClose")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public Double getSqClose() {
		return sqClose;
	}

	@JsonProperty("sqClose")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public void setSqClose(Double sqClose) {
		this.sqClose = sqClose;
	}

	@JsonProperty("secQid")
	public String getSecQid() {
		return secQid;
	}

	@JsonProperty("secQid")
	public void setSecQid(String secQid) {
		this.secQid = secQid;
	}

	@JsonProperty("changeClose")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public Double getChangeClose() {
		return changeClose;
	}

	@JsonProperty("changeClose")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public void setChangeClose(Double changeClose) {
		this.changeClose = changeClose;
	}

	@JsonProperty("totalValue")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public Double getTotalValue() {
		return totalValue;
	}

	@JsonProperty("totalValue")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	@JsonProperty("totalVolume")
	@JsonDeserialize(using = CustomJsonLongDeserializer.class)
	public Long getTotalVolume() {
		return totalVolume;
	}

	@JsonProperty("totalVolume")
	@JsonDeserialize(using = CustomJsonLongDeserializer.class)
	public void setTotalVolume(Long totalVolume) {
		this.totalVolume = totalVolume;
	}

	@JsonProperty("lastTradePrice")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public Double getLastTradePrice() {
		return lastTradePrice;
	}

	@JsonProperty("lastTradePrice")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public void setLastTradePrice(Double lastTradePrice) {
		this.lastTradePrice = lastTradePrice;
	}

	@JsonProperty("avgPrice")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public Double getAvgPrice() {
		return avgPrice;
	}

	@JsonProperty("avgPrice")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public void setAvgPrice(Double avgPrice) {
		this.avgPrice = avgPrice;
	}

	@JsonProperty("tradingDate")
	@JsonDeserialize(using = CustomJsonDateDeserializer.class)
	public Date getTradingDate() {
		return tradingDate;
	}

	@JsonProperty("tradingDate")
	@JsonDeserialize(using = CustomJsonDateDeserializer.class)
	public void setTradingDate(Date tradingDate) {
		this.tradingDate = tradingDate;
	}

	@JsonProperty("sqPrevious")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public Double getSqPrevious() {
		return sqPrevious;
	}

	@JsonProperty("sqPrevious")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public void setSqPrevious(Double sqPrevious) {
		this.sqPrevious = sqPrevious;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "HistoricalCompanyStockInfoRecord [sqLow=" + sqLow + ", sqOpen="
				+ sqOpen + ", sqHigh=" + sqHigh + ", percChangeClose="
				+ percChangeClose + ", sqClose=" + sqClose + ", secQid="
				+ secQid + ", changeClose=" + changeClose + ", totalValue="
				+ totalValue + ", totalVolume=" + totalVolume
				+ ", lastTradePrice=" + lastTradePrice + ", avgPrice="
				+ avgPrice + ", tradingDate=" + tradingDate + ", sqPrevious="
				+ sqPrevious + "]";
	}

}