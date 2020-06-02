package com.sachit.learn.sppetclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="specialities")
public class Speciality extends BaseEntity{
	
	@Column(name="name")
	String name;
	
	@Column(name="description")
	String description;
	
}
