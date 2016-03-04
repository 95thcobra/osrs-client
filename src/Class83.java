import java.io.File;

public class Class83 {

	public static File aFile983;
	public static final int anInt984 = 1048576;
	public static final String aString985 = "main_file_cache.dat2";
	public static int anInt986;
	public static String[] aStringArray987;
	public static final String aString988 = "main_file_cache.idx";
	public static final int anInt990 = 1048576000;
	public static int anInt992;
	public static String aString993;
	static long aLong995;
	public static Class139 aClass139_989 = null;
	public static Class139 aClass139_994 = null;
	public static Class139 aClass139_991 = null;

	Class83() throws Throwable {
		throw new Error();
	}

	public static int method1078(CharSequence var0, int var1, int var2, byte[] var3, int var4, int var5) {
		int var6 = var2 - var1;

		for (int var8 = 0; var8 < var6; var8++) {
			char var7 = var0.charAt(var1 + var8);
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) {
				var3[var4 + var8] = (byte) var7;
			} else if (var7 == '\u20ac') {
				var3[var4 + var8] = -128;
			} else if (var7 == 8218) {
				var3[var4 + var8] = -126;
			} else if (var7 == 402) {
				var3[var4 + var8] = -125;
			} else if (var7 == 8222) {
				var3[var8 + var4] = -124;
			} else if (var7 == 8230) {
				var3[var4 + var8] = -123;
			} else if (var7 == 8224) {
				var3[var4 + var8] = -122;
			} else if (var7 == 8225) {
				var3[var4 + var8] = -121;
			} else if (var7 == 710) {
				var3[var8 + var4] = -120;
			} else if (var7 == 8240) {
				var3[var8 + var4] = -119;
			} else if (var7 == 352) {
				var3[var4 + var8] = -118;
			} else if (var7 == 8249) {
				var3[var8 + var4] = -117;
			} else if (var7 == 338) {
				var3[var4 + var8] = -116;
			} else if (var7 == 381) {
				var3[var8 + var4] = -114;
			} else if (var7 == 8216) {
				var3[var4 + var8] = -111;
			} else if (var7 == 8217) {
				var3[var4 + var8] = -110;
			} else if (var7 == 8220) {
				var3[var8 + var4] = -109;
			} else if (var7 == 8221) {
				var3[var4 + var8] = -108;
			} else if (var7 == 8226) {
				var3[var4 + var8] = -107;
			} else if (var7 == 8211) {
				var3[var8 + var4] = -106;
			} else if (var7 == 8212) {
				var3[var8 + var4] = -105;
			} else if (var7 == 732) {
				var3[var4 + var8] = -104;
			} else if (var7 == 8482) {
				var3[var8 + var4] = -103;
			} else if (var7 == 353) {
				var3[var8 + var4] = -102;
			} else if (var7 == 8250) {
				var3[var4 + var8] = -101;
			} else if (var7 == 339) {
				var3[var8 + var4] = -100;
			} else if (var7 == 382) {
				var3[var4 + var8] = -98;
			} else if (var7 == 376) {
				var3[var8 + var4] = -97;
			} else {
				var3[var8 + var4] = 63;
			}
		}

		return var6;
	}

}
