public class VolumeOfEarth {
    public static void main(String[] args) {
        double radius = 6378; // in km
        double volumeKm3 = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
        double volumeM3 = volumeKm3 * 1_000_000_000; // 1 km³ = 10^9 m³

        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm3);
        System.out.println("The volume of Earth in cubic meters is " + volumeM3);
    }
}
