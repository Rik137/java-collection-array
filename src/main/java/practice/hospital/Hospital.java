package practice.hospital;

public class Hospital {
    private static final float MIN_DIAPAZON = 32.00F;
    private static final float MAX_DIAPAZON = 40.00F;
    private static final float MAX_TEMPERATURE = 36.2F;
    private static final float MIN_TEMPERATURE = 36.9F;

    public static float[] generatePatientsTemperatures(int patientsCount) {
        float[] allTemperature = new float[patientsCount];
        for (int i = 0; i < allTemperature.length; i++) {
            allTemperature[i] = (float) (Math.random() * (MAX_DIAPAZON - MIN_DIAPAZON)) + MIN_DIAPAZON;
            allTemperature[i] = allTemperature[i] * 100;
            int result = Math.round(allTemperature[i]);
            float result2 = (float) result / 100;
            allTemperature[i] = result2;
        }
        return allTemperature;

    }

    public static String getReport(float[] temperatureData) {
        float sumTemperature = 0.0F;
        for (int i = 0; i < temperatureData.length; i++) {

            sumTemperature += temperatureData[i];

        }
        float averageTemperature = sumTemperature / temperatureData.length;
        averageTemperature = averageTemperature * 100;
        int result = Math.round(averageTemperature);
        float result2 = (float) result / 100;

        int numberOfHealthy = 0;
        for (int i = 0; i < temperatureData.length; i++) {
            if (temperatureData[i] <= MIN_TEMPERATURE && temperatureData[i] >= MAX_TEMPERATURE) {
                numberOfHealthy++;
            }
        }
        String listTemperature = "";
        for (int i = 0; i < temperatureData.length; i++) {
            listTemperature = listTemperature.concat(temperatureData[i] + " ");
        }
        String report =
                "Температуры пациентов: " + listTemperature.trim() +
                        "\nСредняя температура: " + result2 +
                        "\nКоличество здоровых: " + numberOfHealthy;
        return report;
    }
}

