package com.example.roomlocaldb_p10.repository

import com.example.roomlocaldb_p10.data.dao.MahasiswaDao
import com.example.roomlocaldb_p10.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

class LocalRepositoryMhs(
    private  val mahasiswaDao: MahasiswaDao
) : RepositoryMhs {
    // yg menandakan implementasi interface
    override suspend fun insertMhs(mahasiswa: Mahasiswa) {
        mahasiswaDao.insertMahasiswa(mahasiswa)

    }
    override fun getAllMhs(): Flow<List<Mahasiswa>> {
        return mahasiswaDao.getAllMahasiswa()
    }
    //mengambil data mahasiswa berdasarkan nim
    override fun getMhs(nim: String): Flow<Mahasiswa> {
        return mahasiswaDao.getMahasiswa(nim)
    }
    //menghapus data mahasiswa
    override suspend fun deleteMhs(mahasiswa: Mahasiswa) {
        mahasiswaDao.deleteMahasiswa(mahasiswa)
    }
    //memperbarui data mahasiswa dalam database
    override suspend fun updateMhs(mahasiswa: Mahasiswa) {
        mahasiswaDao.updateMahasiswa(mahasiswa)
    }

}
