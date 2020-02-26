package winegg;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButton;

public class jpegg extends JPanel {

	/**
	 * Create the panel.
	 */
	public jpegg(JFrame frame) {
		
		JRadioButton c = new JRadioButton("owo oclock");
		
		JLabel lblHellowoWorld = new JLabel("Hellowo World");
		lblHellowoWorld.setBackground(Color.LIGHT_GRAY);
		
		JButton btnChangeTextColor = new JButton("change text color");
		btnChangeTextColor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(c.isSelected()) {
					lblHellowoWorld.setForeground(Color.orange);
				}
			}
		});
		btnChangeTextColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton btnLogin = new JButton("login");
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				loggedin panel = new loggedin(frame);
				frame.setContentPane(panel);
				frame.revalidate();
			}
		});
		

		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(192)
					.addComponent(lblHellowoWorld)
					.addContainerGap(190, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(205, Short.MAX_VALUE)
					.addComponent(btnLogin)
					.addGap(190))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(172, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(c)
						.addComponent(btnChangeTextColor))
					.addGap(161))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(94, Short.MAX_VALUE)
					.addComponent(c)
					.addGap(27)
					.addComponent(lblHellowoWorld)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnChangeTextColor)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnLogin)
					.addGap(79))
		);
		setLayout(groupLayout);

	}
}
