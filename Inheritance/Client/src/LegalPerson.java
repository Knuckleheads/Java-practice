public class LegalPerson extends Client{
    private static double commission = 1.01;

    public LegalPerson(){
        setAmountMoney(0);
    }
    @Override
    public void take(double moneyToTake) {
        if(moneyToTake < getAmountMoney()) setAmountMoney(getAmountMoney() - (moneyToTake * commission));

    }
    public void info() {
        System.out.println("Информация о счете:");
        System.out.println("Текущий баланс: " + super.getAmountMoney());
        System.out.println("Условия снятия: комиссия 1%.");
        System.out.println("Условия пополнения: без комиссии.");
    }
}
