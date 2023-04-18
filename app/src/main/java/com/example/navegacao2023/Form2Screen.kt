package com.example.navegacao2023

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign

@Composable
fun Form2Screen(param: String?, onBack: () -> Unit) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Green),
        horizontalAlignment = Alignment.CenterHorizontally){

        Text(
            text = "Form2Screen", textAlign = TextAlign.Center
        )
        Button(onClick = {
            onBack()
        }) {
            Text(text = "Back")
        }
        Text(
            text = "Nome: $param", textAlign = TextAlign.Center
        )
    }
}