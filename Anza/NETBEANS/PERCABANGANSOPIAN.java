/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangansopian;

/**
 *
 * @author SOFTWARE
 */
import java.util.Scanner;
public class PERCABANGANSOPIAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //membuat variable dan scanner
        String lampu;
            Scanner scan = new Scanner(System.in);
        //mengambil imput 
System.out.println("inputkan nama warna: ");
lampu = scan.nextLine();
switch(lampu){ 
    case "merah":
        System.out.println("Lampu merah, berhenti!"); break;
    case "kunimg":
        System.out.println("lampu kuning, harap berhati-hati!"); break;
    case "hijau":
        System.out.println("Lampu hijau, silahkan jalan"); break;
    default: System.out.println("Warna lampu salah!");
    
}
    }
    
}
