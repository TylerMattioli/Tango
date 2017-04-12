package com.projecttango.examples.java.helloareadescription;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.ViewGroup;
import android.view.SurfaceView;

/**
 * Created by Tyler on 4/10/2017.
 */

public class Preview extends ViewGroup implements SurfaceHolder.Callback{
    SurfaceView liveFeed;
    SurfaceHolder mHolder;

    Preview(Context context){
        super(context);

        liveFeed = new SurfaceView(context);
        addView(liveFeed);

        mHolder = liveFeed.getHolder();
        mHolder.addCallback(this);
        mHolder.setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS);
    }

    @Override
    protected void onLayout(boolean b, int i, int i1, int i2, int i3) {

    }

    @Override
    public void surfaceCreated(SurfaceHolder surfaceHolder) {

    }

    @Override
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {

    }
}
