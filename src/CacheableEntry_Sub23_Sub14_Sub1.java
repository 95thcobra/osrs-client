public final class CacheableEntry_Sub23_Sub14_Sub1 extends CacheableEntry_Sub23_Sub14 {

	public int anInt2579;
	public int anInt2580;
	public int[] anIntArray2581;
	public byte[] aByteArray2586;
	public int anInt2585;
	public int anInt2582;
	public int anInt2583;
	public int anInt2584;

	public void method2970() {
		if (anInt2585 != anInt2579 || anInt2582 != anInt2580) {
			byte[] var3 = new byte[anInt2579 * anInt2580];
			int var4 = 0;

			for (int var2 = 0; var2 < anInt2582; var2++) {
				for (int var1 = 0; var1 < anInt2585; var1++) {
					var3[var1 + anInt2583 + (var2 + anInt2584) * anInt2579] = aByteArray2586[var4++];
				}
			}

			aByteArray2586 = var3;
			anInt2585 = anInt2579;
			anInt2582 = anInt2580;
			anInt2583 = 0;
			anInt2584 = 0;
		}
	}

	public void method2972(int var1, int var2) {
		var1 += anInt2583;
		var2 += anInt2584;
		int var5 = var1 + var2 * anInt2399;
		int var6 = 0;
		int var3 = anInt2582;
		int var7 = anInt2585;
		int var9 = anInt2399 - var7;
		int var8 = 0;
		int var4;
		if (var2 < anInt2397) {
			var4 = anInt2397 - var2;
			var3 -= var4;
			var2 = anInt2397;
			var6 += var4 * var7;
			var5 += var4 * anInt2399;
		}

		if (var2 + var3 > anInt2400) {
			var3 -= var2 + var3 - anInt2400;
		}

		if (var1 < anInt2401) {
			var4 = anInt2401 - var1;
			var7 -= var4;
			var1 = anInt2401;
			var6 += var4;
			var5 += var4;
			var8 += var4;
			var9 += var4;
		}

		if (var1 + var7 > anInt2402) {
			var4 = var1 + var7 - anInt2402;
			var7 -= var4;
			var8 += var4;
			var9 += var4;
		}

		if (var7 > 0 && var3 > 0) {
			method2973(anIntArray2396, aByteArray2586, anIntArray2581, var6, var5, var7, var3, var9, var8);
		}
	}

	static void method2973(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = -(var5 >> 2);
		var5 = -(var5 & 3);

		for (int var11 = -var6; var11 < 0; var11++) {
			byte var10;
			int var12;
			for (var12 = var9; var12 < 0; var12++) {
				var10 = var1[var3++];
				if (var10 != 0) {
					var0[var4++] = var2[var10 & 255];
				} else {
					++var4;
				}

				var10 = var1[var3++];
				if (var10 != 0) {
					var0[var4++] = var2[var10 & 255];
				} else {
					++var4;
				}

				var10 = var1[var3++];
				if (var10 != 0) {
					var0[var4++] = var2[var10 & 255];
				} else {
					++var4;
				}

				var10 = var1[var3++];
				if (var10 != 0) {
					var0[var4++] = var2[var10 & 255];
				} else {
					++var4;
				}
			}

			for (var12 = var5; var12 < 0; var12++) {
				var10 = var1[var3++];
				if (var10 != 0) {
					var0[var4++] = var2[var10 & 255];
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	public void method2976(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < anIntArray2581.length; var4++) {
			int var6 = anIntArray2581[var4] >> 16 & 255;
			var6 += var1;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = anIntArray2581[var4] >> 8 & 255;
			var7 += var2;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			int var5 = anIntArray2581[var4] & 255;
			var5 += var3;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			anIntArray2581[var4] = (var6 << 16) + (var7 << 8) + var5;
		}

	}

}
