import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class AWTCalculator implements ActionListener{
	Frame root;
	Label label;
	String buttonText[] = {	"7", "8", "9", "CLR",
						   	"4", "5", "6", "X",
							"1", "2", "3", "/",
							"0", "+", "-", "="};
	Button buttons[] = new Button[16];
	int op;

	public AWTCalculator(){
		root = new Frame("AWT Calculator");
		label=new Label("", Label.CENTER);
		root.add(label);
		Panel panel = new Panel();
		panel.setLayout(new GridLayout(4,4));

		for(int i = 0; i < 16; i++){
			buttons[i] = new Button(buttonText[i]);
			panel.add(buttons[i]);
			buttons[i].addActionListener(this);
		}

		root.add(panel);
		root.setSize(400, 600);
		root.setVisible(true);
		root.setLayout(new GridLayout(2,1));
		root.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){root.dispose();}
		});
	}

	public void calculate(){
		String expression = label.getText();
		int index = -1;
		if(expression.contains("+")) index = expression.indexOf("+");
        else if (expression.contains("-")) index = expression.indexOf("-");
        else if (expression.contains("x")) index = expression.indexOf("x");
		else if (expression.contains("/")) index = expression.indexOf("/");

		if(index != -1){
			double num1 = Double.valueOf(expression.substring(0, index));
			double num2 = Double.valueOf(expression.substring(index + 1));
			double result = 0;
            switch(op){
            	case 1: result = num1 + num2; break;
            	case 2: result = num1 - num2; break;
            	case 3: result = num1 * num2; break;
            	case 4: result = num1 / num2; break;
            	default: result = Double.NaN; break;
            }
            label.setText(Double.toString(result));
        }
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource() == buttons[3]) label.setText("");
		else if(e.getSource() == buttons[15]) calculate();
		else{
			for(int i = 0; i < 16; i++){
				if(i == 3 || i == 15) continue;
				if(e.getSource() == buttons[i]){
					label.setText(label.getText()+buttonText[i]);
					switch(i){
						case 7: op = 3; break;
						case 11: op = 4; break;
						case 13: op = 1; break;
						case 14: op = 2; break; 
					}
				}
			}
		}
	}
	public static void main(String args[]){
		AWTCalculator calc = new AWTCalculator();
	}
}