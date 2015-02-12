package dbconsole;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DBConsoleView extends Frame implements ActionListener,WindowListener{


		public DBConsoleView(DBConsoleController controller) {
		
			int id, height,weight;
			String name;
			ResultSet rs;
				
			MySQL mysql = new MySQL();
				
			rs = mysql.selectAll();
			
		// TODO Auto-generated constructor stub
		addWindowListener(this);
    	setTitle("Physical");
    	setLayout(new FlowLayout(FlowLayout.CENTER));
    	try {
			while(rs.next()){
			        id = rs.getInt("id");
			        name = rs.getString("name");
			        height = rs.getInt("height");
			        weight= rs.getInt("weight");
			        add(new Label("ID：" + id));
			        add(new Label("名前：" + name));
			        add(new Label("身長：" + height));
			        add(new Label("体重：" + weight));
			    }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0); 
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

		
		
	

			
	





public class DDBConsole_View {

}












@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}
