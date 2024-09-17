package com.managementportal.model;

public class Product {
	
	private int id;
	private String tradeName;
	private String inciName;
	private String firm;
	private double price;
	private double stock;
	
	public Product(int id, String tradeName, String inciName, String firm, double price, double stock) {
		this.id = id;
		this.tradeName = tradeName;
		this.inciName = inciName;
		this.firm = firm;
		this.price = price;
		this.stock = stock;
	}
	
	public int getId() { return id; }
	
	public void setId(int id) { this.id = id; }
	
	public String getTradeName() { return tradeName; }
	
	public void setTradeName(String tradeName) { this.tradeName = tradeName; }
	
	public String getInciName() { return inciName; }
	
	public void setInciName(String inciName) { this.inciName = inciName; }
		
	public String getFirm() { return firm; }

	public void setFirm(String firm) { this.firm = firm; }
	
	public double getPrice() { return price; }
	
	public void setPrice(double price) { this.price = price; }
	
	public double getStock() { return stock; }
	
	public void setStock(double stock) { this.stock = stock; }
	
	

}
