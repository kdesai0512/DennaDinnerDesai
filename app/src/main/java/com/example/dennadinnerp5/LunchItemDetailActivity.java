package com.example.dennadinnerp5;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LunchItemDetailActivity extends AppCompatActivity {


    public static final String EXTRA_FOOD_ID = "foodChoice";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch_item_detail);

        Intent intent = getIntent();
        int foodId = intent.getIntExtra(EXTRA_FOOD_ID, 0);

        Food myFood = Food.lunchFoods[foodId];

        ImageView photo = (ImageView) findViewById(R.id.food_pic1);
        TextView name = (TextView) findViewById(R.id.food_name1);
        TextView desc = (TextView) findViewById(R.id.food_desc1);
        TextView price = (TextView) findViewById(R.id.food_price1);

        photo.setImageResource((myFood.getImageResourceID()));
        name.setText(myFood.getFoodName());
        desc.setText(myFood.getDescription());
        price.setText("$" + myFood.getPrice());
    }
}
