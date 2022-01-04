package personal.project.beercanoutlook.presentation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import personal.project.beercanoutlook.R;

import java.util.HashMap;
import java.util.Objects;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private HashMap<Integer,Class<?>> ids;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Beer Can Sentence");

        initIDs();

        for (Integer i : ids.keySet()) {
            Button button = findViewById(i);
            button.setOnClickListener(this);
        }

    }

    private void initIDs() {
        ids = new HashMap<>();
        ids.put(R.id.picture_button,UploadActivity.class);
        ids.put(R.id.sentence_button,ChangeSentenceActivity.class);
        ids.put(R.id.mission_button,MissionStatementActivity.class);
    }

    // Can simply get matching key of the on clicked id.
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this,ids.get(v.getId()));
        MainActivity.this.startActivity(intent);
    }


}