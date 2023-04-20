package com.example.android.unscramble.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.android.unscramble.R


@Composable
fun CategorySelector(
    onNextButtonClicked: (category:Int) -> Unit,
) {
    Column(
        modifier = Modifier.padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Selecciona la categoría")
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {
                onNextButtonClicked(1)
            },
            modifier = Modifier.padding(16.dp)
        )
        {
            Text(text = "Cat 1", fontSize = 20.sp)
        }
        Button(
            onClick = {onNextButtonClicked(2) },
            modifier = Modifier.padding(16.dp)
        )
        {
            Text(text = "Cat 2", fontSize = 20.sp)
        }
        Button(
            onClick = { onNextButtonClicked(3) },
            modifier = Modifier.padding(16.dp)
        )
        {
            Text(text = "Cat 3", fontSize = 20.sp)
        }
        Button(
            onClick = {onNextButtonClicked(4) },
            modifier = Modifier.padding(16.dp)
        )
        {
            Text(text = "Cat 4", fontSize = 20.sp)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun CategoryPreview() {
    CategorySelector(onNextButtonClicked={})
}