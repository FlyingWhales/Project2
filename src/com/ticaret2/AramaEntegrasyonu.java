package com.ticaret2;

import java.util.ArrayList;

public class AramaEntegrasyonu {

//	Istatistik istatistik = new Istatistik();
//	Tamamla tamamla = new Tamamla();
//	OlmadikSeyler olmadikSeyler = new OlmadikSeyler();
	//yukarıdaki propertyler eski haliydi
	
	
	ArrayList<EntegrasyonInterface> kanallar = new ArrayList<EntegrasyonInterface>();
	
	
	public void calistir() {
		
		//....
		//istatistik.process();
		
		//....
		//tamamla.process();
		
		//....
		//olmadikSeyler.process();
		
		//yukarıdaki kod bloğu eski haliydi
		
		kanallar.add(new Istatistik());
		kanallar.add(new Tamamla());
		kanallar.add(new OlmadikSeyler());
		
		for(EntegrasyonInterface ei: kanallar) {
			ei.process();
		}
		
		
	}
	
}
