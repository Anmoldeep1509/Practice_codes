/**
 * 
 */
package exp1;

import java.awt.*;
import java.applet.*;

/**
 * @author Anmoldeep
 *
 */
public class CompDemo extends Applet{

//	Declaring AWT Components
	TextField txtField;
	TextArea txtArea;
	Button bttn;
	Label name;
	Label about;
	
//	Applet's init method
	public void init() {
		// TODO Auto-generated method stub
//		Creating AWTComponents
		txtField = new TextField();
		txtArea = new TextArea();
		bttn = new Button("Submit");
		name = new Label("Name Please");
		about = new Label("About Yourself");
		
//		Adding AWT Components
		add(name);
		add(txtField);
		add(about);
		add(txtArea);
		add(bttn);		
	}
//	<applet code= CompDemo.class height=100 width=200></applet>
}

