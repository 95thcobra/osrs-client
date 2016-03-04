public class Class75 implements Interface3 {

	public static final int anInt908 = 155;
	static final int anInt916 = 8;
	static final int anInt917 = 4;
	public static final int anInt920 = 2;
	public static final int anInt921 = 122;
	public static final int anInt922 = 123;
	int anInt913;
	public int anInt914;
	public boolean aBool918;
	public boolean aBool911;
	static Class75 aClass75_912 = new Class75(0, -1, true, false, true);
	static Class75 aClass75_909 = new Class75(1, 0, true, true, true);
	static Class75 aClass75_910 = new Class75(2, 1, true, true, false);
	static Class75 aClass75_919 = new Class75(3, 2, false, false, true);
	static Class75 aClass75_915 = new Class75(4, 3, false, false, true);

	Class75(int var1, int var2, boolean var3, boolean var4, boolean var5) {
		anInt913 = var1 * -415629;
		anInt914 = var2 * 757572169;
		aBool918 = var4;
		aBool911 = var5;
	}

	public int method34(int var1) {
		return anInt913 * 2071805115;
	}

	static void method1026(int var0, int var1, int var2) {
		long var3 = (long) ((var0 << 16) + var1);
		CacheableEntry_Sub23_Sub19 var5 = (CacheableEntry_Sub23_Sub19) Class97.aJagexMap_1384.get(var3);
		if (var5 != null) {
			Class97.aClass116_1395.method1461(var5);
		}
	}

	static final void method1027(int var0) {
		boolean var1 = false;

		while (!var1) {
			var1 = true;

			for (int var2 = 0; var2 < GameClient.menuActionPtr * 1324290403 - 1; var2++) {
				if (GameClient.menuCommands[var2] < 1000 && GameClient.menuCommands[var2 + 1] > 1000) {
					String var4 = GameClient.menuOptionTexts[var2];
					GameClient.menuOptionTexts[var2] = GameClient.menuOptionTexts[1 + var2];
					GameClient.menuOptionTexts[var2 + 1] = var4;
					String var5 = GameClient.menuOptions[var2];
					GameClient.menuOptions[var2] = GameClient.menuOptions[1 + var2];
					GameClient.menuOptions[1 + var2] = var5;
					int var3 = GameClient.menuCommands[var2];
					GameClient.menuCommands[var2] = GameClient.menuCommands[var2 + 1];
					GameClient.menuCommands[1 + var2] = var3;
					var3 = GameClient.menuParam2[var2];
					GameClient.menuParam2[var2] = GameClient.menuParam2[1 + var2];
					GameClient.menuParam2[var2 + 1] = var3;
					var3 = GameClient.menuParam3[var2];
					GameClient.menuParam3[var2] = GameClient.menuParam3[1 + var2];
					GameClient.menuParam3[var2 + 1] = var3;
					var3 = GameClient.menuParam1[var2];
					GameClient.menuParam1[var2] = GameClient.menuParam1[1 + var2];
					GameClient.menuParam1[1 + var2] = var3;
					var1 = false;
				}
			}
		}

	}

}
