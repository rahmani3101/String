
// code will arrange a word in such a way that lowercase letter will come forward and uppercase at end.
/* example :
Input : AsAdRahMani
Output : sdahaniAARM
*/
import java.util.Scanner;
class Arrange
{
    String wrd,arrange;
    int len;
    Arrange()
    {
        arrange=wrd="";
        len=0;
    }
    void feedWord()
    {
       Scanner in=new Scanner(System.in);
       System.out.println("ENTER WORD ");
       wrd=in.next();
    }
    void arrangeWord()
    {
        int i;char ch;
        String s1,s2;
        s1=s2="";
        len=wrd.length();
        for(i=0;i<len;i++)
        {
            ch=wrd.charAt(i);
            if(Character.isLowerCase(ch))
               s1+=ch;  // s1=s1+ch;
            if((Character.isUpperCase(ch)))
              s2+=ch;
            
        }
        arrange=s1+s2;
    }
    void display()
    {
        System.out.println("Original Word    :   " +wrd);
        System.out.println("Rearranged  Word :   " +arrange);
    }
    static void main()
    {
        Arrange obj=new Arrange();
        obj.feedWord();
        obj.arrangeWord();
        obj.display();
    }
}
