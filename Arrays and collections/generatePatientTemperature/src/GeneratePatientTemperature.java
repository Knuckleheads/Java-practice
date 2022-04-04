public class GeneratePatientTemperature {
    public static void main(String[] args) {
        int numberOfPatients = 15;
        getReport(numberOfPatients);
    }
    public static double[] generatePatientTemperature(int numberOfPatients){
        double[] patientsTemperature = new double[numberOfPatients];

        for (int i = 0; i <= numberOfPatients - 1; i++) {
            patientsTemperature[i] = getRandomDouble();
        }
        return patientsTemperature;
    }
    public static double getRandomDouble(){
        double lowTemperature = 32.0;
        double highTemperature = 40.0;
        double randomDouble = (Math.random() *(highTemperature - lowTemperature) + lowTemperature);
        return randomDouble;
    }
    public static void getReport(int numberOfPatients){
        double average = 0;
        int count = 0;
        double[] patientsTemperature;
        patientsTemperature = generatePatientTemperature(numberOfPatients);
        System.out.println("Список температур пациентов: ");
        for (int i = 0; i < patientsTemperature.length ; i++) {
            String temperature = String.format("%.1f", patientsTemperature[i]);
            System.out.println(temperature);
            average = average + patientsTemperature[i];
            if(patientsTemperature[i] >= 36.2 && patientsTemperature[i] <= 36.9){
                count++;
            }

        }
        average = average / numberOfPatients;
        String result = String.format("%,1f", average);
        System.out.println("Средняя температура всех пациентов: " + result);
        System.out.println("Здоровых пациентов: " + count);
    }
}
