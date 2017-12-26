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

public class ThirdFragment extends Fragment {

    private EditText edtThirdFragment;
    private Button btnThird;

    public static Fragment newInstance() {
        ThirdFragment thirdFragment = new ThirdFragment();
        return thirdFragment;
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        View view = inflater.inflate(R.layout.fragment_third, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        init();
    }

    private void init() {
        edtThirdFragment = (EditText) getView().findViewById(R.id.edtThirdFragment);
        btnThird = (Button) getView().findViewById(R.id.btnThird);
        btnThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EventBus.getDefault().post(new MessageEvent(edtThirdFragment.getText().toString()));
            }
        });
    }
}
