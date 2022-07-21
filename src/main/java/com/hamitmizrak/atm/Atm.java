package com.hamitmizrak.atm;

import java.util.Scanner;

public class Atm implements IInterface {
	Kasa kasa = new Kasa();
	Scanner klavye = new Scanner(System.in);

	@Override
	public boolean giris() {

		String ad, sifre;
		String adminKullaniciAd = "root", adminSifre = "root";
		int geriSayim = 3;

		while (geriSayim > 0) {
			System.out.println("Kullanıcı adını giriniz");
			ad = klavye.nextLine();

			System.out.println("Kullanıcı şifresi giriniz");
			sifre = klavye.nextLine();

			if ((ad.equals(adminKullaniciAd)) && (sifre.equalsIgnoreCase(adminSifre))) {
				System.out.println("\nAnasayfaya  yönlendiriliyorsunuz.\n");
				secim();
				break;
			}
			geriSayim--;
			System.out.println("Kalan hakkınız: " + geriSayim);
			if (geriSayim <= 0) {
				System.out.println("Hakkınız kalmadı Kartınız bloke oldu\nlütfen 000 11 22 numarayı arayınız");
				System.exit(0);
				// break;
			}
		}

		return false;
	}

	@Override
	public void secim() {
		while (true) {
			System.out.println("Lütfen bir seçim yapınız");
			System.out.println("1 özet\n2 para ekle\n3 para cek \n4 cıkıs");
			int secim;
			secim = klavye.nextInt();
			switch (secim) {
			case 1:
				System.out.println("özet ...");
				ozet();
				break;

			case 2:
				System.out.println("para ekle ...");
				paraEkle();
				break;

			case 3:
				System.out.println("para çek ...");
				paraCek();
				break;

			case 4:
				System.out.println("Çıkış yapılıyor.");
				System.exit(0);
				break;

			default:
				System.out.println("Lütfen belirtilenleri seçiniz.");
				break;
			}
		}
	}

	@Override
	public void kasa() {
		Kasa kasa = new Kasa();

	}

	@Override
	public void ozet() {
		System.out.println("\nbakiyeniz: " + kasa.getMiktar() + "\n");
	}

	@Override
	public void paraEkle() {
		System.out.println("eklenecek parayı  giriniz.");
		int ekle = klavye.nextInt();
		Kasa.miktar += ekle;
		System.out.println("\nyeni bakiyeniz: " + kasa.getMiktar() + "\n");
	}

	@Override
	public void paraCek() {
		System.out.println("çekmek istediğiniz miktarı giriniz.");
		int ekle = klavye.nextInt();
		if (Kasa.miktar <= 0) {
			System.out.println("öncelikle para eklemelisiniz" + "\n");
		} else if (ekle >= 3000) {
			System.out.println("tek seferde " + ekle + " TL çekemezsiniz");
		} else {
			Kasa.miktar -= ekle;
			System.out.println("\ntoplam bakiye: " + kasa.getMiktar() + "\n");
		}

	}
}
