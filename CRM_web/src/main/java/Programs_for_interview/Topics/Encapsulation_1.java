package Programs_for_interview.Topics;

//UserAccount class demonstrating Encapsulation
class UserAccount {
	private String username;
	private String password; // Sensitive data

	// Constructor
	public UserAccount(String username, String password) {
		this.username = username;
		this.password = password;
	}

	// Getter method (only for username)
	public String getUsername() {
		return username;
	}

	// Setter method (only to update password securely)
	public void setPassword(String newPassword) {
		this.password = newPassword;
	}

	// Method to display user details (excluding password for security)
	public void displayUser() {
		System.out.println("Username: " + username);
	}
}

//Main Class
public class Encapsulation_1 {
	public static void main(String[] args) {
		// Creating UserAccount object
		UserAccount user = new UserAccount("JohnDoe", "securePass123");

		// Displaying username (password is private)
		user.displayUser();

		// Updating password using setter
		user.setPassword("newSecurePass456");

		System.out.println("Password updated successfully.");
	}
}
