package com.hamitmizrak.atm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AvmMain {

	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		int secim;
		AtesOlcer ates = new AtesOlcer();
		System.out.println("Ateşiniz");
		secim=klavye.nextInt();
		boolean sonuc = ates.atesOlcumu(secim);

		while (2 > 1) {
			if (sonuc) {
				System.out.println("Nereye gitmek istiyor sunuz ?");
				System.out.println("1-) ATM  2-) Yemek 3-) Sinema 4-) Kütüphane 5-) Caffee 6-) Çıkış");
				secim = klavye.nextInt();
				switch (secim) {

				case 1:
					Atm atm = new Atm();
					atm.giris();
					break;

				case 2:
					yemek();
					break;

				case 3:
					sinema();
					break;

				case 4:
					kutuphane();
					break;

				case 5:
					cafee();
					break;

				case 6:
					System.out.println("Avm'den çıkış yapılıyor iyi günler dileriz.");
					System.exit(0);
					break;

				default:
					System.out.println("Lütfen belirtilen alanları seçiniz");
					break;
				}

			} else {
				System.err.println("Hastaneye gidilmesi gerekiyor ...");
				return;
			}

		}

	}

	private static void cafee() {
		System.out.println("Cafee gidiliyor ....");
		System.out.println("ne almak istiyorsunuz");
		List<String> list = new ArrayList<String>();
		list.add("Türk kahvesi");
		list.add("Çay");
		list.add("Filtre kahve");

		for (Object temp : list) {
			System.out.println(temp);
		}
	}

	private static void kutuphane() {
		System.out.println("kutuphane gidiliyor ....");
		System.out.println("Hangi kitap okumak istiyor sunuz ?");
		List<String> list = new ArrayList<String>();
		list.add("sınırsız güç");
		list.add("içindeki devi uyandır");
		list.add("şiir");

		for (Object temp : list) {
			System.out.println(temp);
		}

	}

	private static void sinema() {
		System.out.println("sinema gidiliyor ....");
		System.out.println("Hangi film izlemek  istiyor sunuz ?");
		List<String> list = new ArrayList<String>();
		list.add("x1");
		list.add("x2");
		list.add("x3");

		for (Object temp : list) {
			System.out.println(temp);
		}
	}

	private static void yemek() {
		System.out.println("yemek gidiliyor ....");
		System.out.println("hangi yemek istiyor sunuz  ....");
		List<String> list = new ArrayList<String>();
		list.add("kebap");
		list.add("adana");
		list.add("urfa");

		for (Object temp : list) {
			System.out.println(temp);
		}

	}

	private static void atm() {
		System.out.println("atm gidiliyor ....");
		atmLoginSayfasi();
		atmSecim();

	}

	private static void atmSecim() {
		Atm atm = new Atm();
		atm.giris();

	}

	private static void atmLoginSayfasi() {
Login login=new Login();
login.adminGiris();
	}
}
