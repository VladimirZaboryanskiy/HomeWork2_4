package sample1.sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
//
    @FXML
    public TextArea textArea;


    public void onClickSend(ActionEvent actionEvent) {
        textArea.appendText("");


    }

    public void clickClose(ActionEvent actionEvent) {

    }

    public void clickNumber(ActionEvent actionEvent) {
        textArea.appendText(((Button)actionEvent.getSource()).getText());
    }

    public void clickOperation(ActionEvent actionEvent) {
        textArea.appendText(((Button)actionEvent.getSource()).getText());
    }
}
