package behavioralPatterns.chainOfResponsibility.validationExample;

public class NumbersPresence extends AuthenticationProcessor{
    @Override
    protected boolean checkPasswordStrength(String password) {
        if (password.equals("123456789")) {
            System.out.println("The password is not strong enough! Try again!");
            return false;
        }
        return true;
    }
}
