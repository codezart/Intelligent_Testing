package sample;

import java.util.Date;

public class TestTaker extends User {
    public int performanceAvg;
    public int performanceStreak;
    public int total_tests_taker;
    public Test test_list;

    public TestTaker(int userID, String userName, Date date_of_birth, Date start_Date, String user_password, String user_status) {
        super(userID, userName, date_of_birth, start_Date, user_password, user_status);
    }

    public int getPerformanceAvg() {
        return performanceAvg;
    }

    public int getPerformanceStreak() {
        return performanceStreak;
    }

    public int getTotal_tests_taker() {
        return total_tests_taker;
    }

    public Test getTest_list() {
        return test_list;
    }

    public void setperformanceStreak(int performanceStreak){
        this.performanceStreak = performanceStreak;
    }

    public void settotal_tests_taker(int total_tests_taker){
        this.total_tests_taker = total_tests_taker;
    }

   /* public void addtest_list(Test individualTest){
        this.test_list.add(individualTest);
    }
*/
}
