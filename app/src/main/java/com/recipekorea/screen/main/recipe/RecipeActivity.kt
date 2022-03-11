package com.recipekorea.screen.main.recipe


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.recipekorea.databinding.ActivityRecipeBinding


class RecipeActivity : AppCompatActivity() {

    private val binding by lazy { ActivityRecipeBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }


}
