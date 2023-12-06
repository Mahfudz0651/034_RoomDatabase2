package com.example.roomsiswa.Halaman

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.roomsiswa.R
import com.example.roomsiswa.model.DetailSiswa
import com.example.roomsiswa.model.UIStateSiswa
import com.example.roomsiswa.navigasi.DestinasiNavigai

object DestinasiEntry: DestinasiNavigai {
    override val route = "item_entry"
    override val titleRes = R.string.entry_siswa
}
@Composable
fun EntrySiswaBody(
    uiStateSiswa: UIStateSiswa,
    onSiswaValueChange: (DetailSiswa) -> Unit,
    onSaveClick: () -> Unit,
    modifier: Modifier = Modifier
){

}