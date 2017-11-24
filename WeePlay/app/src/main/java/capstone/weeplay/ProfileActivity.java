package capstone.weeplay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class ProfileActivity extends AppCompatActivity {
    private Button StartButton, SkipButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        StartButton = (Button) findViewById(R.id.Startbutton);
        SkipButton = (Button) findViewById(R.id.Skipbutton);


        StartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ProfileActivity.this, GameActivity.class);

                startActivity(intent);

            }
        });

        SkipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ProfileActivity.this, GameActivity.class);

                startActivity(intent);

            }
        });

    }
}