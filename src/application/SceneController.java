package application;

import javafx.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;

import java.io.IOException;
import java.text.NumberFormat;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SceneController {
	// These are the TextField variables which represent where the user will type their data in on the GUI.
	@FXML
	private TextField purchasePrice;
	@FXML
	private TextField repairCost;
	@FXML
	private TextField inspectionFee;
	@FXML
	private TextField closingCost;
	@FXML
	private TextField totalInvestment;
	@FXML
	private TextField rentalIncomeMonthly;
	@FXML
	private TextField propertyTaxesMonthly;
	@FXML
	private TextField rentalInsuranceMonthly;
	@FXML
	private TextField maintenceSavingsMonthly;
	@FXML
	private TextField vacancySavingsMonthly;
	@FXML
	private TextField totalExpenditureMonthly;
	@FXML
	private TextField cashFlowMonthly;
	@FXML
	private TextField rentalIncomeYearly;
	@FXML
	private TextField propertyTaxesYearly;
	@FXML
	private TextField rentalInsuranceYearly;
	@FXML
	private TextField maintenceSavingsYearly;
	@FXML
	private TextField vacancySavingsYearly;
	@FXML
	private TextField totalExpenditureYearly;
	@FXML
	private TextField cashFlowYearly;
	@FXML
	private TextField percentage;
	@FXML
	private TextField address;
	@FXML
	private TextField file;
	
	// These instance variables are used in order to switch scenes in the GUI. 
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	//Variable which saves the name of the file
	private String fileName;
	
	// The NumberFormat class was imported in order to format input and output data in the calculator.
	private NumberFormat currencyFormat;
	
	
	// These are the instance variables which keep track of the data the user typed into the TextFields.
	private double intPurchasePrice;
	private double intRepairCost;
	private double intInspectionFee;
	private double intClosingCost;
	private double intTotalInvestment;
	private double intRentalIncomeMonthly;
	private double intPropertyTaxesMonthly;
	private double intRentalInsuranceMonthly;
	private double intMaintenceSavingsMonthly;
	private double intVacancySavingsMonthly;
	private double intTotalExpenditureMonthly;
	private double intCashFlowMonthly;
	
	private double intRentalIncomeYearly;
	private double intPropertyTaxesYearly;
	private double intRentalInsuranceYearly;
	private double intMaintenceSavingsYearly;
	private double intVacancySavingsYearly;
	private double intTotalExpenditureYearly;
	private double intCashFlowYearly;
	private double intPercentage;
	
	// This is the constructor method for the SceneController class. 
	// The constructor instantiates a new Currency Instance and Linked List.
	public SceneController () {
		currencyFormat = NumberFormat.getCurrencyInstance();
	}
	
	/*
	 * The PurchasePrice method stores the value entered by the user into a String Variable.
	 * It then converts the string into a double value and stores it into the intPurchasePrice variable.
	 * Once the Variable has been converted into a double value, a new String variable is created which 
	 * takes the intPurchasePrice value and formats it into a dollar ("$0.00") format.
	 * The purchasePrice TextField is then set to the formatted price. 
	 * Finally the totalInvestment() method is called and the intPurchasePrice is returned. 
	 */
	@FXML
	public double PurchasePrice() {
		String stringPrice = purchasePrice.getText();
		intPurchasePrice = Double.parseDouble(stringPrice);
		String formattedPrice = NumberFormat.getCurrencyInstance().format(intPurchasePrice);
		purchasePrice.setText(formattedPrice);
		TotalInvestment();
		return intPurchasePrice;
	}
	
	// The RepairCost(), InspectionFee(), and ClosingCost() methods function the same as PurchasePrice().
	@FXML
	public double RepairCost() {
		String stringPrice = repairCost.getText();
		intRepairCost = Double.parseDouble(stringPrice);
		String formattedPrice = NumberFormat.getCurrencyInstance().format(intRepairCost);
		repairCost.setText(formattedPrice);
		TotalInvestment();
		return intRepairCost;
		
	}
	@FXML
	public double InspectionFee() {
		String stringPrice = inspectionFee.getText();
		intInspectionFee = Double.parseDouble(stringPrice);
		String formattedPrice = NumberFormat.getCurrencyInstance().format(intInspectionFee);
		inspectionFee.setText(formattedPrice);
		TotalInvestment();
		return intInspectionFee;
	}
	@FXML
	public double ClosingCost() {
		String stringPrice = closingCost.getText();
		intClosingCost = Double.parseDouble(stringPrice);
		String formattedPrice = NumberFormat.getCurrencyInstance().format(intClosingCost);
		closingCost.setText(formattedPrice);
		TotalInvestment();
		return intClosingCost;
	}
	
	/*
	 * The TotalInvestment() method calculates the total of intPurchasePrice, intRepairCost, intInspectionFee, and intClosingCost
	 * and sets it equal to the intTotalInvestment. It then formats the double value into dollar format and sets the totalInvestment
	 * TextField to that value. It finally calls the percentage() method.
	 */
	@FXML
	public void TotalInvestment() {
		intTotalInvestment = intPurchasePrice + intRepairCost + intInspectionFee + intClosingCost;
		totalInvestment.setText(currencyFormat.format(intTotalInvestment));
		percentage();
		
	}
	
	// The following methods allow the user to enter a value in the monthly field within the GUI.
	// After the user enters a value, it will store the value into it's respective instance variable and
	// format the value into the currency format. It then calls it's respective yearly counterpart and the percentage()
	// and cashFlowMonthly() methods. 
	@FXML
	public double RentalIncomeMonthly() {
		String stringPrice = rentalIncomeMonthly.getText();
		intRentalIncomeMonthly = Double.parseDouble(stringPrice);
		String formattedPrice = NumberFormat.getCurrencyInstance().format(intRentalIncomeMonthly);
		rentalIncomeMonthly.setText(formattedPrice);
		RentalIncomeYearly();
		percentage();
		cashFlowMonthly();
		return intRentalIncomeMonthly;
		
	}
	@FXML
	public double PropertyTaxesMonthly() {
		String stringPrice = propertyTaxesMonthly.getText();
		intPropertyTaxesMonthly = Double.parseDouble(stringPrice);
		String formattedPrice = NumberFormat.getCurrencyInstance().format(intPropertyTaxesMonthly);
		propertyTaxesMonthly.setText(formattedPrice);
		PropertyTaxesYearly();
		TotalExpenditureMonthly();
		return intPropertyTaxesMonthly;
		
	}
	@FXML
	public double RentalInsuranceMonthly() {
		String stringPrice = rentalInsuranceMonthly.getText();
		intRentalInsuranceMonthly = Double.parseDouble(stringPrice);
		String formattedPrice = NumberFormat.getCurrencyInstance().format(intRentalInsuranceMonthly);
		rentalInsuranceMonthly.setText(formattedPrice);
		RentalInsuranceYearly();
		TotalExpenditureMonthly();
		return intRentalInsuranceMonthly;
	}
	@FXML
	public double MaintenceSavingsMonthly() {
		String stringPrice = maintenceSavingsMonthly.getText();
		intMaintenceSavingsMonthly = Double.parseDouble(stringPrice);
		String formattedPrice = NumberFormat.getCurrencyInstance().format(intMaintenceSavingsMonthly);
		maintenceSavingsMonthly.setText(formattedPrice);
		MaintenceSavingsYearly();
		TotalExpenditureMonthly();
		return intMaintenceSavingsMonthly;
	}
	@FXML
	public double VacancySavingsMonthly() {
		String stringPrice = vacancySavingsMonthly.getText();
		intVacancySavingsMonthly = Double.parseDouble(stringPrice);
		String formattedPrice = NumberFormat.getCurrencyInstance().format(intVacancySavingsMonthly);
		vacancySavingsMonthly.setText(formattedPrice);
		VacancySavingsYearly();
		TotalExpenditureMonthly();
		return intVacancySavingsMonthly;
	}
	@FXML
	public void TotalExpenditureMonthly() { 
		double doublePrice = intPropertyTaxesMonthly + intRentalInsuranceMonthly + intMaintenceSavingsMonthly + intVacancySavingsMonthly;
		intTotalExpenditureMonthly = doublePrice;
		String formattedPrice = NumberFormat.getCurrencyInstance().format(doublePrice);
		totalExpenditureMonthly.setText(formattedPrice);
		TotalExpenditureYearly();
		cashFlowMonthly();
		
	}
	
	// The yearly methods simply update the yearly TextFields and format the value into currency format. 
	public void RentalIncomeYearly() {
		intRentalIncomeYearly = intRentalIncomeMonthly * 12;
		String formattedPrice = NumberFormat.getCurrencyInstance().format(intRentalIncomeYearly);
		rentalIncomeYearly.setText(formattedPrice);
		
	}
	
	public void PropertyTaxesYearly() {
		intPropertyTaxesYearly = intPropertyTaxesMonthly * 12;
		String formattedPrice = NumberFormat.getCurrencyInstance().format(intPropertyTaxesYearly);
		propertyTaxesYearly.setText(formattedPrice);
		
		
	}
	
	public void RentalInsuranceYearly() {
		intRentalInsuranceYearly = intRentalInsuranceMonthly * 12;
		String formattedPrice = NumberFormat.getCurrencyInstance().format(intRentalInsuranceYearly);
		rentalInsuranceYearly.setText(formattedPrice);
		
	}
	
	public void MaintenceSavingsYearly() {
		intMaintenceSavingsYearly = intMaintenceSavingsMonthly * 12;
		String formattedPrice = NumberFormat.getCurrencyInstance().format(intMaintenceSavingsYearly);
		maintenceSavingsYearly.setText(formattedPrice);
		
	}
	
	public void VacancySavingsYearly() {
		intVacancySavingsYearly = intVacancySavingsMonthly * 12;
		String formattedPrice = NumberFormat.getCurrencyInstance().format(intVacancySavingsYearly);
		vacancySavingsYearly.setText(formattedPrice);
		
	}
	
	public void TotalExpenditureYearly() {
		double doublePrice = intTotalExpenditureMonthly * 12;
		intTotalExpenditureYearly = doublePrice;
	    String formattedPrice = NumberFormat.getCurrencyInstance().format(doublePrice);
	    totalExpenditureYearly.setText(formattedPrice);
	}
	
	// The cashFlow methods are updated through the monthly and yearly methods above. 
	public void cashFlowMonthly() {
		intCashFlowMonthly = intRentalIncomeMonthly - intTotalExpenditureMonthly;
		cashFlowMonthly.setText(currencyFormat.format(intCashFlowMonthly));
		cashFlowYearly();
	}
	
	public void cashFlowYearly() {
		intCashFlowYearly = intCashFlowMonthly * 12;
		cashFlowYearly.setText(currencyFormat.format(intCashFlowYearly));
		
		
	}
	
	// This method will calculate how much monthly rental income compares to the total investment.
	// It displays the value in a percentage format. 
	public void percentage() { 
		double percentageValue = (intRentalIncomeMonthly / intTotalInvestment) * 100;
		intPercentage = percentageValue;
	    String formattedPercentage = String.format("%.2f", percentageValue) + "%";
	    percentage.setText(formattedPercentage);
	}
	
	// This method takes the user input for the file name and stores it into the fileName instance variable
	public void file() {
		fileName = file.getText();
	}
	
	/*
	 * This is the method which allows the user to save the values they entered into a House object. The User 
	 * will enter the address of the property and save the object into a text file. The text file can contain multiple House objects
	 * and their respective values in order to keep a record of all the properties they have entered into the calculator.
	 */
	@FXML
	public void save(ActionEvent event) {
		String enteredAddress = address.getText();
		House property = new House(enteredAddress, intPurchasePrice, intRepairCost, intInspectionFee, intClosingCost, intTotalInvestment, intRentalIncomeMonthly, intPropertyTaxesMonthly, 
				intRentalInsuranceMonthly, intMaintenceSavingsMonthly, intVacancySavingsMonthly, intTotalExpenditureMonthly, intCashFlowMonthly, intRentalIncomeYearly, 
			    intPropertyTaxesYearly, intRentalInsuranceYearly, intMaintenceSavingsYearly, intVacancySavingsYearly, intTotalExpenditureYearly, intCashFlowYearly, intPercentage);
		saveToFile(property.toString());
	}
	
	// Helper Method which saves the property to a file. 
	private void saveToFile(String data) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true));
			writer.write(data);
			writer.newLine();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	/*
	 * This is the method which allows the user to switch to the import/search page. The import page lets the user import the text file they have saved to the 
	 * console so they can view the properties they have entered into the calculator. 
	 */
	@FXML
	public void change(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("SearchScene.fxml"));
		root = loader.load();
		SearchSceneController searchSceneController = loader.getController();
		stage = (Stage)((Node)event.getSource()).getScene().getWindow(); // This block of code will switch our scene to the SearchScene
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
		
	}
	
}
