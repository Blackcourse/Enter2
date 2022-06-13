import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the numbers of string");
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        console.nextLine();
        String[] lines = new String[number];
        int maxLenght=0;
        String longstring="";
        System.out.println("Enter the lines");
        for (int i = 0; i<number; i++) {
            int y=i+1;
            System.out.println("Line "+y);
            lines[i]=console.nextLine();
            if (lines[i].length() > maxLenght){
                maxLenght=lines[i].length();
                longstring=lines[i];
            }
            }
        System.out.println("Long string: " +longstring);
        }

    }







