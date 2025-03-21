package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class UserDaoJDBCImpl implements UserDao {

    public UserDaoJDBCImpl() {

    }

    @Override
    public void createUsersTable() {
        String SQL = """
                CREATE TABLE IF NOT EXISTS `db`.`users` (
                  `id` INT NOT NULL AUTO_INCREMENT,
                  `name` VARCHAR(100) NOT NULL,
                  `lastName` VARCHAR(100) NOT NULL,
                  `age` INT NOT NULL,
                  PRIMARY KEY (`id`));""";
        try (Connection connection = Util.getConnection();
             Statement statement = connection.createStatement()) {
            statement.execute(SQL);
        } catch (SQLException e) {
            System.out.println("Something went wrong with executing SQL-query: "
                    + e.getMessage());
        }
    }

    public void dropUsersTable() {
        String SQL = "DROP TABLE IF EXISTS `db`.`users`;";
        try (Connection connection = Util.getConnection();
             Statement statement = connection.createStatement()) {
            statement.execute(SQL);
        } catch (SQLException e) {
            System.out.println("Something went wrong with executing SQL-query: "
                    + e.getMessage());
        }
    }

    public void saveUser(String name, String lastName, byte age) {

    }

    public void removeUserById(long id) {

    }

    public List<User> getAllUsers() {
        return null;
    }

    public void cleanUsersTable() {

    }
}
