import java.io.FileWriter;

/**
 * @author Simon
 */
public class ExamineDumper {

	public static int reqptr = 9224;
	public static int resptr;

	public static void onfail(String resp) {
		if (!Loader.CREATE_EXAMINES) {
			return;
		}
		try {
			FileWriter fw = new FileWriter("objexamines_failed.txt", true);
			fw.append(String.valueOf(resptr)).append(":").append(resp).append("\n");
			fw.flush();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void onresp(String resp) {
		if (!Loader.CREATE_EXAMINES) {
			return;
		}
		try {
			FileWriter fw = new FileWriter("objexamines.txt", true);
			fw.append(String.valueOf(resptr++)).append(":").append(resp).append("\n");
			fw.flush();
			fw.close();
			System.out.println(resptr-1 + ": " + resp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
