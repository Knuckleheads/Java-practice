public class Main {
    public static void main(String[] args) {
        PhysicalPerson person = new PhysicalPerson();
        person.setAmountMoney(10000);
        person.put(3000);
        person.take(7000);
        person.info();

        IndividualBusinessman businessman = new IndividualBusinessman();
        businessman.setAmountMoney(50000);
        businessman.put(15000);
        businessman.take(30000);
        businessman.info();

        LegalPerson legalPerson = new LegalPerson();
        legalPerson.setAmountMoney(17000);
        legalPerson.put(1000);
        legalPerson.take(30000);
        legalPerson.info();
    }
}
