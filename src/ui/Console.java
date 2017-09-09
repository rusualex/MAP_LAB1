package ui;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import controller.ControllerStudent;

public class Console {
	public static void UI() {
		ControllerStudent controller = new ControllerStudent();
		controller.createStudent("Jonny", 1, 10);
		controller.createStudent("David", 1, 7);
		controller.createStudent("Toni", 2, 1);
		controller.createStudent("Florin", 1, 4);
		controller.createStudent("Georgiana", 2, 8);
		controller.createStudent("Alex", 2, 9);
		controller.createStudent("Cristian", 1, 5);
		controller.createStudent("Sandu", 2, 6);

		boolean ok = true;
		while (ok == true) {
			try (BufferedReader br = new BufferedReader(new FileReader("src/ui/ConsoleMessageBox.txt"))) {
				String line = null;
				while ((line = br.readLine()) != null) {
					System.out.println(line);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			int num = -1;
			String errorMsg = ">>>Type a number between 0 and 6<<<";

			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			if (scanner.hasNextInt()) {
				num = scanner.nextInt();
				
				switch (num) {
				case 1: {
					System.out.print("Introduceti numele studentului: ");
					scanner = new Scanner(System.in);
					while (!scanner.hasNext()) {
						System.out.println("Introduceti un nume!");
						scanner = new Scanner(System.in);
					}
					String nume = scanner.next();
					System.out.print("Introduceti un semestru pentru student: ");
					scanner = new Scanner(System.in);
					while (!scanner.hasNextInt()) {
						System.out.println("Introduceti un numar!");
						scanner = new Scanner(System.in);
					}
					int semestru = scanner.nextInt();
					System.out.print("Introduceti nota pentru student: ");
					scanner = new Scanner(System.in);
					while (!scanner.hasNextInt()) {
						System.out.println("Introduceti un numar!");
						scanner = new Scanner(System.in);
					}
					int nota = scanner.nextInt();
					controller.createStudent(nume, semestru, nota);
					controller.printStudentRepo(controller.studList);
					break;
				}
				case 2: {
					System.out.println("Lista studentilor este: ");
					controller.printStudentRepo(controller.studList);
					break;
				}
				case 3: {
					System.out.print("Introduceti un numar matricol al unui student: ");
					scanner = new Scanner(System.in);
					while (!scanner.hasNextInt()) {
						System.out.println("Introduceti un numar!");
						scanner = new Scanner(System.in);
					}
					int matrNr = scanner.nextInt();
					System.out.print("Modificati numele studentului: ");
					scanner = new Scanner(System.in);
					while (!scanner.hasNext()) {
						System.out.println("Introduceti un nume!");
						scanner = new Scanner(System.in);
					}
					String nume = scanner.next();
					System.out.print("Modificati semestrul studentului: ");
					scanner = new Scanner(System.in);
					while (!scanner.hasNextInt()) {
						System.out.println("Introduceti un numar!");
						scanner = new Scanner(System.in);
					}
					int semestru = scanner.nextInt();
					System.out.print("Modificati nota studentului: ");
					scanner = new Scanner(System.in);
					while (!scanner.hasNextInt()) {
						System.out.println("Introduceti un numar!");
						scanner = new Scanner(System.in);
					}
					int nota = scanner.nextInt();
					controller.updateStudent(matrNr, nume, semestru, nota);
					controller.printStudentRepo(controller.studList);
					break;
				}
				case 4: {
					System.out.print("Introduceti numele sau numarul matricol al studentului: ");
					scanner = new Scanner(System.in);
					if (scanner.hasNextInt()) {
						controller.deleteStudent(scanner.nextInt());
						controller.printStudentRepo(controller.studList);
					} else {
						controller.deleteStudent(scanner.next());
						controller.printStudentRepo(controller.studList);
					}
					break;
				}
				case 5: {
					System.out.print("Filtreaza studentii care au nota mai mare sau egala cu: ");
					scanner = new Scanner(System.in);
					while (!scanner.hasNextInt()) {
						System.out.println("Introduceti un numar!");
						scanner = new Scanner(System.in);
					}
					int nota = scanner.nextInt();
					controller.studFilterGrade(nota);
					break;
				}
				case 6: {
					System.out.println("Studentii sortati dupa nume: ");
					controller.studNameSort();
					break;
				}
				case 0:
					ok = false;
				}
			} else {

				System.out.println(errorMsg);
			}

		}
	}
}
