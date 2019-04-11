package com.sehir;

import java.util.ArrayList;

public class SehirTest {

	
	
	public static void main(String[] args) {
		
		
		ArrayList<IlceInterface> ilceler = new ArrayList<IlceInterface>();
		
		
		Merkez m = new Merkez();
		Dogansehir d = new Dogansehir();
		
		ilceler.add(m);
		ilceler.add(d);
		
		for (IlceInterface ilce : ilceler) {
			ilce.topluTasimaKullan();
		}
		
		
		
	}

}
