package sample;

public class ReportController{
    public String[] contraints;

    public String[] getContraints() {
        return contraints;
    }

    public void setContraints(String[] contraints) {

        this.contraints = contraints;
    }

    public void generateReport(){

        //code where we generate report from DB based on the constraint/ type of report
    }

    public String[] getReport(){
    return null;
    }
    public void retrieveFromDB( String constraint){

    }
    public void checkValidity( String constraint){

    }
}
