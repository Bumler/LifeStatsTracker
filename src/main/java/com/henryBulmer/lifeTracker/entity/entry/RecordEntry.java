package com.henryBulmer.lifeTracker.entity.entry;

//considered having only the value and entry id on the record entry.
//but decided to go with per type annotations to reduce look ups in both
//serialization and deserialization as well as make the data more readable in the db

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = NumericalEntry.class, name = EntryType.NUMERICAL ),
        @JsonSubTypes.Type(value = TextEntry.class, name = EntryType.TEXT )
})
public abstract class RecordEntry<TValue> {
    private String name;
    private int entryId;
    private TValue value;
    private String entryType;

    public RecordEntry( String name, int entryId, TValue value, String entryType ) {
        this.name = name;
        this.entryId = entryId;
        this.value = value;
        this.entryType = entryType;
    }

    public String getName() {
        return name;
    }

    public int getEntryId() {
        return entryId;
    }

    public TValue getValue() {
        return value;
    }

    public String getEntryType() {
        return entryType;
    }
}
