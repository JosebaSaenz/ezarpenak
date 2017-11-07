package ui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Nagusia_UI extends JFrame {

	JButton bistaratuBotoia = new JButton("Ezarpenak Bistaratu");
	JButton editatuBotoia = new JButton("Ezarpenak Gehitu");
	EzarpenakUI ezarpenakUI = new EzarpenakUI(this);
	
	public Nagusia_UI() {
		super("Ezarpenak Kudeatu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		botoiakPrestatu();
		
		Container panela = this.getContentPane();
		BoxLayout bl = new BoxLayout(panela, BoxLayout.Y_AXIS);
		panela.setLayout(bl);
		panela.add(bistaratuBotoia);
		panela.add(editatuBotoia);
	}
	
	
	private void botoiakPrestatu() {
		bistaratuBotoia.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ezarpenakUI.setVisible(true);
				ezarpenakUI.lortuEzarpenak();
			}
		});
		
		// editatuBotoia.addActionListener();
	}


	public static void main(String[] args) {
		
			Nagusia_UI pantailaNagusia = new Nagusia_UI();
			pantailaNagusia.setSize(300, 200);
			pantailaNagusia.pack();
			pantailaNagusia.setVisible(true);
			
	}

}
