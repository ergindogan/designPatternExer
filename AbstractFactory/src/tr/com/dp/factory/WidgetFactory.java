package tr.com.dp.factory;

import tr.com.dp.scrollbar.ScrollBar;
import tr.com.dp.window.Window;

public interface WidgetFactory {

	Window createWindow();
	
	ScrollBar createScrollBar();
}
