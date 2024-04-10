package test;

import java.util.Random;

public class Dice {

	int roll() {
		Random rd = new Random();
		return rd.nextInt(1, 6);
	}

	public static void main(String[] args) {
		Dice d = new Dice();
		System.out.println("주사위의 숫자 : " + d.roll());

	}

	}


