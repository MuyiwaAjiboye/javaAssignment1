import static java.lang.Math.pow;

public class Energy extends Physics {
    static double KineticEnergy(double Mass, double Velocity) {
        return 0.5 * Mass * Math.pow(Velocity, 2);
    }

    static double GravitationalEnergy(double Mass, double Height, double Gf) {
        return Mass * Height * Gf;
    }

    static double Momentum(double mass, double velocity) {
        return mass * velocity * Physics.getGravity;
    }

    static double PotentialEnergy(double Mass, double Gravity, double Height) {
        return Mass * Physics.getGravity * Height;
    }

    static double ElectricalEnergy(double potentialDifference, double current, double time) {
        return potentialDifference * current * time;
    }
}
