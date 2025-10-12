package com.nathakusuma.composenavigationapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
import com.nathakusuma.composenavigationapp.ui.theme.ComposeNavigationAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeNavigationAppTheme {
                Text(
                    text = "Hello Compose Navigation",
                    style = MaterialTheme.typography.headlineSmall
                )
            }
        }
    }
}
