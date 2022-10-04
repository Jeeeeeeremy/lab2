import javax.swing.*;
import java.util.Arrays;

public class Employee {
    String Name;
    String Employee_ID;
    int Age;
    String Gender;
    String Start_date;
    String Level;
    String Team_info;
    String Position_title;
    String[] Contact_Info = new String[2];
    String Cellphone_number;
    String email_address;
    ImageIcon Photo;

    public Employee(String name, String employee_ID, int age, String gender,
                    String start_date, String level,
                    String team_info, String position_title,
                    String cellphone_number, String email_address, ImageIcon photo) {
        Name = name;
        Employee_ID = employee_ID;
        Age = age;
        Gender = gender;
        Start_date = start_date;
        Level = level;
        Team_info = team_info;
        Position_title = position_title;
        Cellphone_number = cellphone_number;
        this.email_address = email_address;
        Contact_Info[0] = cellphone_number;
        Contact_Info[1] = email_address;
        Photo = photo;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + Name + '\'' +
                ", Employee_ID='" + Employee_ID + '\'' +
                ", Age=" + Age +
                ", Gender='" + Gender + '\'' +
                ", Start_date='" + Start_date + '\'' +
                ", Level='" + Level + '\'' +
                ", Team_info='" + Team_info + '\'' +
                ", Position_title='" + Position_title + '\'' +
                ", Cellphone_number='" + Cellphone_number + '\'' +
                ", email_address='" + email_address + '\'' +
                ", Photo=" + Photo +
                '}';
    }

    public void setName(String name) {
        Name = name;
    }

    public void setEmployee_ID(String employee_ID) {
        Employee_ID = employee_ID;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public void setStart_date(String start_date) {
        Start_date = start_date;
    }

    public void setLevel(String level) {
        Level = level;
    }

    public void setTeam_info(String team_info) {
        Team_info = team_info;
    }

    public void setPosition_title(String position_title) {
        Position_title = position_title;
    }

    public void setContact_Info(String[] contact_Info) {
        Contact_Info = contact_Info;
    }

    public void setCellphone_number(String cellphone_number) {
        Cellphone_number = cellphone_number;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public void setPhoto(ImageIcon photo) {
        Photo = photo;
    }

    public String getName() {
        return Name;
    }

    public String getEmployee_ID() {
        return Employee_ID;
    }

    public int getAge() {
        return Age;
    }

    public String getGender() {
        return Gender;
    }

    public String getStart_date() {
        return Start_date;
    }

    public String getLevel() {
        return Level;
    }

    public String getTeam_info() {
        return Team_info;
    }

    public String getPosition_title() {
        return Position_title;
    }

    public String[] getContact_Info() {
        return Contact_Info;
    }

    public String getCellphone_number() {
        return Cellphone_number;
    }

    public String getEmail_address() {
        return email_address;
    }

    public ImageIcon getPhoto() {
        return Photo;
    }
}
