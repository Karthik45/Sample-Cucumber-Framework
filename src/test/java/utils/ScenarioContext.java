package utils;

import java.io.Serializable;

public class ScenarioContext implements Serializable {

    private String appNumber;

    public String getAppNumber() {
        return appNumber;
    }

    public void setAppNumber(String appNumber) {
        this.appNumber = appNumber;
    }
}

