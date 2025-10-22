public class MesafeDonusturme {
    public static final double MIL_TO_KM_KATSAYISI = 1.609;

    public static double milToKm(double mil) {
        return mil * MIL_TO_KM_KATSAYISI;
    }

    public static void main(String[] args) {

        double milDegeri = 10.0;


        double kmDegeri = milToKm(milDegeri);

        System.out.println(milDegeri + " mil = " + kmDegeri + " kilometre");
        
        double milDegeri2 = 1.0;
        double kmDegeri2 = milToKm(milDegeri2);
        System.out.println(milDegeri2 + " mil = " + kmDegeri2 + " kilometre");
    }
}
