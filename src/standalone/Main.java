package standalone;

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