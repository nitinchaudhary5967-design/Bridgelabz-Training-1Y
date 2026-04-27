import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Student {
    public void createDatabase() {
        try {
            String url = "jdbc:mysql://localhost:3306/";
            String userName = "root";
            String password = "root";

            Connection conn = DriverManager.getConnection(url, userName, password);
            Statement stm = conn.createStatement();

            String query = "create database jdbc3";
            stm.execute(query);
            System.out.println("Connected successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createTable() {
        try {
            String url = "jdbc:mysql://localhost:3306/jdbc";
            String userName = "root";
            String password = "root";

            Connection conn = DriverManager.getConnection(url, userName, password);
            Statement stm = conn.createStatement();

            String query = "create table students3 (sid int primary key auto_increment, sname varchar(50), semail varchar(200) not null)";
            stm.execute(query);
            System.out.println("Table created successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void insertData(){
        try{
            String url = "jdbc:mysql://localhost:3306/jdbc";
            String userName = "root";
            String password = "root";

            Connection conn = DriverManager.getConnection(url, userName, password);
            Statement stm = conn.createStatement();

            String query = "insert into students (sname, semail) values ('Ravi', 'ravi@gmail.com')";
            stm.execute(query);
            System.out.println("Data inserted successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void readTable(){
        try{
            String url = "jdbc:mysql://localhost:3306/jdbc";
            String userName = "root";
            String password = "root";

            Connection conn = DriverManager.getConnection(url, userName, password);
            Statement stm = conn.createStatement();

            String query = "select * from students";
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()){
                System.out.println("id = "+ rs.getInt(1));
                System.out.println("name = "+ rs.getString(2));
                System.out.println("email = "+ rs.getString(3));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

