package finansijska_analiza;

import javax.swing.ImageIcon;

public class logika {
	
	// Items za komboBox
		static String[] racioBrojeviBilansStanja = { "Opsti racio likvidnosti", "Brzi racio likvidnosti", "Neto obrtna sredstva",
				"Koeficijent obrta kupaca", "Koeficijent obrtaZaliha", "Odnos pozajljenih i sopstvenih izvora",
				"Odnos pozajljenih i ukupnih izvora", "Odnos sopstvenih i ukupnih izvora" };	
	
		static String[] racioBrojeviBilansUspeha = {"Stopa poslovne dobiti", "Stopa neto dobiti", "Stopa prinosa na ukupna poslovna sredstva",
				"Stopa prinosa na sopstvena sredstva"};
		
		
		
	// Vrednosti iz bilansa
		static double zemljiste;
		static double gradjevinskiObjekti;
		static double postorjenjaIOprema;
		static double roba;
		static double datiAvansiZaZaliheIUsluge;
		static double potrazivanjaOdKupaca;
		static double kratkorocniFinansijskiPlasmani;
		static double gotovinaIGotovinskiEkvivalenti;
		static double osnovniKapital;
		//static double rezerve;
		static double nerasporedjenaDobit;
		static double dugorocnaRezervisanjaIObaveze;
		static double kratkorocneFinansijskeObaveze;
		static double obavezePermaDobavljacima;
		static double drugeObaveze;
		
		static double nekretninePostrojenjaIOprema;
		static double fiksnaSredstva;
		static double zalihe;
		static double sredstva;
		static double kratkorocnaPotrazivanjaPlasmaniIGotovina;
		static double obrtnaSredstva;
		
		static double kapital;
		static double obavezeIzPoslovanja;
		static double kratkorocneObaveze;
		static double obaveze;
		static double kapitalPlusObaveze;
		
		static String error =""; // u slucaju exceptiona ako se unese NeBroj u bilans
		
		public static void popuniBilans(String zemljisteS, String gradjevinskiObjektiS	,
				String postorjenjaIOpremaS, String robaS,
				String datiAvansiZaZaliheIUslugeS, String potrazivanjaOdKupacaS,
				String kratkorocniFinansijskiPlasmaniS, String gotovinaIGotovinskiEkvivalentiS,
				String osnovniKapitalS, String nerasporedjenaDobitS, String dugorocnaRezervisanjaIObavezeS,
				String kratkorocneFinansijskeObavezeS, String obavezePermaDobavljacimaS,
				String drugeObavezeS){
		
			try {
				
				zemljiste = Double.parseDouble(zemljisteS.replace(',','.'));
				gradjevinskiObjekti = Double.parseDouble(gradjevinskiObjektiS.replace(',','.'));
				postorjenjaIOprema = Double.parseDouble(postorjenjaIOpremaS.replace(',','.'));
				roba = Double.parseDouble(robaS.replace(',','.'));
				datiAvansiZaZaliheIUsluge = Double.parseDouble(datiAvansiZaZaliheIUslugeS.replace(',','.'));
				potrazivanjaOdKupaca = Double.parseDouble(potrazivanjaOdKupacaS.replace(',','.'));
				kratkorocniFinansijskiPlasmani = Double.parseDouble(kratkorocniFinansijskiPlasmaniS.replace(',','.'));
				gotovinaIGotovinskiEkvivalenti = Double.parseDouble(gotovinaIGotovinskiEkvivalentiS.replace(',','.'));
				osnovniKapital = Double.parseDouble(osnovniKapitalS.replace(',','.'));
				//rezerve = Double.parseDouble(rezerveS);
				nerasporedjenaDobit = Double.parseDouble(nerasporedjenaDobitS.replace(',','.'));
				dugorocnaRezervisanjaIObaveze = Double.parseDouble(dugorocnaRezervisanjaIObavezeS.replace(',','.'));
				kratkorocneFinansijskeObaveze = Double.parseDouble(kratkorocneFinansijskeObavezeS.replace(',','.'));
				obavezePermaDobavljacima = Double.parseDouble(obavezePermaDobavljacimaS.replace(',','.'));
				drugeObaveze = Double.parseDouble(drugeObavezeS.replace(',','.'));
				
				
				nekretninePostrojenjaIOprema = zemljiste + gradjevinskiObjekti + postorjenjaIOprema;
				fiksnaSredstva = nekretninePostrojenjaIOprema;
				zalihe = roba + datiAvansiZaZaliheIUsluge;
				obrtnaSredstva = zalihe + kratkorocnaPotrazivanjaPlasmaniIGotovina;
				kratkorocnaPotrazivanjaPlasmaniIGotovina = potrazivanjaOdKupaca+kratkorocniFinansijskiPlasmani+gotovinaIGotovinskiEkvivalenti;
				obrtnaSredstva = zalihe + kratkorocnaPotrazivanjaPlasmaniIGotovina;
				sredstva = fiksnaSredstva + obrtnaSredstva;
				
				
				kapital = osnovniKapital + nerasporedjenaDobit; // + rezerve
				obavezeIzPoslovanja = obavezePermaDobavljacima+ drugeObaveze;
				kratkorocneObaveze = obavezeIzPoslovanja + kratkorocneFinansijskeObaveze;
				obaveze = dugorocnaRezervisanjaIObaveze + kratkorocneObaveze;
				kapitalPlusObaveze = kapital + obaveze;
				
				error = "";
				
			} catch (NumberFormatException e) {
				
					error = "Polja bilansa stanja moraju biti popunjeni BROJEVIMA !";
					e.printStackTrace();
			}
			
		}
		
		
		// Racio brojevi
		
		public static double izracunajRacioBrojeveBilansStanja(int index){
			
			if(index==0) return racioBrojeviFormule.opstiRacioLikvidnosti(obrtnaSredstva, kratkorocneObaveze);
			if(index==1) return racioBrojeviFormule.brziRacioLikvidnosti(kratkorocnaPotrazivanjaPlasmaniIGotovina, kratkorocneObaveze);
			if(index==2) return racioBrojeviFormule.netoObrtnaSredstva(obrtnaSredstva, kratkorocneObaveze);
			if(index==3) return racioBrojeviFormule.koeficijentObrtaKupaca(netoPrihodOdProdaje, prosecnoPotrazivanjeOdKupaca);
			if(index==4) return racioBrojeviFormule.koeficijentObrtaZaliha(troskoviProizvodnje, zalihe, zaliheIzPredhodneGodine);
			if(index==5) return racioBrojeviFormule.odnosPozajljenihISopstvenihIzvora(obaveze, kapital);
			if(index==6) return racioBrojeviFormule.odnosPozajljenihIUkupnihIzvora(obaveze, kapitalPlusObaveze);
			if(index==7) return racioBrojeviFormule.odnosSopstvenihIUkupnihIzvora(kapital, kapitalPlusObaveze);
			
			
			return 0;
		}
		
		
	
			
		
		//pomocna polja za racio brojeve
		
		static double netoPrihodOdProdaje;
		static double potrazivanjaOdKupacaIzPredhodneGodine;
		static double prosecnoPotrazivanjeOdKupaca;
		static double zaliheIzPredhodneGodine;
		static double troskoviProizvodnje;
		
		public static void pomocneKomponenteZaRacioBrojeve(String netoPrihodOdProdajeS, String potrazivanjaOdKupacaIzPredhodneGodineS,
				String zaliheIzPredhodneGodineS, String troskoviProizvodnjeS){
			
			try {
				netoPrihodOdProdaje = Double.parseDouble(netoPrihodOdProdajeS.replace(',','.'));
				potrazivanjaOdKupacaIzPredhodneGodine = Double.parseDouble(potrazivanjaOdKupacaIzPredhodneGodineS.replace(',','.'));		
				prosecnoPotrazivanjeOdKupaca = (potrazivanjaOdKupaca+potrazivanjaOdKupacaIzPredhodneGodine) / 2;
				
				zaliheIzPredhodneGodine = Double.parseDouble(zaliheIzPredhodneGodineS.replace(',','.'));
				troskoviProizvodnje = Double.parseDouble(troskoviProizvodnjeS.replace(',','.'));
				
				error = "";
				
			} catch (NumberFormatException e) {
				
				error = "U polja ispod se mora uneci BROJ !";
				e.printStackTrace();
			}
			
			
		}
	
		
//// Slika
		
		ImageIcon fon1 = new ImageIcon(getClass().getResource("/resources/fon1.png"));
		ImageIcon fon2 = new ImageIcon(getClass().getResource("/resources/fon2.gif"));
		ImageIcon fon3 = new ImageIcon(getClass().getResource("/resources/fon3.jpg"));
		
		static int index=1;
		
		public ImageIcon getFon(int index){
			
			if(index==4) index=1;
			
			if (index==1){ 
				index ++;
				return fon1;	}
			
			if (index==2){ 
				index ++;
				return fon2;	}
			
			if (index==3){ 
				index ++;
				return fon3;	}
			
			return null;
		}
		
		
		
		
		
		
}
