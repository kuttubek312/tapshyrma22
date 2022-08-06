package com.peacksoft;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {


        FileWriter fileWriter1 = new FileWriter("Alphabet");
        {
            fileWriter1.write("1:A a,\n" +
                    "\n" +
                    "2:B b,\n" +
                    "\n" +
                    "3: C c,\n" +
                    "\n" +
                    "4: D d,\n" +
                    "\n" +
                    "5:E e,\n" +
                    "\n" +
                    "6:F f,\n" +
                    "\n" +
                    "7:G g,\n" +
                    "\n" +
                    "8:H h,\n" +
                    "\n" +
                    "9:I i,\n" +
                    "\n" +
                    "10:J j,\n" +
                    "\n" +
                    "11:K k,\n" +
                    "\n" +
                    "12:L l,\n" +
                    "\n" +
                    "13:M m,\n" +
                    "\n" +
                    "14:N n,\n" +
                    "\n" +
                    "15:O o,\n" +
                    "\n" +
                    "16:P p,\n" +
                    "\n" +
                    "17:Q q,\n" +
                    "\n" +
                    "18:R r,\n" +
                    "\n" +
                    "19:S s,\n" +
                    "\n" +
                    "20:T t,\n" +
                    "\n" +
                    "21:U u,\n" +
                    "\n" +
                    "22:V v,\n" +
                    "\n" +
                    "23:W w,\n" +
                    "\n" +
                    "24:X x,\n" +
                    "\n" +
                    "25:Y y,\n" +
                    "\n" +
                    "26:Z z,\n" +
                    " ");

            fileWriter1.close();
        }

        FileReader reader = new FileReader("Alphabet");
        Scanner scn = new Scanner(reader);
        while (scn.hasNextLine()){
            System.out.println(scn.nextLine());
        }
    }
}