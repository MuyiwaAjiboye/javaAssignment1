import static java.lang.Math.pow;

public class Energy extends Physics {
    static double KineticEnergy(double Mass, double Velocity) {
        return 0.5 * Mass * Math.pow(Velocity, 2);
    }
    static double GravitationalEnergy(double Mass , double Height, double Gf){
        return Mass * Height * Gf;
    }

}
