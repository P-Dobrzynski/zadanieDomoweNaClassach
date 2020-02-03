package com.company;

import java.util.ArrayList;
import java.util.Arrays;

class NumberConverter {
        private static int number;


    public NumberConverter (int number) {
        this.number=number;

    }
        public static void toBinary(int number) {
            System.out.println(Integer.toBinaryString(number));
        }

        public static void toHex (int number) {
            System.out.println(Integer.toHexString(number));
        }




     public static void toBinary2(int number) {
         ArrayList<String> binaryArray=new ArrayList<>();
         StringBuffer sb = new StringBuffer();

         for (; number > 0; number=number / 2) {
             if (number % 2 == 0) {
                 binaryArray.add(0, "0");
             } else if (number % 2 != 0) {
                 binaryArray.add(0, "1");
             }
         }

        for(String s: binaryArray) {
            sb.append(s);
        }
         System.out.println(sb.toString());
    }

    public static void toHex2 (int number) {
        ArrayList<String> hexArray=new ArrayList<>();
        StringBuffer sb2=new StringBuffer();

        for (; number > 0; number/=16) {
            if (number % 16 == 0) {
                hexArray.add(0, "0");
            } else if (number % 16 == 1) {
                hexArray.add(0, "1");
            } else if (number % 16 == 2) {
                hexArray.add(0, "2");
            } else if (number % 16 == 3) {
                hexArray.add(0, "3");
            } else if (number % 16 == 4) {
                hexArray.add(0, "4");
            } else if (number % 16 == 5) {
                hexArray.add(0, "5");
            } else if (number % 16 == 6) {
                hexArray.add(0, "6");
            } else if (number % 16 == 7) {
                hexArray.add(0, "7");
            } else if (number % 16 == 8) {
                hexArray.add(0, "8");
            } else if (number % 16 == 9) {
                hexArray.add(0, "9");
            } else if (number % 16 == 10) {
                hexArray.add(0, "a");
            } else if (number % 16 == 11) {
                hexArray.add(0, "b");
            } else if (number % 16 == 12) {
                hexArray.add(0, "c");
            } else if (number % 16 == 13) {
                hexArray.add(0, "d");
            } else if (number % 16 == 14) {
                hexArray.add(0, "e");
            } else if (number % 16 == 15) {
                hexArray.add(0, "f");
            }
        }
        for(String s: hexArray) {
            sb2.append(s);
        }
        System.out.println(sb2.toString());
    }
}















