package Java_IO;

import java.io.*;

public class WritingToLargeFile {
    public static void main(String[] args) {
        String randomText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
                "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris " +
                "nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in " +
                "reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla " +
                "pariatur. Excepteur sint occaecat cupidatat non proident, sunt in " +
                "culpa qui officia deserunt mollit anim id est laborum.";

        // Create a large string by repeating the random text
        StringBuilder largeTextBuilder = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            largeTextBuilder.append(randomText);
        }
        String largeText = largeTextBuilder.toString();

        try {
            // FileOutputStream
            long startTime = System.currentTimeMillis();
            try (FileOutputStream fos = new FileOutputStream("output.txt")) {
                fos.write(largeText.getBytes());
            }
            long endTime = System.currentTimeMillis();
            System.out.println("FileOutputStream time: " + (endTime - startTime) + " ms");

            // FileWriter
            startTime = System.currentTimeMillis();
            try (FileWriter fw = new FileWriter("output.txt")) {
                fw.write(largeText);
            }
            endTime = System.currentTimeMillis();
            System.out.println("FileWriter time: " + (endTime - startTime) + " ms");

            // BufferedOutputStream
            startTime = System.currentTimeMillis();
            try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("output.txt"))) {
                bos.write(largeText.getBytes());
            }
            endTime = System.currentTimeMillis();
            System.out.println("BufferedOutputStream time: " + (endTime - startTime) + " ms");

            // BufferedWriter
            startTime = System.currentTimeMillis();
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
                bw.write(largeText);
            }
            endTime = System.currentTimeMillis();
            System.out.println("BufferedWriter time: " + (endTime - startTime) + " ms");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}