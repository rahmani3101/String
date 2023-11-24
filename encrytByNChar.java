
import java.util.*;
class Encrypt 
{
    static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a sentence ");
        String str=in.nextLine();
        System.out.println("Enter number of char to shift ");
        int n =in.nextInt();
        
        String key ="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch==' ' )
                ch=' ';
            else if((ch>='A' && ch<='Z'-n) || (ch>='a' && ch<='z'-n ))
                ch=(char)(ch+n);
            else if((ch>='Z'-n+1 && ch<='Z')    || (ch>='z'-n+1 && ch<='z')  )
                ch=(char)(ch-(26-n));
            key+=ch;
        }
        System.out.println(key);
    }
}
