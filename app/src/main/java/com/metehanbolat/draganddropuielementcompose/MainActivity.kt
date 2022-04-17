package com.metehanbolat.draganddropuielementcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.metehanbolat.draganddropuielementcompose.ui.theme.DragAndDropUIElementComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DragAndDropUIElementComposeTheme {

            }
        }
    }
}
