package sample;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.utils.ConnectionUtil;


public class Main extends Application {
    public static ArrayList<Question>  question = new ArrayList<Question>();

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Fxml_folder/test_taker_interface.fxml"));
        primaryStage.setTitle("Hello World");
        Scene test_taker_interface = new Scene(root);

        primaryStage.setScene(test_taker_interface);
        primaryStage.setMinHeight(500);
        primaryStage.setMinWidth(500);

        primaryStage.show();
    }


    public static void main(String[] args) {
         Connection con = null;
         PreparedStatement ps = null;
         ResultSet rs = null;
         con = ConnectionUtil.conDB();

        String sql = "SELECT * FROM question";
        try{

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Question q = new Question( );
                q.setQuestion_ID(rs.getInt(1));
                q.setQuestion( rs.getString( 3 ) );

                ArrayList<String> options = new ArrayList<>(  );

                String[] temp = rs.getString(5).split(",");
                for(int i=0; i< temp.length ;i++) {
                    options.add( temp[i] );
                }
                q.setOptions(options);
////////////////////////////////////////////////////////////////////////////////////
                ArrayList<String> answers = new ArrayList<>(  );

                String[] temp1 = rs.getString(6).split(",");
                for(int i=0; i< temp1.length ;i++) {
                    answers.add( temp1[i] );
                }
                q.setAnswers(answers);




                question.add(q);
            }
        }catch (Exception ex){ System.out.println( ex );}

         System.out.println(question.get( 0 ).getQuestion_ID());

        launch(args);
    }
}
