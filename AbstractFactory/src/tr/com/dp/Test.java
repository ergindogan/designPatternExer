package tr.com.dp;

import tr.com.dp.factory.MotifWidgetFactory;
import tr.com.dp.factory.WidgetFactory;
import tr.com.dp.scrollbar.ScrollBar;
import tr.com.dp.window.Window;

public class Test {

	public static void main(String[] args) {
		
		/**
		 * The class of a concrete factory appears only once in an application-that is, where it's instantiated. 
		 * This makes it east to change the concrete factory an application uses. It can use different product
		 * configurations simply by changing the concrete factory. This is f*cking AWESOME!
		 */
		
		
		/**
		 * Clients manipulate instances through their abstract interfaces.
		 */
		
		/**
		 * When product object in a family are designed to work together, it's important that an application use objects
		 * from only one family at a time. 
		 */
		
		/**
		 * It is hard to add new kinds of products.
		 */
		
		WidgetFactory myFactory = new MotifWidgetFactory();
		
		Window window = myFactory.createWindow();
		ScrollBar scrollBar = myFactory.createScrollBar();
	}

}
