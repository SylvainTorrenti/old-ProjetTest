package Exercice;

import java.util.Scanner;

public class ExerciceAfpa1While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("veuillez saisir un nombre");
		int i = sc.nextInt();
		int somme = 0;
		sc.close();
		while (i >= 0) {
			somme=somme+i;
			i--;
		}
		System.out.println("La somme est de : " + somme);

	}

}