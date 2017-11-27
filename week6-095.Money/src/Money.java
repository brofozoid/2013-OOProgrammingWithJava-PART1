public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money added) {
        return new Money(euros + added.euros, cents + added.cents);
    }
    
    public boolean less(Money compared) {
        return (((this.euros * 100) + cents) < ((compared.euros * 100) + compared.cents));
    }
    
    public Money minus(Money removed) {
        int newEuro = euros - removed.euros;
        int newCents = cents - removed.cents;
        if (cents < removed.cents) {
            newEuro = euros - 1 - removed.euros;
            newCents = cents + 100 - removed.cents;
        }
        if (newCents < 0 || newEuro < 0) {
            return new Money(0,0);
        }
        return new Money(newEuro, newCents);
    }
}
