package com.otogar;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		Firma f = new Firma();
		f.setFirmaName("Ferhat Turizm");
		
		Otobus o1 = new Otobus();
		o1.setPlaka("o1");
		
		Otobus o2 = new Otobus();
		o2.setPlaka("o2");

		Insan i1 = new Insan();
		i1.setInsanName("Emre");
		
		Insan i2 = new Insan();
		i2.setInsanName("Evrim");
		
		o1.setOtobusInsan(i1);
		o2.setOtobusInsan(i2);
		
		ArrayList<Otobus> oList = new ArrayList<Otobus>();
		oList.add(o1);
		oList.add(o2);
		
		f.setFirmaOtobus(oList);
		
		listele(f);
		
		
	}

	private static void listele(Firma f) {
		
		for(Otobus otobus : f.getFirmaOtobus()) {
			System.out.println(otobus.getPlaka() + " " + otobus.getOtobusInsan().getInsanName() );
		}
		
	}

}
