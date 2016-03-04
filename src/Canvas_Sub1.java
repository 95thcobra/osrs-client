import java.awt.*;
import java.io.File;
import java.io.RandomAccessFile;

public final class Canvas_Sub1 extends Canvas {

	static final int anInt2434 = 512;
	public static final int anInt2436 = 139;
	Component aComponent2435;

	public final void update(Graphics var1) {
		aComponent2435.update(var1);
	}

	Canvas_Sub1(Component var1) {
		aComponent2435 = var1;
	}

	public final void paint(Graphics var1) {
		aComponent2435.paint(var1);
	}

	public static boolean method2825(File var0, boolean var1, int var2) {
		try {
			RandomAccessFile var3 = new RandomAccessFile(var0, "rw");
			int var4 = var3.read();
			var3.seek(0L);
			var3.write(var4);
			var3.seek(0L);
			var3.close();
			if (var1) {
				var0.delete();
			}

			return true;
		} catch (Exception var5) {
			return false;
		}
	}

}
