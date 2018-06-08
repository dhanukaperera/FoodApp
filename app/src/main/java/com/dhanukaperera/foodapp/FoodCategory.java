package com.dhanukaperera.foodapp;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FoodCategory extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        ListView listFoods = getListView();
        ArrayAdapter<Food> listAdaptor = new ArrayAdapter<Food>(this,android.R.layout.simple_expandable_list_item_1,Food.foods);
        listFoods.setAdapter(listAdaptor);

    }

    @Override
    protected void onListItemClick(ListView listView, View itemView, int position, long id) {
        super.onListItemClick(listView, itemView, position, id);
        Intent intent = new Intent(FoodCategory.this,FoodActivity.class);
        intent.putExtra(FoodActivity.EXTRA_FOODNO,(int)id);
        startActivity(intent);

    }
}
