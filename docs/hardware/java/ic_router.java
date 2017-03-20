package com.github.megatronking.svg.iconlibs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

import com.github.megatronking.svg.support.SVGRenderer;

/**
 * AUTO-GENERATED FILE.  DO NOT MODIFY.
 * 
 * This class was automatically generated by the
 * SVG-Generator. It should not be modified by hand.
 */
public class ic_router extends SVGRenderer {

    public ic_router(Context context) {
        super(context);
        mAlpha = 1.0f;
        mWidth = dip2px(24.0f);
        mHeight = dip2px(24.0f);
    }

    @Override
    public void render(Canvas canvas, int w, int h, ColorFilter filter) {
        final float scaleX = w / 24.0f;
        final float scaleY = h / 24.0f;
        
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(20.2f, 5.9f);
        mPath.rLineTo(0.8f, -0.8f);
        mPath.cubicTo(19.6f, 3.7f, 17.8f, 3.0f, 16.0f, 3.0f);
        mPath.rCubicTo(-1.7999992f, 0.0f, -3.6f, 0.7f, -5.0f, 2.1f);
        mPath.rLineTo(0.8f, 0.8f);
        mPath.cubicTo(13.0f, 4.8f, 14.5f, 4.2f, 16.0f, 4.2f);
        mPath.rCubicTo(1.5f, 0.0f, 3.0f, 0.6f, 4.2f, 1.7f);
        mPath.close();
        mPath.moveTo(20.2f, 5.9f);
        mPath.rMoveTo(-0.9f, 0.8f);
        mPath.rCubicTo(-0.9f, -0.9f, -2.1f, -1.4f, -3.3f, -1.4f);
        mPath.rCubicTo(-1.1999989f, 0.0f, -2.4f, 0.5f, -3.3f, 1.4f);
        mPath.rLineTo(0.8f, 0.8f);
        mPath.rCubicTo(0.7f, -0.7f, 1.6f, -1.0f, 2.5f, -1.0f);
        mPath.rCubicTo(0.9f, 0.0f, 1.8f, 0.3f, 2.5f, 1.0f);
        mPath.rLineTo(0.8f, -0.8f);
        mPath.close();
        mPath.moveTo(19.300001f, 6.7000003f);
        mPath.moveTo(19.0f, 13.0f);
        mPath.rLineTo(-2.0f, 0f);
        mPath.lineTo(17.0f, 9.0f);
        mPath.rLineTo(-2.0f, 0f);
        mPath.rLineTo(0f, 4.0f);
        mPath.lineTo(5.0f, 13.0f);
        mPath.rCubicTo(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        mPath.rLineTo(0f, 4.0f);
        mPath.rCubicTo(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        mPath.rLineTo(14.0f, 0f);
        mPath.rCubicTo(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        mPath.rLineTo(0f, -4.0f);
        mPath.rCubicTo(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        mPath.close();
        mPath.moveTo(19.0f, 13.0f);
        mPath.moveTo(8.0f, 18.0f);
        mPath.lineTo(6.0f, 18.0f);
        mPath.rLineTo(0f, -2.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.close();
        mPath.moveTo(8.0f, 18.0f);
        mPath.rMoveTo(3.5f, 0.0f);
        mPath.rLineTo(-2.0f, 0f);
        mPath.rLineTo(0f, -2.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.close();
        mPath.moveTo(11.5f, 18.0f);
        mPath.rMoveTo(3.5f, 0.0f);
        mPath.rLineTo(-2.0f, 0f);
        mPath.rLineTo(0f, -2.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.close();
        mPath.moveTo(15.0f, 18.0f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}