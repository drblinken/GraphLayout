package start;

import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JPanel;

import original.Graph;

public abstract class PseudoApplet {
	JFrame frame;
	Graph graph;
	JPanel graphPanel;
	int width = 400;
	int height = 400;
	private Map<String, String> parameters = new HashMap<String, String>();

	/*
	 * methods overriden
	 */

	public abstract String getAppletInfo();

	public abstract String[][] getParameterInfo();

	public abstract void init();

	public abstract void destroy();

	public abstract void start();

	public abstract void stop();

	/*
	 * implementations of Applet methods
	 */

	public void actionPerformed(ActionEvent e) {
	}

	public void remove(JPanel panel) {
	}

	public URL getCodeBase() {
		return getClass().getClassLoader().getResource(".");
	}

	public Dimension getSize() {
		return frame.getSize();
	}

	public void play(URL codeBase, String file) {

	}

	public void setLayout(LayoutManager manager) {
		frame.setLayout(manager);
	}

	public void add(String layoutConstraint, JPanel panel) {
		frame.add(panel, layoutConstraint);
	}

	public void addParameter(String name, String value) {
		parameters.put(name, value);

	}

	public String getParameter(String name) {

		return parameters.get(name);
	}

	public PseudoApplet() {
		createFrame();
	}

	public void createFrame() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.pack();
		frame.setSize(width, height);
		frame.setVisible(true);
	}

}
