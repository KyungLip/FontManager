package com.liupeng.fontsetmanager;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.app.Activity;

/**
 * 字体设置： 字体设置一般有两种方式,两种方式也都很简单:1.就是自定义控件(代码已经给出例子MyTextView)。 2.就是遍历,然后依次设置字体
 * 
 * @author LiuPeng
 * 
 */

public class MainActivity extends Activity implements OnClickListener {
	private int type = 1;
	private LinearLayout lll_container;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		lll_container = (LinearLayout) findViewById(R.id.ll_container);
		FontManager.changeFont(FontManager.LIGHT, lll_container, this);
		Button btn_setfont = (Button) findViewById(R.id.btn_setfont);
		btn_setfont.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		type++;
		int temp = type % 3;
		if (0 == temp) {
			temp = 3;
		}
		setFont(temp);
	}

	/**
	 * 设置字体
	 */
	private void setFont(int type) {
		switch (type) {
		case 1:
			FontManager.changeFont(FontManager.LIGHT, lll_container, MainActivity.this);

			break;

		case 2:
			FontManager.changeFont(FontManager.Medium, lll_container, MainActivity.this);

			break;
		case 3:
			FontManager.changeFont(FontManager.Regular, lll_container, MainActivity.this);

			break;
		default:
			break;
		}
	}
}
