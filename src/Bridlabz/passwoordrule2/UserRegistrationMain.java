package Bridlabz.passwoordrule2;
/*
 * @ author: Nitish
 * As a User need to follow pre-defined Password rules.
 * Rule1 – minimum 8 Characters
 */
public class UserRegistrationMain {
    public static void main(String[] args) {
        // Create object of class
        ValidateUserInfo validateUserInfo = new ValidateUserInfo();
        // Method calling
        validateUserInfo.checkFirstName();
        validateUserInfo.checkLastName();
        validateUserInfo.checkEmail();
        validateUserInfo.checkMobileNumber();
        validateUserInfo.checkPassword();
    }

}
