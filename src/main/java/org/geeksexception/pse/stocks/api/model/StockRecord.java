package org.geeksexception.pse.stocks.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Entity
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({ 
	"securityStatus", 
	"listedCompany_companyId", 
	"symbol",
	"listedCompany_companyName", 
	"securityId", 
	"securityName" })
public class StockRecord {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@JsonProperty("securityStatus")
	private String securityStatus;
	
	@JsonProperty("listedCompany_companyId")
	private String listedCompanyId;
	
	@JsonProperty("symbol")
	private String symbol;
	
	@JsonProperty("listedCompany_companyName")
	private String listedCompanyName;
	
	@JsonProperty("securityId")
	private String securityId;
	
	@JsonProperty("securityName")
	private String securityName;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	@JsonProperty("securityStatus")
	public String getSecurityStatus() {
		return securityStatus;
	}

	@JsonProperty("securityStatus")
	public void setSecurityStatus(String securityStatus) {
		this.securityStatus = securityStatus;
	}

	@JsonProperty("listedCompany_companyId")
	public String getListedCompanyId() {
		return listedCompanyId;
	}

	@JsonProperty("listedCompany_companyId")
	public void setListedCompanyId(String listedCompanyId) {
		this.listedCompanyId = listedCompanyId;
	}

	@JsonProperty("symbol")
	public String getSymbol() {
		return symbol;
	}

	@JsonProperty("symbol")
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	@JsonProperty("listedCompany_companyName")
	public String getListedCompanyName() {
		return listedCompanyName;
	}

	@JsonProperty("listedCompany_companyName")
	public void setListedCompanyName(String listedCompanyName) {
		this.listedCompanyName = listedCompanyName;
	}

	@JsonProperty("securityId")
	public String getSecurityId() {
		return securityId;
	}

	@JsonProperty("securityId")
	public void setSecurityId(String securityId) {
		this.securityId = securityId;
	}

	@JsonProperty("securityName")
	public String getSecurityName() {
		return securityName;
	}

	@JsonProperty("securityName")
	public void setSecurityName(String securityName) {
		this.securityName = securityName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StockRecord [securityStatus=" + securityStatus
				+ ", listedCompanyId=" + listedCompanyId + ", symbol=" + symbol
				+ ", listedCompanyName=" + listedCompanyName + ", securityId="
				+ securityId + ", securityName=" + securityName + "]";
	}
	
}