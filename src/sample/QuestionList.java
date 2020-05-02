package sample;
import java.util.ArrayList;

public class QuestionList {
    private String category;
    private int num_questions;
    private ArrayList<Question>  question_list = new ArrayList<Question>();


    public QuestionList() {
    }

    public QuestionList(String category, int num_questions, ArrayList<Question> question_list) {
        this.category = category;
        this.num_questions = num_questions;
        this.question_list = question_list;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getNum_questions() {
        return num_questions;
    }

    public void setNum_questions(int num_questions) {
        this.num_questions = num_questions;
    }

    public ArrayList<Question> getQuestion_list() {
        return question_list;
    }

    public void setQuestion_list(ArrayList<Question> question_list) {
        this.question_list = question_list;
    }
    public void updateDB(){

    }

}
