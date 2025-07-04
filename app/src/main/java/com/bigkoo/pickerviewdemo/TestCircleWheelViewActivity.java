package com.bigkoo.pickerviewdemo;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bigkoo.pickerview.adapter.ArrayWheelAdapter;
import com.contrarywind.listener.OnItemSelectedListener;
import com.contrarywind.view.WheelView;

import java.util.ArrayList;
import java.util.List;

/**
 * desc:
 * author: Created by xx on 2025-04-2
 */
public class TestCircleWheelViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_circle_wheelview);

        WheelView wheelView = findViewById(R.id.wheelview);
//        wheelView.setTextSize(20);
        wheelView.setLineSpacingMultiplier(1.3f);
         wheelView.setDividerWidth(6);
         wheelView.setItemsVisibleCount(3);
         wheelView.setDividerLength(200);
//         wheelView.setTextOutSize(10);
        wheelView.setDividerType(WheelView.DividerType.FILL);

        final List<String> mOptionsItems = new ArrayList<>();
        mOptionsItems.add("10");
        mOptionsItems.add("20");
        mOptionsItems.add("30");
        mOptionsItems.add("40");
        mOptionsItems.add("50");
        mOptionsItems.add("60");
        mOptionsItems.add("70");

        wheelView.setAdapter(new ArrayWheelAdapter(mOptionsItems));
        wheelView.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(int index) {
                Toast.makeText(TestCircleWheelViewActivity.this, "" + mOptionsItems.get(index), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
