package app.mobile.asianpay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    boolean isVisibility = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_home);

        TextView money_txt;
        ImageView visibility;

        money_txt = findViewById(R.id.money_txt);
        visibility = findViewById(R.id.image2);

        money_txt.setText("****");
        visibility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                isVisibility = !isVisibility;
                if(isVisibility){
                    money_txt.setText("Rs. 45,000");
                }else{
                    money_txt.setText("****");
                }

            }
        });

    }
}