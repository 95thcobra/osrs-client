import java.awt.*;
import java.util.Arrays;

public class EnumDef extends CacheableEntry {

	static IndexDescriptor aIndexDescriptor_2185;
	static final int anInt2193 = 25;
	static int[] anIntArray2195;
	static final int anInt2196 = 22;
	public static final int anInt2197 = 107;
	static RenderedItemImage aClass109_Sub23_Sub14_Sub2_2198;
	static final int anInt2199 = 23;
	static Class128 cache = new Class128(64);
	public char aChar2189;
	public char aChar2187;
	public String defaultstr = "null";
	public int anInt2184;
	public int size = 0;
	public int[] keys;
	public String[] strings;
	public int[] ints;

	void method2340(DataBuffer var1, int var2) {
		while (true) {
			int var3 = var1.readUByte();
			if (var3 == 0) {
				return;
			}

			method2342(var1, var3, 144396945);
		}
	}

	void method2342(DataBuffer var1, int var2, int var3) {
		if (var2 == 1) {
			aChar2189 = (char) var1.readUByte();
		} else if (var2 == 2) {
			aChar2187 = (char) var1.readUByte();
		} else if (var2 == 3) {
			defaultstr = var1.readString();
		} else if (var2 == 4) {
			anInt2184 = var1.readInt() * 643544055;
		} else {
			int var4;
			if (var2 == 5) {
				size = var1.readUShort() * 504895135;
				keys = new int[size * 928089439];
				strings = new String[size * 928089439];

				for (var4 = 0; var4 < size * 928089439; var4++) {
					keys[var4] = var1.readInt();
					strings[var4] = var1.readString();
				}
				System.out.println(Arrays.toString(strings));
			} else if (var2 == 6) {
				size = var1.readUShort() * 504895135;
				keys = new int[size * 928089439];
				ints = new int[size * 928089439];

				for (var4 = 0; var4 < size * 928089439; var4++) {
					keys[var4] = var1.readInt();
					ints[var4] = var1.readInt();
				}
			}
		}

	}

	static void method2353(int var0) {
		GameClient var1 = GameClient.aGameClient2857;
		synchronized (var1) {
			Container var2 = GameClient.aGameClient2857.method3457(-1387413356);
			if (var2 != null) {
				Class2.anInt17 = Math.max(var2.getSize().width, Class30.anInt377 * -1833536733) * 1087077115;
				CacheableEntry_Sub23_Sub16_Sub1.anInt2503 = Math.max(var2.getSize().height, IsaacCipher.anInt795 * 1147884439) * 1100344733;
				Insets var3;
				if (var2 == Class57.aFrame740) {
					var3 = Class57.aFrame740.getInsets();
					Class2.anInt17 -= (var3.right + var3.left) * 1087077115;
					CacheableEntry_Sub23_Sub16_Sub1.anInt2503 -= (var3.top + var3.bottom) * 1100344733;
				}

				if (Class2.anInt17 * 1822130227 <= 0) {
					Class2.anInt17 = 1087077115;
				}

				if (CacheableEntry_Sub23_Sub16_Sub1.anInt2503 * -733282123 <= 0) {
					CacheableEntry_Sub23_Sub16_Sub1.anInt2503 = 1100344733;
				}

				if (LinkedEntry_Sub5_Sub4.method2933(315963949) == 1) {
					Class5.anInt98 = GameClient.anInt3082 * -2074684153;
					Class60.anInt769 = GameClient.anInt2995 * 1849502501;
				} else {
					Class5.anInt98 = Math.min(Class2.anInt17 * 1822130227, 7680) * -373100445;
					Class60.anInt769 = Math.min(CacheableEntry_Sub23_Sub16_Sub1.anInt2503 * -733282123, 2160) * 1724921409;
				}

				GameClient.anInt2848 = (Class2.anInt17 * 1822130227 - Class5.anInt98 * 2104430923) / 2 * 1174883233;
				GameClient.anInt2847 = 0;
				Class60.aCanvas771.setSize(Class5.anInt98 * 2104430923, Class60.anInt769 * -1064642111);
				Class72.aClass7_871 = CacheableEntry_Sub23_Sub17.method2800(Class5.anInt98 * 2104430923, Class60.anInt769 * -1064642111, Class60.aCanvas771, (byte) -51);
				if (var2 == Class57.aFrame740) {
					var3 = Class57.aFrame740.getInsets();
					Class60.aCanvas771.setLocation(GameClient.anInt2848 * -467838879 + var3.left, GameClient.anInt2847 * -1456024027 + var3.top);
				} else {
					Class60.aCanvas771.setLocation(GameClient.anInt2848 * -467838879, GameClient.anInt2847 * -1456024027);
				}

				CacheableEntry_Sub23_Sub17.method2794(1056566484);
				if (GameClient.activeRoot * 1787246131 != -1) {
					CacheableEntry_Sub23_Sub16_Sub7.method3298(true, (byte) -45);
				}

				Class32.method464(-1515195159);
			}
		}
	}

	static final void method2354(InterfaceDef var0, int var1, int var2, int var3, int var4) {
		CacheableEntry_Sub23_Sub18 var5 = var0.method2159((byte) 31);
		if (var5 != null) {
			if (GameClient.anInt2901 * 382216283 < 3) {
				Class15.aClass109_Sub23_Sub14_Sub2_189.method3008(var1, var2, var5.anInt2439 * -2016633209, var5.anInt2438 * -633411239, 25, 25, GameClient.anInt2948 * -1072839225, 256, var5.anIntArray2440, var5.anIntArray2441);
			} else {
				CacheableEntry_Sub23_Sub14.method2726(var1, var2, 0, var5.anIntArray2440, var5.anIntArray2441);
			}

		}
	}

}
