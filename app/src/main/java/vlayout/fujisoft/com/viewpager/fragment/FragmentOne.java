package vlayout.fujisoft.com.viewpager.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import vlayout.fujisoft.com.viewpager.R;

/**
 * Created by 860617010 on 2017/11/7.
 */

public class FragmentOne extends Fragment {

    private static final String TAG = "Fragment";
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i(TAG, "onAttach: " + getClass().getSimpleName());
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate: " + getClass().getSimpleName());
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        TextView tv = new TextView(getContext());
        tv.setText(getClass().getSimpleName());
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(20);
        tv.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        Log.i(TAG, "onCreateView: " + getClass().getSimpleName());
        return tv;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i(TAG, "onActivityCreated: " + getClass().getSimpleName());
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: " + getClass().getSimpleName());
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: " + getClass().getSimpleName());
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: " + getClass().getSimpleName());
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: " + getClass().getSimpleName());
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i(TAG, "onDestroyView: " + getClass().getSimpleName());
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: " + getClass().getSimpleName());
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i(TAG, "onDetach: " + getClass().getSimpleName());
    }
}
