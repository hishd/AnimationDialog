package com.hishd.animdialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class AnimDialog extends Dialog {

    ImageView img;
    LottieAnimationView lotteView;
    TextView txtTitle;
    TextView txtContent;
    Button btn1, btn2;

    public AnimDialog(Context context) {
        super(context);
    }

    public AnimDialog setImage(Drawable drawable) {
        if (img != null) {
            img.setImageDrawable(drawable);
        }
        return this;
    }

    public AnimDialog setAnimation(String animation) {
        if (lotteView != null)
            lotteView.setAnimation(animation);
        return this;
    }

    public AnimDialog setTitle(String title) {
        if (txtTitle != null)
            txtTitle.setText(title);
        return this;
    }

    public AnimDialog setContent(String content) {
        if (txtContent != null)
            txtContent.setText(content);
        return this;
    }

    public AnimDialog setButton1(String buttonText, int textColor, final AnimOnClickListener animOnClickListener) {
        if (btn1 != null) {
            btn1.setText(buttonText);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    animOnClickListener.onClicked(AnimDialog.this);
                }
            });

            if (textColor != 0)
                btn1.setTextColor(textColor);
        }
        return this;
    }

    public AnimDialog setButton2(String buttonText, int textColor, final AnimOnClickListener animOnClickListener) {
        if (btn2 != null) {
            btn2.setText(buttonText);
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    animOnClickListener.onClicked(AnimDialog.this);
                }
            });

            if (textColor != 0)
                btn1.setTextColor(textColor);
        }
        return this;
    }

    public AnimDialog createAnimatedSingleDialog() {
        setContentView(R.layout.layout_animated_single);
        lotteView = findViewById(R.id.lotteView);
        lotteView.setAnimation("");
        txtTitle = findViewById(R.id.txtTitle);
        txtContent = findViewById(R.id.txtContent);
        btn1 = findViewById(R.id.btn1);
        return this;
    }

    public AnimDialog createAnimatedDualDialog() {
        setContentView(R.layout.layout_animated_dual);
        getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        lotteView = findViewById(R.id.lotteView);
        txtTitle = findViewById(R.id.txtTitle);
        txtContent = findViewById(R.id.txtContent);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        return this;
    }

    public AnimDialog createNonAnimatedSingleDialog() {
        setContentView(R.layout.layout_non_animated_single);
        img = findViewById(R.id.img);
        txtTitle = findViewById(R.id.txtTitle);
        txtContent = findViewById(R.id.txtContent);
        btn1 = findViewById(R.id.btn1);
        return this;
    }

    public AnimDialog createNonAnimatedDualDialog() {
        setContentView(R.layout.layout_non_animated_dual);
        img = findViewById(R.id.img);
        txtTitle = findViewById(R.id.txtTitle);
        txtContent = findViewById(R.id.txtContent);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        return this;
    }


    public interface AnimOnClickListener{
        void onClicked(Dialog dialog);
    }
}
