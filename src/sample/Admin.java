package sample;

import java.util.Date;

public class Admin extends User {

    public int reported_questions_solved_count;
    public Admin(int userID, String userName, Date date_of_birth, Date start_Date, String user_password, String user_status) {
        super(userID, userName, date_of_birth, start_Date, user_password, user_status);
    }

    public int getReported_questions_solved_count() {
        return reported_questions_solved_count;
    }

    public void setReported_questions_solved_count() {
        this.reported_questions_solved_count++;
    }

    public void deleteQuestion(int QuestionID){

    }
    public void modifyQuestion(int QuestionID){

    }
    public int getReportList(){
    return 0;
    }
}
