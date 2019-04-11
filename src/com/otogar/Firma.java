package com.otogar;

import java.util.ArrayList;

public class Firma {

	int firmaId;
	String firmaName;
	ArrayList<Otobus> firmaOtobus;
	Insan firmaInsan;

	public int getFirmaId() {
		return firmaId;
	}

	public void setFirmaId(int firmaId) {
		this.firmaId = firmaId;
	}

	public String getFirmaName() {
		return firmaName;
	}

	public void setFirmaName(String firmaName) {
		this.firmaName = firmaName;
	}

	public ArrayList<Otobus> getFirmaOtobus() {
		return firmaOtobus;
	}

	public void setFirmaOtobus(ArrayList<Otobus> firmaOtobus) {
		this.firmaOtobus = firmaOtobus;
	}

	public Insan getFirmaInsan() {
		return firmaInsan;
	}

	public void setFirmaInsan(Insan firmaInsan) {
		this.firmaInsan = firmaInsan;
	}

}
