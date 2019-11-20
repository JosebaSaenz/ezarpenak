package ehu.isad.controller.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EzarpenakDBKud {

    //singleton patroia

    private static EzarpenakDBKud instantzia = new EzarpenakDBKud();

    public static EzarpenakDBKud getInstantzia(){
        return instantzia;
    }

    private EzarpenakDBKud(){}

    public List<main.java.ehu.isad.model.Ordezkaritza> lortuEzarpenak(){
        List<main.java.ehu.isad.model.Ordezkaritza> emaitza = new ArrayList<>();
        try {
            //Declare a SELECT statement
            String selectStmt = "SELECT * FROM properties";

            ResultSet rs = main.java.ehu.isad.controller.db.DBKudeatzaile.getInstantzia().execSQL(selectStmt);

            while (rs.next()) {

                String herrialdeLag = rs.getString("herrialdea");
                String artistaLag = rs.getString("artista");
                String abestiLag = rs.getString("abestia");

                emaitza.add(new main.java.ehu.isad.model.Ordezkaritza(herrialdeLag,artistaLag,abestiLag));
            }

        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return emaitza;
    }
}
