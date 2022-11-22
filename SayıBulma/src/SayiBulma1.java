
public class SayiBulma1 {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 1, 2, 3, 4, 6, 5, 0 };
		int aranacak = 9;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}

		if (varMi) {
			System.out.println("Sayi Mevcuttur");

		} else {
			System.out.println("Sayı Mevcur Değildir");

		}
	}

}
