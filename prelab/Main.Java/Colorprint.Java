public class Colorprint extends PrintJob {

    public Colorprint(String id, int pages) {
        super(id, pages);
    }

    @Override
    public int calculateCharge() {
        int pages = getPages();
        int baseCharge;
        if (pages <= 10) {
            baseCharge = pages * 1500;
        } else {
            baseCharge = (1500 * 10) + ((pages - 10) * 1000);
        }
        return baseCharge + 2000;
    }

    @Override
    public String label() {
        return "Color";
    }
}