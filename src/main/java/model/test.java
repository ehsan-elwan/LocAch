/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ehsan
 */
public class test {

    public static void main(String[] args) {
        DataSourceFactory ds = new DataSourceFactory();

        try (Connection connection = ds.DataSourceFactory();
                PreparedStatement stmt = connection.prepareStatement("select * from Locataire;")) {
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                      System.out.println(rs.getString("nom"));
                      System.out.println(rs.getString("ne"));
                }

            }
            stmt.close();
           // connection.close();

    }   catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
