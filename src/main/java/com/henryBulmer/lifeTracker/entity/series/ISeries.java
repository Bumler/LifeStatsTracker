package com.henryBulmer.lifeTracker.entity.series;

import com.henryBulmer.lifeTracker.entity.entry.EntryHeader;

import java.util.Collection;

public interface ISeries {
    Integer getId();
    Collection<EntryHeader> getEntries();
    String getName();
}
