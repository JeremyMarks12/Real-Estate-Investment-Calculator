package application;

public class House {
	private String address;
	private double purchasePrice;
	private double repairCost;
	private double inspectionFee;
	private double closingCost;
	private double totalInvestment;
	private double rentalIncomeMonthly;
	private double propertyTaxesMonthly;
	private double rentalInsuranceMonthly;
	private double maintenceSavingsMonthly;
	private double vacancySavingsMonthly;
	private double totalExpenditureMonthly;
	private double cashFlowMonthly;
	private double rentalIncomeYearly;
	private double propertyTaxesYearly;
	private double rentalInsuranceYearly;
	private double maintenceSavingsYearly;
	private double vacancySavingsYearly;
	private double totalExpenditureYearly;
	private double cashFlowYearly;
	private double percentage;
	
	public House(String address, double purchasePrice, double repairCost, double inspectionFee, double closingCost, double totalInvestment, double rentalIncomeMonthly, double propertyTaxesMonthly, 
			double rentalInsuranceMonthly, double maintenceSavingsMonthly, double vacancySavingsMonthly, double totalExpenditureMonthly, double cashFlowMonthly, double rentalIncomeYearly, 
			double propertyTaxesYearly, double rentalInsuranceYearly, double maintenceSavingsYearly, double vacancySavingsYearly, double totalExpenditureYearly, double cashFlowYearly, double percentage) {
		this.address = address;
		this.purchasePrice = purchasePrice;
		this.repairCost = repairCost;
		this.inspectionFee = inspectionFee;
		this.closingCost = closingCost;
		this.totalInvestment = totalInvestment;
		this.rentalIncomeMonthly = rentalIncomeMonthly;
		this.propertyTaxesMonthly = propertyTaxesMonthly;
		this.rentalInsuranceMonthly = rentalInsuranceMonthly;
		this.maintenceSavingsMonthly = maintenceSavingsMonthly;
		this.vacancySavingsMonthly = vacancySavingsMonthly;
		this.totalExpenditureMonthly = totalExpenditureMonthly;
		this.cashFlowMonthly = cashFlowMonthly;
		this.rentalIncomeYearly = rentalIncomeYearly;
		this.propertyTaxesYearly = propertyTaxesYearly;
		this.rentalInsuranceYearly = rentalInsuranceYearly;
		this.maintenceSavingsYearly = maintenceSavingsYearly;
		this.vacancySavingsYearly = vacancySavingsYearly;
		this.totalExpenditureYearly = totalExpenditureYearly;
		this.cashFlowYearly = cashFlowYearly;
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		String outPut = "";
		outPut += "****************************************************************************************************** \n";
		outPut += "Address: " + address + "\n";
		outPut += "Purchase Price: " + purchasePrice + "\n";
		outPut += "Repair Cost: " + repairCost +"\n";
		outPut += "Inspection Fee:" + inspectionFee + "\n";
		outPut += "Closing Cost: " + closingCost + "\n";
		outPut += "Total Investment: " + totalInvestment + "\n";
		outPut += "Rental Income Monthly: " + rentalIncomeMonthly + "\t" + "Rental Income Yearly: " + rentalIncomeYearly + "\n";
		outPut += "Property Taxes Monthly: " + propertyTaxesMonthly + "\t" + "Property Taxes Yearly: " + propertyTaxesYearly + "\n";
		outPut += "Rental Insurence Monthly: " + rentalInsuranceMonthly + "\t" + "Rental Insurance Yearly: " + rentalInsuranceYearly + "\n";
		outPut += "Maintence Savings Monthly: " + maintenceSavingsMonthly + "\t" + "Maintence Savings Yearly: " + maintenceSavingsYearly + "\n";
		outPut += "Vacancy Savings Monthly: " + vacancySavingsMonthly + "\t" + "Vacancy Savings Yearly: " + vacancySavingsYearly + "\n";
		outPut += "Total Expenditure Monthly: " + totalExpenditureMonthly + "\t" + "Total Expenditure Yearly: " + totalExpenditureYearly + "\n";
		outPut += "Cash Flow Monthly: " + cashFlowMonthly + "\t" + "Cash Flow Yearly: " + cashFlowYearly + "\n";
		outPut += "Monthly Income to Total Investment Percentage: " + percentage;
		return outPut;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public double getRepairCost() {
		return repairCost;
	}

	public void setRepairCost(double repairCost) {
		this.repairCost = repairCost;
	}

	public double getInspectionFee() {
		return inspectionFee;
	}

	public void setInspectionFee(double inspectionFee) {
		this.inspectionFee = inspectionFee;
	}

	public double getClosingCost() {
		return closingCost;
	}

	public void setClosingCost(double closingCost) {
		this.closingCost = closingCost;
	}

	public double getTotalInvestment() {
		return totalInvestment;
	}

	public void setTotalInvestment(double totalInvestment) {
		this.totalInvestment = totalInvestment;
	}

	public double getRentalIncomeMonthly() {
		return rentalIncomeMonthly;
	}

	public void setRentalIncomeMonthly(double rentalIncomeMonthly) {
		this.rentalIncomeMonthly = rentalIncomeMonthly;
	}

	public double getPropertyTaxesMonthly() {
		return propertyTaxesMonthly;
	}

	public void setPropertyTaxesMonthly(double propertyTaxesMonthly) {
		this.propertyTaxesMonthly = propertyTaxesMonthly;
	}

	public double getRentalInsuranceMonthly() {
		return rentalInsuranceMonthly;
	}

	public void setRentalInsuranceMonthly(double rentalInsuranceMonthly) {
		this.rentalInsuranceMonthly = rentalInsuranceMonthly;
	}

	public double getMaintenceSavingsMonthly() {
		return maintenceSavingsMonthly;
	}

	public void setMaintenceSavingsMonthly(double maintenceSavingsMonthly) {
		this.maintenceSavingsMonthly = maintenceSavingsMonthly;
	}

	public double getVacancySavingsMonthly() {
		return vacancySavingsMonthly;
	}

	public void setVacancySavingsMonthly(double vacancySavingsMonthly) {
		this.vacancySavingsMonthly = vacancySavingsMonthly;
	}

	public double getTotalExpenditureMonthly() {
		return totalExpenditureMonthly;
	}

	public void setTotalExpenditureMonthly(double totalExpenditureMonthly) {
		this.totalExpenditureMonthly = totalExpenditureMonthly;
	}

	public double getCashFlowMonthly() {
		return cashFlowMonthly;
	}

	public void setCashFlowMonthly(double cashFlowMonthly) {
		this.cashFlowMonthly = cashFlowMonthly;
	}

	public double getRentalIncomeYearly() {
		return rentalIncomeYearly;
	}

	public void setRentalIncomeYearly(double rentalIncomeYearly) {
		this.rentalIncomeYearly = rentalIncomeYearly;
	}

	public double getPropertyTaxesYearly() {
		return propertyTaxesYearly;
	}

	public void setPropertyTaxesYearly(double propertyTaxesYearly) {
		this.propertyTaxesYearly = propertyTaxesYearly;
	}

	public double getRentalInsuranceYearly() {
		return rentalInsuranceYearly;
	}

	public void setRentalInsuranceYearly(double rentalInsuranceYearly) {
		this.rentalInsuranceYearly = rentalInsuranceYearly;
	}

	public double getMaintenceSavingsYearly() {
		return maintenceSavingsYearly;
	}

	public void setMaintenceSavingsYearly(double maintenceSavingsYearly) {
		this.maintenceSavingsYearly = maintenceSavingsYearly;
	}

	public double getVacancySavingsYearly() {
		return vacancySavingsYearly;
	}

	public void setVacancySavingsYearly(double vacancySavingsYearly) {
		this.vacancySavingsYearly = vacancySavingsYearly;
	}

	public double getTotalExpenditureYearly() {
		return totalExpenditureYearly;
	}

	public void setTotalExpenditureYearly(double totalExpenditureYearly) {
		this.totalExpenditureYearly = totalExpenditureYearly;
	}

	public double getCashFlowYearly() {
		return cashFlowYearly;
	}

	public void setCashFlowYearly(double cashFlowYearly) {
		this.cashFlowYearly = cashFlowYearly;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
}   
