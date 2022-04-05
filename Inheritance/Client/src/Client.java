public abstract class Client {
    private double amountMoney;

    public double getAmountMoney() {
        return this.amountMoney;
    }

    public void setAmountMoney(double amountMoney) {
        this.amountMoney = amountMoney;
    }
    public void put(double moneyToPut){
        if(moneyToPut > 0)
            this.amountMoney += moneyToPut;

    }
    public void take(double moneyToTake){
        if(moneyToTake <= amountMoney)
            this.amountMoney -= moneyToTake;
    }
    public abstract void info();

}
