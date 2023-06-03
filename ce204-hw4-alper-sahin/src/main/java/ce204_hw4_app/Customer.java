/**
 * @file Customer.java
 * @brief Contains the implementation of the Customer class.
 */

package ce204_hw4_app;


import java.time.LocalDate;

/**
 * @class Customer
 * @brief Represents a customer user.
 *
 * This class extends the User class and represents a customer user in the application.
 * Customer users have additional properties related to their driving license.
 */
public class Customer extends User {
  /**
    * @brief Gets the date when the customer obtained their driving license.
    *
    * @return The date when the customer obtained their driving license.
    */
  private LocalDate licenceObtained;

  public Customer() {
  }
  /**
     * @brief Constructs a new Customer object.
     *
     * This constructor creates a new Customer object with the specified first name, last name, username, password, and license obtained date.
     *
     * @param firstName The first name of the customer.
     * @param lastName The last name of the customer.
     * @param userName The username of the customer.
     * @param password The password of the customer.
     * @param licenceObtained The date when the customer obtained their driving license.
     */
  public Customer(String firstName, String lastName, String userName, String password, String licenceObtained) {
    super(firstName, lastName, userName, password);
    this.licenceObtained = LocalDate.parse(licenceObtained);
  }
  /**
    * @brief Gets the date when the customer obtained their driving license.
    *
    * @return The date when the customer obtained their driving license.
    */
  public LocalDate getLicenceObtained() {
    return licenceObtained;
  }
  /**
     * @brief Sets the date when the customer obtained their driving license.
     *
     * @param licenceObtained The date when the customer obtained their driving license.
     */
  public void setLicenceObtained(LocalDate licenceObtained) {
    this.licenceObtained = licenceObtained;
  }

}