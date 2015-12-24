package tr.com.dp.factory;

import tr.com.dp.scrollbar.MotifScrollBar;
import tr.com.dp.scrollbar.ScrollBar;
import tr.com.dp.window.MotifWindow;
import tr.com.dp.window.Window;

public class MotifWidgetFactory implements WidgetFactory {

	@Override
	public Window createWindow() {
		return new MotifWindow();
	}

	@Override
	public ScrollBar createScrollBar() {
		return new MotifScrollBar();
	}

}
