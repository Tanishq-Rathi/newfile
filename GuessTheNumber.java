package com.company;
import java.util.Random;
import java.util.Scanner;

class Game {
    public int number;
    public int InputNumber;
    public int NoOfGuesses = 0;

    public int getNoOfGuesses() {
        return NoOfGuesses;
    }

    public void setNoOfGuesses(int NoOfGuesses) {
        this.NoOfGuesses = NoOfGuesses;
    }

    Game() {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    void TakeUserInput() {
        System.out.println("Guess The Number");
        Scanner sc = new Scanner(System.in);
        InputNumber = sc.nextInt();
    }

    boolean IsCorrect() {
        NoOfGuesses++;
        if (InputNumber == number) {
            System.out.format("Yes you guessed it right number is %d\nyou guessed in %d attempts", number, NoOfGuesses);
            return true;
        } else if (InputNumber < number) {
            System.out.println("Your guess is to low");
        } else if (InputNumber > number) {
            System.out.println("you guess is to high");
        }

        return false;
    }

}

        public class GuessTheNumber {
            public static void main(String[] args) {

                Game g = new Game();
                boolean b = false;
                while (!b) {
                    g.TakeUserInput();
                    b = g.IsCorrect();
                }
            }
        }


