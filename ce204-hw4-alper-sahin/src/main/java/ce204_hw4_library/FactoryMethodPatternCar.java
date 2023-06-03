/**

@file FactoryMethodPatternCar.java
@brief This file contains the implementation of the FactoryMethodPatternCar class.
*/
package ce204_hw4_library;
/**

@class FactoryMethodPatternCar
@brief Represents a factory for creating different types of cars using the Factory Method pattern.
*/
public class FactoryMethodPatternCar {
	/*
	@brief Creates a car based on the specified car type.
	@param rentCarType The type of car to create.
	@param carSeatsNumber The number of seats in the car.
	@param carPrice The price of the car.
	@param carColor The color of the car.
	@param carModel The model of the car.
	@param carBrand The brand of the car.
	@param carFuelType The fuel type of the car.
	@param carModelYear The model year of the car.
	@return The created RentCarInterface object representing the car.
	*/	
	public static RentCarInterface createCar(String rentCarType, int carSeatsNumber, int carPrice,
			String carColor, String carModel, String carBrand, String carFuelType, int carModelYear) {
		switch (rentCarType) {
		case "modelcabrio":
			return new CarModelCabrio(carSeatsNumber, carPrice, carColor, carModel, carBrand, carFuelType,
					carModelYear);
		case "modelhatchback":
			return new CarModelHatchback(carSeatsNumber, carPrice, carColor, carModel, carBrand, carFuelType,
					carModelYear);
		case "modelpickup":
			return new CarModelPickUp(carSeatsNumber, carPrice, carColor, carModel, carBrand, carFuelType,
					carModelYear);
		case "modelsedan":
			return new CarModelSedan(carSeatsNumber, carPrice, carColor, carModel, carBrand, carFuelType,
					carModelYear);
		case "modelstationwagon":
			return new CarModelStationWagon(carSeatsNumber, carPrice, carColor, carModel, carBrand,
					carFuelType, carModelYear);
		case "modelsuv":
			return new CarModelSUV(carSeatsNumber, carPrice, carColor, carModel, carBrand, carFuelType,
					carModelYear);
		}
		return null;

	}
}
