package com.example.android.unscramble.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android.unscramble.R

@Composable
fun StartScreen(
    modifier: Modifier = Modifier,
    onNextButtonClicked: () -> Unit) {

    Column(
        modifier = modifier
            .padding(16.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(stringResource(id = R.string.app_name), fontSize = 35.sp)
        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = onNextButtonClicked,
            modifier = modifier
                .width(250.dp)
                .height(80.dp)
        ) {
            Text(stringResource(R.string.new_game), fontSize = 23.sp)
        }
    }

    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.fillMaxSize().padding(10.dp)
    ) {
        Text(
            text = "Nombre del Autor",
            fontSize = 20.sp,
            color = Color.DarkGray,
            fontStyle = FontStyle.Italic,

            )
    }

}



@Preview(showBackground = true)
@Composable
fun StartPreview() {
    StartScreen(onNextButtonClicked ={})
}