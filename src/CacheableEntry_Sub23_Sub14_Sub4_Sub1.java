public final class CacheableEntry_Sub23_Sub14_Sub4_Sub1 extends CacheableEntry_Sub23_Sub14_Sub4 {

	public CacheableEntry_Sub23_Sub14_Sub4_Sub1(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
		super(var1, var2, var3, var4, var5, var6, var7);
	}

	public CacheableEntry_Sub23_Sub14_Sub4_Sub1(byte[] var1) {
		super(var1);
	}

	final void method3329(byte[] var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = var2 + var3 * anInt2399;
		int var10 = anInt2399 - var4;
		int var8 = 0;
		int var11 = 0;
		int var9;
		if (var3 < anInt2397) {
			var9 = anInt2397 - var3;
			var5 -= var9;
			var3 = anInt2397;
			var11 += var9 * var4;
			var7 += var9 * anInt2399;
		}

		if (var3 + var5 > anInt2400) {
			var5 -= var3 + var5 - anInt2400;
		}

		if (var2 < anInt2401) {
			var9 = anInt2401 - var2;
			var4 -= var9;
			var2 = anInt2401;
			var11 += var9;
			var7 += var9;
			var8 += var9;
			var10 += var9;
		}

		if (var2 + var4 > anInt2402) {
			var9 = var2 + var4 - anInt2402;
			var4 -= var9;
			var8 += var9;
			var10 += var9;
		}

		if (var4 > 0 && var5 > 0) {
			method3332(anIntArray2396, var1, var6, var11, var7, var4, var5, var10, var8);
		}
	}

	final void method3351(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int var8 = var2 + var3 * anInt2399;
		int var11 = anInt2399 - var4;
		int var12 = 0;
		int var9 = 0;
		int var10;
		if (var3 < anInt2397) {
			var10 = anInt2397 - var3;
			var5 -= var10;
			var3 = anInt2397;
			var9 += var10 * var4;
			var8 += var10 * anInt2399;
		}

		if (var3 + var5 > anInt2400) {
			var5 -= var3 + var5 - anInt2400;
		}

		if (var2 < anInt2401) {
			var10 = anInt2401 - var2;
			var4 -= var10;
			var2 = anInt2401;
			var9 += var10;
			var8 += var10;
			var12 += var10;
			var11 += var10;
		}

		if (var2 + var4 > anInt2402) {
			var10 = var2 + var4 - anInt2402;
			var4 -= var10;
			var12 += var10;
			var11 += var10;
		}

		if (var4 > 0 && var5 > 0) {
			method3334(anIntArray2396, var1, var6, var9, var8, var4, var5, var11, var12, var7);
		}
	}

}
