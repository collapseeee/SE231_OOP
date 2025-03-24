public abstract class LibraryItem {
    protected String barcode;
    protected String title;
    protected int loanPeriod;
    protected String borrowerName;

    public LibraryItem() {
        this.title = "";
        this.loanPeriod = 0;
        this.borrowerName = "";
    }
    public LibraryItem(String title, String name) {
        this.title = title;
        this.borrowerName = name;
    }

    public abstract String getBarcode();
    public abstract String getTitle();
    public abstract int getLoanPeriod();
    public abstract void checkout(String borrowerName);
    public String getBorrowerName() {
        return borrowerName;
    }

}
