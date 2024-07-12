package com.codeplace.kmpmvvmmindfulnessapp.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dagger.hilt.android.lifecycle.HiltViewModel
import org.jetbrains.compose.ui.tooling.preview.Preview

import kotlinx.coroutines.launch

@Composable
@Preview
fun MindfulnessBooksScreen(
    viewModel: MindfulnessBooksViewModel =
    ) {



    MaterialTheme {
        val scope = rememberCoroutineScope()
        var jsonResponseAsText by remember { mutableStateOf("Loading") }

        LaunchedEffect(true){
           // mindfulnessBooksViewModel.getAllMindfulnessBooks()
        }

    }
}
