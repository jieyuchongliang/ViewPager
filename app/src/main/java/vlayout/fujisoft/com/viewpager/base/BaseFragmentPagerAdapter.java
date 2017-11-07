package vlayout.fujisoft.com.viewpager.base;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by 860617010 on 2017/11/7.
 * 适用于页面比较少的情况,效率高，耗内存
 */

public class BaseFragmentPagerAdapter<T extends Fragment> extends FragmentPagerAdapter {
    private List<T> mList;
    private List<String> mStrings;

    /**
     * 构造方法
     *
     * @param fm     fragment管理器
     * @param list   fragment集合
     * @param titles 标题集合
     */
    public BaseFragmentPagerAdapter(FragmentManager fm, List<T> list, List<String> titles) {
        super(fm);
        mList = list;
        mStrings = titles;
    }

    @Override
    public Fragment getItem(int position) {
        return mList.get(position);
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    /**
     * 根据位置返回当前所对应的标题
     * @param position
     * @return
     */
    @Override
    public CharSequence getPageTitle(int position) {
        return mStrings == null ? super.getPageTitle(position) : mStrings.get(position);
    }
}
