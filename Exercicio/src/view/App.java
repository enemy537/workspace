package view;


import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import model.Cliente;
import model.Locadora;

import java.awt.List;
import java.util.ArrayList;


public class App extends JFrame {
	private JTextField textField;
	private Locadora locadora;
	private JList list;


	public void showClientes(){
			ArrayList<Cliente> temp = locadora.getClientes();
			list.setListData(temp.toArray());
		
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App frame = new App();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * 
	 */
	public App() {
		getContentPane().setLayout(null);
		setMinimumSize(new Dimension(440,390));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setBounds(12, 55, 70, 15);
		getContentPane().add(lblCliente);
		
		locadora = new Locadora();
		textField = new JTextField();
		textField.setBounds(72, 48, 227, 29);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				locadora.addCliente(textField.getText());
				showClientes();
			}
		});
		btnAdicionar.setBounds(311, 50, 117, 25);
		getContentPane().add(btnAdicionar);
		
		JLabel lblListaDeCds = new JLabel("Lista de Clientes");
		lblListaDeCds.setBounds(12, 113, 128, 15);
		getContentPane().add(lblListaDeCds);
		
		list = new JList();
		JScrollPane scroll = new JScrollPane(list);
		scroll.setBounds(12, 134, 416, 115);
		getContentPane().add(scroll);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int[] indices = list.getSelectedIndices();
				for(Integer x : indices){
					locadora.removeCliente(locadora.getClientes().get(x)); }
				showClientes();
			}
		});
		btnRemover.setBounds(23, 282, 117, 25);
		getContentPane().add(btnRemover);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int indece = list.getSelectedIndex();
				new ClienteGUI(locadora.getClientes().get(indece));
			}
		});
		btnEditar.setBounds(275, 282, 117, 25);
		getContentPane().add(btnEditar);
		setVisible(true);
	}
}
