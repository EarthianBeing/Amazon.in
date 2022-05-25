package com.remake.earthianbeing.amazon;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Variables
        LinearLayout home = findViewById(R.id.Home);
        LinearLayout person = findViewById(R.id.Person);
        LinearLayout cart = findViewById(R.id.Cart);
        LinearLayout menu = findViewById(R.id.Menu);

        ImageView home_icon = findViewById(R.id.HomeIcon);
        ImageView person_icon = findViewById(R.id.PersonIcon);
        ImageView cart_icon = findViewById(R.id.CartIcon);
        ImageView menu_icon = findViewById(R.id.MenuIcon);

        View home_bar = findViewById(R.id.HomeBar);
        View person_bar = findViewById(R.id.PersonBar);
        View cart_bar = findViewById(R.id.CartBar);
        View menu_bar = findViewById(R.id.MenuBar);

        ProgressBar Loading = findViewById(R.id.ProgressBar);
        LinearLayout DeliverLayout = findViewById(R.id.DeliverLayout);

        // Hide ActionBar
        if (getSupportActionBar() != null)
        {
            getSupportActionBar().hide();
        }

        // OnClick Listeners
        home.setOnClickListener(view -> {
            home_icon.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_home_24));
            person_icon.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_person_24));
            cart_icon.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_shopping_cart_24));
            menu_icon.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_menu_24));

            home_bar.setBackgroundResource(R.drawable.solid_background);
            person_bar.setBackgroundResource(R.drawable.solid_background_disable);
            cart_bar.setBackgroundResource(R.drawable.solid_background_disable);
            menu_bar.setBackgroundResource(R.drawable.solid_background_disable);
        });

        person.setOnClickListener(view -> {
            home_icon.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_home_24_black));
            person_icon.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_person_24_enable));
            cart_icon.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_shopping_cart_24));
            menu_icon.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_menu_24));

            home_bar.setBackgroundResource(R.drawable.solid_background_disable);
            person_bar.setBackgroundResource(R.drawable.solid_background);
            cart_bar.setBackgroundResource(R.drawable.solid_background_disable);
            menu_bar.setBackgroundResource(R.drawable.solid_background_disable);
        });

        cart.setOnClickListener(view -> {
            home_icon.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_home_24_black));
            person_icon.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_person_24));
            cart_icon.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_shopping_cart_24_enable));
            menu_icon.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_menu_24));

            home_bar.setBackgroundResource(R.drawable.solid_background_disable);
            person_bar.setBackgroundResource(R.drawable.solid_background_disable);
            cart_bar.setBackgroundResource(R.drawable.solid_background);
            menu_bar.setBackgroundResource(R.drawable.solid_background_disable);
        });

        menu.setOnClickListener(view -> {
            home_icon.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_home_24_black));
            person_icon.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_person_24));
            cart_icon.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_shopping_cart_24));
            menu_icon.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_menu_24_enable));

            home_bar.setBackgroundResource(R.drawable.solid_background_disable);
            person_bar.setBackgroundResource(R.drawable.solid_background_disable);
            cart_bar.setBackgroundResource(R.drawable.solid_background_disable);
            menu_bar.setBackgroundResource(R.drawable.solid_background);
        });

        // Timer
        Handler handler = new Handler();
        handler.postDelayed(() -> {
            Loading.setVisibility(View.GONE);
            DeliverLayout.setVisibility(View.VISIBLE);
        }, 2500);
    }
}