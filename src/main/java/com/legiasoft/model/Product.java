package com.legiasoft.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import com.google.cloud.datastore.DoubleValue;
import org.springframework.cloud.gcp.data.datastore.core.mapping.Entity;
import org.springframework.cloud.gcp.data.datastore.core.mapping.Field;
import org.springframework.data.annotation.Id;
import com.google.cloud.Timestamp;


@Entity(name = "products")
public class Product {


	@Id
	@Field(name = "product_code")
	String productCode;
	String productName;
	BigDecimal price;
	long insertTime;

	public Product(String productCode, String productName, BigDecimal price) {
		this.productCode = productCode;
		this.productName = productName;
		this.price = price;
		this.insertTime = System.nanoTime();
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public long getInsertTime() {
		return insertTime;
	}

	public void setInsertTime(long insertTime) {
		this.insertTime = insertTime;
	}

}

