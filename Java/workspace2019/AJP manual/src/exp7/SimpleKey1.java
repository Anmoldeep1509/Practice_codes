/**
 * 
 */
package exp7;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Anmoldeep
 *	can't fetch expected results...no key pressing updates
 */
public class SimpleKey1 extends JApplet implements KeyListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String msg = "Keys Pressed:";
	
	int x = 20, y = 20;
	
	@Override
	public void init() {
		// TODO Auto-generated method stub
		addKeyListener(this);
		requestFocus();
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		showStatus("Key Down");
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		showStatus("Key Released");
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		msg += e.getKeyChar();
		repaint();
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.drawString(msg, x, y);
	}
}
