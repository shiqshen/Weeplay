package capstone.weeplay;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class MainGameActivity extends AppCompatActivity {
    private ImageButton BackButton;
    private Button ViewButton;
    private Button GameButton;
    private Button FriendsButton;
    private Button ChatButton;
    private Button MeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maingame);

        BackButton = (ImageButton) findViewById(R.id.back);
        ViewButton = (Button) findViewById(R.id.view);
        GameButton = (Button) findViewById(R.id.game);
        FriendsButton = (Button) findViewById(R.id.friends);
        ChatButton = (Button) findViewById(R.id.chat);
        MeButton = (Button) findViewById(R.id.me);

        BackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(MainGameActivity.this, GameActivity.class);

                startActivity(intent);

            }
        });

        ViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainGameActivity.this, GameViewActivity.class);

                startActivity(intent);

            }
        });

        GameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(MainGameActivity.this, GameActivity.class);

                startActivity(intent);

            }
        });

        FriendsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainGameActivity.this, FriendsActivity.class);

                startActivity(intent);

            }
        });

        ChatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainGameActivity.this, ChatActivity.class);

                startActivity(intent);

            }
        });

        MeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(MainGameActivity.this, MeActivity.class);

                startActivity(intent);

            }
        });

    }
}