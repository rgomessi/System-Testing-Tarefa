package pages;

import support.DriverQA;

public class ProcessNew extends BasePage{

    public ProcessNew(DriverQA stepsDriver){
        super(stepsDriver);
    }

    public void fill(String field, String value) {
        switch (field) {
            case "vara":
                fillVara(value); break;
            case "numero_processo":
                fillNumeroProcesso(value); break;
            case "natureza":
                fillNatureza(value); break;
            case "partes":
                fillPartes(value); break;
            case "urgente":
                fillUrgente(value); break;
            case "arbitramento":
                fillArbitramento(value); break;
            case "assistente_social":
                fillAssistenteSocial(value); break;
            case "data_entrada":
                fillDataEntrada(value); break;
            case "data_saida":
                fillDataSaida(value); break;
            case "data_agendamento":
                fillDataAgendamento(value); break;
            case "status":
                fillStatus(value); break;
            case "observacao":
                fillObservacao(value); break;

        }
    }

    private void fillVara(String value) {
        driver.sendKeys(value, "#processo_vara","css");
    }

    private void fillNumeroProcesso(String value) {

        driver.sendKeys(value,"#processo_numero_processo","css");
    }

    private void fillNatureza(String value) {
        driver.sendKeys(value,"#processo_natureza","css");
    }

    private void fillPartes(String value) {
        driver.sendKeys(value,"#processo_partes","css");
    }

    private void fillUrgente(String value) {
        driver.sendKeys(value,"processo_urgente","css");
    }

    private void fillArbitramento(String value) {
    }

    private void fillAssistenteSocial(String value) {
        driver.sendKeys(value,"#processo_assistente_social","css");
    }

    private void fillDataEntrada(String value) {
        driver.sendKeys(value,"#processo_data_entrada","css");
    }

    private void fillDataSaida(String value) {
        driver.sendKeys(value,"#processo_data_saida","css");
    }

    private void fillDataAgendamento(String value) {
        driver.sendKeys(value,"#processo_data_agendamento","css");
    }

    private void fillStatus(String value) {
        driver.sendKeys(value,"#processo_status","css");
    }

    private void fillObservacao(String value) {
        driver.sendKeys(value,"#processo_observacao","css");
    }

    public void clickSave() {
        driver.click("btn-save");
    }

    public void selectUrgency(String urgency) {
        driver.selectByText(urgency,"processo_urgente");
    }

    public void clickArbitramento(String res) {
        if (res.equals("Sim")){
            driver.click("processo_arbitramento_s");
        } else {
            driver.click("processo_arbitramento_n");
        }
    }
}
