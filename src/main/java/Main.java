import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        StackPane stackPane = loader.load(this.getClass().getResource("/fxml/MainScreen.fxml"));
        Scene scene = new Scene(stackPane);
        stage.setScene(scene);
        stage.setTitle("First Java FX APP");
        stage.show();
    }
}
