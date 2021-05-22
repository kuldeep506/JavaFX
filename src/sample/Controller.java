package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.io.IOException;

public class Controller {
    Main main = new Main();
    @FXML
    private Label warning;
    @FXML
    private TextField userName;
    @FXML
    private PasswordField password;
    @FXML
    private Button loginButton;

    @FXML
    public void onPressLoginButton(ActionEvent actionEvent) throws IOException {
        if (actionEvent.getSource().equals(loginButton)) {
            if (userName.getText().toString().equals("kuldeep") && password.getText().toString().equals("1234")) {
                main.changeScene("afterLogin.fxml");
            } else if (userName.getText().isEmpty() && password.getText().isEmpty()) {
                warning.setText("Fill username or password");
            } else {
                warning.setText("Invalid username or password");
            }
        }
    }
}
