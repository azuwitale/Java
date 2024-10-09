//Membuat Segita dengan Forloop Bercabang

package com.segitiga;

public class Main {

    public static void main(String[] args) {


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= 5; j++) {
                if (j <= 5 - i) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
//            System.out.println();

            System.out.print("\n");
        }

        System.out.println("\n");

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print("* ");
                if(i == j) {
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.print("\n");

//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 9; j++) {
//                if (i + j > 12){
//                    break;
//                }
//
//                System.out.print("* ");
//            }
//            System.out.print("\n");
//        }

        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                if ( (i+j) > 12){
                    break;
                }
                else if ( (j >= 4) && (j-i) > 4){
                    break;
                }
                else if ( (j <= 4) && (i+j) < 4){
                    System.out.print("  ");
                    continue;
                }
                else if ( (i >= 4) && (i-j) > 4){
                    System.out.print("  ");
                    continue;
                }
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}


