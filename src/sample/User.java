package sample;

import java.util.Date;

public class User {
    private int userID;
    private String userName;
    public Date date_of_birth;
    public Date start_Date;
    private String user_password;
    public String user_status;

    public User(int userID, String userName, Date date_of_birth,Date start_Date,String user_password,String user_status){
        this.userID = userID;
        this.date_of_birth= date_of_birth;
        this.start_Date= start_Date;
        this.user_password = user_password;
        this.userName = userName;
        this.user_status = user_status;
    }
}
