package com.example.nutritionapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button calBtn = (Button) findViewById(R.id.calorieBtn);
        calBtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                IngredientMap thisMap = new IngredientMap();
                CheckBox flourBox = (CheckBox) findViewById(R.id.flourBox);
                CheckBox milkBox = (CheckBox) findViewById(R.id.milkBox);
                CheckBox cheeseBox = (CheckBox) findViewById(R.id.cheeseBox);
                CheckBox peanutBox = (CheckBox) findViewById(R.id.nutBox);
                CheckBox oatBox = (CheckBox) findViewById(R.id.oatBox);
                CheckBox eggBox = (CheckBox) findViewById(R.id.eggBox);
                CheckBox butterBox = (CheckBox) findViewById(R.id.butterBox);
                CheckBox riceBox = (CheckBox) findViewById(R.id.riceBox);
                CheckBox yoghurtBox = (CheckBox) findViewById(R.id.yoghurtBox);
                CheckBox creamBox = (CheckBox) findViewById(R.id.creamBox);

                TextView calValue = (TextView) findViewById(R.id.cal);
                double totCal = 0;

                if(flourBox.isChecked()) {
                    totCal += thisMap.getIngredient("Flour").getCalories() * Double.parseDouble(((EditText) findViewById(R.id.flourQt)).getText().toString());
                }
                if(milkBox.isChecked()) {
                    totCal += thisMap.getIngredient("Sugar").getCalories() * Double.parseDouble(((EditText) findViewById(R.id.milkQt)).getText().toString());
                }
                if(cheeseBox.isChecked()) {
                    totCal += thisMap.getIngredient("Cheese").getCalories() * Double.parseDouble(((EditText) findViewById(R.id.cheeseQt)).getText().toString());
                }
                if(peanutBox.isChecked()) {
                    totCal += thisMap.getIngredient("Peanut").getCalories() * Double.parseDouble(((EditText) findViewById(R.id.peanutQt)).getText().toString());
                }
                if(oatBox.isChecked()) {
                    totCal += thisMap.getIngredient("Oats").getCalories() * Double.parseDouble(((EditText) findViewById(R.id.oatsQt)).getText().toString());
                }
                if(eggBox.isChecked()) {
                    totCal += thisMap.getIngredient("Eggs").getCalories() * Double.parseDouble(((EditText) findViewById(R.id.eggsQt)).getText().toString());
                }
                if(butterBox.isChecked()) {
                    totCal += thisMap.getIngredient("Butter").getCalories() * Double.parseDouble(((EditText) findViewById(R.id.butterQt2)).getText().toString());
                }
                if(riceBox.isChecked()) {
                    totCal += thisMap.getIngredient("Rice").getCalories() * Double.parseDouble(((EditText) findViewById(R.id.riceQt)).getText().toString());
                }
                if(yoghurtBox.isChecked()) {
                    totCal += thisMap.getIngredient("Yoghurt").getCalories() * Double.parseDouble(((EditText) findViewById(R.id.yoghurtQt)).getText().toString());
                }
                if(creamBox.isChecked()) {
                    totCal += thisMap.getIngredient("Cream").getCalories() * Double.parseDouble(((EditText) findViewById(R.id.creamQt)).getText().toString());
                }

                calValue.setText((double)Math.round(totCal*100)/100 + "");
            }
        });
        Button fatBtn = (Button) findViewById(R.id.fatBtn);
        fatBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IngredientMap thisMap = new IngredientMap();
                CheckBox flourBox = (CheckBox) findViewById(R.id.flourBox);
                CheckBox milkBox = (CheckBox) findViewById(R.id.milkBox);
                CheckBox cheeseBox = (CheckBox) findViewById(R.id.cheeseBox);
                CheckBox peanutBox = (CheckBox) findViewById(R.id.nutBox);
                CheckBox oatBox = (CheckBox) findViewById(R.id.oatBox);
                CheckBox eggBox = (CheckBox) findViewById(R.id.eggBox);
                CheckBox butterBox = (CheckBox) findViewById(R.id.butterBox);
                CheckBox riceBox = (CheckBox) findViewById(R.id.riceBox);
                CheckBox yoghurtBox = (CheckBox) findViewById(R.id.yoghurtBox);
                CheckBox creamBox = (CheckBox) findViewById(R.id.creamBox);

                TextView fatValue = (TextView) findViewById(R.id.fat);
                double totFat = 0;

                if(flourBox.isChecked()) {
                    totFat += thisMap.getIngredient("Flour").getFat() * Double.parseDouble(((EditText) findViewById(R.id.flourQt)).getText().toString());
                }
                if(milkBox.isChecked()) {
                    totFat += thisMap.getIngredient("Sugar").getFat() * Double.parseDouble(((EditText) findViewById(R.id.milkQt)).getText().toString());
                }
                if(cheeseBox.isChecked()) {
                    totFat += thisMap.getIngredient("Cheese").getFat() * Double.parseDouble(((EditText) findViewById(R.id.cheeseQt)).getText().toString());
                }
                if(peanutBox.isChecked()) {
                    totFat += thisMap.getIngredient("Peanut").getFat() * Double.parseDouble(((EditText) findViewById(R.id.peanutQt)).getText().toString());
                }
                if(oatBox.isChecked()) {
                    totFat += thisMap.getIngredient("Oats").getFat() * Double.parseDouble(((EditText) findViewById(R.id.oatsQt)).getText().toString());
                }
                if(eggBox.isChecked()) {
                    totFat += thisMap.getIngredient("Eggs").getFat() * Double.parseDouble(((EditText) findViewById(R.id.eggsQt)).getText().toString());
                }
                if(butterBox.isChecked()) {
                    totFat += thisMap.getIngredient("Butter").getFat() * Double.parseDouble(((EditText) findViewById(R.id.butterQt2)).getText().toString());
                }
                if(riceBox.isChecked()) {
                    totFat += thisMap.getIngredient("Rice").getFat() * Double.parseDouble(((EditText) findViewById(R.id.riceQt)).getText().toString());
                }
                if(yoghurtBox.isChecked()) {
                    totFat += thisMap.getIngredient("Yoghurt").getFat() * Double.parseDouble(((EditText) findViewById(R.id.yoghurtQt)).getText().toString());
                }
                if(creamBox.isChecked()) {
                    totFat += thisMap.getIngredient("Cream").getFat() * Double.parseDouble(((EditText) findViewById(R.id.creamQt)).getText().toString());
                }

                fatValue.setText((double)Math.round(totFat*100)/100 + "");
            }
        });
        Button proteinBtn = (Button) findViewById(R.id.proteinBtn);
        proteinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IngredientMap thisMap = new IngredientMap();
                CheckBox flourBox = (CheckBox) findViewById(R.id.flourBox);
                CheckBox milkBox = (CheckBox) findViewById(R.id.milkBox);
                CheckBox cheeseBox = (CheckBox) findViewById(R.id.cheeseBox);
                CheckBox peanutBox = (CheckBox) findViewById(R.id.nutBox);
                CheckBox oatBox = (CheckBox) findViewById(R.id.oatBox);
                CheckBox eggBox = (CheckBox) findViewById(R.id.eggBox);
                CheckBox butterBox = (CheckBox) findViewById(R.id.butterBox);
                CheckBox riceBox = (CheckBox) findViewById(R.id.riceBox);
                CheckBox yoghurtBox = (CheckBox) findViewById(R.id.yoghurtBox);
                CheckBox creamBox = (CheckBox) findViewById(R.id.creamBox);

                TextView proteinValue = (TextView) findViewById(R.id.protein);
                double totProtein = 0;

                if(flourBox.isChecked()) {
                    totProtein += thisMap.getIngredient("Flour").getProtein() * Double.parseDouble(((EditText) findViewById(R.id.flourQt)).getText().toString());
                }
                if(milkBox.isChecked()) {
                    totProtein += thisMap.getIngredient("Sugar").getProtein() * Double.parseDouble(((EditText) findViewById(R.id.milkQt)).getText().toString());
                }
                if(cheeseBox.isChecked()) {
                    totProtein += thisMap.getIngredient("Cheese").getProtein() * Double.parseDouble(((EditText) findViewById(R.id.cheeseQt)).getText().toString());
                }
                if(peanutBox.isChecked()) {
                    totProtein += thisMap.getIngredient("Peanut").getProtein() * Double.parseDouble(((EditText) findViewById(R.id.peanutQt)).getText().toString());
                }
                if(oatBox.isChecked()) {
                    totProtein += thisMap.getIngredient("Oats").getProtein() * Double.parseDouble(((EditText) findViewById(R.id.oatsQt)).getText().toString());
                }
                if(eggBox.isChecked()) {
                    totProtein += thisMap.getIngredient("Eggs").getProtein() * Double.parseDouble(((EditText) findViewById(R.id.eggsQt)).getText().toString());
                }
                if(butterBox.isChecked()) {
                    totProtein += thisMap.getIngredient("Butter").getProtein() * Double.parseDouble(((EditText) findViewById(R.id.butterQt2)).getText().toString());
                }
                if(riceBox.isChecked()) {
                    totProtein += thisMap.getIngredient("Rice").getProtein() * Double.parseDouble(((EditText) findViewById(R.id.riceQt)).getText().toString());
                }
                if(yoghurtBox.isChecked()) {
                    totProtein += thisMap.getIngredient("Yoghurt").getProtein() * Double.parseDouble(((EditText) findViewById(R.id.yoghurtQt)).getText().toString());
                }
                if(creamBox.isChecked()) {
                    totProtein += thisMap.getIngredient("Cream").getProtein() * Double.parseDouble(((EditText) findViewById(R.id.creamQt)).getText().toString());
                }

                proteinValue.setText((double)Math.round(totProtein*100)/100 + "");
            }
        });
        Button carbsBtn = (Button) findViewById(R.id.carbsBtn);
        carbsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IngredientMap thisMap = new IngredientMap();
                CheckBox flourBox = (CheckBox) findViewById(R.id.flourBox);
                CheckBox milkBox = (CheckBox) findViewById(R.id.milkBox);
                CheckBox cheeseBox = (CheckBox) findViewById(R.id.cheeseBox);
                CheckBox peanutBox = (CheckBox) findViewById(R.id.nutBox);
                CheckBox oatBox = (CheckBox) findViewById(R.id.oatBox);
                CheckBox eggBox = (CheckBox) findViewById(R.id.eggBox);
                CheckBox butterBox = (CheckBox) findViewById(R.id.butterBox);
                CheckBox riceBox = (CheckBox) findViewById(R.id.riceBox);
                CheckBox yoghurtBox = (CheckBox) findViewById(R.id.yoghurtBox);
                CheckBox creamBox = (CheckBox) findViewById(R.id.creamBox);

                TextView carbValue = (TextView) findViewById(R.id.carbs);
                double totCarbs = 0;

                if(flourBox.isChecked()) {
                    totCarbs += thisMap.getIngredient("Flour").getCarbs() * Double.parseDouble(((EditText) findViewById(R.id.flourQt)).getText().toString());
                }
                if(milkBox.isChecked()) {
                    totCarbs += thisMap.getIngredient("Sugar").getCarbs() * Double.parseDouble(((EditText) findViewById(R.id.milkQt)).getText().toString());
                }
                if(cheeseBox.isChecked()) {
                    totCarbs += thisMap.getIngredient("Cheese").getCarbs() * Double.parseDouble(((EditText) findViewById(R.id.cheeseQt)).getText().toString());
                }
                if(peanutBox.isChecked()) {
                    totCarbs += thisMap.getIngredient("Peanut").getCarbs() * Double.parseDouble(((EditText) findViewById(R.id.peanutQt)).getText().toString());
                }
                if(oatBox.isChecked()) {
                    totCarbs += thisMap.getIngredient("Oats").getCarbs() * Double.parseDouble(((EditText) findViewById(R.id.oatsQt)).getText().toString());
                }
                if(eggBox.isChecked()) {
                    totCarbs += thisMap.getIngredient("Eggs").getCarbs() * Double.parseDouble(((EditText) findViewById(R.id.eggsQt)).getText().toString());
                }
                if(butterBox.isChecked()) {
                    totCarbs+= thisMap.getIngredient("Butter").getCarbs() * Double.parseDouble(((EditText) findViewById(R.id.butterQt2)).getText().toString());
                }
                if(riceBox.isChecked()) {
                    totCarbs += thisMap.getIngredient("Rice").getCarbs() * Double.parseDouble(((EditText) findViewById(R.id.riceQt)).getText().toString());
                }
                if(yoghurtBox.isChecked()) {
                    totCarbs += thisMap.getIngredient("Yoghurt").getCarbs() * Double.parseDouble(((EditText) findViewById(R.id.yoghurtQt)).getText().toString());
                }
                if(creamBox.isChecked()) {
                    totCarbs += thisMap.getIngredient("Cream").getCarbs() * Double.parseDouble(((EditText) findViewById(R.id.creamQt)).getText().toString());
                }

                carbValue.setText((double)Math.round(totCarbs*100)/100 + "");
            }
        });
        Button sodiumBtn = (Button) findViewById(R.id.sodiumBtn);
        sodiumBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IngredientMap thisMap = new IngredientMap();
                CheckBox flourBox = (CheckBox) findViewById(R.id.flourBox);
                CheckBox milkBox = (CheckBox) findViewById(R.id.milkBox);
                CheckBox cheeseBox = (CheckBox) findViewById(R.id.cheeseBox);
                CheckBox peanutBox = (CheckBox) findViewById(R.id.nutBox);
                CheckBox oatBox = (CheckBox) findViewById(R.id.oatBox);
                CheckBox eggBox = (CheckBox) findViewById(R.id.eggBox);
                CheckBox butterBox = (CheckBox) findViewById(R.id.butterBox);
                CheckBox riceBox = (CheckBox) findViewById(R.id.riceBox);
                CheckBox yoghurtBox = (CheckBox) findViewById(R.id.yoghurtBox);
                CheckBox creamBox = (CheckBox) findViewById(R.id.creamBox);

                TextView sodiumValue = (TextView) findViewById(R.id.sodium);
                double totSodium = 0;

                if(flourBox.isChecked()) {
                    totSodium += thisMap.getIngredient("Flour").getSodium() * Double.parseDouble(((EditText) findViewById(R.id.flourQt)).getText().toString());
                }
                if(milkBox.isChecked()) {
                    totSodium += thisMap.getIngredient("Sugar").getSodium() * Double.parseDouble(((EditText) findViewById(R.id.milkQt)).getText().toString());
                }
                if(cheeseBox.isChecked()) {
                    totSodium += thisMap.getIngredient("Cheese").getSodium() * Double.parseDouble(((EditText) findViewById(R.id.cheeseQt)).getText().toString());
                }
                if(peanutBox.isChecked()) {
                    totSodium += thisMap.getIngredient("Peanut").getSodium() * Double.parseDouble(((EditText) findViewById(R.id.peanutQt)).getText().toString());
                }
                if(oatBox.isChecked()) {
                    totSodium += thisMap.getIngredient("Oats").getSodium() * Double.parseDouble(((EditText) findViewById(R.id.oatsQt)).getText().toString());
                }
                if(eggBox.isChecked()) {
                    totSodium += thisMap.getIngredient("Eggs").getSodium() * Double.parseDouble(((EditText) findViewById(R.id.eggsQt)).getText().toString());
                }
                if(butterBox.isChecked()) {
                    totSodium+= thisMap.getIngredient("Butter").getSodium() * Double.parseDouble(((EditText) findViewById(R.id.butterQt2)).getText().toString());
                }
                if(riceBox.isChecked()) {
                    totSodium += thisMap.getIngredient("Rice").getSodium() * Double.parseDouble(((EditText) findViewById(R.id.riceQt)).getText().toString());
                }
                if(yoghurtBox.isChecked()) {
                    totSodium += thisMap.getIngredient("Yoghurt").getSodium() * Double.parseDouble(((EditText) findViewById(R.id.yoghurtQt)).getText().toString());
                }
                if(creamBox.isChecked()) {
                    totSodium += thisMap.getIngredient("Cream").getSodium() * Double.parseDouble(((EditText) findViewById(R.id.creamQt)).getText().toString());
                }

                sodiumValue.setText((double)Math.round(totSodium*100)/100 + "");
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}