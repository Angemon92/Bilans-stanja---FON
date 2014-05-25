package finansijska_analiza;

public  class racioBrojeviFormule {

	
	//1 bilans STANJA
	public static double opstiRacioLikvidnosti(double obrtnaSredstva, double kratkorocneObaveze){
		if (kratkorocneObaveze==0) return 0;		
		return obrtnaSredstva/kratkorocneObaveze;	
	}
	
	//2  
	//Likvidna sredstva su kratkorocna potrazivanja plasmani i gotovina
	public static double brziRacioLikvidnosti(double likvidnaSredstva,double kratkorocneObaveze){
		if (kratkorocneObaveze==0) return 0;
		return likvidnaSredstva/kratkorocneObaveze;
	}
	
	//3
	public static double netoObrtnaSredstva(double obrtnaSredstva, double kratkorocneObaveze){		
		return obrtnaSredstva - kratkorocneObaveze;		
	}
	
	//4
	public static double koeficijentObrtaKupaca(double netoPrihodOdProdaje, double prosecnaPotrazivanjaOdKupaca){
		if (prosecnaPotrazivanjaOdKupaca==0) return 0;	
		return netoPrihodOdProdaje/prosecnaPotrazivanjaOdKupaca;
	}
	
	//public static double koeficijentObrtaKupaca(double cenaKostanjaProdatihProizvoda, double krajnjeZalihe, double pocetneZalihe, double prosecanSaldoDobavljaca){
	//	if(prosecanSaldoDobavljaca==0) return 0;	
	//	return (cenaKostanjaProdatihProizvoda + krajnjeZalihe - pocetneZalihe) / prosecanSaldoDobavljaca;	
	//}
	
	//5
	public static double koeficijentObrtaZaliha(double cenaKostanjaProdatihProizvoda, double zaliheIzTekuceGodine, double zaliheIzPredhodneGodine){
		if(zaliheIzPredhodneGodine == 0) return cenaKostanjaProdatihProizvoda/zaliheIzTekuceGodine;
		
		return cenaKostanjaProdatihProizvoda/( ( zaliheIzPredhodneGodine + zaliheIzTekuceGodine )/2 );
	}
	
	//6
	public static double odnosPozajljenihISopstvenihIzvora(double obaveze, double sopstveniKapital){
		if (sopstveniKapital==0) return 0;	
		return obaveze/sopstveniKapital;
	}
	
	//7
	public static double odnosPozajljenihIUkupnihIzvora(double obaveze, double ukupniIzvoriSredstava){
		if (ukupniIzvoriSredstava==0) return 0;		
		return obaveze/ukupniIzvoriSredstava;		
	}
	
	//8
	public static double odnosSopstvenihIUkupnihIzvora(double sopstveniKapital, double ukupniIzvoriSredstava){
		if (ukupniIzvoriSredstava==0) return 0;	
		return sopstveniKapital/ukupniIzvoriSredstava;
	}
	
	
	//9 bilans USPEHA !
	public double stopaPoslovneDobiti(double poslovnaDobit, double netoPrihodOdProdaje){
		if (poslovnaDobit==0 || netoPrihodOdProdaje==0) return 0;
		
		return poslovnaDobit/netoPrihodOdProdaje;
	}
	
	//10
	public double stopaNetoDobiti(double netoDobit, double netoPrihodOdProdaje){
		if (netoDobit==0 || netoPrihodOdProdaje==0) return 0;
		
		return netoDobit/netoPrihodOdProdaje;
	}
	
	//11
	public double stopaPrinosaNaUkupnaPoslovnaSredstva(double poslovnaDobit, double ukupnaSredstva){
		if (poslovnaDobit==0 || ukupnaSredstva==0) return 0;
		
		return poslovnaDobit/ukupnaSredstva;
	}
	
	
	//12
	public double stopaPrinosaNaSopstvenaSredstva(double netoDobit, double sopstveniKapital){
		if(netoDobit==0 || sopstveniKapital==0) return 0;
		
		return netoDobit/sopstveniKapital;
	}
	
	//POMOCNE FRMULE !!!
	public double likvidnaSredstva(double obrtnaSredstva, double saldoZalihe){
		if (obrtnaSredstva==0 || saldoZalihe==0) return 0;
		
		return obrtnaSredstva - saldoZalihe;
	}
	
	public double likvidnaSredstva(double gotovina, double hartijeOdVrednosti, double potrazivanjaOdKupaca, double kratkorocniPlasmani){
		
		return gotovina+hartijeOdVrednosti+potrazivanjaOdKupaca+kratkorocniPlasmani;
	}
	
	public double netoPrihodiOdProdaje(double brutoPrihodiOdProdaje, double popustNaProdaju){
		 
		return brutoPrihodiOdProdaje - popustNaProdaju;
	}

	public double obaveze(double dugorocnaRezervisanja, double dugorocneObaveze, double kratkorocneObaveze){
		
		return dugorocnaRezervisanja + dugorocneObaveze + kratkorocneObaveze;
	}
	
	public double ukupniIzvoriSredstava(double sopstveniKapital, double obaveze){
		
		return sopstveniKapital + obaveze;
	}
	
	
}
