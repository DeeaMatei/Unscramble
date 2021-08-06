package com.example.android.unscramble.ui.game

import android.util.Log
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel() {
    init {
        Log.d("GameFragment", "GameViewModel created!")
    }
    private val viewModel: GameViewModel by viewModels()

    private var score = 0
    private var currentWordCount = 0
    private var _currentScrambledWord = "test"
    val currentScrambledWord: String
        get() = _currentScrambledWord

}