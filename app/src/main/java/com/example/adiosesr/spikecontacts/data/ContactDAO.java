package com.example.adiosesr.spikecontacts.data;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.adiosesr.spikecontacts.Contact;

import java.util.List;

@Dao
public interface ContactDAO {
    @Query("SELECT * FROM contact")
    List<Contact> getContacs();

    @Insert
    void insertContact(Contact... contacts);

}
