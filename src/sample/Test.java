package sample;
public class Test<date> {
    private int testID;
    private int testTakerID;
    private Question question_List;
    private double score;
    private int time;
    private int status;
    private String category;
    private date date;

    public Test(int testID, int testTakerID, Question question_List, double score, int time, int status, String category, date date) {
        this.testID = testID;
        this.testTakerID = testTakerID;
        this.question_List = question_List;
        this.score = score;
        this.time = time;
        this.status = status;
        this.category = category;
        this.date = date;
    }

    public Test() {
    }

    public void setTestID(int testID) {
        this.testID = testID;
    }

    public void setTestTakerID(int testTakerID) {
        this.testTakerID = testTakerID;
    }

    public void setQuestion_List(Question question_List) {
        this.question_List = question_List;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDate(date date) {
        this.date = date;
    }

    public int getTestID() {
        return testID;
    }

    public int getTestTakerID() {
        return testTakerID;
    }

    public Question getQuestion_List() {
        return question_List;
    }

    public double getScore() {
        return score;
    }

    public int getTime() {
        return time;
    }

    public int getStatus() {
        return status;
    }

    public String getCategory() {
        return category;
    }

    public date getDate() {
        return date;
    }
    public void updataDB(){

    }

}
