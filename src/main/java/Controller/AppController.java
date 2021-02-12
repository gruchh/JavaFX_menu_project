package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class AppController {

    @FXML
    MainController mainController;

    @FXML
    void menuBack(ActionEvent event) {
        mainController.setDefaultMenu();
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

}
