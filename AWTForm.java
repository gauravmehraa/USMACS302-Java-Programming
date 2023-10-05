import java.awt.*;
import java.awt.event.*;

public class AWTForm implements ActionListener{
    Frame frame;
    Label labels[] = new Label[6];
    String labelText[] = {
    	"Fill in your details",
    	"Name: ",
    	"Age: ",
    	"Gender: ",
    	"Phone no.: ",
    	"Email: "
    };
    int labelXY[][] = {{40, 40, 300, 30}, {40, 80, 150, 30}, {40, 120, 150, 30}, {40, 160, 150, 30}, {40, 230, 150, 30}, {40, 270, 150, 30}};
    static TextField textfields[] = new TextField[4];
    int textfieldXY[][]={{250, 80, 200, 30}, {250, 120, 200, 30}, {250, 230, 200, 30}, {250, 270, 200, 30}};
    Checkbox checkboxes[] = new Checkbox[2];
    CheckboxGroup cbg;
    String checkboxText[] = {"Male", "Female"};
    int checkboxXY[][] = {{250, 160, 200, 30}, {250, 190, 200, 30}};
    Button submit;
    static int flag = 0;
    static String gender="";
    int vage;

    public AWTForm(){
    	frame = new Frame("Form Submission");
    	cbg = new CheckboxGroup();
    	for(int i = 0; i < 6; i++){
    		labels[i] = new Label(labelText[i]);
    		labels[i].setBounds(labelXY[i][0], labelXY[i][1], labelXY[i][2], labelXY[i][3]);
    	}
    	for(int i = 0; i < 4; i++){
    		textfields[i] = new TextField("");
    		textfields[i].setBounds(textfieldXY[i][0], textfieldXY[i][1], textfieldXY[i][2], textfieldXY[i][3]);
    	}
        for(int i = 0; i < 2; i++){
        	checkboxes[i] = new Checkbox(checkboxText[i], cbg, false);
        	checkboxes[i].setBounds(checkboxXY[i][0], checkboxXY[i][1], checkboxXY[i][2], checkboxXY[i][3]);
        }
        submit = new Button("SUBMIT");
        submit.setBounds(300, 340, 100, 30);
        submit.addActionListener(this);
        frame.add(submit);

        for(int i = 0; i < 6; i++){
        	frame.add(labels[i]);
        	if(i > 3) continue;
        	frame.add(textfields[i]);
        	if(i > 1) continue;
        	frame.add(checkboxes[i]);
        }
        
        frame.setSize(500, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
    public void actionPerformed(ActionEvent e) {
        String message = "";
        Label msg = new Label();
        msg.setForeground(Color.red);
        for(int i = 0; i < 4; i++){
        	if(textfields[i].getText().equals("") || gender.equals("")){
        		message = "Text fields cannot be empty";
        		flag = 1;
        		break;
        	}
        }
        try{ vage = Integer.valueOf(textfields[1].getText()); }
        catch(NumberFormatException ex){
        	message += "\n Invalid age";
        	flag = 1;
        }
        if(textfields[3].getText().length() != 10){
        	message += "\nInvalid phone no.";
        	flag = 1;
        }
        gender = cbg.getSelectedCheckbox().getLabel();
        msg.setText(msg.getText() + message);
        frame.add(msg);
        display();
    }
    public static void display() {
        if (flag == 0){
        	for(int i = 0; i < 4; i++){
        		System.out.println(textfields[i].getText());
        	}
        	System.out.println(gender);
        }
        else
            System.out.println(flag+ "\tSomething went wrong");
    }
    public static void main(String args[]) {
        new AWTForm();
    }
}
