package lw01.prelab;

public class Printjob implements Chargeable {
    private String id;
    private int pages;

    public Printjob(String id, int pages) {
        this.id = id;
        this.pages = pages;
    }

    public String getId() {
        return id;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public int calculateCharge() {
        return pages * 500;
    }

    public int calculateCharge(int copies) {
        if (copies <= 0) {
            return 0;
        }
        return calculateCharge() * copies;
    }

    public String summary() {
        return "Job ID: " + id + " | Pages: " + pages + " | Total Charge: Rp" + calculateCharge();
    }
}