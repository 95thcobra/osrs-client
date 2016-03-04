public class Class85 implements Interface3 {

	static int anInt1004;
	public static short[] aShortArray1010;
	public static final int anInt1011 = 37;
	public static final int anInt1012 = 124;
	public static final int anInt1014 = 30;
	public static Class85 aClass85_1006 = new Class85(0, 0);
	public static Class85 aClass85_1013 = new Class85(2, 1);
	public static Class85 aClass85_1009 = new Class85(1, 2);
	public static Class85 aClass85_1007 = new Class85(3, 3);
	public int anInt1008;
	int anInt1005;

	Class85(int var1, int var2) {
		anInt1008 = var1 * -14003787;
		anInt1005 = var2 * -799590333;
	}

	public int method34(int var1) {
		return anInt1005 * 100455531;
	}

	static void method1092(int var0, int var1) {
		if (var0 != -1) {
			if (ItemContainer.method1840(var0)) {
				InterfaceDef[] var5 = InterfaceDef.aInterfaceDefArrayArray1975[var0];

				for (int var4 = 0; var4 < var5.length; var4++) {
					InterfaceDef var3 = var5[var4];
					if (var3.anObjectArray2018 != null) {
						ScriptInvocation var2 = new ScriptInvocation();
						var2.inter = var3;
						var2.parameters = var3.anObjectArray2018;
						Class79.method1034(var2, 2000000, (byte) 21);
					}
				}

			}
		}
	}

}
