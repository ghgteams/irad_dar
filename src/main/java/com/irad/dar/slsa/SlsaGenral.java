package com.irad.dar.slsa;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "dar_slsa", schema = "public")

public class SlsaGenral {

	
	@EmbeddedId
	 private SlsaGenralComposite compId;
	  	  
//	  @Column(name="id") private long id;

	  
	  @Column(name="nature_of_injuries") private String nature_of_injuries;
	 
	  @Column(name="brief_description_of_offense") private String
	  brief_description_of_offense;
	  
	  
	  @Column(name="name") private String name;
	  @Column(name="father_spouse_name") private String father_spouse_name;
	  @Column(name="age") private String age;
	  @Column(name="gender") private String gender;
	  @Column(name="marital_status") private String marital_status;
	  @Column(name="present_address") private String present_address;
	  @Column(name="conatc_emailid") private String conatc_emailid;
	  @Column(name="conatc_mobileno") private String conatc_mobileno;
	  @Column(name="emotional_harm") private String emotional_harm;
	  @Column(name="damage_lose") private String damage_lose;
	  @Column(name="any_damage_lose") private String any_damage_lose;
	  
	 
//	  @Column(name="description_of_property_damage") private String
//	  description_of_property_damage;
//	 
//	  @Column(name="value_of_loss_suffered") private String value_of_loss_suffered;

	  
	public SlsaGenralComposite getCompId() {
		return compId;
	}

	public void setCompId(SlsaGenralComposite compId) {
		this.compId = compId;
	}

	/*
	 * public long getId() { return id; }
	 * 
	 * public void setId(long id) { this.id = id; }
	 */

	public String getNature_of_injuries() {
		return nature_of_injuries;
	}

	public void setNature_of_injuries(String nature_of_injuries) {
		this.nature_of_injuries = nature_of_injuries;
	}

	public String getBrief_description_of_offense() {
		return brief_description_of_offense;
	}

	public void setBrief_description_of_offense(String brief_description_of_offense) {
		this.brief_description_of_offense = brief_description_of_offense;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFather_spouse_name() {
		return father_spouse_name;
	}

	public void setFather_spouse_name(String father_spouse_name) {
		this.father_spouse_name = father_spouse_name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMarital_status() {
		return marital_status;
	}

	public void setMarital_status(String marital_status) {
		this.marital_status = marital_status;
	}

	public String getPresent_address() {
		return present_address;
	}

	public void setPresent_address(String present_address) {
		this.present_address = present_address;
	}

	public String getConatc_emailid() {
		return conatc_emailid;
	}

	public void setConatc_emailid(String conatc_emailid) {
		this.conatc_emailid = conatc_emailid;
	}

	public String getConatc_mobileno() {
		return conatc_mobileno;
	}

	public void setConatc_mobileno(String conatc_mobileno) {
		this.conatc_mobileno = conatc_mobileno;
	}

	public String getEmotional_harm() {
		return emotional_harm;
	}

	public void setEmotional_harm(String emotional_harm) {
		this.emotional_harm = emotional_harm;
	}

	public String getDamage_lose() {
		return damage_lose;
	}

	public void setDamage_lose(String damage_lose) {
		this.damage_lose = damage_lose;
	}

	public String getAny_damage_lose() {
		return any_damage_lose;
	}

	public void setAny_damage_lose(String any_damage_lose) {
		this.any_damage_lose = any_damage_lose;
	}

//	public String getDescription_of_property_damage() {
//		return description_of_property_damage;
//	}
//
//	public void setDescription_of_property_damage(String description_of_property_damage) {
//		this.description_of_property_damage = description_of_property_damage;
//	}
//
//	public String getValue_of_loss_suffered() {
//		return value_of_loss_suffered;
//	}
//
//	public void setValue_of_loss_suffered(String value_of_loss_suffered) {
//		this.value_of_loss_suffered = value_of_loss_suffered;
//	}
//	
	
	
	
	
	
	
	
}
