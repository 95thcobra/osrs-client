public class Class80 {

	public static final int anInt952 = 31;
	public static final int anInt953 = 45;
	public static final int anInt954 = 32;
	public static final int anInt955 = 56;
	public static Class6 aClass6_956;
	public static final int anInt957 = 29;
	public static final int anInt958 = 16;

	static boolean method1035(int var0, int var1, int var2) {
		return var0 != 4 || var1 != 8;
	}

	static void method1036(int var0, int var1, int var2, int var3, String var4, int var5) {
		InterfaceDef var6 = Class50.method712(var1, var2, (short) -28348);
		if (var6 != null) {
			if (var6.anObjectArray2037 != null) {
				ScriptInvocation var7 = new ScriptInvocation();
				var7.inter = var6;
				var7.anInt1773 = var0 * -877117653;
				var7.aString1777 = var4;
				var7.parameters = var6.anObjectArray2037;
				InterfaceDef.method2182(var7, 1214723553);
			}

			boolean var8 = true;
			if (var6.anInt1943 * -202095703 > 0) {
				var8 = Class63_Sub1.method2092(var6, (byte) -13);
			}

			if (var8) {
				if (ScriptInvocation.method1839(LinkedEntry_Sub5_Sub3.getInterfaceSettingFor(var6), var0 - 1)) {
					if (var0 == 1) {
						GameClient.secureBuffer.writeOpcode(207);
						GameClient.secureBuffer.writeInt(var1);
						GameClient.secureBuffer.writeShort(var2);
						GameClient.secureBuffer.writeShort(var3);
					}

					if (var0 == 2) {
						GameClient.secureBuffer.writeOpcode(233);
						GameClient.secureBuffer.writeInt(var1);
						GameClient.secureBuffer.writeShort(var2);
						GameClient.secureBuffer.writeShort(var3);
					}

					if (var0 == 3) {
						GameClient.secureBuffer.writeOpcode(83);
						GameClient.secureBuffer.writeInt(var1);
						GameClient.secureBuffer.writeShort(var2);
						GameClient.secureBuffer.writeShort(var3);
					}

					if (var0 == 4) {
						GameClient.secureBuffer.writeOpcode(103);
						GameClient.secureBuffer.writeInt(var1);
						GameClient.secureBuffer.writeShort(var2);
						GameClient.secureBuffer.writeShort(var3);
					}

					if (var0 == 5) {
						GameClient.secureBuffer.writeOpcode(160);
						GameClient.secureBuffer.writeInt(var1);
						GameClient.secureBuffer.writeShort(var2);
						GameClient.secureBuffer.writeShort(var3);
					}

					if (var0 == 6) {
						GameClient.secureBuffer.writeOpcode(166);
						GameClient.secureBuffer.writeInt(var1);
						GameClient.secureBuffer.writeShort(var2);
						GameClient.secureBuffer.writeShort(var3);
					}

					if (var0 == 7) {
						GameClient.secureBuffer.writeOpcode(192);
						GameClient.secureBuffer.writeInt(var1);
						GameClient.secureBuffer.writeShort(var2);
						GameClient.secureBuffer.writeShort(var3);
					}

					if (var0 == 8) {
						GameClient.secureBuffer.writeOpcode(35);
						GameClient.secureBuffer.writeInt(var1);
						GameClient.secureBuffer.writeShort(var2);
						GameClient.secureBuffer.writeShort(var3);
					}

					if (var0 == 9) {
						GameClient.secureBuffer.writeOpcode(176);
						GameClient.secureBuffer.writeInt(var1);
						GameClient.secureBuffer.writeShort(var2);
						GameClient.secureBuffer.writeShort(var3);
					}

					if (var0 == 10) {
						GameClient.secureBuffer.writeOpcode(32);
						GameClient.secureBuffer.writeInt(var1);
						GameClient.secureBuffer.writeShort(var2);
						GameClient.secureBuffer.writeShort(var3);
					}

				}
			}
		}
	}

	Class80() throws Throwable {
		throw new Error();
	}

}
