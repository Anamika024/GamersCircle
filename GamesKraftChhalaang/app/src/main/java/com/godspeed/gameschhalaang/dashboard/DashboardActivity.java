package com.godspeed.gameschhalaang.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.godspeed.gameschhalaang.game.activities.ChooseSymbolActivity;
import com.godspeed.gameskraftchhalaang.R;

public class DashboardActivity extends AppCompatActivity {

    private CardView gamesSection, communitySection;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        gamesSection = findViewById(R.id.games_section);
        communitySection = findViewById(R.id.community_section);

        gamesSection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, ChooseSymbolActivity.class);
                startActivity(intent);
            }
        });
    }
}
