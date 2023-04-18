package com.example.navegacao2023

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavController

@Composable
fun Form1Screen(onNavigateForm2: (nome: String) -> Unit,
                onBack: () -> Unit){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Cyan),
        horizontalAlignment = Alignment.CenterHorizontally){

        val nome = remember {
            mutableStateOf("Kelvin")
        }
        Text(
            text = "Form1Screen", textAlign = TextAlign.Center
        )

        OutlinedTextField(value = nome.value,
            onValueChange = {
                nome.value = it
            }
        )

        Button(onClick = {
            onBack()
        }) {
            Text(text = "Back")
        }

        Button(onClick = {onNavigateForm2(nome.value) })
        {
            Text(text = "Form2")
        }
    }
}