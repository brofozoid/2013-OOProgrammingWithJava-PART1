
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        // at start the register has 1000 euros 
        this.cashInRegister = 1000;
        this.economicalSold = economicalSold;
        this.gourmetSold = gourmetSold;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        double econo = 2.50;
        if (cashGiven >= econo) {
            this.economicalSold++;
            this.cashInRegister += econo;
            return cashGiven - econo;
        }
        return cashGiven;
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        int gourmo = 4;
        if (cashGiven >= gourmo) {
            this.gourmetSold++;
            this.cashInRegister += gourmo;
            return cashGiven - gourmo;
        }
        return cashGiven;
    }

    public boolean payEconomical(LyyraCard card) {
        double econo = 2.50;
        if (card.pay(econo)) {
            this.economicalSold++;
            return true;
        }
        return false;
    }

    public boolean payGourmet(LyyraCard card) {
        double gourmo = 4;
        if (card.pay(gourmo)) {
            this.gourmetSold++;
            return true;
        }
        return false;
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        // ...
        if (sum > 0) {
            card.loadMoney(sum);
            this.cashInRegister += sum;
        }
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
