package com.hishd.animdialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class AnimDialog extends Dialog {

    ImageView img;
    LottieAnimationView lotteView;
    TextView txtTitle;
    TextView txtContent;
    Button btn1, btn2;
    RelativeLayout rootLayout;
    Context context;

    @Override
    public void onBackPressed() {
    }

    public AnimDialog(Context context) {
        super(context);
        this.context = context;
        this.setCanceledOnTouchOutside(false);
    }

    public AnimDialog setBackgroundColor(int color) {
        Drawable background = rootLayout.getBackground();
        if (background instanceof ShapeDrawable) {
            ((ShapeDrawable) background).getPaint().setColor(context.getColor(color));
        } else if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(context.getColor(color));
        } else if (background instanceof ColorDrawable) {
            ((ColorDrawable) background).setColor(context.getColor(color));
        }
        return this;
    }

    public AnimDialog setButton1BackgroundColor(int color) {

        if (btn1 == null)
            return this;

        Drawable btn1Background = btn1.getBackground();
        if (btn1Background instanceof ShapeDrawable) {
            ((ShapeDrawable) btn1Background).getPaint().setColor(context.getColor(color));
        } else if (btn1Background instanceof GradientDrawable) {
            ((GradientDrawable) btn1Background).setColor(context.getColor(color));
        } else if (btn1Background instanceof ColorDrawable) {
            ((ColorDrawable) btn1Background).setColor(context.getColor(color));
        }
        return this;
    }

    public AnimDialog setButton2BackgroundColor(int color) {

        if (btn2 == null)
            return this;

        Drawable btn2Background = btn2.getBackground();
        if (btn2Background instanceof ShapeDrawable) {
            ((ShapeDrawable) btn2Background).getPaint().setColor(context.getColor(color));
        } else if (btn2Background instanceof GradientDrawable) {
            ((GradientDrawable) btn2Background).setColor(context.getColor(color));
        } else if (btn2Background instanceof ColorDrawable) {
            ((ColorDrawable) btn2Background).setColor(context.getColor(color));
        }
        return this;
    }

    public AnimDialog setTextGravity(int gravity) {
        txtContent.setGravity(gravity);
        return this;
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

    public AnimDialog setTitleColor(int color) {
        if (txtTitle != null)
            txtTitle.setTextColor(context.getColor(color));
        return this;
    }

    public AnimDialog setContent(String content) {
        if (txtContent != null)
            txtContent.setText(content);
        return this;
    }

    public AnimDialog setContentColor(int color) {
        if (txtContent != null)
            txtContent.setTextColor(context.getColor(color));
        return this;
    }

    public AnimDialog setButton1(String buttonText, int textColor, boolean allCaps, final AnimOnClickListener animOnClickListener) {
        if (btn1 != null) {
            btn1.setText(buttonText);
            btn1.setAllCaps(allCaps);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    animOnClickListener.onClicked(AnimDialog.this);
                }
            });

            if (textColor != 0)
                btn1.setTextColor(context.getColor(textColor));
        }
        return this;
    }

    public AnimDialog setButton2(String buttonText, int textColor, boolean allCaps, final AnimOnClickListener animOnClickListener) {
        if (btn2 != null) {
            btn2.setText(buttonText);
            btn2.setAllCaps(allCaps);
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    animOnClickListener.onClicked(AnimDialog.this);
                }
            });

            if (textColor != 0)
                btn2.setTextColor(context.getColor(textColor));
        }
        return this;
    }

    public AnimDialog createAnimatedSingleDialog() {
        setContentView(R.layout.layout_animated_single);
        getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        lotteView = findViewById(R.id.lotteView);
        lotteView.setAnimation("information.json");
        rootLayout = findViewById(R.id.rootLayout);
        txtTitle = findViewById(R.id.txtTitle);
        txtContent = findViewById(R.id.txtContent);
        btn1 = findViewById(R.id.btn1);
        return this;
    }

    public AnimDialog createAnimatedDualDialog() {
        setContentView(R.layout.layout_animated_dual);
        getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        lotteView = findViewById(R.id.lotteView);
        rootLayout = findViewById(R.id.rootLayout);
        txtTitle = findViewById(R.id.txtTitle);
        txtContent = findViewById(R.id.txtContent);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        return this;
    }

    public AnimDialog createNonAnimatedSingleDialog() {
        setContentView(R.layout.layout_non_animated_single);
        getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        rootLayout = findViewById(R.id.rootLayout);
        img = findViewById(R.id.img);
        txtTitle = findViewById(R.id.txtTitle);
        txtContent = findViewById(R.id.txtContent);
        btn1 = findViewById(R.id.btn1);
        return this;
    }

    public AnimDialog createNonAnimatedDualDialog() {
        setContentView(R.layout.layout_non_animated_dual);
        getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        rootLayout = findViewById(R.id.rootLayout);
        img = findViewById(R.id.img);
        txtTitle = findViewById(R.id.txtTitle);
        txtContent = findViewById(R.id.txtContent);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        return this;
    }


    public interface AnimOnClickListener {
        void onClicked(Dialog dialog);
    }
}
