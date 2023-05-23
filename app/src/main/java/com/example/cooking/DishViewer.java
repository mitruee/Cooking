package com.example.cooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DishViewer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dish_viewer);

        Bundle information = getIntent().getExtras();

        String kitchen = information.get("kitchen").toString();
        String name = information.get("name").toString();
        String description = information.get("description").toString();
        String ingredients = information.get("ingredients").toString();
        String time = information.get("time").toString();
        String recipe = information.get("recipe").toString();
        int resource = (int) information.get("resource");

        TextView dishName = findViewById(R.id.dishName);
        dishName.setText(name);

        TextView dishKitchen = findViewById(R.id.dishKitchen);
        dishKitchen.setText(kitchen + " кухня");

        findViewById(R.id.buttonBack).setOnClickListener(v -> {
            finish();
        });

        TextView info = findViewById(R.id.info);
        String fullInfo = ("Описание: " + "\n" + description + "\n" +
                           "Ингредиенты: " + "\n" + ingredients + "\n" +
                           "Время приготовления: " + "\n" + time + "\n" +
                           "Рецепт: " + "\n" + recipe + "\n");
        info.setText(fullInfo);

        ImageView image = findViewById(R.id.image);
        image.setImageResource(resource);
    }
}