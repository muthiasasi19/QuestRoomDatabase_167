package com.example.roomlocaldb_p10.data.dao

import androidx.room.Dao
import androidx.room.Insert
import com.example.roomlocaldb_p10.data.entity.Mahasiswa

//suspend: bisa digunakan di insert, update, delete

@Dao // semua operasi ada di Dao
interface MahasiswaDao {

    @Insert
    suspend fun  insertMahasiswa(mahasiswa: Mahasiswa)
}