package com.example.roomlocaldb_p10.repository

import com.example.roomlocaldb_p10.data.entity.Mahasiswa

interface RepositoryMhs {
    suspend fun insertMhs(mahasiswa: Mahasiswa)
}