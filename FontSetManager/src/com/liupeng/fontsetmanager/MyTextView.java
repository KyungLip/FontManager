package com.liupeng.fontsetmanager;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class MyTextView extends TextView {

	public MyTextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
		super(context, attrs, defStyleAttr, defStyleRes);
	}

	public MyTextView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	public MyTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public MyTextView(Context context) {
		super(context);
	}

	@Override
	public void setTypeface(Typeface tf) {
		super.setTypeface(Typeface.createFromAsset(MainApplication.getContext().getAssets(), "fonts/Roboto-Medium.ttf"));
	}

	@Override
	public void setTag(int key, Object tag) {
		super.setTag(key, tag);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
	}
}
