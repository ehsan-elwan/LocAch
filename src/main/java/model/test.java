/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import pl.jsolve.templ4docx.core.Docx;
import pl.jsolve.templ4docx.core.VariablePattern;
import pl.jsolve.templ4docx.variable.TextVariable;
import pl.jsolve.templ4docx.variable.Variables;

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

                    ClassLoader classloader = Thread.currentThread().getContextClassLoader();
                    File file = new File(classloader.getResource("Docs/contrat-de-location-.docx").getFile());
                    Docx docx = new Docx(file.getPath());
                    docx.setVariablePattern(new VariablePattern("#{", "}"));

                    Variables variables = new Variables();
                    variables.addTextVariable(new TextVariable("#{firstname}", "Lukasz"));
                    variables.addTextVariable(new TextVariable("#{lastname}", "Stypka"));

                    docx.fillTemplate(variables);
                    docx.save(file.getAbsolutePath());
                }

            }
            stmt.close();
            // connection.close();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
