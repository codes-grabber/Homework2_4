package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class Controller {
    @FXML
    TextArea mainTextArea;
    @FXML
    TextField chatTextField;

    //    public static Integer COUNTER = 0;
    public void btnOneClickAction(ActionEvent actionEvent){

            mainTextArea.appendText(chatTextField.getText()+"\n");
            chatTextField.clear();



//        Button thisButton = (Button)actionEvent.getSource(); //меняет текст в кнопке
//        COUNTER++;
//        thisButton.setText(COUNTER.toString());


//        System.out.println(2);
//        mainTextArea.appendText("1\n");
    }
}
