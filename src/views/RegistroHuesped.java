package views;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

@SuppressWarnings("serial")
public class RegistroHuesped extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtTelefono;
	private JTextField txtNreserva;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroHuesped frame = new RegistroHuesped();
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
	public RegistroHuesped() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(RegistroHuesped.class.getResource("/imagenes/persona.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 910, 634);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		txtNombre = new JTextField();
		txtNombre.setBackground(Color.WHITE);
		txtNombre.setColumns(10);
		txtNombre.setBounds(576, 150, 255, 33);
		contentPane.add(txtNombre);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBackground(Color.WHITE);
		txtApellido.setBounds(576, 217, 255, 33);
		contentPane.add(txtApellido);
		
		JDateChooser txtFechaN = new JDateChooser();
		txtFechaN.setBounds(576, 281, 255, 33);
		contentPane.add(txtFechaN);
		
		JComboBox txtNacionalidad = new JComboBox();
		txtNacionalidad.setFont(new Font("Arial", Font.PLAIN, 14));
		txtNacionalidad.setModel(new DefaultComboBoxModel(new String[] {"Afghanistan ??? Afeganist??o", "Afghan ??? afeg??o", "Andorra ??? Andorra", "Andorran ??? andorrano", "Angola ??? Angola", "Angolan ??? angolano", "Antigua e Barbuda ??? Ant??gua e Barbuda", "Antiguan/Barbudan ??? antiguano", "Algeria ??? Arg??lia", "Algerian ??? argelino", "Argentina ??? Argentina", "Argentinian ??? argentino", "Armenia ??? Arm??nia", "Armenian ??? arm??nio", "Australia ??? Austr??lia", "Australian ??? australiano", "Austria ??? ??ustria", "Austrian ??? austr??aco", "Azerbaijan ??? Azerbaij??o", "Azerbaijani ??? azeri", "The Bahamas ??? Bahamas", "Bahamian ??? bahamense", "Bangladesh ??? Bangladesh", "Bangladeshi ??? banglad??s", "Barbados ??? Barbados", "Barbadian ??? barbadiano", "Bahrain ??? Bar??m", "Bahraini ??? baremita", "Belarus ??? Bielorr??ssia", "Belarusian ??? bielorrusso", "Belgium ??? B??lgica", "Belgian ??? belga", "Belize ??? Belize", "Belizean ??? belizenho", "Benin ??? Benim", "Beninese ??? beninense", "Bolivia ??? Bol??via", "Bolivian ??? boliviano", "Bosnia; Bosnia and Herzegovina ??? B??snia; B??snia e Herzegovina", "Bosnian ??? b??snio", "Botswana ??? Botsuana", "Motswana ??? bechuano", "Brazil ??? Brasil", "Brazilian ??? brasileiro", "Brunei ??? Brunei", "Bruneian ??? bruneano", "Bulgaria ??? Bulg??ria", "Bulgarian ??? b??lgaro", "BurkinaFaso ??? BurkinaFaso", "Burkinab?? ??? burquinense", "Burundi ??? Burundi", "Burundian ??? burund??s", "Bhutan ??? But??o", "Bhutanese ??? butanense", "Cape Verde ??? Cabo Verde", "Cape Verdean ??? cabo-verdiano", "Cameroon ??? Camar??es", "Cameroonian ??? camaronense", "Cambodia ??? Camboja", "Cambodian ??? cambojano", "", "Canada ??? Canad??", "Canadian ??? canadense", "", "Central African Republic ??? Rep??blica Centro-Africana", "Central-african ??? centroafricano", "", "Chad ??? Chade", "Chadian ??? chadiano", "", "China ??? China", "Chinese ??? chin??s", "", "Chile ??? Chile", "Chilean ??? chileno", "", "Cook Islands ??? Ilhas Cook", "Cook Islander ??? cookiano", "", "Colombia ??? Col??mbia", "Colombian ??? colombiano", "", "Comoros ??? Comores", "Comoran ??? comoriano", "", "Costa Rica ??? Costa Rica", "Costa Rican ??? costa-riquenho", "", "Croatia ??? Cro??cia", "Croatian ??? croata", "", "Cuba ??? Cuba", "Cuban ??? Cubano", "", "Cyprus ??? Chipre", "Cypriot ??? cipriota", "", "Czech Republic ??? Rep??blica Tcheca", "Czech ??? tcheco", "", "Democratic Republic of Congo ??? Rep??blica Democr??tica do Congo", "Congolese ??? congolense", "", "Denmark ??? Dinamarca", "Danish ??? dinamarqu??s", "", "Djibouti ??? Djibuti", "Djiboutian ??? djibutiense", "", "Dominica ??? Dominica", "Dominican ??? dominiquense", "", "Dominican Republic ??? Rep??blica Dominicana", "Dominican ??? dominicano", "", "East Timor ??? Timor Leste", "East Timorese ??? timorense", "", "Ecuador ??? Equador", "Ecuadorian ??? equatoriano", "", "Egypt ??? Egito", "Egyptian ??? eg??pcio", "", "El Salvador ??? El Salvador", "Salvadorean ??? salvadorenho", "", "England ??? Inglaterra", "English ??? ingl??s", "", "Equatorial Guinea ??? Guin?? Equatorial", "Equatoguinean ??? guin??u-equatoriano", "", "Eritrea ??? Eritreia", "Eritrean ??? eritreu", "", "Est??nia ??? Est??nia", "Estonian ??? estoniano", "", "Fiji ??? Fiji", "Fijian ??? fijiano", "", "Finland ??? Finl??ndia", "Finnish ??? finland??s", "", "France ??? Fran??a", "French ??? franc??s", "", "Gabon ??? Gab??o", "Gabonese ??? gabonense", "", "Gambia ??? G??mbia", "Gambian ??? gambiano", "", "Georgia ??? Ge??rgia", "Georgian ??? ge??rgico", "", "Germany ??? Alemanha", "German ??? alem??o", "", "Grenada ??? Granada", "Grenadian ??? granadino", "", "Greece ??? Gr??cia", "Greek ??? grego", "", "Guatemala ??? Guatemala", "Guatemalan ??? guatemalteco", "", "Guinea ??? Guin??", "Guinean ??? guineano", "", "Guinea???Bissau ??? Guin??Bissau", "Bissau???guinean ??? guineense", "", "Guyana ??? Guiana", "Guyanese ??? guianense", "", "Haiti ??? Haiti", "Haitian ??? haitiano", "", "Holland ??? Holanda", "Dutch ??? holand??s", "", "Honduras ??? Honduras", "Honduran ??? hondurenho", "", "Hungary ??? Hungria", "Hungarian ??? h??ngaro", "", "Iceland ??? Isl??ndia", "Icelander ??? island??s", "", "India ??? ??ndia", "Indian ??? indiano", "", "Indonesia ??? Indon??sia", "Indonesian ??? indon??sio", "", "Iran ??? Ir??", "Iranian ??? iraniano", "", "Ireland ??? Irlanda", "Irish ??? irland??s", "", "Israel ??? Israel", "Israeli ??? israelita", "", "Italy ??? It??lia", "Italian ??? italiano", "", "Ivory Coast ??? Costa do Marfim", "Ivorian??? costa-marfinense", "", "Jamaica ??? Jamaica", "Jamaican ??? jamaicano", "", "Japan ??? Jap??o", "Japanese ??? japon??s", "", "Jordan ??? Jord??nia", "Jordanian ??? jord??o", "", "Kazakhstan ??? Cazaquist??o", "Kazakh ??? cazaque", "", "Kenya ??? Qu??nia", "Kenyan ??? queniano", "", "Kiribati ??? Quiribati", "I-kiribati ??? quiribatiano", "", "Kyrgyzstan ??? Quirguist??o", "Kyrgyzstani ??? quirguistan??s", "", "Kwait ??? Kuwait", "Kwaiti ??? kuwaitiano", "", "Laos ??? Laos", "Laotian ??? laosiano", "", "Latvia ??? Let??nia", "Latvian ??? letoniano", "", "Lebanon ??? L??bano", "Lebanese ??? liban??s", "", "Lesotho ??? Lesoto", "Basotho ??? lesotiano", "", "Liberia ??? Lib??ria", "Liberian ??? liberiano", "", "Liechtenstein ??? Liechtenstein", "Liechtensteiner ??? liechtensteinense", "", "Lithuania ??? Litu??nia", "Lithuanian ??? lituano", "", "Luxembourg ??? Luxemburgo", "Luxembourgish ??? luxemburgu??s", "", "Lybia ??? L??bia", "Lybian ??? l??bio", "", "Macedonia ??? Maced??nia", "Macedonian ??? maced??nio", "", "Madagascar ??? Madagascar", "Malagasy ??? madagascarense", "", "Malaysia ??? Mal??sia", "Malaysian ??? malaio", "", "Malawi ??? Malaui", "Malawian ??? malauiano", "", "Maldives ??? Maldivas", "Maldivian ??? maldivo", "", "Mali ??? M??li", "Malian ??? maliano", "", "Malta ??? Malta", "Maltese ??? malt??s", "", "Mauritius ??? Maur??cio", "Mauritian ??? mauriciano", "", "Mauritia ??? Maurit??nia", "Mauritanian ??? mauritano", "", "Marshall Island ??? Ilhas Marshall", "Marshall Islander ??? marshallino", "", "Micronesia/Federated States of Micronesia ??? Estados Federados da Micron??sia", "Micronesian ??? micron??sio", "", "Mexico ??? M??xico", "Mexican ??? mexicano", "", "Morocco ??? Marrocos", "Moroccan ??? marroquino", "", "Moldova ??? Moldavia", "Moldovan ??? mold??vio", "", "Monaco ??? M??naco", "Monacan ??? monegasco", "", "Mongolia ??? Mong??lia", "Mongolian ??? mongol", "", "Montenegro ??? Montenegro", "Montenegrin ??? montenegrino", "", "Mozambique ??? Mo??ambique", "Mozambican ??? mo??ambicano", "", "Myanmar ??? Myanmar", "Burmese ??? birman??s", "", "Namibia ??? Nam??bia", "Namibian ??? namibiano", "", "Nauru ??? Nauru", "Nauruan ??? nauruano", "", "Nepal ??? Nepal", "Nepali ??? nepal??s", "", "New Zealand ??? Nova Zel??ndia", "NewZealander ??? neozeland??s", "", "Nicaragua ??? Nicar??gua", "Nicaraguan ??? nicaraguense", "", "Niger ??? N??ger", "Nigerien ??? nigerino", "", "Nigeria ??? Nig??ria", "Nigerian ??? nigeriano", "", "Niue ??? Niue", "Niuean ??? niuano", "", "North Korea ??? Cor??ia do Norte", "North korean ??? norte-coreano", "", "Norway ??? Noruega", "Norwegian ??? noruegu??s", "", "Oman ??? Om??", "Omani ??? omanense", "", "Palestine ??? Palestina", "Palestinian ??? palestino", "", "Pakistan ??? Paquist??o", "Pakistanese ??? paquistan??s", "", "Palau ??? Palau", "Palauan ??? palauense", "", "Panama ??? Panam??", "Panamanian ??? panamenho", "", "Papua New Guinea ??? Papua Nova Guin??", "Papua New Guinean ??? papu??sio", "", "Paraguay ??? Paraguai", "Paraguayan ??? paraguaio", "", "Peru ??? Peru", "Peruvian ??? peruano", "", "Philippines ??? Philippines", "Philippine ??? filipino", "", "Poland ??? Pol??nia", "Polish ??? polon??s", "", "Portugal ??? Portugal", "Portuguese ??? portugu??s", "", "Qatar ??? Catar", "Qatari ??? catarense", "", "Romania ??? Rom??nia", "Romanian ??? romeno", "", "Russia ??? R??ssia", "Russian ??? russo", "", "Rwanda ??? Ruanda", "Rwandan ??? ruand??s", "", "Samoa ??? Samoa", "Samoan ??? samoano", "", "Saint Lucia ??? Santa L??cia", "Saint Lucian ??? santa-lucense", "", "Saint Kitts and Nevis ??? S??o Crist??v??o e Nevis", "Kittian ??? s??o-cristovense", "", "San Marino ??? S??o Marino", "San Marinan ??? s??o-marinense", "", "Sao Tom?? and Principe ??? S??o Tom?? e Pr??ncipe", "Sao Tomean ??? s??o-tomense", "", "Saint Vincent and the Grenadines ??? S??o Vicente e Granadinas", "Vicentinian ??? s??o-vicentino", "", "Scotland ??? Esc??cia", "Scottish ??? escoc??s", "", "Senegal ??? Senegal", "Senegalese ??? senegalense", "", "Serbia ??? S??rvia", "Serbian ??? s??rvio", "", "Seychelles ??? Seicheles", "Seychellois ??? seichelense", "", "Sierra Leone ??? Serra Leoa", "Sierra Leonean ??? serra-leon??s", "", "Singapore ??? Singapura", "Singaporean ??? singapurense", "", "Slovakia ??? Eslov??quia", "Slovak ??? eslovaco", "", "Solomon Islands ??? Ilhas Salom??o", "Solomon Islander ??? salom??nico", "", "Somalia ??? Som??lia", "Somali ??? somali", "", "South Africa ??? ??frica do Sul", "South African ??? sul???africano", "", "South Korea ??? Cor??ia do Sul", "Korean ??? coreano", "", "South Sudan ??? Sud??o do Sul", "South Sudanese ??? sul-sudanense", "", "Spain ??? Espanha", "Spanish ??? espanhol", "", "Sri Lanka ??? Sri Lanka", "Sri Lankan ??? srilank??s", "", "Sudan ??? Sud??o", "Sudanese ??? sudanense", "", "Suriname ??? Suriname", "Surinamese ??? surinam??s", "", "Swaziland ??? Suazil??ndia", "Swazi ??? suazi", "", "Sweden ??? Su??cia", "Swedish ??? sueco", "", "Switzerland ??? Su????a", "Swiss ??? su????o", "", "Syria ??? S??ria", "Syrian ??? s??rio", "", "Tajikistan ??? Tadiquist??o", "Tajiki ??? tajique", "Tanzanian ??? tanzaniano", "Thailand ??? Tail??ndia", "Thai ??? tailand??s", "Togo ??? Togo", "Togolese ??? togol??s", "Tonga ??? Tonga", "Tongan ??? tongan??s", "Trinidad and Tobago ??? Trindade e Tobago", "Trinidadian ??? trinit??rio", "", "Tunisia ??? Tun??sia", "Tunisian ??? tunisiano", "Turkmenistan ??? Turcomenist??o", "Turkmen ??? turcomeno", "Turkey ??? Turquia", "Turkish ??? turco", "Tuvalu ??? Tuvalu", "Tuvaluan ??? tuvaluano", "Ukraine ??? Ucr??nia", "Ukrainian ??? ucraniano", "Uganda ??? Uganda", "Ugandan ??? ugand??s", "Uruguay ??? Uruguai", "Uruguayan ??? uruguaio", "United Arab Emirates ??? Emirados ??rabes Unidos", "Emirati ??? ??rabe", "United Kingdom ??? Reino Unido", "British ??? brit??nico", "United States of America ??? Estados Unidos", "American ??? americano", "Uzbekistan ??? Usbequist??o", "Uzbek ??? uzbeque", "Vanuatu ??? Vanuatu", "Ni-vanuatu ??? vanuatuano", "Venezuela ??? Venezuela", "Venezuelan ??? venezuelano", "Vietnam ??? Vietn??", "Vietnamese ??? vietnamita", "Wales ??? Pa??s de Gales", "Welsh ??? gal??s", "Yemen ??? I??men", "Yemeni ??? iemenita", "Zambia ??? Z??mbia", "Zambian ??? zambiano", "Zimbabwe ??? Zimb??bue", "Zimbabwean ??? zimbabueano"}));
		txtNacionalidad.setBounds(576, 350, 255, 33);
		contentPane.add(txtNacionalidad);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(578, 125, 253, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Apellido");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(576, 194, 255, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Fecha de Nascimiento");
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(576, 256, 255, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Nacionalidad");
		lblNewLabel_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1.setBounds(576, 325, 255, 14);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(RegistroHuesped.class.getResource("/imagenes/registro.png")));
		lblNewLabel.setBounds(0, 0, 502, 556);
		contentPane.add(lblNewLabel);
		
		JButton btnCancelar = new JButton("");
		btnCancelar.setIcon(new ImageIcon(RegistroHuesped.class.getResource("/imagenes/cancelar.png")));
		btnCancelar.setBackground(SystemColor.menu);
		btnCancelar.setBounds(764, 543, 54, 41);
		contentPane.add(btnCancelar);
		
		JButton btnGuardar = new JButton("");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Exito exito = new Exito();
				exito.setVisible(true);
				dispose();
			}
		});
		btnGuardar.setIcon(new ImageIcon(RegistroHuesped.class.getResource("/imagenes/disquete.png")));
		btnGuardar.setBackground(SystemColor.menu);
		btnGuardar.setBounds(700, 543, 54, 41);
		contentPane.add(btnGuardar);
		
		JButton btnSalir = new JButton("");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuUsuario usuario = new MenuUsuario();
				usuario.setVisible(true);
				dispose();
			}
		});
		btnSalir.setIcon(new ImageIcon(RegistroHuesped.class.getResource("/imagenes/cerrar-sesion 32-px.png")));
		btnSalir.setBackground(SystemColor.menu);
		btnSalir.setBounds(828, 543, 54, 41);
		contentPane.add(btnSalir);
		
		JLabel lblNewLabel_1_2 = new JLabel("Tel??fono");
		lblNewLabel_1_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(578, 394, 253, 14);
		contentPane.add(lblNewLabel_1_2);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBackground(Color.WHITE);
		txtTelefono.setBounds(576, 419, 255, 33);
		contentPane.add(txtTelefono);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(RegistroHuesped.class.getResource("/imagenes/Ha-100px.png")));
		lblNewLabel_2.setBounds(780, 11, 104, 107);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("Registro de Hu??sped");
		lblNewLabel_4.setForeground(new Color(12, 138, 199));
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_4.setBounds(576, 74, 198, 42);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("N??mero de Reserva");
		lblNewLabel_1_2_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_2_1.setBounds(578, 455, 253, 14);
		contentPane.add(lblNewLabel_1_2_1);
		
		txtNreserva = new JTextField();
		txtNreserva.setEnabled(false);
		txtNreserva.setColumns(10);
		txtNreserva.setBackground(Color.WHITE);
		txtNreserva.setBounds(576, 480, 255, 33);
		contentPane.add(txtNreserva);
	}
}
