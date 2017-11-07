package vlayout.fujisoft.com.viewpager;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import vlayout.fujisoft.com.viewpager.activity.FragmentViewPager;
import vlayout.fujisoft.com.viewpager.activity.GeneralViewPager;
import vlayout.fujisoft.com.viewpager.activity.NavigationActivity;
import vlayout.fujisoft.com.viewpager.activity.VpAndTablayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn1, btn2, btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        btn1 = (Button) findViewById(R.id.btn_one);
        btn2 = (Button) findViewById(R.id.btn_two);
        btn3 = (Button) findViewById(R.id.btn_three);
        btn4 = (Button) findViewById(R.id.btn_four);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_one:
                Toast.makeText(this,"anan", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this,GeneralViewPager.class));
                break;
            case R.id.btn_two:
                startActivity(new Intent(this,FragmentViewPager.class));
                break;
            case R.id.btn_three:
                startActivity(new Intent(this,VpAndTablayout.class));
                break;
            case R.id.btn_four:
                startActivity(new Intent(this, NavigationActivity.class));
                break;
        }
    }
}
