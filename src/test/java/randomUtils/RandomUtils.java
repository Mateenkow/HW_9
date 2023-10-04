package randomUtils;

import com.github.javafaker.Faker;

import java.security.SecureRandom;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author mateenkov
 */
public class RandomUtils {

    public static void main(String[] args) {

    }



    // Генерация случайного строки заданной длинны
    public static String getRandomString(int len) {
        String abc = "ABCDEFGHIJKLMOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String abc123 = "1234567890ABCDEFGHIJKLMOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        SecureRandom rnd = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++)
            sb.append(abc.charAt(rnd.nextInt(abc.length())));

        return sb.toString();
    }

    // Генерация случайного Email
    public static String getRandomEmail() {
        return getRandomString(10) + "@gmail.com";
    }

    // Генерация случайного адреса
    public static String getRandomAddress() {
        return getRandomString(10) + " " + getRandomString(5)
                + " " + getRandomString(10);
    }

    // Генерация случайного числа в заданном диапозоне
    public static int getRandomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    // генерация рандомного номера телефона по маске
    public static String getRandomPhoneNumber() {
        return String.format("%s%s%s%s%s", getRandomInt(1, 9), getRandomInt(111, 999),
                getRandomInt(111, 999), getRandomInt(11, 99), getRandomInt(1, 9));
    }

    // Два метода для выбора рандомного значения из массива
    public static String randomGender() {
        String[] genders = {"Male", "Female", "Other"};

        return getRandomGender(genders);
    }

    // выбор рандомного значения по длинне масива
    public static String getRandomGender(String[] array) {
        int index = getRandomInt(0, array.length - 1);

        return array[index];
    }
}
