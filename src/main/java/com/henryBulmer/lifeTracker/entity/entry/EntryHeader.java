package com.henryBulmer.lifeTracker.entity.entry;

public class EntryHeader implements Entry {

    private Integer entryId;
    private String name;
    private String entryType;

    public EntryHeader(Integer entryId, String name, String entryType) {
        this.entryId = entryId;
        this.name = name;
        this.entryType = entryType;
    }

    public Integer getId() {
        return entryId;
    }

    public String getName() {
        return name;
    }

    public String getEntryType() {
        return entryType;
    }
}
