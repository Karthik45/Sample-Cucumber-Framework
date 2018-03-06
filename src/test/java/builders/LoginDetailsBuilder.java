package builders;

import entities.LoginDetails;

public class LoginDetailsBuilder {

    private LoginDetails loginDetails = new LoginDetails();

    public LoginDetailsBuilder() {
        loginDetails.setUsername("default@abc.com");
        loginDetails.setPassword("12345");
    }

    public LoginDetailsBuilder withUsername(String loginId) {
        loginDetails.setUsername(loginId);
        return this;
    }

    public LoginDetailsBuilder withPassword(String password) {
        loginDetails.setPassword(password);
        return this;
    }

    public LoginDetails build() {
        return loginDetails;
    }
}
