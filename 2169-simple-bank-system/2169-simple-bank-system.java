class Bank {
    private long[] bb;
    private int n;

    public Bank(long[] balance) {
        this.bb = balance;
        this.n = balance.length;
    }
    
    private boolean isValid(int account) {
        return account >= 1 && account <= n;
    }

    public boolean transfer(int acc1, int acc2, long money) {
        if (!isValid(acc1) || !isValid(acc2)) {
            return false;
        }

        int ind1 = acc1 - 1;
        int ind2 = acc2 - 1;

        if (bb[ind1] < money) {
            return false;
        }

        bb[ind1] -= money;
        bb[ind2] += money;
        
        return true;
    }

    public boolean deposit(int account, long money) {
        if (!isValid(account)) {
            return false;
        }

        int index = account - 1;

        bb[index] += money;
        
        return true;
    }

    public boolean withdraw(int account, long money) {
        if (!isValid(account)) {
            return false;
        }

        int index = account - 1;

        if (bb[index] < money) {
            return false;
        }

        bb[index] -= money;

        return true;
    }
}