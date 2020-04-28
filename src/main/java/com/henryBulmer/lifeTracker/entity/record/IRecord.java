package com.henryBulmer.lifeTracker.entity.record;

import com.henryBulmer.lifeTracker.entity.entry.RecordEntry;

import java.time.LocalDate;
import java.util.Collection;

public interface IRecord {
    Integer getId();
    LocalDate getEDate();
    Collection<RecordEntry> getEntries();
    String getNotes();
}
