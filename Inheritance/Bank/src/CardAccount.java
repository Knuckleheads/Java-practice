public class CardAccount extends BankAccount{
    @Override
    public void take(double amountMoneyToTake) {
        if(amountMoneyToTake <= getAmount()) setMoneyAmount(getAmount() - (amountMoneyToTake * 1.01));
    }

    @Override
    public void put(double amountMoneyToPut) {
        if(amountMoneyToPut < 0) return;
        else setMoneyAmount(getAmount() + amountMoneyToPut);
    }
}
