package com.henryBulmer.lifeTracker.dao;

import com.henryBulmer.lifeTracker.entity.record.Record;
import com.henryBulmer.lifeTracker.entity.entry.NumericalEntry;
import com.henryBulmer.lifeTracker.entity.entry.RecordEntry;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.*;

@Repository
public class RecordDao {
    private static Map<Integer, Record> records;
    private static int nextRecordId = 4;

    private static Collection<RecordEntry> ent1;
    private static Collection<RecordEntry> ent2;
    private static Collection<RecordEntry> ent3;


    static {
        ent1 = new ArrayList<RecordEntry>() {
            {
                add( new NumericalEntry( "Miles Run", 1, 0.0 ) );
                add( new NumericalEntry( "Weight", 2, 224.6 ) );
            }
        };

        ent2 = new ArrayList<RecordEntry>() {
            {
                add( new NumericalEntry( "Miles Run", 1, 2.0 ) );
                add( new NumericalEntry( "Weight", 2, 225.0 ) );
            }
        };

        ent3 = new ArrayList<RecordEntry>() {
            {
                add( new NumericalEntry( "Miles Run", 1, 1.36 ) );
                add( new NumericalEntry( "Weight", 2, 225.2 ) );
            }
        };

        records = new HashMap<Integer, Record>(){
            {
                put( 1, new Record(1,
                        LocalDate.parse("2020-04-25"), LocalDate.parse("2020-04-25"),
                        ent1, "") );
                put( 2, new Record(2,
                        LocalDate.parse("2020-04-26"), LocalDate.parse("2020-04-26"),
                        ent2, "") );
                put( 3, new Record(3,
                        LocalDate.parse("2020-04-27"), LocalDate.parse("2020-04-27"),
                        ent3, "") );
            }
        };
    }

    public Collection<Record> getAllRecords(){
        return records.values();
    }

    public Record getRecord(int id ){ return records.get( id ); }

    public Integer addRecord(Record rec) {
        int id = nextRecordId;
        nextRecordId++;

        rec.setId( id );

        records.put( id, rec );

        return id;
    }

    public void updateRecord(Record rec){
        records.put( rec.getId(), rec );
    }
}
