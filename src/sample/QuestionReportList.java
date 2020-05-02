package sample;
import java.util.ArrayList;


public class QuestionReportList {
    private String category;
    private int num_report;
    private ArrayList<QuestionReport> report = new ArrayList<QuestionReport>();

    public QuestionReportList(String category, int num_report, ArrayList<QuestionReport> report) {
        this.category = category;
        this.num_report = num_report;
        this.report = report;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getNum_report() {
        return num_report;
    }

    public void setNum_report(int num_report) {
        this.num_report = num_report;
    }

    public ArrayList<QuestionReport> getReport() {
        return report;
    }

    public void setReport(ArrayList<QuestionReport> report) {
        this.report = report;
    }

    public QuestionReportList() {
    }
}
