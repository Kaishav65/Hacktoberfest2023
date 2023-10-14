import java.util.*;
class setcircle
{
    private int rad;
    private double area;
    private double peri;
    void radset(int r)
    {
        rad = r;
    }
    void areaset(double a)
    {
        if(a == (3.14*rad*rad))
            area = a;
        else
        {
            area = 0;
            System.out.println("Couldn't set area inavlid wrt radius");
        }
    }
    void periset(double p)
    {
        if(p == (2*3.14*rad))
            peri = p;
        else
        {
            peri = 0;
            System.out.println("Couldn't set perimeter inavlid wrt radius");
        }
    }
    int radget()
    {
        return rad;
    }
    double areaget()
    {
        return area;
    }
    double periget()
    {
        return peri;
    }
}
public class circle
{
    public static void main(String[] args)
    {
        setcircle ob = new setcircle();
        ob.radset(4);
        ob.areaset(4*3.14*4);
        System.out.println("The area is "+ob.areaget());
    }
}
