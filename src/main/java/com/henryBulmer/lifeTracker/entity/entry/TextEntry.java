package com.henryBulmer.lifeTracker.entity.entry;

public class TextEntry extends RecordEntry<String> {
    public TextEntry(String name, int entryId, String val ) {
        super(name, entryId, val, EntryType.TEXT);
    }
}
