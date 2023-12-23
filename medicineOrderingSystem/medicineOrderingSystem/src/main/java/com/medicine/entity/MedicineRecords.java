package com.medicine.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MedicineRecords {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		private String companyName;
		@Column(name="medicine_name")
		private String medicine_name;
		private String dosage;
		private String expiryDate;
		private double price;
		private int stock;
		private String uses;
		
		public MedicineRecords() {
		}
		public MedicineRecords(String companyName, String medicine_name, String dosage, String expiryDate, double price,
				int stock, String uses) {
			this.companyName = companyName;
			this.medicine_name = medicine_name;
			this.dosage = dosage;
			this.expiryDate = expiryDate;
			this.price = price;
			this.stock = stock;
			this.uses = uses;
		}
		//getters and setters
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getCompanyName() {
			return companyName;
		}
		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}
		public String getMedicine_name() {
			return medicine_name;
		}
		public void setMedicine_name(String medicine_name) {
			this.medicine_name = medicine_name;
			}
			public String getDosage() {
				return dosage;
			}
			public void setDosage(String dosage) {
				this.dosage = dosage;
			}
			public String getExpiryDate() {
				return expiryDate;
			}
			public void setExpiryDate(String expiryDate) {
				this.expiryDate = expiryDate;
			}
			public double getPrice() {
				return price;
			}
			public void setPrice(double price) {
				this.price = price;
			}
			public int getStock() {
				return stock;
			}
			public void setStock(int stock) {
				this.stock = stock;
			}
			public String getUses() {
				return uses;
			}
			public void setUses(String uses) {
				this.uses = uses;
			}
			@Override
			public String toString() {
				return "MedicineRecords [id=" + id + ", companyName=" + companyName + ", medicineName=" + medicine_name
						+ ", dosage=" + dosage + ", ExpiryDate=" + expiryDate + ", price=" + price + ", stock=" + stock
						+ ", uses=" + uses +"]";
			}


}
