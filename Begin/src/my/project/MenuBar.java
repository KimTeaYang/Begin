package my.project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuBar {
	public JMenuBar createMenuBar() {
		JMenuBar menuBar = new JMenuBar();
		menuBar.setLayout(new BoxLayout(menuBar, BoxLayout.PAGE_AXIS));
		menuBar.add(createMenu("의류"));
		menuBar.add(createMenu("음식"));
		menuBar.add(createMenu("레저"));

		menuBar.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.BLACK));
		return menuBar;
	}

	public JMenu createMenu(String title) {
		JMenu m = new HorizontalMenu(title);
		m.add("나이키");
		m.add("아디다스");
		m.add("퓨마");

		JMenu submenu = new HorizontalMenu("Submenu");
		submenu.add("Submenu item #1");
		submenu.add("Submenu item #2");
		m.add(submenu);

		return m;
	}

	private static void createAndShowGUI() {

		JFrame frame = new JFrame("MenuBar");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		MenuBar demo = new MenuBar();
		Container contentPane = frame.getContentPane();
		contentPane.setBackground(Color.WHITE);
		contentPane.add(demo.createMenuBar(), BorderLayout.LINE_START);

		frame.setSize(500, 450);
		frame.setVisible(true);
	}

	class HorizontalMenu extends JMenu {
		HorizontalMenu(String label) {
			super(label);
			JPopupMenu pm = getPopupMenu();
			pm.setLayout(new BoxLayout(pm, BoxLayout.LINE_AXIS));
		}

		public Dimension getMinimumSize() {
			return getPreferredSize();
		}

		public Dimension getMaximumSize() {
			return getPreferredSize();
		}

		public void setPopupMenuVisible(boolean b) {
			boolean isVisible = isPopupMenuVisible();
			if (b != isVisible) {
				if ((b == true) && isShowing()) {
					int x = 0;
					int y = 0;
					Container parent = getParent();
					if (parent instanceof JPopupMenu) {
						x = 0;
						y = getHeight();
					} else {
						x = getWidth();
						y = 0;
					}
					getPopupMenu().show(this, x, y);
				} else {
					getPopupMenu().setVisible(false);
				}
			}
		}
	}
}
