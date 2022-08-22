package Bridlabz.sampleemailvalid;
/*
 * @ author: Nitish
 * Checking For sample Emails
 */
public class UserRegiastrationMain {

    public static void main(String[] args) {
        // Create object of class
        ValidateUserInfo validateUserInfo = new ValidateUserInfo();
        // Method calling
        validateUserInfo.checkFirstName();
        validateUserInfo.checkLastName();
        validateUserInfo.checkEmail();
        validateUserInfo.checkMobileNumber();
        validateUserInfo.checkPassword();
        validateUserInfo.checkSampleEmail();
    }
}
