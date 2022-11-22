
public class MultiDimensionalArrayDemo1 {

	public static void main(String[] args) {
		String[][] şehirler = new String[3][3];

		şehirler[0][0] = "İstanbul";
		şehirler[0][1] = "Bursa";
		şehirler[0][2] = "Balıkesir";
		şehirler[1][0] = "Ankara";
		şehirler[1][1] = "Konya";
		şehirler[1][2] = "Kayseri";
		şehirler[2][0] = "Mardin";
		şehirler[2][1] = "Gaziantep";
		şehirler[2][2] = "Diyarbakır";
		
		//for(int j=0; j<=2;j++)
	for (int i = 0; i < şehirler.length; i++) {
		System.out.println("----------------");
		for(int j=0; j<=2;j++) {
			System.out.println(şehirler[i][j]);
		}
	}
	}

}
