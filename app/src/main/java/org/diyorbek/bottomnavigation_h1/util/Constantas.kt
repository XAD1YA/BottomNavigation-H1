package org.diyorbek.bottomnavigation_h1.util

import android.graphics.Color
import org.diyorbek.bottomnavigation_h1.model.Exercise
import org.diyorbek.bottomnavigation_h1.R

object Constantas {
    fun allExercises(): List<Exercise> {
        return listOf(
            Exercise("Featured", R.drawable.feature, Color.parseColor("#FB8864")),
            Exercise("Meditation essentials", R.drawable.meditation, Color.parseColor("#FF5722")),
            Exercise("Stress&Anxiety", R.drawable.stress, Color.parseColor("#2196F3")),
            Exercise("Falling asleep&waking up", R.drawable.spleep, Color.parseColor("#FF000000")),
            Exercise("Personal Growth", R.drawable.growth, Color.parseColor("#F439E2")),
            Exercise("Work and Productivity", R.drawable.productivity, Color.parseColor("#52FB59")),
            Exercise("Good mood", R.drawable.mood, Color.parseColor("#fff000")),
        )
    }

    fun secondExercises(): List<Exercise> {
        return listOf(
            Exercise("Featured", R.drawable.feature, Color.parseColor("#FB8864")),
            Exercise("Meditation essentials", R.drawable.meditation, Color.parseColor("#FF5722")),
            Exercise("Stress&Anxiety", R.drawable.stress, Color.parseColor("#2196F3")),
            Exercise("Featured", R.drawable.feature, Color.parseColor("#FB8864")),
            Exercise("Meditation essentials", R.drawable.meditation, Color.parseColor("#FF5722")),
            Exercise("Stress&Anxiety", R.drawable.stress, Color.parseColor("#2196F3"))
        )
    }

    fun thirdExercises(): List<Exercise> {
        return listOf(
            Exercise("Falling asleep&waking up", R.drawable.spleep, Color.parseColor("#FF000000")),
            Exercise("Personal Growth", R.drawable.growth, Color.parseColor("#F439E2")),
            Exercise("Work and Productivity", R.drawable.productivity, Color.parseColor("#52FB59")),
            Exercise("Good mood", R.drawable.mood, Color.parseColor("#fff000")),
            Exercise("Falling asleep&waking up", R.drawable.spleep, Color.parseColor("#FF000000")),
            Exercise("Personal Growth", R.drawable.growth, Color.parseColor("#F439E2")),
            Exercise("Work and Productivity", R.drawable.productivity, Color.parseColor("#52FB59")),
            Exercise("Good mood", R.drawable.mood, Color.parseColor("#fff000")),
        )
    }


}