/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mükemmelsayi;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class MükemmelSayi {

   public static int GirilenMukemmelSayiKontrol;

	static void menu() {
		System.out.println("ne yapmak istiyorsun");
		System.out.println("1. Bir sayının mükemmel olup olmadıgını sor");
		System.out.println("2. bir sayıya kadar bulunan tüm mükemmel sayıları listele ");
		System.out.println("3. Çıkış");

	}

	static void secimGir() {

		Scanner input = new Scanner(System.in);
		int sayi = input.nextInt();
		System.out.println("Seçiminiz:" + sayi);
		int sonuc = 0;

		switch (sayi) {
		case 1:
			mukemmelSayiGir();
			mukemmelSayiKontrolu(GirilenMukemmelSayiKontrol);
			break;

		case 2:
			mukemmelSayiGir();

			mukemmelSayilariListele(GirilenMukemmelSayiKontrol);

			break;
		case 3:
			System.out.println("Güle Güle...");
			System.exit(0);
			break;

		default:
			break;
		}
	}

	static void mukemmelSayiGir() {
		Scanner input = new Scanner(System.in);
		System.out.print("Sayı girin:");
		GirilenMukemmelSayiKontrol = input.nextInt();

	}

	private static boolean mukemmelSayiKontrolu(int sayi) {

		int sonuc = 0;

		for (int i = 1; i <= sayi / 2; i++) {
			if (sayi % i == 0) {
				sonuc = sonuc + i;
			}
		}

		if (sonuc == sayi) {
			System.out.println("Mükemmel sayıdır: " + sayi);
			return true;
		} else {
			System.out.println("Mükemmel sayıdır degildir: " + sayi);
			return false;
		}

	}

	static boolean mukemmelSayiKontrolu2(int sayi) {

		int sonuc = 0;

		for (int i = 1; i <= sayi / 2; i++) {
			if (sayi % i == 0) {
				sonuc = sonuc + i;
			}
		}

		if (sonuc == sayi) {

			return true;
		} else {

			return false;
		}

	}

	static void mukemmelSayilariListele(int sayi) {

		int toplam = 0;

		for (int i = 1; i < sayi; i++) {
			if (mukemmelSayiKontrolu2(i)) {
				toplam = i;
				System.out.println(toplam);

			}

		}
	}

    public static void main(String[] args) {
        boolean devam = true;
		int sayi;

		while (devam) {

			menu();
			secimGir();

		}

    }
    
}
