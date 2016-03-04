public abstract class Class63 {

	static int anInt799;
	static final int anInt800 = 7680;
	public static final int anInt801 = 133;
	public static final int anInt802 = 88;
	static int anInt803;

	public abstract void method830(byte var1);

	abstract int method831(int var1, int var2, int var3);

	public static RuntimeException_Sub1 method836(Throwable var0, String var1) {
		RuntimeException_Sub1 var2;
		if (var0 instanceof RuntimeException_Sub1) {
			var2 = (RuntimeException_Sub1) var0;
			var2.aString2788 = var2.aString2788 + ' ' + var1;
		} else {
			var2 = new RuntimeException_Sub1(var0, var1);
		}

		return var2;
	}

}
