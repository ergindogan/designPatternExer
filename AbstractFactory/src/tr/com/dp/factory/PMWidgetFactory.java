package tr.com.dp.factory;

import tr.com.dp.scrollbar.PMScrollBar;
import tr.com.dp.scrollbar.ScrollBar;
import tr.com.dp.window.PMWindow;
import tr.com.dp.window.Window;

public class PMWidgetFactory implements WidgetFactory {

	@Override
	public Window createWindow() {
		return new PMWindow();
	}

	@Override
	public ScrollBar createScrollBar() {
		return new PMScrollBar();
	}

}
