package com.medicine.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

@Entity
public class UserPurchaseDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int orderNo;
	@Column(name="userId",nullable=false)
	private String userId;
	@Column(name="quantity",nullable=false)
	private int quantity;
	private double totalCost;
	@Column(length=30)
	private String deliveryaddress;
	@Column(length=10)
	@Size(min=10, max=10)
	private String contactNo;
	private String companyName;
	
	public UserPurchaseDetails()
	{
	}
	
	public UserPurchaseDetails(String userID, int quantity, String deliveryaddress,
			@Size(min = 10, max = 10) String contactNo, String medicine) {
		this.userId = userID;
		this.quantity = quantity;
		this.deliveryaddress = deliveryaddress;
		this.contactNo = contactNo;
		this.companyName = medicine;
	}

	public String getUserId() {
		return userId;
	}
	public void setuserId(String userId) {
		this.userId = userId;
	}
	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double price) {
		this.totalCost = price*getQuantity();
	}

	public String getDeliveryaddress() {
		return deliveryaddress;
	}

	public void setDeliveryaddress(String deliveryaddress) {
		this.deliveryaddress = deliveryaddress;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	@Override
	public String toString() {
		return "UserPurchaseDetails [orderNo=" + orderNo + ", userID=" + userId + ", quantity=" + quantity
				+ ", totalCost=" + totalCost + ", deliveryaddress=" + deliveryaddress + ", contactNo=" + contactNo
				+ ", medicineName=" + companyName + "]";
	}		
    
}
