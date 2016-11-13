/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
/**
 *
 * @author Bodnár Tamás <tms.bodnar@gmail.com> | www.kalandlabor.hu
 */
public interface IModel {
    void close()throws SQLException;
    Kerdesek getKerdes(int id) throws SQLException;
    Vector<Kerdesek> getAllKerdes() throws SQLException;
    void addKerdes(Kerdesek kerdes) throws SQLException;
    void updateKerdes(Kerdesek kerdes) throws SQLException;
    void removeKerdes(Kerdesek kerdes) throws SQLException;
    
}
