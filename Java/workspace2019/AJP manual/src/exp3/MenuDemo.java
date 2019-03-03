/**
 * 
 */
package exp3;

import java.awt.*;

/**
 * @author Anmoldeep
 * application doesn't exits and runs in zero size
 */
public class MenuDemo extends Frame{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuDemo m = new MenuDemo();
		m.setVisible(true);
		
		MenuBar mbr = new MenuBar();
		m.setMenuBar(mbr);
		
//		Creating Menus
		Menu filemenu = new Menu("File");
		Menu editmenu = new Menu("Edit");
		Menu viewmenu = new Menu("View");
		
//		Adding Menus to MenuBar
		mbr.add(filemenu);
		mbr.add(editmenu);
		mbr.add(viewmenu);
		
//		Creating Menu Item for file menu
		MenuItem new1 = new MenuItem("New");
		MenuItem open1 = new MenuItem("Open");
		
//		Adding these to the File menu
		filemenu.add(new1);
		filemenu.add(open1);
		
	}

}
