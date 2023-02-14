public class Account {
    private int pin = 12345;
    public int getPin() {
        return pin;
    }

    public int debit(int amount){
        int totalBalance = 50000;
        if (amount>totalBalance){
            return 0;
        }else{
            totalBalance -= amount;
            return totalBalance;
        }
    }
}
