import java.util.Scanner;
public class DaysInMonth_Ex64 {
    public static void main(){
        Scanner scn = new Scanner(System.in);
        int month = 0; int year = -1;
        while(true){
            System.out.println("Enter year:");
            String yearIn = scn.nextLine().trim();
            int valid = 1;
            for(int i=0; i<yearIn.length(); i++){
                if(Character.isDigit(yearIn.charAt(i)) == false){
                    valid = 0; break;
                }
            }
            if(valid == 1){
                year = Integer.parseInt(yearIn); break;
            }
            else{
                System.out.println("Invalid year! Enter again:");
            }
        }
        while(true){
            System.out.println("Enter month:");
            String monthIn = scn.nextLine().trim();
            month = getMonth(monthIn);
            if(month!=-1) break;
            else System.out.println("Invalid month! Enter again:");
        }
        if(isLeap(year)){
            switch(month){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    System.out.println(31);
                case 2:
                    System.out.println(29);
                case 4: case 6: case 9: case 11:
                    System.out.println(30);
            }
        }
        else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println(31);
                case 2:
                    System.out.println(28);
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println(30);
            }
        }
        scn.close();
    }
    public static boolean isLeap(int yr){
        if(yr % 4 == 0) return true;
        else return false;
    }
    public static int getMonth(String input){
        switch(input.toLowerCase()){
            case "january": case "jan": case "jan.": case "1":
                return 1;
            case "february": case "feb": case "feb.": case "2":
                return 2;
            case "march": case "mar": case "mar.": case "3":
                return 3;
            case "april": case "apr": case "apr.": case "4":
                return 4;
            case "may": case "5":
                return 5;
            case "june": case "jun": case "jun.": case "6":
                return 6;
            case "july": case "jul": case "jul.": case "7":
                return 7;
            case "august": case "aug": case "aug.": case "8":
                return 8;
            case "september": case "sep": case "sep.": case "9":
                return 9;
            case "october": case "oct": case "oct.": case "10":
                return 10;
            case "november": case "nov": case "nov.": case "11":
                return 11;
            case "december": case "dec": case "dec.": case "12":
                return 12;
            default: return -1;
        }
    }
}
