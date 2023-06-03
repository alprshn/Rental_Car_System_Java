/**

@file CarCustomer.java
@brief This file contains the implementation of the CarCustomer class.
*/
package ce204_hw4_library;

/**
 * 
 * @class CarCustomer
 * 
 * @brief Represents a customer of a car rental service.
 */
public class CarCustomer implements CarRentObserverInterface {
	private String name;
	private int notiCount;

	/**
	 * 
	 * @brief Constructs a CarCustomer object with the specified name.
	 * @param name The name of the customer.
	 */
	public CarCustomer(String name) {
		this.name = name;
		this.notiCount = 0;

	}

	/**
	 * 
	 * @brief Updates the customer with a notification from the car rental service.
	 * @param carObservable The car rental service that sent the notification.
	 */
	@Override
	public void updateNoti(CustomerObserverable carObservable) {
		NotificationTime notificationtime = (NotificationTime) carObservable;
		System.out
				.println("Hello " + name + ", " + notificationtime.getRemainingNoti() + " days left for your delivery");
		notiCount++;
	}

	/**
	 * 
	 * @brief Returns the count of notifications received by the customer.
	 * @retval [int] The count of notifications received by the customer.
	 */
	public int getNotificationCount() {
		return notiCount;
	}
}
