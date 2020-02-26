package eggwindow;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class login extends JPanel {

	/**
	 * Create the panel.
	 */
	public login(JFrame frame) {
		
		JLabel lblThisIsThe = new JLabel("This is the main window");
		lblThisIsThe.setForeground(Color.RED);
		
		JButton btnLogin = new JButton("login");
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblThisIsThe.setForeground(Color.BLUE);
				lblThisIsThe.setText("Hello World");
				mainwindow panel = new mainwindow(frame);
				frame.setContentPane(panel);
				frame.revalidate();
			}
		});
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(165)
							.addComponent(lblThisIsThe))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(198)
							.addComponent(btnLogin)))
					.addContainerGap(173, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(138)
					.addComponent(lblThisIsThe)
					.addGap(18)
					.addComponent(btnLogin)
					.addContainerGap(107, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}
