package com.example.roomlocaldb_p10

import android.app.Application
import com.example.roomlocaldb_p10.dependeciesinjection.ContainerApp

class KrsApp : Application() {
    lateinit var containerApp: ContainerApp // Fungsinya untuk menyinpan...

    override fun onCreate() {
        super.onCreate()

        containerApp = ContainerApp(this) // Membuat instance...
        // Instance adalah object yang harus dibuat dari class
    }}