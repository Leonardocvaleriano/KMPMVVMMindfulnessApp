package com.codeplace.kmpmvvmmindfulnessapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.codeplace.kmpmvvmmindfulnessapp.presentation.MindfulnessBooksScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        //val mindfulnessBooksViewModel: MindfulnessBooksViewModel by viewModels()

        setContent {

            MindfulnessBooksScreen()
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    //MindfulnessBooksScreen()
}