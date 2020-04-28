package com.henryBulmer.lifeTracker.entity.entries;

public class NumericalEntry extends RecordEntry<Double> {
    public NumericalEntry(String name, int entryId, Double val) {
        super(name, entryId, val, EntryType.NUMERICAL);
    }
}
