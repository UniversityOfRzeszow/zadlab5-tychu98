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
public class Liczba {
    
    int liczba;
    Scanner we = new Scanner(System.in);
    
    public int silnia (int n){
        if (n<=1){
            return 1;
        }
        else {
            return n*silnia(n-1);
        }
    }
    
    public int rozmiar(int liczba){
        int i=0;
        while (liczba/10!=0){
            liczba/=10;
            i++;
        }
        return i;
    }
    int[] tab_lib=new int[rozmiar(liczba)];
    
    void liczba_dziesietna(int liczba){
        for (int i=0;i<=rozmiar(liczba);i++){
            tab_lib[i]=liczba%10;
            liczba/=10;
        }
            
    }
    
     public Liczba(int liczba){
        this.liczba = liczba;
    }
    
    void podaj(){
        System.out.println("Podaj liczbę: ");
        this.liczba=we.nextInt();
    }
    
    void wypisz(){
        System.out.println("Podana liczba to: "+ this.liczba);
    }
    
    
}
