public class PhysicalPerson extends Client{

    public PhysicalPerson(){
        setAmountMoney(0);
    }

    public void info(){
        System.out.println("Информация о счете:");
        System.out.println("Текущий баланс: " + super.getAmountMoney());
        System.out.println("Условия снятия: без комиссии.");
        System.out.println("Условия пополнения: без комиссии.");
    }
}
