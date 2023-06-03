
/**
 * 
 * @file User.java
 * @brief This file contains the implementation of the User class.
 */
package ce204_hw4_app;

/**
 * 
 * @class User
 * 
 * @brief Represents a user in the application.
 */
public class User {

	protected String firstName;
	protected String lastName;
	protected String userName;
	protected String password;

	/**
	 * 
	 * @brief Constructs a User object with the specified details.
	 * @param firstName The first name of the user.
	 * @param lastName  The last name of the user.
	 * @param userName  The username of the user.
	 * @param password  The password of the user.
	 */
	public User(String firstName, String lastName, String userName, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
	}

	/**
	 * 
	 * @brief Default constructor for the User class.
	 */
	public User() {

	}

	/**
	 * 
	 * @brief Returns the first name of the user.
	 * @retval [String] The first name of the user.
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * 
	 * @brief Sets the first name of the user.
	 * @param firstName The first name of the user.
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * 
	 * @brief Returns the last name of the user.
	 * @retval [String] The last name of the user.
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * 
	 * @brief Sets the last name of the user.
	 * @param lastName The last name of the user.
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * 
	 * @brief Returns the username of the user.
	 * @retval [String] The username of the user.
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * 
	 * @brief Sets the username of the user.
	 * @param userName The username of the user.
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * 
	 * @brief Returns the password of the user.
	 * @retval [String] The password of the user.
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * 
	 * @brief Sets the password of the user.
	 * @param password The password of the user.
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 
	 * @brief Returns a string representation of the User object.
	 * @retval [String] The string representation of the User object.
	 */
	@Override
	public String toString() {
		return "User{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", userName='" + userName
				+ '\'' + ", password='" + password + '\'' + '}';
	}

}
