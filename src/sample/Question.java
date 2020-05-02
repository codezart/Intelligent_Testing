package sample;
import java.util.ArrayList;
public class Question {
    private int question_ID;
    private int diffculty;
    private String Question;
    private int type;
    private String category;
    private ArrayList<String> options = new ArrayList<String>();
    private ArrayList<String>  answers = new ArrayList<String>();
    private int wrong_ans_count;
    private int correct_ans_count;
    private int designer_ID;

    public Question() {
    }

    public int getQuestion_ID() {
        return question_ID;
    }

    public void setQuestion_ID(int question_ID) {
        this.question_ID = question_ID;
    }

    public int getDiffculty() {
        return diffculty;
    }

    public void setDiffculty(int diffculty) {
        this.diffculty = diffculty;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<String> options) {
        this.options = options;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    public int getWrong_ans_count() {
        return wrong_ans_count;
    }

    public void setWrong_ans_count(int wrong_ans_count) {
        this.wrong_ans_count = wrong_ans_count;
    }

    public int getCorrect_ans_count() {
        return correct_ans_count;
    }

    public void setCorrect_ans_count(int correct_ans_count) {
        this.correct_ans_count = correct_ans_count;
    }

    public int getDesigner_ID() {
        return designer_ID;
    }

    public void setDesigner_ID(int designer_ID) {
        this.designer_ID = designer_ID;
    }

    public Question(int question_ID, int diffculty, String question, int type, String category, ArrayList<String> options, ArrayList<String> answers, int wrong_ans_count, int correct_ans_count, int designer_ID) {
        this.question_ID = question_ID;
        this.diffculty = diffculty;
        Question = question;
        this.type = type;
        this.category = category;
        this.options = options;
        this.answers = answers;
        this.wrong_ans_count = wrong_ans_count;
        this.correct_ans_count = correct_ans_count;
        this.designer_ID = designer_ID;
    }
}
