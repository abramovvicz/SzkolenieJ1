package day4.testFxml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;

public class MainController {

    @FXML
    public CheckBox checkBoxId;

    public void doIt(ActionEvent actionEvent) {
        System.out.println("click");
        checkBoxId.setText("Change text");
    }
}
