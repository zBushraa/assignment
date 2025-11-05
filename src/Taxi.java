public class Taxi {
    public static void main(String[] args) {
        System.out.println("Taxi service fare calculation ");
        int time =10;  //Time in  hour 
        double km  = 4.0;  // Distance in kilometers
        double fare; 
        if ( time>=7 && time <=11) // Day time from 7AM to 11 PM 
        {
            fare  =10 ;

            if (km >4){

                fare = fare+(km -4)*1.9;

            }
            System.out.println(" Thank you for Choosing DIDI apps.Your Total fare is for your ride "+fare  + "YUAN");



        }
        else //  All other time 
    {
        fare =11;
        if （km >4)
        {
            fare= fare +(km-4)*2.2;


        }
        Sy
    }

          

    }
    
}
