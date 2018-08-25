import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.fxml.Initializable;

public class MessengerFXMLController {
	@FXML private TextField tf;

	@FXML protected void handleButtonClick(ActionEvent e) {
		Alert alert = new Alert(Alert.AlertType.INFORMATION, tf.getText());
		alert.showAndWait();
	}
}
