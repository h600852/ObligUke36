package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgaveB4 {

	public static void main(String[] args) {
		
		String bruttolonn = showInputDialog("Din bruttolønn");
		int lonn = Integer.parseInt(bruttolonn);
		
		double trinn0 = 0;
		double trinn1 = 0.093;
		double trinn2 = 0.0241;
		double trinn3 = 0.1152;
		double trinn4 = 0.1452;
		
		if (lonn >=0 && lonn <= 164100) {
			
			showMessageDialog(null, "Din trinnskatt er " + lonn * trinn0);
		}
		else if (lonn >=161400 && lonn <= 230950) {
			showMessageDialog(null, "Din trinnskatt er " + lonn * trinn1);
		}
		else if (lonn >=161400 && lonn <= 580650) {
			showMessageDialog(null, "Din trinnskatt er " + lonn * trinn2);
		}
		else if (lonn >=161400 && lonn <= 934050) {
			showMessageDialog(null, "Din trinnskatt er " + lonn * trinn3);
		}
		else if (lonn >=934050) {
			showMessageDialog(null, "Din trinnskatt er " + lonn * trinn4);
		}
	}
}
