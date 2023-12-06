package com.example.roomsiswa

import android.app.Application
import com.example.roomsiswa.repository.ContainerApp
import com.example.roomsiswa.repository.ContainerdataApp

class AplikasiSiswa : Application(){

    lateinit var container: ContainerApp

    override fun onCreate() {
        super.onCreate()
        container = ContainerdataApp(this)
    }
}