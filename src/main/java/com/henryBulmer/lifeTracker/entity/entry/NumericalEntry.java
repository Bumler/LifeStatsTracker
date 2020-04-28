package com.henryBulmer.lifeTracker.entity.entry;

public class NumericalEntry extends RecordEntry<Double> {
    public NumericalEntry(String name, int entryId, Double val) {
        super(name, entryId, val, EntryTypes.NUMERICAL);
    }
}
