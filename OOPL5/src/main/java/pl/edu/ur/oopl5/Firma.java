/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;



/**
 *
 * @author tychu
 */
public class Firma {

    int numer = 0;
    Pracownik[] pracownik = new Pracownik[100];

    int przelacznik = 0;

    public Pracownik dodaj() {
        pracownik[numer] = new Pracownik("", "", "", 0, numer);
        pracownik[numer].wyswietl();
        return pracownik[numer];
    }

    public int next() {
        return numer++;
    }

    public void all() {

        for (int i = 0; i < numer; i++) {
            System.out.println("\nPracownik nr. " + i);
            pracownik[i].wyswietl();

        }

    }

}
