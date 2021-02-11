package Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

import java.io.IOException;


public class MainController {

    @FXML
    private StackPane mainStackPane;

    @FXML
    void initialize () {
        FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("/fxml/MenuScreen.fxml"));
        Pane pane=null;

        try {
            pane = fxmlLoader.load();
            mainStackPane.getChildren().add(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
