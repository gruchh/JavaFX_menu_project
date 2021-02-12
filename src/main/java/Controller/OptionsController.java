package Controller;

public class OptionsController {

    MainController mainController;

    public void menuBack() {
        mainController.setDefaultMenu();
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }
}
