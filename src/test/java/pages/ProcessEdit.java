package pages;

import support.DriverQA;

public class ProcessEdit extends BasePage {

    public ProcessEdit(DriverQA stepsDriver) {
        super(stepsDriver);
    }

    public void clickSave() {
        driver.click("btn-save");
    }
}
