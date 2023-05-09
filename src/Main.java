import java.net.SocketPermission;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Physics physics = new Physics();
        physics.getGravity();

        Scanner input = new Scanner(System.in);

        double Mass;
        double Velocity;

        System.out.println("KineticEnergy");
        System.out.println("Input-Mass");
        Mass = input.nextDouble();

        System.out.println("Input-Velocity");
        System.out.println("kineticEnergy");
        Velocity = input.nextDouble();

        
        System.out.println(Energy.KineticEnergy(Mass, Velocity));
        
        double Height;
        double Gf;
        
         System.out.println("GravitationalEnergy");
        System.out.println("Input-Mass");
        Mass = input.nextDouble();

        System.out.println("GravitationalEnergy");
        System.out.println("Input-Height");
        Height = input.nextDouble();

        System.out.println("GravitationalEnergy");
        System.out.println("Input- Gf");
        Gf = input.nextDouble();

        input.close();
        System.out.println(Energy.GravitationalEnergy(Mass, Height, Gf));
        
    }
     //             .....POTENTIAL ENERGY.....
            System.out.println("\t \t .....POTENTIAL ENERGY.....");
            System.out.println("Input Mass");
            Mass = input.nextDouble();

            System.out.println("Input Height");
            Height = input.nextDouble();
            System.out.println("Potential Energy: ");


            System.out.println(Energy.PotentialEnergy(Mass,Physics.getGravity(), Height));

    
    double potentialDifference;
    double current;
    double time;
    
    System.out.println("ElectricalEnergy");
    System.out.println("potentialDifference");
    potentialDifference = input.nextDouble();
    current = input.nextDouble();
    time = input.nextDouble();
    System.out.println(Energy.ElectricalEnergy(potententialDifference,current,time));
}
