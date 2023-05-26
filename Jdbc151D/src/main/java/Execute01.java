import org.postgresql.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Execute01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1. Adım: Driver'a kaydol  ==> jdbc 4 den sonra gerek yok.
        Class.forName("org.postgresql.Driver");

        // 2. Adım: Database'e bağlan
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","19971925Aa-");

        // 3. Adım: Statement oluştur
        Statement statement = connection.createStatement();

        // 4. Adım: Qurey'i çalıştır
        /*
        boolean sql1 = statement.execute(" CREATE TABLE workers(worker_id VARCHAR(20), worker_name VARCHAR (20), worker_salary INT);");
        System.out.println(sql1);
        */

        //1. Örnek: workers adında bir table oluşturunuz
        //CREATE TABLE workers(worker_id VARCHAR(20), worker_name VARCHAR (20), worker_salary INT);
        boolean sql1 = statement.execute("CREATE TABLE workers(worker_id VARCHAR(20), worker_name VARCHAR (20), worker_salary INT);");
        System.out.println("sql1 = " + sql1);

        //2. Örnek: workers table'ına worker_address sütunu ekleyiniz
        String sqlQuery1 = "ALTER TABLE workers ADD worker_address VARCHAR(100);";
        boolean sql2 = statement.execute(sqlQuery1);
        System.out.println("sql2 = " + sql2);

        //3. Örnek: worker table'ı siliniz.
        String sqlQuery2 = "drop table workers";
        boolean sql3 = statement.execute(sqlQuery2);
        System.out.println(sql3);

        //5. Adım: Bağlantıyı kapat
        connection.close();
        statement.close();


    }
}
