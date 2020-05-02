package sample;

public class QuestionReport {
    private int reportID;
    private int questionID;
    private String status;
    private String category;
    private String reportDescription;

    public QuestionReport() {
    }

    public QuestionReport(int reportID, int questionID, String status, String category, String reportDescription) {
        this.reportID = reportID;
        this.questionID = questionID;
        this.status = status;
        this.category = category;
        this.reportDescription = reportDescription;
    }

    public int getReportID() {
        return reportID;
    }

    public void setReportID(int reportID) {
        this.reportID = reportID;
    }

    public int getQuestionID() {
        return questionID;
    }

    public void setQuestionID(int questionID) {
        this.questionID = questionID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getReportDescription() {
        return reportDescription;
    }

    public void setReportDescription(String reportDescription) {
        this.reportDescription = reportDescription;
    }
}
