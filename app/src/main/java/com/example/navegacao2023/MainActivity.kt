package com.example.navegacao2023

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.navegacao2023.ui.theme.Navegacao2023Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Navegacao2023Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    //Greeting("Android")
                    MyApp()
                }
            }
        }
    }
}

@Composable
fun MyApp() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(onNavigateForm1 = {
                navController.navigate("form1")
            })
        }
        composable("form1") {
            Form1Screen(onNavigateForm2 = {
                navController.navigate("form2/${it}")
            },
                onBack = {
                    navController.navigateUp()
                })
        }
        composable("form2/{nome}",
            arguments = listOf(navArgument("nome") { type = NavType.StringType})
        ){
            val param = it.arguments?.getString("nome")
            Form2Screen(
                param,
                onBack = {
                navController.navigateUp()
                })
        }
    }
}
@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Navegacao2023Theme {
        //Greeting("Android")
        MyApp()
    }
}