/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinhMD.dao;

import LinhMD.ultil.DBHelpers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.NamingException;

/**
 *
 * @author USER
 */
public class Tbl_UserDAO {
    public boolean checkLogin(String username, int password) throws ClassNotFoundException, SQLException, NamingException{
        Connection c = null;
        String statement = "select userId, password form tbl_User where userId=?";
        PreparedStatement ps = null;
        try{
            c = DBHelpers.makeConnection();
            c.prepareStatement(statement);
            
        } 
        return false;
    }
}
