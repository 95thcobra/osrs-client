import java.applet.AppletContext;
import java.applet.AppletStub;
import java.awt.EventQueue;
import java.awt.Insets;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class Loader implements AppletStub {

	/**
	 * Feel free to figure these as you wish
	 */
	// public static final String IP = "localhost";
	public static final String IP = "77.251.97.234";
	public static final int PORT = 43594;
	public static final int WORLD = 1;
	public static final int REV = 86;
	public static final boolean local = true;
	public static final String SERVER_NAME = "Edgeville [DEVELOPMENT]";

	/**
	 * No need to configure anything lower
	 */
	public static final String URL = "http://oldschool" + WORLD + ".runescape.com/";
	public static final String CONFIG = URL + "a=946/jav_config.ws";
	public static Loader ctx;
	public static Properties parameters = new Properties();

	public static void main(String[] args) throws IOException {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					ctx = new Loader();
					ctx.startClient();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private void startClient() {
		try {
			readParameters();
			GameClient c = new GameClient();
			c.setStub(this);
			c.init();
			c.start();

			JFrame clientFrame = new JFrame(SERVER_NAME);
			clientFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			clientFrame.add(c);
			clientFrame.setVisible(true);

			JFrame jf = new JFrame();
			jf.pack();
			Insets i = jf.getInsets();

			clientFrame.setSize(765 + i.left + i.right, 503 + i.top + i.bottom);
			clientFrame.setLocationRelativeTo(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void readParameters() {
		try {
			URL url = Loader.class.getResource("/params.txt");

			BufferedReader reader = new BufferedReader(new InputStreamReader(url.openConnection().getInputStream()));
			List<String> lines = new ArrayList<>();
			String in;
			while ((in = reader.readLine()) != null)
				lines.add(in);

			for (String line : lines) {
				if (line.contains("param=")) {
					line = line.replace("param=", "");

					String parameterKey = line.substring(0, line.indexOf("="));
					String parameterValue = line.substring(line.indexOf("=") + 1, line.length());
					parameters.put(parameterKey, parameterValue);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void appletResize(int dimensionX, int dimensionY) {
	}

	public static String getParam(String name) {
		return (String) parameters.get(name);
	}

	@Override
	public String getParameter(String paramName) {
		return (String) parameters.get(paramName);
	}

	@Override
	public URL getDocumentBase() {
		return getCodeBase();
	}

	@Override
	public URL getCodeBase() {
		try {
			return new URL("http://" + IP);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public AppletContext getAppletContext() {
		return null;
	}

	@Override
	public boolean isActive() {
		return true;
	}

}