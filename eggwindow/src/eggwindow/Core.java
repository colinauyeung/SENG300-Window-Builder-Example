package eggwindow;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Core {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Core window = new Core();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Core() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 447, 299);
		login pane = new login(frame);
		frame.setContentPane(pane);
		frame.revalidate();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
