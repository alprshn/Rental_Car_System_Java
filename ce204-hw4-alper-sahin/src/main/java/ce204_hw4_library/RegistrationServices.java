/**

@file RegistrationServices.java
@brief This file contains the implementation of the RegistrationServices class.
The RegistrationServices class is a part of the CE204_HW4_Library package and implements the RegistrationServicesInterface.
It provides methods for handling customer registration and managing the registration process.
*/
package ce204_hw4_library;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import ce204_hw4_app.*;

/**
 *
 * @class RegistrationServices
 *
 * @brief Represents a registration service for user registration.
 *
 *        The RegistrationServices class implements the
 *        RegistrationServicesInterface and provides methods for handling
 *        customer
 *
 *        registration and managing the registration process.
 */

public class RegistrationServices implements RegistrationServicesInterface {

  public Scanner input = new Scanner(System.in);
  private List<User> userList;
  private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
  public double diff;

  /**
   *
   * @brief Constructs a RegistrationServices instance with the specified user
   *        list. This constructor initializes a RegistrationServices instance
   *        with the specified user list.
   * @param userList The list of users to be managed by the registration service.
   */
  public RegistrationServices(List<User> userList) {
    this.userList = userList;
  }

  /**
   *
   * @brief Creates a new customer registration form. This method creates a new
   *        customer registration form with the provided user details.
   * @param firstName       The first name of the customer.
   * @param lastName        The last name of the customer.
   * @param userName        The username of the customer.
   * @param password        The password of the customer.
   * @param licenceObtained The date the driver's license was obtained by the
   *                        customer.
   * @return A Customer object representing the customer registration form.
   */
  @Override
  public Customer customerRegistrationForm(String firstName, String lastName, String userName, String password,
      String licenceObtained) {
    return new Customer(firstName, lastName, userName, password, licenceObtained);
  }

  /**
   *
   * @brief Performs the customer registration. This method performs the customer
   *        registration by adding the customer to the user list.
   * @param customer The Customer object representing the customer registration
   *                 form.
   */
  @Override
  public void customerRegistration(Customer customer) {
    System.out.println("Registration complete!");
    userList.add(customer);
  }

  /**
   *
   * @brief Displays the registration menu. This method displays the registration
   *        menu.
   */
  @Override
  public void displayRegistrationMenu() {
    System.out.println("+----------------------------------------------+");
    System.out.println("|                   REGISTER                   |");
    System.out.println("+----------------------------------------------+");
  }

  /**
   *
   * @brief Initiates the registration process. This method initiates the
   *        registration process by prompting the user to enter their registration
   *        details and performs the necessary validation and registration steps.
   * @param loginService The LoginServices object used for the registration
   *                     process.
   */
  @Override
  public void initiateRegistration(LoginServices loginService) {
    System.out.println();
    displayRegistrationMenu();
    System.out.println("First Name:");
    String firstName = input.next();
    System.out.println("Last Name:");
    String lastName = input.next();
    System.out.println("Username:");
    String userName = input.next();
    System.out.println("Password:");
    String password = input.next();
    System.out.println("Driver's license date:[yyyy-MM-dd]");
    System.out.println("(Must be at least 2 years)");
    String licenceObtained = input.next();

    try {
      Date date = dateFormat.parse(String.valueOf(licenceObtained));
      dateFormat = new SimpleDateFormat("EEE, yyyy MMM d");
      Date currentDate = new Date();
      DecimalFormat df = new DecimalFormat("#.##");
      long diffInMillies = Math.abs(currentDate.getTime() - date.getTime());
      diff = (double) (diffInMillies / (1000 * 60 * 60 * 24 * 365.25));
      System.out.println("Licence usage time: " + df.format(diff) + " year");
    } catch (ParseException e) {
      System.out.println("Parse Exception");
    }

    if (diff < 2) {
      System.out.println("License usage time is not enough");
    } else {
      customerRegistration(customerRegistrationForm(firstName, lastName, userName, password, licenceObtained));
    }
  }

}
