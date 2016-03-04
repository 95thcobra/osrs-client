public class ScriptInvocation extends LinkedEntry {

	Object[] parameters;
	boolean aBool1769;
	int anInt1770;
	int anInt1771;
	InterfaceDef inter;
	int anInt1773;
	InterfaceDef aInterfaceDef_1774;
	int anInt1775;
	int anInt1776;
	String aString1777;
	int anInt1778;

	static void method1835() {
		for (LinkedEntry_Sub13 var1 = (LinkedEntry_Sub13) GameClient.aJagexMap_3073.method1537(); var1 != null; var1 = (LinkedEntry_Sub13) GameClient.aJagexMap_3073.method1543()) {
			int var5 = var1.anInt1819 * -1385416029;
			if (ItemContainer.method1840(var5)) {
				boolean var4 = true;
				InterfaceDef[] var3 = InterfaceDef.aInterfaceDefArrayArray1975[var5];

				int var2;
				for (var2 = 0; var2 < var3.length; var2++) {
					if (var3[var2] != null) {
						var4 = var3[var2].cs2Inter;
						break;
					}
				}

				if (!var4) {
					var2 = (int) var1.key;
					InterfaceDef var6 = Class50.method713(var2, (byte) -95);
					if (var6 != null) {
						Class35.method484(var6, -841833690);
					}
				}
			}
		}

	}

	static String method1836(String sub, boolean secure) {
		String var3 = !secure ? "http://" : "https://";
		if (GameClient.anInt2861 * -134799277 == 1) {
			sub = sub + "-wtrc";
		} else if (GameClient.anInt2861 * -134799277 == 2) {
			sub = sub + "-wtqa";
		} else if (GameClient.anInt2861 * -134799277 == 3) {
			sub = sub + "-wtwip";
		} else if (GameClient.anInt2861 * -134799277 == 5) {
			sub = sub + "-wti";
		} else if (GameClient.anInt2861 * -134799277 == 4) {
			sub = "local";
		}

		String var4 = "";
		if (GameClient.aString2866 != null) {
			var4 = "/p=" + GameClient.aString2866;
		}

		String var5 = "runescape.com";
		return var3 + sub + "." + var5 + "/l=" + GameClient.anInt2865 * 1017874057 + "/a=" + GameClient.anInt3048 * 742258379 + var4 + "/";
	}

	static void method1837(CacheableEntry_Sub23_Sub14_Sub1 var0) {
		short var2 = 256;

		int var5;
		for (var5 = 0; var5 < Class66.anIntArray840.length; var5++) {
			Class66.anIntArray840[var5] = 0;
		}

		int var3;
		for (var5 = 0; var5 < 5000; var5++) {
			var3 = (int) (Math.random() * 128.0D * (double) var2);
			Class66.anIntArray840[var3] = (int) (Math.random() * 256.0D);
		}

		int var4;
		int var6;
		for (var5 = 0; var5 < 20; var5++) {
			for (var3 = 1; var3 < var2 - 1; var3++) {
				for (var6 = 1; var6 < 127; var6++) {
					var4 = (var3 << 7) + var6;
					Class136.anIntArray1606[var4] = (Class66.anIntArray840[var4 + 128] + Class66.anIntArray840[var4 - 1] + Class66.anIntArray840[1 + var4] + Class66.anIntArray840[var4 - 128]) / 4;
				}
			}

			int[] var9 = Class66.anIntArray840;
			Class66.anIntArray840 = Class136.anIntArray1606;
			Class136.anIntArray1606 = var9;
		}

		if (var0 != null) {
			var5 = 0;

			for (var3 = 0; var3 < var0.anInt2582; var3++) {
				for (var6 = 0; var6 < var0.anInt2585; var6++) {
					if (var0.aByteArray2586[var5++] != 0) {
						var4 = 16 + var6 + var0.anInt2583;
						int var7 = 16 + var3 + var0.anInt2584;
						int var8 = (var7 << 7) + var4;
						Class66.anIntArray840[var8] = 0;
					}
				}
			}
		}

	}

	public static RenderedItemImage[] method1838(IndexDescriptor var0, String var1, String var2) {
		int var4 = var0.method1170(var1);
		int var5 = var0.method1165(var4, var2, (byte) -73);
		return Class36.method487(var0, var4, var5, (byte) 16);
	}

	public static boolean method1839(int settings, int slot) {
		return ((settings >> (slot + 1)) & 1) != 0;
	}


	static IndexDescriptor_Sub1 aClass94_Sub1_1783;

}
