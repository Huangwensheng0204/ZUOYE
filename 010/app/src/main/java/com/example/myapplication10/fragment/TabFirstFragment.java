package com.example.myapplication10.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication10.R;
import com.example.myapplication10.adapter.RecyclerGridAdapter;
import com.example.myapplication10.bean.GoodsInfo;
import com.example.myapplication10.constant.ImageList;
import com.example.myapplication10.util.Utils;
import com.example.myapplication10.widget.BannerPager;
import com.example.myapplication10.widget.SpacesItemDecoration;

public class TabFirstFragment extends Fragment implements BannerPager.BannerClickListener{
    private static final String TAG = "TabFirstFragment";
    protected View mView; // 声明一个视图对象
    protected Context mContext; // 声明一个上下文对象

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mContext = getActivity(); // 获取活动页面的上下文
        // 根据布局文件fragment_tab_first.xml生成视图对象
        mView = inflater.inflate(R.layout.fragment_tab_first, container, false);
        // 从布局文件中获取名叫banner_pager的横幅轮播条
//        initRecyclerGrid(); // 初始化网格布局的循环视图


        BannerPager banner = mView.findViewById(R.id.banner_pager);
        // 获取横幅轮播条的布局参数
        ViewGroup.LayoutParams params = (ViewGroup.LayoutParams) banner.getLayoutParams();
        params.height = (int) (Utils.getScreenWidth(mContext) * 250f / 640f);
        // 设置横幅轮播条的布局参数
        banner.setLayoutParams(params);
        // 设置横幅轮播条的广告图片队列
        banner.setImage(ImageList.getDefault());
        // 设置横幅轮播条的广告点击监听器
        banner.setOnBannerListener(this);
        // 开始广告图片的轮播滚动
        banner.start();
        return mView;
    }
    public void onBannerClick(int position) {
        String desc=String.format("点击了第%d张图片",position+1);
        Toast.makeText(mContext,desc,Toast.LENGTH_SHORT).show();
    }


//    // 初始化网格布局的循环视图
//    private void initRecyclerGrid() {
//        // 从布局文件中获取名叫rv_grid的循环视图
//        RecyclerView rv_grid =  mView.findViewById(R.id.rv_grid);
//        // 创建一个垂直方向的网格布局管理器
//        GridLayoutManager manager = new GridLayoutManager(mContext, 5);
//        // 设置循环视图的布局管理器
//        rv_grid.setLayoutManager(manager);
//        // 构建一个市场列表的网格适配器
//        RecyclerGridAdapter adapter = new RecyclerGridAdapter(mContext, GoodsInfo.getDefaultGrid());
//        // 设置网格列表的点击监听器
//        adapter.setOnItemClickListener(adapter);
//        // 设置网格列表的长按监听器
//        adapter.setOnItemLongClickListener(adapter);
//        // 给rv_grid设置市场网格适配器
//        rv_grid.setAdapter(adapter);
//        // 设置rv_grid的默认动画效果
//        rv_grid.setItemAnimator(new DefaultItemAnimator());
//        // 给rv_grid添加列表项之间的空白装饰
//        rv_grid.addItemDecoration(new SpacesItemDecoration(1));
//    }
}
