package com.example.contextmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.contexttext);

        registerForContextMenu(textView);

    }
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        getMenuInflater().inflate(R.menu.context_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.android:
                Toast.makeText(getApplicationContext(), "Android", Toast.LENGTH_LONG).show();
                break;

            case R.id.java:
                Toast.makeText(getApplicationContext(), "Java", Toast.LENGTH_LONG).show();
                break;

            case R.id.php:
                Toast.makeText(getApplicationContext(), "PHP", Toast.LENGTH_LONG).show();
                break;


        }
        return super.onContextItemSelected(item);
    }
}
