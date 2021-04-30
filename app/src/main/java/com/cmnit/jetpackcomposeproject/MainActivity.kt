package com.cmnit.jetpackcomposeproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting("Android")
        }
    }
}

@Composable
fun Greeting(name:String){
    Text(text = "Hello $name")
}

@Preview
@Composable
fun PreviewGreeting(){
    Greeting("Android")
}

@Composable
fun Columing(){
    Column{
        Text("Hello")
        Text("World")
        Text("Android")
    }
    Greeting("Android")
}


