/**

@file RentCarInterface.java
@brief This file contains the interface definition for the RentCarInterface.
The RentCarInterface is a part of the CE204_HW4_Library package and provides the contract for
the rental car information.
*/
package ce204_hw4_library;
/**

@interface RentCarInterface

@brief Represents the interface for rental car information.

The RentCarInterface defines the methods for accessing various details of a rental car.
*/
public interface RentCarInterface {
	/**

	@brief Gets the number of seats in the car.
	This method returns the number of seats in the car.
	@return The number of seats in the car.
	*/
	public int getCarSeatsNumber();
	/**

	@brief Gets the brand of the car.
	This method returns the brand of the car.
	@return The brand of the car.
	*/
	public String getCarBrand();
	/**

	@brief Gets the color of the car.
	This method returns the color of the car.
	@return The color of the car.
	*/
	public String getCarColor();
	/**

	@brief Gets the model of the car.
	This method returns the model of the car.
	@return The model of the car.
	*/
	public String getCarModel();
	/**

	@brief Gets the price of renting the car.
	This method returns the price of renting the car.
	@return The price of renting the car.
	*/
	public int getCarPrice();
	/**

	@brief Gets the model year of the car.
	This method returns the model year of the car.
	@return The model year of the car.
	*/
	public int getCarModelYear();
	/**

	@brief Gets the fuel type of the car.
	This method returns the fuel type of the car.
	@return The fuel type of the car.
	*/
	public String getCarFuelType();

}
