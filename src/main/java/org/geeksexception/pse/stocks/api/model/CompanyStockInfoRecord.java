package org.geeksexception.pse.stocks.api.model;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.geeksexception.pse.stocks.api.deserializer.CustomJsonDateDeserializer;
import org.geeksexception.pse.stocks.api.deserializer.CustomJsonDoubleDeserializer;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
	"headerSqLow",
	"headerFiftyTwoWeekHigh",
	"headerChangeClose",
	"headerChangeClosePercChangeClose",
	"lastTradedDate",
	"headerTotalValue",
	"headerLastTradePrice",
	"headerSqHigh",
	"headerPercChangeClose",
	"headerFiftyTwoWeekLow",
	"headerSqPrevious",
	"securitySymbol",
	"headerCurrentPe",
	"headerSqOpen",
	"headerAvgPrice",
	"headerTotalVolume"
})
public class CompanyStockInfoRecord {

	private String id;
	
	@JsonProperty("headerSqLow")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	private Double headerSqLow;
	
	@JsonProperty("headerFiftyTwoWeekHigh")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	private Double headerFiftyTwoWeekHigh;
	
	@JsonProperty("headerChangeClose")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	private Double headerChangeClose;
	
	@JsonProperty("headerChangeClosePercChangeClose")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	private Double headerChangeClosePercChangeClose;
	
	@JsonProperty("lastTradedDate")
	@JsonDeserialize(using = CustomJsonDateDeserializer.class)
	private Date lastTradedDate;
	
	@JsonProperty("headerTotalValue")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	private Double headerTotalValue;
	
	@JsonProperty("headerLastTradePrice")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	private Double headerLastTradePrice;
	
	@JsonProperty("headerSqHigh")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	private Double headerSqHigh;
	
	@JsonProperty("headerPercChangeClose")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	private Double headerPercChangeClose;
	
	@JsonProperty("headerFiftyTwoWeekLow")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	private Double headerFiftyTwoWeekLow;
	
	@JsonProperty("headerSqPrevious")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	private Double headerSqPrevious;
	
	@JsonProperty("securitySymbol")
	private String securitySymbol;
	
	@JsonProperty("headerCurrentPe")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	private Double headerCurrentPe;
	
	@JsonProperty("headerSqOpen")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	private Double headerSqOpen;
	
	@JsonProperty("headerAvgPrice")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	private Double headerAvgPrice;
	
	@JsonProperty("headerTotalVolume")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	private Double headerTotalVolume;
	
	private Date dateCreated;
	
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

	/**
	 * @return the dateCreated
	 */
	public Date getDateCreated() {
		return dateCreated;
	}

	/**
	 * @param dateCreated the dateCreated to set
	 */
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	@JsonProperty("headerSqLow")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public Double getHeaderSqLow() {
		return headerSqLow;
	}

	@JsonProperty("headerSqLow")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public void setHeaderSqLow(Double headerSqLow) {
		this.headerSqLow = headerSqLow;
	}

	@JsonProperty("headerFiftyTwoWeekHigh")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public Double getHeaderFiftyTwoWeekHigh() {
		return headerFiftyTwoWeekHigh;
	}

	@JsonProperty("headerFiftyTwoWeekHigh")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public void setHeaderFiftyTwoWeekHigh(Double headerFiftyTwoWeekHigh) {
		this.headerFiftyTwoWeekHigh = headerFiftyTwoWeekHigh;
	}

	@JsonProperty("headerChangeClose")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public Double getHeaderChangeClose() {
		return headerChangeClose;
	}

	@JsonProperty("headerChangeClose")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public void setHeaderChangeClose(Double headerChangeClose) {
		this.headerChangeClose = headerChangeClose;
	}

	@JsonProperty("headerChangeClosePercChangeClose")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public Double getHeaderChangeClosePercChangeClose() {
		return headerChangeClosePercChangeClose;
	}

	@JsonProperty("headerChangeClosePercChangeClose")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public void setHeaderChangeClosePercChangeClose(
			Double headerChangeClosePercChangeClose) {
		this.headerChangeClosePercChangeClose = headerChangeClosePercChangeClose;
	}

	@JsonProperty("lastTradedDate")
	@JsonDeserialize(using = CustomJsonDateDeserializer.class)
	public Date getLastTradedDate() {
		return lastTradedDate;
	}

	@JsonProperty("lastTradedDate")
	@JsonDeserialize(using = CustomJsonDateDeserializer.class)
	public void setLastTradedDate(Date lastTradedDate) {
		this.lastTradedDate = lastTradedDate;
	}

	@JsonProperty("headerTotalValue")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public Double getHeaderTotalValue() {
		return headerTotalValue;
	}

	@JsonProperty("headerTotalValue")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public void setHeaderTotalValue(Double headerTotalValue) {
		this.headerTotalValue = headerTotalValue;
	}

	@JsonProperty("headerLastTradePrice")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public Double getHeaderLastTradePrice() {
		return headerLastTradePrice;
	}

	@JsonProperty("headerLastTradePrice")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public void setHeaderLastTradePrice(Double headerLastTradePrice) {
		this.headerLastTradePrice = headerLastTradePrice;
	}

	@JsonProperty("headerSqHigh")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public Double getHeaderSqHigh() {
		return headerSqHigh;
	}

	@JsonProperty("headerSqHigh")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public void setHeaderSqHigh(Double headerSqHigh) {
		this.headerSqHigh = headerSqHigh;
	}

	@JsonProperty("headerPercChangeClose")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public Double getHeaderPercChangeClose() {
		return headerPercChangeClose;
	}

	@JsonProperty("headerPercChangeClose")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public void setHeaderPercChangeClose(Double headerPercChangeClose) {
		this.headerPercChangeClose = headerPercChangeClose;
	}

	@JsonProperty("headerFiftyTwoWeekLow")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public Double getHeaderFiftyTwoWeekLow() {
		return headerFiftyTwoWeekLow;
	}

	@JsonProperty("headerFiftyTwoWeekLow")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public void setHeaderFiftyTwoWeekLow(Double headerFiftyTwoWeekLow) {
		this.headerFiftyTwoWeekLow = headerFiftyTwoWeekLow;
	}

	@JsonProperty("headerSqPrevious")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public Double getHeaderSqPrevious() {
		return headerSqPrevious;
	}

	@JsonProperty("headerSqPrevious")
	public void setHeaderSqPrevious(Double headerSqPrevious) {
		this.headerSqPrevious = headerSqPrevious;
	}

	@JsonProperty("securitySymbol")
	public String getSecuritySymbol() {
		return securitySymbol;
	}

	@JsonProperty("securitySymbol")
	public void setSecuritySymbol(String securitySymbol) {
		this.securitySymbol = securitySymbol;
	}

	@JsonProperty("headerCurrentPe")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public Double getHeaderCurrentPe() {
		return headerCurrentPe;
	}

	@JsonProperty("headerCurrentPe")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public void setHeaderCurrentPe(Double headerCurrentPe) {
		this.headerCurrentPe = headerCurrentPe;
	}

	@JsonProperty("headerSqOpen")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public Double getHeaderSqOpen() {
		return headerSqOpen;
	}

	@JsonProperty("headerSqOpen")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public void setHeaderSqOpen(Double headerSqOpen) {
		this.headerSqOpen = headerSqOpen;
	}

	@JsonProperty("headerAvgPrice")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public Double getHeaderAvgPrice() {
		return headerAvgPrice;
	}

	@JsonProperty("headerAvgPrice")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public void setHeaderAvgPrice(Double headerAvgPrice) {
		this.headerAvgPrice = headerAvgPrice;
	}

	@JsonProperty("headerTotalVolume")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public Double getHeaderTotalVolume() {
		return headerTotalVolume;
	}

	@JsonProperty("headerTotalVolume")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public void setHeaderTotalVolume(Double headerTotalVolume) {
		this.headerTotalVolume = headerTotalVolume;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CompanyStockInfoRecord [headerSqLow=" + headerSqLow
				+ ", headerFiftyTwoWeekHigh=" + headerFiftyTwoWeekHigh
				+ ", headerChangeClose=" + headerChangeClose
				+ ", headerChangeClosePercChangeClose="
				+ headerChangeClosePercChangeClose + ", lastTradedDate="
				+ lastTradedDate + ", headerTotalValue=" + headerTotalValue
				+ ", headerLastTradePrice=" + headerLastTradePrice
				+ ", headerSqHigh=" + headerSqHigh + ", headerPercChangeClose="
				+ headerPercChangeClose + ", headerFiftyTwoWeekLow="
				+ headerFiftyTwoWeekLow + ", headerSqPrevious="
				+ headerSqPrevious + ", securitySymbol=" + securitySymbol
				+ ", headerCurrentPe=" + headerCurrentPe + ", headerSqOpen="
				+ headerSqOpen + ", headerAvgPrice=" + headerAvgPrice
				+ ", headerTotalVolume=" + headerTotalVolume + ", dateCreated="
				+ dateCreated + "]";
	}

}