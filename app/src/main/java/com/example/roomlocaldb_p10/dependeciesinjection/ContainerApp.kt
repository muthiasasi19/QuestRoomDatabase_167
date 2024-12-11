package com.example.roomlocaldb_p10.dependeciesinjection

import android.content.Context
import com.example.roomlocaldb_p10.data.database.KrsDatabase
import com.example.roomlocaldb_p10.repository.LocalRepositoryMhs
import com.example.roomlocaldb_p10.repository.RepositoryMhs

// repository berada di sini (ContainerApp)
interface InterfaceContainerApp {
    val repositoryMhs : RepositoryMhs
}

class ContainerApp(private val context: Context) : InterfaceContainerApp {
    override val repositoryMhs: RepositoryMhs by lazy {
        LocalRepositoryMhs(KrsDatabase.getDatabase(context).mahasiswaDao())
    }
}