import netscape.javascript.JSObject;

import java.applet.Applet;

public class Class69 {

	public static void method924(Applet var0, String var1, byte var2) throws Throwable {
		JSObject.getWindow(var0).eval(var1);
	}

	public static Object method928(Applet var0, String var1, int var2) throws Throwable {
		return JSObject.getWindow(var0).call(var1, (Object[]) null);
	}

	Class69() throws Throwable {
		throw new Error();
	}

}
