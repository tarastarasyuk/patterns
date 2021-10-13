package behavioralPatterns.chainOfResponsibility.validationExample;

public class Main200 {
    public static void main(String[] args) {
        AuthenticationProcessor checker1 = new PasswordLength();
        AuthenticationProcessor checker2 = new NumbersPresence();
        checker1.setNextProcessor(checker2);
//        checker1.isAuthorized("123456789");
        System.out.println(checker1.isAuthorized("efwcf2efde"));
    }
}
