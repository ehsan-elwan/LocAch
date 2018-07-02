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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ehsan
 */
public class DAO {

    private final DataSourceFactory ds;

    public DAO(DataSourceFactory ds) {
        this.ds = new DataSourceFactory();
    }

    public Locataire getLocByID(int locID) {

        Locataire loc = null;

        try (Connection conn = ds.DataSourceFactory();
                PreparedStatement stmt = conn.prepareStatement("select * from Locataire"
                        + " where ID=?")) {
            stmt.setInt(1, locID);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    String prenom = rs.getString("prenom");
                    String nom = rs.getString("nom");
                    String email = rs.getString("email");
                    String phone = rs.getString("phone");
                    Date ne = new SimpleDateFormat("dd-MM-yyyy").parse(rs.getString("ne"));
                    String gender = rs.getString("gender");
                    String neAVille = rs.getString("neAVille");
                    String neAPay = rs.getString("neAPay");
                    int cp = rs.getInt("cp");
                    String adresse = rs.getString("adresse");
                    String commune = rs.getString("commune");
                    int id = rs.getInt("id");
                    loc = new Locataire(prenom, nom, email, phone,
                            ne, gender, neAVille, neAPay, cp,
                            adresse, commune, id);
                }

            } catch (ParseException ex) {
                Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            stmt.close();

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return loc;
    }

    public Bien getBienByID(int bienID) {

        Bien bien = null;
        try (Connection connection = ds.DataSourceFactory();
                PreparedStatement stmt = connection.prepareStatement("select * from Bien"
                        + "where ID=?")) {
            stmt.setInt(1, bienID);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    int porte = rs.getInt("porte");
                    String adresse = rs.getString("adresse");
                    String batiment = rs.getString("batiment");
                    int etage = rs.getInt("etage");
                    int cp = rs.getInt("cp");

                    String commune = rs.getString("commune");
                    float surface = rs.getFloat("surface");
                    int nbpiece = rs.getInt("nbpiece");
                    String description = rs.getString("adresse");

                    int cave = rs.getInt("cave");
                    int parking = rs.getInt("parking");
                    int garage = rs.getInt("garage");
                    int chauffage = rs.getInt("chauffage");
                    int eauChaude = rs.getInt("eauChaude");

                    boolean antenneTV = rs.getBoolean("antenneTV");
                    boolean interphone = rs.getBoolean("interphone");
                    boolean gardiennage = rs.getBoolean("gardiennage");
                    String type = rs.getString("type");

                    boolean ascenseur = rs.getBoolean("ascenseur");
                    boolean digicode = rs.getBoolean("digicode");
                    boolean cable = rs.getBoolean("cable");
                    String autre = rs.getString("autre");

                    bien = new Bien(porte, adresse, batiment, etage, cp,
                            commune, surface, nbpiece, description,
                            cave, parking, garage, chauffage, eauChaude,
                            antenneTV, interphone, gardiennage, type,
                            ascenseur, digicode, cable, autre);
                }

            }
            stmt.close();

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return bien;
    }

    public List<Bien> getBiens() {
        List<Bien> result = new LinkedList<>();

        Bien bien;
        try (Connection connection = ds.DataSourceFactory();
                PreparedStatement stmt = connection.prepareStatement(
                        " select distinct * from Bien ")) {
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    int porte = rs.getInt("porte");
                    String adresse = rs.getString("adresse");
                    String batiment = rs.getString("batiment");
                    int etage = rs.getInt("etage");
                    int cp = rs.getInt("cp");

                    String commune = rs.getString("commune");
                    float surface = rs.getFloat("surface");
                    int nbpiece = rs.getInt("nbpiece");
                    String description = rs.getString("adresse");

                    int cave = rs.getInt("cave");
                    int parking = rs.getInt("parking");
                    int garage = rs.getInt("garage");
                    int chauffage = rs.getInt("chauffage");
                    int eauChaude = rs.getInt("eauChaude");

                    boolean antenneTV = rs.getBoolean("antenneTV");
                    boolean interphone = rs.getBoolean("interphone");
                    boolean gardiennage = rs.getBoolean("gardiennage");
                    String type = rs.getString("type");

                    boolean ascenseur = rs.getBoolean("ascenseur");
                    boolean digicode = rs.getBoolean("digicode");
                    boolean cable = rs.getBoolean("cable");
                    String autre = rs.getString("autre");

                    bien = new Bien(porte, adresse, batiment, etage, cp,
                            commune, surface, nbpiece, description,
                            cave, parking, garage, chauffage, eauChaude,
                            antenneTV, interphone, gardiennage, type,
                            ascenseur, digicode, cable, autre);
                    result.add(bien);
                }

            }
            stmt.close();

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return result;
    }

    public List<Bien> getEmptyBiens() {
        List<Bien> result = new LinkedList<>();

        Bien bien;
        try (Connection connection = ds.DataSourceFactory();
                PreparedStatement stmt = connection.prepareStatement(
                        "select distinct * from Bien where id not "
                        + " in (select distinct bien_id from Contract)")) {
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    int porte = rs.getInt("porte");
                    String adresse = rs.getString("adresse");
                    String batiment = rs.getString("batiment");
                    int etage = rs.getInt("etage");
                    int cp = rs.getInt("cp");

                    String commune = rs.getString("commune");
                    float surface = rs.getFloat("surface");
                    int nbpiece = rs.getInt("nbpiece");
                    String description = rs.getString("adresse");

                    int cave = rs.getInt("cave");
                    int parking = rs.getInt("parking");
                    int garage = rs.getInt("garage");
                    int chauffage = rs.getInt("chauffage");
                    int eauChaude = rs.getInt("eauChaude");

                    boolean antenneTV = rs.getBoolean("antenneTV");
                    boolean interphone = rs.getBoolean("interphone");
                    boolean gardiennage = rs.getBoolean("gardiennage");
                    String type = rs.getString("type");

                    boolean ascenseur = rs.getBoolean("ascenseur");
                    boolean digicode = rs.getBoolean("digicode");
                    boolean cable = rs.getBoolean("cable");
                    String autre = rs.getString("autre");

                    bien = new Bien(porte, adresse, batiment, etage, cp,
                            commune, surface, nbpiece, description,
                            cave, parking, garage, chauffage, eauChaude,
                            antenneTV, interphone, gardiennage, type,
                            ascenseur, digicode, cable, autre);
                    result.add(bien);
                }

            }
            stmt.close();

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return result;
    }

    public List<Bien> getFilledBiens() {
        List<Bien> result = new LinkedList<>();

        Bien bien;
        try (Connection connection = ds.DataSourceFactory();
                PreparedStatement stmt = connection.prepareStatement(
                        "select distinct * from Bien where id "
                        + " in (select distinct bien_id from Contract)")) {
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    int porte = rs.getInt("porte");
                    String adresse = rs.getString("adresse");
                    String batiment = rs.getString("batiment");
                    int etage = rs.getInt("etage");
                    int cp = rs.getInt("cp");

                    String commune = rs.getString("commune");
                    float surface = rs.getFloat("surface");
                    int nbpiece = rs.getInt("nbpiece");
                    String description = rs.getString("adresse");

                    int cave = rs.getInt("cave");
                    int parking = rs.getInt("parking");
                    int garage = rs.getInt("garage");
                    int chauffage = rs.getInt("chauffage");
                    int eauChaude = rs.getInt("eauChaude");

                    boolean antenneTV = rs.getBoolean("antenneTV");
                    boolean interphone = rs.getBoolean("interphone");
                    boolean gardiennage = rs.getBoolean("gardiennage");
                    String type = rs.getString("type");

                    boolean ascenseur = rs.getBoolean("ascenseur");
                    boolean digicode = rs.getBoolean("digicode");
                    boolean cable = rs.getBoolean("cable");
                    String autre = rs.getString("autre");

                    bien = new Bien(porte, adresse, batiment, etage, cp,
                            commune, surface, nbpiece, description,
                            cave, parking, garage, chauffage, eauChaude,
                            antenneTV, interphone, gardiennage, type,
                            ascenseur, digicode, cable, autre);
                    result.add(bien);
                }

            }
            stmt.close();

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return result;
    }

    public int addLoc(String prenom, String nom, String email, String phone,
            Date ne, String gender, String neAVille, String neAPay, int cp,
            String adresse, String commune) {
        int res = 0;
        String sql = "INSERT INTO Locataire (nom,prenom,email,phone, "
                + " ne,gender,neAVille,neAPay,cp,adresse,commune) "
                + " VALUES (?,?,?,?,?,?,?,?,?,?,?) ";

        try (Connection connection = ds.DataSourceFactory();
                PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setString(1, nom);
            stmt.setString(2, prenom);
            stmt.setString(3, email);
            stmt.setString(4, phone);
            stmt.setString(5, ne.toString());
            stmt.setString(6, gender);
            stmt.setString(7, neAVille);
            stmt.setString(8, neAPay);
            stmt.setInt(9, cp);
            stmt.setString(10, adresse);
            stmt.setString(11, commune);
            res = stmt.executeUpdate();

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return res;
    }

    public int addBien(String prenom, String nom, String email, String phone,
            Date ne, String gender, String neAVille, String neAPay, int cp,
            String adresse, String commune) {
        int res = 0;
        String sql = "INSERT INTO Locataire (nom,prenom,email,phone, "
                + " ne,gender,neAVille,neAPay,cp,adresse,commune) "
                + " VALUES (?,?,?,?,?,?,?,?,?,?,?) ";

        try (Connection connection = ds.DataSourceFactory();
                PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setString(1, nom);
            stmt.setString(2, prenom);
            stmt.setString(3, email);
            stmt.setString(4, phone);
            stmt.setString(5, ne.toString());
            stmt.setString(6, gender);
            stmt.setString(7, neAVille);
            stmt.setString(8, neAPay);
            stmt.setInt(9, cp);
            stmt.setString(10, adresse);
            stmt.setString(11, commune);
            res = stmt.executeUpdate();

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return res;
    }

    public List<Contract> getContracts() {
        List<Contract> result = new LinkedList<>();
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Contract contract;
        try (Connection connection = ds.DataSourceFactory();
                PreparedStatement stmt = connection.prepareStatement(
                        "select distinct * from Contract")) {
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {

                    Locataire loc = this.getLocByID(rs.getInt("Loc_ID"));
                    Bien bien = this.getBienByID(rs.getInt("Bien_ID"));

                    Date debut = df.parse(rs.getString("debut"));
                    Date fin = df.parse(rs.getString("fin"));
                    float loyee = rs.getFloat("loyee");
                    int valueIndice = rs.getInt("valueIndice");
                    boolean etatDesLieux = (rs.getInt("etatDesLieux") != 0);

                    boolean diagnosticTechnique = (rs.getInt("diagnosticTechnique") != 0);
                    boolean extraitsReglementCopropriete = (rs.getInt("etatDesLieux") != 0);

                    boolean listeLoyersReference = (rs.getInt("listeLoyersReference") != 0);
                    boolean modalitesServices = (rs.getInt("modalitesServices") != 0);

                    boolean acteCautionSolidaire = (rs.getInt("acteCautionSolidaire") != 0);
                    int remisesCles = rs.getInt("remisesCles");
                    String faitA = rs.getString("faitA");
                    boolean habitationExclusivement = (rs.getInt("habitationExclusivement") != 0);
                    int locID = rs.getInt("Loc_ID");
                    int bienID = rs.getInt("Bien_ID");

                    contract = new Contract(loc, bien, debut, fin,
                            loyee, valueIndice, etatDesLieux,
                            diagnosticTechnique, extraitsReglementCopropriete,
                            listeLoyersReference, modalitesServices,
                            acteCautionSolidaire, remisesCles, faitA,
                            habitationExclusivement,locID,bienID
                    );
                    result.add(contract);
                }

            } catch (ParseException ex) {
                Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            stmt.close();

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return result;
    }
    
    public int addContract(Contract contract) {
        int res = 0;
        String sql = "INSERT INTO `Contract` (modalitesServices,debut,"
                + " fin,loyee,valueIndice,etatDesLieux,diagnosticTechnique,"
                + " extraitsReglementCopropriete,listeLoyersReference,"
                + " acteCautionSolidaire,remisesCles,faitA,"
                + " habitationExclusivement,Loc_ID,Bien_ID) VALUES "
                + " (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try (Connection connection = ds.DataSourceFactory();
                PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setInt(1, contract.isModalitésServices()? 1 : 0);
            stmt.setString(2, contract.getDebut().toString());
            stmt.setString(3, contract.getFin().toString());
            stmt.setFloat(4, contract.getLoyee());
            stmt.setInt(5, contract.getValueIndice());
            stmt.setInt(6, contract.isEtatDesLieux()? 1 : 0);
            stmt.setInt(7, contract.isDiagnosticTechnique()? 1 : 0);
            stmt.setInt(8, contract.isExtraitsReglementCopropriete()? 1 : 0);
            stmt.setInt(9, contract.isListeLoyersReference()? 1 : 0);
            stmt.setInt(10, contract.isActeCautionSolidaire()? 1 : 0);
            stmt.setInt(11, contract.getRemisesCles());
            stmt.setString(12, contract.getFaitA());
            stmt.setInt(13, contract.isHabitationExclusivement()? 1 : 0);
            stmt.setInt(14, contract.getLocID());
            stmt.setInt(15, contract.getBienID());
            
            res = stmt.executeUpdate();

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return res;
    }
}
