package com.niantic.application;

import com.niantic.models.Assignment;
import com.niantic.services.GradesFileService;
import com.niantic.services.GradesService;
import com.niantic.ui.UserInput;

import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradingApplication implements Runnable {
    private GradesService gradesService = new GradesFileService();

    public void run() {
        while (true) {
            int choice = UserInput.homeScreenSelection();
            switch (choice) {
                case 1:
                    displayAllFiles();
                    break;
                case 2:
                    displayFileScores();
                    break;
                case 3:
                    displayStudentAverages();
                    break;
                case 4:
                    displayAllStudentStatistics();
                    break;
                case 5:
                    displayAssignmentStatistics();
                    break;
                case 0:
                    UserInput.displayMessage("Goodbye");
                    System.exit(0);
                default:
                    UserInput.displayMessage("Please make a valid selection");
            }
        }
    }

    private void displayAllFiles() {
        // todo: 1 - get and display all student file names
        File directory = new File("files");
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    System.out.println(file.getName());
                }
            }
        }
    }


    private void displayFileScores() {
        // todo: 2 - allow the user to select a file name
        // load all student assignment scores from the file - display all files
        File directory = new File("files");
        File[] files = directory.listFiles();

        if (files != null && files.length > 0) {
            System.out.println("Select a file by entering the number");
            for (int i = 0; i < files.length; i++) {
                if (files[i].isFile()) {
                    System.out.println((i + 1) + files[i].getName());
                }
            }
            Scanner scanner = new Scanner(System.in);
            int fileIndex = -1;
            boolean validInput = false;

            while (!validInput) {
                System.out.print("Enter your choice (1-" + files.length + "): ");
                if (scanner.hasNextInt()) {
                    fileIndex = scanner.nextInt();
                    if (fileIndex > 0 && fileIndex <= files.length) {
                        validInput = true;
                    } else {
                        System.out.println("Invalid choice");
                        scanner.next();
                    }
                }
                File selectedFile = files[fileIndex - 1];
                try (BufferedReader reader = new BufferedReader(new FileReader(selectedFile))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        System.out.println(line);
                    }
                } catch (IOException e) {
                    System.out.print("Error reading file + e.getMessage");
                }

            }
        }
    }

    private void displayStudentAverages() {
        // todo: 3 - allow the user to select a file name
        // load all student assignment scores from the file - display student statistics (low score, high score, average score)
        Scanner in = new Scanner(System.in);
        File directory = new File("files");
        
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Directory doesn't exist");
            return;
        }

        File[] files = directory.listFiles();
        if (files == null || files.length == 0) {
            System.out.println("No files");
            return;
        }

        System.out.println("Select a file by number:");
        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile()) {
                System.out.println((i + 1) + ". " + files[i].getName());
            }
        }

        System.out.print("Enter a file number: ");
        int fileNumber = in.nextInt();
        in.nextLine();

        if (fileNumber > 0 && fileNumber <= files.length) {
            File selectedFile = files[fileNumber - 1];
            List<Integer> scores = new ArrayList<>();

            try (BufferedReader reader = new BufferedReader(new FileReader(selectedFile))) {
                String line;
                boolean isFirstLine = true;

                while ((line = reader.readLine()) != null) {
                    if (isFirstLine) {
                        isFirstLine = false;
                        continue;
                    }

                    String[] parts = line.split(",");
                    if (parts.length == 5) {
                        try {
                            int score = Integer.parseInt(parts[4].trim());
                            scores.add(score);
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid score format: " + parts[4]);
                        }
                    } else {
                        System.out.println("Invalid data format: " + line);
                    }
                }

                if (scores.isEmpty()) {
                    System.out.println("No scores found in the file.");
                    return;
                }

                int lowScore = Integer.MAX_VALUE;
                int highScore = Integer.MIN_VALUE;
                int totalScore = 0;

                for (int score : scores) {
                    if (score < lowScore) lowScore = score;
                    if (score > highScore) highScore = score;
                    totalScore += score;
                }

                double averageScore = (double) totalScore / scores.size();

                System.out.println("Student Statistics:");
                System.out.println("Low Score: " + lowScore);
                System.out.println("High Score: " + highScore);
                System.out.println("Average Score: " + String.format("%.2f", averageScore));

            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
            }
        } else {
            System.out.println("Invalid selection");
        }
    }


    private void displayAllStudentStatistics() {

        // todo: 4 - Optional / Challenge - load all scores from all student and all assignments
        // display the statistics for all scores (low score, high score, average score, number of students, number of assignments)
    }

    private void displayAssignmentStatistics()
    {
        // todo: 5 - Optional / Challenge - load all scores from all student and all assignments
        // display the statistics for each assignment (assignment name, low score, high score, average score)
        // this one could take some time
    }

    private String parseStudentName(String fileName)
    {
        return fileName.replace(".csv", "")
                        .replace("_", " ")
                        .substring(10);
    }
}
