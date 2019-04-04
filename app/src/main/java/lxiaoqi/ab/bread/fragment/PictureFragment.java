package lxiaoqi.ab.bread.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import lxiaoqi.ab.bread.R;

public class PictureFragment extends Fragment{
    private static PictureFragment instance=null;

    public static synchronized PictureFragment getInstance(){
        if(instance==null)
            instance=new PictureFragment();
            return instance;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_picture,container,false);



        return rootView;
    }
}
