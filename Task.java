import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Task {
    public static void main(String[] args) {
        {
            try {
                Class.forName("org.sqlite.JDBC");
                Connection co = DriverManager.getConnection("jdbc:sqlite:my.bd");

                String createTable = "CREATE TABLE users (name TEXT, surname TEXT, age INTEGER)";

                String createTableCars = "CREATE TABLE cars (model TEXT, country TEXT, color TEXT)";

                String addUser = "INSERT INTO users (name, surname, age) VALUES ('Ivan', 'Ivanov', 20)";
                String addCar = "INSERT INTO cars (model, country, color) VALUES ('Toyota', 'Japan', 'Red')";


                Statement statement = co.createStatement();
/*                statement.executeUpdate(createTable);
                statement.executeUpdate(createTableCars);*/
                statement.executeUpdate(addUser);
                statement.executeUpdate(addCar);

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}