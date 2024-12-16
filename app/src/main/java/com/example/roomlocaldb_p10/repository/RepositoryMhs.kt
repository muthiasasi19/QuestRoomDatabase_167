package com.example.roomlocaldb_p10.repository

import com.example.roomlocaldb_p10.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

interface RepositoryMhs {


    //untuk mendapatkan semua data mahasiswa dalam bentuk aliran data (flow)
    fun getAllMhs (): Flow<List<Mahasiswa>>

    // untuk mengambil data mahasiswa berdasarkan NIM
    fun getMhs(nim : String) : Flow<Mahasiswa>

    // untuk menghapus data mahasiswa
    suspend fun  deleteMhs(mahasiswa: Mahasiswa)

    // untuk memperbarui data mahasiswa didatabase
    suspend fun updateMhs(mahasiswa: Mahasiswa)

    suspend fun insertMhs(mahasiswa: Mahasiswa)

}