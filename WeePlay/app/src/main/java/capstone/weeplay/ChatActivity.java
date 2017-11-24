package capstone.weeplay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class ChatActivity extends AppCompatActivity {
    private Button GameButton, FriendsButton, ChatButton, MeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        GameButton = (Button) findViewById(R.id.game);
        FriendsButton = (Button) findViewById(R.id.friends);
        ChatButton = (Button) findViewById(R.id.chat);
        MeButton = (Button) findViewById(R.id.me);


        GameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ChatActivity.this, GameActivity.class);

                startActivity(intent);

            }
        });

        FriendsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ChatActivity.this, FriendsActivity.class);

                startActivity(intent);

            }
        });

        ChatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ChatActivity.this, ChatActivity.class);

                startActivity(intent);

            }
        });

        MeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ChatActivity.this, MeActivity.class);

                startActivity(intent);

            }
        });

    }
}