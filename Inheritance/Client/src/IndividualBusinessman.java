public class IndividualBusinessman extends Client{
    private static double commission = 0.01;
    private static double commission2 = 0.005;

    public IndividualBusinessman(){
        setAmountMoney(0);
    }
    @Override
    public void put(double moneyToPut) {

        if(moneyToPut >= 0 && moneyToPut < 1000) setAmountMoney(getAmountMoney() + (moneyToPut - (moneyToPut * commission)));
        else if(moneyToPut >= 1000) setAmountMoney(getAmountMoney() + (moneyToPut - (moneyToPut * commission2)));

    }

    @Override
    public void info() {
        System.out.println("Информация о счете:");
        System.out.println("Текущий баланс: " + super.getAmountMoney());
        System.out.println("Условия снятия: без комиссии.");
        System.out.println("Условия пополнения: комиссия 1% при пополнении на сумму меньше 1000 и 0,5% при пополнении на сумму больше 1000.");
    }
}
