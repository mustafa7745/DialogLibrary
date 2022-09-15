package com.example.dialoglibs;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.bumptech.glide.Glide;


public class DialogInput extends Dialog {
    private static final String WHITE ="#FFFFFF" ;
    private static final String PURPLE ="#8A56AC" ;
    private static final String LIGHT_PURPLE ="#D47FA6" ;
    private static final String GREY_PURPLE ="#998FA2" ;
    private static final String DARK_PURPLE ="#241332" ;
    private Context context;

    private TextView title;

    private TextView subtitle;

    private TextView first_button;

    private TextView second_button;

    private TextView third_button;

    private EditText first_edit_text;

    private EditText second_edit_text;

    private EditText third_edit_text;

    private EditText large_edit_text;

    private ImageView icon;

    private ScrollView scrollView;

    public DialogInput(Context context) {
        super(context);
        this.context = context;
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.custom_dialog);
        title=findViewById(R.id.title);
        subtitle=findViewById(R.id.subtitle);
        first_button=findViewById(R.id.first_button);
        second_button=findViewById(R.id.second_button);
        third_button=findViewById(R.id.third_button);
        first_edit_text=findViewById(R.id.first_edit_text);
        second_edit_text=findViewById(R.id.second_edit_text);
        third_edit_text=findViewById(R.id.third_edit_text);
        large_edit_text=findViewById(R.id.large_edit_text);
        icon=findViewById(R.id.icon);
        scrollView=findViewById(R.id.main_scrollview);
        this.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        initDefaultCase();
        this.setCancelable(false);
    }

    private void initDefaultCase() {
        setLargeTextFieldBorderColor(Color.parseColor(WHITE));
        setFirstTextFieldBorderColor(Color.parseColor(WHITE));
        setSecondTextFieldBorderColor(Color.parseColor(WHITE));
        setTitleColor(Color.parseColor(WHITE));
        setSubtitleColor(Color.parseColor(WHITE));
        setFirstButtonColor(Color.parseColor(PURPLE));
        setSecondButtonColor(Color.parseColor(LIGHT_PURPLE));
        setThirdButtonColor(Color.parseColor(GREY_PURPLE));
        setBackgroundColor(Color.parseColor(DARK_PURPLE));
        first_edit_text.setVisibility(View.GONE);
        second_edit_text.setVisibility(View.GONE);
        third_edit_text.setVisibility(View.GONE);
        large_edit_text.setVisibility(View.GONE);
        third_button.setVisibility(View.GONE);
        first_button.setVisibility(View.GONE);
        second_button.setVisibility(View.GONE);
        title.setVisibility(View.GONE);
        subtitle.setVisibility(View.GONE);

    }

    public DialogInput isCancelable(boolean cancelable){
        this.setCancelable(cancelable);
        return this;
    }

    public DialogInput setIcon(int image){
        icon.setVisibility(View.VISIBLE);
        icon.setImageResource(image);
        return this;
    }

    public DialogInput setIconString(String image){
        icon.setVisibility(View.VISIBLE);
        Glide.with(context).load(image).into(icon);
        return this;
    }

    public DialogInput isEnabledFirstTextField(boolean bool){
        first_edit_text.setEnabled(bool);
        return this;
    }
    public DialogInput isEnabledSecondTextField(boolean bool){
        second_edit_text.setEnabled(bool);
        return this;
    }
    public DialogInput isEnabledThirdTextField(boolean bool){
        third_edit_text.setEnabled(bool);
        return this;
    }

    public DialogInput setTitle(String titleText) {
        title.setVisibility(View.VISIBLE);
        title.setText(titleText);
        return this;
    }
    public DialogInput setTitleColor(int color) {
        title.setVisibility(View.VISIBLE);
        title.setTextColor(color);
        return this;
    }


    public DialogInput setSubtitle(String subtitleText) {
        subtitle.setVisibility(View.VISIBLE);
        subtitle.setText(subtitleText);
        return this;
    }

    public DialogInput setSubtitleColor(int color) {
        subtitle.setVisibility(View.VISIBLE);
        subtitle.setTextColor(color);
        return this;
    }
    public String getFirstTextField() {
        return first_edit_text.getText().toString();
    }

    public DialogInput withFirstTextField(boolean hasEditText){
        if (hasEditText) {
            first_edit_text.setVisibility(View.VISIBLE);
        } else {
            first_edit_text.setVisibility(View.GONE);
        }
        return this;
    }

    public String getLargeTextField() {
        return large_edit_text.getText().toString();
    }

    public DialogInput withLargeText(boolean hasEditText){
        if (hasEditText) {
            large_edit_text.setVisibility(View.VISIBLE);
        } else {
            large_edit_text.setVisibility(View.GONE);
        }
        return this;
    }

    public String getSecondTextField() {
        return second_edit_text.getText().toString();
    }

    public DialogInput withSecondTextField(boolean hasEditText){
        if (hasEditText) {
            second_edit_text.setVisibility(View.VISIBLE);
        } else {
            second_edit_text.setVisibility(View.GONE);
        }
        return this;
    }

    public DialogInput setFirstTextField(String firstText) {
        first_edit_text.setVisibility(View.VISIBLE);
        first_edit_text.setText(firstText);
        return this;
    }
    public DialogInput setThirdTextField(String firstText) {
        third_edit_text.setVisibility(View.VISIBLE);
        third_edit_text.setText(firstText);
        return this;
    }

    public DialogInput setSecondTextField(String secondText) {
        second_edit_text.setVisibility(View.VISIBLE);
        second_edit_text.setText(secondText);
        return this;
    }

    public DialogInput setLargeTextField(String secondText) {
        large_edit_text.setVisibility(View.VISIBLE);
        large_edit_text.setText(secondText);
        return this;
    }

    public DialogInput setFirstTextFieldHint(String firstText) {
        first_edit_text.setVisibility(View.VISIBLE);
        first_edit_text.setHint(firstText);
        return this;
    }

    public DialogInput setSecondTextFieldHint(String secondText) {
        second_edit_text.setVisibility(View.VISIBLE);
        second_edit_text.setHint(secondText);
        return this;
    }

    public DialogInput setLargeTextFieldHint(String secondText) {
        large_edit_text.setVisibility(View.VISIBLE);
        large_edit_text.setHint(secondText);
        return this;
    }


    public DialogInput setFirstTextFieldTextColor(int color) {
        first_edit_text.setVisibility(View.VISIBLE);
        first_edit_text.setTextColor(color);
        return this;
    }

    public DialogInput setSecondTextFieldTextColor(int color) {
        second_edit_text.setVisibility(View.VISIBLE);
        second_edit_text.setTextColor(color);
        return this;
    }

    public DialogInput setLargeTextFieldTextColor(int color) {
        large_edit_text.setVisibility(View.VISIBLE);
        large_edit_text.setTextColor(color);
        return this;
    }
    public DialogInput setFirstTextFieldBorderColor(int color) {
        first_edit_text.setVisibility(View.VISIBLE);
        GradientDrawable drawable = (GradientDrawable)first_edit_text.getBackground();
        drawable.setStroke(5, color);
        return this;
    }

    public DialogInput setSecondTextFieldBorderColor(int color) {
        second_edit_text.setVisibility(View.VISIBLE);
        GradientDrawable drawable = (GradientDrawable)second_edit_text.getBackground();
        drawable.setStroke(5, color);
        return this;
    }

    public DialogInput setLargeTextFieldBorderColor(int color) {
        large_edit_text.setVisibility(View.VISIBLE);
        GradientDrawable drawable = (GradientDrawable)large_edit_text.getBackground();
        drawable.setStroke(5, color);
        return this;
    }

    public DialogInput setFirstTextFieldHintColor(int color) {
        first_edit_text.setVisibility(View.VISIBLE);
        first_edit_text.setHintTextColor(color);
        return this;
    }

    public DialogInput setSecondTextFieldHintColor(int color) {
        second_edit_text.setVisibility(View.VISIBLE);
        second_edit_text.setHintTextColor(color);
        return this;
    }

    public DialogInput setLargeTextFieldHintColor(int color) {
        large_edit_text.setVisibility(View.VISIBLE);
        large_edit_text.setHintTextColor(color);
        return this;
    }


    public DialogInput setFirstTextFieldInputType(int type, boolean passwordToggle) {
        first_edit_text.setVisibility(View.VISIBLE);
        if (passwordToggle)
            first_edit_text.setTransformationMethod(PasswordTransformationMethod.getInstance());
        else
            first_edit_text.setInputType(type);
        return this;
    }
    public DialogInput setSecondTextFieldInputType(int type, boolean passwordToggle) {
        second_edit_text.setVisibility(View.VISIBLE);
        if (passwordToggle)
            second_edit_text.setTransformationMethod(PasswordTransformationMethod.getInstance());
        else
            second_edit_text.setInputType(type);
        return this;
    }

    public DialogInput setLargeTextFieldInputType(int type, boolean passwordToggle) {
        large_edit_text.setVisibility(View.VISIBLE);
        if (passwordToggle)
            large_edit_text.setTransformationMethod(PasswordTransformationMethod.getInstance());
        else
            large_edit_text.setInputType(type);
        return this;
    }

    public DialogInput setFirstButtonColor(int color) {
        first_button.setVisibility(View.VISIBLE);
        Drawable background = first_button.getBackground();
        changingBackgroundColor(background, color);
        return this;
    }


    public DialogInput setSecondButtonColor(int color) {
        second_button.setVisibility(View.VISIBLE);
        Drawable background = second_button.getBackground();
        changingBackgroundColor(background, color);
        return this;
    }
    public DialogInput setThirdButtonColor(int color) {
        third_button.setVisibility(View.VISIBLE);
        Drawable background = third_button.getBackground();
        changingBackgroundColor(background,color);
        return this;
    }

    public DialogInput setFirstButtonTextColor(int color) {
        first_button.setVisibility(View.VISIBLE);
        first_button.setTextColor(color);
        return this;
    }


    public DialogInput setSecondButtonTextColor(int color) {
        second_button.setVisibility(View.VISIBLE);
        second_button.setTextColor(color);
        return this;
    }
    public DialogInput setThirdButtonTextColor(int color) {
        third_button.setVisibility(View.VISIBLE);
        third_button.setTextColor(color);
        return this;
    }

    public DialogInput setFirstButtonText(String text) {
        first_button.setVisibility(View.VISIBLE);
        first_button.setText(text);
        return this;
    }


    public DialogInput setSecondButtonText(String text) {
        second_button.setVisibility(View.VISIBLE);
        second_button.setText(text);
        return this;
    }
    public DialogInput setThirdButtonText(String text) {
        third_button.setVisibility(View.VISIBLE);
        third_button.setText(text);
        return this;
    }

    public DialogInput setBackgroundColor(int color) {
        Drawable background = scrollView.getBackground();
        changingBackgroundColor(background,color);
        return this;
    }


    public DialogInput withFirstButtonListner(View.OnClickListener confirmListner){
        first_button.setVisibility(View.VISIBLE);
        first_button.setOnClickListener(confirmListner);
        return this;
    }

    public DialogInput withSecondButtonListner(View.OnClickListener cancelListner){
        second_button.setVisibility(View.VISIBLE);
        second_button.setOnClickListener(cancelListner);
        return this;
    }

    public DialogInput withThirdButtonListner(View.OnClickListener cancelListner){
        third_button.setVisibility(View.VISIBLE);
        third_button.setOnClickListener(cancelListner);
        return this;
    }

    private void changingBackgroundColor(Drawable background, int color) {
        if (background instanceof ShapeDrawable) {
            // cast to 'ShapeDrawable'
            ShapeDrawable shapeDrawable = (ShapeDrawable) background;
            shapeDrawable.getPaint().setColor(color);
        } else if (background instanceof GradientDrawable) {
            // cast to 'GradientDrawable'
            GradientDrawable gradientDrawable = (GradientDrawable) background;
            gradientDrawable.setColor(color);
        } else if (background instanceof ColorDrawable) {
            // alpha value may need to be set again after this call
            ColorDrawable colorDrawable = (ColorDrawable) background;
            colorDrawable.setColor(color);
        }
    }
}
