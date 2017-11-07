package vlayout.fujisoft.com.viewpager.activity;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import vlayout.fujisoft.com.viewpager.R;
import vlayout.fujisoft.com.viewpager.adapter.TestBase;
import vlayout.fujisoft.com.viewpager.anim.ZoomOutPageTransformer;

public class GeneralViewPager extends AppCompatActivity {
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_view_pager);
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        //获取views
        View view1 = LayoutInflater.from(this).inflate(R.layout.general_view_one, null);
        View view2 = LayoutInflater.from(this).inflate(R.layout.general_view_two, null);
        View view3 = LayoutInflater.from(this).inflate(R.layout.general_view_three, null);
        List<View> views = new ArrayList<>();
        views.add(view1);
        views.add(view2);
        views.add(view3);
        TestBase pagerAdapter = new TestBase(views);
        viewPager.setAdapter(pagerAdapter);
//        viewPager.setPageTransformer(true,new DepthPageTransformer());
        viewPager.setPageTransformer(true, new ZoomOutPageTransformer());
    }
}
