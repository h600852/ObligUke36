package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
// test 
public class OppgaveB5a {

	public static void main(String[] args) {
		
		for (int i=1; i<=10; i++) {
			
			String userInputString = showInputDialog("Skriv inn poengsum her:");
			int userTestScore = Integer.parseInt(userInputString);
			
			if (userTestScore < 39 && userTestScore >= 0) {
				showInputDialog(null, "F");
			} else if (userTestScore < 49 && userTestScore >= 40) {
				showInputDialog(null, "E");
			} else if (userTestScore < 59 && userTestScore >= 50) {
				showInputDialog(null, "D");
			} else if (userTestScore < 79 && userTestScore >= 60) {
				showInputDialog(null, "C");
			} else if (userTestScore < 89 && userTestScore >= 80) {
				showInputDialog(null, "B");
			} else if (userTestScore < 100 && userTestScore >= 90) {
				showInputDialog(null, "A");
			} else showMessageDialog(null, "Error 404");
			
		if (userTestScore <30) {
			System.out.println("F");
		}
		if (userTestScore >100) {
			System.out.println("unvalid: must be lover than 100");
			i--;
		}
		}
		
	}
	
}
