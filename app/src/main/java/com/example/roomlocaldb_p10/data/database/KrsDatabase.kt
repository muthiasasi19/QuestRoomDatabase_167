package com.example.roomlocaldb_p10.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.roomlocaldb_p10.data.dao.MahasiswaDao
import com.example.roomlocaldb_p10.data.entity.Mahasiswa

//Mendefinisikan database dengan tabel Mahasiswa
// Entitas itu tabel
@Database(entities = [Mahasiswa::class], version = 1, exportSchema = false)
abstract class KrsDatabase : RoomDatabase() {

    // Mendefinisikan fungsi untuk mengangkes data Mahasiswa (Dao)
    abstract  fun mahasiswaDao(): MahasiswaDao

    companion object {
        @Volatile // Memastikan bahwa nilai variable Instance selalu sama di semua tempat
        private  var Instance:KrsDatabase? = null

        fun getDatabase(context: Context): KrsDatabase {
            return (Instance ?: synchronized(this) {
                Room.databaseBuilder(
                    context.applicationContext,
                    KrsDatabase::class.java, // Class Database
                    "KrsDatabase" // Nama Database
                )
                    .build().also { Instance = it }
            })
        }
    }
}