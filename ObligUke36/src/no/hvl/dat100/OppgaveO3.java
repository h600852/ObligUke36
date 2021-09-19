package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class OppgaveO3 {

	public static void main(String[] args) {
		
		int n = parseInt(showInputDialog("n!"));
		int svar = fakultet(n);
		
		showMessageDialog(null, svar);
	}
	public static int fakultet(int n) {
		if (n == 1) {
			return 1;
		} else {
			
			return n* fakultet(n-1);
		}
	}
	
}
