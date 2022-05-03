package com.example.rowcoldemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(
            //    color = MaterialTheme.colors.primarySurface,
                color = Color.Green,
                modifier = Modifier.fillMaxSize()
            ) {
                MainScreen()

            }
        }
    }
}


@Composable
fun MainScreen() {
     Row(
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier.size(width = 800.dp, height = 600.dp)) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
            ) {
            Button(
                onClick = {},
                Modifier.padding(20.dp),
                shape = RoundedCornerShape(20.dp),
                border = BorderStroke(3.dp, Color.Black),
                colors = ButtonDefaults.buttonColors(
                    contentColor = Color.Black,
                    backgroundColor = Color.Red
                    )
                ) {
                Text(text = "UpperBody")
                }
            Button(
                onClick = {},
                Modifier.padding(20.dp),
                shape = RoundedCornerShape(20.dp),
                border = BorderStroke(3.dp, Color.Black),
                colors = ButtonDefaults.buttonColors(
                    contentColor = Color.Black,
                    backgroundColor = Color.Red
                    )
                ) {
                Text(text = "Abs")
                }
            Button(
                onClick = {},
                Modifier.padding(20.dp),
                shape = RoundedCornerShape(20.dp),
                border = BorderStroke(3.dp, Color.Black),
                colors = ButtonDefaults.buttonColors(
                    contentColor = Color.Black,
                    backgroundColor = Color.Red
                    )
                ) {
                Text(text = "Balance")
                }
            }

        Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
            Button(
                onClick = {},
                Modifier.padding(20.dp),
                shape = RoundedCornerShape(20.dp),
                border = BorderStroke(3.dp, Color.Black),
                colors = ButtonDefaults.buttonColors(
                    contentColor = Color.Black,
                    backgroundColor = Color.Red
                    )
                ) {
                Text(text = "Lower Body")
                }
            Button(
                onClick = {},
                Modifier.padding(20.dp),
                shape = RoundedCornerShape(20.dp),
                border = BorderStroke(3.dp, Color.Black),
                colors = ButtonDefaults.buttonColors(
                    contentColor = Color.Black,
                    backgroundColor = Color.Red
                    )
                ) {
                Text(text = "Cardio")
                }
            Button(
                onClick = {},
                Modifier.padding(20.dp),
                shape = RoundedCornerShape(20.dp),
                border = BorderStroke(3.dp, Color.Black),
                colors = ButtonDefaults.buttonColors(
                    contentColor = Color.Black,
                    backgroundColor = Color.Red
                    )
                ) {
                Text(text = "Other ")
                }
            }
        }
    }

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainScreen()
}