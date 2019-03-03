/**
 * 
 */
package exp9;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * @author Anmoldeep
 *
 */
public class MyMouseAdapter extends MouseAdapter{

	/* (non-Javadoc)
	 * @see java.awt.event.MouseListener#mouseClicked(java.awt.event.MouseEvent)
	 */
	
	AdapterDemo adapterDemo;
	
	public MyMouseAdapter(AdapterDemo adapterDemo) {
		// TODO Auto-generated constructor stub
		this.adapterDemo = adapterDemo;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		adapterDemo.showStatus("Mouse Clicked");
	}
}
