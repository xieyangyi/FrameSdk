package com.example.xieyangyi.framesdk.imageloader;

import android.net.Uri;
import android.support.annotation.ColorInt;
import android.widget.ImageView;

import com.example.xieyangyi.framesdk.R;

import java.io.File;

/**
 * Created by xieyangyi on 16/7/30.
 */
public class ImageRequestParams {

    //imagerequest type
    public static final int GET_BITMAP = Integer.MAX_VALUE;
    public static final int GET_GIF = Integer.MAX_VALUE - 1;
    //PRIORITY
    public static final int IMMEDIATE_PRIORITY = 0;
    public static final int HIGH_PRIORITY = 1;
    public static final int NORMAL_PRIORITY = 2;
    public static final int LOW_PRIORITY = 3;
    public static final int SCALE_TYPE_NORMAL = Integer.MIN_VALUE;
    public static final int SCALE_TYPE_FIT_CENTER = Integer.MIN_VALUE + 1;
    public static final int SCALE_TYPE_CENTER_CROP = Integer.MIN_VALUE + 2;
    //not edit
    public static final int MICRO_SIZE = 1;
    public static final int SMALL_SIZE = 2;
    public static final int MIDDLE_SIZE = 3;
    public static final int BIG_SIZE = 4;
    public static final int LARGE_SIZE = 5;
    public static final int LARGER_SIZE = 6;
    public static final int FIT_LARGE_SIZE = 7;
    public static final int FIT_LARGER_SIZE = 8;
    //placeholder, need to set by customer
//    public static final int PLACEHOLDER_MICRO = R.drawable.img_loading_xsmall;
//    public static final int PLACEHOLDER_SMALL = R.drawable.img_loading_small;
//    public static final int PLACEHOLDER_MIDDLE = R.drawable.img_loading_middle;
//    public static final int PLACEHOLDER_LARGE = R.drawable.img_loading_large;
    public static final int PLACEHOLDER_MICRO = R.mipmap.ic_launcher;
    public static final int PLACEHOLDER_SMALL = R.mipmap.ic_launcher;
    public static final int PLACEHOLDER_MIDDLE = R.mipmap.ic_launcher;
    public static final int PLACEHOLDER_LARGE = R.mipmap.ic_launcher;

    public static final int LOAD_IMG_URL = 0;
    public static final int LOAD_IMG_FILE = 1;
    public static final int LOAD_IMG_RES = 2;
    public static final int LOAD_IMG_URI = 3;

    public int imageType = Integer.MIN_VALUE;
    public int loadType = Integer.MIN_VALUE;

    public String url;
    public String imagesize = null;
    public int resourceId = Integer.MIN_VALUE;
    public File file;
    public Uri uri;

    public int width = Integer.MIN_VALUE;
    public int height = Integer.MIN_VALUE;

    public int requestType = GET_BITMAP;

    public int placeholder = PLACEHOLDER_MICRO;
    public int error = Integer.MIN_VALUE;

    public boolean skipMemoryCache = false;

    public @ColorInt int background = Integer.MIN_VALUE;

    public int priority = NORMAL_PRIORITY;

    public int scaleType = SCALE_TYPE_NORMAL;

    public boolean placeholderScaleTypeAsView = false;

    public boolean optimizeNetwork = false;

    public ImageLoaderListener loaderListener;

    public ImageView imageView;


}
