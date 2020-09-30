package com.company;

public class Sourcery {

    public static void main(String[] args) {
	System.out.println("Hello Sourcery for Developers academy!");

	printBonusDatesBetween(2010, 2015);

    }
    static void printBonusDatesBetween(int fromYear, int toYear) {
        for (int year = fromYear; year < toYear; year++) {
            int hasDays = 0;
            for (int month = 1; month <= 12; month++) {
                if (month == 2) {
                    hasDays = 28;
                } else if (month % 2 == 0) {
                    hasDays = 30;
                } else {
                    hasDays =31;
                }
                for (int day = 1; day <= hasDays; day++) {
                    String correctString = "";
                    if (day < 10 && month < 10) {
                        correctString = year+"0"+month+"0"+day;
                        method(correctString);
//                        System.out.println(year+"0"+month+"0"+day); //to check
                    } else if (month < 10) {
                        correctString = year + "0" + month + "" + day;
                        method(correctString);
//                        System.out.println(year + "0" + month + "" + day); //to check
                    } else if (month >= 10 && day < 10){
                        correctString = year + "" + month + "0" + day;
                        method(correctString);
//                        System.out.println(year + "" + month + "0" + day); //to check
                    } else {
                        correctString = year + "" + month + "" + day;
                        method(correctString);
//                        System.out.println(year + "" + month + "" + day); //to check
                    }
                }
            }
        }
    }

    private static void method(String correctString) {
        String rev = correctString;
        StringBuffer reverse = new StringBuffer(rev);
        reverse.reverse();
        if (correctString.equals(reverse.toString())) {
            for(int i = 0; i < 4; i++) {
                System.out.print(correctString.split("")[i]);
            }
            System.out.print("-");
            for(int i = 4; i < 6; i++) {
                System.out.print(correctString.split("")[i]);
            }
            System.out.print("-");
            for(int i = 6; i <= 7; i++ ) {
                System.out.print(correctString.split("")[i]);
            }
            System.out.print("\n");
        }
    }
}
