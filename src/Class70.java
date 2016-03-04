import netscape.javascript.JSObject;

import java.applet.Applet;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class Class70 {

	static final int anInt852 = 262144;
	static final int anInt855 = 1;
	static final int anInt856 = 2;
	static final int anInt857 = 3;
	public static final int anInt858 = 131;
	public static final int anInt859 = 35;
	static final int anInt860 = 0;
	static Applet anApplet854 = null;
	static String aString853 = null;

	static boolean method931(String var0, int var1, String var2, int var3) {
		if (var1 == 0) {
			try {
				if (!aString853.startsWith("win")) {
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
					throw new Exception();
				} else {
					String var13 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

					for (int var14 = 0; var14 < var0.length(); var14++) {
						if (var13.indexOf(var0.charAt(var14)) == -1) {
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
					return true;
				}
			} catch (Throwable var8) {
				return false;
			}
		} else if (var1 == 1) {
			try {
				Applet var5 = anApplet854;
				Object[] var6 = new Object[]{(new URL(anApplet854.getCodeBase(), var0)).toString()};
				Object var4 = JSObject.getWindow(var5).call(var2, var6);
				return var4 != null;
			} catch (Throwable var9) {
				return false;
			}
		} else if (var1 == 2) {
			try {
				anApplet854.getAppletContext().showDocument(new URL(anApplet854.getCodeBase(), var0), "_blank");
				return true;
			} catch (Exception var10) {
				return false;
			}
		} else if (var1 == 3) {
			try {
				Class69.method928(anApplet854, "loggedout", -1836133076);
			} catch (Throwable var12) {
				;
			}

			try {
				anApplet854.getAppletContext().showDocument(new URL(anApplet854.getCodeBase(), var0), "_top");
				return true;
			} catch (Exception var11) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	Class70() throws Throwable {
		throw new Error();
	}

	public static Class82[] method937(int var0) {
		return new Class82[]{Class82.aClass82_975, Class82.aClass82_978, Class82.aClass82_974, Class82.aClass82_976, Class82.aClass82_977, Class82.aClass82_979};
	}

	static final byte[] method938(byte[] var0, int var1) {
		DataBuffer var2 = new DataBuffer(var0);
		int var3 = var2.readUByte();
		int var4 = var2.readInt();
		if (var4 >= 0 && (IndexDescriptor.anInt1362 * -1248471115 == 0 || var4 <= IndexDescriptor.anInt1362 * -1248471115)) {
			if (var3 == 0) {
				byte[] var7 = new byte[var4];
				var2.readBytes(var7, 0, var4);
				return var7;
			} else {
				int var5 = var2.readInt();

				// Xtea crashpatch
				if (var5 > 1_000_000) {
					System.err.println("XTEA crash intercepted; returning null bytes");
					return new byte[100];
				}

				if (var5 >= 0 && (IndexDescriptor.anInt1362 * -1248471115 == 0 || var5 <= IndexDescriptor.anInt1362 * -1248471115)) {
					byte[] var6 = new byte[var5];
					if (var3 == 1) {
						Class64.method841(var6, var5, var0, var4, 9);
					} else {
						IndexDescriptor.aClass56_1358.method787(var2, var6, (short) 17772);
					}

					return var6;
				} else {
					System.err.println("ERROR IN ARCHIVELOADING; RETURNING EMPTY ARRAY");
					return new byte[100];
					//throw new RuntimeException();
				}
			}
		} else {
			throw new RuntimeException();
		}
	}

	static long method939(int var0) {
		try {
			URL var1 = new URL(ScriptInvocation.method1836("services", false) + "m=accountappeal/login.ws");
			URLConnection var2 = var1.openConnection();
			var2.setRequestProperty("connection", "close");
			var2.setDoInput(true);
			var2.setDoOutput(true);
			var2.setConnectTimeout(5000);
			OutputStreamWriter var3 = new OutputStreamWriter(var2.getOutputStream());
			var3.write("data1=req");
			var3.flush();
			InputStream var4 = var2.getInputStream();
			DataBuffer var5 = new DataBuffer(new byte[1000]);

			do {
				int var6 = var4.read(var5.data, var5.pos * 1736753585, 1000 - var5.pos * 1736753585);
				if (var6 == -1) {
					var5.pos = 0;
					long var7 = var5.readLong();
					return var7;
				}

				var5.pos += var6 * 1303963473;
			} while (var5.pos * 1736753585 < 1000);

			return 0L;
		} catch (Exception var9) {
			return 0L;
		}
	}

}
