package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import exception.SQLRuntimeException;

/**
 * Servlet implementation class UserDao
 */


public class UserDao  {

	public void insert(Connection connection, User user) {

		PreparedStatement ps = null;
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO user ( ");

			sql.append("loginid");
			sql.append(", password");
			sql.append(", name");
			sql.append(", Branch");
			sql.append(", Position");
			sql.append(", insert_date");
			sql.append(", update_date");
			sql.append(") VALUES (");

			sql.append("?"); // loginid
			sql.append(", ?"); // password
			sql.append(", ?"); // name
			sql.append(", ?"); //  Branch
			sql.append(", ?"); // Position
			sql.append(", CURRENT_TIMESTAMP"); // insert_date
			sql.append(", CURRENT_TIMESTAMP"); // update_date
			sql.append(")");

			ps = connection.prepareStatement(sql.toString());


			ps.setString(1, user.getloginid());
			ps.setString(4, user.getPassword());
			ps.setString(2, user.getName());
			ps.setString(3, user.getBranch());
			ps.setString(5, user.getPosition());

			System.out.println(ps.toString());
			ps.executeUpdate();

		} catch (SQLException e) {

			throw new SQLRuntimeException(e);
		} finally {
			close(ps);
		}
	}




}
