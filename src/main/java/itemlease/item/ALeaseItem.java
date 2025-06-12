package itemlease.item;

public abstract class ALeaseItem {
    private String _title;

    public ALeaseItem(String title) {
        _title = title;
    }

    public String getTitle() {
        return _title;
    }

    public abstract double getAmount(int DaysLeased);
    public abstract boolean enableBonus();

}
