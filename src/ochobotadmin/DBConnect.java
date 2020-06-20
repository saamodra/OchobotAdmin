/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ochobotadmin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author samod
 */
public class DBConnect {
    public Connection conn;
    public Statement stat;
    public ResultSet result;
    public PreparedStatement pstat;
    
    public DBConnect() {
        String url = "jdbc:postgresql://ec2-34-206-252-187.compute-1.amazonaws.com:5432/d5npaou1geukqm";
        String user = "zmkbbplustjake";
        String password = "6d22d522fb1c8502c851490c0e68f42a3632029ca5d602deb6b2c6fdeee521ec";

        try {
            conn = DriverManager.getConnection(url, user, password);
            stat = conn.createStatement();

        } catch (SQLException ex) {
        
            Logger lgr = Logger.getLogger(DBConnect.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }
    }
}
