package capstone.weeplay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class GameActivity extends AppCompatActivity {
    private Button GameButton, FriendsButton, ChatButton, MeButton;
    private ImageButton Game1Button, Game2Button, Game3Button, Game4Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Game1Button = (ImageButton) findViewById(R.id.game1);
        Game2Button = (ImageButton) findViewById(R.id.game2);
        Game3Button = (ImageButton) findViewById(R.id.game3);
        Game4Button = (ImageButton) findViewById(R.id.game4);
        GameButton = (Button) findViewById(R.id.game);
        FriendsButton = (Button) findViewById(R.id.friends);
        ChatButton = (Button) findViewById(R.id.chat);
        MeButton = (Button) findViewById(R.id.me);


        Game1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(GameActivity.this, MainGameActivity.class);

                startActivity(intent);

            }
        });
        Game2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(GameActivity.this, MainGameActivity.class);

                startActivity(intent);

            }
        });
        Game3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(GameActivity.this, MainGameActivity.class);

                startActivity(intent);

            }
        });
        Game4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(GameActivity.this, MainGameActivity.class);

                startActivity(intent);

            }
        });
        GameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(GameActivity.this, GameActivity.class);

                startActivity(intent);

            }
        });

        FriendsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(GameActivity.this, FriendsActivity.class);

                startActivity(intent);

            }
        });

        ChatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(GameActivity.this, ChatActivity.class);

                startActivity(intent);

            }
        });

        MeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(GameActivity.this, MeActivity.class);

                startActivity(intent);

            }
        });

    }
}