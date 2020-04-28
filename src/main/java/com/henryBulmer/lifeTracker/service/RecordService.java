package com.henryBulmer.lifeTracker.service;

import com.henryBulmer.lifeTracker.dao.RecordDao;
import com.henryBulmer.lifeTracker.entity.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class RecordService {
    @Autowired
    private RecordDao recordDao;

    public Collection<Record> getAllRecords(){
        return this.recordDao.getAllRecords();
    }

    public Record getRecord( int id ){ return this.recordDao.getRecord( id ); }
}
