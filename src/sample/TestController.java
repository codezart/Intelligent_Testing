package sample;
import java.util.ArrayList;


public class TestController {
    private String level;
    private ArrayList<Question> questionList = new ArrayList<Question>();
    private int score;
    private int question_num;
    private String category;
    private String status;


    public void updateUserLevel(String newLevel){

    }
    public void updateQuestionNum(int num){

    }

    public void setQuestionList(ArrayList<Question> questionList) {
        this.questionList = questionList;
    }
    public void updateScore(int score){

    }

    public int getQuestion_num() {
        return question_num;
    }

    public String getLevel() {
        return level;
    }

    public ArrayList<Question> getQuestionList() {
        return questionList;
    }

    public int getScore() {
        return score;
    }
    public void startTestSelected(){

    }
    public void areaSelected(String area){

    }
    public boolean checkAnswer(String ansٍ){
        return true;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public void reportQuestion(int id){

    }
    public void createQuestionReport(){

    }
    public void addToQuestionReportList(){

    }
}
