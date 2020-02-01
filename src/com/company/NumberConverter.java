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

}

