/**

@file CarModelStationWagon.java
@brief This file contains the implementation of the CarModelStationWagon class.
*/
package ce204_hw4_library;

/**
 * 
 * @class CarModelStationWagon
 * 
 * @brief Represents a station wagon car model for rental.
 */
public class CarModelStationWagon implements RentCarInterface {
	private String carBrand;
	private String carModel;
	private int carModelYear;
	private String carFuelType;
	private String carColor;
	private int carPrice;
	private int carSeatsNumber;

	/**
	 * 
	 * @brief Constructs a CarModelStationWagon object with the specified details.
	 * @param carSeatsNumber The number of seats in the car.
	 * @param carPrice       The price of the car.
	 * @param carColor       The color of the car.
	 * @param carModel       The model of the car.
	 * @param carBrand       The brand of the car.
	 * @param carFuelType    The fuel type of the car.
	 * @param carModelYear   The model year of the car.
	 */
	public CarModelStationWagon(int carSeatsNumber, int carPrice, String carColor, String carModel, String carBrand,
			String carFuelType, int carModelYear) {
		this.carFuelType = carFuelType;
		this.carModelYear = carModelYear;
		this.carColor = carColor;
		this.carPrice = carPrice;
		this.carModel = carModel;
		this.carBrand = carBrand;
		this.carSeatsNumber = carSeatsNumber;
	}

	/**
	 * 
	 * @brief Returns the number of seats in the car.
	 * @retval [int] The number of seats in the car.
	 */
	public int getCarSeatsNumber() {
		// TODO Auto-generated method stub
		return carSeatsNumber;
	}

	/**
	 * 
	 * @brief Returns the brand of the car.
	 * @retval [String] The brand of the car.
	 */
	public String getCarBrand() {
		// TODO Auto-generated method stub
		return carBrand;
	}

	/**
	 * 
	 * @brief Returns the color of the car.
	 * @retval [String] The color of the car.
	 */
	public String getCarColor() {
		// TODO Auto-generated method stub
		return carColor;
	}

	/**
	 * 
	 * @brief Returns the model of the car.
	 * @retval [String] The model of the car.
	 */
	public String getCarModel() {
		// TODO Auto-generated method stub
		return carModel;
	}

	/**
	 * 
	 * @brief Returns the price of the car.
	 * @retval [int] The price of the car.
	 */
	public int getCarPrice() {
		// TODO Auto-generated method stub
		return carPrice;
	}

	/**
	 * 
	 * @brief Returns the model year of the car.
	 * @retval [int] The model year of the car.
	 */
	public int getCarModelYear() {
		// TODO Auto-generated method stub
		return carModelYear;
	}

	/**
	 * 
	 * @brief Returns the fuel type of the car.
	 * @retval [String] The fuel type of the car.
	 */
	public String getCarFuelType() {
		// TODO Auto-generated method stub
		return carFuelType;
	}
}
