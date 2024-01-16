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

import java.util.UUID;

@Table(name="product")
@Entity(name="product")
@EqualsAndHashCode(of = "id")
public class Product {
    
	@Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    private Integer prince_in_cents;

    public Product(RequestProduct requestProduct){
        this.name = requestProduct.name();
        this.prince_in_cents = requestProduct.prince_in_cents();
    }
    
	public Product() {
	    	
	    }
    
    public Product(String id, String name, Integer prince_in_cents) {
		super();
		this.id = id;
		this.name = name;
		this.prince_in_cents = prince_in_cents;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrince_in_cents() {
		return prince_in_cents;
	}

	public void setPrince_in_cents(Integer prince_in_cents) {
		this.prince_in_cents = prince_in_cents;
	}
    
    

}
