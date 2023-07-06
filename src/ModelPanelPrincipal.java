import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class ModelPanelPrincipal {

	public String titulo, origen, destino;
	public JPanel panel;
	public String[] listOrigen, listDestino;
	public JTextField txtOrigen, txtDestino;
	public JButton btnConvertir;
	public JTextArea txtResultado;
	public JComboBox<String> boxOrigen, boxDestino;

	public ModelPanelPrincipal(JPanel panel, String titulo, String origen, String destino, String[] listOrigen,
			String[] listDestino) {
		this.titulo = titulo;
		this.panel = panel;
		this.origen = origen;
		this.destino = destino;
		this.listOrigen = listOrigen;
		this.listDestino = listDestino;
	}

	public void buildPanel() {

		// Building the panel
		panel.setForeground(new Color(39, 55, 77));
		panel.setBackground(new Color(221, 230, 237));

		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 30, 260, 100, 260, 30 };
		gbl_panel.rowHeights = new int[] { 30, 100, 50, 50, 50, 50, 50, 100, 100 };
		gbl_panel.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0 };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		panel.setLayout(gbl_panel);

		JLabel lblTitulo = new JLabel(titulo);
		lblTitulo.setForeground(new Color(39, 55, 77));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Trebuchet MS", Font.BOLD, 50));
		GridBagConstraints gbc_lblTitulo = new GridBagConstraints();
		gbc_lblTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitulo.gridwidth = 3;
		gbc_lblTitulo.gridx = 1;
		gbc_lblTitulo.gridy = 1;
		panel.add(lblTitulo, gbc_lblTitulo);

		JLabel lblOrigen = new JLabel(origen);
		lblOrigen.setForeground(new Color(39, 55, 77));
		lblOrigen.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblOrigen.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblOrigen = new GridBagConstraints();
		gbc_lblOrigen.insets = new Insets(0, 0, 5, 5);
		gbc_lblOrigen.gridx = 1;
		gbc_lblOrigen.gridy = 3;
		panel.add(lblOrigen, gbc_lblOrigen);

		JLabel lblDestino = new JLabel(destino);
		lblDestino.setForeground(new Color(39, 55, 77));
		lblDestino.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblDestino.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblDestino = new GridBagConstraints();
		gbc_lblDestino.insets = new Insets(0, 0, 5, 5);
		gbc_lblDestino.gridx = 3;
		gbc_lblDestino.gridy = 3;
		panel.add(lblDestino, gbc_lblDestino);

		boxOrigen = new JComboBox<String>();
		boxOrigen.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		boxOrigen.setFocusTraversalPolicyProvider(true);
		boxOrigen.setBorder(null);
		boxOrigen.setFocusTraversalKeysEnabled(false);
		boxOrigen.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		boxOrigen.setForeground(new Color(39, 55, 77));
		boxOrigen.setBackground(new Color(150, 165, 169));
		boxOrigen.setModel(new DefaultComboBoxModel<String>(listOrigen));
		GridBagConstraints gbc_boxOrigen = new GridBagConstraints();
		gbc_boxOrigen.anchor = GridBagConstraints.WEST;
		gbc_boxOrigen.insets = new Insets(0, 0, 5, 5);
		gbc_boxOrigen.fill = GridBagConstraints.BOTH;
		gbc_boxOrigen.gridx = 1;
		gbc_boxOrigen.gridy = 4;
		panel.add(boxOrigen, gbc_boxOrigen);

		boxDestino = new JComboBox<String>();
		boxDestino.setBounds(new Rectangle(5, 5, 5, 5));
		boxDestino.setBorder(UIManager.getBorder("ComboBox.editorBorder"));
		boxDestino.setFocusTraversalKeysEnabled(false);
		boxDestino.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		boxDestino.setForeground(new Color(39, 55, 77));
		boxDestino.setBackground(new Color(150, 165, 169));
		boxDestino.setModel(new DefaultComboBoxModel<String>(listDestino));
		GridBagConstraints gbc_boxDestino = new GridBagConstraints();
		gbc_boxDestino.fill = GridBagConstraints.BOTH;
		gbc_boxDestino.anchor = GridBagConstraints.WEST;
		gbc_boxDestino.insets = new Insets(0, 0, 5, 5);
		gbc_boxDestino.gridx = 3;
		gbc_boxDestino.gridy = 4;
		panel.add(boxDestino, gbc_boxDestino);

		txtOrigen = new JTextField();
		txtOrigen.setFocusTraversalPolicyProvider(true);
		txtOrigen.setFocusCycleRoot(true);
		txtOrigen.setHorizontalAlignment(SwingConstants.RIGHT);
		txtOrigen.setMargin(new Insets(5, 5, 5, 5));
		txtOrigen.setForeground(new Color(39, 55, 77));
		txtOrigen.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		txtOrigen.setColumns(10);
		GridBagConstraints gbc_txtOrigen = new GridBagConstraints();
		gbc_txtOrigen.fill = GridBagConstraints.BOTH;
		gbc_txtOrigen.anchor = GridBagConstraints.WEST;
		gbc_txtOrigen.insets = new Insets(0, 0, 5, 5);
		gbc_txtOrigen.gridx = 1;
		gbc_txtOrigen.gridy = 5;
		panel.add(txtOrigen, gbc_txtOrigen);

		txtDestino = new JTextField();
		txtDestino.setEditable(false);
		txtDestino.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDestino.setForeground(new Color(39, 55, 77));
		txtDestino.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		txtDestino.setColumns(10);
		GridBagConstraints gbc_txtDestino = new GridBagConstraints();
		gbc_txtDestino.fill = GridBagConstraints.BOTH;
		gbc_txtDestino.anchor = GridBagConstraints.WEST;
		gbc_txtDestino.insets = new Insets(0, 0, 5, 5);
		gbc_txtDestino.gridx = 3;
		gbc_txtDestino.gridy = 5;
		panel.add(txtDestino, gbc_txtDestino);

		btnConvertir = new JButton("CONVERTIR");
		btnConvertir.setForeground(new Color(255, 255, 255));
		btnConvertir.setBackground(new Color(39, 55, 77));
		GridBagConstraints gbc_btnConvertir = new GridBagConstraints();
		gbc_btnConvertir.fill = GridBagConstraints.BOTH;
		gbc_btnConvertir.insets = new Insets(0, 0, 5, 5);
		gbc_btnConvertir.gridx = 2;
		gbc_btnConvertir.gridy = 5;
		panel.add(btnConvertir, gbc_btnConvertir);

		txtResultado = new JTextArea();
		txtResultado.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		txtResultado.setEditable(false);
		txtResultado.setLineWrap(true);
		txtResultado.setForeground(new Color(39, 55, 77));
		txtResultado.setMargin(new Insets(10, 10, 10, 10));
		txtResultado.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		GridBagConstraints gbc_txtResultado = new GridBagConstraints();
		gbc_txtResultado.fill = GridBagConstraints.BOTH;
		gbc_txtResultado.gridwidth = 3;
		gbc_txtResultado.insets = new Insets(0, 0, 5, 5);
		gbc_txtResultado.gridx = 1;
		gbc_txtResultado.gridy = 7;
		panel.add(txtResultado, gbc_txtResultado);
		
		txtOrigen.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (!Character.isDigit(e.getKeyChar())) {
					e.consume();
				}
			}
		});
	}
	
	public String getTextOrigen() {
		System.out.println(txtOrigen.getText());
		return txtOrigen.getText();
	}
	
	public String getTextDestino() {
		System.out.println(txtDestino.getText());
		return txtDestino.getText();
	}
	
	public void setTextOrigen(String text) {
		txtOrigen.setText(text);
	}
	
	public void setTextDestino(String text) {
		txtDestino.setText(text);
	}
	
	
}
