package com.example.myfinalassignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Initialize UI component
        val resetButton = findViewById<Button>(R.id.resetButton)
        val submitButton = findViewById<Button>(R.id.submitButton)
        val textView2 = findViewById<TextView>(R.id.textView2)
        val timeInput = findViewById<EditText>(R.id.timeInput)

        //Set an onClickListener for the button
        submitButton.setOnClickListener {
            val Entertimeofday = timeInput.text.toString().trim().lowercase()

            //Determine meal suggestions based on the time of day
            val mealSuggestions = when (timeInput.text.toString().trim().lowercase()) {


                "morning" -> """
                    -breakfast:
                  -Oatmeal with fruits"
                  -Greek yogurt with honey and nuts
                  -weetbix with milk and banana
                  -beverages:lemon water/Cinnamon water/Pineapple green tea
                     """.trimIndent()

                "mid-morning" -> """
                    -Light snack:
                    -Smoothie with spinach, banana and protein powder"
                    -Whole wheat grain toast with avocado
                    -muslie with yogurt and berries
                    -drinks:Blueberry smoothie/Butterfinger smoothie
                      """.trimIndent()

                "afternoon" -> """
                    -lunch:
                   -Grilled chicken salad with mixed greens
                    -Quinoa bowl with black beans,corn, and tomatoes
                    -Blueberry sweet potato and grains bowl
                    -Beverage:milk/fruit juice
                     """.trimIndent()

                "mid-afternoon" -> """
                    -quick bites:
                    -Lentil soup with whole wheat bread
                    -Dark chocolate cake
                    -Fruit salad
                    -beverage:ice-tea
                    """.trimIndent()

                "dinner" -> """
                    -main course:
                    -Baked salmon with asparagus
                    -Vegetables stir-fry with tofu
                    -Burrito bowl
                    -drinks:green tea/warm water
                     """.trimIndent()

                "after dinner snack" -> """
                    -desserts:
                    -malva pudding with a touch of custard
                    -Milk tart /mint tennis tart
                     -custard with jelly
                     -Dark chocolate (70%+) with almonds
                     with cold water
                    """.trimIndent()


                else -> "ERROR please enter a valid time of day" +
                        "(Morning.Mid-Morning,afternoon,Mid-Afternoon)."

            }
             //Display meal suggestions
            textView2.text = mealSuggestions

        }
        //Clear meal suggestions when reset
        resetButton.setOnClickListener {
            textView2.text = "meal suggestions"

        }
    }
}

