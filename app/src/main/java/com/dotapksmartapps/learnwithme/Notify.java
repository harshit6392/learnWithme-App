package com.dotapksmartapps.learnwithme;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;

public class Notify extends AppCompatActivity {

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_notify);

        imageView=findViewById(R.id.myimage);
    }

    //Using Glide to get images from the URL

    public void openImageUsingGlide(View view) {
        String url="https://media.licdn.com/dms/image/v2/D5603AQGXMRnUSo6S0Q/profile-displayphoto-shrink_100_100/profile-displayphoto-shrink_100_100/0/1711774005887?e=1729123200&v=beta&t=_jnwc1EUixfPMDqStq-DuPHkpU-BMK6onD0TYBtmcRM";
        Glide.with(this)
                .load(url)
                .placeholder(R.drawable.kakashi)
                .error(R.drawable.insta_logo)
                .into(imageView);
    }
}