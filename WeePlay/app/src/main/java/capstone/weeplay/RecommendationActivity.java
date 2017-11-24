package capstone.weeplay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class RecommendationActivity extends AppCompatActivity {
    private Button ViewProfileButton, AddplayerButton, GameButton, FriendsButton, ChatButton, MeButton;
    private ImageButton BackButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommendation);

        ViewProfileButton= (Button) findViewById(R.id.view_profile);
        AddplayerButton= (Button) findViewById(R.id.add_player);
        GameButton = (Button) findViewById(R.id.game);
        FriendsButton = (Button) findViewById(R.id.friends);
        ChatButton = (Button) findViewById(R.id.chat);
        MeButton = (Button) findViewById(R.id.me);
        BackButton = (ImageButton) findViewById(R.id.back);

        BackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(RecommendationActivity.this, FriendsActivity.class);

                startActivity(intent);

            }
        });

        ViewProfileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(RecommendationActivity.this, ViewProfileActivity.class);

                startActivity(intent);

            }
        });

        AddplayerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(RecommendationActivity.this, ChatActivity.class);

                startActivity(intent);

            }
        });

        GameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(RecommendationActivity.this, GameActivity.class);

                startActivity(intent);

            }
        });

        FriendsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(RecommendationActivity.this, FriendsActivity.class);

                startActivity(intent);

            }
        });

        ChatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(RecommendationActivity.this, ChatActivity.class);

                startActivity(intent);

            }
        });

        MeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(RecommendationActivity.this, MeActivity.class);

                startActivity(intent);

            }
        });

    }
}
