/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JTable;

/**
 *
 * @author Corentin cadieu
 */
public class BDD {
    
    Connection conn;
    Statement stmt;
    ResultSet rs;
    ResultSet rs2;
    ResultSet rs3;
    String pilote = "org.gjt.mm.mysql.Driver";
    
    public void afficheSport(JTable tblSport){
        try{
            Class.forName(pilote);
            conn = DriverManager.getConnection("jdbc:mysql://localhost/gymnase", "root", "");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from sport");
            int i = 0;
            while(rs.next()){
                String nomSport = rs.getString("nomSport");
                tblSport.setValueAt(nomSport, i, 0);
                i++;
            }
        }
        catch(SQLException sqlE){
            System.out.println("ERREUR SQL : " + sqlE.getMessage());
        }
        catch(ClassNotFoundException cnfE){
                System.out.println("ERREUR SQL : " + cnfE.getMessage());
        }
    }
    
    public void afficheAccueil(JTable tblAccueil, JComboBox comboRef, JComboBox comboSport){
        try{
            Class.forName(pilote);
            conn = DriverManager.getConnection("jdbc:mysql://localhost/gymnase", "root", "");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from accueillir");
            stmt = conn.createStatement();
            rs2 = stmt.executeQuery("select refSalle from salle");
            stmt = conn.createStatement();
            rs3 = stmt.executeQuery("select nomsport from sport");
            int i = 0;
            while(rs.next()){
                String salle = rs.getString("refSalle");
                String sport = rs.getString("nomSportAutorise");
                tblAccueil.setValueAt(salle, i, 0);
                tblAccueil.setValueAt(sport, i, 1);
                i++;
            }
            while(rs2.next()){
                String Csalle = rs2.getString("refSalle");
                comboRef.addItem(Csalle);
            }
            while(rs3.next()){
                String Csport = rs3.getString("nomsport");
                comboSport.addItem(Csport);
            }
        }
        catch(SQLException sqlE){
            System.out.println("ERREUR SQL : " + sqlE.getMessage());
        }
        catch(ClassNotFoundException cnfE){
                System.out.println("ERREUR SQL : " + cnfE.getMessage());
        }
    }
    
    public void affichePrat(JTable tblPrat, JComboBox cbxAssoc, JComboBox cbxSport){
        try{
            Class.forName(pilote);
            conn = DriverManager.getConnection("jdbc:mysql://localhost/gymnase", "root", "");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from pratiquer");
            stmt = conn.createStatement();
            rs2 = stmt.executeQuery("select refasso from association");
            stmt = conn.createStatement();
            rs3 = stmt.executeQuery("select nomsport from sport");
            int i = 0;
            while(rs.next()){
                String refAssoc = rs.getString("refasso");
                String nomSport = rs.getString("nomSport");
                tblPrat.setValueAt(refAssoc, i, 0);
                tblPrat.setValueAt(nomSport, i, 1);
                i++;
            }
            while(rs2.next()){
                String Casso = rs2.getString("refasso");
                cbxAssoc.addItem(Casso);
            }
            while(rs3.next()){
                String Csport = rs3.getString("nomsport");
                cbxSport.addItem(Csport);
            }
        }
        catch(SQLException sqlE){
            System.out.println("ERREUR SQL : " + sqlE.getMessage());
        }
        catch(ClassNotFoundException cnfE){
                System.out.println("ERREUR SQL : " + cnfE.getMessage());
        }
    }
    
    public void afficheAssoc(JTable tblAssoc){
        try{
            Class.forName(pilote);
            conn = DriverManager.getConnection("jdbc:mysql://localhost/gymnase", "root", "");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from association");
            int i = 0;
            while(rs.next()){
                String refAssoc = rs.getString("refasso");
                String ville = rs.getString("ville");
                String adresse = rs.getString("adresse");
                String nomResponsable = rs.getString("nomresponsable");
                tblAssoc.setValueAt(refAssoc, i, 0);
                tblAssoc.setValueAt(ville, i, 1);
                tblAssoc.setValueAt(adresse, i, 2);
                tblAssoc.setValueAt(nomResponsable, i, 3);
                i++;
            }
        }
        catch(SQLException sqlE){
            System.out.println("ERREUR SQL : " + sqlE.getMessage());
        }
        catch(ClassNotFoundException cnfE){
                System.out.println("ERREUR SQL : " + cnfE.getMessage());
        }
    }
    
    public void supSport(JTable tblSport, int ligne){
            if(ligne == -1){
            System.out.println("Selectionnez une ligne");
        }
        else{
            try{
                String sport = (String) tblSport.getValueAt(ligne, 0);
                ((ModelSport)tblSport.getModel()).removeRow(ligne);
                Class.forName(pilote);
                conn = DriverManager.getConnection("jdbc:mysql://localhost/gymnase", "root", "");
                stmt = conn.createStatement();
                stmt.executeUpdate("delete from accueillir where nomsportautorise = '" + sport + "'");
                stmt.executeUpdate("delete from pratiquer where nomsport = '" + sport + "'");
                stmt.executeUpdate("delete from sport where nomsport = '" + sport + "'");
            
            }
            catch(SQLException sqlE){
                System.out.println("ERREUR SQL : " + sqlE.getMessage());
            }
            catch(ClassNotFoundException cnfE){
                    System.out.println("ERREUR SQL : " + cnfE.getMessage());
            }
            }
}
    
    public void ajoutS(JTable tblSport, String sport){
        try{
            Class.forName(pilote);
            conn = DriverManager.getConnection("jdbc:mysql://localhost/gymnase", "root", "");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select count(*) from sport");
            int ligne = 1;
            while(rs.next()){
                ligne = rs.getInt("count(*)");
            }
            stmt.executeUpdate("INSERT INTO sport (nomSport) VALUES ('" + sport + "')");
            tblSport.setValueAt(sport, ligne, 0);
        }
        catch(SQLException sqlE){
            System.out.println("ERREUR SQL : " + sqlE.getMessage());
        }
        catch(ClassNotFoundException cnfE){
                System.out.println("ERREUR SQL : " + cnfE.getMessage());
        }
    }
    
    public void supAccueil(JTable tblAccueil, int ligne){
            if(ligne == -1){
            System.out.println("Selectionnez une ligne");
        }
        else{
            try{
                String sport = (String) tblAccueil.getValueAt(ligne, 1);
                String refSalle = (String) tblAccueil.getValueAt(ligne, 0);
                ((ModelAccueil)tblAccueil.getModel()).removeRow(ligne);
                Class.forName(pilote);
                conn = DriverManager.getConnection("jdbc:mysql://localhost/gymnase", "root", "");
                stmt = conn.createStatement();
                stmt.executeUpdate("delete from accueillir where refSalle = '"+ refSalle +"' and nomsportautorise = '" + sport + "'");
            }
            catch(SQLException sqlE){
                System.out.println("ERREUR SQL : " + sqlE.getMessage());
            }
            catch(ClassNotFoundException cnfE){
                    System.out.println("ERREUR SQL : " + cnfE.getMessage());
            }
            }
}
    
    public void ajoutAccueil(JTable tblAccueil, String salle, String sAutorise){
        try{
            Class.forName(pilote);
            conn = DriverManager.getConnection("jdbc:mysql://localhost/gymnase", "root", "");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select count(*) from accueillir");
            int ligne = 1;
            while(rs.next()){
                ligne = rs.getInt("count(*)");
            }
            stmt.executeUpdate("INSERT INTO accueillir (refsalle, nomSportAutorise) VALUES ('" + salle + "', '" + sAutorise + "')");
            tblAccueil.setValueAt(salle, ligne, 0);
            tblAccueil.setValueAt(sAutorise, ligne, 1);
        }
        catch(SQLException sqlE){
            System.out.println("ERREUR SQL : " + sqlE.getMessage());
        }
        catch(ClassNotFoundException cnfE){
                System.out.println("ERREUR SQL : " + cnfE.getMessage());
        }
    }
    
    public void supPrat(JTable tblPrat, int ligne){
            if(ligne == -1){
            System.out.println("Selectionnez une ligne");
        }
        else{
            try{
                String sport = (String) tblPrat.getValueAt(ligne, 1);
                String refAsso = (String) tblPrat.getValueAt(ligne, 0);
                ((ModelPrat)tblPrat.getModel()).removeRow(ligne);
                Class.forName(pilote);
                conn = DriverManager.getConnection("jdbc:mysql://localhost/gymnase", "root", "");
                stmt = conn.createStatement();
                stmt.executeUpdate("delete from Pratiquer where refAsso = '" + refAsso + "' and nomsport = '" + sport + "'");
            }
            catch(SQLException sqlE){
                System.out.println("ERREUR SQL : " + sqlE.getMessage());
            }
            catch(ClassNotFoundException cnfE){
                    System.out.println("ERREUR SQL : " + cnfE.getMessage());
            }
            }
}
    
    public void ajoutPrat(JTable tblPrat, String refAsso, String sport){
        try{
            Class.forName(pilote);
            conn = DriverManager.getConnection("jdbc:mysql://localhost/gymnase", "root", "");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select count(*) from pratiquer");
            int ligne = 1;
            while(rs.next()){
                ligne = rs.getInt("count(*)");
            }
            stmt.executeUpdate("INSERT INTO pratiquer (refAsso, nomSport) VALUES ('" + refAsso + "', '" + sport + "')");
            tblPrat.setValueAt(refAsso, ligne, 0);
            tblPrat.setValueAt(sport, ligne, 1);
        }
        catch(SQLException sqlE){
            System.out.println("ERREUR SQL : " + sqlE.getMessage());
        }
        catch(ClassNotFoundException cnfE){
                System.out.println("ERREUR SQL : " + cnfE.getMessage());
        }
    }
    
    public void supAssoc(JTable tblAssoc, int ligne){
            if(ligne == -1){
            System.out.println("Selectionnez une ligne");
        }
        else{
            try{
                String responsable = (String) tblAssoc.getValueAt(ligne, 3);
                ((ModelAssoc)tblAssoc.getModel()).removeRow(ligne);
                Class.forName(pilote);
                conn = DriverManager.getConnection("jdbc:mysql://localhost/gymnase", "root", "");
                stmt = conn.createStatement();
                stmt.executeUpdate("delete from association where nomresponsable = '" + responsable + "'");
            }
            catch(SQLException sqlE){
                System.out.println("ERREUR SQL : " + sqlE.getMessage());
            }
            catch(ClassNotFoundException cnfE){
                    System.out.println("ERREUR SQL : " + cnfE.getMessage());
            }
            }
}
    
    public void ajoutAssoc(JTable tblAssoc, String refAsso, String ville, String adresse, String responsable){
        try{
            Class.forName(pilote);
            conn = DriverManager.getConnection("jdbc:mysql://localhost/gymnase", "root", "");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select count(*) from association");
            int ligne = 1;
            while(rs.next()){
                ligne = rs.getInt("count(*)");
            }
            stmt.executeUpdate("INSERT INTO association (refAsso, ville, adresse, nomResponsable) VALUES ('" + refAsso + "', '" + ville + "', '" + adresse + "', '" + responsable + "')");
            tblAssoc.setValueAt(refAsso, ligne, 0);
            tblAssoc.setValueAt(ville, ligne, 1);
            tblAssoc.setValueAt(adresse, ligne, 2);
            tblAssoc.setValueAt(responsable, ligne, 3);
        }
        catch(SQLException sqlE){
            System.out.println("ERREUR SQL : " + sqlE.getMessage());
        }
        catch(ClassNotFoundException cnfE){
                System.out.println("ERREUR SQL : " + cnfE.getMessage());
        }
    }
}
