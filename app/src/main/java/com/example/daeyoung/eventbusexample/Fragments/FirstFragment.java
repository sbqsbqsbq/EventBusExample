package com.example.daeyoung.eventbusexample.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
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

public class FirstFragment extends Fragment {

    private EditText edtFirstFragment;
    private Button btnFirst;

    public static Fragment newInstance() {
        FirstFragment firstFragment = new FirstFragment();
        return firstFragment;
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        init();
    }

    private void init() {
        edtFirstFragment = (EditText) getView().findViewById(R.id.edtFirstFragment);
        btnFirst = (Button) getView().findViewById(R.id.btnFisrt);
        btnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EventBus.getDefault().post(new MessageEvent(edtFirstFragment.getText().toString()));
            }
        });
    }
}
