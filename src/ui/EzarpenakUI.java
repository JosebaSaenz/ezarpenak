package ui;

import java.awt.Frame;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import kudeatzaileak.EzarpenakKud;

public class EzarpenakUI extends JDialog {
	
	public EzarpenakUI(Frame gurasoa) {
		super(gurasoa, "EzarpenakUI");
		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		((JPanel)getContentPane()).setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
	}
	
	public void lortuEzarpenak(){
		List<String[]> emaitzak = EzarpenakKud.getInstantzia().getEzarpenak();
		
		this.getContentPane().removeAll();
		for (String[] ezarpena : emaitzak) {
			add(new JLabel("User:" + ezarpena[0] + "\tGakoa:" + ezarpena[1] + "\t Balioa:" + ezarpena[2]));
		}
		pack();
	}
	
	
	
}
