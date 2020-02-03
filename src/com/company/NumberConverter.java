package com.company;

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
         StringBuffer sb = new StringBuffer();

         for (; number > 0; number=number / 2) {
             if (number % 2 == 0) {
                 sb.insert(0, "0");
             } else if (number % 2 != 0) {
                 sb.insert(0, "1");
             }
         }

         System.out.println(sb.toString());
    }

    public static void toHex2 (int number) {
        StringBuffer sb2=new StringBuffer();

        for (; number > 0; number/=16) {
            if (number % 16 == 0) {
               sb2.insert(0, "0");
            } else if (number % 16 == 1) {
                sb2.insert(0, "1");
            } else if (number % 16 == 2) {
                sb2.insert(0, "2");
            } else if (number % 16 == 3) {
                sb2.insert(0, "3");
            } else if (number % 16 == 4) {
                sb2.insert(0, "4");
            } else if (number % 16 == 5) {
                sb2.insert(0, "5");
            } else if (number % 16 == 6) {
                sb2.insert(0, "6");
            } else if (number % 16 == 7) {
                sb2.insert(0, "7");
            } else if (number % 16 == 8) {
                sb2.insert(0, "8");
            } else if (number % 16 == 9) {
                sb2.insert(0, "9");
            } else if (number % 16 == 10) {
                sb2.insert(0, "a");
            } else if (number % 16 == 11) {
                sb2.insert(0, "b");
            } else if (number % 16 == 12) {
                sb2.insert(0, "c");
            } else if (number % 16 == 13) {
                sb2.insert(0, "d");
            } else if (number % 16 == 14) {
                sb2.insert(0, "e");
            } else if (number % 16 == 15) {
                sb2.insert(0, "f");
            }
        }

         System.out.println(sb2.toString());
    }
}















