package com.example.navegacao2023
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navegacao2023.ui.theme.Navegacao2023Theme

@Composable
fun Form2Screen(param: String?) {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            BottomNavigation {
                BottomNavigationItem(selected = true,
                    onClick = {
                        navController.navigate("tela1")
                    },
                    label = {
                        Text(text = "Tela 1")
                    },
                    icon = {
                        Icon(Icons.Filled.Home, contentDescription = "")
                    }
                )

                BottomNavigationItem(selected = false,
                    onClick = {
                        navController.navigate("tela2")
                    },
                    label = {
                        Text(text = "Tela 2")
                    },
                    icon = {
                        Icon(Icons.Filled.AccountBox, contentDescription = "")
                    }
                )

                BottomNavigationItem(selected = false,
                    onClick = {
                        navController.navigate("tela3")
                    },
                    label = {
                        Text(text = "Tela 3")
                    },
                    icon = {
                        Icon(Icons.Filled.Add, contentDescription = "")
                    }
                )
            }
        }
    )
    {
        NavHost(navController = navController,
            startDestination = "tela1",
            modifier = Modifier.padding(paddingValues = it)
        ) {
            composable("tela1") {
                Tela1()
            }
            composable("tela2"){
                Tela2()
            }
            composable("tela3"){
                Tela3()
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun Form2Preview(){
    Navegacao2023Theme() {
        Form2Screen(param = "p")
    }
}
