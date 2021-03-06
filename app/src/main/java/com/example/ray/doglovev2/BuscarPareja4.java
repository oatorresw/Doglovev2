package com.example.ray.doglovev2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by RAY on 01/12/2015.
 */
public class BuscarPareja4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mascota4);
    }
    public void likearcuatro(View view) {
        switch (view.getId()) {
            case R.id.iviAceptar4:
                Intent intent = new Intent(this,VerPerfilcuatro.class);
                startActivity(intent);
                break;
            case R.id.iviRechazar4:
                Intent registerIntent = new Intent(this,BuscarPareja.class);
                startActivity(registerIntent);
                break;
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_dog, menu);
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
            Intent i=new Intent(this,MenuDog.class);
            this.startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
