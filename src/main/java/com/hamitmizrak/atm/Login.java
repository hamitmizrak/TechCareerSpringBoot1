package com.hamitmizrak.atm;

import java.io.Serializable;
import java.util.Scanner;

public class Login implements Serializable {
	private static final long serialVersionUID = -4619653872257715764L;

	String kullaniciAdi = "root";
	String email = "root";
	String sifre = "root";

	// parametresiz
	public Login() {
		// TODO Auto-generated constructor stub
	}

	// parametrei constructor
	public Login(String kullaniciAdi, String email, String sifre) {
		super();
		this.kullaniciAdi = kullaniciAdi;
		this.email = email;
		this.sifre = sifre;
	}

//toString
	@Override
	public String toString() {
		return "Login [kullaniciAdi=" + kullaniciAdi + ", email=" + email + ", sifre=" + sifre + "]";
	}

	public boolean adminGiris() {
		Scanner klavye = new Scanner(System.in);
		String kullanici, mail, sifre;

		System.out.println("Lütfen kullanıcı adını");
		kullanici = klavye.nextLine();

		System.out.println("Lütfen mail adını");
		mail = klavye.nextLine();
		// https://github.com/hamitmizrak/JavaDatabases.git

		System.out.println("Lütfen şifrenizi adını");
		sifre = klavye.nextLine();

		// default: mail: info@ecodation.com
		// şifre: root

		if ((this.getEmail().equals(mail) || this.getKullaniciAdi().equalsIgnoreCase(kullanici))
				&& this.getSifre().equals(sifre)) {

			System.out.println("Admin sayfasına yönlendiriliyorsunuz");
			return true;

		} else {
			System.out.println("Kullanıcı adınız veya şifreniz yanlıştır ");
			return false;
		}

	}

//getter
	public String getKullaniciAdi() {
		return kullaniciAdi;
	}

	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSifre() {
		return sifre;
	}

	public void setSifre(String sifre) {
		this.sifre = sifre;
	}

	public static void main(String[] args) {
		Login login = new Login();
		login.adminGiris();
	}

}
