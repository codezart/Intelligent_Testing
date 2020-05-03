package sample.Fxml_folder;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import sample.Main;

import sample.QuestionList;
import sample.utils.ConnectionUtil;

public class Test_controller implements Initializable {
    @FXML
    private ToggleGroup Group1;
    @FXML
    private Label Question;

    @FXML
    private RadioButton ans1;

    @FXML
    private RadioButton ans2;

    @FXML
    private RadioButton ans3;

    @FXML
    private Button submitBtn;

    @FXML
    private Button nextBtn;
    @FXML
    private Label QID;
    @FXML
    private RadioButton ans4;
    int Total = 0;
    public int num = 0;
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    @Override
    public void initialize(URL url, ResourceBundle rb){
        QID.setText( "#"+1);
        Question.setText( Main.question.get( num ).getQuestion());
        ans1.setText( Main.question.get( num ).getOptions().get( 0 ) );
        ans2.setText( Main.question.get( num ).getOptions().get( 1 ) );
        ans3.setText( Main.question.get( num ).getOptions().get( 2 ) );
        ans4.setText( Main.question.get( num ).getOptions().get( 3 ) );
        //        con = ConnectionUtil.conDB();
//
//        String sql = "SELECT * FROM question";
//        try{
//
//            ps = con.prepareStatement(sql);
//            rs = ps.executeQuery();
//            if(rs.next()){
//                Question.setText(rs.getString(5));
//            }
//        }catch (Exception ex){ System.out.println( ex );}
//
   }


    @FXML
    void next(ActionEvent event) {

        if(num == 8){
            nextBtn.setVisible( false );
        }
        checkAnswer();
        num++;
        QID.setText( "#"+(num+1));
        Question.setText( Main.question.get( num ).getQuestion());
        ans1.setText( Main.question.get( num ).getOptions().get( 0 ) );
        ans2.setText( Main.question.get( num ).getOptions().get( 1 ) );
        ans3.setText( Main.question.get( num ).getOptions().get( 2 ) );
        ans4.setText( Main.question.get( num ).getOptions().get( 3 ) );

    }
    public boolean checkAnswer(){
        RadioButton selectedRadioButton = (RadioButton) Group1.getSelectedToggle();
        String toogleGroupValue = selectedRadioButton.getText();
        if(toogleGroupValue.equals( Main.question.get( num ).getAnswers().get( 0 ) )){
            Total++;
            System.out.println(Total);
        }

        return true;
    }

    @FXML
    void submit(ActionEvent event) {
        Alert a = new Alert( Alert.AlertType.INFORMATION);
        a.setTitle("Score");
        a.setHeaderText( "Your Score is" );
        a.setContentText( Total+"/10" );
        a.showAndWait();
    }

}

