/**

@file UserDatabase.java
@brief This file contains the implementation of the UserDatabase class.
*/
package ce204_hw4_app;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @class UserDatabase
 *
 * @brief Represents a database of users in the application.
 */
public class UserDatabase {
  /**
   *
   * @brief Returns the shop balance.
   * @retval [long] The shop balance.
   */
  public static long getShopBalance() {
    return 0;
  }

  /**
   *
   * @brief Returns a list of admin users.
   *
   * @retval [List<User>] A list of admin users.
   */
  public static List<User> getAdminList() {
    List<User> adminList = new ArrayList<>();
    adminList.add(new Admin("Admin", "ADMIN", "admin", "0000"));
    adminList.add(new Admin("Alper", "alper", "alper", "admin"));
    adminList.add(new Admin("Sahin", "Sahin", "alper", "123"));
    adminList.add(new Admin("Can", "Alper", "can", "1234"));
    return adminList;
  }

  /**
   *
   * @brief Returns a list of customer users.
   *
   * @retval [List<User>] A list of customer users.
   */
  public static List<User> getCustomerList() {
    List<User> customerList = new ArrayList<>();
    customerList.add(new Customer("Ugur", "Coruh", "ugur", "1234", "2015-03-26"));
    customerList.add(new Customer("Alper", "Sahin", "alper", "1234", "2017-01-12"));
    return customerList;
  }

  /**
   *
   * @brief Returns a list of all users.
   *
   * @retval [List<User>] A list of all users.
   */
  public static List<User> getAllUserList() {
    List<User> userList = getCustomerList();
    userList.addAll(getAdminList());
    return userList;
  }

}
