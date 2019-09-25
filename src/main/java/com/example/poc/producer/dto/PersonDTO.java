package com.example.poc.producer.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PersonDTO implements Serializable {

	private static final long serialVersionUID = 1506122459333179842L;

	@NotNull
	private String name;
	
	@NotNull
	private Integer age;
	 
}
