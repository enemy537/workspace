package view;

import javax.jws.Oneway;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class TelaPrincipal extends JFrame {
	private JTextField txtHosts;
	private JTextField txtMascDec;
	private JTextField txtMascBin;
	private JPanel panelField;
	private JPanel panelKey;

	public TelaPrincipal() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setMinimumSize(new Dimension(450,304));
		
		setVisible(true);
	}
}
