package com.example.recyclerview_dialog;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<MyModel> nameList = new ArrayList<>();
        nameList.add(new MyModel("علی"));
        nameList.add(new MyModel("زهرا"));
        nameList.add(new MyModel("محمد"));
        nameList.add(new MyModel("نگین"));
        nameList.add(new MyModel("سارا"));
        nameList.add(new MyModel("رضا"));
        nameList.add(new MyModel("مهدی"));
        nameList.add(new MyModel("محمدرضا"));
        nameList.add(new MyModel("باران"));
        nameList.add(new MyModel("مبینا"));
        nameList.add(new MyModel("علیرضا"));
        nameList.add(new MyModel("ستایش"));
        nameList.add(new MyModel("مبینا"));
        nameList.add(new MyModel("علیرضا"));
        nameList.add(new MyModel("محدثه"));
        nameList.add(new MyModel("امیر علی"));
        nameList.add(new MyModel("شقایق"));
        nameList.add(new MyModel("امیرحسین"));
        nameList.add(new MyModel("بهار"));
        nameList.add(new MyModel("آروین"));
        nameList.add(new MyModel("محمد مهدی"));
        nameList.add(new MyModel("جواد"));
        nameList.add(new MyModel("مژگان"));
        nameList.add(new MyModel("ستاره"));

        MyAdapter adapter = new MyAdapter(this, nameList);
        recyclerView.setAdapter(adapter);
    }

}
