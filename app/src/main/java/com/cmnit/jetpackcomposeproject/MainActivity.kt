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
            NewStory()
        }
    }
}

@Composable
fun NewStory(){
    Text("A day in Shake Fin Cove")
    Text("Davenport,California")
    Text("December 2018")
}


@Preview
@Composable
fun DefaultPreview(){
    NewStory()
}



