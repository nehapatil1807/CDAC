package com.blogs.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Embeddable //mandatory o.w MappingException
public class AdharCard {
	@Column(name="card_number", length=20,unique=true)            
	private String cardNumber;
	@Column(name="card_created_on")
	private LocalDate createdOn;
	@Column(length = 30)
	private String location;	 
}
