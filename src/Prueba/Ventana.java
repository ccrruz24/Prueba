package Prueba;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Ventana extends JFrame {

	public Ventana() {
		 
		
		this.setSize(1000, 1000);
		//this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setMinimumSize(new Dimension(200, 200));
		this.setMaximumSize(new Dimension(1000, 1000));
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(Color.black);
		this.setLayout(null);
		this.setTitle("Ventana chida");
		
		
		try {
			Image iconImage = ImageIO.read(getClass().getResource("/images/image.jpg"));
			
			this.setIconImage(iconImage);
					
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
		JMenuBar barra = new JMenuBar();
		this.setJMenuBar(barra);
		
		JMenu menu1 = new JMenu("Archivo");
		barra.add(menu1);
		
		JMenuItem opt1_mi = new JMenuItem("Nuevo");
		menu1.add(opt1_mi);
		
		JMenuItem opt2_mi = new JMenuItem("Abrir");
		menu1.add(opt2_mi);
		
		JMenuItem opt3_mi = new JMenuItem("Cerrar");
		menu1.add(opt3_mi);
		
		menu1.addSeparator();
		
		
		JMenu menu2 = new JMenu("Guardar");
		menu1.add(menu2);
		
		JMenuItem opt4_mi = new JMenuItem("Guardar");
		menu2.add(opt4_mi);
		
		JMenuItem opt5_mi = new JMenuItem("Guardar como");
		menu2.add(opt5_mi);
		
		
		
		
		this.login();
		//this.registro();
		//this.users();
		
		this.setVisible(true);
		this.repaint();
	}
	
	public void login() {
		
		JPanel login_container = new JPanel() {
			private Image fondo = new ImageIcon(getClass().getResource("/images/login.png")).getImage();

		    @Override
		    protected void paintComponent(Graphics g) {
		        super.paintComponent(g);
		        // Dibujar la imagen ajustada al tamaño del panel
		        g.drawImage(fondo, 0, 0, 400, 600, this);
		    }
		};

		login_container.setSize(400, 600);
		login_container.setLocation(50, 50);
		login_container.setLayout(null);
		this.add(login_container);
		
		//AÑADIR ELEMETOS 
		JLabel tag_title = new JLabel();
		JLabel user = new JLabel();
		JLabel passwor = new JLabel();
		
		tag_title.setText("Bienvenido");
		tag_title.setSize(150, 30);
		tag_title.setLocation(120, 30);
		tag_title.setBackground(Color.white);
		tag_title.setForeground(Color.white);
		tag_title.setOpaque(false);
		tag_title.setFont(new Font("Arial", Font.PLAIN,26));
		tag_title.setVerticalAlignment(JLabel.CENTER);
		tag_title.setHorizontalAlignment(JLabel.CENTER);
		
		user.setText("Usuario");
		user.setSize(110, 20);
		user.setLocation(20, 115);
		user.setBackground(Color.white);
		user.setForeground(Color.white);
		user.setOpaque(false);
		user.setFont(new Font("Arial", Font.PLAIN,18));
		user.setVerticalAlignment(JLabel.CENTER);
		user.setHorizontalAlignment(JLabel.CENTER);
		
		passwor.setText("Contraseña");
		passwor.setSize(110, 20);
		passwor.setLocation(20, 215);
		passwor.setBackground(Color.white);
		passwor.setForeground(Color.white);
		passwor.setOpaque(false);
		passwor.setFont(new Font("Arial", Font.PLAIN,18));
		passwor.setVerticalAlignment(JLabel.CENTER);
		passwor.setHorizontalAlignment(JLabel.CENTER);
		
		login_container.add(tag_title);
		login_container.add(user);
		login_container.add(passwor);
		
		
		JTextField email_input = new JTextField();
		email_input.setSize(280, 40);
		email_input.setLocation(60, 150);
		login_container.add(email_input);
		
		
		JCheckBox rememberme = new JCheckBox("Recordarme");
		rememberme.setSize(100, 20);
		rememberme.setLocation(60, 300);
		rememberme.setOpaque(false);
		rememberme.setForeground(Color.white);
		login_container.add(rememberme);
		
		JButton acces_btn = new JButton();
		acces_btn.setText("Acceder");
		acces_btn.setSize(200, 40);
		acces_btn.setLocation(100, 350);
		acces_btn.setFont(new Font("Arial", Font.ITALIC, 18));
		login_container.add(acces_btn);
		
		JPasswordField password = new JPasswordField();
		password.setSize(280, 40);
		password.setLocation(60, 250);
		login_container.add(password);
		
		

        

		
	}

	public void registro() {
		
		JPanel rgs_container = new JPanel();
		rgs_container.setBounds(500, 50, 400, 600);
		rgs_container.setOpaque(true);
		rgs_container.setBackground(Color.decode("#5836C7"));
		rgs_container.setLayout(null);
		this.add(rgs_container);
		
		//TITULO
		
		//LABEL NAME
		
		JLabel user_name = new JLabel("Nombre de usuario");
		user_name.setBounds(50,50,250,120);
		user_name.setOpaque(false);
		user_name.setForeground(Color.white);
		user_name.setFont(new Font("Arial", Font.PLAIN,24));
		user_name.setVerticalAlignment(JLabel.CENTER);
		user_name.setHorizontalAlignment(JLabel.CENTER);
		rgs_container.add(user_name);
		
		
		JTextField text_name = new JTextField();
		text_name.setBounds(50, 140, 300, 25);
		rgs_container.add(text_name);
		
		
		JLabel register = new JLabel("Registro");
		register.setBounds(50, -10,300,120);
		register.setOpaque(false);
		register.setForeground(Color.white);
		register.setFont(new Font("Arial", Font.PLAIN,26));
		register.setVerticalAlignment(JLabel.CENTER);
		register.setHorizontalAlignment(JLabel.CENTER);
		rgs_container.add(register);
		
		
		
		JLabel bio_tag = new JLabel("BIO");
		bio_tag.setBounds(50, 140, 300, 120);
		bio_tag.setOpaque(false);
		bio_tag.setFont(new Font("Arial", Font.PLAIN, 22));
		bio_tag.setForeground(Color.white);
		bio_tag.setHorizontalAlignment(JLabel.CENTER);
		bio_tag.setVerticalAlignment(JLabel.CENTER);
		rgs_container.add(bio_tag);
		
		//TEXTAREA
		
		JTextArea text_Area = new JTextArea("", 10, 10);
		text_Area.setBounds(50, 50, 400, 40);
		text_Area.setLocation(50, 220);
		text_Area.setSize(300,50);
		text_Area.setOpaque(true);
		rgs_container.add(text_Area);
		
		
		//CHECK BOX
		
		JCheckBox opt_sweet = new JCheckBox("Dulce");
		opt_sweet.setBounds(50, 320, 100, 40);
		opt_sweet.setForeground(Color.white);
		opt_sweet.setOpaque(false);
		rgs_container.add(opt_sweet);
		
		
		JCheckBox opt_salty = new JCheckBox("Salado");
		opt_salty.setBounds(150, 320, 100, 40);
		opt_salty.setForeground(Color.white);
		opt_salty.setOpaque(false);
		rgs_container.add(opt_salty);
		
		
		JCheckBox opt_healty = new JCheckBox("Saludable");
		opt_healty.setBounds(250, 320, 100, 40);
		opt_healty.setForeground(Color.white);
		opt_healty.setOpaque(false);
		rgs_container.add(opt_healty);
		
		
		//LABEL PREFERENCES
		
		JLabel preferences = new JLabel("Preferencias");
		preferences.setBounds(50,240,300,120);
		preferences.setOpaque(false);
		preferences.setForeground(Color.white);
		preferences.setFont(new Font("Arial", Font.PLAIN, 28));
		preferences.setHorizontalAlignment(JLabel.CENTER);
		preferences.setVerticalAlignment(JLabel.CENTER);
		rgs_container.add(preferences);
		
		
		//LABEL TERMS
		
		JLabel terms_text = new JLabel("Terminos");
		terms_text.setBounds(50,320,300,120);
		terms_text.setOpaque(false);
		terms_text.setForeground(Color.white);
		terms_text.setFont(new Font("Arial", Font.PLAIN, 28));
		terms_text.setHorizontalAlignment(JLabel.CENTER);
		terms_text.setVerticalAlignment(JLabel.CENTER);
		rgs_container.add(terms_text);
		
		JRadioButton accept_terms = new JRadioButton("Acepto los terminos");
		accept_terms.setBounds(50, 400, 180, 40);
		accept_terms.setOpaque(false);
		accept_terms.setForeground(Color.white);
		rgs_container.add(accept_terms);
		
		JRadioButton reject_terms = new JRadioButton("Rechazo los terminos ");
		reject_terms.setBounds(220, 400,200, 40);
		reject_terms.setOpaque(false);
		reject_terms.setForeground(Color.white);
		rgs_container.add(reject_terms);
		
		ButtonGroup terms = new ButtonGroup();
		terms.add(accept_terms);
		terms.add(reject_terms);
		
		//COMBO
		String [] colonias = {"Camino real", "Arcoiris", "Villas del encanto", "8 de octubre"};
		JComboBox colonias_combo = new JComboBox(colonias); 
		colonias_combo.setBounds(50, 460, 300, 20);
		rgs_container.add(colonias_combo);
		
		//BUTTON
		JButton register_btn = new JButton("Crear cuenta");
		register_btn.setBounds(50, 500 , 300, 60);
		rgs_container.add(register_btn);
	}
	
	public void users() {
		JPanel panel_users = new JPanel();
		panel_users.setBounds(50, 50, 1000, 650);
		panel_users.setOpaque(true);
		panel_users.setBackground(Color.white);
		panel_users.setLayout(null);
		panel_users.setBorder(BorderFactory.createLineBorder(Color.decode("#D1CDCD"), 5, true));
		panel_users.setBackground(Color.decode("#BBF2F2"));
		this.add(panel_users);
		
		String [] table_head = {"No. Control", "Nombre", "Apellidos", "Correo electrónico", "Semestre", "Carrera", "Acciones"};
		
		Object [][] table_body = {
				 {"2026001", "Carlos", "López García", "carlos.lopez@uni.edu.mx", "3", "Ingeniería en Sistemas", "Editar"},
				 {"2026002", "Ana", "Martínez Pérez", "ana.martinez@uni.edu.mx", "5", "Ingeniería en Sistemas", "Editar"},
				 {"2026003", "Juan", "Hernández Ruiz", "juan.hernandez@uni.edu.mx", "2", "Ingeniería en Sistemas", "Editar"},
				 {"2026004", "María", "González Torres", "maria.gonzalez@uni.edu.mx", "6", "Ingeniería en Sistemas", "Editar"},
				 {"2026005", "José", "Ramírez Díaz", "jose.ramirez@uni.edu.mx", "4", "Ingeniería en Sistemas", "Editar"},
				 {"2026006", "Laura", "Sánchez Vega", "laura.sanchez@uni.edu.mx", "1", "Ingeniería en Sistemas", "Editar"},
				 {"2026007", "Miguel", "Torres Luna", "miguel.torres@uni.edu.mx", "7", "Ingeniería en Sistemas", "Editar"},
				 {"2026008", "Sofía", "Vargas Ortega", "sofia.vargas@uni.edu.mx", "8", "Ingeniería en Sistemas", "Editar"},
				 {"2026009", "Daniel", "Castillo Ramos", "daniel.castillo@uni.edu.mx", "5", "Ingeniería en Sistemas", "Editar"},
				 {"2026010", "Paula", "Mendoza Silva", "paula.mendoza@uni.edu.mx", "3", "Ingeniería en Sistemas", "Editar"},
				 {"2026001", "Carlos", "López García", "carlos.lopez@uni.edu.mx", "3", "Ingeniería en Sistemas", "Editar"},
				 {"2026002", "Ana", "Martínez Pérez", "ana.martinez@uni.edu.mx", "5", "Ingeniería en Sistemas", "Editar"},
				 {"2026003", "Juan", "Hernández Ruiz", "juan.hernandez@uni.edu.mx", "2", "Ingeniería en Sistemas", "Editar"},
				 {"2026004", "María", "González Torres", "maria.gonzalez@uni.edu.mx", "6", "Ingeniería en Sistemas", "Editar"},
				 {"2026005", "José", "Ramírez Díaz", "jose.ramirez@uni.edu.mx", "4", "Ingeniería en Sistemas", "Editar"},
				 {"2026006", "Laura", "Sánchez Vega", "laura.sanchez@uni.edu.mx", "1", "Ingeniería en Sistemas", "Editar"},
				 {"2026007", "Miguel", "Torres Luna", "miguel.torres@uni.edu.mx", "7", "Ingeniería en Sistemas", "Editar"},
				 {"2026008", "Sofía", "Vargas Ortega", "sofia.vargas@uni.edu.mx", "8", "Ingeniería en Sistemas", "Editar"},
				 {"2026009", "Daniel", "Castillo Ramos", "daniel.castillo@uni.edu.mx", "5", "Ingeniería en Sistemas", "Editar"},
				 {"2026010", "Paula", "Mendoza Silva", "paula.mendoza@uni.edu.mx", "3", "Ingeniería en Sistemas", "Editar"}
		};
		
		JTable students = new JTable(table_body,table_head);
		students.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		//students.isCellEditable(ERROR, ABORT);
		
	
		
		JLabel text = new JLabel("Usuario");
		text.setBounds(400,30,200,100);
		text.setFont(new Font("SansSerif", Font.ITALIC, 50));
		text.setHorizontalAlignment(JLabel.CENTER);
		text.setVerticalAlignment(JLabel.CENTER);
		panel_users.add(text);
		
		JLabel text_1 = new JLabel("Usuarios 20");
		text_1.setBounds(80,80,200,100);
		text_1.setOpaque(true);
		text_1.setFont(new Font("SansSerif", Font.ITALIC, 30));
		text_1.setBackground(Color.black);
		text_1.setForeground(Color.white);
		text_1.setHorizontalAlignment(JLabel.CENTER);
		text_1.setVerticalAlignment(JLabel.CENTER);
		panel_users.add(text_1);
		
		
		JScrollPane final_table = new JScrollPane(students);
		final_table.setBounds(80,220,850,345);
		final_table.setBorder(BorderFactory.createLineBorder(Color.black));
		panel_users.add(final_table, BorderLayout.CENTER);
		
		

	}

}