public class Class115 {

	Class126 aClass126_1525;
	Class126 aClass126_1526 = new Class126();

	public void method1451(Class126 var1) {
		if (var1.aClass126_1567 != null) {
			var1.method1564();
		}

		var1.aClass126_1567 = aClass126_1526.aClass126_1567;
		var1.aClass126_1566 = aClass126_1526;
		var1.aClass126_1567.aClass126_1566 = var1;
		var1.aClass126_1566.aClass126_1567 = var1;
	}

	public Class126 method1452() {
		Class126 var1 = aClass126_1526.aClass126_1566;
		if (var1 != aClass126_1526) {
			aClass126_1525 = var1.aClass126_1566;
			return var1;
		} else {
			aClass126_1525 = null;
			return null;
		}
	}

	public Class115() {
		aClass126_1526.aClass126_1566 = aClass126_1526;
		aClass126_1526.aClass126_1567 = aClass126_1526;
	}

	public Class126 method1456() {
		Class126 var1 = aClass126_1525;
		if (var1 == aClass126_1526) {
			aClass126_1525 = null;
			return null;
		} else {
			aClass126_1525 = var1.aClass126_1566;
			return var1;
		}
	}

}
