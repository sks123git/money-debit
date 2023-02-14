import java.util.Scanner;
//Program to demonstrate money debit system
public class AccountTest {
    public static Scanner scanner = new Scanner(System.in);
    public  static Account accountTest = new Account();
    public static AccountTest account = new AccountTest();
    public void pinAuthentication(){
        System.out.println("Enter pin of your account to continue");
        int pin = scanner.nextInt();
        if(pin==accountTest.getPin()){
            account.transaction();
        } else {
            System.out.println("Pin incorrect. kindly enter correct pin");
        }
    }
    public void transaction(){
        int debitAmount,value;
        System.out.println("Enter amount: ");
        debitAmount = scanner.nextInt();
        value = accountTest.debit(debitAmount);
        if(value==0){
            System.out.println("Debit amount exceed amount balance");
        }else{
            System.out.println("Amount Debited "+ debitAmount + "\nAmount left "+ value );
        }
    }
    public static void main(String[] args) {
        int flag=1,option;
        while (flag==1){
            account.pinAuthentication();
            System.out.println("To continue press 1\nto exit press 2");
            option = scanner.nextInt();
            flag=(option==1)?1:0;
        }
    }
}