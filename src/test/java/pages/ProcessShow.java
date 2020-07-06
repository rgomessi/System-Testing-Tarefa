package pages;

import support.DriverQA;

public class ProcessShow extends BasePage {

    private String lastProcess;

    public ProcessShow(DriverQA stepsDriver) { super(stepsDriver);}

    public String getNotice() {
        return driver.getText("notice");
    }

    public void saveIdLastProcess() {
        setLastProcess(driver.getText("codigo"));
    }

    private void setLastProcess(String codigo) {
        lastProcess = codigo;
    }

    public String getLastProcess(){
        return lastProcess;
    }

    public void clickBack() {
        driver.click(".ls-btn-primary-danger", "css");
    }

    public String getField(String field) {
        return driver.getText(field);
    }
}
