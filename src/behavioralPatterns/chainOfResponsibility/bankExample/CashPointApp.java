package behavioralPatterns.chainOfResponsibility.bankExample;

public class CashPointApp {
    public static void main(String[] args) {
        BanknoteModule note5000 = new BanknoteModule5000();
        BanknoteModule note1000 = new BanknoteModule1000();
        BanknoteModule note500 = new BanknoteModule500();
        BanknoteModule note100 = new BanknoteModule100();

        note5000.setNextMoneyModule(note1000);
        note1000.setNextMoneyModule(note500);
        note500.setNextMoneyModule(note100);

        // TODO: виправити, виключити випадки з числами не кратним 100
        note5000.takeMoney(new Money(197_000));

    }
}

class Banknote {
    public static final int R100 = 100;
    public static final int R500 = 500;
    public static final int R1000 = 1000;
    public static final int R5000 = 5000;
}

class Money {
    public int sum;

    public Money(int sum) {
        this.sum = sum;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        if (sum > 0 && sum <=200_000 && sum%100==0) {
            this.sum = sum;
        } else {
            throw new RuntimeException("The sum should less than 100_000 be a multiple of 100");
        }
    }
}

abstract class BanknoteModule {
    protected BanknoteModule next;

    abstract void takeMoney(Money money);

    void setNextMoneyModule(BanknoteModule module) {
        next = module;
    }
}

class BanknoteModule5000 extends BanknoteModule {
    void takeMoney(Money money) {
        int countNote = money.getSum()/Banknote.R5000;
        int remind = money.getSum()%Banknote.R5000;
        if (countNote > 0) {
            System.out.println("Видано " + countNote + " купюр розміром " + Banknote.R5000);
        }
        if (remind > 0 && next != null) {
            next.takeMoney(new Money(remind));
        }
    }
}

class BanknoteModule1000 extends BanknoteModule {
    void takeMoney(Money money) {
        int countNote = money.getSum()/Banknote.R1000;
        int remind = money.getSum()%Banknote.R1000;
        if (countNote > 0) {
            System.out.println("Видано " + countNote + " купюр розміром " + Banknote.R1000);
        }
        if (remind > 0 && next != null) {
            next.takeMoney(new Money(remind));
        }
    }
}

class BanknoteModule500 extends BanknoteModule {
    void takeMoney(Money money) {
        int countNote = money.getSum()/Banknote.R500;
        int remind = money.getSum()%Banknote.R500;
        if (countNote > 0) {
            System.out.println("Видано " + countNote + " купюр розміром " + Banknote.R500);
        }
        if (remind > 0 && next != null) {
            next.takeMoney(new Money(remind));
        }
    }
}

class BanknoteModule100 extends BanknoteModule {
    void takeMoney(Money money) {
        int countNote = money.getSum()/Banknote.R100;
        int remind = money.getSum()%Banknote.R100;
        if (countNote > 0) {
            System.out.println("Видано " + countNote + " купюр розміром " + Banknote.R100);
        }
        if (remind > 0 && next != null) {
            next.takeMoney(new Money(remind));
        }
    }
}