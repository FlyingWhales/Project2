package com.ticaret;

public class AramaEntegrasyonu {

	Istatistik istatistik = new Istatistik();
	Tamamla tamamla = new Tamamla();
	OlmadikSeyler olmadikSeyler = new OlmadikSeyler();
	
	
	public void calistir() {
		
		//....
		istatistik.sayma();
		
		//....
		tamamla.tamamla("");
		
		//....
		olmadikSeyler.ileriyeDonukSatis("");
		
	}
	
}
