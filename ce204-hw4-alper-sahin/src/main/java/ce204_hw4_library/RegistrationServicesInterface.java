/**

@file RegistrationServicesInterface.java
@brief This file contains the interface definition for the RegistrationServicesInterface.
The RegistrationServicesInterface is a part of the CE204_HW4_Library package and provides the contract for
the registration services.
*/

package ce204_hw4_library;

import ce204_hw4_app.*;

/**
 *
 * @interface RegistrationServicesInterface
 *
 * @brief Represents the interface for registration services.
 *
 *        The RegistrationServicesInterface defines the methods for handling
 *        user registration and managing the registration process.
 */
public interface RegistrationServicesInterface {
  /**
   *
   * @brief Displays the registration menu. This method displays the registration
   *        menu.
   */
  void displayRegistrationMenu();

  /**
   *
   * @brief Performs the customer registration. This method performs the customer
   *        registration.
   * @param customer The Customer object representing the customer registration
   *                 form.
   */
  void customerRegistration(Customer customer);

  /**
   *
   * @brief Creates a new customer registration form. This method creates a new
   *        customer registration form.
   * @param firstName       The first name of the customer.
   * @param lastName        The last name of the customer.
   * @param userName        The username of the customer.
   * @param password        The password of the customer.
   * @param licenceObtained The date the driver's license was obtained by the
   *                        customer.
   * @return A Customer object representing the customer registration form.
   */
  Customer customerRegistrationForm(String Name, String lastName, String userName, String password,
                                    String licenceObtained);

  /**
   *
   * @brief Initiates the registration process. This method initiates the
   *        registration process.
   * @param loginService The LoginServices object used for the registration
   *                     process.
   */
  void initiateRegistration(LoginServices loginImpService);

}
