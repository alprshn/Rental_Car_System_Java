/**
 * @file Admin.java
 * @brief Contains the implementation of the Admin class.
 */
package ce204_hw4_app;

/**
 * @class Admin
 * @brief Represents an admin user.
 * 
 *        This class extends the User class and represents an admin user in the
 *        application. Admin users have additional privileges and capabilities
 *        compared to regular users.
 */
public class Admin extends User {
	/**
	 * @brief Constructs a new Admin object.
	 * 
	 *        This constructor creates a new Admin object with the specified first
	 *        name, last name, username, and password.
	 * 
	 * @param firstName The first name of the admin.
	 * @param lastName  The last name of the admin.
	 * @param userName  The username of the admin.
	 * @param password  The password of the admin.
	 */
	public Admin(String firstName, String lastName, String userName, String password) {
		super(firstName, lastName, userName, password);
	}

}
