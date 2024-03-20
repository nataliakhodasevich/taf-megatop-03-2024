package by.megatop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Utils {
    public static String generateNumber() {
        Random random = new Random();
        StringBuilder sequence = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sequence.append(random.nextInt(10));
        }
        return "(33)9" + sequence.toString();
    }
}
