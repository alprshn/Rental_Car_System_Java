/**
 * @file Bill.java
 * @brief Contains the implementation of the Bill class.
 */
package ce204_hw4_app;

import ce204_hw4_library.RentCarInterface;
/**
 * @class Bill
 * @brief Represents a bill for a rented car.
 * 
 * This class is responsible for displaying the bill details for a rented car, including its features and payment information.
 */
public class Bill {
	/**
     * @brief Displays the bill for a rented car.
     * 
     * This method displays the details of a rented car and the payment information in a formatted bill format.
     * 
     * @param car The rented car object.
     * @param paymentsystemType The type of payment system used for the car rental.
     * @retval void
     * 
     */
	
	private RentCarInterface carFeatures;
	private String paymentsystemType;
	
	
	public static void displayBill(RentCarInterface car, String paymentsystemType) {
		System.out.print("+---------------------------------------------+\n" +
                "|             	     BILL  	                  |\n" +
                "+---------------------------------------------+\n\n" +
                "Car Brand: " + car.getCarBrand().toUpperCase() + "\n" +
                "Car Model: " + car.getCarModel().toUpperCase() + "\n" +
                "Car Year: " + car.getCarModelYear() + "\n" +
                "Car Fuel: " + car.getCarFuelType().toUpperCase() + "\n" +
                "Car Color: " + car.getCarColor().toUpperCase() + "\n" +
                "Car Price: " + car.getCarPrice() + "\n" +
                "Car Seats Number: " + car.getCarSeatsNumber() + "\n" +
                "Paymet Type: " + paymentsystemType + "\n\n" +
                "+---------------------------------------------+\n" +
                "+---------------------------------------------+\n\n");
	}
}
