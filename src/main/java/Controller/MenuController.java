package Controller;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.awt.*;
import java.io.IOException;
import java.net.URL;

public class MenuController {

    @FXML
    private MainController mainController;

    @FXML
    public void openApplication() {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/AppScreen.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        AppController appController = loader.getController();
        appController.setMainController(mainController);

        mainController.setScreen(pane);

    }

    @FXML
    public void openOptions() {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/OptionsScreen.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        OptionsController optionsController = loader.getController();
        optionsController.setMainController(mainController);
        mainController.setScreen(pane);

    }

    public void exit() {
        Platform.exit();
    }

    public void openGithubWebsite() {
        Desktop desktop = Desktop.getDesktop();
        try {
            desktop.browse(new URL("http://github.com/gruchh").toURI());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }
}
