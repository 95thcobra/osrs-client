public class CacheableEntry_Sub23_Sub15 extends CacheableEntry {

	static Class88 aClass88_2403;
	static int[] anIntArray2404;
	static final int anInt2405 = 32;
	static final int anInt2406 = 3;
	public static final int anInt2407 = 12;
	public static final int anInt2409 = 244;
	Class43[] aClass43Array2408;

	CacheableEntry_Sub23_Sub15(IndexDescriptor var1, IndexDescriptor var2, int var3, boolean var4) {
		JagexLinkedList var11 = new JagexLinkedList();
		int var7 = var1.numFilesInContainer(var3);
		aClass43Array2408 = new Class43[var7];
		int[] var8 = var1.method1159(var3, 1983817239);

		for (int var9 = 0; var9 < var8.length; var9++) {
			byte[] var10 = var1.getFileData(var3, var8[var9]);
			LinkedEntry_Sub9 var6 = null;
			int var12 = (var10[0] & 255) << 8 | var10[1] & 255;

			for (LinkedEntry_Sub9 var5 = (LinkedEntry_Sub9) var11.method1405(); var5 != null; var5 = (LinkedEntry_Sub9) var11.method1402()) {
				if (var5.anInt1761 * 834463203 == var12) {
					var6 = var5;
					break;
				}
			}

			if (var6 == null) {
				byte[] var13;
				if (var4) {
					var13 = var2.method1178(0, var12, 1262496548);
				} else {
					var13 = var2.method1178(var12, 0, 1324195911);
				}

				var6 = new LinkedEntry_Sub9(var12, var13);
				var11.add(var6);
			}

			aClass43Array2408[var8[var9]] = new Class43(var10, var6);
		}

	}

	public boolean method2779(int var1, int var2) {
		return aClass43Array2408[var1].aBool613;
	}

	public static void method2783(IndexDescriptor var0, IndexDescriptor var1, int var2) {
		CacheableEntry_Sub23_Sub2.aIndexDescriptor_2108 = var0;
		CacheableEntry_Sub23_Sub2.aIndexDescriptor_2100 = var1;
		CacheableEntry_Sub23_Sub2.anInt2107 = CacheableEntry_Sub23_Sub2.aIndexDescriptor_2108.numFilesInContainer(3) * 15847945;
	}

}
