package vlayout.fujisoft.com.viewpager.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
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

public class VpAndTablayout extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private List<Fragment> fragmentList;
    private List<String> titles;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vp_and_tablayout);
        initTitle();
        initView();
    }

    private void initTitle() {
        fragmentList = new ArrayList<>();
        titles = new ArrayList<>();
        fragmentList.add(new FragmentOne());
        fragmentList.add(new FragmentTwo());
        fragmentList.add(new FragmentThree());
        fragmentList.add(new FragmentFour());
        fragmentList.add(new FragmentFive());
        titles.add("第一");
        titles.add("第二");
        titles.add("第三");
        titles.add("第四");
        titles.add("第五");
    }

    private void initView() {
        viewPager = (ViewPager) findViewById(R.id.view_pager_with_tab);
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText(titles.get(0)));
        tabLayout.addTab(tabLayout.newTab().setText(titles.get(1)));
        tabLayout.addTab(tabLayout.newTab().setText(titles.get(2)));
        tabLayout.addTab(tabLayout.newTab().setText(titles.get(3)));
        tabLayout.addTab(tabLayout.newTab().setText(titles.get(4)));
        FragmentVPadapter fragmentVPadapter = new FragmentVPadapter(getSupportFragmentManager(),fragmentList,titles);
        viewPager.setAdapter(fragmentVPadapter);
        viewPager.setPageTransformer(true,new DepthPageTransformer());
        tabLayout.setupWithViewPager(viewPager);
    }
}
