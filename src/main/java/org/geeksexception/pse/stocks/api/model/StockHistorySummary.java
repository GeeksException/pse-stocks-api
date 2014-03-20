package org.geeksexception.pse.stocks.api.model;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.geeksexception.pse.stocks.api.deserializer.CustomJsonDoubleDeserializer;
import org.geeksexception.pse.stocks.api.deserializer.CustomJsonLongDeserializer;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({ 
	"totalVolume", 
	"indicator", 
	"percChangeClose",
	"lastTradedPrice", 
	"securityAlias", 
	"indicatorImg", 
	"securitySymbol" })
public class StockHistorySummary {
	
	private String id;
	
	@JsonProperty("totalVolume")
	@JsonDeserialize(using = CustomJsonLongDeserializer.class)
	private Long totalVolume;
	
	@JsonProperty("indicator")
	private String indicator;
	
	@JsonProperty("percChangeClose")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	private Double percentChangeClose;
	
	@JsonProperty("lastTradedPrice")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	private Double lastTradedPrice;
	
	@JsonProperty("securityAlias")
	private String securityAlias;
	
	@JsonProperty("indicatorImg")
	private String indicatorImg;
	
	@JsonProperty("securitySymbol")
	private String securitySymbol;
	
	private Date dateCreated;
	
	public StockHistorySummary() { }
	
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

	@JsonProperty("indicator")
	public String getIndicator() {
		return indicator;
	}

	@JsonProperty("indicator")
	public void setIndicator(String indicator) {
		this.indicator = indicator;
	}

	@JsonProperty("percChangeClose")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public Double getPercentChangeClose() {
		return percentChangeClose;
	}

	@JsonProperty("percChangeClose")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public void setPercentChangeClose(Double percentChangeClose) {
		this.percentChangeClose = percentChangeClose;
	}

	@JsonProperty("lastTradedPrice")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public Double getLastTradedPrice() {
		return lastTradedPrice;
	}

	@JsonProperty("lastTradedPrice")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public void setLastTradedPrice(Double lastTradedPrice) {
		this.lastTradedPrice = lastTradedPrice;
	}

	@JsonProperty("securityAlias")
	public String getSecurityAlias() {
		return securityAlias;
	}

	@JsonProperty("securityAlias")
	public void setSecurityAlias(String securityAlias) {
		this.securityAlias = securityAlias;
	}

	@JsonProperty("indicatorImg")
	public String getIndicatorImg() {
		return indicatorImg;
	}

	@JsonProperty("indicatorImg")
	public void setIndicatorImg(String indicatorImg) {
		this.indicatorImg = indicatorImg;
	}

	@JsonProperty("securitySymbol")
	public String getSecuritySymbol() {
		return securitySymbol;
	}

	@JsonProperty("securitySymbol")
	public void setSecuritySymbol(String securitySymbol) {
		this.securitySymbol = securitySymbol;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StockHistorySummary [totalVolume=" + totalVolume + ", indicator="
				+ indicator + ", percentChangeClose=" + percentChangeClose
				+ ", lastTradedPrice=" + lastTradedPrice + ", securityAlias="
				+ securityAlias + ", indicatorImg=" + indicatorImg
				+ ", securitySymbol=" + securitySymbol + "]";
	}

}