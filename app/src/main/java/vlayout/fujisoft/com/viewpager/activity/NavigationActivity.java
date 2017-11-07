package vlayout.fujisoft.com.viewpager.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

import java.util.ArrayList;
import java.util.List;

import vlayout.fujisoft.com.viewpager.R;
import vlayout.fujisoft.com.viewpager.adapter.FragmentVPadapter;
import vlayout.fujisoft.com.viewpager.fragment.FragmentOne;
import vlayout.fujisoft.com.viewpager.fragment.FragmentThree;
import vlayout.fujisoft.com.viewpager.fragment.FragmentTwo;

public class NavigationActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private BottomBar bottomBar;
    private List<Fragment> fragmentList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        initView();
    }


    private void initView() {
        fragmentList = new ArrayList<>();
        fragmentList.add(new FragmentOne());
        fragmentList.add(new FragmentTwo());
        fragmentList.add(new FragmentThree());
        bottomBar = (BottomBar) findViewById(R.id.bottom_bar);
        viewPager = (ViewPager) findViewById(R.id.view_pager_container);
//        viewPager.setPageTransformer(true,new DepthPageTransformer());
        viewPager.setAdapter(new FragmentVPadapter(getSupportFragmentManager(),fragmentList,null));
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                bottomBar.selectTabAtPosition(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(int i) {
                if (i == R.id.tab_favorites) {
                    viewPager.setCurrentItem(0);
                } else if (i == R.id.tab_nearby) {
                    viewPager.setCurrentItem(1);
                } else if (i == R.id.tab_friends) {
                    viewPager.setCurrentItem(2);
                }
            }
        });
    }

    private static final String TAG = "NavigationActivity";
}
