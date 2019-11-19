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

    public List<ehu.isad.model.Ordezkaritza> lortuEzarpenak(){
        List<ehu.isad.model.Ordezkaritza> emaitza = new ArrayList<>();
        try {
            //Declare a SELECT statement
            String selectStmt = "SELECT * FROM properties";

            ResultSet rs = DBKudeatzaile.getInstantzia().execSQL(selectStmt);

            while (rs.next()) {

                Integer useridLag = rs.getInt("userid");
                String keyLag = rs.getString("key");
                String valueLag = rs.getString("value");

                emaitza.add(new ehu.isad.model.Ordezkaritza(useridLag,keyLag,valueLag));
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
