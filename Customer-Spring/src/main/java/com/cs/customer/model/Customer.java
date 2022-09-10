package com.cs.customer.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import org.springframework.format.annotation.DateTimeFormat;

@Data
@AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name = "customer_db")
public class Customer {
	@Id
	@Column(name = "customer_id")//this is optional
	private int customerId;
	
	@Column(name = "customer_name", length = 50, nullable = false)
	private String customerName;
	
	@Column(name = "purchase_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate purchaseDate;

}
