public class Class99 {

	public static boolean aBool1407;

	public static void method1256(int var0, int var1) {
		if (var0 != -1) {
			if (InterfaceDef.aBoolArray1928[var0]) {
				InterfaceDef.aIndexDescriptor_1929.method1163(var0, -1803791194);
				if (InterfaceDef.aInterfaceDefArrayArray1975[var0] != null) {
					boolean var3 = true;

					for (int var2 = 0; var2 < InterfaceDef.aInterfaceDefArrayArray1975[var0].length; var2++) {
						if (InterfaceDef.aInterfaceDefArrayArray1975[var0][var2] != null) {
							if (InterfaceDef.aInterfaceDefArrayArray1975[var0][var2].contenttype * -1878336627 != 2) {
								InterfaceDef.aInterfaceDefArrayArray1975[var0][var2] = null;
							} else {
								var3 = false;
							}
						}
					}

					if (var3) {
						InterfaceDef.aInterfaceDefArrayArray1975[var0] = null;
					}

					InterfaceDef.aBoolArray1928[var0] = false;
				}
			}
		}
	}

	Class99() throws Throwable {
		throw new Error();
	}

}
