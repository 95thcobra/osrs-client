import java.applet.Applet;

public class RuntimeException_Sub1 extends RuntimeException {

	static int anInt2783;
	public static String aString2784;
	static Applet anApplet2785;
	public static final int anInt2787 = 10;
	public static final int anInt2789 = 94;
	String aString2788;
	Throwable aThrowable2786;

	static final void method3300(int var0, int var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
		if (!ItemContainer.method1840(var0)) {
			if (var7 < 104) {
				;
			}
		} else {
			Class24.method354(InterfaceDef.aInterfaceDefArrayArray1975[var0], -1, var1, var2, var3, var4, var5, var6, (byte) -1);
		}
	}

	static Class method3305(String var0, int var1) throws ClassNotFoundException {
		return var0.equals("B") ? Byte.TYPE : (var0.equals("I") ? Integer.TYPE : (var0.equals("S") ? Short.TYPE : (var0.equals("J") ? Long.TYPE : (!var0.equals("Z") ? (var0.equals("F") ? Float.TYPE : (var0.equals("D") ? Double.TYPE : (var0.equals("C") ? Character.TYPE : (var0.equals("void") ? Void.TYPE : Class.forName(var0))))) : Boolean.TYPE))));
	}

	public static void method3306(boolean var0, int var1) {
		if (Class136.aBool1607 != var0) {
			Class26.method369(-96841000);
			Class136.aBool1607 = var0;
		}

	}

	RuntimeException_Sub1(Throwable var1, String var2) {
		aString2788 = var2;
		aThrowable2786 = var1;
	}

}
