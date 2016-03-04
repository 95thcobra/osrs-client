import java.io.*;

public class Class88 {

	public static final int anInt1040 = 141;
	static final int anInt1043 = 2048;
	static IndexDescriptor_Sub1 aClass94_Sub1_1046;
	static final int anInt1048 = 512;
	public static final int anInt1050 = 242;
	public static Class88 aClass88_1049 = new Class88("LIVE", 0);
	public static Class88 aClass88_1041 = new Class88("BUILDLIVE", 3);
	public static Class88 aClass88_1047 = new Class88("RC", 1);
	public static Class88 aClass88_1042 = new Class88("WIP", 2);
	public String aString1044;
	public int anInt1045;

	public static int method1094(int var0, int var1, int var2) {
		int var3;
		if (var1 > var0) {
			var3 = var0;
			var0 = var1;
			var1 = var3;
		}

		while (var1 != 0) {
			var3 = var0 % var1;
			var0 = var1;
			var1 = var3;
		}

		return var0;
	}

	Class88(String var1, int var2) {
		aString1044 = var1;
		anInt1045 = var2 * 1110762613;
	}

	static final void method1095(Class5 var0, int var1, int var2, byte var3) {
		PacketEncoder.method913(var0.anInt96 * 620237057, var0.anInt87 * 2118565993, var0.anInt93 * 2058575135, var0.anInt89 * 1718790501, var0.aString90, var0.aString90, var1, var2, (byte) -38);
	}

	static String method1096(Throwable var0, int var1) throws IOException {
		String var4;
		if (var0 instanceof RuntimeException_Sub1) {
			RuntimeException_Sub1 var3 = (RuntimeException_Sub1) var0;
			var4 = var3.aString2788 + " | ";
			var0 = var3.aThrowable2786;
		} else {
			var4 = "";
		}

		StringWriter var13 = new StringWriter();
		PrintWriter var7 = new PrintWriter(var13);
		var0.printStackTrace(var7);
		var7.close();
		String var8 = var13.toString();
		BufferedReader var9 = new BufferedReader(new StringReader(var8));
		String var10 = var9.readLine();

		while (true) {
			while (true) {
				String var2 = var9.readLine();
				if (var2 == null) {
					var4 = var4 + "| " + var10;
					return var4;
				}

				int var5 = var2.indexOf(40);
				int var6 = var2.indexOf(41, 1 + var5);
				if (var5 >= 0 && var6 >= 0) {
					String var11 = var2.substring(var5 + 1, var6);
					int var12 = var11.indexOf(".java:");
					if (var12 >= 0) {
						var11 = var11.substring(0, var12) + var11.substring(var12 + 5);
						var4 = var4 + var11 + ' ';
						continue;
					}

					var2 = var2.substring(0, var5);
				}

				var2 = var2.trim();
				var2 = var2.substring(var2.lastIndexOf(32) + 1);
				var2 = var2.substring(var2.lastIndexOf(9) + 1);
				var4 = var4 + var2 + ' ';
			}
		}
	}

}
