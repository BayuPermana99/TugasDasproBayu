/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String
               nama_dp,nama_blk,alamat,kota,tmpt_lahir,tgl_lahir;
       Scanner biodata = new Scanner
               (System.in);
       System.out.println("Masukkan data data anda");
       System.out.print("Nama depan:");
       nama_dp=biodata.nextLine();
       System.out.print("Nama belakang:");
       nama_blk=biodata.nextLine();
       System.out.print("Alamat:");
       alamat=biodata.nextLine();
       System.out.print("kota:");
       kota=biodata.nextLine();
       System.out.print("Tempat lahir:");
       tmpt_lahir=biodata.nextLine();
       System.out.print("Tanggal lahir:");
       tgl_lahir=biodata.nextLine();
       
       System.out.println("============================");
       System.out.println("Biodataku");
       System.out.println("===================");
       System.out.println("Nama Lengkap:"+nama_dp+""+nama_blk);
       System.out.println("Alamat:"+alamat+""+kota);
       System.out.println("Tempat,tanggal lahir:"+tmpt_lahir+""+tgl_lahir);
    }
    
}
