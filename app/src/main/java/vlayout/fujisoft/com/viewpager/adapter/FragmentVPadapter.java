package vlayout.fujisoft.com.viewpager.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import java.util.List;

import vlayout.fujisoft.com.viewpager.base.BaseFragmentPagerAdapter;

/**
 * Created by 860617010 on 2017/11/7.
 */

public class FragmentVPadapter extends BaseFragmentPagerAdapter<Fragment> {


    /**
     * 构造方法
     *
     * @param fm     fragment管理器
     * @param list   fragment集合
     * @param titles 标题集合
     */
    public FragmentVPadapter(FragmentManager fm, List<Fragment> list, List<String> titles) {
        super(fm, list, titles);
    }
}
