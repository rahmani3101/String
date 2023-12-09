import java.util.Scanner;
class TimeToWords
{
public static void main()
{
    Scanner in = new Scanner(System.in);
  String[] ONES = {
        " zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
    };
    
    String[] TEENS = {
        "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
        "seventeen", "eighteen", "nineteen"
    };
    
     String[] TENS = {
        "", "", "twenty", "thirty", "forty", "fifty"
    }; 
    
    System.out.println("Enter hours and minutes :");
  int hours=in.nextInt();
  int minutes=in.nextInt();
    
        if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59) {
            System.out.println("Invalid time");
        }
        
        String timeInWords = "";
         if (minutes == 0) {
            timeInWords = ONES[hours] + " o'clock";
        } else if (minutes < 10) {
            timeInWords = ONES[hours] + " hours and  " + ONES[minutes]+" minutes " ;
        } else if (minutes < 20) {
            timeInWords = ONES[hours] + " " + TEENS[minutes - 10];
        } else {
            int tensDigit = minutes / 10;
            int onesDigit = minutes % 10;
            
            timeInWords = ONES[hours] + " " + TENS[tensDigit];
            
            if (onesDigit != 0) {
                timeInWords += " " + ONES[onesDigit]+" minutes ";
            }
        }
   
        System.out.println("The time in words is: " + timeInWords);
    }
}
