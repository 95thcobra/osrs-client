public abstract class CacheableEntry_Sub23_Sub16 extends CacheableEntry {

	static final int anInt2411 = 32;
	public int anInt2410 = 878907848;

	void method2786(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		CacheableEntry_Sub23_Sub16_Sub5 var10 = method2791(1560023972);
		if (var10 != null) {
			anInt2410 = var10.anInt2410 * 1;
			var10.method2786(var1, var2, var3, var4, var5, var6, var7, var8, var9);
		}

	}

	static final void method2788(int var0, int var1, int var2, int var3, byte var4) {
		for (int var5 = 0; var5 < GameClient.anInt2894 * -2099955589; var5++) {
			if (GameClient.anIntArray2876[var5] + GameClient.anIntArray3077[var5] > var0 && GameClient.anIntArray2876[var5] < var2 + var0 && GameClient.anIntArray3076[var5] + GameClient.anIntArray3078[var5] > var1 && GameClient.anIntArray3076[var5] < var3 + var1) {
				GameClient.aBoolArray2888[var5] = true;
			}
		}

	}

	protected CacheableEntry_Sub23_Sub16_Sub5 method2791(int var1) {
		return null;
	}

	static final String method2793(int var0, byte var1) {
		String var2 = Integer.toString(var0);

		for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
			var2 = var2.substring(0, var3) + Class37.COMMA + var2.substring(var3);
		}

		return var2.length() > 9 ? " " + Class22.hexColTag(65408) + var2.substring(0, var2.length() - 8) + Class90.aString1217 + " " + Class37.BRACK_OPEN + var2 + Class37.BRACK_CLOSE + Class37.END_COL : (var2.length() <= 6 ? " " + Class22.hexColTag(16776960) + var2 + Class37.END_COL : " " + Class22.hexColTag(16777215) + var2.substring(0, var2.length() - 4) + Class90.aString1219 + " " + Class37.BRACK_OPEN + var2 + Class37.BRACK_CLOSE + Class37.END_COL);
	}

}
