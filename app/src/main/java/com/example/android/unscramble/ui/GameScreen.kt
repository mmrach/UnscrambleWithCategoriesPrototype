package com.example.android.unscramble.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.android.unscramble.ui.theme.UnscrambleTheme

@Composable
fun GameScreen(
    modifier: Modifier = Modifier,
    gameUiState: GameUiState = GameUiState(),
    onPreviousScreen:()->Unit) {

    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text("Categoría ${gameUiState.numcategoria}")
    }

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    UnscrambleTheme {
        GameScreen(onPreviousScreen={})
    }
}