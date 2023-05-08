/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg192102090_fajariqbalkurniawan;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Mahasiswa C-03
 */
public class kisi_kisi {
     public static void main(String[] args) { 
//         Scanner input=new Scanner(System.in);
         
         //(1)
//          int bil;
//        System.out.println("PROGRAM MENENTUKAN BILANGAN GANJIL & GENAP");
//        System.out.println("-------------------------------------------------");
//        System.out.print("Masukan Bilangan = ");
//        bil=input.nextInt();
//        
//        if (bil%2==0){
//            System.out.println("Bilangan "+bil+" adalah bilangan genap");
//        }else {
//             System.out.println("Bilangan "+bil+" adalah bilangan ganjil");
//        }
   
         // (2)
    String Nama;
    String Nim;
    String grade;
       
       
       Nama = JOptionPane.showInputDialog("Nama Mahasiswa");
       Nim = JOptionPane.showInputDialog("Nim Mahasiswa");
       
       
        int nilaiAB = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Absensi : "));
        int nilaiTT = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Tugas : "));
        int nilaiUTS = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai UTS : "));
        int nilaiUAS = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai UAS : "));
        double hasil = (nilaiAB * 0.10 + nilaiTT * 0.20 + nilaiUTS * 0.30 + nilaiUAS * 0.40);
        
         if ( hasil >= 80){
             grade = "A";
         }else { if ( hasil >= 80){
             grade = "B";
         }else {if ( hasil >= 80){
             grade = "C";
         }else { 
             grade = "D";
         }
         }
         }
        
             
        JOptionPane.showMessageDialog(null, "Jadi Hasil Nilai Mahasiswa : " + Nama + " Dengan NIM : " + Nim +  "\nHasil Akhir : " +hasil+ "\n Grade : " +grade );

        
     }
}
     
