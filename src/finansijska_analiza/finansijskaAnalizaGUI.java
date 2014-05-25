package finansijska_analiza;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;


import java.awt.SystemColor;
import java.awt.Font;

import javax.swing.JButton;

import javax.swing.border.LineBorder;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;



import java.awt.Toolkit;



public class finansijskaAnalizaGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblNekretninePostorjenjaI;
	private JLabel lblZemljite;
	private JLabel lblGraevinskiObjekti;
	private JLabel lblPostrojenjaIOprema;
	private JLabel lblObrtnaSredstva;
	private JLabel lblZalihe;
	private JLabel lblRoba;
	private JLabel lblDatiAvansiYa;
	private JLabel lblPotraivanjaOdKupaca;
	private JLabel lblKratkoroniFinansijskiPlasmani;
	private JLabel lblGotovinaIGotovinski;
	private JLabel lblKapitalObaveze;
	private JLabel lblFiksnaSredstva;
	private JLabel lblSredstav;
	private JTextField zemljisteTF;
	private JTextField fiksnaSredstvaTF;
	private JTextField gradjevinskiObjektiTF;
	private JTextField postrojenjaIOpremaTF;
	private JTextField nekretninePostrojenjaIOpremaTF;
	private JLabel label_1;
	private JTextField sredstvaTF;
	private JTextField obrtnaSredstvaTF;
	private JTextField zaliheTF;
	private JTextField robaTF;
	private JTextField datiAvansiZaZaliheIUslugeTF;
	private JTextField kratkorocnaPotrayivanjaPlasmaniIGotovinaTF;
	private JTextField PotrazivanjaOdKupacaTF;
	private JTextField kratkorocniFinansijskiPlasmaniTF;
	private JTextField gotovinaIGotovinskiEkvivalentiTF;
	private JTextField kapitalPlusObavezeTF;
	private JLabel lblNewLabel;
	private JLabel lblKapital;
	private JTextField kapitalTF;
	private JTextField osnovniKapitalTF;
	private JTextField nerasporedjenaDobitTF;
	private JTextField obavezeTF;
	private JTextField dugorocnaRezervisanjaIObavezeTF;
	private JTextField kratkorocneObavezeTF;
	private JTextField kratkorocneFinansijskeObavezeTF;
	private JLabel lblOsnovniKapital;
	private JLabel lblNerasporedjenaDobit;
	private JLabel lblObaveze;
	private JLabel lblDugoronaRezervisanjaI;
	private JLabel lblKratkoroneObaveze;
	private JLabel lblKratkoroneFinansijskeObaveze;
	private JTextField obavezeIzPoslovanjaTF;
	private JTextField obavezePremaDobavljacimaTF;
	private JTextField drugeObavezeTF;
	private JLabel lblObavezeIzPoslovanja;
	private JLabel lblObavezePremaDobavljaima;
	private JLabel lblDrugeObaveze;
	private JLabel bilansStanjaLabela;
	private JTextField prviRacioBrojTF;
	private JComboBox prviRacioBrojComboBox;
	private JComboBox drugiRacioBrojComboBox;
	private JTextField drugiRacioBrojTF;
	private JComboBox treciRacioBrojComboBox;
	private JTextField treciRacioBrojTF;
	private JComboBox cetvrtiRacioBrojComboBox;
	private JTextField cetvrtiRacioBrojTF;
	private JButton izracunajRaciobrojeveBTN;
	private JButton btnUrediBilans;
	private JLabel errorLabela;
	private JLabel potrazivanjeOdKupacaIzPredhodneGodineLabela;
	private JTextField potrazivanjeOdKupacaIzPredhodneGodineTF;
	private JLabel netoPrihodOdProdajeLabela;
	private JTextField netoPrihodOdProdajeTF;
	private JLabel zaliheIzPredhodneGodineLabela;
	private JTextField zaliheIzPredhodneGodineTF;
	private JLabel troskoviProizvodnjeLabela;
	private JTextField troskoviProizvodnjeTF;
	private JLabel FonSlikaLabela;
	public static int index=4; 
	

	/**
	 * Launch the application.
	 */
	  public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					finansijskaAnalizaGUI frame = new finansijskaAnalizaGUI();
					frame.setVisible(true);
				//	JFrame a = new CleaningTextFrame()();
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} 

	
	logika l = new logika();
	private JLabel slikaLbela;
	
	
	
	/**
	 * Create the frame.
	 */
	public finansijskaAnalizaGUI() {
		setTitle("Finansijska analiza");
		setIconImage(Toolkit.getDefaultToolkit().getImage(finansijskaAnalizaGUI.class.getResource("/resources/fonMain.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 5, 750, 730);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(2, 2, 2, 2));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[pref!,grow,left][128.00px,grow][-5.00,grow][14.00px][224px][-87.00,grow][224px,grow]", "[7.00px][grow][23px][grow][][][][][][][][][][][][][][][][][][][][][][][][]"));
		
	//	racioBrojeviFormule racioBrF = new racioBrojeviFormule();
		
		contentPane.add(getBilansStanjaLabela(), "cell 0 1");
		contentPane.add(getBtnUrediBilans(), "cell 1 1,grow");
		contentPane.add(getFonSlikaLabela(), "flowx,cell 6 1");
		contentPane.add(getLabel_1(), "cell 1 2,grow");
		contentPane.add(getLblSredstav(), "cell 0 3,grow");
		contentPane.add(getTextField_15(), "cell 1 3,growx");
		contentPane.add(getNetoPrihodOdProdajeLabela(), "cell 6 3,alignx left,growy");
		contentPane.add(getLblFiksnaSredstva(), "cell 0 4,grow");
		contentPane.add(getFiksnaSredstvaTF(), "cell 1 4,grow");
		contentPane.add(getNetoPrihodOdProdajeTF(), "cell 6 4,grow");
		contentPane.add(getLblNekretninePostorjenjaI(), "cell 0 5,grow");
		contentPane.add(getNekretninePostrojenjaIOpremaTF(), "cell 1 5,grow");
		contentPane.add(getPotrazivanjeOdKupacaIzPredhodneGodineLabela(), "cell 6 5,alignx left");
		contentPane.add(getLblZemljite(), "cell 0 6,grow");
		contentPane.add(getZemljisteTF(), "cell 1 6,grow");
		contentPane.add(getPotrazivanjeOdKupacaIzPredhodneGodineTF(), "cell 6 6,grow");
		contentPane.add(getLblGraevinskiObjekti(), "cell 0 7,grow");
		contentPane.add(getGradjevinskiObjektiTF(), "cell 1 7,grow");
		contentPane.add(getZaliheIzPredhodneGodineLabela(), "cell 6 7,alignx left");
		contentPane.add(getLblPostrojenjaIOprema(), "cell 0 8,grow");
		contentPane.add(getPostrojenjaIOpremaTF(), "cell 1 8,grow");
		contentPane.add(getZaliheIzPredhodneGodineTF(), "cell 6 8,grow");
		contentPane.add(getLblObrtnaSredstva(), "cell 0 9,grow");
		contentPane.add(getTextField_3_1(), "cell 1 9,growx");
		contentPane.add(getTroskoviProizvodnjeLabela(), "cell 6 9,alignx left");
		contentPane.add(getLblZalihe(), "cell 0 10,grow");
		contentPane.add(getTextField_4_1(), "cell 1 10,growx");
		contentPane.add(getTroskoviProizvodnjeTF(), "cell 6 10,growx");
		contentPane.add(getLblRoba(), "cell 0 11,grow");
		contentPane.add(getTextField_8_1(), "cell 1 11,growx");
		contentPane.add(getErrorLabela(), "cell 6 11,grow");
		contentPane.add(getLblDatiAvansiYa(), "cell 0 12,grow");
		contentPane.add(getTextField_9_1(), "cell 1 12,growx");
		contentPane.add(getLblNewLabel(), "cell 0 13,alignx left");
		contentPane.add(getTextField_11_1(), "cell 1 13,growx");
		contentPane.add(getPrviRacioBrojComboBox(), "cell 6 13,growx");
		contentPane.add(getLblPotraivanjaOdKupaca(), "cell 0 14,grow");
		contentPane.add(getTextField_12_1(), "cell 1 14,growx");
		contentPane.add(getTextField_1(), "cell 6 14,growx");
		contentPane.add(getLblKratkoroniFinansijskiPlasmani(), "cell 0 15,grow");
		contentPane.add(getTextField_13_1(), "cell 1 15,growx");
		contentPane.add(getLblGotovinaIGotovinski(), "cell 0 16,grow");
		contentPane.add(getTextField_14_1(), "cell 1 16,grow");
		contentPane.add(getDrugiRacioBrojComboBox(), "cell 6 16,growx");
		contentPane.add(getLblKapitalObaveze(), "cell 0 17,grow");
		contentPane.add(getKapitalPlusObavezeTF(), "cell 1 17,grow");
		contentPane.add(getTextField_2(), "cell 6 17,growx");
		contentPane.add(getLblKapital(), "cell 0 18,grow");
		contentPane.add(getTextField_10_1(), "cell 1 18,growx");
		contentPane.add(getLblOsnovniKapital(), "cell 0 19,alignx left");
		contentPane.add(getOsnovniKapitalTF(), "cell 1 19,growx");
		contentPane.add(getLblNerasporedjenaDobit(), "cell 0 20,alignx left");
		contentPane.add(getNerasporedjenaDobitTF(), "cell 1 20,growx");
		contentPane.add(getTreciRacioBrojComboBox(), "cell 6 20,growx");
		contentPane.add(getLblObaveze(), "cell 0 21,grow");
		contentPane.add(getObavezeTF(), "cell 1 21,growx");
		contentPane.add(getTextField_1_1(), "cell 6 21,growx");
		contentPane.add(getLblDugoronaRezervisanjaI(), "cell 0 22,grow");
		contentPane.add(getDugorocnaRezervisanjaIObavezeTF(), "cell 1 22,growx");
		contentPane.add(getLblKratkoroneObaveze(), "cell 0 23,grow");
		contentPane.add(getKratkorocneObavezeTF(), "cell 1 23,growx");
		contentPane.add(getCetvrtiRacioBrojComboBox(), "cell 6 23,growx");
		contentPane.add(getLblKratkoroneFinansijskeObaveze(), "cell 0 24,grow");
		contentPane.add(getKratkorocneFinansijskeObavezeTF(), "cell 1 24,growx");
		contentPane.add(getTextField_2_1(), "cell 6 24,growx");
		contentPane.add(getLblObavezeIzPoslovanja(), "cell 0 25,grow");
		contentPane.add(getObavezeIzPoslovanjaTF(), "cell 1 25,growx");
		contentPane.add(getLblObavezePremaDobavljaima(), "cell 0 26,alignx left");
		contentPane.add(getObavezePremaDobavljacimaTF(), "cell 1 26,growx");
		contentPane.add(getIzracunajRaciobrojeveBTN(), "cell 6 26,grow");
		contentPane.add(getLblDrugeObaveze(), "cell 0 27,alignx left");
		contentPane.add(getDrugeObavezeTF(), "cell 1 27,growx");
		contentPane.add(getSlikaLbela(), "cell 6 1,grow");
	}
	
	
	
		
		
		
	
	
	
	private JLabel getLblNekretninePostorjenjaI() {
		if (lblNekretninePostorjenjaI == null) {
			lblNekretninePostorjenjaI = new JLabel("NEKRETNINE POSTORJENJA I OPREMA");
			lblNekretninePostorjenjaI.setBorder(new LineBorder(SystemColor.activeCaption));
			lblNekretninePostorjenjaI.setFont(new Font("Arial", Font.BOLD, 10));
		}
		return lblNekretninePostorjenjaI;
	}
	private JLabel getLblZemljite() {
		if (lblZemljite == null) {
			lblZemljite = new JLabel("Zemlji\u0161te");
			lblZemljite.setFont(new Font("Arial", Font.PLAIN, 9));
		}
		return lblZemljite;
	}
	private JLabel getLblGraevinskiObjekti() {
		if (lblGraevinskiObjekti == null) {
			lblGraevinskiObjekti = new JLabel("Gra\u0111evinski objekti");
			lblGraevinskiObjekti.setFont(new Font("Arial", Font.PLAIN, 9));
		}
		return lblGraevinskiObjekti;
	}
	private JLabel getLblPostrojenjaIOprema() {
		if (lblPostrojenjaIOprema == null) {
			lblPostrojenjaIOprema = new JLabel("Postrojenja i oprema");
			lblPostrojenjaIOprema.setFont(new Font("Arial", Font.PLAIN, 9));
		}
		return lblPostrojenjaIOprema;
	}
	private JLabel getLblObrtnaSredstva() {
		if (lblObrtnaSredstva == null) {
			lblObrtnaSredstva = new JLabel("OBRTNA SREDSTVA");
			lblObrtnaSredstva.setBorder(new LineBorder(SystemColor.activeCaption));
			lblObrtnaSredstva.setFont(new Font("Arial", Font.BOLD, 10));
		}
		return lblObrtnaSredstva;
	}
	private JLabel getLblZalihe() {
		if (lblZalihe == null) {
			lblZalihe = new JLabel("ZALIHE");
			lblZalihe.setBorder(new LineBorder(SystemColor.activeCaption));
			lblZalihe.setFont(new Font("Arial", Font.BOLD, 10));
		}
		return lblZalihe;
	}
	private JLabel getLblRoba() {
		if (lblRoba == null) {
			lblRoba = new JLabel("Roba");
			lblRoba.setFont(new Font("Arial", Font.PLAIN, 9));
		}
		return lblRoba;
	}
	private JLabel getLblDatiAvansiYa() {
		if (lblDatiAvansiYa == null) {
			lblDatiAvansiYa = new JLabel("Dati avansi za zalihe i usluge");
			lblDatiAvansiYa.setFont(new Font("Arial", Font.PLAIN, 9));
		}
		return lblDatiAvansiYa;
	}
	private JLabel getLblPotraivanjaOdKupaca() {
		if (lblPotraivanjaOdKupaca == null) {
			lblPotraivanjaOdKupaca = new JLabel("Potra\u017Eivanja od kupaca");
			lblPotraivanjaOdKupaca.setFont(new Font("Arial", Font.PLAIN, 9));
		}
		return lblPotraivanjaOdKupaca;
	}
	private JLabel getLblKratkoroniFinansijskiPlasmani() {
		if (lblKratkoroniFinansijskiPlasmani == null) {
			lblKratkoroniFinansijskiPlasmani = new JLabel("Kratkoro\u010Dni finansijski plasmani");
			lblKratkoroniFinansijskiPlasmani.setFont(new Font("Arial", Font.PLAIN, 9));
		}
		return lblKratkoroniFinansijskiPlasmani;
	}
	private JLabel getLblGotovinaIGotovinski() {
		if (lblGotovinaIGotovinski == null) {
			lblGotovinaIGotovinski = new JLabel("Gotovina, i gotovinski ekvivalenti");
			lblGotovinaIGotovinski.setFont(new Font("Arial", Font.PLAIN, 9));
		}
		return lblGotovinaIGotovinski;
	}
	private JLabel getLblKapitalObaveze() {
		if (lblKapitalObaveze == null) {
			lblKapitalObaveze = new JLabel("KAPITAL + OBAVEZE");
			lblKapitalObaveze.setBackground(SystemColor.controlShadow);
			lblKapitalObaveze.setBorder(new LineBorder(new Color(0, 0, 0)));
			lblKapitalObaveze.setFont(new Font("Arial", Font.BOLD, 10));
		}
		return lblKapitalObaveze;
	}
	private JLabel getLblFiksnaSredstva() {
		if (lblFiksnaSredstva == null) {
			lblFiksnaSredstva = new JLabel("FIKSNA SREDSTVA");
			lblFiksnaSredstva.setBorder(new LineBorder(SystemColor.activeCaption));
			lblFiksnaSredstva.setFont(new Font("Arial", Font.BOLD, 10));
		}
		return lblFiksnaSredstva;
	}
	private JLabel getLblSredstav() {
		if (lblSredstav == null) {
			lblSredstav = new JLabel("SREDSTVA");
			lblSredstav.setBackground(SystemColor.controlShadow);
			lblSredstav.setBorder(new LineBorder(new Color(0, 0, 0)));
			lblSredstav.setFont(new Font("Arial", Font.BOLD, 10));
		}
		return lblSredstav;
	}
	private JTextField getZemljisteTF() {
		if (zemljisteTF == null) {
			zemljisteTF = new JTextField();
			zemljisteTF.setHorizontalAlignment(SwingConstants.RIGHT);
			zemljisteTF.setColumns(10);
			zemljisteTF.setText("0");
		}
		return zemljisteTF;
	}
	private JTextField getFiksnaSredstvaTF() {
		if (fiksnaSredstvaTF == null) {
			fiksnaSredstvaTF = new JTextField();
			fiksnaSredstvaTF.setHorizontalAlignment(SwingConstants.RIGHT);
			fiksnaSredstvaTF.setFocusable(false);
			fiksnaSredstvaTF.setEditable(false);
			fiksnaSredstvaTF.setColumns(10);
			fiksnaSredstvaTF.setText("0");
		}
		return fiksnaSredstvaTF;
	}
	private JTextField getGradjevinskiObjektiTF() {
		if (gradjevinskiObjektiTF == null) {
			gradjevinskiObjektiTF = new JTextField();
			gradjevinskiObjektiTF.setHorizontalAlignment(SwingConstants.RIGHT);
			gradjevinskiObjektiTF.setColumns(10);
			gradjevinskiObjektiTF.setText("0");
		}
		return gradjevinskiObjektiTF;
	}
	private JTextField getPostrojenjaIOpremaTF() {
		if (postrojenjaIOpremaTF == null) {
			postrojenjaIOpremaTF = new JTextField();
			postrojenjaIOpremaTF.setHorizontalAlignment(SwingConstants.RIGHT);
			postrojenjaIOpremaTF.setColumns(10);
			postrojenjaIOpremaTF.setText("0");
		}
		return postrojenjaIOpremaTF;
	}
	private JTextField getNekretninePostrojenjaIOpremaTF() {
		if (nekretninePostrojenjaIOpremaTF == null) {
			nekretninePostrojenjaIOpremaTF = new JTextField();
			nekretninePostrojenjaIOpremaTF.setHorizontalAlignment(SwingConstants.RIGHT);
			nekretninePostrojenjaIOpremaTF.setEditable(false);
			nekretninePostrojenjaIOpremaTF.setColumns(10);
			nekretninePostrojenjaIOpremaTF.setText("0");
		}
		return nekretninePostrojenjaIOpremaTF;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("");
		}
		return label_1;
	}
	private JTextField getTextField_15() {
		if (sredstvaTF == null) {
			sredstvaTF = new JTextField();
			sredstvaTF.setHorizontalAlignment(SwingConstants.RIGHT);
			sredstvaTF.setFocusCycleRoot(true);
			sredstvaTF.setFocusTraversalPolicyProvider(true);
			sredstvaTF.setEditable(false);
			sredstvaTF.setColumns(10);
			sredstvaTF.setText("0");
		}
		return sredstvaTF;
	}
	private JTextField getTextField_3_1() {
		if (obrtnaSredstvaTF == null) {
			obrtnaSredstvaTF = new JTextField();
			obrtnaSredstvaTF.setHorizontalAlignment(SwingConstants.RIGHT);
			obrtnaSredstvaTF.setFocusable(false);
			obrtnaSredstvaTF.setEditable(false);
			obrtnaSredstvaTF.setColumns(10);
			obrtnaSredstvaTF.setText("0");
			
		}
		return obrtnaSredstvaTF;
	}
	private JTextField getTextField_4_1() {
		if (zaliheTF == null) {
			zaliheTF = new JTextField();
			zaliheTF.setHorizontalAlignment(SwingConstants.RIGHT);
			zaliheTF.setEditable(false);
			zaliheTF.setColumns(10);
			zaliheTF.setText("0");
		}
		return zaliheTF;
	}
	private JTextField getTextField_8_1() {
		if (robaTF == null) {
			robaTF = new JTextField();
			robaTF.setHorizontalAlignment(SwingConstants.RIGHT);
			robaTF.setColumns(10);
			robaTF.setText("0");
			
		}
		return robaTF;
	}
	private JTextField getTextField_9_1() {
		if (datiAvansiZaZaliheIUslugeTF == null) {
			datiAvansiZaZaliheIUslugeTF = new JTextField();
			datiAvansiZaZaliheIUslugeTF.setHorizontalAlignment(SwingConstants.RIGHT);
			datiAvansiZaZaliheIUslugeTF.setColumns(10);
			datiAvansiZaZaliheIUslugeTF.setText("0");
		}
		return datiAvansiZaZaliheIUslugeTF;
	}
	private JTextField getTextField_11_1() {
		if (kratkorocnaPotrayivanjaPlasmaniIGotovinaTF == null) {
			kratkorocnaPotrayivanjaPlasmaniIGotovinaTF = new JTextField();
			kratkorocnaPotrayivanjaPlasmaniIGotovinaTF.setEditable(false);
			kratkorocnaPotrayivanjaPlasmaniIGotovinaTF.setHorizontalAlignment(SwingConstants.RIGHT);
			kratkorocnaPotrayivanjaPlasmaniIGotovinaTF.setColumns(10);
			kratkorocnaPotrayivanjaPlasmaniIGotovinaTF.setText("0");
		}
		return kratkorocnaPotrayivanjaPlasmaniIGotovinaTF;
	}
	private JTextField getTextField_12_1() {
		if (PotrazivanjaOdKupacaTF == null) {
			PotrazivanjaOdKupacaTF = new JTextField();
			PotrazivanjaOdKupacaTF.setHorizontalAlignment(SwingConstants.RIGHT);
			PotrazivanjaOdKupacaTF.setColumns(10);
			PotrazivanjaOdKupacaTF.setText("0");
		}
		return PotrazivanjaOdKupacaTF;
	}
	private JTextField getTextField_13_1() {
		if (kratkorocniFinansijskiPlasmaniTF == null) {
			kratkorocniFinansijskiPlasmaniTF = new JTextField();
			kratkorocniFinansijskiPlasmaniTF.setHorizontalAlignment(SwingConstants.RIGHT);
			kratkorocniFinansijskiPlasmaniTF.setColumns(10);
			kratkorocniFinansijskiPlasmaniTF.setText("0");
		}
		return kratkorocniFinansijskiPlasmaniTF;
	}
	private JTextField getTextField_14_1() {
		if (gotovinaIGotovinskiEkvivalentiTF == null) {
			gotovinaIGotovinskiEkvivalentiTF = new JTextField();
			gotovinaIGotovinskiEkvivalentiTF.setHorizontalAlignment(SwingConstants.RIGHT);
			gotovinaIGotovinskiEkvivalentiTF.setColumns(10);
			gotovinaIGotovinskiEkvivalentiTF.setText("0");
		}
		return gotovinaIGotovinskiEkvivalentiTF;
	}
	private JTextField getKapitalPlusObavezeTF() {
		if (kapitalPlusObavezeTF == null) {
			kapitalPlusObavezeTF = new JTextField();
			kapitalPlusObavezeTF.setHorizontalAlignment(SwingConstants.RIGHT);
			kapitalPlusObavezeTF.setFocusable(false);
			kapitalPlusObavezeTF.setEditable(false);
			kapitalPlusObavezeTF.setColumns(10);
			kapitalPlusObavezeTF.setText("0");
		}
		return kapitalPlusObavezeTF;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("KRATKORO\u010CNA POTRA\u017DIVANJA, PLASMANI I GOTOVINA");
			lblNewLabel.setAutoscrolls(true);
			lblNewLabel.setFont(new Font("Arial", Font.BOLD, 10));
		}
		return lblNewLabel;
	}
	private JLabel getLblKapital() {
		if (lblKapital == null) {
			lblKapital = new JLabel("KAPITAL");
			lblKapital.setBorder(new LineBorder(SystemColor.activeCaption));
			lblKapital.setFont(new Font("Arial", Font.BOLD, 10));
		}
		return lblKapital;
	}
	private JTextField getTextField_10_1() {
		if (kapitalTF == null) {
			kapitalTF = new JTextField();
			kapitalTF.setHorizontalAlignment(SwingConstants.RIGHT);
			kapitalTF.setFocusable(false);
			kapitalTF.setEditable(false);
			kapitalTF.setColumns(10);
			kapitalTF.setText("0");
		}
		return kapitalTF;
	}
	private JTextField getOsnovniKapitalTF() {
		if (osnovniKapitalTF == null) {
			osnovniKapitalTF = new JTextField();
			osnovniKapitalTF.setHorizontalAlignment(SwingConstants.RIGHT);
			osnovniKapitalTF.setColumns(10);
			osnovniKapitalTF.setText("0");
		}
		return osnovniKapitalTF;
	}
	private JTextField getNerasporedjenaDobitTF() {
		if (nerasporedjenaDobitTF == null) {
			nerasporedjenaDobitTF = new JTextField();
			nerasporedjenaDobitTF.setHorizontalAlignment(SwingConstants.RIGHT);
			nerasporedjenaDobitTF.setColumns(10);
			nerasporedjenaDobitTF.setText("0");
		}
		return nerasporedjenaDobitTF;
	}
	private JTextField getObavezeTF() {
		if (obavezeTF == null) {
			obavezeTF = new JTextField();
			obavezeTF.setHorizontalAlignment(SwingConstants.RIGHT);
			obavezeTF.setFocusable(false);
			obavezeTF.setEditable(false);
			obavezeTF.setColumns(10);
			obavezeTF.setText("0");
		}
		return obavezeTF;
	}
	private JTextField getDugorocnaRezervisanjaIObavezeTF() {
		if (dugorocnaRezervisanjaIObavezeTF == null) {
			dugorocnaRezervisanjaIObavezeTF = new JTextField();
			dugorocnaRezervisanjaIObavezeTF.setHorizontalAlignment(SwingConstants.RIGHT);
			dugorocnaRezervisanjaIObavezeTF.setColumns(10);
			dugorocnaRezervisanjaIObavezeTF.setText("0");
		}
		return dugorocnaRezervisanjaIObavezeTF;
	}
	private JTextField getKratkorocneObavezeTF() {
		if (kratkorocneObavezeTF == null) {
			kratkorocneObavezeTF = new JTextField();
			kratkorocneObavezeTF.setHorizontalAlignment(SwingConstants.RIGHT);
			kratkorocneObavezeTF.setFocusable(false);
			kratkorocneObavezeTF.setEditable(false);
			kratkorocneObavezeTF.setColumns(10);
			kratkorocneObavezeTF.setText("0");
		}
		return kratkorocneObavezeTF;
	}
	private JTextField getKratkorocneFinansijskeObavezeTF() {
		if (kratkorocneFinansijskeObavezeTF == null) {
			kratkorocneFinansijskeObavezeTF = new JTextField();
			kratkorocneFinansijskeObavezeTF.setHorizontalAlignment(SwingConstants.RIGHT);
			kratkorocneFinansijskeObavezeTF.setColumns(10);
			kratkorocneFinansijskeObavezeTF.setText("0");
		}
		return kratkorocneFinansijskeObavezeTF;
	}
	private JLabel getLblOsnovniKapital() {
		if (lblOsnovniKapital == null) {
			lblOsnovniKapital = new JLabel("Osnovni kapital");
			lblOsnovniKapital.setFont(new Font("Arial", Font.PLAIN, 9));
		}
		return lblOsnovniKapital;
	}
	private JLabel getLblNerasporedjenaDobit() {
		if (lblNerasporedjenaDobit == null) {
			lblNerasporedjenaDobit = new JLabel("Nerasporedjena dobit");
			lblNerasporedjenaDobit.setFont(new Font("Arial", Font.PLAIN, 9));
		}
		return lblNerasporedjenaDobit;
	}
	private JLabel getLblObaveze() {
		if (lblObaveze == null) {
			lblObaveze = new JLabel("OBAVEZE");
			lblObaveze.setBorder(new LineBorder(SystemColor.activeCaption));
			lblObaveze.setFont(new Font("Arial", Font.BOLD, 10));
		}
		return lblObaveze;
	}
	private JLabel getLblDugoronaRezervisanjaI() {
		if (lblDugoronaRezervisanjaI == null) {
			lblDugoronaRezervisanjaI = new JLabel("DUGORO\u010CNA REZERVISANJA I OBAVEZE");
			lblDugoronaRezervisanjaI.setBorder(null);
			lblDugoronaRezervisanjaI.setFont(new Font("Arial", Font.BOLD, 10));
		}
		return lblDugoronaRezervisanjaI;
	}
	private JLabel getLblKratkoroneObaveze() {
		if (lblKratkoroneObaveze == null) {
			lblKratkoroneObaveze = new JLabel("KRATKORO\u010CNE OBAVEZE");
			lblKratkoroneObaveze.setBorder(new LineBorder(SystemColor.activeCaption));
			lblKratkoroneObaveze.setFont(new Font("Arial", Font.BOLD, 10));
		}
		return lblKratkoroneObaveze;
	}
	private JLabel getLblKratkoroneFinansijskeObaveze() {
		if (lblKratkoroneFinansijskeObaveze == null) {
			lblKratkoroneFinansijskeObaveze = new JLabel("KRATKORO\u010CNE FINANSIJSKE OBAVEZE");
			lblKratkoroneFinansijskeObaveze.setBorder(null);
			lblKratkoroneFinansijskeObaveze.setFont(new Font("Arial", Font.BOLD, 10));
		}
		return lblKratkoroneFinansijskeObaveze;
	}
	private JTextField getObavezeIzPoslovanjaTF() {
		if (obavezeIzPoslovanjaTF == null) {
			obavezeIzPoslovanjaTF = new JTextField();
			obavezeIzPoslovanjaTF.setHorizontalAlignment(SwingConstants.RIGHT);
			obavezeIzPoslovanjaTF.setFocusable(false);
			obavezeIzPoslovanjaTF.setEditable(false);
			obavezeIzPoslovanjaTF.setColumns(10);
			obavezeIzPoslovanjaTF.setText("0");
		}
		return obavezeIzPoslovanjaTF;
	}
	private JTextField getObavezePremaDobavljacimaTF() {
		if (obavezePremaDobavljacimaTF == null) {
			obavezePremaDobavljacimaTF = new JTextField();
			obavezePremaDobavljacimaTF.setHorizontalAlignment(SwingConstants.RIGHT);
			obavezePremaDobavljacimaTF.setColumns(10);
			obavezePremaDobavljacimaTF.setText("0");
		}
		return obavezePremaDobavljacimaTF;
	}
	private JTextField getDrugeObavezeTF() {
		if (drugeObavezeTF == null) {
			drugeObavezeTF = new JTextField();
			drugeObavezeTF.setHorizontalAlignment(SwingConstants.RIGHT);
			drugeObavezeTF.setColumns(10);
			drugeObavezeTF.setText("0");
		}
		return drugeObavezeTF;
	}
	private JLabel getLblObavezeIzPoslovanja() {
		if (lblObavezeIzPoslovanja == null) {
			lblObavezeIzPoslovanja = new JLabel("OBAVEZE IZ POSLOVANJA");
			lblObavezeIzPoslovanja.setBorder(new LineBorder(SystemColor.activeCaption));
			lblObavezeIzPoslovanja.setFont(new Font("Arial", Font.BOLD, 10));
		}
		return lblObavezeIzPoslovanja;
	}
	private JLabel getLblObavezePremaDobavljaima() {
		if (lblObavezePremaDobavljaima == null) {
			lblObavezePremaDobavljaima = new JLabel("Obaveze prema dobavlja\u010Dima");
			lblObavezePremaDobavljaima.setFont(new Font("Arial", Font.PLAIN, 9));
		}
		return lblObavezePremaDobavljaima;
	}
	private JLabel getLblDrugeObaveze() {
		if (lblDrugeObaveze == null) {
			lblDrugeObaveze = new JLabel("Druge obaveze");
			lblDrugeObaveze.setFont(new Font("Arial", Font.PLAIN, 9));
		}
		return lblDrugeObaveze;
	}
	private JLabel getBilansStanjaLabela() {
		if (bilansStanjaLabela == null) {
			bilansStanjaLabela = new JLabel("BILANS STANJA");
			bilansStanjaLabela.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		}
		return bilansStanjaLabela;
	}
	private JTextField getTextField_1() {
		if (prviRacioBrojTF == null) {
			prviRacioBrojTF = new JTextField();
			prviRacioBrojTF.setEditable(false);
			prviRacioBrojTF.setColumns(10);
		}
		return prviRacioBrojTF;
	}
	private JComboBox getPrviRacioBrojComboBox() {
		if (prviRacioBrojComboBox == null) {
			prviRacioBrojComboBox = new JComboBox();
			prviRacioBrojComboBox.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent arg0) {		
					pomocneKomponente(prviRacioBrojComboBox.getSelectedIndex());				
				}
			});
			
			
			for(int i=0; i<logika.racioBrojeviBilansStanja.length;i++){
			prviRacioBrojComboBox.addItem(logika.racioBrojeviBilansStanja[i]);
			}
			
			
		}
		return prviRacioBrojComboBox;
	}
	private JComboBox getDrugiRacioBrojComboBox() {
		if (drugiRacioBrojComboBox == null) {
			drugiRacioBrojComboBox = new JComboBox();
			drugiRacioBrojComboBox.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					pomocneKomponente(drugiRacioBrojComboBox.getSelectedIndex());
				}
			});
			
			
			for(int i=0; i<logika.racioBrojeviBilansStanja.length;i++){
				drugiRacioBrojComboBox.addItem(logika.racioBrojeviBilansStanja[i]);
			}
			drugiRacioBrojComboBox.setSelectedIndex(1);
			
		}
		return drugiRacioBrojComboBox;
	}
	private JTextField getTextField_2() {
		if (drugiRacioBrojTF == null) {
			drugiRacioBrojTF = new JTextField();
			drugiRacioBrojTF.setEditable(false);
			drugiRacioBrojTF.setColumns(10);
		}
		return drugiRacioBrojTF;
	}
	private JComboBox getTreciRacioBrojComboBox() {
		if (treciRacioBrojComboBox == null) {
			treciRacioBrojComboBox = new JComboBox();
			treciRacioBrojComboBox.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					pomocneKomponente(treciRacioBrojComboBox.getSelectedIndex());
				}
			});
			
			
			for(int i=0; i<logika.racioBrojeviBilansStanja.length;i++){
				treciRacioBrojComboBox.addItem(logika.racioBrojeviBilansStanja[i]);
			}
			treciRacioBrojComboBox.setSelectedIndex(2);
			
		}
		return treciRacioBrojComboBox;
	}
	private JTextField getTextField_1_1() {
		if (treciRacioBrojTF == null) {
			treciRacioBrojTF = new JTextField();
			treciRacioBrojTF.setEditable(false);
			treciRacioBrojTF.setColumns(10);
		}
		return treciRacioBrojTF;
	}
	private JComboBox getCetvrtiRacioBrojComboBox() {
		if (cetvrtiRacioBrojComboBox == null) {
			cetvrtiRacioBrojComboBox = new JComboBox();
			cetvrtiRacioBrojComboBox.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					pomocneKomponente(cetvrtiRacioBrojComboBox.getSelectedIndex());
				}
			});
			
			
			for(int i=0; i<logika.racioBrojeviBilansStanja.length;i++){
				cetvrtiRacioBrojComboBox.addItem(logika.racioBrojeviBilansStanja[i]);
			}
			cetvrtiRacioBrojComboBox.setSelectedIndex(5);
			
		}
		return cetvrtiRacioBrojComboBox;
	}
	private JTextField getTextField_2_1() {
		if (cetvrtiRacioBrojTF == null) {
			cetvrtiRacioBrojTF = new JTextField();
			cetvrtiRacioBrojTF.setEditable(false);
			cetvrtiRacioBrojTF.setColumns(10);
		}
		return cetvrtiRacioBrojTF;
	}
	private JButton getIzracunajRaciobrojeveBTN() {
		if (izracunajRaciobrojeveBTN == null) {
			izracunajRaciobrojeveBTN = new JButton("Izracunaj racio brojeve");
			izracunajRaciobrojeveBTN.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					
					logika.pomocneKomponenteZaRacioBrojeve( netoPrihodOdProdajeTF.getText(), potrazivanjeOdKupacaIzPredhodneGodineTF.getText(),
							zaliheIzPredhodneGodineTF.getText(), troskoviProizvodnjeTF.getText());
					
					prviRacioBrojTF.setText(logika.izracunajRacioBrojeveBilansStanja(prviRacioBrojComboBox.getSelectedIndex())+"");
					drugiRacioBrojTF.setText(logika.izracunajRacioBrojeveBilansStanja(drugiRacioBrojComboBox.getSelectedIndex())+"");
					treciRacioBrojTF.setText(logika.izracunajRacioBrojeveBilansStanja(treciRacioBrojComboBox.getSelectedIndex())+"");
					cetvrtiRacioBrojTF.setText(logika.izracunajRacioBrojeveBilansStanja(cetvrtiRacioBrojComboBox.getSelectedIndex())+"");
					
					
					errorLabela.setText("");
					errorLabela.setText(logika.error); // u slucaju unosa NeBroja
				}
			});
		}
		return izracunajRaciobrojeveBTN;
	}

	private JButton getBtnUrediBilans() {
		if (btnUrediBilans == null) {
			btnUrediBilans = new JButton("Uredi bilans");
			btnUrediBilans.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					
					logika.popuniBilans(zemljisteTF.getText(), gradjevinskiObjektiTF.getText(),
							postrojenjaIOpremaTF.getText(), robaTF.getText(),
							datiAvansiZaZaliheIUslugeTF.getText(), PotrazivanjaOdKupacaTF.getText(),
							kratkorocniFinansijskiPlasmaniTF.getText(), gotovinaIGotovinskiEkvivalentiTF.getText(),
							osnovniKapitalTF.getText(), nerasporedjenaDobitTF.getText(),
							dugorocnaRezervisanjaIObavezeTF.getText(), kratkorocneFinansijskeObavezeTF.getText(),
							obavezePremaDobavljacimaTF.getText(), drugeObavezeTF.getText());
					
					
					
					sredstvaTF.setText(logika.sredstva+"");
					fiksnaSredstvaTF.setText(logika.fiksnaSredstva+"");
					nekretninePostrojenjaIOpremaTF.setText(logika.nekretninePostrojenjaIOprema+"");
					obrtnaSredstvaTF.setText(logika.obrtnaSredstva+"");
					kratkorocnaPotrayivanjaPlasmaniIGotovinaTF.setText(logika.kratkorocnaPotrazivanjaPlasmaniIGotovina+"");
					kapitalPlusObavezeTF.setText(logika.kapitalPlusObaveze+"");
					kapitalTF.setText(logika.kapital+"");
					obavezeTF.setText(logika.obaveze+"");
					kratkorocneObavezeTF.setText(logika.kratkorocneObaveze+"");
					obavezeIzPoslovanjaTF.setText(logika.obavezeIzPoslovanja+"");
					
						errorLabela.setText("");
						errorLabela.setText(logika.error); // u slucaju unosa NeBroja
					
					
				}
			});
			btnUrediBilans.setActionCommand("Uredi bilans");
		}
		return btnUrediBilans;
	}
	
	
	
	
	
	
	
	
	private JLabel getErrorLabela() {
		if (errorLabela == null) {
			errorLabela = new JLabel("");
			errorLabela.setForeground(Color.RED);
			errorLabela.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return errorLabela;
	}
	private JLabel getPotrazivanjeOdKupacaIzPredhodneGodineLabela() {
		if (potrazivanjeOdKupacaIzPredhodneGodineLabela == null) {
			potrazivanjeOdKupacaIzPredhodneGodineLabela = new JLabel("Potra\u017Eivanja od kupaca iz predhodne godine:");
			potrazivanjeOdKupacaIzPredhodneGodineLabela.setVisible(false);
		}
		return potrazivanjeOdKupacaIzPredhodneGodineLabela;
	}
	private JTextField getPotrazivanjeOdKupacaIzPredhodneGodineTF() {
		if (potrazivanjeOdKupacaIzPredhodneGodineTF == null) {
			potrazivanjeOdKupacaIzPredhodneGodineTF = new JTextField();
			potrazivanjeOdKupacaIzPredhodneGodineTF.setVisible(false);
			potrazivanjeOdKupacaIzPredhodneGodineTF.setText("0");
			potrazivanjeOdKupacaIzPredhodneGodineTF.setColumns(10);
		}
		return potrazivanjeOdKupacaIzPredhodneGodineTF;
	}
	private JLabel getNetoPrihodOdProdajeLabela() {
		if (netoPrihodOdProdajeLabela == null) {
			netoPrihodOdProdajeLabela = new JLabel("Neto prihod od prodaje:");
			netoPrihodOdProdajeLabela.setVisible(false);
		}
		return netoPrihodOdProdajeLabela;
	}
	private JTextField getNetoPrihodOdProdajeTF() {
		if (netoPrihodOdProdajeTF == null) {
			netoPrihodOdProdajeTF = new JTextField();
			netoPrihodOdProdajeTF.setVisible(false);
			netoPrihodOdProdajeTF.setText("0");
			netoPrihodOdProdajeTF.setColumns(10);
		}
		return netoPrihodOdProdajeTF;
	}
	
	
	public void pomocneKomponente(int index){
	if(cetvrtiRacioBrojComboBox!=null){// pocetak Mora da ne bi izbacio nullPointException (inicijalizacija 4.comboBoxa)
		//za koef obrta kupaca
		if (index==3){				
			netoPrihodOdProdajeLabela.setVisible(true);
			netoPrihodOdProdajeTF.setVisible(true);
			potrazivanjeOdKupacaIzPredhodneGodineLabela.setVisible(true);
			potrazivanjeOdKupacaIzPredhodneGodineTF.setVisible(true);					
		}else{
			if(prviRacioBrojComboBox.getSelectedIndex()!=3 && drugiRacioBrojComboBox.getSelectedIndex()!=3 
					&& treciRacioBrojComboBox.getSelectedIndex()!=3 && cetvrtiRacioBrojComboBox.getSelectedIndex()!=3){		
			netoPrihodOdProdajeLabela.setVisible(false);
			netoPrihodOdProdajeTF.setVisible(false);
			potrazivanjeOdKupacaIzPredhodneGodineLabela.setVisible(false);
			potrazivanjeOdKupacaIzPredhodneGodineTF.setVisible(false);						
			}
		}
		//za koef obrta zaliha
		if(index==4){
			zaliheIzPredhodneGodineLabela.setVisible(true);
			zaliheIzPredhodneGodineTF.setVisible(true);
			troskoviProizvodnjeLabela.setVisible(true);
			troskoviProizvodnjeTF.setVisible(true);
		}else{
			if(prviRacioBrojComboBox.getSelectedIndex()!=4 && drugiRacioBrojComboBox.getSelectedIndex()!=4 
					&& treciRacioBrojComboBox.getSelectedIndex()!=4 && cetvrtiRacioBrojComboBox.getSelectedIndex()!=4){
			zaliheIzPredhodneGodineLabela.setVisible(false);
			zaliheIzPredhodneGodineTF.setVisible(false);
			troskoviProizvodnjeLabela.setVisible(false);
			troskoviProizvodnjeTF.setVisible(false);
			}	
		}
		
		
		
	}//	kraj
	}
	
	
	
	
	
	private JLabel getZaliheIzPredhodneGodineLabela() {
		if (zaliheIzPredhodneGodineLabela == null) {
			zaliheIzPredhodneGodineLabela = new JLabel("Zalihe iz predhodne godine:");
			zaliheIzPredhodneGodineLabela.setVisible(false);
		}
		return zaliheIzPredhodneGodineLabela;
	}
	private JTextField getZaliheIzPredhodneGodineTF() {
		if (zaliheIzPredhodneGodineTF == null) {
			zaliheIzPredhodneGodineTF = new JTextField();
			zaliheIzPredhodneGodineTF.setVisible(false);
			zaliheIzPredhodneGodineTF.setText("0");
			zaliheIzPredhodneGodineTF.setColumns(10);
		}
		return zaliheIzPredhodneGodineTF;
	}
	private JLabel getTroskoviProizvodnjeLabela() {
		if (troskoviProizvodnjeLabela == null) {
			troskoviProizvodnjeLabela = new JLabel("Tro\u0161kovi prizvodnje:");
			troskoviProizvodnjeLabela.setVisible(false);
		}
		return troskoviProizvodnjeLabela;
	}
	private JTextField getTroskoviProizvodnjeTF() {
		if (troskoviProizvodnjeTF == null) {
			troskoviProizvodnjeTF = new JTextField();
			troskoviProizvodnjeTF.setVisible(false);
			troskoviProizvodnjeTF.setText("0");
			troskoviProizvodnjeTF.setColumns(10);
		}
		return troskoviProizvodnjeTF;
	}
	private JLabel getFonSlikaLabela() {
		if (FonSlikaLabela == null) {
			FonSlikaLabela = new JLabel("");
			FonSlikaLabela.setHorizontalTextPosition(SwingConstants.CENTER);
			FonSlikaLabela.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return FonSlikaLabela;
	}
	
	
	
	
	
	
	
	
	public void index(){
		if( index==1){
			prviRacioBrojComboBox.setVisible(true);
			prviRacioBrojTF.setVisible(true);
			drugiRacioBrojComboBox.setVisible(false);
			drugiRacioBrojTF.setVisible(false);
			treciRacioBrojComboBox.setVisible(false);
			treciRacioBrojTF.setVisible(false);
			cetvrtiRacioBrojComboBox.setVisible(false);
			cetvrtiRacioBrojTF.setVisible(false);
		}
		
		if( index==2)	{
			prviRacioBrojComboBox.setVisible(true);
			prviRacioBrojTF.setVisible(true);
			drugiRacioBrojComboBox.setVisible(true);
			drugiRacioBrojTF.setVisible(true);
			treciRacioBrojComboBox.setVisible(false);
			treciRacioBrojTF.setVisible(false);
			cetvrtiRacioBrojComboBox.setVisible(false);
			cetvrtiRacioBrojTF.setVisible(false);
		}	
		if ( index==3){
			prviRacioBrojComboBox.setVisible(true);
			prviRacioBrojTF.setVisible(true);
			drugiRacioBrojComboBox.setVisible(true);
			drugiRacioBrojTF.setVisible(true);
			treciRacioBrojComboBox.setVisible(true);
			treciRacioBrojTF.setVisible(true);
			cetvrtiRacioBrojComboBox.setVisible(false);
			cetvrtiRacioBrojTF.setVisible(false);
		}	
		if ( index==4){
			prviRacioBrojComboBox.setVisible(true);
			prviRacioBrojTF.setVisible(true);
			drugiRacioBrojComboBox.setVisible(true);
			drugiRacioBrojTF.setVisible(true);
			treciRacioBrojComboBox.setVisible(true);
			treciRacioBrojTF.setVisible(true);
			cetvrtiRacioBrojComboBox.setVisible(true);
			cetvrtiRacioBrojTF.setVisible(true);
		}
	}
	

	
	private JLabel getSlikaLbela() {
		if (slikaLbela == null) {
			slikaLbela = new JLabel(l.getFon(1));
			
		}
		return slikaLbela;
	}
	}
	


	










