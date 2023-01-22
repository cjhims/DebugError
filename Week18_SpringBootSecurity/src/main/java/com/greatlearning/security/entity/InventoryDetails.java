package com.greatlearning.security.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//using lombok annotations
@Data //Equivalent to @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode. 
@NoArgsConstructor //equivalent to generating default constructor
@AllArgsConstructor //equivalent to generating a constructor with all parameters
@Builder //equivalent to telescopic constructor
@Entity //marking Library as a table, using JPA annotations
public class InventoryDetails {

	@Id //marking id as a primary key
	private int id;
	
	@Column(name="ITEM_NAME")
	private String itemName;

	@Column(name="NUMBER_OF_ITEMS_AVAILABLE")
	private int numberOfItemsAvailable;
	
	@Column(name="PRICE")
	private int price;
}
