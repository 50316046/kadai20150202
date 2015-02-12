package dbconsole;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConsole_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			DBConsoleController controller=new DBConsoleController();
			DBConsoleView frame = new DBConsoleView(controller);
			frame.setBounds(5,5,655,455);
			frame.setVisible(true);
			}
		}
