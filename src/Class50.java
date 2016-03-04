import java.io.IOException;

public class Class50 {

	int[] anIntArray688;
	public static final int anInt690 = 256;
	public static final int anInt691 = 28;
	CacheableEntry_Sub23_Sub17 aClass109_Sub23_Sub17_692;
	public static Class73 aClass73_693;
	public static final int anInt694 = 206;
	public static final int anInt695 = 40;
	String[] aStringArray696;
	int anInt689 = 154706627;

	static final void method709(boolean var0, int var1) {
		CacheableEntry_Sub23_Sub7.method2389((byte) -97);
		GameClient.anInt2911 -= 1630754957;
		if (GameClient.anInt2911 * 1616238011 >= 50 || var0) {
			GameClient.anInt2911 = 0;
			if (!GameClient.aBool3142 && Class98.loginConnection != null) {
				GameClient.secureBuffer.writeOpcode(25);

				try {
					Class98.loginConnection.write(GameClient.secureBuffer.data, 0, GameClient.secureBuffer.pos * 1736753585);
					GameClient.secureBuffer.pos = 0;
				} catch (IOException var3) {
					GameClient.aBool3142 = true;
				}
			}

		}
	}

	public static NpcDef getNpcDef(int id) {
		NpcDef def = (NpcDef) NpcDef.definitionCache.get((long) id);
		if (def != null) {
			return def;
		} else {
			byte[] data = NpcDef.aIndexDescriptor_2253.getFileData(9, id);
			def = new NpcDef();
			def.id = id * 691439225;
			if (data != null) {
				def.decode(new DataBuffer(data));
			}

			def.method2405();
			NpcDef.definitionCache.put(def, (long) id);
			return def;
		}
	}

	static void method711(int var0, int var1, short var2) {
		GameClient.secureBuffer.writeOpcode(124);
		System.out.printf("Examine %d, %d%n", var0, var1);
		GameClient.secureBuffer.writeLEInt(var0);
		GameClient.secureBuffer.writeLEShortA(var1);
	}

	public static InterfaceDef method712(int var0, int var1, short var2) {
		InterfaceDef var3 = method713(var0, (byte) 113);
		return var1 == -1 ? var3 : (var3 != null && var3.aInterfaceDefArray2061 != null && var1 < var3.aInterfaceDefArray2061.length ? var3.aInterfaceDefArray2061[var1] : null);
	}

	public static InterfaceDef method713(int var0, byte var1) {
		int var2 = var0 >> 16;
		int var3 = var0 & 65535;
		if (InterfaceDef.aInterfaceDefArrayArray1975[var2] == null || InterfaceDef.aInterfaceDefArrayArray1975[var2][var3] == null) {
			boolean var4 = ItemContainer.method1840(var2);
			if (!var4) {
				return null;
			}
		}

		return InterfaceDef.aInterfaceDefArrayArray1975[var2][var3];
	}

}
