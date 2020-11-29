package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
//
public class Controller {
   @FXML
    public TextField textFild;
    @FXML
    public TextArea textArea;


    public void onClickSend(ActionEvent actionEvent) {
        textArea.appendText(textFild.getText()+ "\n");
        textFild.clear();
        textFild.requestFocus();

    }
}
