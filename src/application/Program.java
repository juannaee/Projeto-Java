package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Calculator;
import entities.Multiplication;
import entities.Subtraction;
import entities.Sum;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Calculator> listCalculations = new ArrayList<>();
		System.out.println("Quantos Calculos você deseja fazer ?");
		int number = sc.nextInt();
		System.out.println();

		for (int i = 0; i < number; i++) {
			System.out.println("Qual calculo você deseja fazer?");
			System.out.printf("1-Soma%n2-Subtração%n3-Multiplicação");
			int menu = sc.nextInt();
			switch (menu) {
			case 1: {
				System.out.println();
				System.out.print("primeiro numero:");
				Double value1 = sc.nextDouble();
				System.out.println();
				System.out.print("Segundo numero:");
				Double value2 = sc.nextDouble();
				listCalculations.add(new Sum(value1, value2));

			}
				break;

			case 2: {
				System.out.println();
				System.out.print("primeiro numero:");
				Double value1 = sc.nextDouble();
				System.out.print("Segundo numero:");
				Double value2 = sc.nextDouble();
				listCalculations.add(new Subtraction(value1, value2));
			}
				break;
			case 3: {
				System.out.print("primeiro numero:");
				Double value1 = sc.nextDouble();
				System.out.print("Segundo numero:");
				Double value2 = sc.nextDouble();
				listCalculations.add(new Multiplication(value1, value2));
			}
				break;
			default:
				System.out.println("Opção Inexistente");
			}

		}

		System.out.println();
		for (Calculator calc : listCalculations) {
			System.out.println(calc.toString());
		}

		sc.close();

	}

}
