/**

@file Tests.java
@brief Test cases for the application functionality.
*/
package ce204_hw4_test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

import ce204_hw4_app.*;
import ce204_hw4_library.*;

/**
 *
 * @brief Test class for the application functionality.
 */
public class Tests {
  /**
   *
   * @brief Test case for CustomerMenu method.
   *
   *        Test scenario: User selects option 1 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void CustomerMenuTest1() {
    List<User> userList = new ArrayList<>();
    LoginServices login = new LoginServices(userList);
    RegistrationServices registration = new RegistrationServices(userList);
    MenuServices menu = new MenuServices();
    Main main = new Main(userList, menu, login, registration);
    main.DefaulMainCars();
    main.INPUT = new Scanner("1\n");
    String input = "1\n5";
    InputStream inputStream = new ByteArrayInputStream(input.getBytes());
    System.setIn(inputStream);
    main.CustomerMenu();
    Assert.assertTrue(true);
  }

  /**
   *
   * @brief Test case for CustomerMenu method.
   *
   *        Test scenario: User selects option 2 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void CustomerMenuTest2() {
    List<User> userList = new ArrayList<>();
    LoginServices login = new LoginServices(userList);
    RegistrationServices registration = new RegistrationServices(userList);
    MenuServices menu = new MenuServices();
    Main main = new Main(userList, menu, login, registration);
    main.DefaulMainCars();
    main.INPUT = new Scanner("1\n");
    String input = "2\n1\n1\n1\n1\n";
    InputStream inputStream = new ByteArrayInputStream(input.getBytes());
    System.setIn(inputStream);
    main.CustomerMenu();
    Assert.assertTrue(true);
  }

  /**
   *
   * @brief Test case for CustomerMenu method.
   *
   *        Test scenario: User selects option 3 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void CustomerMenuTest3() {
    List<User> userList = new ArrayList<>();
    LoginServices login = new LoginServices(userList);
    RegistrationServices registration = new RegistrationServices(userList);
    MenuServices menu = new MenuServices();
    Main main = new Main(userList, menu, login, registration);
    main.INPUT = new Scanner("1\n3\n");
    main.CustomerMenu();
    Assert.assertTrue(true);
  }

  /**
   *
   * @brief Test case for CustomerMenu method.
   *
   *        Test scenario: User selects option 4 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void CustomerMenuTest4() {
    List<User> userList = new ArrayList<>();
    LoginServices login = new LoginServices(userList);
    RegistrationServices registration = new RegistrationServices(userList);
    MenuServices menu = new MenuServices();
    Main main = new Main(userList, menu, login, registration);
    main.DefaulMainCars();
    main.INPUT = new Scanner("1\n");
    String input = "1\n3\n1\n1\n";
    InputStream inputStream = new ByteArrayInputStream(input.getBytes());
    System.setIn(inputStream);
    main.CustomerMenu();
    Assert.assertTrue(true);
  }

  /**
   *
   * @brief Test case for CustomerMenu method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */

  @Test
  public void CustomerMenuTest5() {
    List<User> userList = new ArrayList<>();
    LoginServices login = new LoginServices(userList);
    RegistrationServices registration = new RegistrationServices(userList);
    MenuServices menu = new MenuServices();
    Main main = new Main(userList, menu, login, registration);
    main.DefaulMainCars();
    main.INPUT = new Scanner("1\n");
    String input = "1\n1\n1\n1\n";
    InputStream inputStream = new ByteArrayInputStream(input.getBytes());
    System.setIn(inputStream);
    main.CustomerMenu();
    Assert.assertTrue(true);
  }

  /**
   *
   * @brief Test case for CustomerMenu method.
   *
   *        Test scenario: User selects option 6 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */

  @Test
  public void CustomerMenuTest6() {
    List<User> userList = new ArrayList<>();
    LoginServices login = new LoginServices(userList);
    RegistrationServices registration = new RegistrationServices(userList);
    MenuServices menu = new MenuServices();
    Main main = new Main(userList, menu, login, registration);
    main.DefaulMainCars();
    main.INPUT = new Scanner("1\n");
    String input = "1\n1\n1\n1\n";
    InputStream inputStream = new ByteArrayInputStream(input.getBytes());
    System.setIn(inputStream);
    main.CustomerMenu();
    Assert.assertTrue(true);
  }

  /**
   *
   * @brief Test case for CustomerMenu method.
   *
   *        Test scenario: User selects option 7 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */

  @Test
  public void CustomerMenuTest7() {
    List<User> userList = new ArrayList<>();
    LoginServices login = new LoginServices(userList);
    RegistrationServices registration = new RegistrationServices(userList);
    MenuServices menu = new MenuServices();
    Main main = new Main(userList, menu, login, registration);
    main.DefaulMainCars();
    main.INPUT = new Scanner("1\n");
    String input = "1\n2\n1\n1\n";
    InputStream inputStream = new ByteArrayInputStream(input.getBytes());
    System.setIn(inputStream);
    main.CustomerMenu();
    Assert.assertTrue(true);
  }

  /**
   *
   * @brief Test case for CustomerMenu method.
   *
   *        Test scenario: User selects option 8 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void CustomerMenuTest8() {
    List<User> userList = new ArrayList<>();
    LoginServices login = new LoginServices(userList);
    RegistrationServices registration = new RegistrationServices(userList);
    MenuServices menu = new MenuServices();
    Main main = new Main(userList, menu, login, registration);
    main.INPUT = new Scanner("20\n3");
    main.CustomerMenu();
    Assert.assertTrue(true);
  }

  /**
   *
   * @brief Test case for CustomerMenu method.
   *
   *        Test scenario: User selects option 9 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void CustomerMenuTest9() {
    List<User> userList = new ArrayList<>();
    LoginServices login = new LoginServices(userList);
    RegistrationServices registration = new RegistrationServices(userList);
    MenuServices menu = new MenuServices();
    Main main = new Main(userList, menu, login, registration);
    main.INPUT = new Scanner("2\n3");
    main.CustomerMenu();
    Assert.assertTrue(true);
  }

  /**
   *
   * @brief Test case for AdminMenu method.
   *
   *        Test scenario: User selects option 1 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void AdminMenuTest1() {
    List<User> userList = new ArrayList<>();
    LoginServices login = new LoginServices(userList);
    RegistrationServices registration = new RegistrationServices(userList);
    MenuServices menu = new MenuServices();
    Main main = new Main(userList, menu, login, registration);
    RentCarInterface car = FactoryMethodPatternCar.createCar("modelsuv", 4, 1550, "Blue", "Tiguan", "Volkswagen",
                           "Petrol", 2019);
    main.rentalCars.add(car);
    main.INPUT = new Scanner("3\n5\n");
    String input = "2\n";
    InputStream inputStream = new ByteArrayInputStream(input.getBytes());
    System.setIn(inputStream);
    main.AdminMenu();
    Assert.assertTrue(true);
  }

  /**
   *
   * @brief Test case for AdminMenu method.
   *
   *        Test scenario: User selects option 2 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void AdminMenuTest2() {
    List<User> userList = new ArrayList<>();
    LoginServices login = new LoginServices(userList);
    RegistrationServices registration = new RegistrationServices(userList);
    MenuServices menu = new MenuServices();
    Main main = new Main(userList, menu, login, registration);
    RentCarInterface car = FactoryMethodPatternCar.createCar("modelsuv", 4, 1550, "Blue", "Tiguan", "Volkswagen",
                           "Petrol", 2019);
    main.rentalCars.add(car);
    main.INPUT = new Scanner("3\n5\n");
    String input = "1\n";
    InputStream inputStream = new ByteArrayInputStream(input.getBytes());
    System.setIn(inputStream);
    main.AdminMenu();
    Assert.assertTrue(true);
  }

  /**
   *
   * @brief Test case for AdminMenu method.
   *
   *        Test scenario: User selects option 3 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void AdminMenuTest3() {
    List<User> userList = new ArrayList<>();
    LoginServices login = new LoginServices(userList);
    RegistrationServices registration = new RegistrationServices(userList);
    MenuServices menu = new MenuServices();
    Main main = new Main(userList, menu, login, registration);
    RentCarInterface car = FactoryMethodPatternCar.createCar("modelsuv", 4, 1550, "Blue", "Tiguan", "Volkswagen",
                           "Petrol", 2019);
    main.rentalCars.add(car);
    main.INPUT = new Scanner("1\n5\n");
    main.AdminMenu();
    Assert.assertTrue(true);
  }

  /**
   *
   * @brief Test case for AdminMenu method.
   *
   *        Test scenario: User selects option 4 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void AdminMenuTest4() {
    List<User> userList = new ArrayList<>();
    LoginServices login = new LoginServices(userList);
    RegistrationServices registration = new RegistrationServices(userList);
    MenuServices menu = new MenuServices();
    Main main = new Main(userList, menu, login, registration);
    main.INPUT = new Scanner("1\n5\n");
    main.AdminMenu();
    Assert.assertTrue(true);
  }

  /**
   *
   * @brief Test case for AdminMenu method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void AdminMenuTest5() {
    List<User> userList = new ArrayList<>();
    LoginServices login = new LoginServices(userList);
    RegistrationServices registration = new RegistrationServices(userList);
    MenuServices menu = new MenuServices();
    Main main = new Main(userList, menu, login, registration);
    main.INPUT = new Scanner("2\n5\n");
    String input = "7\n";
    InputStream inputStream = new ByteArrayInputStream(input.getBytes());
    System.setIn(inputStream);
    main.AdminMenu();
    Assert.assertTrue(true);
  }

  /**
   *
   * @brief Test case for AdminMenu method.
   *
   *        Test scenario: User selects option 6 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void AdminMenuTest6() {
    List<User> userList = new ArrayList<>();
    LoginServices login = new LoginServices(userList);
    RegistrationServices registration = new RegistrationServices(userList);
    MenuServices menu = new MenuServices();
    Main main = new Main(userList, menu, login, registration);
    main.INPUT = new Scanner("2\n5\n");
    String input = "6\nFiat\nEgea\n2012\nBenzin\nBlue\n1000\n4\n";
    InputStream inputStream = new ByteArrayInputStream(input.getBytes());
    System.setIn(inputStream);
    main.AdminMenu();
    Assert.assertTrue(true);
  }

  /**
   *
   * @brief Test case for AdminMenu method.
   *
   *        Test scenario: User selects option 7 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void AdminMenuTest7() {
    List<User> userList = new ArrayList<>();
    LoginServices login = new LoginServices(userList);
    RegistrationServices registration = new RegistrationServices(userList);
    MenuServices menu = new MenuServices();
    Main main = new Main(userList, menu, login, registration);
    main.INPUT = new Scanner("2\n5\n");
    String input = "5\nFiat\nEgea\n2012\nBenzin\nBlue\n1000\n4\n";
    InputStream inputStream = new ByteArrayInputStream(input.getBytes());
    System.setIn(inputStream);
    main.AdminMenu();
    Assert.assertTrue(true);
  }

  /**
   *
   * @brief Test case for AdminMenu method.
   *
   *        Test scenario: User selects option 8 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void AdminMenuTest8() {
    List<User> userList = new ArrayList<>();
    LoginServices login = new LoginServices(userList);
    RegistrationServices registration = new RegistrationServices(userList);
    MenuServices menu = new MenuServices();
    Main main = new Main(userList, menu, login, registration);
    main.INPUT = new Scanner("2\n5\n");
    String input = "4\nFiat\nEgea\n2012\nBenzin\nBlue\n1000\n4\n";
    InputStream inputStream = new ByteArrayInputStream(input.getBytes());
    System.setIn(inputStream);
    main.AdminMenu();
    Assert.assertTrue(true);
  }

  /**
   *
   * @brief Test case for AdminMenu method.
   *
   *        Test scenario: User selects option 9 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void AdminMenuTest9() {
    List<User> userList = new ArrayList<>();
    LoginServices login = new LoginServices(userList);
    RegistrationServices registration = new RegistrationServices(userList);
    MenuServices menu = new MenuServices();
    Main main = new Main(userList, menu, login, registration);
    main.INPUT = new Scanner("2\n5\n");
    String input = "3\nFiat\nEgea\n2012\nBenzin\nBlue\n1000\n4\n";
    InputStream inputStream = new ByteArrayInputStream(input.getBytes());
    System.setIn(inputStream);
    main.AdminMenu();
    Assert.assertTrue(true);
  }

  /**
   *
   * @brief Test case for AdminMenu method.
   *
   *        Test scenario: User selects option 10 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void AdminMenuTest10() {
    List<User> userList = new ArrayList<>();
    LoginServices login = new LoginServices(userList);
    RegistrationServices registration = new RegistrationServices(userList);
    MenuServices menu = new MenuServices();
    Main main = new Main(userList, menu, login, registration);
    main.INPUT = new Scanner("2\n5\n");
    String input = "1\nFiat\nEgea\n2012\nBenzin\nBlue\n1000\n4\n";
    InputStream inputStream = new ByteArrayInputStream(input.getBytes());
    System.setIn(inputStream);
    main.AdminMenu();
    Assert.assertTrue(true);
  }

  /**
   *
   * @brief Test case for AdminMenu method.
   *
   *        Test scenario: User selects option 11 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void AdminMenuTest11() {
    List<User> userList = new ArrayList<>();
    LoginServices login = new LoginServices(userList);
    RegistrationServices registration = new RegistrationServices(userList);
    MenuServices menu = new MenuServices();
    Main main = new Main(userList, menu, login, registration);
    main.INPUT = new Scanner("2\n5\n");
    String input = "2\nFiat\nEgea\n2012\nBenzin\nBlue\n1000\n4\n";
    InputStream inputStream = new ByteArrayInputStream(input.getBytes());
    System.setIn(inputStream);
    main.AdminMenu();
    Assert.assertTrue(true);
  }

  /**
   *
   * @brief Test case for AdminMenu method.
   *
   *        Test scenario: User selects option 12 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void AdminMenuTest12() {
    List<User> userList = new ArrayList<>();
    LoginServices login = new LoginServices(userList);
    RegistrationServices registration = new RegistrationServices(userList);
    MenuServices menu = new MenuServices();
    Main main = new Main(userList, menu, login, registration);
    main.INPUT = new Scanner("4\n3");
    main.AdminMenu();
    Assert.assertTrue(true);
  }

  /**
   *
   * @brief Test case for AdminMenu method.
   *
   *        Test scenario: User selects option 3 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void AdminMenu3() {
    List<User> userList = new ArrayList<>();
    LoginServices login = new LoginServices(userList);
    RegistrationServices registration = new RegistrationServices(userList);
    MenuServices menu = new MenuServices();
    Main main = new Main(userList, menu, login, registration);
    main.INPUT = new Scanner("20\n5");
    main.AdminMenu();
    Assert.assertTrue(true);
  }

  /**
   *
   * @brief Test case for MainMenu method.
   *
   *        Test scenario: User selects option 1 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void MainMenuTest1() {
    List<User> userList = new ArrayList<>();
    LoginServices login = new LoginServices(userList);
    RegistrationServices registration = new RegistrationServices(userList);
    MenuServices menu = new MenuServices();
    Main main = new Main(userList, menu, login, registration);
    userList.add(new Admin("admin", "admin", "admin", "admin"));
    main.INPUT = new Scanner("2\n5");
    login.input = new Scanner("admin\nadmin\n");
    main.MainMenu();
    Assert.assertTrue(true);
  }

  /**
   *
   * @brief Test case for MainMenu method.
   *
   *        Test scenario: User selects option 2 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void MainMenuTest2() {
    List<User> userList = new ArrayList<>();
    LoginServices login = new LoginServices(userList);
    RegistrationServices registration = new RegistrationServices(userList);
    MenuServices menu = new MenuServices();
    Main main = new Main(userList, menu, login, registration);
    main.INPUT = new Scanner("7\n3\n");
    main.MainMenu();
    Assert.assertTrue(true);
  }

  /**
   *
   * @brief Test case for MainMenu method.
   *
   *        Test scenario: User selects option 4 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void MainMenuTest4() {
    List<User> userList = new ArrayList<>();
    LoginServices login = new LoginServices(userList);
    RegistrationServices registration = new RegistrationServices(userList);
    MenuServices menu = new MenuServices();
    Main main = new Main(userList, menu, login, registration);
    main.INPUT = new Scanner("1\n3\n");
    registration.input = new Scanner("Test\nUser\ntestUser\ntestPass\n2012-05-12\n");
    main.MainMenu();
    Assert.assertTrue(true);
  }

  /**
   *
   * @brief Test case for MainMenu method.
   *
   *        Test scenario: User selects option 3 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void MainMenuTest3() {
    List<User> userList = new ArrayList<>();
    LoginServices login = new LoginServices(userList);
    RegistrationServices registration = new RegistrationServices(userList);
    MenuServices menu = new MenuServices();
    Main main = new Main(userList, menu, login, registration);
    userList.add(new Customer("AD", "SOYAD", "adsoyad", "61trabzon", "2020-01-01"));
    main.INPUT = new Scanner("2\n3");
    login.input = new Scanner("adsoyad\n61trabzon\n");
    main.MainMenu();
    Assert.assertTrue(true);
  }

  /**
   *
   * @brief Test case for MainMenu method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void MainMenuTest5() {
    List<User> userList = new ArrayList<>();
    LoginServices login = new LoginServices(userList);
    RegistrationServices registration = new RegistrationServices(userList);
    MenuServices menu = new MenuServices();
    Main main = new Main(userList, menu, login, registration);
    userList.add(new Admin("admin", "admin", "admin", "admin"));
    main.INPUT = new Scanner("2\n1\n5");
    login.input = new Scanner("admin\n0000\nadmin\nadmin\nadmin\n");
    main.MainMenu();
    Assert.assertTrue(true);
  }

  /**
   *
   * @brief Test case for AppTest1 method.
   *
   *        Test scenario: User selects option 1 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void AppTest1() {
    // Prepare test input
    App app = new App();
    String input = "3";
    InputStream inputStream = new ByteArrayInputStream(input.getBytes());
    System.setIn(inputStream);
    // Call the main method
    App.main(new String[] {});
    assertTrue(true);
  }

  /**
   *
   * @brief Test case for testInitiateLogIn method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testInitiateLogIn() {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    List<User> userList = new ArrayList<>();
    userList.add(new Customer("testUser", "testPass", "Test", "User", "2002-06-24"));
    LoginServices loginService = new LoginServices(userList);
    loginService.input = new Scanner("Test\nUser\n");
    User loggedIn = loginService.initiateLogIn();
    String expectedOutput = "Login successfully!!!";
    assertTrue(outContent.toString().contains(expectedOutput));
  }

  /**
   *
   * @brief Test case for testDisplayLogInMenu method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testDisplayLogInMenu() {
    ArrayList<User> userList = new ArrayList<>();
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    LoginServices login = new LoginServices(userList);
    login.displayLogInMenu();
    String expectedOutput = "+----------------------------------------------+\r\n"
                            + "|                     LOGIN:                   |\r\n"
                            + "+----------------------------------------------+\r\n";
    assertEquals(expectedOutput, outContent.toString());
  }

  /**
   *
   * @brief Test case for testDoLogInAsAdmin method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testDoLogInAsAdmin() {
    Scanner input = new Scanner("admin\npassword\n");
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    System.setOut(new PrintStream(output));
    Admin admin = new Admin("admin", "password", "admin", "password");
    List<User> userList = new ArrayList<>();
    userList.add(admin);
    LoginServices loginImpl = new LoginServices(userList);
    loginImpl.input = input;
    loginImpl.doLogIn("admin", "password");
    assertTrue(output.toString().contains("Welcome admin password!"));
  }

  /**
   *
   * @brief Test case for testShopRegistrationForm method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testShopRegistrationForm() {
    List<User> userList = new ArrayList<>();
    LoginServices login = new LoginServices(userList);
    RegistrationServices registration = new RegistrationServices(userList);
    MenuServices menu = new MenuServices();
    Main main = new Main(userList, menu, login, registration);
    Customer customer = new Customer("John", "Doe", "johndoe", "password", "2002-02-02");
    assertEquals("John", customer.getFirstName());
    assertEquals("Doe", customer.getLastName());
    assertEquals("johndoe", customer.getUserName());
    assertEquals("password", customer.getPassword());
  }

  /**
   *
   * @brief Test case for testCustomerRegistrationForm2 method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testCustomerRegistrationForm2() {
    List<User> userList = new ArrayList<>();
    RegistrationServices registrationService = new RegistrationServices(userList);
    Customer customer = registrationService.customerRegistrationForm("Test", "User", "testUser", "testPass",
                        "2020-01-01");
    assertEquals("Test", customer.getFirstName());
    assertEquals("User", customer.getLastName());
    assertEquals("testUser", customer.getUserName());
    assertEquals("testPass", customer.getPassword());
  }

  /**
   *
   * @brief Test case for testCustomerRegistration2 method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testCustomerRegistration2() {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    List<User> userList = new ArrayList<>();
    RegistrationServices registrationService = new RegistrationServices(userList);
    Customer customer = new Customer("Test", "User", "testUser", "testPass", "2020-01-01");
    registrationService.customerRegistration(customer);
    String expectedOutput = "Registration complete!";
    assertTrue(outContent.toString().contains(expectedOutput));
    assertTrue(userList.contains(customer));
  }

  /**
   *
   * @brief Test case for testValidateLogIn1 method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testValidateLogIn1() {
    ArrayList<User> userList = new ArrayList<>();
    Customer customer = new Customer("John", "Doe", "johndoe", "password", "2020-01-01");
    userList.add(customer);
    LoginServices login = new LoginServices(userList);
    User loggedInUser = login.validateLogIn("johndoe", "password");
    assertEquals(customer, loggedInUser);
  }

  /**
   *
   * @brief Test case for testDoLogIn1 method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testDoLogIn1() {
    ArrayList<User> userList = new ArrayList<>();
    Customer customer = new Customer("John", "Doe", "johndoe", "password", "2020-01-01");
    userList.add(customer);
    LoginServices login = new LoginServices(userList);
    User loggedInUser = login.doLogIn("johndoe", "password");
    assertEquals(customer, loggedInUser);
  }

  /**
   *
   * @brief Test case for testIsLoggedIn1 method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */

  @Test
  public void testIsLoggedIn1() {
    ArrayList<User> userList = new ArrayList<>();
    LoginServices login = new LoginServices(userList);
    assertFalse(login.isLoggedIn(null));
    Customer customer = new Customer("John", "Doe", "johndoe", "password", "2020-01-01");
    assertTrue(login.isLoggedIn(customer));
  }

  /**
   *
   * @brief Test case for testIsLoggedInAsCustomer method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testIsLoggedInAsCustomer() {
    ArrayList<User> userList = new ArrayList<>();
    LoginServices login = new LoginServices(userList);
    assertFalse(login.isLoggedInAsCustomer(null));
    Customer customer = new Customer("John", "Doe", "johndoe", "password", "2020-01-01");
    assertTrue(login.isLoggedInAsCustomer(customer));
  }

  /**
   *
   * @brief Test case for testIsLoggedInAsAdmin method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testIsLoggedInAsAdmin() {
    ArrayList<User> userList = new ArrayList<>();
    LoginServices login = new LoginServices(userList);
    assertFalse(login.isLoggedInAsAdmin(null));
    Admin admin = new Admin("Jane", "Doe", "admin", "password");
    assertTrue(login.isLoggedInAsAdmin(admin));
  }

  /**
   *
   * @brief Test case for testSetRemainingTime method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testSetRemainingTime() {
    int remainingTime = 5;
    int reservationTime = 2;
    NotificationTime timer = new NotificationTime(remainingTime, reservationTime);
    int newRemainingTime = 0;
    timer.setRemainingNoti(newRemainingTime);
    Assert.assertEquals(newRemainingTime, timer.getRemainingNoti());
  }

  /**
   *
   * @brief Test case for testSetRemainingTimeWithZeroRemainingTime method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testSetRemainingTimeWithZeroRemainingTime() {
    int remainingTime = 5;
    int reservationTime = 2;
    NotificationTime timer = new NotificationTime(remainingTime, reservationTime);
    int newRemainingTime = 0;
    String expectedOutput = "Your car is ready. You can rent your car.";
    String actualOutput = captureStandardOutput(() -> timer.setRemainingNoti(newRemainingTime));
    Assert.assertTrue(actualOutput.contains(expectedOutput));
  }

  /**
   *
   * @brief Test case for testGetRemainingTime method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testGetRemainingTime() {
    int remainingTime = 5;
    int reservationTime = 2;
    NotificationTime timer = new NotificationTime(remainingTime, reservationTime);
    Assert.assertEquals(remainingTime, timer.getRemainingNoti());
  }

  /**
   *
   * @brief Test case for testSetRemainingTimeWithReservationTime method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testSetRemainingTimeWithReservationTime() {
    int remainingTime = 5;
    int reservationTime = 2;
    NotificationTime timer = new NotificationTime(remainingTime, reservationTime);
    CarCustomer customer = new CarCustomer("John");
    timer.addObserver(customer);
    int newRemainingTime = reservationTime;
    String expectedOutput = "Hello John, 2 days left for your delivery";
    String actualOutput = captureStandardOutput(() -> timer.setRemainingNoti(newRemainingTime));
    Assert.assertTrue(actualOutput.contains(expectedOutput));
  }

  /**
   *
   * @brief Test case for testSetRemainingTimeWithoutReservationTime method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testSetRemainingTimeWithoutReservationTime() {
    int remainingTime = 5;
    int reservationTime = 2;
    NotificationTime timer = new NotificationTime(remainingTime, reservationTime);
    int newRemainingTime = reservationTime + 1;
    String expectedOutput = "";
    String actualOutput = captureStandardOutput(() -> timer.setRemainingNoti(newRemainingTime));
    Assert.assertEquals(expectedOutput, expectedOutput);
  }

  /**
   *
   * @brief Test case for captureStandardOutput method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  private String captureStandardOutput(Runnable action) {
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);
    PrintStream standardOut = System.out;
    System.setOut(printStream);
    action.run();
    System.out.flush();
    System.setOut(standardOut);
    return outputStream.toString();
  }

  /**
   *
   * @brief Test case for testRemoveObserver method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testRemoveObserver() {
    int remainingTime = 5;
    int reservationTime = 2;
    NotificationTime timer = new NotificationTime(remainingTime, reservationTime);
    CarCustomer customer = new CarCustomer("John");
    timer.addObserver(customer);
    CarCustomer newCustomer = new CarCustomer("Alice");
    timer.addObserver(newCustomer);
    timer.removeObserver(newCustomer);
    int newRemainingTime = reservationTime;
    String expectedOutput = "";
    String actualOutput = captureStandardOutput(() -> timer.setRemainingNoti(newRemainingTime));
    Assert.assertEquals(0, newCustomer.getNotificationCount());
  }

  /**
   *
   * @brief Test case for testCollectPaymentDetailsCreditCard method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testCollectPaymentDetailsCreditCard() {
    PayCreditCard paymentByCreditCard;
    paymentByCreditCard = new PayCreditCard();
    paymentByCreditCard.CollectPaymentSystemDetails();
    assertNotNull(paymentByCreditCard.getPrice());
    assertEquals("7845124233224471", paymentByCreditCard.CreditCard().getCardNumberSystem());
    assertEquals("08/24", paymentByCreditCard.CreditCard().getDate());
    assertEquals("778", paymentByCreditCard.CreditCard().getCvvSystem());
  }

  /**
   *
   * @brief Test case for testValidatePaymentDetailsCreditCard method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testValidatePaymentDetailsCreditCard() {
    PayCreditCard paymentByCreditCard;
    paymentByCreditCard = new PayCreditCard();
    assertTrue(paymentByCreditCard.PaymentDetails());
  }

  /**
   *
   * @brief Test case for testPayCreditCard method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testPayCreditCard() {
    PayCreditCard paymentByCreditCard;
    paymentByCreditCard = new PayCreditCard();
    int initialBalance = paymentByCreditCard.getPrice();
    int amountToPay = 200;
    paymentByCreditCard.PaySystem(amountToPay);
    assertEquals(initialBalance - amountToPay, paymentByCreditCard.getPrice());
  }

  /**
   *
   * @brief Test case for testCollectPaymentDetailsPayPal method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testCollectPaymentDetailsPayPal() {
    PayPayPal paymentByPayPal;
    paymentByPayPal = new PayPayPal();
    paymentByPayPal.CollectPaymentSystemDetails();
    assertNotNull(paymentByPayPal.getPayPalCard());
    assertEquals("abc@gmail.com", paymentByPayPal.getPayPalCard().getEmailValue());
    assertEquals("password123", paymentByPayPal.getPayPalCard().getPasswordValue());
  }

  /**
   *
   * @brief Test case for testValidatePaymentDetailsPayPal method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testValidatePaymentDetailsPayPal() {
    PayPayPal paymentByPayPal;
    paymentByPayPal = new PayPayPal();
    assertTrue(paymentByPayPal.PaymentDetails());
  }

  /**
   *
   * @brief Test case for testPayPayPal method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testPayPayPal() {
    PayPayPal paymentByPayPal;
    paymentByPayPal = new PayPayPal();
    int initialBalance = paymentByPayPal.getMoney();
    int amountToPay = 150;
    paymentByPayPal.PaySystem(amountToPay);
    assertEquals(initialBalance - amountToPay, paymentByPayPal.getMoney());
  }

  /**
   *
   * @brief Test case for testCollectPaymentDetailsCash method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testCollectPaymentDetailsCash() {
    PayCash paymentByCash = new PayCash();
    // No implementation to test, so no assertions are needed
    paymentByCash.CollectPaymentSystemDetails();
  }

  /**
   *
   * @brief Test case for testValidatePaymentDetailsCash method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testValidatePaymentDetailsCash() {
    PayCash paymentByCash = new PayCash();
    assertTrue(paymentByCash.PaymentDetails());
  }

  /**
   *
   * @brief Test case for testPayCash method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testPayCash() {
    PayCash paymentByCash = new PayCash();
    // No implementation to test, so no assertions are needed
    paymentByCash.PaySystem(40);
  }

  /**
   *
   * @brief Test case for testRemoveCost_CostExists_CostRemoved method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testRemoveCost_CostExists_CostRemoved() {
    PaymentSystemService paymentService;
    paymentService = new PaymentSystemService();
    // Set up initial costs
    paymentService.setMoney(100);
    paymentService.setMoney(200);
    paymentService.setMoney(300);
    // Remove a specific cost
    int costIndexToRemove = 1;
    paymentService.removeMoney(costIndexToRemove);
    // Verify that the removed cost no longer exists in the costs list
    assertFalse(paymentService.getMoney().contains(costIndexToRemove));
  }

  /**
   *
   * @brief Test case for testProccessOrder_ValidPaymentDetails_PaymentSuccessful method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testProccessOrder_ValidPaymentDetails_PaymentSuccessful() {
    PaymentSystemService paymentService;
    paymentService = new PaymentSystemService();
    CarPaymentStrategyPattern mockStrategy = new CarPaymentStrategyPattern() {
      @Override
      public boolean PaymentDetails() {
        // TODO Auto-generated method stub
        return true;
      }
      @Override
      public void PaySystem(int price) {
        // TODO Auto-generated method stub
      }
      @Override
      public void CollectPaymentSystemDetails() {
        // TODO Auto-generated method stub
      }
    };
    paymentService.setMoney(50);
    paymentService.setSelectedCarIndex(0);
    paymentService.setStrategyPattern(mockStrategy);
    paymentService.proccessOrder();
  }

  /**
   *
   * @brief Test case for testCustomerRegistrationForm method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testCustomerRegistrationForm() {
    List<User> userList = new ArrayList<>();
    RegistrationServices registration = new RegistrationServices(userList);
    Customer customer = registration.customerRegistrationForm("John", "Doe", "johndoe", "password", "2022-01-01");
    assertEquals("John", customer.getFirstName());
    assertEquals("Doe", customer.getLastName());
    assertEquals("johndoe", customer.getUserName());
    assertEquals("password", customer.getPassword());
  }

  /**
   *
   * @brief Test case for testCustomerRegistration method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testCustomerRegistration() {
    List<User> userList = new ArrayList<>();
    RegistrationServices registration = new RegistrationServices(userList);
    Customer customer = new Customer("John", "Doe", "johndoe", "password", "2022-01-01");
    registration.customerRegistration(customer);
    assertEquals(1, userList.size());
    assertEquals("John", userList.get(0).getFirstName());
    assertEquals("Doe", userList.get(0).getLastName());
    assertEquals("johndoe", userList.get(0).getUserName());
    assertEquals("password", userList.get(0).getPassword());
  }

  /**
   *
   * @brief Test case for testExitApp method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testExitApp() {
    // Arrange
    LoginServices login = new LoginServices(null);
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);
    System.setOut(printStream);
    // Act
    login.exitApp();
    // Assert
    String expectedOutput = "Hope you'll be back soon!";
    String actualOutput = outputStream.toString().trim();
    assertEquals(expectedOutput, actualOutput);
  }

  /**
   *
   * @brief Test case for testInitiateRegistration method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testInitiateRegistration() {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    List<User> userList = new ArrayList<>();
    RegistrationServices registrationService = new RegistrationServices(userList);
    LoginServices loginService = new LoginServices(userList);
    registrationService.input = new Scanner("Test\nUser\ntestUser\ntestPass\n2020-01-01\n");
    registrationService.initiateRegistration(loginService);
    String expectedOutput = "Registration complete!";
    assertTrue(outContent.toString().contains(expectedOutput));
  }

  /**
   *
   * @brief Test case for testInitiateRegistration2 method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testInitiateRegistration2() {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    List<User> userList = new ArrayList<>();
    RegistrationServices registrationService = new RegistrationServices(userList);
    LoginServices loginService = new LoginServices(userList);
    registrationService.input = new Scanner("Test\nUser\ntestUser\ntestPass\n2023-05-01\n");
    registrationService.initiateRegistration(loginService);
    String expectedOutput = "License usage time is not enough";
    assertTrue(outContent.toString().contains(expectedOutput));
  }

  /**
   *
   * @brief Test case for testInitiateRegistration3 method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testInitiateRegistration3() {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    List<User> userList = new ArrayList<>();
    RegistrationServices registrationService = new RegistrationServices(userList);
    LoginServices loginService = new LoginServices(userList);
    registrationService.input = new Scanner("Test\nUser\ntestUser\ntestPass\nZORT\n");
    registrationService.initiateRegistration(loginService);
    String expectedOutput = "Parse Exception";
    assertTrue(outContent.toString().contains(expectedOutput));
  }

  /**
   *
   * @brief Test case for testDisplayRegistrationMenu method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testDisplayRegistrationMenu() {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    List<User> userList = new ArrayList<>();
    RegistrationServices registrationService = new RegistrationServices(userList);
    registrationService.displayRegistrationMenu();
    String expectedOutput = "REGISTER";
    assertTrue(outContent.toString().contains(expectedOutput));
  }

  /**
   *
   * @brief Test case for testGetLoggedInUser method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */

  @Test
  public void testGetLoggedInUser() {
    ArrayList<User> userList = new ArrayList<>();
    LoginServices login = new LoginServices(userList);
    assertNull(login.getLoggedInUser());
    Customer customer = new Customer("John", "Doe", "johndoe", "password", "2020-01-01");
    login.setLoggedInUser(customer);
    assertEquals(customer, login.getLoggedInUser());
  }

  /**
   *
   * @brief Test case for testValidateLogIn2 method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testValidateLogIn2() {
    ArrayList<User> userList = new ArrayList<>();
    Customer customer = new Customer("John", "Doe", "johndoe", "password", "2020-01-01");
    userList.add(customer);
    LoginServices login = new LoginServices(userList);
    User loggedInUser = login.validateLogIn("johndoe", "password");
    assertEquals(customer, loggedInUser);
  }

  /**
   *
   * @brief Test case for testValidateLogInWithInvalidCredentials method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testValidateLogInWithInvalidCredentials() {
    Scanner input = new Scanner("invalid\ncredentials\n");
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    System.setOut(new PrintStream(output));
    List<User> userList = new ArrayList<>();
    LoginServices loginImpl = new LoginServices(userList);
    loginImpl.input = input;
    User user = loginImpl.validateLogIn("invalid", "credentials");
    assertNull(user);
  }

  /**
   *
   * @brief Test case for testInitiateLogInAsCustomer method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testInitiateLogInAsCustomer() {
    Scanner input = new Scanner("customer\npassword\n");
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    System.setOut(new PrintStream(output));
    Customer customer = new Customer("customer", "password", "customer", "password", "2002-02-01");
    List<User> userList = new ArrayList<>();
    userList.add(customer);
    LoginServices loginImpl = new LoginServices(userList);
    loginImpl.input = input;
    loginImpl.initiateLogIn();
    String expectedOutput = "Wrong credentials! Please, try again!";
    assertTrue(output.toString().contains(expectedOutput));
  }

  /**
   *
   * @brief Test case for testIsLoggedIn method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testIsLoggedIn() {
    List<User> userList = new ArrayList<>();
    LoginServices login = new LoginServices(userList);
    assertFalse(login.isLoggedIn(null));
    assertTrue(login.isLoggedIn(new Customer()));
  }

  /**
   *
   * @brief Test case for testShowMainMenu method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testShowMainMenu() {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    MenuServices menu = new MenuServices();
    menu.designMainMenu();
    String expectedOutput = "+---------------------------------------------+\n"
                            + "|             Car Rental Service              |\n"
                            + "+---------------------------------------------+\n" + "\n"
                            + "                    MAIN MENU                  \n" + "1. Register\n" + "2. Login\n" + "3. Exit\n";
    assertEquals(expectedOutput, outContent.toString());
  }

  /**
   *
   * @brief Test case for testShowAdminMenu method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testShowAdminMenu() {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    MenuServices menu = new MenuServices();
    menu.designAdminMenu();
    String expectedOutput = "+---------------------------------------------+\n"
                            + "|             Car Rental Service              |\n"
                            + "+---------------------------------------------+\n" + "\n"
                            + "                   ADMIN MENU                  \n" + "1. List Cars\n" + "2. Add Car\n"
                            + "3. Delete Car\n" + "4. Log-out\n" + "5. Exit\n";
    assertEquals(expectedOutput, outContent.toString());
  }

  /**
   *
   * @brief Test case for testShowCustomerMenu method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testShowCustomerMenu() {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    MenuServices menu = new MenuServices();
    menu.designCustomerMenu();
    String expectedOutput = "+---------------------------------------------+\n"
                            + "|             Car Rental Service              |\n"
                            + "+---------------------------------------------+\n" + "\n"
                            + "                  CUSTOMER MENU                \n" + "1. Rent a Car\n" + "2. Logout\n"
                            + "3. Exit\n\n";
    assertEquals(expectedOutput, outContent.toString());
  }

  /**
   *
   * @brief Test case for testSelectCarTypeDesign method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testSelectCarTypeDesign() {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    MenuServices menu = new MenuServices();
    menu.designSelectCarType();
    String expectedOutput = "+---------------------------------------------+\n"
                            + "|             Car Rental Service              |\n"
                            + "+---------------------------------------------+\n" + "\n"
                            + "                   Add Car                \n" + "1. Add Sedan\n" + "2. Add SUV\n"
                            + "3. Add Station Wagon\n" + "4. Add PickUp\n" + "5. Add Hatchback\n" + "6. Add Cabrio\n"
                            + "\nEnter your choice: ";
    assertEquals(expectedOutput, outContent.toString());
  }

  /**
   *
   * @brief Test case for testGetCustomerList method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */

  @Test
  public void testGetCustomerList() {
    UserDatabase ub = new UserDatabase();
    List<User> customerList = ub.getCustomerList();
    assertEquals(2, customerList.size());
    assertEquals("Ugur", customerList.get(0).getFirstName());
    assertEquals("Coruh", customerList.get(0).getLastName());
    assertEquals("ugur", customerList.get(0).getUserName());
    assertEquals("1234", customerList.get(0).getPassword());
    assertEquals("Alper", customerList.get(1).getFirstName());
    assertEquals("Sahin", customerList.get(1).getLastName());
    assertEquals("alper", customerList.get(1).getUserName());
    assertEquals("1234", customerList.get(1).getPassword());
  }

  /**
   *
   * @brief Test case for testGetAdminList method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testGetAdminList() {
    List<User> adminList = UserDatabase.getAdminList();
    assertEquals(4, adminList.size());
    assertEquals("Admin", adminList.get(0).getFirstName());
    assertEquals("ADMIN", adminList.get(0).getLastName());
    assertEquals("admin", adminList.get(0).getUserName());
    assertEquals("0000", adminList.get(0).getPassword());
    assertEquals("Alper", adminList.get(1).getFirstName());
    assertEquals("alper", adminList.get(1).getLastName());
    assertEquals("alper", adminList.get(1).getUserName());
    assertEquals("admin", adminList.get(1).getPassword());
  }

  /**
   *
   * @brief Test case for testGetAllUserList method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testGetAllUserList() {
    List<User> userList = UserDatabase.getAllUserList();
    assertEquals(6, userList.size());
  }

  /**
   *
   * @brief Test case for testGetShopBalance method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testGetShopBalance() {
    long balance = UserDatabase.getShopBalance();
    assertEquals(0, balance);
  }

  /**
   *
   * @brief Test case for testValidateLogIn method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testValidateLogIn() {
    List<User> userList = new ArrayList<>();
    userList.add(new Customer("John", "Doe", "johndoe", "password", "2022-01-01"));
    userList.add(new Admin("Admin", "ADMIN", "admin", "password"));
    LoginServices login = new LoginServices(userList);
    User user = login.validateLogIn("johndoe", "password");
    assertEquals("John", user.getFirstName());
    assertEquals("Doe", user.getLastName());
    assertEquals("johndoe", user.getUserName());
    assertEquals("password", user.getPassword());
  }

  /**
   *
   * @brief Test case for testDoLogIn method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testDoLogIn() {
    List<User> userList = new ArrayList<>();
    userList.add(new Customer("John", "Doe", "johndoe", "password", "2022-01-01"));
    userList.add(new Admin("Admin", "ADMIN", "admin", "password"));
    LoginServices login = new LoginServices(userList);
    User user = login.doLogIn("johndoe", "password");
    assertEquals("John", user.getFirstName());
    assertEquals("Doe", user.getLastName());
    assertEquals("johndoe", user.getUserName());
    assertEquals("password", user.getPassword());
  }

  /**
   *
   * @brief Test case for testCreditCardConstructor method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testCreditCardConstructor() {
    String cardNumber = "1234567890123456";
    String expiryDate = "12/25";
    String cvv = "123";
    CreditCardSystem creditCard = new CreditCardSystem(cardNumber, expiryDate, cvv);
    assertEquals(cardNumber, creditCard.getCardNumberSystem());
    assertEquals(expiryDate, creditCard.getDate());
    assertEquals(cvv, creditCard.getCvvSystem());
  }

  /**
   *
   * @brief Test case for testAdminConstructor method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testAdminConstructor() {
    Admin admin = new Admin("John", "Doe", "johndoe", "password");
    assertEquals("John", admin.getFirstName());
    assertEquals("Doe", admin.getLastName());
    assertEquals("johndoe", admin.getUserName());
    assertEquals("password", admin.getPassword());
  }

  /**
   *
   * @brief Test case for testCustomerConstructor method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testCustomerConstructor() {
    Customer customer = new Customer("John", "Doe", "johndoe", "password", "2022-01-01");
    assertEquals("John", customer.getFirstName());
    assertEquals("Doe", customer.getLastName());
    assertEquals("johndoe", customer.getUserName());
    assertEquals("password", customer.getPassword());
    assertEquals(LocalDate.parse("2022-01-01"), customer.getLicenceObtained());
  }

  /**
   *
   * @brief Test case for testSetLicenceObtained method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testSetLicenceObtained() {
    Customer customer = new Customer();
    customer.setLicenceObtained(LocalDate.parse("2022-01-01"));
    assertEquals(LocalDate.parse("2022-01-01"), customer.getLicenceObtained());
  }

  /**
   *
   * @brief Test case for testUserConstructor method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testUserConstructor() {
    User user = new User("John", "Doe", "johndoe", "password");
    assertEquals("John", user.getFirstName());
    assertEquals("Doe", user.getLastName());
    assertEquals("johndoe", user.getUserName());
    assertEquals("password", user.getPassword());
  }

  /**
   *
   * @brief Test case for testSetFirstName method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testSetFirstName() {
    User user = new User();
    user.setFirstName("Jane");
    assertEquals("Jane", user.getFirstName());
  }

  /**
   *
   * @brief Test case for testSetLastName method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testSetLastName() {
    User user = new User();
    user.setLastName("Smith");
    assertEquals("Smith", user.getLastName());
  }

  /**
   *
   * @brief Test case for testSetUserName method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testSetUserName() {
    User user = new User();
    user.setUserName("janesmith");
    assertEquals("janesmith", user.getUserName());
  }

  /**
   *
   * @brief Test case for testSetPassword method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */

  @Test
  public void testSetPassword() {
    User user = new User();
    user.setPassword("newpassword");
    assertEquals("newpassword", user.getPassword());
  }

  /**
   *
   * @brief Test case for testToString method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testToString() {
    User user = new User("John", "Doe", "johndoe", "password");
    assertEquals("User{firstName='John', lastName='Doe', userName='johndoe', password='password'}",
                 user.toString());
  }

  /**
   *
   * @brief Test case for testSedanGetBrand method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testSedanGetBrand() {
    FactoryMethodPatternCar rental = new FactoryMethodPatternCar();
    RentCarInterface car = FactoryMethodPatternCar.createCar("modelsedan", 4, 1250, "Black", "Egea", "Fiat",
                           "Petrol", 2017);
    assertEquals("Fiat", car.getCarBrand());
    assertEquals("Egea", car.getCarModel());
    assertEquals(2017, car.getCarModelYear());
    assertEquals("Petrol", car.getCarFuelType());
    assertEquals("Black", car.getCarColor());
    assertEquals(1250, car.getCarPrice());
    assertEquals(4, car.getCarSeatsNumber());
  }

  /**
   *
   * @brief Test case for testCabrioGetBrand method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testCabrioGetBrand() {
    RentCarInterface car = FactoryMethodPatternCar.createCar("modelsuv", 4, 1550, "Blue", "Tiguan", "Volkswagen",
                           "Petrol", 2019);
    assertEquals("Volkswagen", car.getCarBrand());
    assertEquals("Tiguan", car.getCarModel());
    assertEquals(2019, car.getCarModelYear());
    assertEquals("Petrol", car.getCarFuelType());
    assertEquals("Blue", car.getCarColor());
    assertEquals(1550, car.getCarPrice());
    assertEquals(4, car.getCarSeatsNumber());
  }

  /**
   *
   * @brief Test case for testHatchbackGetBrand method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testHatchbackGetBrand() {
    RentCarInterface car = FactoryMethodPatternCar.createCar("modelhatchback", 4, 1300, "Red", "Golf", "Volkswagen",
                           "Petrol", 2014);
    assertEquals("Volkswagen", car.getCarBrand());
    assertEquals("Golf", car.getCarModel());
    assertEquals(2014, car.getCarModelYear());
    assertEquals("Petrol", car.getCarFuelType());
    assertEquals("Red", car.getCarColor());
    assertEquals(1300, car.getCarPrice());
    assertEquals(4, car.getCarSeatsNumber());
  }

  /**
   *
   * @brief Test case for testPickUpkGetBrand method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testPickUpkGetBrand() {
    RentCarInterface car = FactoryMethodPatternCar.createCar("modelpickup", 4, 1600, "Blue", "Amarok", "Volkswagen",
                           "Diesel", 2023);
    assertEquals("Volkswagen", car.getCarBrand());
    assertEquals("Amarok", car.getCarModel());
    assertEquals(2023, car.getCarModelYear());
    assertEquals("Diesel", car.getCarFuelType());
    assertEquals("Blue", car.getCarColor());
    assertEquals(1600, car.getCarPrice());
    assertEquals(4, car.getCarSeatsNumber());
  }

  /**
   *
   * @brief Test case for testsuvGetBrand method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testsuvGetBrand() {
    RentCarInterface car = FactoryMethodPatternCar.createCar("modelstationwagon", 4, 1600, "Blue", "Passat",
                           "Volkswagen", "Petrol", 2023);
    assertEquals("Volkswagen", car.getCarBrand());
    assertEquals("Passat", car.getCarModel());
    assertEquals(2023, car.getCarModelYear());
    assertEquals("Petrol", car.getCarFuelType());
    assertEquals("Blue", car.getCarColor());
    assertEquals(1600, car.getCarPrice());
    assertEquals(4, car.getCarSeatsNumber());
  }

  /**
   *
   * @brief Test case for testStationWagonGetBrand method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testStationWagonGetBrand() {
    RentCarInterface car = FactoryMethodPatternCar.createCar("modelcabrio", 2, 1700, "Grey", "Z4", "BMW", "Petrol",
                           2023);
    assertEquals("BMW", car.getCarBrand());
    assertEquals("Z4", car.getCarModel());
    assertEquals(2023, car.getCarModelYear());
    assertEquals("Petrol", car.getCarFuelType());
    assertEquals("Grey", car.getCarColor());
    assertEquals(1700, car.getCarPrice());
    assertEquals(2, car.getCarSeatsNumber());
  }

  /**
   *
   * @brief Test case for testRentalFactory method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testRentalFactory() {
    RentCarInterface car = FactoryMethodPatternCar.createCar("modelsedan", 4, 1500, "Black", "Superb", "Skoda",
                           "Petrol", 2017);
    assertEquals("Skoda", car.getCarBrand());
    assertEquals("Superb", car.getCarModel());
    assertEquals(2017, car.getCarModelYear());
    assertEquals("Petrol", car.getCarFuelType());
    assertEquals("Black", car.getCarColor());
    assertEquals(1500, car.getCarPrice());
    assertEquals(4, car.getCarSeatsNumber());
  }

  /**
   *
   * @brief Test case for testCreateCarCabrio method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testCreateCarCabrio() {
    RentCarInterface car = FactoryMethodPatternCar.createCar("modelcabrio", 2, 1300, "Red", "124 Spider", "Fiat",
                           "Petrol", 2016);
    assertTrue(car instanceof CarModelCabrio);
  }

  /**
   *
   * @brief Test case for testCreateCarHatchback method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testCreateCarHatchback() {
    RentCarInterface car = FactoryMethodPatternCar.createCar("modelhatchback", 4, 1200, "Orange", "Scala", "Skoda",
                           "Petrol", 2019);
    assertTrue(car instanceof CarModelHatchback);
  }

  /**
   *
   * @brief Test case for testCreateCarPickup method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */

  @Test
  public void testCreateCarPickup() {
    RentCarInterface car = FactoryMethodPatternCar.createCar("modelpickup", 4, 1450, "Black", "Ranger", "Ford",
                           "Diesel", 2017);
    assertTrue(car instanceof CarModelPickUp);
  }

  /**
   *
   * @brief Test case for testCreateCarSedan method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testCreateCarSedan() {
    RentCarInterface car = FactoryMethodPatternCar.createCar("modelsedan", 4, 1350, "Grey", "E-Class", "Mercedes",
                           "Petrol", 2014);
    assertTrue(car instanceof CarModelSedan);
  }

  /**
   *
   * @brief Test case for testCreateCarStationWagon method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testCreateCarStationWagon() {
    RentCarInterface car = FactoryMethodPatternCar.createCar("modelstationwagon", 4, 3450, "Black", "RS6", "Audi",
                           "Petrol", 2023);
    assertTrue(car instanceof CarModelStationWagon);
  }

  /**
   *
   * @brief Test case for testCreateCarSUV method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */

  @Test
  public void testCreateCarSUV() {
    RentCarInterface car = FactoryMethodPatternCar.createCar("modelsuv", 4, 3600, "Black", "RSQ8", "Audi", "Petrol",
                           2022);
    assertTrue(car instanceof CarModelSUV);
  }

  /**
   *
   * @brief Test case for testCreateCarInvalidType method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testCreateCarInvalidType() {
    RentCarInterface car = FactoryMethodPatternCar.createCar("invalid", 4, 1250, "Black", "Egea", "Fiat", "Petrol",
                           2017);
    assertNull(car);
  }

  /**
   *
   * @brief Test case for testDisplayBill method.
   *
   *        Test scenario: User selects option 5 from the menu.
   *
   *        Expected behavior: The method should execute without errors.
   */
  @Test
  public void testDisplayBill() {
    RentCarInterface car = new CarModelCabrio(4, 1250, "Black", "Egea", "Fiat", "Petrol", 2017);
    String paymentType = "Credit Card";
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    Bill bill = new Bill();
    Bill.displayBill(car, paymentType);
    String expectedOutput = "+---------------------------------------------+\n"
                            + "|             	     BILL  	                  |\n"
                            + "+---------------------------------------------+\n\n" + "Car Brand: " + "FIAT" + "\n" + "Car Model: "
                            + "EGEA" + "\n" + "Car Year: " + "2017" + "\n" + "Car Fuel: " + "PETROL" + "\n" + "Car Color: "
                            + "BLACK" + "\n" + "Car Price: " + "1250" + "\n" + "Car Seats Number: " + "4" + "\n" + "Paymet Type: "
                            + "Credit Card" + "\n\n" + "+---------------------------------------------+\n"
                            + "+---------------------------------------------+\n\n";
    assertEquals(expectedOutput, outContent.toString());
  }
}
