import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class MessengerFXML extends Application {
	@Override
	public void start(Stage stage) {
    try {
      Parent root = FXMLLoader.load(getClass().getResource("messenger.fxml"));
      Scene scene = new Scene(root, 300, 200);

      stage.setTitle("Messenger FXML");
      stage.setScene(scene);
      stage.show();
    }
    catch(IOException e) {
      e.printStackTrace();
    }
	}

	public static void main( String[] args ) {
		launch(args);
	}
}
