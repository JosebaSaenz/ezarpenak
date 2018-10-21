package kudeatzaileak;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EzarpenakKud {

	private static final EzarpenakKud ezarpenakKud = new EzarpenakKud();
	
	public static EzarpenakKud getInstantzia(){
		return ezarpenakKud;
	}

	private EzarpenakKud() {
		// Singleton patroia
	}

	public List<String[]> getEzarpenak(){
		
		DBKudeatzaile dbkud = DBKudeatzaile.getInstantzia();
		ResultSet rs = dbkud.execSQL("select userid, `key`, value from properties");
		List<String[]> emaitza = new ArrayList<String[]>();
		
			try {
				while(rs.next()){
					String[] res = new String[3];
					res[0] = rs.getString("userid");
					res[1] = rs.getString("key");
					res[2] = rs.getString("value");
					emaitza.add(res);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
			return emaitza;
	}
}
