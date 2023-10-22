import java.util.Scanner;
class Order
{
    String str,apstr,newstr;
    int len;
    Order()
    {
        str=apstr=newstr="";
        len=0;
    }
    void getStr()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER STRING ");
        str=in.next().toUpperCase();
        
        //str=str.toLowerCase();
        len=str.length();
    }
  
    void alphabeticalStr()
    {
        char i;
        int j;
        for(i='A';i<='Z';i++)
        {
            for(j=0;j<str.length();j++)
            { 
                if(str.charAt(j)==i)
                {
                    apstr = apstr+""+i;
                }
            }
        }
    }

    void completeStr()
    {
        char i;
        char first=apstr.charAt(0);
        char end=apstr.charAt(apstr.length()-1);
        for(i=first;i<end;i++)
        {
            newstr=newstr+""+i;    //add
        }
    }
    void display()
    {
        
        alphabeticalStr();
        completeStr();
        System.out.println("Alphabetically aranged word " + apstr);
        System.out.println("New word " + newstr);
    }
    static void main()
    {
        Order obj=new Order();
        obj.getStr();
        obj.alphabeticalStr();
        obj.completeStr();
        obj.display();
    }
}
