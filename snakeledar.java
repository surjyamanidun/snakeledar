package com.snakeandleder;
import java.util.Random;

public class snakeledar {



	public class SnakeAndLadder {
	    public static void main(String[] args) {
	        int position = 0;
	        int IS_LADDER = 2;
	        int IS_SNAKE = 1;
	        int NO_PLAY = 0;


	        System.out.println("Welcome to Snake and Ladder Game");
	        Random random = new Random();
	        int diceNumber = random.nextInt(6)+1;
	        int option = random.nextInt(3);
	        if (option == IS_LADDER){
	            System.out.println("Ladder for the Player");
	            position += diceNumber;
	        }
	        else if (option == IS_SNAKE){
	            System.out.println("Snake for the Player");
	            position -= diceNumber;
	        }
	        else {
	            System.out.println("No Play for the Player");
	        }
	        System.out.println("Dice Number : " + diceNumber);
	        System.out.println("Position : " + position);
	    }
	}
}