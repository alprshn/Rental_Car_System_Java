/**
 * @file Main.java
 * @brief Contains the implementation of the Main class.
 */
package ce204_hw4_app;


import ce204_hw4_library.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * @class Main
 * @brief Represents the main application class.
 *
 * This class contains the main logic of the application and handles the different menus and user interactions.
 */
public class Main {

  public List<RentCarInterface> rentalCars = new ArrayList<>();
  public Scanner INPUT = new Scanner(System.in);
  PaymentSystemService paymentSystemService = new PaymentSystemService();
  PayPayPal payPayPal = new PayPayPal();
  PayCreditCard payCreditCard = new PayCreditCard();
  PayCash payCash = new PayCash();

  private final MenuServices MENU_DISPLAY_SERVICES;

  private LoginServices loginServices;
  private RegistrationServices registrationServices;
  /**
     * @brief Constructs a new Main object.
     *
     * @param userList The list of users in the application.
     * @param MENU_DISPLAY_SERVICES The menu display services.
     * @param loginServices The login services.
     * @param registrationServices The registration services.
     */
  public Main(List<User> userList, MenuServices MENU_DISPLAY_SERVICES, LoginServices loginServices,
              RegistrationServices registrationServices) {
    this.MENU_DISPLAY_SERVICES = MENU_DISPLAY_SERVICES;
    this.loginServices = loginServices;
    this.registrationServices = registrationServices;
  }
  /**
    * @brief Displays the admin menu and handles admin options.
    */
  public void AdminMenu() {
    Scanner scanner = new Scanner(System.in);

    do {
      System.out.println();
      MENU_DISPLAY_SERVICES.designAdminMenu();
      System.out.println("Please, choose your option from down below: ");
      int option = INPUT.nextInt();

      switch (option) {
        case 1: // List Car
          System.out.println("\nRental Cars:\n");
          int i = 0;

          if (rentalCars.isEmpty()) {
            System.out.println("No cars available.");
          } else {
            System.out.println(
              "+------Brand---------Model-------Car Year-----Fuel Type----Color----Price---Number of Seats-------+\n");

            for (RentCarInterface rentalCar : rentalCars) {
              i++;
              System.out.print(i + ". =>   ");
              displayCar(rentalCar);
            }
          }

          break;

        case 2: // Add Car
          MENU_DISPLAY_SERVICES.designSelectCarType();
          String carType = "";
          int selectCarType = Integer.parseInt(scanner.nextLine());

          switch (selectCarType) {
            case 1: {
              carType = "modelsedan";
              break;
            }

            case 2: {
              carType = "modelsuv";
              break;
            }

            case 3: {
              carType = "modelstationwagon";
              break;
            }

            case 4: {
              carType = "modelpickup";
              break;
            }

            case 5: {
              carType = "modelhatchback";
              break;
            }

            case 6: {
              carType = "modelcabrio";
              break;
            }

            default:
              System.out.println("Invalid choose only betwen displayed options!");
              return;
          }

          System.out.print("Enter Brand: ");
          String getBrand = scanner.nextLine();
          System.out.print("Enter Model: ");
          String getModel = scanner.nextLine();
          System.out.print("Enter Car Year: ");
          int getCarYear = Integer.parseInt(scanner.nextLine());
          System.out.print("Enter Fuel Type: ");
          String getFuelType = scanner.nextLine();
          System.out.print("Enter Color: ");
          String getColor = scanner.nextLine();
          System.out.print("Enter Price: ");
          int getPrice = Integer.parseInt(scanner.nextLine());
          System.out.print("Enter Number of Seats: ");
          int getSeatsNumber = Integer.parseInt(scanner.nextLine());
          RentCarInterface car = FactoryMethodPatternCar.createCar(carType, getSeatsNumber, getPrice, getColor,
                                 getModel, getBrand, getFuelType, getCarYear);
          paymentSystemService.setMoney(getPrice);
          rentalCars.add(car);
          System.out.println("\nCar added successfully!");
          break;

        case 3: // Delete Car
          System.out.print("\nEnter the index of the car to delete: ");
          int index = Integer.parseInt(scanner.nextLine());

          if (index >= 0 && index < rentalCars.size() + 1) {
            rentalCars.remove(index - 1);
            System.out.println("Car deleted successfully!");
          } else {
            System.out.println("Invalid index!");
          }

          break;

        case 4: // Logout
          LogOut();
          break;

        case 5: // Exit app
          loginServices.exitApp();
          return;

        default: // In case of picking a wrong option
          System.out.println("Invalid choice. Please, choose only between displayed options!");
          break;
      }
    } while (loginServices.isLoggedInAsAdmin(loginServices.getLoggedInUser()));
  }
  /**
     * @brief Displays the main menu and handles user options.
     */
  public void MainMenu() {
    do {
      System.out.println();
      MENU_DISPLAY_SERVICES.designMainMenu();
      System.out.println("Username for Admin: admin, password:0000 /// Username for Customer: ugur, password:1234");
      System.out.println("If you don't have an account yet, register now for free!");
      System.out.println("Please, choose your option from down below: ");
      int option = INPUT.nextInt();

      switch (option) {
        case 1: // Registration
          registrationServices.initiateRegistration(loginServices);
          break;

        case 2: // Login
          loginServices.initiateLogIn();

          if (loginServices.isLoggedInAsAdmin(loginServices.getLoggedInUser())) {
            AdminMenu();
          } else {
            CustomerMenu();
          }

          break;

        case 3: // Exit app
          loginServices.exitApp();
          return;

        default: // In case of picking a wrong option
          System.out.println("Wrong option. Please, try again!");
          break;
      }
    } while (!loginServices.isLoggedIn(loginServices.getLoggedInUser()));
  }
  /**
     * @brief Displays the customer menu and handles customer options.
     */
  public void CustomerMenu() {
    do {
      System.out.println();
      MENU_DISPLAY_SERVICES.designCustomerMenu();
      System.out.println("Please, choose your option from down below: ");
      int option = INPUT.nextInt();

      switch (option) {
        case 1: // Rent a Car
          System.out.println("\nRental Cars:\n");
          int i = 0;

          if (rentalCars.isEmpty()) {
            System.out.println("No cars available.");
          } else {
            for (RentCarInterface rentalACar : rentalCars) {
              i++;
              System.out.println(
                "+------Brand---------Model-------Car Year-----Fuel Type----Color----Price---Number of Seats-------+\n");
              System.out.print(i + ". =>   ");
              displayCar(rentalACar);
            }

            Scanner scanner = new Scanner(System.in);
            int index;

            while (true) {
              System.out.println("\nEnter the index of the car: ");
              index = Integer.parseInt(scanner.nextLine());

              if (index >= 0 && index < rentalCars.size() + 1) {
                paymentSystemService.setSelectedCarIndex(index - 1);
                break;
              } else {
                System.out.println("Invalid index!");
              }
            }

            int paymentType;

            while (true) {
              System.out.println("1 - Credit Card");
              System.out.println("2 - PayPal");
              System.out.println("3 - Cash");
              System.out.println("Choose the payment type:");
              paymentType = Integer.parseInt(scanner.next());

              if (paymentType == 1) {
                paymentSystemService.setStrategyPattern(payCreditCard);
                Bill.displayBill(rentalCars.get(index - 1), "Credit Cart");
                break;
              } else if (paymentType == 2) {
                paymentSystemService.setStrategyPattern(payPayPal);
                Bill.displayBill(rentalCars.get(index - 1), "PayPal");
                break;
              } else if (paymentType == 3) {
                paymentSystemService.setStrategyPattern(payCash);
                Bill.displayBill(rentalCars.get(index - 1), "Cash");
                break;
              } else {
                return;
              }
            }

            paymentSystemService.proccessOrder();
            paymentSystemService.removeMoney(index - 1);
            rentalCars.remove(index - 1);
            System.out.println("Kaç gün sonra kiralaycaksınız:");
            int Rentindex = Integer.parseInt(scanner.next());
            System.out.print("Bildirim Almak ve Abone Olmak istiyorsanız 1'i tuşlayın");
            int selecetSubs = Integer.parseInt(scanner.next());

            if (selecetSubs == 1) {
              NotificationTime timer = new NotificationTime(Rentindex, 2);
              CarCustomer customer = new CarCustomer("Customer");
              timer.addObserver(customer);

              for (int a = timer.getRemainingNoti(); a >= 0; a--) {
                timer.setRemainingNoti(a);
              }
            }
          }

          break;

        case 2: // Logout
          LogOut();
          break;

        case 3: // Exit app
          loginServices.exitApp();
          return;

        default: // In case of picking a wrong option
          System.out.println("Invalid choice. Please, choose only between displayed options!");
          break;
      }
    } while (loginServices.isLoggedInAsCustomer(loginServices.getLoggedInUser()));
  }
  /**
     * @brief Initializes the main car list with default cars.
     */
  public void DefaulMainCars() {
    RentCarInterface carOne = FactoryMethodPatternCar.createCar("modelsedan", 1, 1, "sedan", "sedan", "sedan",
                              "sedan", 1);
    rentalCars.add(carOne);
    paymentSystemService.setMoney(1);
  }
  /**
     * @brief Displays the details of a car.
     *
     * @param car The car to display.
     */

  public void displayCar(RentCarInterface car) {
    System.out.println(car.getCarBrand().toUpperCase() + "   =>   " + car.getCarModel().toUpperCase() + "   =>   "
                       + car.getCarColor() + "   =>   " + car.getCarFuelType().toUpperCase() + "   =>   "
                       + car.getCarColor().toUpperCase() + "   =>   " + car.getCarPrice() + "   =>   "
                       + car.getCarSeatsNumber() + "\n");
  }
  /**
   * @brief Logs out the user and returns to the main menu.
   */
  public void LogOut() {
    System.out.println("Log-out successfully!");
    MainMenu();
  }

}
