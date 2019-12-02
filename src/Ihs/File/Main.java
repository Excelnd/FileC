package Ihs.File;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        File eg = new File("C:\\users\\IHS\\desktop\\eg.txt");

        if(eg.exists())
            System.out.println(eg.getName() + " exist!");
        else
            System.out.println(" The file does not exist");
    }
}
