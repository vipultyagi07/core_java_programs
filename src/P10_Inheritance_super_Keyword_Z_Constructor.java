class First{
    First()
    {
        System.out.println("In first Class");
    }
    First(int a)
    {
        System.out.println("In first Class integer");
    }
}
class Second extends First{

    Second()
    { //super(); //this super() is presented in every constructor of every inherited class
        // 'by default', even if we do not even put it there

        System.out.println("In second Class");
    }
    Second(int a)
    { //super();
        super(a);
        System.out.println("In Second Class integer");
    }

}
public class P10_Inheritance_super_Keyword_Z_Constructor {

    public static void main(String []args)
    {
        //First f=new First(8);
        Second s=new Second(5);

		/*for understanding thre concept of super class, follow these steps:-

		STEP 1: declare First() and Second() constructor only and then print them
		        with
		    A:- First f=new First(); then remove it
		        O/P:- In first Class

		        Second s=new Second(); then remove it
		         O/P:- In first Class
                       In second Class

         STEP 2: Now introduce  First(int a) and Second(int b) parametrized constructor
                 and then print them with
			 A:- First f=new First(); then remove it
				 O/P:- In first Class  ## "deafult" constructor of superclass will get printed in every condition

		     B:- First f=new First(8); then remove it
		     	 O/P:-  In first Class integer    ##  EXCEPT this

		     C:- Second s=new Second(); then remove it
		     	 O/P:-  In first Class  ## "deafult" constructor of superclass will get printed in every condition
					   In second Class

		***  D:- Second s=new Second(5);
		    	 O/P:-In first Class    ## "deafult" constructor of superclass will get printed in every condition
                      In Second Class integer                                                |||
																							  |
					--> so it will only print "deafult" constructor of "First" and			  |
					    parametrized contructor of "Second"									  |
																							  |
																							  |
																							  |
																							 \/
												This is happening beacuse every constructor in a subclass
											    uses "super()" by default even if we do not even put it
												there

		 STEP 3 :- Now put parametrized "super(a)" in parametrized constructor of subclass
		 		   and then print them with

		           Second s=new Second(5);
		           O/P:- In first Class integer
                         In Second Class integer
	     */




    }
}
