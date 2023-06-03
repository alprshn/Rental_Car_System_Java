/**

@file LoginServices.java
@brief This file contains the implementation of the LoginServices class.
*/
package ce204_hw4_library;

import ce204_hw4_app.*;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @class LoginServices
 *
 * @brief Represents the login services for the application.
 */
public class LoginServices implements LoginServicesInterface {

  public Scanner input = new Scanner(System.in);
  private List<User> userList;
  private User loggedInUser = null;

  /**
   *
   * @brief Constructs a new LoginServices object with the specified user list.
   * @param userList The list of users in the system.
   */
  public LoginServices(List<User> userList) {
    this.userList = userList;
  }

  /**
   *
   * @brief Gets the currently logged in user.
   * @return The currently logged in user.
   */
  public User getLoggedInUser() {
    return loggedInUser;
  }

  /**
   *
   * @brief Validates the login credentials.
   * @param userName The username provided by the user.
   * @param password The password provided by the user.
   * @return The User object if the credentials are valid, null otherwise.
   */
  public User validateLogIn(String userName, String password) {
    for (User currentUser : userList) {
      if (userName.equals(currentUser.getUserName()) && password.equals(currentUser.getPassword())) {
        return currentUser;
      }
    }

    return null;
  }

  /**
   *
   * @brief Performs the login process.
   * @param userName The username provided by the user.
   * @param password The password provided by the user.
   * @return The logged in User object.
   */

  public User doLogIn(String userName, String password) {
    if (validateLogIn(userName, password) instanceof Customer) {
      loggedInUser = validateLogIn(userName, password);
      System.out.println("Welcome " + loggedInUser.getFirstName() + " " + loggedInUser.getLastName() + "!");
    } else if (validateLogIn(userName, password) instanceof Admin) {
      loggedInUser = validateLogIn(userName, password);
      System.out.println("Welcome " + loggedInUser.getFirstName() + " " + loggedInUser.getLastName() + "!");
    }

    return loggedInUser;
  }

  /**
   *
   * @brief Exits the application.
   */
  public void exitApp() {
    System.out.println("Hope you'll be back soon!");
  }

  /**
   *
   * @brief Checks if a user is logged in.
   * @param loggedInUser The user to check.
   * @return true if the user is logged in, false otherwise.
   */
  public boolean isLoggedIn(User loggedInUser) {
    return loggedInUser != null;
  }

  /**
   *
   * @brief Checks if a user is logged in as a customer.
   * @param loggedInUser The user to check.
   * @return true if the user is logged in as a customer, false otherwise.
   */

  public boolean isLoggedInAsCustomer(User loggedInUser) {
    return isLoggedIn(loggedInUser) && !loggedInUser.getUserName().equals("customer");
  }

  /**
   *
   * @brief Checks if a user is logged in as an admin.
   * @param loggedInUser The user to check.
   * @return true if the user is logged in as an admin, false otherwise.
   */
  public boolean isLoggedInAsAdmin(User loggedInUser) {
    return isLoggedIn(loggedInUser) && loggedInUser.getUserName().equals("admin");
  }

  /**
   *
   * @brief Sets the logged in user.
   * @param loggedInUser The user to set as loggedinUser.
   */
  public void setLoggedInUser(User loggedInUser) {
    this.loggedInUser = loggedInUser;
  }

  /**
   * @brief Initiates the login process.
   *
   * @return The logged in User object.
   */
  public User initiateLogIn() {
    User loggedIn;

    do {
      System.out.println();
      displayLogInMenu();
      System.out.println("Username:");
      String userName = input.nextLine();
      System.out.println("Password:");
      String password = input.nextLine();
      loggedIn = doLogIn(userName, password);

      if (isLoggedInAsCustomer(loggedIn) || isLoggedInAsAdmin(loggedIn)) {
        System.out.println("Login successfully!!!");
      } else {
        System.out.println("Wrong credentials! Please, try again!");
      }
    } while (!isLoggedIn(loggedIn));

    return loggedIn;
  }

  /**
   * @brief Displays the login menu.
   */
  public void displayLogInMenu() {
    System.out.println("+----------------------------------------------+");
    System.out.println("|                     LOGIN:                   |");
    System.out.println("+----------------------------------------------+");
  }

}
