package pro.jefferson.androidsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import pro.jefferson.sdk.Jefferson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Jefferson(this).setServer().watchThread();
    }
}
