/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primefraction;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author zhuan
 */
public class PrimeFraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++) {
            int a=sc.nextInt();
            ArrayList<Integer> al=factorize(a);
            for (Integer m:al) {
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }

    private static ArrayList<Integer> factorize(int a) {
        int i=2;
        ArrayList<Integer> al=new ArrayList();
        while (i*i<=a) {
            if (a%i==0) {
                al.add(i);
                a/=i;
            } else {
                i++;
            }
        }
        al.add(a);
        return al;
    }
    
}
