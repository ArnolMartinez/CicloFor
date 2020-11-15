package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


    String nombre[]=new String[6];
    int edad[]=new int[6];
    Scanner r=new Scanner(System.in);
for(int x=0;x<6;x++){
        System.out.println("Nombre: ");
        nombre[x]=r.nextLine();
        System.out.println("Edad: ");
        edad[x]=r.nextInt();
r.nextLine();
    }
for(int x=0;x<6;x++){
        System.out.printf("Nombre: %s Edad: %d \n",nombre[x],edad[x]);

}
    }
}

