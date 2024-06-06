public class Money {
    private long dollars;
    private long cents;

    //we are using '100' value to handle money in both dollars and cents. 
    public Money(double amount) {
        this.dollars = (long) amount;
        this.cents = Math.round((amount - this.dollars) * 100);
    }

    public Money(Money otherObject) {
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    public Money add(Money otherAmount) {
        long newCents = this.cents + otherAmount.cents;
        long newDollars = this.dollars + otherAmount.dollars;
        if (newCents >= 100) {
            newCents -= 100;
            newDollars++;
        }
        return new Money(newDollars + newCents / 100.0);
    }

    public Money subtract(Money otherAmount) {
        long newCents = this.cents - otherAmount.cents;
        long newDollars = this.dollars - otherAmount.dollars;
        if (newCents < 0) {
            newCents += 100;
            newDollars--;
        }
        return new Money(newDollars + newCents / 100.0);
    }

    public int compareTo(Money otherObject) {
        if (this.dollars > otherObject.dollars || 
            (this.dollars == otherObject.dollars && this.cents > otherObject.cents)) {
            return 1;
        } else if (this.dollars < otherObject.dollars || 
                   (this.dollars == otherObject.dollars && this.cents < otherObject.cents)) {
            return -1;
        } else {
            return 0;
        }
    }

    public boolean equals(Money otherObject) {
        return this.dollars == otherObject.dollars && this.cents == otherObject.cents;
    }

    public String toString() {
        return "$" + dollars + "." + (cents < 10 ? "0" : "") + cents;
    }
}
