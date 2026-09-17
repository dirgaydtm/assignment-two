package com.example.asignment_two

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.asignment_two.screen.SecondActivityScreen
import com.example.asignment_two.ui.theme.Asignment_twoTheme

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Asignment_twoTheme {
                SecondActivityScreen()
            }
        }
    }
}
