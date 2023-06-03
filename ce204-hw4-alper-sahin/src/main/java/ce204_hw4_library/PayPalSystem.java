
/**

@file PayPalSystem.java
@brief This file contains the implementation of the PayPalSystem class.
The PayPalSystem class is a part of the CE204_HW4_Library package and provides methods for handling PayPal payments
for car rentals.
*/
package ce204_hw4_library;

/**
 *
 * @class PayPalSystem
 *
 * @brief Represents the PayPal payment system for car rentals.
 *
 *        The PayPalSystem class provides methods for handling PayPal payments
 *        for car rentals. It stores the email and password
 *
 *        associated with the PayPal account used for payments.
 */
public class PayPalSystem {

  private String valEmail;
  private String valPassword;

  /**
   *
   * @brief Constructs a PayPalSystem instance with the specified email and
   *        password. This constructor initializes a PayPalSystem instance with
   *        the specified email and password values.
   * @param emailValue    The email associated with the PayPal account.
   * @param passwordValue The password associated with the PayPal account.
   */
  public PayPalSystem(String emailValue, String passwordValue) {
    // TODO Auto-generated constructor stub
    valEmail = emailValue;
    valPassword = passwordValue;
  }

  /**
   *
   * @brief Retrieves the email associated with the PayPal account. This method
   *        retrieves the email associated with the PayPal account.
   * @return The email associated with the PayPal account.
   */
  public String getEmailValue() {
    return valEmail;
  }

  /**
   *
   * @brief Retrieves the password associated with the PayPal account. This method
   *        retrieves the password associated with the PayPal account.
   * @return The password associated with the PayPal account.
   */
  public String getPasswordValue() {
    return valPassword;
  }
}
