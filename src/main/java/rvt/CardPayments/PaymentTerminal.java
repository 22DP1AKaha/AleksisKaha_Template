package rvt.CardPayments;

public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals
    public double affordableCost = 2.50;
    public double heartyCost = 4.3;

    public PaymentTerminal() {
        // register initially has 1000 euros of money
        money = 1000;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable meal and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double affordableCost = 2.5;
        if (payment >= affordableCost){
            payment -= affordableCost;
            money += affordableCost;
            affordableMeals++;
            return payment;
        }
        else{
            return payment;
        }
        
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty meal and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double heartyCost = 4.3;
        if (payment >= heartyCost) {
            payment -= heartyCost;
            money += heartyCost;
            heartyMeals++;
            return payment;
        }
        else{
            return payment;
        }
    }

    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        if (card.balance() >= affordableCost) {
            card.takeMoney(affordableCost);
            affordableMeals++;
            return true;
        } else {
            return false;
        }
    }

    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        if (card.balance() >= heartyCost) {
            card.takeMoney(heartyCost);
            heartyMeals++;
            return true;
        } else {
            return false;
        }
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
            card.addMoney(sum);
            money += sum;
    }

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
