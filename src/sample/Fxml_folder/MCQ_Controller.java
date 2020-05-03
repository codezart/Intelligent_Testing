package sample.Fxml_folder;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import sample.utils.ConnectionUtil;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

public class MCQ_Controller implements Initializable {

    @FXML
    private TextField ans1;

    @FXML
    private TextField ans2;

    @FXML
    private TextField ans3;

    @FXML
    private TextField ans4;
    @FXML
    private ComboBox Correct;

    @FXML
    private TextArea Question;
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    @Override
    public void initialize(URL url, ResourceBundle rb){
        Correct.getItems().addAll( 1,2,3,4 );


    }

    @FXML
    void addQuestion(ActionEvent event) {
        con = ConnectionUtil.conDB();
        String options = ans1.getText() +","+ans2.getText()+","+ans3.getText()+","+ans4.getText();
        String correctAns ="";
        if(Correct.getSelectionModel().getSelectedItem().equals( 1 )){
            correctAns = ans1.getText();
        }
        else if(Correct.getSelectionModel().getSelectedItem().equals( 2 )){
            correctAns = ans2.getText();
        }
        else if(Correct.getSelectionModel().getSelectedItem().equals( 3 )){
            correctAns = ans3.getText();
        }
        else if(Correct.getSelectionModel().getSelectedItem().equals( 4 )){
            correctAns = ans4.getText();
        }


        String sql = String.format("INSERT INTO question(Difficulty ,Question, Type, OptionList, correctAns) VALUES (%d,'%s',%d,'%s','%s')",1,Question.getText(),1,options,correctAns);
        try {
            ps = con.prepareStatement( sql );
            ps.executeUpdate();
        }
        catch (Exception e){
            System.out.println(e);
        }




        }


}
