package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;


public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String poengsum = showInputDialog("Hva er poengsummet?");
		int poengsum2 = parseInt(poengsum);
		
		if (poengsum2>=90 &&poengsum2 <=100) {
			
			showMessageDialog(null," Karakteren er A");
			
			}else if (poengsum2>=80 && poengsum2<=89) {
				showMessageDialog(null, "Karaketren er B");
			}else if (poengsum2>=60 && poengsum2<=79) {
				showMessageDialog(null," Karakteren er C");

			} else if (poengsum2>=50 && poengsum2<=59) {
				showMessageDialog(null, "Karakter er  D");
			} else if (poengsum2>=40 && poengsum2<=49) {
				showMessageDialog(null, " karakter er E ");
			} else {
				showMessageDialog(null, "Karakter er F ");
			
}



	}

}
