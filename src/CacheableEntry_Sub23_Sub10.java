public class CacheableEntry_Sub23_Sub10 extends CacheableEntry {

	public static IndexDescriptor aIndexDescriptor_2311;
	public static final int anInt2313 = 84;
	static final int anInt2317 = 41;
	static final int anInt2318 = 0;
	public static final int anInt2319 = 13;
	static int anInt2321;
	public static final int anInt2322 = 193;
	static int[] anIntArray2316;
	public int anInt2314;
	public int anInt2320;
	public int anInt2315;
	static Class128 aClass128_2312 = new Class128(64);

	void method2471(DataBuffer var1, int var2) {
		while (true) {
			int var3 = var1.readUByte();
			if (var3 == 0) {
				return;
			}

			method2476(var1, var3, 1278703381);
		}
	}

	static void method2474(int var0) {
		Class18.anIntArray218 = null;
		Class18.anIntArray219 = null;
		Class58.anIntArray756 = null;
		PacketDecoder.anIntArray341 = null;
		anIntArray2316 = null;
		Class42.aByteArrayArray603 = (byte[][]) null;
	}

	void method2476(DataBuffer var1, int var2, int var3) {
		if (var2 == 1) {
			anInt2314 = var1.readUShort() * 321564611;
			anInt2320 = var1.readUByte() * 1683949293;
			anInt2315 = var1.readUByte() * 199447123;
		}

	}

	static final void method2487(int var0, int var1) {
		if (ItemContainer.method1840(var0)) {
			InterfaceDef[] var3 = InterfaceDef.aInterfaceDefArrayArray1975[var0];

			for (int var2 = 0; var2 < var3.length; var2++) {
				InterfaceDef var4 = var3[var2];
				if (var4 != null) {
					var4.anInt2059 = 0;
					var4.anInt2010 = 0;
				}
			}

		}
	}

}
