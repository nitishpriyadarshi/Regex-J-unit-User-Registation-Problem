package Bridlabz.LastName;

/*
 * @ author: Nitish
 * User need to enter a valid Last Name:
 * - Last name starts with Cap and has minimum 3 characters
 */

public class userRegistrationMain {
    public static void main(String[] args) {
        // Create object of class
        ValidateUserInfo validateUserInfo = new ValidateUserInfo();
        // Method calling
        validateUserInfo.checkFirstName();
        validateUserInfo.checkLastName();
    }
}
