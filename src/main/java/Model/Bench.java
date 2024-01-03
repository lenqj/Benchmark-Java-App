package Model;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public final class Bench {

    public static String run() {
        int numStrings = 1000;
        int numIterations = 1000;
        String[] randomStrings = generateRandomStrings(numStrings);
        long totalHashTime = benchmark(() -> {
            for (int i = 0; i < numIterations; i++) {
                for (String input : randomStrings) {
                    try {
                        hashSHA256(input);
                    } catch (NoSuchAlgorithmException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        int score = calculateScore(totalHashTime, numIterations, numStrings);
        return "Total time for " + numIterations + " iterations for " +
                numStrings + " random strings: " + totalHashTime + " milliseconds. Score: " + score + ".";
    }

    public static long benchmark(Runnable action) {
        long startTime = System.currentTimeMillis();
        action.run();
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
    public static String[] generateRandomStrings(int numStrings) {
        String[] strings = new String[numStrings];
        SecureRandom secureRandom = new SecureRandom();

        for (int i = 0; i < numStrings; i++) {
            byte[] randomBytes = new byte[16];
            secureRandom.nextBytes(randomBytes);
            strings[i] = bytesToHex(randomBytes);
        }

        return strings;
    }

    private static String bytesToHex(byte[] bytes) {
        StringBuilder hexString = new StringBuilder();
        for (byte b : bytes) {
            hexString.append(String.format("%02x", b));
        }
        return hexString.toString();
    }

    public static void hashSHA256(String input) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = md.digest(input.getBytes());
        StringBuilder hexString = new StringBuilder();
        for (byte hashByte : hashBytes) {
            hexString.append(String.format("%02x", hashByte));
        }
    }
    public static int calculateScore(long totalTime, int numIterations, int numStrings) {
        double weightedTime = 0.75 * totalTime;
        double weightedIterations = 0.1 * numIterations;
        double weightedStrings = 0.15 * numStrings;

        double totalWeightedScore = weightedTime + weightedIterations + weightedStrings;
        return (int) totalWeightedScore;
    }
}
