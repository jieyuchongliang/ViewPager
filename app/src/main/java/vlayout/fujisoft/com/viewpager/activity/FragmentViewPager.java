package vlayout.fujisoft.com.viewpager.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import vlayout.fujisoft.com.viewpager.R;
import vlayout.fujisoft.com.viewpager.adapter.FragmentVPadapter;
import vlayout.fujisoft.com.viewpager.anim.DepthPageTransformer;
import vlayout.fujisoft.com.viewpager.fragment.FragmentFive;
import vlayout.fujisoft.com.viewpager.fragment.FragmentFour;
import vlayout.fujisoft.com.viewpager.fragment.FragmentOne;
import vlayout.fujisoft.com.viewpager.fragment.FragmentThree;
import vlayout.fujisoft.com.viewpager.fragment.FragmentTwo;

public class FragmentViewPager extends AppCompatActivity {
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_view_pager);
        initView();
    }

    private void initView() {
        viewPager = (ViewPager) findViewById(R.id.view_pager_fragment);
        List<Fragment> list = new ArrayList<>();
        list.add(new FragmentOne());
        list.add(new FragmentTwo());
        list.add(new FragmentThree());
        list.add(new FragmentFour());
        list.add(new FragmentFive());
        FragmentVPadapter fragmentVPadapter = new FragmentVPadapter(getSupportFragmentManager(),list,null);
        viewPager.setPageTransformer(true,new DepthPageTransformer());
        viewPager.setAdapter(fragmentVPadapter);
    }
}
