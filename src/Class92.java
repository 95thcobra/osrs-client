public class Class92 {

	static final int anInt1335 = 33;
	public static final int anInt1338 = 33;
	static final int anInt1339 = 31;
	static char[] aCharArray1340 = new char[64];
	static char[] aCharArray1337;
	static int[] anIntArray1336;

	static {
		int var0;
		for (var0 = 0; var0 < 26; var0++) {
			aCharArray1340[var0] = (char) (var0 + 65);
		}

		for (var0 = 26; var0 < 52; var0++) {
			aCharArray1340[var0] = (char) (var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; var0++) {
			aCharArray1340[var0] = (char) (48 + var0 - 52);
		}

		aCharArray1340[62] = 43;
		aCharArray1340[63] = 47;
		aCharArray1337 = new char[64];

		for (var0 = 0; var0 < 26; var0++) {
			aCharArray1337[var0] = (char) (65 + var0);
		}

		for (var0 = 26; var0 < 52; var0++) {
			aCharArray1337[var0] = (char) (var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; var0++) {
			aCharArray1337[var0] = (char) (var0 + 48 - 52);
		}

		aCharArray1337[62] = 42;
		aCharArray1337[63] = 45;
		anIntArray1336 = new int[128];

		for (var0 = 0; var0 < anIntArray1336.length; var0++) {
			anIntArray1336[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; var0++) {
			anIntArray1336[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; var0++) {
			anIntArray1336[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; var0++) {
			anIntArray1336[var0] = 52 + (var0 - 48);
		}

		int[] var2 = anIntArray1336;
		anIntArray1336[43] = 62;
		var2[42] = 62;
		int[] var1 = anIntArray1336;
		anIntArray1336[47] = 63;
		var1[45] = 63;
	}

	Class92() throws Throwable {
		throw new Error();
	}

}
