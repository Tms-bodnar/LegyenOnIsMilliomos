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
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author Bodnár Tamás <tms.bodnar@gmail.com> | www.kalandlabor.hu
 */
public class DBModel implements IModel{
    Connection conn;
    PreparedStatement getKerdesPstmt;
    PreparedStatement getAllKerdesPstmt;
    PreparedStatement addKerdesPstmt;
    PreparedStatement updateKerdesPstmt;
    PreparedStatement removeKerdesPstmt;

    public DBModel(Connection conn) throws SQLException{
        this.conn = conn;
        getKerdesPstmt = conn.prepareStatement("SELECT * FROM java_vizsga.kerdesek WHERE idkerdesek = ?");
        getAllKerdesPstmt = conn.prepareStatement("SELECT * FROM java_vizsga.kerdesek");
        addKerdesPstmt = conn.prepareStatement("INSERT INTO java_vizsga.kerdesek (kerdes, valasz0, valasz1, valasz2, valasz3, helyesvalasz) VALUES ( ?,?,?,?,?,?)");
        updateKerdesPstmt = conn.prepareStatement("UPDATE java_vizsga.kerdesek SET kerdes = ?, valasz0 = ?, valasz1 = ?, valasz2 = ?, valasz3 = ?,helyesvalasz = ? WHERE idkerdesek = ?");
        removeKerdesPstmt = conn.prepareStatement("DELETE FROM java_vizsga.kerdesek WHERE idkerdesek = ?");
    }
    
    @Override
    public void close() throws SQLException{
        conn.close();
    }

    @Override
    public Kerdesek getKerdes(int id) throws SQLException {
        getKerdesPstmt.setInt(1, id);
        ResultSet rs = getKerdesPstmt.executeQuery();
        Kerdesek kerdes = new Kerdesek();
        if(rs.next()){
            kerdes.setIdkerdesek(rs.getInt("idkerdesek"));
            kerdes.setKerdes(rs.getString("kerdes"));
            kerdes.setValasz0(rs.getString("valasz0"));
            kerdes.setValasz1(rs.getString("valasz1"));
            kerdes.setValasz2(rs.getString("valasz2"));
            kerdes.setValasz3(rs.getString("valasz3"));
            kerdes.setHelyesvalasz(rs.getInt("helyesvalasz"));
            rs.close();           
        }
        
        return kerdes;
    }

    @Override
    public Vector<Kerdesek> getAllKerdes() throws SQLException {
        Vector<Kerdesek> kerdesek = new Vector<>();
        ResultSet rs = getAllKerdesPstmt.executeQuery();
        while(rs.next()){
            Kerdesek kerdes = new Kerdesek(
            rs.getInt("idkerdesek"),
            rs.getString("kerdes"),
            rs.getString("valasz0"),
            rs.getString("valasz1"),
            rs.getString("valasz2"),
            rs.getString("valasz3"),
            rs.getInt("helyesvalasz"));
            kerdesek.add(kerdes);
        }
        rs.close();
        return kerdesek;
    }

    @Override
    public void addKerdes(Kerdesek kerdes) throws SQLException {
       
       addKerdesPstmt.setString(1, kerdes.getKerdes());
       addKerdesPstmt.setString(2, kerdes.getValasz0());
       addKerdesPstmt.setString(3, kerdes.getValasz1());
       addKerdesPstmt.setString(4, kerdes.getValasz2());
       addKerdesPstmt.setString(5, kerdes.getValasz3());
       addKerdesPstmt.setInt(6, kerdes.getHelyesvalasz());
       addKerdesPstmt.executeUpdate();
    }

    @Override
    public void updateKerdes(Kerdesek kerdes) throws SQLException {
        if (kerdes!=null){
            updateKerdesPstmt.setInt(7, kerdes.getIdkerdesek());
            updateKerdesPstmt.setString(1, kerdes.getKerdes());
            updateKerdesPstmt.setString(2, kerdes.getValasz0());
            updateKerdesPstmt.setString(3, kerdes.getValasz1());
            updateKerdesPstmt.setString(4, kerdes.getValasz2());
            updateKerdesPstmt.setString(5, kerdes.getValasz3());
            updateKerdesPstmt.setInt(6, kerdes.getHelyesvalasz());
            updateKerdesPstmt.executeUpdate();
        }else System.out.println("Nincs ilyen kérdés.");
    }

    @Override
    public void removeKerdes(Kerdesek kerdes) throws SQLException {
        if (kerdes != null){
        removeKerdesPstmt.setInt(1, kerdes.getIdkerdesek());
        removeKerdesPstmt.executeUpdate();
        }else System.out.println("Nincs ilyen kérdés.");
    }
    
}
