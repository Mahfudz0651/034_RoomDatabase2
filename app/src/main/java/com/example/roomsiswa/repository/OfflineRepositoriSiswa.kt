package com.example.roomsiswa.repository

import com.example.roomsiswa.data.Siswa
import com.example.roomsiswa.data.SiswaDao
import kotlinx.coroutines.flow.Flow

class OfflineRepositoriSiswa(private val siswaDao: SiswaDao):RepositoriSiswa {
    override fun getAllsiswaStream(): Flow<List<Siswa>> = siswaDao.getALLSiswa()

}