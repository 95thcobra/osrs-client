public class Class78 {

	public static boolean[] aBoolArray938 = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false};
	public static int[] skillXps = new int[99];

	static {
		int var3 = 0;

		for (int var0 = 0; var0 < 99; var0++) {
			int var1 = 1 + var0;
			int var2 = (int) ((double) var1 + 300.0D * Math.pow(2.0D, (double) var1 / 7.0D));
			var3 += var2;
			skillXps[var0] = var3 / 4;
		}
	}

	Class78() throws Throwable {
		throw new Error();
	}

	public static int hashName(CharSequence var0) {
		int var2 = var0.length();
		int var3 = 0;

		for (int var4 = 0; var4 < var2; var4++) {
			var3 = (var3 << 5) - var3 + Class53.method782(var0.charAt(var4), -1305953540);
		}

		return var3;
	}

}
