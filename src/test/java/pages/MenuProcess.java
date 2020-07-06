package pages;

import support.DriverQA;

public class MenuProcess  extends BasePage{

    public MenuProcess(DriverQA stepsDriver){
        super(stepsDriver);
    }

    public void clickProcess() {
        driver.click("#processos","css");

    }
}
