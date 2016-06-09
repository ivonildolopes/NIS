package br.edu.fanor.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import Util.Datas;

public class testeData {

	//@Test
	public void test() {
		
		
		Datas d = new Datas();
		
		int i = d.calculaIdade(d.criaData(21, 8, 1990));
		
		assertEquals(25, i,0);
		
	}
	
	@Test
	public void media() {
		
		
		double ap1 = 7;
		double ap2 = 7;
		double ap3 = 1.6;
		
		double media = ap1*0.3 + ap2 * 0.3 + ap3 * 0.4;
		
		assertEquals(5.4, media,0);
		
	}

}
