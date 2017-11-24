package capstone.weeplay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class ViewProfileActivity extends AppCompatActivity {
    private Button GameButton, FriendsButton, ChatButton, MeButton;
    private ImageButton BackButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewprofile);

        GameButton = (Button) findViewById(R.id.game);
        FriendsButton = (Button) findViewById(R.id.friends);
        ChatButton = (Button) findViewById(R.id.chat);
        MeButton = (Button) findViewById(R.id.me);
        BackButton = (ImageButton) findViewById(R.id.back);

        BackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ViewProfileActivity.this, FriendsActivity.class);

                startActivity(intent);

            }
        });


        GameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ViewProfileActivity.this, GameActivity.class);

                startActivity(intent);

            }
        });

        FriendsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(ViewProfileActivity.this, FriendsActivity.class);

                startActivity(intent);

            }
        });

        ChatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(ViewProfileActivity.this, ChatActivity.class);

                startActivity(intent);

            }
        });

        MeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(ViewProfileActivity.this, MeActivity.class);

                startActivity(intent);

            }
        });

    }
}