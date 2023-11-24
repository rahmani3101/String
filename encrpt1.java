
import java.util.*;
class Encrypt 
{
    static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a sentence ");
        String str=in.nextLine();
        str=str.toUpperCase();
        String key ="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch==' ' )
                ch=' ';
            else if(ch>='A' && ch<'Z')
                ch=(char)(ch+1);
            else if(ch=='Z')
                ch=(char)(ch-25);
            key+=ch;
        }
        System.out.println(key);
    }
}
