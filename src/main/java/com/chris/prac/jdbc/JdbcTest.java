package com.chris.prac.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * jdbc测试
 *
 * sql注入
 * PreparedStatement用法
 *
 * @author zhangh
 * @date 2021/03/31
 */
public class JdbcTest {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/train_db?serverTimezone=Asia/Shanghai";
        String username = "root";
        String password = "root";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            String sql = "select * from t_user where username = ? and pwd = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "zhanghui");
            preparedStatement.setString(2, "123456' or '8'='8");
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("执行sql：" + preparedStatement.toString());

            ResultSetMetaData metaData = resultSet.getMetaData();
            List<Map<String, Object>> res = new ArrayList<>();
            int columnCount = metaData.getColumnCount();
            while (resultSet.next()) {
                Map<String, Object> temp = new HashMap<>(3);
                for (int i = 1; i <= columnCount; i++) {
                    temp.put(metaData.getColumnName(i), resultSet.getString(metaData.getColumnName(i)));
                }
                res.add(temp);
            }
            for (Map<String, Object> re : res) {
                System.out.println(re.toString());
            }

            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
