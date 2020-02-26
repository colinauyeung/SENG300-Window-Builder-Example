package eggwindow;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class mainwindow extends JPanel {

	/**
	 * Create the panel.
	 */
	public mainwindow(JFrame frame) {
		
		JRadioButton rdbtnPleaseClickMe = new JRadioButton("please click me");
		
		JLabel lblHaventClickedMe = new JLabel("Haven't clicked me");
		
		JButton btnClickMeToo = new JButton("click me too");
		btnClickMeToo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(rdbtnPleaseClickMe.isSelected()) {
					lblHaventClickedMe.setText("Clicked me!");
				
				}
			}
		});
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(170)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnClickMeToo)
						.addComponent(lblHaventClickedMe)
						.addComponent(rdbtnPleaseClickMe))
					.addContainerGap(185, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(138)
					.addComponent(rdbtnPleaseClickMe)
					.addGap(18)
					.addComponent(lblHaventClickedMe)
					.addGap(18)
					.addComponent(btnClickMeToo)
					.addContainerGap(66, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}
