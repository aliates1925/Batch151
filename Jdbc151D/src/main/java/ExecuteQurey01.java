import java.sql.*;

public class ExecuteQurey01 {
    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "19971925Aa-");
        Statement statement = connection.createStatement();

        //1. Örnek:  region id'si 1 olan "country name" değerlerini çağırın.
        String sql1 = "SELECT country_name FROM countries WHERE region_id = 1";
        boolean r1 = statement.execute(sql1);
        System.out.println("r1 = " + r1);

        //Satırları görmek için executeQuery methodunu kullanmalıyız. execute() methodu sadece true veya false döner.

        ResultSet resultSet = statement.executeQuery(sql1);
        while (resultSet.next()){

            System.out.println(resultSet.getString("country_name"));

        }


    }
}
