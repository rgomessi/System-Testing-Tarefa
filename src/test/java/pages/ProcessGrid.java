package pages;

import org.openqa.selenium.By;
import support.DriverQA;

public class ProcessGrid extends BasePage{

    public ProcessGrid(DriverQA stepDriver){
        super(stepDriver);
    }

    public void clickNewProcess() {
        driver.click("#btn-novo","css");
    }

    public void clickShow(String lastProcess) {
        String idName = "btn-show_" + lastProcess;
        driver.click(idName);
    }

    public void clickEdit(String lastProcess) {
        String idName = "btn-edit_" + lastProcess;
        driver.click(idName);
    }

    public void clickDelete(String lastProcess) {
        String idName = "btn-delete_" + lastProcess;
        driver.click(idName);
    }

    public void clickConfirmDelete() {
        driver.ChooseOkOnNextConfirmation();
    }

    public boolean existProcess(String lastProcess) {
        String idName = "btn-delete_" + lastProcess;
        return driver.getDriver().getPageSource().contains(idName);
    }
}
