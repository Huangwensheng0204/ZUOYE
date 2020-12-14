package com.example.a20201108.bean;

import com.example.a20201108.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "iPhone12", "华为 p40", "小米 k30", "OPPO Reno4", "vivo X50", "魅族 17Pro","三星 s20","一加 8T"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "Apple iPhone 12 256GB 黑色 全网通5G手机",
            "华为 HUAWEI P40  8GB+256GB 全网通（零度白）",
            "小米 k30 全网通版 6GB+128GB 月慕白",
            "OPPO Reno4 8GB+256GB 全网通5G智能手机 梦境黑",
            "vivo X50 8GB+128GB 全网通5G拍照手机 液氧",
            "魅族 17pro 8GB+128GB 全网通公开版 月白天青 移动联通电信5G手机",
            "三星 s20 128GB 全网通 粉色",
            "一加 8T 8GB+128GB 全网通 青域",
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {6299, 4488, 2369, 3299, 3498, 4299,5399,3479};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.iphone_s, R.drawable.huawei_s, R.drawable.xiaomi_s,
            R.drawable.oppo_s, R.drawable.vivo_s, R.drawable.meizu_s,
            R.drawable.samsung_s, R.drawable.yijia_s
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.iphone, R.drawable.huawei, R.drawable.xiaomi,
            R.drawable.oppo, R.drawable.vivo, R.drawable.meizu,
            R.drawable.samsung, R.drawable.yijia
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
