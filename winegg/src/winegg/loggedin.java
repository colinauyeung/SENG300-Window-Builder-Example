package winegg;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class loggedin extends JPanel {

	/**
	 * Create the panel.
	 */
	public loggedin(JFrame frame) {
		
		JLabel lblLoggedInUwu = new JLabel("Logged In uwu");
		lblLoggedInUwu.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(151, Short.MAX_VALUE)
					.addComponent(lblLoggedInUwu, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE)
					.addGap(89))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(143, Short.MAX_VALUE)
					.addComponent(lblLoggedInUwu, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
					.addGap(72))
		);
		setLayout(groupLayout);

	}

}
