/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package inputoutput4;

/**
 *
 * @author HORUS
 */
import java.util.Scanner;
public class InputOutput4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner input = new Scanner 
   (System.in);
   String nama;
   char jeniskelamin;
   int tinggiBadan;
   boolean menikah;
   
  System.out.print("Masukkan Nama : ");
  nama = input.nextLine();
  
  System.out.print("Masukkan Jenis Kelamin : ");
  jeniskelamin = input.next().charAt(0);
  
  System.out.print("Masukan Tinggi Badan : ");
  tinggiBadan = input.nextInt ();
  
  System.out.print ("Masukan Status Menikah : ");
  menikah = input.nextBoolean();
    }
    
}
