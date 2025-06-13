package itemlease;

import itemlease.leaseConfig.ALeaseConfig;

public class LeaseItem {
    private String _title;
    private ALeaseConfig _leaseConfig;

    public LeaseItem(String title, ALeaseConfig leaseConfig) {
        _title = title;
        _leaseConfig = leaseConfig;
    }

    public String getTitle() {
        return _title;
    }

    public ALeaseConfig getLeaseConfig() {
        return _leaseConfig;
    }
}
