import javax.swing.JOptionPane;
public class Celsfar {
	
	public void convertTemps(){
		String tempType;
		double far = 1;
		double cel = 1;
		double getTemp = 1;
		String another;
		boolean nextTemp = true;
		
		String temp = "1000";
		
		
		
		while (nextTemp) {
		
			temp = 
				JOptionPane.showInputDialog("Input a temperature.");
				getTemp = Double.parseDouble(temp);
			
			tempType =
				JOptionPane.showInputDialog("Indicate C or F.");
			if (!(tempType.equalsIgnoreCase("F") || tempType.equalsIgnoreCase("C"))){
				tempType =
				JOptionPane.showInputDialog("Indicate C or F.");
				}
			if (tempType.equalsIgnoreCase("C")) {
				far = (9 * (getTemp) / 5 ) + 32;
				JOptionPane.showMessageDialog(null, "The temperature is: " + far + " Fahrenheit.", "Temperature Conversion", JOptionPane.PLAIN_MESSAGE);
				}
			else {
				cel = 5 * (getTemp - 32) / 9;
				JOptionPane.showMessageDialog(null, "The temperatre is: " + cel + " Celsius.", "Temperature Conversion", JOptionPane.PLAIN_MESSAGE);
				}
			another =
				JOptionPane.showInputDialog("Enter another temperature. 'Y' continues the loop.");
			if (another.equalsIgnoreCase("Y")) {
				nextTemp = true;
				}
			else {
				nextTemp = false;
				}
				}
			System.exit(0);		
		
		}
	
	public static void main (String args[]){
		
		Celsfar demo = new Celsfar();
		demo.convertTemps();
		
		}

	}
