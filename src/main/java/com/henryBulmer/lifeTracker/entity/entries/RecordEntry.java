package com.henryBulmer.lifeTracker.entity.entries;

public abstract class RecordEntry<TValue> {
    private String name;
    private int entryId;
    private TValue value;
    private EntryType entryType;

    public RecordEntry( String name, int entryId, TValue value, EntryType entryType ) {
        this.name = name;
        this.entryId = entryId;
        this.value = value;
        this.entryType = entryType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEntryId() {
        return entryId;
    }

    public void setEntryId(int entryId) {
        this.entryId = entryId;
    }

    public TValue getValue() {
        return value;
    }

    public void setValue(TValue value) {
        this.value = value;
    }
}
