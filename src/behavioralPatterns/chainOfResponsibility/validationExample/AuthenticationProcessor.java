package behavioralPatterns.chainOfResponsibility.validationExample;

public abstract class AuthenticationProcessor {
    public AuthenticationProcessor nextProcessor;

    public void setNextProcessor(AuthenticationProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public boolean isAuthorized(String password) {
        boolean result = false;
        if (checkPasswordStrength(password)) {
            if (nextProcessor != null) {
                result = nextProcessor.isAuthorized(password);
            } else {
                System.out.println("The password is really good!");
                result = true;
            }
        }
        return result;
    }

    protected abstract boolean checkPasswordStrength(String password);

}
