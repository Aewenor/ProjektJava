package Projekt.Projekt;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JInternalFrame;
import javax.swing.SwingConstants;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;

public class Frame1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtPodajImie;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 frame = new Frame1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Frame1() {
		setTitle("Witaj!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JButton btnZatwierd = new JButton("Zatwierdz");
		btnZatwierd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnZatwierd.setToolTipText("");
		contentPane.add(btnZatwierd, BorderLayout.SOUTH);
		
		txtPodajImie = new JTextField();
		txtPodajImie.setHorizontalAlignment(SwingConstants.CENTER);
		txtPodajImie.setText("Podaj imie");
		contentPane.add(txtPodajImie, BorderLayout.NORTH);
		txtPodajImie.setColumns(1);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "SwingAction_1");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
