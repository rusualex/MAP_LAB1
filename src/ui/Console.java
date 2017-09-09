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
		while (true) {
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

			Scanner scanner = new Scanner(System.in);
			if (scanner.hasNextInt()) {
				num = scanner.nextInt();
				for (int clear = 0; clear <= 100; clear++)
					System.out.println();
			} else {
				for (int clear = 0; clear <= 100; clear++)
					System.out.println();
				System.out.println(errorMsg);
			}

			switch (num) {
			case 1: {
				
				//controller.createStudent(studMatrNr, studName, studSem, studGrade);
			}
			case 2: controller.printStudentRepo(controller.studList);
			case 3: 
			case 4:
			case 5:
			case 6:
			case 0:
			}

		}
	}
}
