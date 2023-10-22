import java.util.Scanner;
class Simply
{
    String inSen,outSen;
    Simply()
    {
        inSen=outSen="";
    }
    void inputSen()
    {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a Sentence ");
        inSen=in.nextLine().toUpperCase();
    }
    /*
    void encode()
    {
        char ch;int i;
        for(i=0;i<inSen.length();i++)
        {
            ch=inSen.charAt(i);
            if(ch=='A'||ch=='a')
            {
                outSen+="1";    //outSen=outSen+"1";
            }
            else if(ch=='E'||ch=='e')
            {
                outSen+="2";
            }
            else if(ch=='I'||ch=='i')
            {
                outSen+="3";
            }
            else if(ch=='O'||ch=='o')
            {
                outSen+="4";
            }
            else if(ch=='U'||ch=='u')
            {
                outSen+="5";
            }
            else
             outSen+=ch;
        }
    }
    */
    
    void encode()
    {
        //s=s1.replace(old,new);
        outSen=inSen.replace('A','1');
        outSen=outSen.replace('E','2');
        outSen=outSen.replace('I','3');
        outSen=outSen.replace('O','4');
        outSen=outSen.replace('U','5');
    }
   
    void display()
    {
        System.out.println("Entered sentence " +inSen);
        System.out.println("New sentence " +outSen);
    }
    static void main()
    {
        Simply obj=new Simply();
        obj.inputSen();
        obj.encode();
        obj.display();
    }
}
