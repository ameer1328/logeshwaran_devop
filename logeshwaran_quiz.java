package com.example.quiz;
import java.util.Scanner; 
  
public class Quiz { 
    public static void main(String[] args) { 
        String[][] questions = { 
            {"What is the capital of France?", "A) Paris", "B) London", "C) Rome", "D) Berlin", "A"}, 
            {"What is the largest planet in our solar system?", "A) Earth", "B) Jupiter", "C) Saturn", "D) Mars", "B"}, 
            {"What is the chemical symbol for water?", "A) H2O", "B) CO2", "C) O2", "D) H2O2", "A"}, 
            {"Who wrote 'Pride and Prejudice'?", "A) Charlotte Brontë", "B) Jane Austen", "C) Emily Dickinson", "D) William Shakespeare", "B"} 
        }; 
  
        int score = 0; 
        Scanner scanner = new Scanner(System.in); 
  
        System.out.println("Welcome to the CLI Quiz! Answer the following questions:\n"); 
  
        for (String[] q : questions) { 
            System.out.println(q[0]); 
            for (int i = 1; i <= 4; i++) { 
                System.out.println(q[i]); 
            } 
  
            System.out.print("Your answer (A, B, C, or D): "); 
            String answer = scanner.nextLine().trim().toUpperCase(); 
  
            if (answer.equals(q[5])) { 
                System.out.println("Correct!\n"); 
                score++; 
            } else { 
                System.out.println("Incorrect! The correct answer is " + q[5] + "\n"); 
            } 
        } 
  
        System.out.println("Quiz completed! Your final score is: " + score + "/" + questions.length); 
        if (score == questions.length) { 
            System.out.println("Excellent job!"); 
        } else if (score >= questions.length / 2) { 
            System.out.println("Good effort!"); 
        } else { 
            System.out.println("Better luck next time!"); 
        } 
  
        scanner.close(); 
    } 
} 
