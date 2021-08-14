/**
 * 
 */
package com.nnk.springboot.dtos.create;

/**
 * @author tonys
 *
 */
public class BidListCreateDto {

	private String account;
	private String type;
	private Double bidQuantity;
	
	public BidListCreateDto() {
		super();
	}
	
	public BidListCreateDto(String account, String type, Double bidQuantity) {
		super();
		this.account = account;
		this.type = type;
		this.bidQuantity = bidQuantity;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Double getBidQuantity() {
		return bidQuantity;
	}
	public void setBidQuantity(Double bidQuantity) {
		this.bidQuantity = bidQuantity;
	}
	
	
}
