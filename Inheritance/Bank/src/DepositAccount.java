import java.util.Calendar;

public class DepositAccount extends BankAccount{
    private Calendar lastIncome;
    public DepositAccount(){
        lastIncome = Calendar.getInstance();
    }
    @Override
    public void put(double amountMoneyToPut) {
        lastIncome = Calendar.getInstance();
        if(amountMoneyToPut < 0) return;
        else setMoneyAmount(getAmount() + amountMoneyToPut);
    }

    @Override
    public void take(double amountMoneyToTake) {
        Calendar currTime = Calendar.getInstance();
        lastIncome.roll(Calendar.MONTH, 1);
        if(amountMoneyToTake <= getAmount() && currTime.getTime().after(lastIncome.getTime())) setMoneyAmount((getAmount() - amountMoneyToTake));
        else return;
    }
}
