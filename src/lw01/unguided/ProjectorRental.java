package lw01.unguided;

public class ProjectorRental extends Rental{

    public ProjectorRental(String id, int days){
        super(id, days);
    }

    @Override 
    public int calculateCharge(){
        int rentCharge;
        if(getDays()<=3){
            rentCharge = getDays()*60000;
        } else {
            rentCharge = (60000*3) + ((getDays()-3)*45000);
        }
        return rentCharge = +((getDays()-3)*20000); //kok ndk bisa dikali sm units yh,.,.
    }

    @Override 
    public String label(){
        return "Projector";
    }

    
}