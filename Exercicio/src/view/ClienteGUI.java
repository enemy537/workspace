package view;

import java.awt.List;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.CD;
import model.Cliente;

import javax.swing.JList;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClienteGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtTitulo;
	private JTextField txtArtista;
	private JTextField txtQtMusicas;
	private JTextField txtTempoTotal;
	private Cliente cliente;
	private JList list;
	
	public void addCD(){
		String titulo = txtTitulo.getText();
		String artista = txtArtista.getText();
		int qtMuisca = Integer.parseInt(txtQtMusicas.getText());
		float tempoTotal = Float.parseFloat(txtTempoTotal.getText());
		
		cliente.addCD(titulo,artista,qtMuisca,tempoTotal);
	}
	
	public void showCDs(){
		ArrayList<CD> discos = cliente.getDiscos();
		list.setListData(discos.toArray());
	}
	
	public ClienteGUI(final Cliente cliente) {
		this.cliente = cliente;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 359, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cliente");
		lblNewLabel.setBounds(12, 22, 70, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNomeCliente = new JLabel(cliente.getNome());
		lblNomeCliente.setBounds(94, 22, 70, 15);
		contentPane.add(lblNomeCliente);
		
		JLabel lblCadastrar = new JLabel("Cadastrar CD");
		lblCadastrar.setBounds(12, 84, 106, 15);
		contentPane.add(lblCadastrar);
		
		JLabel lblTtulo = new JLabel("T\u00EDtulo");
		lblTtulo.setBounds(12, 127, 70, 15);
		contentPane.add(lblTtulo);
		
		JLabel lblArtista = new JLabel("Artista");
		lblArtista.setBounds(12, 154, 70, 15);
		contentPane.add(lblArtista);
		
		JLabel lblQuantidadeDeMsicas = new JLabel("Quantidade de M\u00FAsicas");
		lblQuantidadeDeMsicas.setBounds(12, 181, 166, 15);
		contentPane.add(lblQuantidadeDeMsicas);
		
		JLabel lblTempoTotal = new JLabel("Tempo Total");
		lblTempoTotal.setBounds(12, 208, 106, 15);
		contentPane.add(lblTempoTotal);
		
		JLabel lblListaDeCds = new JLabel("Lista de CD's");
		lblListaDeCds.setBounds(12, 271, 106, 15);
		contentPane.add(lblListaDeCds);
		
		JButton btnNewButton = new JButton("Adicionar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addCD();
				showCDs();
			}
		});
		btnNewButton.setBounds(12, 235, 117, 25);
		contentPane.add(btnNewButton);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int indice = list.getSelectedIndex();
				cliente.removeCD(cliente.getDiscos().get(indice));
				showCDs();
			}
		});
		btnRemover.setBounds(12, 402, 117, 25);
		contentPane.add(btnRemover);
		
		txtTitulo = new JTextField();
		txtTitulo.setBounds(68, 125, 226, 19);
		contentPane.add(txtTitulo);
		txtTitulo.setColumns(10);
		
		txtArtista = new JTextField();
		txtArtista.setColumns(10);
		txtArtista.setBounds(68, 154, 226, 19);
		contentPane.add(txtArtista);
		
		txtQtMusicas = new JTextField();
		txtQtMusicas.setColumns(10);
		txtQtMusicas.setBounds(188, 179, 106, 19);
		contentPane.add(txtQtMusicas);
		
		txtTempoTotal = new JTextField();
		txtTempoTotal.setBounds(107, 208, 187, 19);
		contentPane.add(txtTempoTotal);
		txtTempoTotal.setColumns(10);
		
		list = new JList();
		JScrollPane scroll = new JScrollPane(list);
		scroll.setBounds(12, 297, 321, 99);
		contentPane.add(scroll);
		showCDs();
		setAlwaysOnTop(true);
		setVisible(true);
	}
}
