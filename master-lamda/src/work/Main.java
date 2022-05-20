package work;

public class Main {
    public static void main(String[] args) {
//        System.out.println("my system starts");

//        MyInter myInter = new MyInterImpl();
//        myInter.seyHello();

//        MyInter i=new MyInter() {
//            @Override
//            public void seyHello() {
//                System.out.println("this is first annoymous class");
//            }
//        };
//
//        i.seyHello();


        //usring our functional interface with the help of lamda

        MyInter i = () ->{
            System.out.println("this is first time using lambda");
        };

        i.seyHello();

        MyInter i2 =()-> {
            System.out.println("this is second time");
        };
        i2.seyHello();



        SumInter sumInter=(int a,int b)-> {
            return a+b;
        };

        System.out.println(sumInter.sum(2,6));

    }
}
