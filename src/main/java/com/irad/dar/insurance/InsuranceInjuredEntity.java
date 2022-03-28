package com.irad.dar.insurance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dar_insurance_injured", schema = "public")
public class InsuranceInjuredEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="id_insurance")
	private int insuranceId;

	@Column(name="vehicle_id")
	private String vehicleId;

	@Column(name="accident_id")
	private String accidentId;

	@Column(name="person_id")
	private String personId;

	@Column(name="person_type")
	private String personType;

	@Column(name="inj_permenant_disablity")
	private String permanentDisabilityInj;

	@Column(name="inj_treatment")
	private String treatmentInj;

	@Column(name="inj_convenance")
	private String convenanceInj;

	@Column(name="inj_special_diet")
	private String specialDietInj;

	@Column(name="inj_cost_nursing_attendant")
	private String costOfNursingInj;

	@Column(name="inj_cost_artificial_limp")
	private String costOfArtificialInj;
	
//	@Column(name="inj_loss_erning_capacity")
//	private String lossOfEarningInj;

	@Column(name="inj_loss_income")
	private String lossIncomeInj;
	
	@Column(name="inj_any_other_loss")
	private String anyOtherLossInj;

	@Column(name="inj_com_mental_phy_shock")
	private String mentalShockInj;
	
	@Column(name="inj_pain_suffering")
	private String painSufferingInj;
	
	@Column(name="inj_loss_amenities")
	private String lossAmenitiesInj;

	@Column(name="inj_loss_ear_inc_har_dis")
	private String lossEarningInj;
	
	@Column(name="inj_total_copensation")
	private String totalCompensationInj;

	@Column(name="inj_disfiguration")
	private String disfigurationInj;
	
	@Column(name="inj_income")
	private String incomeInj;
	
	@Column(name="inj_loss_of_marriage")
	private String lossOfMarriageInj;
	
	
	@Column(name="inj_natureofinjury")
	private String natureOfInjuryInj;
	
	@Column(name="inj_typeofinjury")
	private String typeOfinjuryInj;
	
	@Column(name="inj_expenditure_treatment")
	private String expenditureTreatmentInj;
	
	@Column(name="inj_permenant_disablity_details")
	private String permenantDisabilityDetailsInj;

	@Column(name="inj_loss_erning_capacity")
	private String inj_loss_erning_capacity;
	
	@Column(name="inj_medical_treatment")
	private String inj_medical_treatment;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getInsuranceId() {
		return insuranceId;
	}

	public void setInsuranceId(int insuranceId) {
		this.insuranceId = insuranceId;
	}

	public String getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getAccidentId() {
		return accidentId;
	}

	public void setAccidentId(String accidentId) {
		this.accidentId = accidentId;
	}

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public String getPersonType() {
		return personType;
	}

	public void setPersonType(String personType) {
		this.personType = personType;
	}

	public String getPermanentDisabilityInj() {
		return permanentDisabilityInj;
	}

	public void setPermanentDisabilityInj(String permanentDisabilityInj) {
		this.permanentDisabilityInj = permanentDisabilityInj;
	}

	public String getTreatmentInj() {
		return treatmentInj;
	}

	public void setTreatmentInj(String treatmentInj) {
		this.treatmentInj = treatmentInj;
	}

	public String getConvenanceInj() {
		return convenanceInj;
	}

	public void setConvenanceInj(String convenanceInj) {
		this.convenanceInj = convenanceInj;
	}

	public String getSpecialDietInj() {
		return specialDietInj;
	}

	public void setSpecialDietInj(String specialDietInj) {
		this.specialDietInj = specialDietInj;
	}

	public String getCostOfNursingInj() {
		return costOfNursingInj;
	}

	public void setCostOfNursingInj(String costOfNursingInj) {
		this.costOfNursingInj = costOfNursingInj;
	}

	public String getCostOfArtificialInj() {
		return costOfArtificialInj;
	}

	public void setCostOfArtificialInj(String costOfArtificialInj) {
		this.costOfArtificialInj = costOfArtificialInj;
	}

	public String getLossIncomeInj() {
		return lossIncomeInj;
	}

	public void setLossIncomeInj(String lossIncomeInj) {
		this.lossIncomeInj = lossIncomeInj;
	}

	public String getAnyOtherLossInj() {
		return anyOtherLossInj;
	}

	public void setAnyOtherLossInj(String anyOtherLossInj) {
		this.anyOtherLossInj = anyOtherLossInj;
	}

	public String getMentalShockInj() {
		return mentalShockInj;
	}

	public void setMentalShockInj(String mentalShockInj) {
		this.mentalShockInj = mentalShockInj;
	}

	public String getPainSufferingInj() {
		return painSufferingInj;
	}

	public void setPainSufferingInj(String painSufferingInj) {
		this.painSufferingInj = painSufferingInj;
	}

	public String getLossAmenitiesInj() {
		return lossAmenitiesInj;
	}

	public void setLossAmenitiesInj(String lossAmenitiesInj) {
		this.lossAmenitiesInj = lossAmenitiesInj;
	}

	public String getLossEarningInj() {
		return lossEarningInj;
	}

	public void setLossEarningInj(String lossEarningInj) {
		this.lossEarningInj = lossEarningInj;
	}

	public String getTotalCompensationInj() {
		return totalCompensationInj;
	}

	public void setTotalCompensationInj(String totalCompensationInj) {
		this.totalCompensationInj = totalCompensationInj;
	}

	public String getDisfigurationInj() {
		return disfigurationInj;
	}

	public void setDisfigurationInj(String disfigurationInj) {
		this.disfigurationInj = disfigurationInj;
	}

	public String getIncomeInj() {
		return incomeInj;
	}

	public void setIncomeInj(String incomeInj) {
		this.incomeInj = incomeInj;
	}

	public String getLossOfMarriageInj() {
		return lossOfMarriageInj;
	}

	public void setLossOfMarriageInj(String lossOfMarriageInj) {
		this.lossOfMarriageInj = lossOfMarriageInj;
	}

	public String getNatureOfInjuryInj() {
		return natureOfInjuryInj;
	}

	public void setNatureOfInjuryInj(String natureOfInjuryInj) {
		this.natureOfInjuryInj = natureOfInjuryInj;
	}

	public String getTypeOfinjuryInj() {
		return typeOfinjuryInj;
	}

	public void setTypeOfinjuryInj(String typeOfinjuryInj) {
		this.typeOfinjuryInj = typeOfinjuryInj;
	}

	public String getExpenditureTreatmentInj() {
		return expenditureTreatmentInj;
	}

	public void setExpenditureTreatmentInj(String expenditureTreatmentInj) {
		this.expenditureTreatmentInj = expenditureTreatmentInj;
	}

	public String getPermenantDisabilityDetailsInj() {
		return permenantDisabilityDetailsInj;
	}

	public void setPermenantDisabilityDetailsInj(String permenantDisabilityDetailsInj) {
		this.permenantDisabilityDetailsInj = permenantDisabilityDetailsInj;
	}

	public String getInj_loss_erning_capacity() {
		return inj_loss_erning_capacity;
	}

	public void setInj_loss_erning_capacity(String inj_loss_erning_capacity) {
		this.inj_loss_erning_capacity = inj_loss_erning_capacity;
	}

	public String getInj_medical_treatment() {
		return inj_medical_treatment;
	}

	public void setInj_medical_treatment(String inj_medical_treatment) {
		this.inj_medical_treatment = inj_medical_treatment;
	}

	public InsuranceInjuredEntity(int id, int insuranceId, String vehicleId, String accidentId, String personId,
			String personType, String permanentDisabilityInj, String treatmentInj, String convenanceInj,
			String specialDietInj, String costOfNursingInj, String costOfArtificialInj, String lossIncomeInj,
			String anyOtherLossInj, String mentalShockInj, String painSufferingInj, String lossAmenitiesInj,
			String lossEarningInj, String totalCompensationInj, String disfigurationInj, String incomeInj,
			String lossOfMarriageInj, String natureOfInjuryInj, String typeOfinjuryInj, String expenditureTreatmentInj,
			String permenantDisabilityDetailsInj, String inj_loss_erning_capacity, String inj_medical_treatment) {
		super();
		this.id = id;
		this.insuranceId = insuranceId;
		this.vehicleId = vehicleId;
		this.accidentId = accidentId;
		this.personId = personId;
		this.personType = personType;
		this.permanentDisabilityInj = permanentDisabilityInj;
		this.treatmentInj = treatmentInj;
		this.convenanceInj = convenanceInj;
		this.specialDietInj = specialDietInj;
		this.costOfNursingInj = costOfNursingInj;
		this.costOfArtificialInj = costOfArtificialInj;
		this.lossIncomeInj = lossIncomeInj;
		this.anyOtherLossInj = anyOtherLossInj;
		this.mentalShockInj = mentalShockInj;
		this.painSufferingInj = painSufferingInj;
		this.lossAmenitiesInj = lossAmenitiesInj;
		this.lossEarningInj = lossEarningInj;
		this.totalCompensationInj = totalCompensationInj;
		this.disfigurationInj = disfigurationInj;
		this.incomeInj = incomeInj;
		this.lossOfMarriageInj = lossOfMarriageInj;
		this.natureOfInjuryInj = natureOfInjuryInj;
		this.typeOfinjuryInj = typeOfinjuryInj;
		this.expenditureTreatmentInj = expenditureTreatmentInj;
		this.permenantDisabilityDetailsInj = permenantDisabilityDetailsInj;
		this.inj_loss_erning_capacity = inj_loss_erning_capacity;
		this.inj_medical_treatment = inj_medical_treatment;
	}

	@Override
	public String toString() {
		return "InsuranceInjuredEntity [id=" + id + ", insuranceId=" + insuranceId + ", vehicleId=" + vehicleId
				+ ", accidentId=" + accidentId + ", personId=" + personId + ", personType=" + personType
				+ ", permanentDisabilityInj=" + permanentDisabilityInj + ", treatmentInj=" + treatmentInj
				+ ", convenanceInj=" + convenanceInj + ", specialDietInj=" + specialDietInj + ", costOfNursingInj="
				+ costOfNursingInj + ", costOfArtificialInj=" + costOfArtificialInj + ", lossIncomeInj=" + lossIncomeInj
				+ ", anyOtherLossInj=" + anyOtherLossInj + ", mentalShockInj=" + mentalShockInj + ", painSufferingInj="
				+ painSufferingInj + ", lossAmenitiesInj=" + lossAmenitiesInj + ", lossEarningInj=" + lossEarningInj
				+ ", totalCompensationInj=" + totalCompensationInj + ", disfigurationInj=" + disfigurationInj
				+ ", incomeInj=" + incomeInj + ", lossOfMarriageInj=" + lossOfMarriageInj + ", natureOfInjuryInj="
				+ natureOfInjuryInj + ", typeOfinjuryInj=" + typeOfinjuryInj + ", expenditureTreatmentInj="
				+ expenditureTreatmentInj + ", permenantDisabilityDetailsInj=" + permenantDisabilityDetailsInj
				+ ", inj_loss_erning_capacity=" + inj_loss_erning_capacity + ", inj_medical_treatment="
				+ inj_medical_treatment + "]";
	}

	public InsuranceInjuredEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	

	
}
