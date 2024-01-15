package com.sthev.crud.domain.product;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "product")
@Table(name = "product")
@Setter @Getter
@AllArgsConstructor 
@NoArgsConstructor
@EqualsAndHashCode(of = "id")

public class Product {
	
	@Id @GeneratedValue(strategy = GenerationType.UUID)
	private String id;
	
	private String name;
	
	private Integer prince_in_cents;
	
	public Product(RequestProduct requestProduct) {
		this.name = requestProduct.name();
		this.prince_in_cents = requestProduct.prince_in_cents();
	}
}
