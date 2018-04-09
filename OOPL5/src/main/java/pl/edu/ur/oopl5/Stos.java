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
public class Stos {

    Scanner we = new Scanner(System.in);
    
    int n = we.nextInt();
    private int[] tab = new int[n];
    int i=0;

    public void pusty() {
        for (i = 0; i < n; i++) {
            tab[i] = 0;
        }
    }

    public void push() {
       
        for (i = 0; i < n; i++) {
            if (tab[i] != 0)  {
                System.out.println("Nie znaleziono miejsca na stosie:");
                
            } else {
                System.out.println("znaleziono miejsce na stosie \n Podaj wartość którą chcesz wprowadzic na stos: ");
                tab[i] = we.nextInt();
                break;
            }
        }
        

    }

    public void pop() {
       
        for ( i = 0; i < n; i++) {
            if (tab[i] == 0)  {
                System.out.println("Brak elementu, nie pobrano:");
                
            } else {
                
                System.out.println("Pobrano element = "+tab[i]);
                break;
            }
        }
        

    }

}
