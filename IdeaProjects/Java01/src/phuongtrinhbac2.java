
public class phuongtrinhbac2 {
    int a, b, c;
    public void tinhtoan(int a, int b, int c) {
        float delta = b*b - 4*a*c;
        if(delta < 0)
            System.out.println("Phuong trinh vo nghiem");
        else
        {
            if(delta == 0)
                System.out.println("Phuong trinh co nghiem duy nhat = " + -b/(2*a));
            else
            {
                System.out.println("Phuong trinh co hai nghiem x1 = " + ((-b + Math.sqrt(delta))/(2*a)) + " va x2 = " + ((-b - Math.sqrt(delta))/(2*a)));
            }
        }
    }
}
