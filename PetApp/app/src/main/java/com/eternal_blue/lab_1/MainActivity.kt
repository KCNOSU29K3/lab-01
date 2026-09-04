package com.eternal_blue.lab_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.eternal_blue.lab_1.ui.theme.Lab_1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val cat = Cat("Coco", 6)
        val dog = Dog("Mochi", 6)
        val scorpion = Scorpion("Stinger", 32)

        val pets = mutableListOf<Pettable>(cat, dog)
    }
}