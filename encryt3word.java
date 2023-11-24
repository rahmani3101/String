

import java.util.*;
class Encrypt 
{
    static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a sentence ");
        String str=in.nextLine();
        
        String key ="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch==' ' )
                ch=' ';
            else if((ch>='A' && ch<='W') || (ch>='a' && ch<='w' ))
                ch=(char)(ch+3);
            else if((ch>='X' && ch<='Z')    || (ch>='x' && ch<='z')  )
                ch=(char)(ch-23);
            key+=ch;
        }
        System.out.println(key);
    }
}
