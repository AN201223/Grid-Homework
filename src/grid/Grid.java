package grid;

import java.util.Arrays;
import java.util.*;

public class Grid {

    char temp;

    boolean ok;

    public static void main(String[] args) {
        String grid[][] = new String[11][11];
        char temptwo;
        String temporary;
        boolean playing = true;
        grid[0][0] = "[]";
        int letter = 65;
        int j = 1;
        int k = 1;
        for (int i = 1; i < 11; i++) {
            grid[0][i] = "[" + (char) letter + "]";
            letter++;
        }
        for (int i = 1; i < 11; i++) {
            grid[i][0] = "[" + Integer.toString(i) + "]";
        }

        for (int i = 1; i < 11; i++) {
            for (j = 1; j < 11; j++) {
                grid[i][j] = "[ ]";
            }
        }

        while (playing == true) {
            for (int i = 0; i < 11; i++) {
                for (j = 0; j < 11; j++) {
                    System.out.print(grid[i][j]);
                }
                System.out.println("\n");
            }

            System.out.println("Enter a square coordinate");
            Scanner scanner = new Scanner(System.in);
            int cTwo = 0;
            int cOne = 0;
            String coord = scanner.nextLine();

            char temp = coord.charAt(0);
            try {
                cOne = temp - 64;
                while (!(cOne > 0 && cOne < 27)) {
                    System.out.println("Enter a valid coordinate");
                    coord = scanner.nextLine();
                    temp = coord.charAt(0);
                    try {
                        cOne = temp - 64;
                    } catch (Exception e) {
                        System.out.println("Error");
                    }
                }
            } catch (Exception e) {
                System.out.println("Error");
            }

            temp = coord.charAt(1);
            
            String tempString = String.valueOf(temp);
            try{
                temptwo = coord.charAt(2);
                String temptwoString = String.valueOf(temptwo);
                tempString = tempString + temptwoString;
            }catch(Exception e){
                break;
            }
            try {
                cTwo = Integer.parseInt(tempString);
            } catch (Exception f) {
                System.out.println("Error");

            }

            try {
                grid[cTwo][cOne] = "[x]";
            } catch (Exception e) {
                System.out.println("Error");
            }
            System.out.println("Would you like to continue playing? y for yes");
            temporary = scanner.nextLine();
            if(temporary.equals("y")){
                playing = true;
            }else{
                playing = false;
            }
        }
    }

}


