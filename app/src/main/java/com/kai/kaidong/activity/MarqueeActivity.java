package com.kai.kaidong.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

import com.kai.kaidong.R;
import com.kai.kaidong.base.BaseActivity;
import com.superluo.textbannerlibrary.ITextBannerItemClickListener;
import com.superluo.textbannerlibrary.TextBannerView;

import java.util.ArrayList;
import java.util.List;
//引用第三方textbannerlibrary
public class MarqueeActivity extends BaseActivity {

    private TextBannerView mTvBanner;
    private TextBannerView mTvBanner1;
    private TextBannerView mTvBanner2;
    private TextBannerView mTvBanner3;
    private TextBannerView mTvBanner4;
    private List<String> mList;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected void init() {
        mTvBanner =  findViewById(R.id.tv_banner);
        mTvBanner1 = findViewById(R.id.tv_banner1);
        mTvBanner2 = findViewById(R.id.tv_banner2);
        mTvBanner3 = findViewById(R.id.tv_banner3);
        mTvBanner4 = findViewById(R.id.tv_banner4);

        mList = new ArrayList<>();
        mList.add("学好Java、Android、C#、C、ios、html+css+js");
        mList.add("走遍天下都不怕！！！！！");
        mList.add("不是我吹，就怕你做不到，哈哈");
        mList.add("superluo");
        mList.add("你是最棒的，奔跑吧孩子！");
        /**
         * 设置数据，方式一
         */
        mTvBanner.setDatas(mList);
        mTvBanner.setDatas(mList);
        mTvBanner1.setDatas(mList);
        mTvBanner2.setDatas(mList);
        mTvBanner3.setDatas(mList);

        Drawable drawable = getResources().getDrawable(R.drawable.hottrue);
        /**
         * 设置数据（带图标的数据），方式二
         */
        //第一个参数：数据 。第二参数：drawable.  第三参数drawable尺寸。第四参数图标位置
        mTvBanner4.setDatasWithDrawableIcon(mList,drawable,18, Gravity.LEFT);
        setListener();
    }

    @Override
    protected int findView() {
        return R.layout.activity_marquee;

    }
    private void setListener() {
        mTvBanner.setItemOnClickListener(new ITextBannerItemClickListener() {
            @Override
            public void onItemClick(String data, int position) {
                Toast.makeText(MarqueeActivity.this, String.valueOf(position)+">>"+data, Toast.LENGTH_SHORT).show();
            }
        });

        mTvBanner1.setItemOnClickListener(new ITextBannerItemClickListener() {
            @Override
            public void onItemClick(String data, int position) {
                Toast.makeText(MarqueeActivity.this, String.valueOf(position)+">>"+data, Toast.LENGTH_SHORT).show();
            }
        });

        mTvBanner2.setItemOnClickListener(new ITextBannerItemClickListener() {
            @Override
            public void onItemClick(String data, int position) {
                Toast.makeText(MarqueeActivity.this, String.valueOf(position)+">>"+data, Toast.LENGTH_SHORT).show();
            }
        });

        mTvBanner3.setItemOnClickListener(new ITextBannerItemClickListener() {
            @Override
            public void onItemClick(String data, int position) {
                Toast.makeText(MarqueeActivity.this, String.valueOf(position)+">>"+data, Toast.LENGTH_SHORT).show();
            }
        });

        mTvBanner4.setItemOnClickListener(new ITextBannerItemClickListener() {
            @Override
            public void onItemClick(String data, int position) {
                Toast.makeText(MarqueeActivity.this, String.valueOf(position)+">>"+data, Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    public void onResume() {
        super.onResume();
        /**调用startViewAnimator()重新开始文字轮播*/
        mTvBanner.startViewAnimator();
        mTvBanner1.startViewAnimator();
        mTvBanner2.startViewAnimator();
        mTvBanner3.startViewAnimator();
        mTvBanner4.startViewAnimator();

    }

    @Override
    public void onStop() {
        super.onStop();
        /**调用stopViewAnimator()暂停文字轮播，避免文字重影*/
        mTvBanner.stopViewAnimator();
        mTvBanner1.stopViewAnimator();
        mTvBanner2.stopViewAnimator();
        mTvBanner3.stopViewAnimator();
        mTvBanner4.stopViewAnimator();
    }
}
