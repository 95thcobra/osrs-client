import java.util.Calendar;

public class Class1 {

	public static final int anInt2 = 2;
	static InterfaceDef aInterfaceDef_7;
	static int[] anIntArray9;
	static final int anInt10 = 2000000;
	static final int anInt14 = 100;
	static final int anInt15 = 53;
	static int[] anIntArray3 = new int[5];
	static int[][] anIntArrayArray13 = new int[5][5000];
	static int[] intstack = new int[1000];
	static String[] stringstack = new String[1000];
	static int anInt1 = 0;
	static Class50[] aClass50Array8 = new Class50[50];
	static Calendar aCalendar4 = Calendar.getInstance();
	static String[] aStringArray11 = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
	static int anInt12 = 0;

	static final void method40(InterfaceDef var0, int var1, int var2, int var3) {
		if (GameClient.aInterfaceDef_3038 == null && !GameClient.aBool3006) {
			if (var0 != null) {
				InterfaceDef var4 = CacheableEntry_Sub23_Sub16_Sub4.method3074(var0, -1818947203);
				if (var4 == null) {
					var4 = var0.aInterfaceDef_2012;
				}

				if (var4 != null) {
					GameClient.aInterfaceDef_3038 = var0;
					var4 = CacheableEntry_Sub23_Sub16_Sub4.method3074(var0, -1655765306);
					if (var4 == null) {
						var4 = var0.aInterfaceDef_2012;
					}

					GameClient.aInterfaceDef_3036 = var4;
					GameClient.anInt3040 = var1 * -699940531;
					GameClient.anInt3085 = var2 * -1971993467;
					Class44.anInt635 = 0;
					GameClient.aBool3124 = false;
					if (GameClient.menuActionPtr * 1324290403 > 0) {
						int var6 = GameClient.menuActionPtr * 1324290403 - 1;
						ItemContainer.aClass5_1788 = new Class5();
						ItemContainer.aClass5_1788.anInt96 = GameClient.menuParam2[var6] * -1691816191;
						ItemContainer.aClass5_1788.anInt87 = GameClient.menuParam3[var6] * 1319292889;
						ItemContainer.aClass5_1788.anInt93 = GameClient.menuCommands[var6] * -337649953;
						ItemContainer.aClass5_1788.anInt89 = GameClient.menuParam1[var6] * -1803001747;
						ItemContainer.aClass5_1788.aString90 = GameClient.menuOptions[var6];
					}

					return;
				}
			}

		}
	}

	static final void addMenuOption(String option, String text, int command, int param1, int param2, int param3) {
		if (!GameClient.aBool3006) {
			if (GameClient.menuActionPtr * 1324290403 < 500) {
				GameClient.menuOptions[GameClient.menuActionPtr * 1324290403] = option;
				GameClient.menuOptionTexts[GameClient.menuActionPtr * 1324290403] = text;
				GameClient.menuCommands[GameClient.menuActionPtr * 1324290403] = command;
				GameClient.menuParam1[GameClient.menuActionPtr * 1324290403] = param1;
				GameClient.menuParam2[GameClient.menuActionPtr * 1324290403] = param2;
				GameClient.menuParam3[GameClient.menuActionPtr * 1324290403] = param3;
				GameClient.menuActionPtr -= 439682997;
			}
		}
	}

	Class1() throws Throwable {
		throw new Error();
	}

	static int method46(int var0, int var1, int var2, int var3) {
		return (Class32.mapSettings[var0][var1][var2] & 8) == 0 ? (var0 > 0 && (Class32.mapSettings[1][var1][var2] & 2) != 0 ? var0 - 1 : var0) : 0;
	}

}
