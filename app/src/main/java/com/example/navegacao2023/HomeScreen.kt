package com.example.navegacao2023

import android.graphics.Paint.Align
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.navegacao2023.ui.theme.Navegacao2023Theme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun HomeScreen(onNavigateForm1: () -> Unit /*navController: NavController*/){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally){

        Text(
            text = "Home",
        )

        Button(onClick = {
            onNavigateForm1() //navController.navigate("form1")
        }) {
            Text(text = "Navigate to Form1")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomePreview() {
    Navegacao2023Theme {
        //HomeScreen(navController = NavController())
    }
}