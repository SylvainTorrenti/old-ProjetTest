package Exercice;

import java.util.Scanner;

public class ExerciceAfpa1For {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("veuillez saisir un nombre");
			int n = sc.nextInt();
			int somme = 0;
			sc.close();
		for (; n>0; n--) {
			somme=somme+n;
			
			

		}
		System.out.println(somme);
	}

}