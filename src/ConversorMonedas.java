import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import javax.swing.UIManager;

public class ConversorMonedas {

	private JFrame frmCambiatodo;

	private JPanel panelLateral, panelPrincipal;
	private CardLayout card;
	private JPanel panelInicio, panelMoneda, panelTemperatura, panelDistancia, panelVelocidad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversorMonedas window = new ConversorMonedas();
					window.frmCambiatodo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ConversorMonedas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		// Fixing the principal frame. TODO: Change the setLayout to Grid.
		frmCambiatodo = new JFrame();
		frmCambiatodo.setResizable(false);
		frmCambiatodo.setTitle("CambiaTodo");
		frmCambiatodo.setBounds(100, 100, 1024, 640);
		frmCambiatodo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCambiatodo.getContentPane().setLayout(null);

		// Building the lateral panel: Creating panel
		panelLateral = new JPanel();
		panelLateral.setBorder(null);
		panelLateral.setBackground(new Color(255, 255, 255));
		panelLateral.setBounds(0, 0, 210, 601);
		frmCambiatodo.getContentPane().add(panelLateral);
		GridBagLayout gbl_panelLateral = new GridBagLayout();
		gbl_panelLateral.columnWidths = new int[] { 200 };
		gbl_panelLateral.rowHeights = new int[] { 100, 45, 45, 45, 45, 300 };
		gbl_panelLateral.columnWeights = new double[] { 0.0 };
		gbl_panelLateral.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0 };
		panelLateral.setLayout(gbl_panelLateral);

		// Building the principal panel: Creating panel
		panelPrincipal = new JPanel();
		panelPrincipal.setBounds(211, 0, 797, 601);
		card = new CardLayout(0, 0);
		panelPrincipal.setLayout(card);
		frmCambiatodo.getContentPane().add(panelPrincipal);
		panelInicio = new JPanel();
		panelInicio.setBackground(new Color(82, 109, 130));
		panelInicio.setLayout(null);
		panelMoneda = new JPanel();
		panelMoneda.setForeground(new Color(39, 55, 77));
		panelMoneda.setBackground(new Color(221, 230, 237));
		panelTemperatura = new JPanel();
		panelDistancia = new JPanel();
		panelVelocidad = new JPanel();
		panelPrincipal.add(panelInicio, "Inicio");
		panelPrincipal.add(panelMoneda, "Moneda");
		panelPrincipal.add(panelTemperatura, "Temperatura");
		panelPrincipal.add(panelDistancia, "Distancia");
		panelPrincipal.add(panelVelocidad, "Velocidad");

		// Building the lateral panel: Creating buttons
		JButton btnInicio = new JButton("CAMBIATODO");
		btnInicio.setFocusPainted(false);
		btnInicio.setBorderPainted(false);
		btnInicio.setBorder(null);
		btnInicio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnInicio.setSelected(true);
		btnInicio.setToolTipText("logo de CambiaTodo");
		btnInicio.setFont(new Font("OCR A Extended", Font.BOLD, 25));
		btnInicio.setBackground(new Color(255, 255, 255));
		btnInicio.setForeground(new Color(82, 109, 130));
		GridBagConstraints gbc_btnInicio = new GridBagConstraints();
		gbc_btnInicio.fill = GridBagConstraints.BOTH;
		gbc_btnInicio.insets = new Insets(0, 0, 5, 0);
		gbc_btnInicio.gridx = 0;
		gbc_btnInicio.gridy = 0;
		panelLateral.add(btnInicio, gbc_btnInicio);

		JButton btnMoneda = new JButton("Moneda");
		btnMoneda.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		btnMoneda.setFocusPainted(false);
		btnMoneda.setBorder(UIManager.getBorder("Button.border"));
		btnMoneda.setBorderPainted(false);
		btnMoneda.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMoneda.setBackground(new Color(82, 109, 130));
		btnMoneda.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_btnMoneda = new GridBagConstraints();
		gbc_btnMoneda.fill = GridBagConstraints.BOTH;
		gbc_btnMoneda.insets = new Insets(0, 0, 5, 0);
		gbc_btnMoneda.gridx = 0;
		gbc_btnMoneda.gridy = 1;
		panelLateral.add(btnMoneda, gbc_btnMoneda);

		JButton btnTemperatura = new JButton("Temperatura");
		btnTemperatura.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		btnTemperatura.setFocusPainted(false);
		btnTemperatura.setBorder(UIManager.getBorder("Button.border"));
		btnTemperatura.setBorderPainted(false);
		btnTemperatura.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnTemperatura.setBackground(new Color(82, 109, 130));
		btnTemperatura.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_btnTemperatura = new GridBagConstraints();
		gbc_btnTemperatura.fill = GridBagConstraints.BOTH;
		gbc_btnTemperatura.insets = new Insets(0, 0, 5, 0);
		gbc_btnTemperatura.gridx = 0;
		gbc_btnTemperatura.gridy = 2;
		panelLateral.add(btnTemperatura, gbc_btnTemperatura);

		JButton btnDistancia = new JButton("Distancia");
		btnDistancia.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		btnDistancia.setFocusPainted(false);
		btnDistancia.setBorder(UIManager.getBorder("Button.border"));
		btnDistancia.setBorderPainted(false);
		btnDistancia.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDistancia.setBackground(new Color(82, 109, 130));
		btnDistancia.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_btnDistancia = new GridBagConstraints();
		gbc_btnDistancia.fill = GridBagConstraints.BOTH;
		gbc_btnDistancia.insets = new Insets(0, 0, 5, 0);
		gbc_btnDistancia.gridx = 0;
		gbc_btnDistancia.gridy = 3;
		panelLateral.add(btnDistancia, gbc_btnDistancia);

		JButton btnVelocidad = new JButton("Velocidad");
		btnVelocidad.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		btnVelocidad.setFocusPainted(false);
		btnVelocidad.setBorder(UIManager.getBorder("Button.border"));
		btnVelocidad.setBorderPainted(false);
		btnVelocidad.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVelocidad.setBackground(new Color(82, 109, 130));
		btnVelocidad.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_btnVelocidad = new GridBagConstraints();
		gbc_btnVelocidad.insets = new Insets(0, 0, 5, 0);
		gbc_btnVelocidad.fill = GridBagConstraints.BOTH;
		gbc_btnVelocidad.gridx = 0;
		gbc_btnVelocidad.gridy = 4;
		panelLateral.add(btnVelocidad, gbc_btnVelocidad);

		// Building the lateral panel: Adding events to the buttons
		btnInicio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				card.show(panelPrincipal, "Inicio");
			}
		});

		btnMoneda.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				card.show(panelPrincipal, "Moneda");
			}
		});

		btnTemperatura.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				card.show(panelPrincipal, "Temperatura");
			}
		});

		btnDistancia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				card.show(panelPrincipal, "Distancia");
			}
		});

		btnVelocidad.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				card.show(panelPrincipal, "Velocidad");
			}
		});

		// Building the panelInicio
		JLabel lblNewLabel = new JLabel("Bienvenido");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 50));
		lblNewLabel.setBounds(10, 10, 777, 70);
		panelInicio.add(lblNewLabel);

		JLabel lblA = new JLabel("a");
		lblA.setHorizontalAlignment(SwingConstants.CENTER);
		lblA.setFont(new Font("Trebuchet MS", Font.PLAIN, 50));
		lblA.setBounds(10, 80, 777, 70);
		panelInicio.add(lblA);

		JLabel lblCambiatodo = new JLabel("CambiaTodo");
		lblCambiatodo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCambiatodo.setFont(new Font("OCR A Extended", Font.BOLD, 90));
		lblCambiatodo.setBounds(10, 150, 777, 100);
		panelInicio.add(lblCambiatodo);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\PC\\eclipse-workspace\\conversor-todo\\src\\imagen.png"));
		lblNewLabel_1.setBounds(10, 285, 777, 286);
		panelInicio.add(lblNewLabel_1);

		// Building the panelMoneda
		ModelPanelPrincipal pnlMoneda = new ModelPanelPrincipal(panelMoneda, "Conversor de Moneda",
				"Moneda Origen", "Moneda Destino", new String[] { "Nuevos Soles", "Dolar estadounidense", "Euros", "Libras esterlinas", "Yen Japonés", "Won sul-coreano"},
				new String[] { "Nuevos Soles", "Dolar estadounidense", "Euros", "Libras esterlinas", "Yen Japonés", "Won sul-coreano"});
		pnlMoneda.buildPanel();
		
		// Building the panelTemperatura
		ModelPanelPrincipal pnlTemperatura = new ModelPanelPrincipal(panelTemperatura, "Conversor de Temperatura",
				"Temperatura Origen", "Temperatura Destino", new String[] { "Celsius", "Fahrenheit", "Kelvin" },
				new String[] { "Celsius", "Fahrenheit", "Kelvin" });
		pnlTemperatura.buildPanel();

		// Building the panelDistancia
		ModelPanelPrincipal pnlDistancia = new ModelPanelPrincipal(panelDistancia, "Conversor de Distancia",
				"Distancia Origen", "Distancia Destino", new String[] { "Metros", "Yardas", "Kilometros" },
				new String[] { "Metros", "Yardas", "Kilometros" });
		pnlDistancia.buildPanel();

		// Building the panelVelocidad
		ModelPanelPrincipal pnlVelocidad = new ModelPanelPrincipal(panelVelocidad, "Conversor de Velocidad",
				"Velocidad Origen", "Velocidad Destino", new String[] { "Metros x segundo", "Kilometros x hora", "Años luz" },
				new String[] { "Metros x segundo", "Kilometros x hora", "Años luz" });
		pnlVelocidad.buildPanel();


		pnlMoneda.btnConvertir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				switch (String.valueOf(pnlMoneda.boxOrigen.getSelectedItem())) {
				case "Nuevos Soles":
					switch (String.valueOf(pnlMoneda.boxDestino.getSelectedItem())) {
					case "Nuevos Soles":
						pnlMoneda.txtDestino.setText(String.valueOf(Double.parseDouble(pnlMoneda.txtOrigen.getText()) * 1.00));
						pnlMoneda.txtResultado.setText("\t" + pnlMoneda.txtOrigen.getText() + " " + pnlMoneda.boxOrigen.getSelectedItem() + "\r\n\t=\r\n\t" + pnlMoneda.txtDestino.getText() + " " + pnlMoneda.boxDestino.getSelectedItem());
						break;
					case "Dolar estadounidense":
						pnlMoneda.txtDestino.setText(String.valueOf(Double.parseDouble(pnlMoneda.txtOrigen.getText()) * 0.27));
						pnlMoneda.txtResultado.setText("\t" + pnlMoneda.txtOrigen.getText() + " " + pnlMoneda.boxOrigen.getSelectedItem() + "\r\n\t=\r\n\t" + pnlMoneda.txtDestino.getText() + " " + pnlMoneda.boxDestino.getSelectedItem());
						break;
					case "Euros":
						pnlMoneda.txtDestino.setText(String.valueOf(Double.parseDouble(pnlMoneda.txtOrigen.getText()) * 0.25));
						pnlMoneda.txtResultado.setText("\t" + pnlMoneda.txtOrigen.getText() + " " + pnlMoneda.boxOrigen.getSelectedItem() + "\r\n\t=\r\n\t" + pnlMoneda.txtDestino.getText() + " " + pnlMoneda.boxDestino.getSelectedItem());
						break;
					case "Libras esterlinas":
						pnlMoneda.txtDestino.setText(String.valueOf(Double.parseDouble(pnlMoneda.txtOrigen.getText()) * 0.22));
						pnlMoneda.txtResultado.setText("\t" + pnlMoneda.txtOrigen.getText() + " " + pnlMoneda.boxOrigen.getSelectedItem() + "\r\n\t=\r\n\t" + pnlMoneda.txtDestino.getText() + " " + pnlMoneda.boxDestino.getSelectedItem());
						break;
					case "Yen Japonés":
						pnlMoneda.txtDestino.setText(String.valueOf(Double.parseDouble(pnlMoneda.txtOrigen.getText()) * 39.53));
						pnlMoneda.txtResultado.setText("\t" + pnlMoneda.txtOrigen.getText() + " " + pnlMoneda.boxOrigen.getSelectedItem() + "\r\n\t=\r\n\t" + pnlMoneda.txtDestino.getText() + " " + pnlMoneda.boxDestino.getSelectedItem());
						break;
					case "Won sul-coreano":
						pnlMoneda.txtDestino.setText(String.valueOf(Double.parseDouble(pnlMoneda.txtOrigen.getText()) * 356.83));
						pnlMoneda.txtResultado.setText("\t" + pnlMoneda.txtOrigen.getText() + " " + pnlMoneda.boxOrigen.getSelectedItem() + "\r\n\t=\r\n\t" + pnlMoneda.txtDestino.getText() + " " + pnlMoneda.boxDestino.getSelectedItem());
						break;
					}
					break;
				case "Dolar estadounidense":
					switch (String.valueOf(pnlMoneda.boxDestino.getSelectedItem())) {
					case "Nuevos Soles":
						pnlMoneda.txtDestino.setText(String.valueOf(Double.parseDouble(pnlMoneda.txtOrigen.getText()) * 3.62));
						pnlMoneda.txtResultado.setText("\t" + pnlMoneda.txtOrigen.getText() + " " + pnlMoneda.boxOrigen.getSelectedItem() + "\r\n\t=\r\n\t" + pnlMoneda.txtDestino.getText() + " " + pnlMoneda.boxDestino.getSelectedItem());
						break;
					case "Dolar estadounidense":
						pnlMoneda.txtDestino.setText(String.valueOf(Double.parseDouble(pnlMoneda.txtOrigen.getText()) * 1.00));
						pnlMoneda.txtResultado.setText("\t" + pnlMoneda.txtOrigen.getText() + " " + pnlMoneda.boxOrigen.getSelectedItem() + "\r\n\t=\r\n\t" + pnlMoneda.txtDestino.getText() + " " + pnlMoneda.boxDestino.getSelectedItem());
						break;
					case "Euros":
						pnlMoneda.txtDestino.setText(String.valueOf(Double.parseDouble(pnlMoneda.txtOrigen.getText()) * 0.92));
						pnlMoneda.txtResultado.setText("\t" + pnlMoneda.txtOrigen.getText() + " " + pnlMoneda.boxOrigen.getSelectedItem() + "\r\n\t=\r\n\t" + pnlMoneda.txtDestino.getText() + " " + pnlMoneda.boxDestino.getSelectedItem());
						break;
					case "Libras esterlinas":
						pnlMoneda.txtDestino.setText(String.valueOf(Double.parseDouble(pnlMoneda.txtOrigen.getText()) * 0.79));
						pnlMoneda.txtResultado.setText("\t" + pnlMoneda.txtOrigen.getText() + " " + pnlMoneda.boxOrigen.getSelectedItem() + "\r\n\t=\r\n\t" + pnlMoneda.txtDestino.getText() + " " + pnlMoneda.boxDestino.getSelectedItem());
						break;
					case "Yen Japonés":
						pnlMoneda.txtDestino.setText(String.valueOf(Double.parseDouble(pnlMoneda.txtOrigen.getText()) * 144.37));
						pnlMoneda.txtResultado.setText("\t" + pnlMoneda.txtOrigen.getText() + " " + pnlMoneda.boxOrigen.getSelectedItem() + "\r\n\t=\r\n\t" + pnlMoneda.txtDestino.getText() + " " + pnlMoneda.boxDestino.getSelectedItem());
						break;
					case "Won sul-coreano":
						pnlMoneda.txtDestino.setText(String.valueOf(Double.parseDouble(pnlMoneda.txtOrigen.getText()) * 1303.80));
						pnlMoneda.txtResultado.setText("\t" + pnlMoneda.txtOrigen.getText() + " " + pnlMoneda.boxOrigen.getSelectedItem() + "\r\n\t=\r\n\t" + pnlMoneda.txtDestino.getText() + " " + pnlMoneda.boxDestino.getSelectedItem());
						break;
					}
					break;
				case "Euros":
					switch (String.valueOf(pnlMoneda.boxDestino.getSelectedItem())) {
					case "Nuevos Soles":
						pnlMoneda.txtDestino.setText(String.valueOf(Double.parseDouble(pnlMoneda.txtOrigen.getText()) * 3.92));
						pnlMoneda.txtResultado.setText("\t" + pnlMoneda.txtOrigen.getText() + " " + pnlMoneda.boxOrigen.getSelectedItem() + "\r\n\t=\r\n\t" + pnlMoneda.txtDestino.getText() + " " + pnlMoneda.boxDestino.getSelectedItem());
						break;
					case "Dolar estadounidense":
						pnlMoneda.txtDestino.setText(String.valueOf(Double.parseDouble(pnlMoneda.txtOrigen.getText()) * 1.08));
						pnlMoneda.txtResultado.setText("\t" + pnlMoneda.txtOrigen.getText() + " " + pnlMoneda.boxOrigen.getSelectedItem() + "\r\n\t=\r\n\t" + pnlMoneda.txtDestino.getText() + " " + pnlMoneda.boxDestino.getSelectedItem());
						break;
					case "Euros":
						pnlMoneda.txtDestino.setText(String.valueOf(Double.parseDouble(pnlMoneda.txtOrigen.getText()) * 1.00));
						pnlMoneda.txtResultado.setText("\t" + pnlMoneda.txtOrigen.getText() + " " + pnlMoneda.boxOrigen.getSelectedItem() + "\r\n\t=\r\n\t" + pnlMoneda.txtDestino.getText() + " " + pnlMoneda.boxDestino.getSelectedItem());
						break;
					case "Libras esterlinas":
						pnlMoneda.txtDestino.setText(String.valueOf(Double.parseDouble(pnlMoneda.txtOrigen.getText()) * 0.85));
						pnlMoneda.txtResultado.setText("\t" + pnlMoneda.txtOrigen.getText() + " " + pnlMoneda.boxOrigen.getSelectedItem() + "\r\n\t=\r\n\t" + pnlMoneda.txtDestino.getText() + " " + pnlMoneda.boxDestino.getSelectedItem());
						break;
					case "Yen Japonés":
						pnlMoneda.txtDestino.setText(String.valueOf(Double.parseDouble(pnlMoneda.txtOrigen.getText()) * 156.65));
						pnlMoneda.txtResultado.setText("\t" + pnlMoneda.txtOrigen.getText() + " " + pnlMoneda.boxOrigen.getSelectedItem() + "\r\n\t=\r\n\t" + pnlMoneda.txtDestino.getText() + " " + pnlMoneda.boxDestino.getSelectedItem());
						break;
					case "Won sul-coreano":
						pnlMoneda.txtDestino.setText(String.valueOf(Double.parseDouble(pnlMoneda.txtOrigen.getText()) * 1414.07));
						pnlMoneda.txtResultado.setText("\t" + pnlMoneda.txtOrigen.getText() + " " + pnlMoneda.boxOrigen.getSelectedItem() + "\r\n\t=\r\n\t" + pnlMoneda.txtDestino.getText() + " " + pnlMoneda.boxDestino.getSelectedItem());
						break;
					}
					break;
				case "Libras esterlinas":
					switch (String.valueOf(pnlMoneda.boxDestino.getSelectedItem())) {
					case "Nuevos Soles":
						pnlMoneda.txtDestino.setText(String.valueOf(Double.parseDouble(pnlMoneda.txtOrigen.getText()) * 4.59));
						pnlMoneda.txtResultado.setText("\t" + pnlMoneda.txtOrigen.getText() + " " + pnlMoneda.boxOrigen.getSelectedItem() + "\r\n\t=\r\n\t" + pnlMoneda.txtDestino.getText() + " " + pnlMoneda.boxDestino.getSelectedItem());
						break;
					case "Dolar estadounidense":
						pnlMoneda.txtDestino.setText(String.valueOf(Double.parseDouble(pnlMoneda.txtOrigen.getText()) * 1.27));
						pnlMoneda.txtResultado.setText("\t" + pnlMoneda.txtOrigen.getText() + " " + pnlMoneda.boxOrigen.getSelectedItem() + "\r\n\t=\r\n\t" + pnlMoneda.txtDestino.getText() + " " + pnlMoneda.boxDestino.getSelectedItem());
						break;
					case "Euros":
						pnlMoneda.txtDestino.setText(String.valueOf(Double.parseDouble(pnlMoneda.txtOrigen.getText()) * 1.17));
						pnlMoneda.txtResultado.setText("\t" + pnlMoneda.txtOrigen.getText() + " " + pnlMoneda.boxOrigen.getSelectedItem() + "\r\n\t=\r\n\t" + pnlMoneda.txtDestino.getText() + " " + pnlMoneda.boxDestino.getSelectedItem());
						break;
					case "Libras esterlinas":
						pnlMoneda.txtDestino.setText(String.valueOf(Double.parseDouble(pnlMoneda.txtOrigen.getText()) * 1.00));
						pnlMoneda.txtResultado.setText("\t" + pnlMoneda.txtOrigen.getText() + " " + pnlMoneda.boxOrigen.getSelectedItem() + "\r\n\t=\r\n\t" + pnlMoneda.txtDestino.getText() + " " + pnlMoneda.boxDestino.getSelectedItem());
						break;
					case "Yen Japonés":
						pnlMoneda.txtDestino.setText(String.valueOf(Double.parseDouble(pnlMoneda.txtOrigen.getText()) * 183.35));
						pnlMoneda.txtResultado.setText("\t" + pnlMoneda.txtOrigen.getText() + " " + pnlMoneda.boxOrigen.getSelectedItem() + "\r\n\t=\r\n\t" + pnlMoneda.txtDestino.getText() + " " + pnlMoneda.boxDestino.getSelectedItem());
						break;
					case "Won sul-coreano":
						pnlMoneda.txtDestino.setText(String.valueOf(Double.parseDouble(pnlMoneda.txtOrigen.getText()) * 1655.17));
						pnlMoneda.txtResultado.setText("\t" + pnlMoneda.txtOrigen.getText() + " " + pnlMoneda.boxOrigen.getSelectedItem() + "\r\n\t=\r\n\t" + pnlMoneda.txtDestino.getText() + " " + pnlMoneda.boxDestino.getSelectedItem());
						break;
					}
					break;
				case "Yen Japonés":
					switch (String.valueOf(pnlMoneda.boxDestino.getSelectedItem())) {
					case "Nuevos Soles":
						pnlMoneda.txtDestino.setText(String.valueOf(Double.parseDouble(pnlMoneda.txtOrigen.getText()) * 0.025));
						pnlMoneda.txtResultado.setText("\t" + pnlMoneda.txtOrigen.getText() + " " + pnlMoneda.boxOrigen.getSelectedItem() + "\r\n\t=\r\n\t" + pnlMoneda.txtDestino.getText() + " " + pnlMoneda.boxDestino.getSelectedItem());
						break;
					case "Dolar estadounidense":
						pnlMoneda.txtDestino.setText(String.valueOf(Double.parseDouble(pnlMoneda.txtOrigen.getText()) * 0.0069));
						pnlMoneda.txtResultado.setText("\t" + pnlMoneda.txtOrigen.getText() + " " + pnlMoneda.boxOrigen.getSelectedItem() + "\r\n\t=\r\n\t" + pnlMoneda.txtDestino.getText() + " " + pnlMoneda.boxDestino.getSelectedItem());
						break;
					case "Euros":
						pnlMoneda.txtDestino.setText(String.valueOf(Double.parseDouble(pnlMoneda.txtOrigen.getText()) * 0.0064));
						pnlMoneda.txtResultado.setText("\t" + pnlMoneda.txtOrigen.getText() + " " + pnlMoneda.boxOrigen.getSelectedItem() + "\r\n\t=\r\n\t" + pnlMoneda.txtDestino.getText() + " " + pnlMoneda.boxDestino.getSelectedItem());
						break;
					case "Libras esterlinas":
						pnlMoneda.txtDestino.setText(String.valueOf(Double.parseDouble(pnlMoneda.txtOrigen.getText()) * 0.0055));
						pnlMoneda.txtResultado.setText("\t" + pnlMoneda.txtOrigen.getText() + " " + pnlMoneda.boxOrigen.getSelectedItem() + "\r\n\t=\r\n\t" + pnlMoneda.txtDestino.getText() + " " + pnlMoneda.boxDestino.getSelectedItem());
						break;
					case "Yen Japonés":
						pnlMoneda.txtDestino.setText(String.valueOf(Double.parseDouble(pnlMoneda.txtOrigen.getText()) * 1.00));
						pnlMoneda.txtResultado.setText("\t" + pnlMoneda.txtOrigen.getText() + " " + pnlMoneda.boxOrigen.getSelectedItem() + "\r\n\t=\r\n\t" + pnlMoneda.txtDestino.getText() + " " + pnlMoneda.boxDestino.getSelectedItem());
						break;
					case "Won sul-coreano":
						pnlMoneda.txtDestino.setText(String.valueOf(Double.parseDouble(pnlMoneda.txtOrigen.getText()) * 9.02));
						pnlMoneda.txtResultado.setText("\t" + pnlMoneda.txtOrigen.getText() + " " + pnlMoneda.boxOrigen.getSelectedItem() + "\r\n\t=\r\n\t" + pnlMoneda.txtDestino.getText() + " " + pnlMoneda.boxDestino.getSelectedItem());
						break;
					}
					break;
				case "Won sul-coreano":
					switch (String.valueOf(pnlMoneda.boxDestino.getSelectedItem())) {
					case "Nuevos Soles":
						pnlMoneda.txtDestino.setText(String.valueOf(Double.parseDouble(pnlMoneda.txtOrigen.getText()) * 0.0028));
						pnlMoneda.txtResultado.setText("\t" + pnlMoneda.txtOrigen.getText() + " " + pnlMoneda.boxOrigen.getSelectedItem() + "\r\n\t=\r\n\t" + pnlMoneda.txtDestino.getText() + " " + pnlMoneda.boxDestino.getSelectedItem());
						break;
					case "Dolar estadounidense":
						pnlMoneda.txtDestino.setText(String.valueOf(Double.parseDouble(pnlMoneda.txtOrigen.getText()) * 0.00077));
						pnlMoneda.txtResultado.setText("\t" + pnlMoneda.txtOrigen.getText() + " " + pnlMoneda.boxOrigen.getSelectedItem() + "\r\n\t=\r\n\t" + pnlMoneda.txtDestino.getText() + " " + pnlMoneda.boxDestino.getSelectedItem());
						break;
					case "Euros":
						pnlMoneda.txtDestino.setText(String.valueOf(Double.parseDouble(pnlMoneda.txtOrigen.getText()) * 0.00071));
						pnlMoneda.txtResultado.setText("\t" + pnlMoneda.txtOrigen.getText() + " " + pnlMoneda.boxOrigen.getSelectedItem() + "\r\n\t=\r\n\t" + pnlMoneda.txtDestino.getText() + " " + pnlMoneda.boxDestino.getSelectedItem());
						break;
					case "Libras esterlinas":
						pnlMoneda.txtDestino.setText(String.valueOf(Double.parseDouble(pnlMoneda.txtOrigen.getText()) * 0.00060));
						pnlMoneda.txtResultado.setText("\t" + pnlMoneda.txtOrigen.getText() + " " + pnlMoneda.boxOrigen.getSelectedItem() + "\r\n\t=\r\n\t" + pnlMoneda.txtDestino.getText() + " " + pnlMoneda.boxDestino.getSelectedItem());
						break;
					case "Yen Japonés":
						pnlMoneda.txtDestino.setText(String.valueOf(Double.parseDouble(pnlMoneda.txtOrigen.getText()) * 0.11));
						pnlMoneda.txtResultado.setText("\t" + pnlMoneda.txtOrigen.getText() + " " + pnlMoneda.boxOrigen.getSelectedItem() + "\r\n\t=\r\n\t" + pnlMoneda.txtDestino.getText() + " " + pnlMoneda.boxDestino.getSelectedItem());
						break;
					case "Won sul-coreano":
						pnlMoneda.txtDestino.setText(String.valueOf(Double.parseDouble(pnlMoneda.txtOrigen.getText()) * 1.00));
						pnlMoneda.txtResultado.setText("\t" + pnlMoneda.txtOrigen.getText() + " " + pnlMoneda.boxOrigen.getSelectedItem() + "\r\n\t=\r\n\t" + pnlMoneda.txtDestino.getText() + " " + pnlMoneda.boxDestino.getSelectedItem());
						break;
					}
					break;
				}
				
				
				
				
			}
		});
	}
}
