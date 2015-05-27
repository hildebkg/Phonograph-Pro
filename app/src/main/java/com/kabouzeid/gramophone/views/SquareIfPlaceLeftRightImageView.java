package com.kabouzeid.gramophone.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

/**
 * @author Karim Abou Zeid (kabouzeid)
 */
public class SquareIfPlaceLeftRightImageView extends ImageView {

    public SquareIfPlaceLeftRightImageView(Context context) {
        super(context);
    }

    public SquareIfPlaceLeftRightImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SquareIfPlaceLeftRightImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        final int small = Math.min(widthMeasureSpec, heightMeasureSpec);
        final int large = Math.max(widthMeasureSpec, heightMeasureSpec);

        if (View.MeasureSpec.getSize(large) > View.MeasureSpec.getSize(small) * 1.5)
            super.onMeasure(small, small);
        else super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

}
