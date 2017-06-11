package com.nilefin.util.realestate.command;

import java.io.Serializable;

public class SearchCriteriaRealEstate implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String listingType;
	private Double minPrice;	
	private Double maxPrice;	
	private int bedRoomNumber;	
	private String homeType;	
	private String location;	
	private boolean rentOrBuy;	
	private int distance;	
	private int pageSize;	
	private int startIndex;	
	private int page;
	public String getListingType() {
		return listingType;
	}
	public void setListingType(String listingType) {
		this.listingType = listingType;
	}
	public Double getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(Double minPrice) {
		this.minPrice = minPrice;
	}
	public Double getMaxPrice() {
		return maxPrice;
	}
	public void setMaxPrice(Double maxPrice) {
		this.maxPrice = maxPrice;
	}
	public int getBedRoomNumber() {
		return bedRoomNumber;
	}
	public void setBedRoomNumber(int bedRoomNumber) {
		this.bedRoomNumber = bedRoomNumber;
	}
	public String getHomeType() {
		return homeType;
	}
	public void setHomeType(String homeType) {
		this.homeType = homeType;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public boolean isRentOrBuy() {
		return rentOrBuy;
	}
	public void setRentOrBuy(boolean rentOrBuy) {
		this.rentOrBuy = rentOrBuy;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getStartIndex() {
		return startIndex;
	}
	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}	
	

}
