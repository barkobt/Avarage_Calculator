import java.util.Scanner;

/*
Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

Geçme Notu : 55

Ödev
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
 */
public class Avarage_Point {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen notlarınızı giriniz:");
        System.out.println("Matematik Notunuz:");
        int matematik = input.nextInt();
        System.out.println("Fizik Notunuz:");
        int fizik = input.nextInt();
        System.out.println("Türkçe Notunuz:");
        int turkce = input.nextInt();
        System.out.println("Kimya Notunuz:");
        int kimya = input.nextInt();
        System.out.println("Müzik Notunuz:");
        int muzik = input.nextInt();


        if (matematik > 0 && matematik < 100) {
            matematik = matematik;
        } else {
            matematik = 0;
        }
        if (fizik > 0 && fizik < 100) {
            fizik = fizik;
        } else {
            fizik = 0;
        }
        if (turkce > 0 && turkce < 100) {
            turkce = turkce;
        } else {
            turkce = 0;
        }
        if (muzik > 0 && muzik < 100) {
            muzik = muzik;
        } else {
            muzik = 0;
        }
        if (kimya > 0 && kimya < 100) {
            kimya = kimya;
        } else {
            kimya = 0;
        }
        double avarage = ((muzik + kimya + turkce + fizik + matematik) / 5);
        if (avarage >= 55) {
            System.out.println("Ortalamanız "+avarage+"\nTebrikler sınıfı geçtiniz.");

        } else {
            System.out.println("Ortalamanız "+avarage +"\nSınıfta kaldınız..Daha çok çalışmalısınız.");
        }

    }
}

/*
Bu çözüme de göz atabilirsin çok mantıklıymış.

	public static void main(String[] args) {
		int toplam=0;
		int sayac=0;

		Scanner input = new Scanner(System.in);

		System.out.print("Matematik dersinizin sınav notunu giriniz: ");
		int math=input.nextInt();

		if (math >= 0 & math <=100) {
			toplam += math ;
			sayac++ ;


		}

		System.out.print("Fizik dersinizin sınav notunu giriniz: ");
		int physics=input.nextInt();

		if (physics >= 0 & physics <= 100) {
			toplam += physics;
			sayac++;

		}
		System.out.print("Türkçe dersinizin sınav notunu giriniz: ");
		int trk=input.nextInt();

		if (trk>=0 & trk <=100) {
			toplam += trk;
			sayac++;

		}
		System.out.print("Kimya dersinizin sınav notunu giriniz: ");
		int chem=input.nextInt();

		if (chem >= 0 & chem <= 100) {
			toplam += chem;
			sayac++;

		}
		System.out.print("Müzik dersinizin sınav notunu giriniz: ");
		int music=input.nextInt();

		if (music >=0 & music <=100) {
			toplam += music;
			sayac++;

		}

		double ortalama = toplam/sayac;
 */