package Giris;

import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {
        int month, day;
        String burc = "";
        boolean isError = false;
        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz ayı giriniz ( Rakamla ) : ");
        month = input.nextInt();
        System.out.print("Doğduğunuz günü giriniz : ");
        day = input.nextInt();

        if (month == 1) {
            if (day >= 22 && day <= 31) {
                burc = " Kova ";
            } else if (day > 0 && day <= 21) {
                burc = " Oğlak ";
            } else isError = true;
        }
        if (month == 2) {
            if (day >= 20 && day < 28) {
                burc = " Balık ";
            } else if (day > 0 && day <= 19) {
                burc = " Kova ";
            } else isError = true;
        }
        if (month == 3) {
            if (day >= 21 && day <= 31) {
                burc = " Koç ";
            } else if (day > 0 && day <= 20) {
                burc = " Balık ";
            } else isError = true;
        }
        if (month == 4) {
            if (day >= 21 && day <= 30) {
                burc = " Boğa ";
            } else if (day > 0 && day <= 20) {
                burc = " Koç ";
            } else isError = true;
        }
        if (month == 5) {
            if (day >= 22 && day <= 31) {
                burc = " İkizler ";
            } else if (day > 0 && day <= 21) {
                burc = " Boğa ";
            } else isError = true;
        }
        if (month == 6) {
            if (day >= 23 && day <= 30) {
                burc = " Yengeç ";
            } else if (day > 0 && day <= 22) {
                burc = " İkizler ";
            } else isError = true;
        }
        if (month == 7) {
            if (day >= 23 && day <= 31) {
                burc = " Aslan ";
            } else if (day > 0 && day <= 22) {
                burc = " Yengeç ";
            } else isError = true;
        }
        if (month == 8) {
            if (day >= 23 && day <= 31) {
                burc = " Başak ";
            } else if (day > 0 && day <= 22) {
                burc = " Aslan ";
            } else isError = true;
        }
        if (month == 9) {
            if (day >= 23 && day <= 30) {
                burc = " Terazi ";
            } else if (day > 0 && day <= 22) {
                burc = " Başak ";
            } else isError = true;
        }
        if (month == 10) {
            if (day >= 23 && day <= 31) {
                burc = " Akrep ";
            } else if (day > 0 && day <= 22) {
                burc = " Terazi ";
            } else isError = true;
        }
        if (month == 11) {
            if (day >= 22 && day <= 30) {
                burc = " Yay ";
            } else if (day > 0 && day <= 21) {
                burc = " Akrep ";
            } else isError = true;
        }
        if (month == 12) {
            if (day >= 22 && day <= 31) {
                burc = " Oğlak ";
            } else if (day > 0 && day <= 21) {
                burc = " Yay ";
            } else isError = true;
        }
        if (month < 1 || month > 12) isError = true;
        if (isError) {
            System.out.println("Hatalı giriş yapıtınız. Tekrar deneyiniz. ");
        } else System.out.println("Burcunuz : " + burc);

    }
}
