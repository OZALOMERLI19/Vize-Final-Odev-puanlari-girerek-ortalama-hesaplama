//ABULFAZ ISMAYILLI (VIZE-FINAL-ODEV-ORTALAMA) YAZDIRMA
// 2112101067

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan ders bilgilerini alma
        System.out.print("Dersin adını giriniz: ");
        String dersAdi = scanner.nextLine();

        System.out.print("Derse ait kaç adet değerlendirme kriteri var? ");
        int kriterSayisi = scanner.nextInt();
        scanner.nextLine();

        // Değerlendirme kriterlerini ve etkilerini kullanıcıdan alma
        String[] kriterAdlari = new String[kriterSayisi];
        int[] kriterEtkileri = new int[kriterSayisi];

        for (int i = 0; i < kriterSayisi; i++) {
            System.out.print((i + 1) + ". Kriterin adı nedir: ");
            kriterAdlari[i] = scanner.nextLine();

            System.out.print((i + 1) + ". Kriterin etkisi: ");
            kriterEtkileri[i] = scanner.nextInt();
            scanner.nextLine();
        }

        // Öğrenci sayısını alma
        System.out.print("Kaç öğrenci notu gireceksiniz: ");
        int ogrenciSayisi = scanner.nextInt();
        scanner.nextLine();

        // Öğrenci bilgilerini ve notlarını almak icin:
        String[] adSoyad = new String[ogrenciSayisi];
        int[][] notlar = new int[ogrenciSayisi][kriterSayisi];

        for (int i = 0; i < ogrenciSayisi; i++) {
            System.out.print((i + 1) + ". Öğrencinin adı soyadı: ");
            adSoyad[i] = scanner.nextLine();

            for (int j = 0; j < kriterSayisi; j++) {
                System.out.print((i + 1) + ". Öğrencinin " + kriterAdlari[j] + " notu: ");
                notlar[i][j] = scanner.nextInt();
                scanner.nextLine();
            }
        }

        // Ortalamaları hesapla ve ekrana yazdırmak:
        System.out.print("\nAdı\tSoyadı");
        for (int j = 0; j < kriterSayisi; j++) {
            System.out.print("\t" + kriterAdlari[j]);
        }
        System.out.println("\tOrtalama");

        for (int i = 0; i < ogrenciSayisi; i++) {
            System.out.print(adSoyad[i] + "\t");

            int toplamNot = 0;
            for (int j = 0; j < kriterSayisi; j++) {
                System.out.print("\t" + notlar[i][j]);
                toplamNot += notlar[i][j] * kriterEtkileri[j] / 100;
            }

            System.out.println("\t" + toplamNot);
        }
    }
}
