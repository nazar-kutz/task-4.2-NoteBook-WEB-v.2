package model.entity;

import model.entity.record.Record;

import java.util.ArrayList;
import java.util.Date;

public class NoteBook {
    private ArrayList<Record> records = new ArrayList<Record>();

    public ArrayList<Record> getRecords() {
        return records;
    }

    public void addToRecords(Record record){
        record.setId(records.size() + 1);
        Date currentDate = new Date();
        record.setRegistrationDate(currentDate);
        record.setLastChangeDate(currentDate);
        records.add(record);
    }

    public void changeRecordData(int id){
        Record record = records.get(id);

        //do something...

        //save date of change
        record.setLastChangeDate(new Date());
    }
}
