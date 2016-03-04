import java.awt.*;

public class Class46 {

	boolean aBool645;
	static final int anInt646 = 104;
	String aString647;
	int anInt648;
	int anInt649;
	boolean aBool650;
	static boolean aBool651;
	static IndexDescriptor_Sub1 aClass94_Sub1_652;
	static RenderedItemImage[] aClass109_Sub23_Sub14_Sub2Array653;
	public static final int anInt654 = 27;
	public static final int anInt655 = 196;
	public static final int anInt656 = 186;
	public static final int anInt657 = 234;
	String aString658;
	protected static FontMetrics aFontMetrics659;

	static final boolean method695(InterfaceDef var0, int var1) {
		if (var0.anIntArray2050 == null) {
			return false;
		} else {
			for (int var2 = 0; var2 < var0.anIntArray2050.length; var2++) {
				int var3 = Class34.method469(var0, var2, (byte) 17);
				int var4 = var0.anIntArray2013[var2];
				if (var0.anIntArray2050[var2] == 2) {
					if (var3 >= var4) {
						return false;
					}
				} else if (var0.anIntArray2050[var2] == 3) {
					if (var3 <= var4) {
						return false;
					}
				} else if (var0.anIntArray2050[var2] == 4) {
					if (var4 == var3) {
						return false;
					}
				} else if (var4 != var3) {
					return false;
				}
			}

			return true;
		}
	}

	public static CacheableEntry_Sub23_Sub14_Sub4_Sub1 method696(IndexDescriptor var0, IndexDescriptor var1, String var2, String var3, int var4) {
		int var5 = var0.method1170(var2);
		int var6 = var0.method1165(var5, var3, (byte) -82);
		return CacheableEntry_Sub23_Sub7.method2396(var0, var1, var5, var6, (byte) 63);
	}

	static final void method697(String var0, byte var1) {
		if (var0.equalsIgnoreCase("toggleroof")) {
			Class15.aClass35_195.aBool472 = !Class15.aClass35_195.aBool472;
			Class74.method1024(-1993468689);
			if (Class15.aClass35_195.aBool472) {
				Class93.method1145(99, "", "Roofs are now all hidden");
			} else {
				Class93.method1145(99, "", "Roofs will only be removed selectively");
			}
		}

		if (var0.equalsIgnoreCase("gfxmodels")) {
			for (int i=0; i<8000; i++) {
				System.out.println(i + ": " + Class42.getGfxDef(i).animId * 28936275);
			}
			return;
		}

		if (var0.equalsIgnoreCase("animations")) {
			for (int i=0; i<20000; i++) {
				AnimationSequence seq = CacheableEntry_Sub23_Sub11.getAnimation(i);
				if (seq != null && (seq.leftHandItem * 1369697391 >= 0 || seq.rightHandItem * 241398875 >= 0)) {
					System.out.println(i + ": " + (seq.leftHandItem * 1369697391-512) + ", " + (seq.rightHandItem * 241398875-512));
				}
			}
			return;
		}

		if (var0.equalsIgnoreCase("up")) {
			Class32.mapSquareHeights[0][Player.me.stepQueueX[0]][Player.me.stepQueueY[0]] -= 20;
			return;
		}

		if (var0.equalsIgnoreCase("displayfps")) {
			GameClient.aBool2991 = !GameClient.aBool2991;
		}

		if (GameClient.playerRights * -624018989 >= 2) {
			if (var0.equalsIgnoreCase("fpson")) {
				GameClient.aBool2991 = true;
			}

			if (var0.equalsIgnoreCase("fpsoff")) {
				GameClient.aBool2991 = false;
			}

			if (var0.equalsIgnoreCase("gc")) {
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) {
				Class58.method802(-1124316003);
			}

			if (var0.equalsIgnoreCase("errortest") && GameClient.anInt2861 * -134799277 == 2) {
				throw new RuntimeException();
			}
		}

		GameClient.secureBuffer.writeOpcode(231);
		GameClient.secureBuffer.writeByte(var0.length() + 1);
		GameClient.secureBuffer.writeStr(var0);
	}

}
