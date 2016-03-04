public final class Class76 {

	public static final int anInt924 = 153;
	static Class10 aClass10_925;
	public static char[] aCharArray923 = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

	Class76() throws Throwable {
		throw new Error();
	}

	static final void method1032(InterfaceDef[] var0, int var1, int var2) {
		for (int var3 = 0; var3 < var0.length; var3++) {
			InterfaceDef var4 = var0[var3];
			if (var4 != null) {
				if (var4.contenttype * -1878336627 == 0) {
					if (var4.aInterfaceDefArray2061 != null) {
						method1032(var4.aInterfaceDefArray2061, var1, -1443880838);
					}

					LinkedEntry_Sub13 var5 = (LinkedEntry_Sub13) GameClient.aJagexMap_3073.get((long) (var4.hash * 1582464481));
					if (var5 != null) {
						Class5.method138(var5.anInt1819 * -1385416029, var1, (byte) 27);
					}
				}

				ScriptInvocation var6;
				if (var1 == 0 && var4.anObjectArray1996 != null) {
					var6 = new ScriptInvocation();
					var6.inter = var4;
					var6.parameters = var4.anObjectArray1996;
					InterfaceDef.method2182(var6, 1969342050);
				}

				if (var1 == 1 && var4.anObjectArray1984 != null) {
					if (var4.slot * -1395083971 >= 0) {
						InterfaceDef var7 = Class50.method713(var4.hash * 1582464481, (byte) 125);
						if (var7 == null || var7.aInterfaceDefArray2061 == null || var4.slot * -1395083971 >= var7.aInterfaceDefArray2061.length || var7.aInterfaceDefArray2061[var4.slot * -1395083971] != var4) {
							continue;
						}
					}

					var6 = new ScriptInvocation();
					var6.inter = var4;
					var6.parameters = var4.anObjectArray1984;
					InterfaceDef.method2182(var6, 1320614226);
				}
			}
		}

	}

}
