package Task2;

import java.time.LocalDate;


public class Task2 {


    public static void main(String[] args) {

        LocalDate startDay = LocalDate.of(2019, 3, 1);
        LocalDate endDay = LocalDate.of(2024, 9, 30);

        int OverallWorkHours = 0;

        LocalDate currentDay = startDay;
        while (!endDay.isEqual(currentDay)) {
            int count = checkDay(currentDay);
            OverallWorkHours += count;
            currentDay = currentDay.plusDays(1);
        }


        System.out.printf("Doston shu vaqtdan : %s shu vaqtgachan : %s , Shanba kunlari %s soat  , Yakshanba kunlari %s soat ishlagan.\nJami ishlagan soatlari : %s", startDay, endDay, 6, 9, OverallWorkHours);
    }

    private static int checkDay(LocalDate date) {
        switch (date.getDayOfWeek()) {
            case SATURDAY -> {
                return 6;
            }
            case SUNDAY -> {
                return 9;
            }
            default -> {
                return 0;
            }
        }
    }


}
