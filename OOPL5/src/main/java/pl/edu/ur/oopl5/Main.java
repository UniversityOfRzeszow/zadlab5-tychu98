package pl.edu.ur.oopl5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        

        Scanner we = new Scanner(System.in);
        System.out.println("Podaj numer zadania: ");
        int n = we.nextInt();

        switch (n) {
            case 3:
                System.out.println("Podaj rozmiar stosu");
                Stos stos = new Stos();
                int i = 0;
                while (i < stos.n) {
                    i++;
                    stos.pusty();
                    stos.push();
                    stos.pop();
                    
                    

                }
                break;
                
            case 5:
                Firma firma = new Firma();
                int przelacznik=0;
                while(przelacznik==0){
                firma.dodaj();
                firma.next();
                    System.out.println("Jeżeli chcesz nadal wprowadzać dane studentow wpisz 0 jeśli nie 1");
                    przelacznik=we.nextInt();
                }
                firma.all();
                break;
                
            case 6:
                Liczba liczba=new Liczba(10);
                liczba.podaj();
                System.out.println("Podaj liczbe do przemnożenia: ");
                int liczba2=we.nextInt();
                int wynik =liczba2*liczba.liczba;
             
                System.out.println("Silnia: "+liczba.silnia(liczba2));
                liczba.wypisz();
                break;
                
            default: System.out.println("Brak takiego numeru zadaia");
            break;
        }

    }

}
