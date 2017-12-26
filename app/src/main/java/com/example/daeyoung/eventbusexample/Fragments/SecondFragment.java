package com.example.daeyoung.eventbusexample.Fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.daeyoung.eventbusexample.EventBus.MessageEvent;
import com.example.daeyoung.eventbusexample.R;

import org.greenrobot.eventbus.EventBus;

/**
 * Created by daeyoung on 2017. 12. 26..
 */

public class SecondFragment extends Fragment {

    private EditText edtSecondFragment;
    private Button btnSecond;

    public static Fragment newInstance() {
        SecondFragment secondFragment = new SecondFragment();
        return secondFragment;
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        init();
    }

    private void init() {
        edtSecondFragment = (EditText) getView().findViewById(R.id.edtSecondFragment);
        btnSecond = (Button) getView().findViewById(R.id.btnSecond);
        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EventBus.getDefault().post(new MessageEvent(edtSecondFragment.getText().toString()));
            }
        });
    }
}
