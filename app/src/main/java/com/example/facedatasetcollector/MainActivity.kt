package com.example.facedatasetcollector

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.facedatasetcollector.ui.CameraPreview
import com.example.facedatasetcollector.ui.theme.FaceDatasetCollectorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FaceDatasetCollectorTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    innerPadding ->
                    CameraPreview(Modifier.fillMaxSize().padding(innerPadding))
                }
            }
        }
    }
}
