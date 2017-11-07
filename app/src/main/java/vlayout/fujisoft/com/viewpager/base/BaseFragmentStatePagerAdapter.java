package vlayout.fujisoft.com.viewpager.base;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by 860617010 on 2017/11/7.
 * 适用于页面比较多的情况，效率相对低，但是省内存。
 */

public class BaseFragmentStatePagerAdapter<T extends Fragment> extends FragmentStatePagerAdapter {
    private List<T> mList;
    private String[] mStrings;

    public BaseFragmentStatePagerAdapter(FragmentManager fm, List<T> list, String[] titles) {
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
     *
     * @param position
     * @return
     */
    @Override
    public CharSequence getPageTitle(int position) {
        return mStrings == null ? super.getPageTitle(position) : mStrings[position];
    }
}
