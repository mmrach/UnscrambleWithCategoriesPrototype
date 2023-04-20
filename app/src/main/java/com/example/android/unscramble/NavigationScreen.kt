package com.example.android.unscramble

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.android.unscramble.ui.GameScreen
import com.example.android.unscramble.ui.GameViewModel
import com.example.android.unscramble.ui.CategorySelector
import com.example.android.unscramble.ui.StartScreen


enum class NavigationScreens() {
    Start,
    Categories,
    Game
}

@Composable
fun NavigationHost(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    var choose: Int = 0

    val gameViewModel: GameViewModel = viewModel()

    Scaffold(
    ) { innerPadding ->
        val uiState by gameViewModel.uiState.collectAsState()

        NavHost(
            navController = navController,
            startDestination = NavigationScreens.Start.name,
            modifier = modifier.padding(innerPadding)
        ) {
            composable(route = NavigationScreens.Start.name) {
                StartScreen(onNextButtonClicked = {
                                navController.navigate(NavigationScreens.Categories.name)
                                }
                            )
            }

            composable(route = NavigationScreens.Categories.name) {
                CategorySelector(
                    onNextButtonClicked = {category->
                                            gameViewModel.updateCategory(category)
                                            navController.navigate(NavigationScreens.Game.name)
                                          },
                )
            }

            composable(route = NavigationScreens.Game.name) {
                GameScreen(
                    onPreviousScreen = {navController.navigate(NavigationScreens.Categories.name)},
                    gameUiState = uiState
                )
            }


        }

    }
}