package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Customer  {
	private int customerId;
	private String customerName;
	private String customerEmail;
	@Override
	public String toString() {

		return "Customer ID: "+customerId+" Customer Name: "+customerName+" Customer Email: "+customerEmail;
	}

	
	
}
