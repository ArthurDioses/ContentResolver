package com.example.adiosesr.spikecontacts.data;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.example.adiosesr.spikecontacts.Contact;

@Database(entities = {Contact.class},version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public static AppDatabase INSTANCE;

    public abstract ContactDAO contactDAO();

    public static AppDatabase getInstance(Context context)
    {
        if(INSTANCE==null)
        {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                    AppDatabase.class,"Contact.db")
                    .build();
        }
        return  INSTANCE;
    }
}
