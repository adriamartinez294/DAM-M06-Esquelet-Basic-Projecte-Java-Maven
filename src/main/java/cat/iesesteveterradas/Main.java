package cat.iesesteveterradas;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String basePath = System.getProperty("user.dir") + "/data/";
        String filePath = basePath + "database.db";

        File databaseForHonor = new File(filePath);
    }

    static void initDatabase(String databaseFile) {
        Connection conn = UtilsSQL.connect(databaseFile);

        UtilsSQL.queryUpdate(conn, "DROP TABLE IF EXISTS Faccio;");
        UtilsSQL.queryUpdate(conn, "DROP TABLE IF EXISTS Personatge;");

        UtilsSQL.queryUpdate(conn, "CREATE TABLE IF NOT EXISTS warehouses ("
        + "	id integer PRIMARY KEY AUTOINCREMENT,"
        + "	name text NOT NULL);");
    }
}
