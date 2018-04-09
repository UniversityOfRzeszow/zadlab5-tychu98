/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

import java.util.Scanner;

/**
 *
 * @author tychu
 */
public class Pracownik {

    public String imie = "";
    public String nazwisko = "";
    public String stanowisko = "";
    public int wiek = 0;
    public int index = 0;

    public Pracownik(String imie, String nazwisko, String stanowisko, int wiek, int index) {
        Scanner we = new Scanner(System.in);

        this.imie = imie = we.next();
        this.nazwisko = nazwisko = we.next();
        this.stanowisko = stanowisko = we.next();
        this.wiek = wiek = we.nextInt();
        this.index = index;
    }

    public void wyswietl() {
        System.out.println("imię: " + this.imie);
        System.out.println("nazwisko: " + this.nazwisko);
        System.out.println("stanowisko: " + this.stanowisko);
        System.out.println("wiek: " + this.wiek + " lat");
        System.out.println("Nr._indexu: " + index);

    }

}
