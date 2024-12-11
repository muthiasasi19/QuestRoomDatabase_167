package com.example.roomlocaldb_p10.repository

import com.example.roomlocaldb_p10.data.dao.MahasiswaDao
import com.example.roomlocaldb_p10.data.entity.Mahasiswa

class LocalRepositoryMhs(
    private  val mahasiswaDao: MahasiswaDao
) : RepositoryMhs { // yg menandakan implementasi interface
    override suspend fun insertMhs(mahasiswa: Mahasiswa) {
        mahasiswaDao.insertMahasiswa(mahasiswa)
    }
}