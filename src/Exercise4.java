import java.util.Scanner;
class Library
{
String[] books;
int n;

Library()
{
    this.books=new String[100];  // we are using strings as an array
    this.n=0;
}
void addbook(String s)
{
  this.books[this.n]=s;
  this.n++;

}
void showavailablebook()
{
    for(int i=0;i<this.n;i++)
    {  if(this.books[i]==null)
        {
            continue;
        }
        System.out.print(this.books[i]);
        
        System.out.print("  ");

    }
}
void issuebook(String s)
{
    for(int i=0;i<this.n;i++)
    {
        if(this.books[i]==s)
        {
            System.out.println("book is present");
        }
    }
    for(int i=0;i<this.n;i++)
    {
        if(this.books[i].equals(s))
        {
            this.books[i]=null;
            
        }
    }

System.out.print("The updated list of book is:  ");
  showavailablebook();
   

}

void returnbook(String s)
{
  this.books[this.n]=s;
  this.n++;
  System.out.print("The updated list of book is: ");
  showavailablebook();
}


}
public class Exercise4 {
    public static void main(String[] args)
    { 
         Scanner s=new Scanner(System.in);

       Library l=new Library();
       String[] str=new String[20];
       int a;

      
       System.out.println("how many book you want to add");
              int x=s.nextInt();
              System.out.printf("Enter %d books \n",x);
              for(int i=0;i<x;i++)
              { 
                str[i]=s.next();
                l.addbook(str[i]);
              } 
              System.out.println("This is a library file\n press 2: to show available book\n press 3: to issuebook\n press 4: to return");
       
       do
       {int n=s.nextInt();
        switch(n)
        {
           
           case 2:
           {
               l.showavailablebook();
               break;
           }
           case 3:
           {  System.out.println("enter the book name you want to issue");
           String iss=s.next();
               l.issuebook(iss);
               break;
           }
           case 4:
           {   System.out.println("enter the book name you want to return");
               String isss=s.next();
               l.returnbook(isss);
               break;
           }
        }
       
    

        System.out.println("to want to re-run press 1 or press any key to exit");
        a=s.nextInt();  
}
while(a==1);
}
}
