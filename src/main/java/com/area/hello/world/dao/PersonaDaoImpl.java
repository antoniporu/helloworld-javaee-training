package com.area.hello.world.dao;

import com.area.hello.world.models.Persona;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.Dependent;

/**
 *
 * @author antoni.pont
 */
@Dependent
public class PersonaDaoImpl implements PersonaDao {

    private static final String SQL_INSERT = "INSERT INTO persona_antoni(nombre, "
            + "apellidos, dni, id_direccion) VALUES(?,?,?,?)";

    @Override
    public Persona add(Persona persona) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PersonaDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://eu-cdbr-west-01.cleardb.com:3306/heroku_0cfc546621a0fc3?user=b4867549279eb6&password=c2e5e0e2&useSSL=false");
            conn.setAutoCommit(false);
            try (PreparedStatement ps = conn.prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS)) {
                ps.setString(1, persona.getNombre());
                ps.setString(2, persona.getApellidos());
                ps.setString(3, persona.getDni());
                ps.setInt(4, 1);

                int affectedRows = ps.executeUpdate();
                if (affectedRows == 0) {
                    throw new SQLException("Error adding person, no rows affected");
                }

                try (ResultSet generatedKeys = ps.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        persona.setId(generatedKeys.getInt(1));
                    } else {
                        throw new SQLException("Creating user failed, cannot obtain auto-generated ID");
                    }
                }
                
                conn.commit();
            }

        } catch (SQLException ex) {
            Logger.getLogger(PersonaDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex1) {
                    Logger.getLogger(PersonaDaoImpl.class.getName()).log(Level.SEVERE, null, ex1);
                }
            }
        }

        return persona;
    }

    @Override
    public List<Persona> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
