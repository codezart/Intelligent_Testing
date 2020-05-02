package sample;

import java.util.Date;

public class TestDesigner extends User{

    public int num_modeled_questions;
    public int reputation_value;
    public Question[] modeled_questions_list;

    public TestDesigner(int userID, String userName, Date date_of_birth, Date start_Date, String user_password, String user_status) {
        super(userID, userName, date_of_birth, start_Date, user_password, user_status);
        this.reputation_value = 0;
        this.num_modeled_questions = 0;
    }

    public int getNum_modeled_questions() {
        return num_modeled_questions;
    }

    public int getReputation_value() {
        return reputation_value;
    }

    public void setNum_modeled_questions(){
        num_modeled_questions++;
    }
    public void setReputation_value( int reputation_value){
        this.reputation_value = reputation_value;
    }
    public void setModeled_questions_list( Question question){
        this.modeled_questions_list.add(question);
        setNum_modeled_questions();
    }
}
