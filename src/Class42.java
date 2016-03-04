public class Class42 implements Interface3 {

	static int[] anIntArray598;
	static final int anInt601 = 360;
	static byte[][] aByteArrayArray603;
	static CacheableEntry_Sub23_Sub14_Sub1 aClass109_Sub23_Sub14_Sub1_605;
	public static final int anInt606 = 49;
	public static final int anInt607 = 198;
	static Class42 aClass42_604 = new Class42(0);
	static Class42 aClass42_599 = new Class42(1);
	static Class42 aClass42_600 = new Class42(2);
	int anInt602;

	public int method34(int var1) {
		return anInt602 * 142077405;
	}

	public static GfxDef getGfxDef(int id) {
		GfxDef var2 = (GfxDef) GfxDef.cache.get((long) id);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = GfxDef.aIndexDescriptor_2362.getFileData(13, id);
			var2 = new GfxDef();
			var2.anInt2357 = id * -157191251;
			if (var3 != null) {
				var2.method2520(new DataBuffer(var3), -1984562563);
			}

			GfxDef.cache.put(var2, (long) id);
			return var2;
		}
	}

	Class42(int var1) {
		anInt602 = var1 * -1178217867;
	}

}
