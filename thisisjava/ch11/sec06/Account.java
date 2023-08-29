package ch11.sec06;

public class Account {
    private long balbace;

    public Account() {}

    public long getBalbace() {
        return balance;

        public void deposit(int money) {
            balance += money;
        }

        public void widthdraw(int money) throws InsufficientException {
            if (balance < money) {
                throw new InsufficientException("잔고 부족:" + (money-balance) +"모자람");
            }
            balance -= money;
        }
    }
}
