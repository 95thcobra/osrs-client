public class Class43 {

	static int[] anIntArray612 = new int[500];
	static int[] anIntArray609 = new int[500];
	static int[] anIntArray617 = new int[500];
	static int[] anIntArray608 = new int[500];
	LinkedEntry_Sub9 aClass109_Sub9_610 = null;
	int anInt611 = -1;
	boolean aBool613 = false;
	int[] anIntArray614;
	int[] anIntArray615;
	int[] anIntArray616;
	int[] anIntArray618;

	Class43(byte[] var1, LinkedEntry_Sub9 var2) {
		aClass109_Sub9_610 = var2;
		DataBuffer var4 = new DataBuffer(var1);
		DataBuffer var8 = new DataBuffer(var1);
		var4.pos = -1687040350;
		int var5 = var4.readUByte();
		int var9 = -1;
		int var7 = 0;
		var8.pos = (var4.pos * 1736753585 + var5) * 1303963473;

		int var3;
		for (var3 = 0; var3 < var5; var3++) {
			int var6 = var4.readUByte();
			if (var6 > 0) {
				if (aClass109_Sub9_610.anIntArray1763[var3] != 0) {
					for (int var10 = var3 - 1; var10 > var9; --var10) {
						if (aClass109_Sub9_610.anIntArray1763[var10] == 0) {
							anIntArray612[var7] = var10;
							anIntArray609[var7] = 0;
							anIntArray617[var7] = 0;
							anIntArray608[var7] = 0;
							++var7;
							break;
						}
					}
				}

				anIntArray612[var7] = var3;
				short var11 = 0;
				if (aClass109_Sub9_610.anIntArray1763[var3] == 3) {
					var11 = 128;
				}

				if ((var6 & 1) != 0) {
					anIntArray609[var7] = var8.method1881();
				} else {
					anIntArray609[var7] = var11;
				}

				if ((var6 & 2) != 0) {
					anIntArray617[var7] = var8.method1881();
				} else {
					anIntArray617[var7] = var11;
				}

				if ((var6 & 4) != 0) {
					anIntArray608[var7] = var8.method1881();
				} else {
					anIntArray608[var7] = var11;
				}

				var9 = var3;
				++var7;
				if (aClass109_Sub9_610.anIntArray1763[var3] == 5) {
					aBool613 = true;
				}
			}
		}

		if (var8.pos * 1736753585 != var1.length) {
			throw new RuntimeException();
		} else {
			anInt611 = var7;
			anIntArray614 = new int[var7];
			anIntArray615 = new int[var7];
			anIntArray616 = new int[var7];
			anIntArray618 = new int[var7];

			for (var3 = 0; var3 < var7; var3++) {
				anIntArray614[var3] = anIntArray612[var3];
				anIntArray615[var3] = anIntArray609[var3];
				anIntArray616[var3] = anIntArray617[var3];
				anIntArray618[var3] = anIntArray608[var3];
			}

		}
	}

}
