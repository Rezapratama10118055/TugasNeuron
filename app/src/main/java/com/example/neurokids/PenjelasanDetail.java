package com.example.neurokids;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PenjelasanDetail extends AppCompatActivity {

    private static  final String TAG = "PenjelasanDetail";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penjelasan_detail);
        getIncomingIntent();

    }
    private void getIncomingIntent(){

        if(getIntent().hasExtra("image_name") && getIntent().hasExtra("penjelasanLengkap") && getIntent().hasExtra("image_url")){

            String penjelasanoyyy = getIntent().getStringExtra("penjelasanLengkap");
            String imageName = getIntent().getStringExtra("image_name");
            int images = getIntent().getIntExtra("image_url", 0);
            setImage(imageName,penjelasanoyyy, images);
        }

    }
    private void setImage(String imageName,String penjelasanoyyy,int images){


        TextView name = findViewById(R.id.judulni);
        name.setText(imageName);

        TextView penjelasan = findViewById(R.id.Penjelasanlengkap);
        penjelasan.setText(penjelasanoyyy);

        ImageView imageView = findViewById(R.id.gambarcok);
        imageView.setImageResource(images);



    }

}