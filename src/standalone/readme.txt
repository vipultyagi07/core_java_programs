1. Create a logic file: First, you must create a Java source code file containing your business logic. In our example, the Java source code file will contain code for the expense tracker.

Following is our source code file ExpenseTracker.java :

import java.util.ArrayList;
import java.util.Scanner;

public class ExpenseTracker {
    
    /*Record class object will contain record of each transaction
    * money will store the amount used in transaction ,-ve money stands for expense , +ve stands for income
    * recordInfo will store information about that string
    * for example , money = 200 , recordInfo = barber shop. */
    static class Record{
        int money;
        String recordInfo;

        // constructor for Record object
        Record(int money, String recordInfo){
            
            this.money = money;
            this.recordInfo = recordInfo;
        }
        
        // helpful in case we want to print record object
        @Override
        public String toString() {
            return "Money : "+money+"\n"+"record Info: "+recordInfo+".";
        }
    }
    
    // will store all records
    static ArrayList<Record> recordList = new ArrayList<>();
    // will store total balance , either +ve or -ve
    static int totalBalance;

    private static int getTotalBalance() {
        return totalBalance;
    }
    
    /* add a new record in recordList and update the total balance*/
    private static void addRecord(Record r){
        recordList.add(r);
        totalBalance += r.money;
    }

    /* remove the said record from recordList and update the total balance */
    private static boolean removeRecord(int i){
        try{
            Record removed = recordList.remove(i);
            totalBalance -= removed.money;
        }
        catch (Exception e){
            return false;
        }


        return true;
    }

    /* print all the record , one by one*/
    static void printRecords(){
        for(Record r : recordList){
            System.out.println(r);
        }
        System.out.println();
    }

    /* helper fn to print choice list */
    private static void printMainFn(){
        System.out.println("Hi... I'm your expense manager");
        System.out.println("Choose one out of following option :");
        System.out.println("1. add a record");
        System.out.println("2. delete a record");
        System.out.println("3. view all records");
        System.out.println("4. Tell me my balance");
        System.out.println("5. exit");
        System.out.println("Type 1 for option 1 and so on ...");
    }

    public static void main(String[] args) {
        /* Scanner for taking input from user*/
        Scanner sc = new Scanner(System.in); 
        
        // run loop until user exit out by choosing option 5
        while (true) {
            // print choice list
            printMainFn(); 
            // ask for user choice 
            String choice = sc.nextLine();


            
            if (choice.equals("1")) {
                /* user want to add a new record*/
                System.out.println("add a new record");
                System.out.println("In first line add amount. +ve for income , -ve for expense");
                System.out.println("In second line, give an information statement about it");


                /* take amount of transaction input from user in string form*/
                String moneyInStringForm = sc.nextLine();
                /* convert that amount to Integer form*/
                int money = Integer.parseInt(moneyInStringForm);
                sc.nextLine();
                /* ask user for statement about transaction */
                String statement = sc.nextLine();
                System.out.println("statement is : "+statement);


                // make a new record
                Record newRecord = new Record(money,statement);
                addRecord(newRecord);


                System.out.println("Updated total balance is ... "+getTotalBalance());


            } else if (choice.equals("2")) {
                /* user want to delete a record , print all record so user can decide*/
                System.out.println("Following are all records , choose a record index (0-based) to delete");
                /* ask user record it want to delete*/
                String toDeleteIndexInStringForm = sc.nextLine();
                int toDeleteIndex = Integer.parseInt(toDeleteIndexInStringForm);


                /* delete the said record*/
                boolean isDeleted = removeRecord(toDeleteIndex);
                if(isDeleted){
                    System.out.println("Record is deleted ...");
                    System.out.println("Updated balance is "+getTotalBalance());
                }
                else{
                    /* can not delete the record, may be due to wrong index*/
                    System.out.println("fail to remove the record ...");
                }
                
            } else if (choice.equals("3")) {
                /* print main choice list */
                printRecords();
            } else if (choice.equals("4")) {
                /* print total balance*/
                System.out.println("Your balance is "+getTotalBalance());
            } else if (choice.equals("5")) {
                /* user choose to exit from app*/
                break;
            } else {
                /* user give wrong input*/
                System.out.println("Wrong input , again type correct input");
            }


            System.out.println();
            sc.nextLine();
        }
    }
}


2. Compile your Java source code file to your class file. Use command javac ExpenseTracker.java
				
		Notice, ExpenseTracker, and Record class is created after execution of the command.


3. Create another source code Main.java 

	import java.io.IOException;

public class Main{
    public static void main(String[] args) {
        try{
            Runtime rt = Runtime.getRuntime();
            rt.exec("cmd.exe /c start cmd.exe /k \"java ExpenseTracker\"");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

We are making an object of Runtime and then asking it to run ExpenseTracker.class.



4. Compile Main.java using javac Main.java.




Notice Main.class is created after the execution of the command.

Note: This command may give a message for depreciated API in case of a newer version of Java. Just run using javac Main.java -Xlint:deprecation 
 





5. Run the following command to create a jar file for MyExpenseTracker application.

jar cfe MyExpenseTracker.jar Main *.class




6. MyExpenseTracker.jar will be created. Now just double-click on that icon to open your app.