package com.example.asignment_two.screen

import android.app.Activity
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SecondActivityScreen() {
    val context = LocalContext.current
    val activity = context as? Activity
    val receivedText = activity?.intent?.getStringExtra("EXTRA_TEXT") ?: "Tidak ada data"

    val nama = "Dirga Yuditama"
    val nim = "245150400111034"

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Nama : $nama", fontSize = 16.sp)
        Text(text = "NIM    : $nim", fontSize = 16.sp)

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Teks dari Activity 1:",
            fontSize = 14.sp
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = receivedText,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = {
                activity?.finish()
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Kembali ke Activity 1")
        }
    }
}
