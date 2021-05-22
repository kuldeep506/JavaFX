/*   Created by IntelliJ IDEA.
 *   Author: Kuldeep Singh (kuldeep506)
 *   Date: 16-05-2021
 *   Time: 04:15 PM
 *   File: AfterLogin.java
 */

package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.io.IOException;

public class AfterLogin {
    @FXML
    public Button logOut;

    public void onPressLogOut(ActionEvent event) throws IOException {
        if (event.getSource().equals(logOut)){
            Main main=new Main();
            main.changeScene("sample.fxml");
        }
    }
}
