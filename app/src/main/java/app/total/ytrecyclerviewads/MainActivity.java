package app.total.ytrecyclerviewads;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import app.total.ytrecyclerviewads.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private MainAdapter adapter;
    private List<Main> mainList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mainList = new ArrayList<>();

        mainList.add(new Main("Tech360Zone", new Date()));
        mainList.add(new Main("Do SUBSCRIBE", new Date()));
        mainList.add(new Main("DO LIKE", new Date()));
        mainList.add(new Main("DO Comment", new Date()));
        mainList.add(new Main("Do Share", new Date()));
        mainList.add(new Main("Tech360Zone", new Date()));
        mainList.add(new Main("Do SUBSCRIBE", new Date()));
        mainList.add(new Main("DO LIKE", new Date()));
        mainList.add(new Main("DO Comment", new Date()));
        mainList.add(new Main("Do Share", new Date()));
        mainList.add(new Main("Tech360Zone", new Date()));
        mainList.add(new Main("Do SUBSCRIBE", new Date()));
        mainList.add(new Main("DO LIKE", new Date()));
        mainList.add(new Main("DO Comment", new Date()));
        mainList.add(new Main("Do Share", new Date()));
        mainList.add(new Main("Tech360Zone", new Date()));
        mainList.add(new Main("Do SUBSCRIBE", new Date()));
        mainList.add(new Main("DO LIKE", new Date()));
        mainList.add(new Main("DO Comment", new Date()));
        mainList.add(new Main("Do Share", new Date()));
        mainList.add(new Main("Tech360Zone", new Date()));
        mainList.add(new Main("Do SUBSCRIBE", new Date()));
        mainList.add(new Main("DO LIKE", new Date()));
        mainList.add(new Main("DO Comment", new Date()));
        mainList.add(new Main("Do Share", new Date()));
        mainList.add(new Main("Tech360Zone", new Date()));
        mainList.add(new Main("Do SUBSCRIBE", new Date()));
        mainList.add(new Main("DO LIKE", new Date()));
        mainList.add(new Main("DO Comment", new Date()));
        mainList.add(new Main("Do Share", new Date()));

        binding.rvMain.setHasFixedSize(true);
        binding.rvMain.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MainAdapter(this, mainList);
        binding.rvMain.setAdapter(adapter);
    }
}