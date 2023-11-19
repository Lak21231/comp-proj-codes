
import java.util.*;
public class Project23
{
    public double volume(double r)
    {
        //Declaration
        Scanner obj = new Scanner(System.in);
        double V = 1;
        
        //Computation
        V = 4/3 * 22/7 * (r * r * r);
        
        //Output
        System.out.println(" Sphere of radius "+r+" has volume = "+V);
        
        return V;
    }
    
    public double volume(double h, double r)
    {
        //Declaration
        Scanner obj = new Scanner(System.in);
        double V = 1;
        
        //Computation
        V = 22/7 * (r * r * h);
        
        //Output
        System.out.println(" The volume of cyclinder of height "+h+" and radius "+r+" is = "+V);
        
        return V;
    }
    
    public double volume(double l, double b, double h)
    {
        //Declaration
        Scanner obj = new Scanner(System.in);
        double V = 1;
        
        //Computation
        V = l * b * h;
        
        //Output
        System.out.println(" The volume of cuboid with length "+l+" , breadth "+b+" and height "+h+" = "+V);
        
        return V;
    }
    
    public static void main(String[] args)
    {
        //Declaration
        Project23 proj = new Project23();
        
        //Output
        System.out.println(" OUTPUT: ");
        proj.volume(12.5);
        proj.volume(23.2, 53.3);
        proj.volume(12.67, 34.35, 23.45);
    }
}