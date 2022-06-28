package utils;

import org.bouncycastle.math.ec.custom.sec.SecT113Field;

import java.sql.*;
import java.util.*;

public class DBUtils {

    public static List<Map<String, String>> getDataFromDB(String query) {

        String dbUrl = ConfigReader.getPropertiesValue("dbUrl");
        String dbUserName = ConfigReader.getPropertiesValue("dbUserName");
        String dbPassword = ConfigReader.getPropertiesValue("dbPassword");

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        ResultSetMetaData resultSetMetaData = null;

        List<Map<String, String>> tableData = new ArrayList<>();

        try {
            connection = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);

            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            resultSetMetaData = resultSet.getMetaData();

            while (resultSet.next()) {
                Map<String, String> row = new HashMap<>();
                for (int i = 1; i < resultSetMetaData.getColumnCount(); i++) {
                    String columnName = resultSetMetaData.getColumnName(i);
                    String columnValue = resultSet.getString(columnName);
                    row.put(columnName, columnValue);
                }
                tableData.add(row);
                System.out.println(row);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tableData;
    }

    public static void closeConnection(Connection connection, Statement statement, ResultSet resultSet) {

        try {
            if (connection != null) {
                connection.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (resultSet != null) {
                resultSet.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

/*        List list; Interface
        ArrayList arrayList; doesn't maintain insertion order
        LinkedList linkedList; maintain insertion order

        Set set;
        HashSet hashSet; doesn't maintain insertion order
        LinkedHashSet linkedHashSet; maintain insertion order
        TreeSet treeSet; sort the data in alphabetical order

        Map map;
        HashMap hashMap; doesn't maintain insertion order
        LinkedHashMap linkedHashMap; maintain insertion order
        key=value*/

