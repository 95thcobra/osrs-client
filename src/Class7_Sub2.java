import java.awt.*;
import java.awt.image.*;
import java.util.Hashtable;

public final class Class7_Sub2 extends Class7 {

	Component aComponent1716;

	final void method177(int var1, int var2, Component var3, byte var4) {
		anInt108 = var1 * -1467126307;
		anInt110 = var2 * -952133303;
		anIntArray109 = new int[var2 * var1 + 1];
		DataBufferInt var7 = new DataBufferInt(anIntArray109, anIntArray109.length);
		DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
		WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(anInt108 * -568569227, anInt110 * 774678777), var7, (Point) null);
		anImage111 = new BufferedImage(var5, var6, false, new Hashtable());
		aComponent1716 = var3;
		method158(-1820231489);
	}

	public final void method160(Graphics var1, int var2, int var3, int var4) {
		var1.drawImage(anImage111, var2, var3, aComponent1716);
	}

	public final void method164(Graphics var1, int var2, int var3, int var4, int var5, byte var6) {
		Shape var7 = var1.getClip();
		var1.clipRect(var2, var3, var4, var5);
		var1.drawImage(anImage111, 0, 0, aComponent1716);
		var1.setClip(var7);
	}

}
