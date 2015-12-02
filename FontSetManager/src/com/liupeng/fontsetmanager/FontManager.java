package com.liupeng.fontsetmanager;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

/**
 * 设置控件的字体
 * 
 * @author LiuPeng
 * 
 */
public class FontManager {
	public static final int LIGHT = 1;
	public static final int Medium = 2;
	public static final int Regular = 3;

	public static void changeFont(int type, ViewGroup viewRoot, Context context) {
		Typeface typeface = Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Light.ttf");
		switch (type) {
		case 1:
			typeface = Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Light.ttf");
			break;

		case 2:
			typeface = Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Medium.ttf");
			break;
		case 3:
			typeface = Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Regular.ttf");
			break;
		default:
			break;
		}
		for (int x = 0; x < viewRoot.getChildCount(); x++) {
			View childView = viewRoot.getChildAt(x);
			if (childView instanceof Button) {
				((Button) childView).setTypeface(typeface);
			} else if (childView instanceof TextView) {
				((TextView) childView).setTypeface(typeface);
			} else if (childView instanceof EditText) {
				((EditText) childView).setTypeface(typeface);
			} else if (childView instanceof CheckBox) {
				((CheckBox) childView).setTypeface(typeface);
			} else if (childView instanceof RadioButton) {
				((RadioButton) childView).setTypeface(typeface);
			} else if (childView instanceof ViewGroup) {
				changeFont(type, viewRoot, context);
			}
		}
	}
}
