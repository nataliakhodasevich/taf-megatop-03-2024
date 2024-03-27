package by.megatop.domain;

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
}
