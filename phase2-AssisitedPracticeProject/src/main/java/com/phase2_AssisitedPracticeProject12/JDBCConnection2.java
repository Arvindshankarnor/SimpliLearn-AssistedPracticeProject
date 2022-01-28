package com.phase2_AssisitedPracticeProject12;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class JDBCConnection2 {
	

	

	        private Connection connection;
	        
	        public JDBCConnection2(String dbURL, String user, String pwd) throws ClassNotFoundException, SQLException{
	                
	                Class.forName("com.mysql.jdbc.Driver");
	                this.connection = DriverManager.getConnection(dbURL, user, pwd);
	        }
	        
	        public Connection getConnection(){
	                return this.connection;
	        }
	        
	        public void closeConnection() throws SQLException {
	                if (this.connection != null)
	                        this.connection.close();
	        }
	}



