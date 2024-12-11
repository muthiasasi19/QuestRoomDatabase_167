package com.example.roomlocaldb_p10.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

//Mmebuat tabel
@Entity(tableName = "mahasiswa")
data class Mahasiswa(
    @PrimaryKey
    val nim: String, // yg Primary key hanya satu baris dibawah @PrimaryKey saja // knp nim tidak int? karena datanya tidak dikomputasi nantinya
    val nama: String,
    val alamat: String,
    val jenisKelamin: String,
    val kelas: String,
    val angkatan: String

)
