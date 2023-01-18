/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication41;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class nomor3
{  public static void main(String[] args) {
{
        Scanner input = new Scanner(System.in);
        int x,z;
        System.out.print("Masukkan Tinggi angka = ");
        x=input.nextInt();
        for(int i = 1;i<=x;i++)
        {
            z=i;
            System.out.print(i+" ");
            for(int j=1;j<i;j++ )
            {
                z=z+(x-j);
                System.out.print(z+" ");
            }
            System.out.println("");
        }
    }
    }
}
