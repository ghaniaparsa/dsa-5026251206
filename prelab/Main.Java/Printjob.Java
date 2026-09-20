public class Printjob implements Chargeable{
    private String id = 
    private int pages =

    public Printjob(String id, int pages){
        this.id = id;
        this.pages = pages;
    }

    public String getId(){
        return id;
    }

    public int getPages(){
        return pages;
    }

    @Override
    public abstract calculateCharge();
    public int calculateCharge(int copies){
        if (copies <=0)
    
    }



    
}