package com.example.roomlocaldb_p10.ui.viewmodel


import com.example.roomlocaldb_p10.data.entity.Mahasiswa



//DATA CLASS untuk menampung data yang akan ditampilkan di UI

//Memindahkan data dari entity ke UI
fun Mahasiswa.toDetailUiEvent(): MahasiswaEvent{
    return MahasiswaEvent(
        nim = nim,
        nama = nama,
        jenisKelamin = jenisKelamin,
        alamat = alamat,
        kelas = kelas,
        angkatan = angkatan
    )
}

