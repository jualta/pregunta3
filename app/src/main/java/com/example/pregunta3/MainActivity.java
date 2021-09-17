package com.example.pregunta3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mi_menu, menu);
        return true;
    }
    //hacer como fb o wassap semana 5 video 2
    @Override
    public boolean onOptionsItemSelected( MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                Toast.makeText(getApplicationContext(),"Buscar",Toast.LENGTH_LONG).show();
                return true;
            case R.id.item2:
                Uri sitio = Uri.parse("https://twitter.com/home");
                Intent intentItem2 = new Intent(Intent.ACTION_VIEW,sitio);
                startActivity(intentItem2);
                return true;
            case R.id.item3:
                Toast.makeText(getApplicationContext(),"Carpeta",Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}