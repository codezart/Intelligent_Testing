package sample;
import java.util.ArrayList;

public class QuestionController {
    private int difficulty;
    private String question;
    private int type;
    private String category;
    private ArrayList<String>  options_list = new ArrayList<String>();
    private ArrayList<String>  answers_list = new ArrayList<String>();


    public int getDifficulty() {
        return difficulty;
    }

    public String getQuestion() {
        return question;
    }

    public int getType() {
        return type;
    }

    public String getCategory() {
        return category;
    }

    public ArrayList<String> getOptions_list() {
        return options_list;
    }

    public ArrayList<String> getAnswers_list() {
        return answers_list;
    }
    public void createNewQuestion(){

    }
    public void addToQuestionList(){

    }
    public void createQuestionList(String[] question){

    }
    public void modifyQuestion(int id){

    }
}
