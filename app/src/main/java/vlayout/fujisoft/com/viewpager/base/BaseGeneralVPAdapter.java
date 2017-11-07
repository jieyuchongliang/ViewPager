package vlayout.fujisoft.com.viewpager.base;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by 860617010 on 2017/11/7.
 * 通用的 ViewPagerAdapter基类抽取,想要用viewpager的adapter直接继承此类，按提示重写一下构造方法，然后自己定义泛型即可。无需重复编写多余代码。
 * @param <T>必须是view类型的泛型
 */

public class BaseGeneralVPAdapter<T extends View> extends PagerAdapter {
    private List<T> mList;

    public BaseGeneralVPAdapter(List<T> mList) {
        this.mList = mList;
    }

    /**
     * 返回了当前要滑动视图的个数
     * @return
     */
    @Override
    public int getCount() {
        return mList == null ? 0:mList.size();
    }

    /**
     * 该函数用来判断instantiateItem(ViewGroup, int)函数所返回来的Key与一个页面视图是否是代表的同一个视图
     * (即它俩是否是对应的，对应的表示同一个View)
     * @param view
     * @param object
     * @return 如果对应的是同一个View，返回True，否则返回False。
     */
    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    /**
     * 这个函数的实现的功能是创建指定位置的页面视图
     * @param container
     * @param position
     * @return 返回值：返回一个代表新增视图页面的Object（Key）
     */
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(mList.get(position));
        return mList.get(position);
    }

    /**
     * 移除一个给定位置的页面
     * @param container
     * @param position
     * @param object
     */
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(mList.get(position));
    }
}
