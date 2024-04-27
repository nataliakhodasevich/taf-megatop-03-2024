package by.megatop.util;

import org.apache.commons.text.RandomStringGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Utils {
    public static String generateNumber() {
        Random random = new Random();
        StringBuilder sequence = new StringBuilder();
        for (int i = 0; i < 7; i++) {
            sequence.append(random.nextInt(10));
        }
        return generateCode() + sequence.toString();
    }

    public static String generateCode() {
        List<String> codes = new ArrayList<>(Arrays.asList("(33)", "(29)", "(44)", "(25)"));
        Random random = new Random();
        return codes.get(random.nextInt(codes.size()));
    }

    public static String generatePassword(int length) {
        RandomStringGenerator generator = new RandomStringGenerator.Builder()
                .withinRange('0', 'z')
                .filteredBy(Character::isLetterOrDigit)
                .build();

        return generator.generate(length);
    }

    public static String generateRandomEmail() {
        String[] domains = {"gmail.com", "yahoo.com", "hotmail.com", "outlook.com", "icloud.com", "aol.com"};
        String[] names = {"john", "mary", "james", "sarah", "michael", "emma", "david", "lisa", "peter", "jennifer"};
        Random random = new Random();
        String name = names[random.nextInt(names.length)];
        String domain = domains[random.nextInt(domains.length)];
        int randomNumber = 1000 + random.nextInt(9000);
        return name + randomNumber + "@" + domain;
    }

    public static String generateRandomString(int length) {
        String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(symbols.length());
            sb.append(symbols.charAt(index));
        }
        return sb.toString();
    }

    public static int generateRandomNumber(int bound) {
        Random random = new Random();
        return random.nextInt(bound);
    }

    public static String generateSpecialCharacters(int length) {
        String specialCharacters = "!@#$%^&*()-_=+[{]};:'\"";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(specialCharacters.length());
            sb.append(specialCharacters.charAt(index));
        }
        return sb.toString();
    }
}
