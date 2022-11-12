package lab9;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class lab14_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] months = {" ", "January", "February", "March ",
                "April ", "May ", "June ",
                "July ", "August ", "September ",
                "October ", "November ", "December "};
        System.out.println("Input date: ");
        String s = input.nextLine();
        newFormatDate(s,months);
    }
    public static void newFormatDate(String s,String[] months){
        StringBuilder date = new StringBuilder();
        String[] tokens = s.split("/");
        int digitMonth = Integer.parseInt(tokens[0]);
        date.append(months[digitMonth])
                .append(tokens[1])
                .append(", ")
                .append(tokens[2]);
        System.out.println("New date format:"+date);
    }

}
