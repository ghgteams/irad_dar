package com.irad.dar.slsa;

public class Slsa {

	
	//private long id;
	private String vehicle_id;
	private String accident_id;
	private String person_id;
	private String person_type;
	private String nature_of_injuries;
	private String brief_description_of_offense;
	private String description_of_property_damage;
	private String value_of_loss_suffered;

	private String name;
	private String father_spouse_name;
	private String age;
	private String gender;
	private String marital_status;
	private String present_address;
	private String conatc_emailid;
	private String conatc_mobileno;

	private String emotional_harm;
	private String damage_lose;
	private String any_damage_lose;
	
	
	
	
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * public long getId() { return id; } public void setId(long id) { this.id = id;
	 * }
	 */
	public String getVehicle_id() {
		return vehicle_id;
	}
	public void setVehicle_id(String vehicle_id) {
		this.vehicle_id = vehicle_id;
	}
	public String getAccident_id() {
		return accident_id;
	}
	public void setAccident_id(String accident_id) {
		this.accident_id = accident_id;
	}
	public String getPerson_id() {
		return person_id;
	}
	public void setPerson_id(String person_id) {
		this.person_id = person_id;
	}
	public String getPerson_type() {
		return person_type;
	}
	public void setPerson_type(String person_type) {
		this.person_type = person_type;
	}
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
	public String getDescription_of_property_damage() {
		return description_of_property_damage;
	}
	public void setDescription_of_property_damage(String description_of_property_damage) {
		this.description_of_property_damage = description_of_property_damage;
	}
	public String getValue_of_loss_suffered() {
		return value_of_loss_suffered;
	}
	public void setValue_of_loss_suffered(String value_of_loss_suffered) {
		this.value_of_loss_suffered = value_of_loss_suffered;
	}
	public Slsa(String name, long id, String vehicle_id, String accident_id, String person_id, String person_type,
			String nature_of_injuries, String brief_description_of_offense, String description_of_property_damage,
			String value_of_loss_suffered) {
		super();
		this.name = name;
		//this.id = id;
		this.vehicle_id = vehicle_id;
		this.accident_id = accident_id;
		this.person_id = person_id;
		this.person_type = person_type;
		this.nature_of_injuries = nature_of_injuries;
		this.brief_description_of_offense = brief_description_of_offense;
		this.description_of_property_damage = description_of_property_damage;
		this.value_of_loss_suffered = value_of_loss_suffered;
	}
	public Slsa() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
