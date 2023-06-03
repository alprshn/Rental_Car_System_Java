/**
 * @file App.java
 * @brief Contains the main class of the application.
 */
package ce204_hw4_app;

import ce204_hw4_library.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @class App
 * @brief Represents the main class of the application.
 * 
 *        This class contains the main method and serves as the entry point of
 *        the application. It initializes the necessary objects and starts the
 *        main functionality of the application.
 */
public class App {
	/**
	 * @brief The main method of the application.
	 * 
	 *        This method is the entry point of the application. It creates the
	 *        necessary objects, such as user lists, menu services, registration
	 *        services, and login services. It then initializes the main
	 *        functionality of the application by calling methods in the Main class.
	 * 
	 * @param args The command-line arguments (not used in this application).
	 */
	public static void main(String[] args) {

		// Initialize user lists

		List<User> user = new ArrayList<>();
		user.addAll(UserDatabase.getAdminList());
		user.addAll(UserDatabase.getCustomerList());
		// Initialize menu services

		MenuServices menuDisplayServices = new MenuServices();

		RegistrationServices registrationServices = new RegistrationServices(user);
		LoginServices loginServices = new LoginServices(user);

		Main main = new Main(user, menuDisplayServices, loginServices, registrationServices);
		main.DefaulMainCars();
		// Display the main menu

		main.MainMenu();
	}

}
