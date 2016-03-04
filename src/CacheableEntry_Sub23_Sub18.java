public class CacheableEntry_Sub23_Sub18 extends CacheableEntry {

	public static final int anInt2437 = 245;
	static final int anInt2442 = 2;
	public static final int anInt2444 = 104;
	static PacketEncoder aClass68_2445;
	public int anInt2439;
	public int anInt2438;
	public int[] anIntArray2441;
	public int[] anIntArray2440;
	int anInt2443;

	CacheableEntry_Sub23_Sub18(int var1, int var2, int[] var3, int[] var4, int var5) {
		anInt2439 = var1 * -92682441;
		anInt2438 = var2 * -1917268247;
		anIntArray2441 = var3;
		anIntArray2440 = var4;
		anInt2443 = var5 * 808490715;
	}

	public boolean method2826(int var1, int var2, int var3) {
		if (var2 >= 0 && var2 < anIntArray2440.length) {
			int var4 = anIntArray2440[var2];
			if (var1 >= var4 && var1 <= anIntArray2441[var2] + var4) {
				return true;
			}
		}

		return false;
	}

}
