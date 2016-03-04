import java.io.File;
import java.io.IOException;

public class Class107 {

	static int anInt1499;
	public String aString1498;
	public static Class107 aClass107_1492 = new Class107("13", "13");
	public static Class107 aClass107_1484 = new Class107("9", "9");
	public static Class107 aClass107_1485 = new Class107("15", "15");
	public static Class107 aClass107_1483 = new Class107("4", "4");
	public static Class107 aClass107_1487 = new Class107("8", "8");
	public static Class107 aClass107_1488 = new Class107("10", "10");
	public static Class107 aClass107_1493 = new Class107("2", "2");
	public static Class107 aClass107_1490 = new Class107("12", "12");
	public static Class107 aClass107_1497 = new Class107("14", "14");
	public static Class107 aClass107_1486 = new Class107("7", "7");
	public static Class107 aClass107_1491 = new Class107("11", "11");
	public static Class107 aClass107_1494 = new Class107("3", "3");
	public static Class107 aClass107_1495 = new Class107("5", "5");
	public static Class107 aClass107_1496 = new Class107("1", "1");
	public static Class107 aClass107_1489 = new Class107("6", "6");

	public static void method1343(File var0, File var1, int var2) {
		try {
			Class135 var3 = new Class135(Class91.aFile1331, "rw", 10000L);
			DataBuffer var4 = new DataBuffer(500);
			var4.writeByte(3);
			var4.writeByte(var1 != null ? 1 : 0);
			var4.method1996(var0.getPath());
			if (var1 != null) {
				var4.method1996(var1.getPath());
			}

			var3.method1650(var4.data, 0, var4.pos * 1736753585, -1483506203);
			var3.method1641(510452052);
		} catch (IOException var5) {
			var5.printStackTrace();
		}

	}

	Class107(String var1, String var2) {
		aString1498 = var2;
	}

}
