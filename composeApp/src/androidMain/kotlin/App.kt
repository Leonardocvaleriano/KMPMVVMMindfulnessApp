import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import data.network.MindfulnessBooksApiImpl
import org.jetbrains.compose.ui.tooling.preview.Preview

import kotlinx.coroutines.launch

@Composable
@Preview
fun App() {
    MaterialTheme {
        val scope = rememberCoroutineScope()
        var jsonResponseAsText by remember { mutableStateOf("Loading") }

        LaunchedEffect(true){
            scope.launch {
                jsonResponseAsText = try {
                    MindfulnessBooksApiImpl().getJsonFromApi()
                } catch(e:Exception) {
                    e.localizedMessage ?: "Error"
                }

            }
        }

    JsonResponseView(jsonResponseAsText)
    }
}

@Composable
fun JsonResponseView(JsonResponseAsText:String){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(top = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(JsonResponseAsText)
    }

}