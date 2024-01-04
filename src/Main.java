import models.Order;
import models.Tshirt;



public class Main {
    public static void main(String[] args) {

        String[] m1 ={"XL","L","M"};

        Tshirt t1 = new Tshirt("Gorkhali Batman","123as",1200,"puma","welcome to my shop",new String[]{"XL","L","M"});
        Tshirt t2 = new Tshirt("Superman","123aw",1300,"nike","welcome to my shop",new String[]{"XL","L","M"});
        Tshirt t3 = new Tshirt("Caption america","123ap",1400,"LV","welcome to my shop",new String[]{"XL","L","M"});

        Order o1=new Order("Aashrik",123434,new int[]{2,3,4},new int[]{1200,1300,1000});
        Order o2=new Order("Bishal",12343,new int[]{10,30,4},new int[]{1200,1300,1800});
        Order o3=new Order("biash",12334,new int[]{12,34,45},new int[]{1200,1300,1400});

        t1.displayInformation();
        o1.displayTotal();
        t2.displayInformation();
        o2.displayTotal();
        t3.displayInformation();
        o3.displayTotal();



    }

}


