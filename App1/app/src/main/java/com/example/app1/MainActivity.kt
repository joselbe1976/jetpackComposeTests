package com.example.app1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.app1.ui.theme.App1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App1Theme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(text = "Hello $name!", modifier = modifier)
}

//@Preview(showBackground = true, name = "Telefono 1", widthDp = 200, heightDp = 200)
@Composable
fun DefaultPreviewBox() {
    App1Theme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.DarkGray),
            contentAlignment = Alignment.Center
        ){
            Greeting("Android 1")
            Greeting("Android 2", modifier = Modifier.align(Alignment.BottomEnd))
        }
    }
}


@Preview(showBackground = true, name = "Telefono 1", widthDp = 200, heightDp = 200)
@Composable
fun DefaultPreview() {
    App1Theme {
        Column(
            modifier = Modifier.fillMaxSize(),
            //verticalArrangement = Arrangement.SpaceEvenly //espacio igual en pantalla. Sin pegarse arriba o abajo
        //    verticalArrangement = Arrangement.SpaceBetween //Como SwiftUI
         horizontalAlignment = Alignment.CenterHorizontally //centra

        ){
            Greeting("Android 1", modifier = Modifier
                .background(Color.Blue)
                .weight(weight = 2f) //peso en la pantalla
            )
            Greeting("Android 2", modifier = Modifier
                    .background(Color.Yellow)
                    .weight(weight = 1f) //peso en la pantalla
            )
            //Greeting("Android 3", modifier = Modifier.background(Color.Red))
        }
    }
}












