package guessnum;
//使鼠标能够拖动的适配器

import java.awt.Container;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class MouseDraggedAdapter extends MouseAdapter {
	private Point lastPoint = null;
	
	private Container container;
	
	public MouseDraggedAdapter(Container container) {
		this.container = container;
	}
	
	public void mousePressed(MouseEvent e) {
		lastPoint = e.getLocationOnScreen();
	}
	
	public void mouseDragged(MouseEvent e) {
		Point point = e.getLocationOnScreen();
		int offsetX = point.x - lastPoint.x;
		int offsetY = point.y - lastPoint.y;
		Rectangle bounds = container.getBounds();
		bounds.x += offsetX;
		bounds.y += offsetY;
		container.setBounds(bounds);
		lastPoint = point;
	}
}