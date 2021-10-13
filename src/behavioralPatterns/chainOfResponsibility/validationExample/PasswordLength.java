package behavioralPatterns.chainOfResponsibility.validationExample;

public class PasswordLength extends AuthenticationProcessor{
    @Override
    protected boolean checkPasswordStrength(String password) {
        if (password.toCharArray().length < 8) {
            System.out.println("The password is too short! Try again!");
            return false;
        }
        return true;
    }
}
