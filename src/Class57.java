import java.awt.*;

public class Class57 {

	protected static Frame aFrame740;
	public static final int anInt746 = 150;
	public static String[] aStringArray747;
	public static final int anInt748 = 57;
	public static final int anInt749 = 101;
	public static final int anInt751 = 211;
	static int anInt752;
	static int anInt741 = 0;
	static int anInt745 = 0;
	static int anInt750 = 0;
	static byte[][] aByteArrayArray743 = new byte[1000][];
	static byte[][] aByteArrayArray744 = new byte[250][];
	static byte[][] aByteArrayArray742 = new byte[50][];

	static synchronized byte[] method793(int var0, int var1) {
		byte[] var2;
		if (var0 == 100 && anInt741 * -785538163 > 0) {
			var2 = aByteArrayArray743[(anInt741 += 971614395) * -785538163];
			aByteArrayArray743[anInt741 * -785538163] = null;
			return var2;
		} else if (var0 == 5000 && anInt745 * 341503845 > 0) {
			var2 = aByteArrayArray744[(anInt745 += 1583109523) * 341503845];
			aByteArrayArray744[anInt745 * 341503845] = null;
			return var2;
		} else if (var0 == 30000 && anInt750 * 296777743 > 0) {
			var2 = aByteArrayArray742[(anInt750 += 611879185) * 296777743];
			aByteArrayArray742[anInt750 * 296777743] = null;
			return var2;
		} else {
			return new byte[var0];
		}
	}

	static boolean method794(String var0, boolean var1, int var2) {
		if (var0 == null) {
			return false;
		} else {
			String var4 = Class38.method497(var0, GameClient.aClass119_2919, -1745441588);

			for (int var3 = 0; var3 < GameClient.anInt2984 * 389772333; var3++) {
				if (var4.equalsIgnoreCase(Class38.method497(GameClient.aClass46Array3136[var3].aString658, GameClient.aClass119_2919, -2145222754)) && (!var1 || GameClient.aClass46Array3136[var3].anInt648 * -261257351 != 0)) {
					return true;
				}
			}

			if (var4.equalsIgnoreCase(Class38.method497(Player.me.aString2835, GameClient.aClass119_2919, -1708441978))) {
				return true;
			} else {
				return false;
			}
		}
	}

	static void method796(InterfaceDef[] var0, InterfaceDef var1, boolean var2, int var3) {
		int var4 = var1.anInt1962 * -538927815 != 0 ? var1.anInt1962 * -538927815 : var1.anInt1954 * 2096072399;
		int var5 = var1.anInt1963 * -124837617 != 0 ? var1.anInt1963 * -124837617 : var1.invsize * 539675235;
		Class66.method894(var0, var1.hash * 1582464481, var4, var5, var2, -2123161981);
		if (var1.aInterfaceDefArray2061 != null) {
			Class66.method894(var1.aInterfaceDefArray2061, var1.hash * 1582464481, var4, var5, var2, 190530324);
		}

		LinkedEntry_Sub13 var6 = (LinkedEntry_Sub13) GameClient.aJagexMap_3073.get((long) (var1.hash * 1582464481));
		if (var6 != null) {
			Class73.method966(var6.anInt1819 * -1385416029, var4, var5, var2, 1266230661);
		}

		if (var1.anInt1943 * -202095703 == 1337) {
			;
		}

	}

	Class57() throws Throwable {
		throw new Error();
	}

}
