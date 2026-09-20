package prelab;

public class Monoprint extends Printjob {

    public Monoprint(String id, int pages) {
        super(id, pages);
    }

    @Override
    public int calculateCharge() {
        return getPages() * 500;
    }
}