package me.danwi.recyclerviewadvance;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import me.danwi.recyclerviewadvance.adapter.ZeusAdapter;
import me.danwi.recyclerviewadvance.entity.ItemModel;
import me.danwi.recyclerviewadvance.entity.Novel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rvNovelList = findViewById(R.id.rv_read_list);
        List<ItemModel> novelList = new ArrayList<>();
        novelList.add(new ItemModel.Builder().novel(new Novel("天苍土豆")).itemType(0).build());
        novelList.add(new ItemModel.Builder().novel(new Novel("唐家三少")).itemType(1).build());
        novelList.add(new ItemModel.Builder().novel(new Novel("我爱吃西红柿")).itemType(0).build());
        novelList.add(new ItemModel.Builder().novel(new Novel("骷髅精灵")).itemType(0).build());
        novelList.add(new ItemModel.Builder().novel(new Novel("大主宰")).itemType(0).build());
        novelList.add(new ItemModel.Builder().novel(new Novel("斗破苍穹")).itemType(1).build());
        novelList.add(new ItemModel.Builder().novel(new Novel("仙逆")).itemType(0).build());
        ZeusAdapter zeusAdapter = new ZeusAdapter(novelList);
        rvNovelList.setLayoutManager(new LinearLayoutManager(this));
        rvNovelList.setAdapter(zeusAdapter);
    }
}
