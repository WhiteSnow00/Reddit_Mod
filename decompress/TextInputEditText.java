// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.textfield;

import android.widget.TextView;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import java.util.Locale;
import android.os.Build;
import android.graphics.Point;
import android.view.ViewParent;
import android.view.View;
import android.content.res.TypedArray;
import qf.g;
import pj2.u;
import ag.a;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import androidx.appcompat.widget.j;

public class TextInputEditText extends j
{
    public final Rect k;
    public boolean l;
    
    public TextInputEditText(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public TextInputEditText(final Context context, final AttributeSet set, final int n) {
        super(ag.a.a(context, set, 2130968940, 0), set, 2130968940);
        this.k = new Rect();
        final TypedArray d = g.d(context, set, u.S, 2130968940, 2132018075, new int[0]);
        this.setTextInputLayoutFocusedRectEnabled(d.getBoolean(0, false));
        d.recycle();
    }
    
    private CharSequence getHintFromLayout() {
        final TextInputLayout textInputLayout = this.getTextInputLayout();
        CharSequence hint;
        if (textInputLayout != null) {
            hint = textInputLayout.getHint();
        }
        else {
            hint = null;
        }
        return hint;
    }
    
    private TextInputLayout getTextInputLayout() {
        for (ViewParent viewParent = ((View)this).getParent(); viewParent instanceof View; viewParent = viewParent.getParent()) {
            if (viewParent instanceof TextInputLayout) {
                return (TextInputLayout)viewParent;
            }
        }
        return null;
    }
    
    public final void getFocusedRect(final Rect rect) {
        super.getFocusedRect(rect);
        final TextInputLayout textInputLayout = this.getTextInputLayout();
        if (textInputLayout != null && this.l && rect != null) {
            ((View)textInputLayout).getFocusedRect(this.k);
            rect.bottom = this.k.bottom;
        }
    }
    
    public final boolean getGlobalVisibleRect(final Rect rect, final Point point) {
        final boolean globalVisibleRect = super.getGlobalVisibleRect(rect, point);
        final TextInputLayout textInputLayout = this.getTextInputLayout();
        if (textInputLayout != null && this.l && rect != null) {
            ((View)textInputLayout).getGlobalVisibleRect(this.k, point);
            rect.bottom = this.k.bottom;
        }
        return globalVisibleRect;
    }
    
    public CharSequence getHint() {
        final TextInputLayout textInputLayout = this.getTextInputLayout();
        if (textInputLayout != null && textInputLayout.F) {
            return textInputLayout.getHint();
        }
        return super.getHint();
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        final TextInputLayout textInputLayout = this.getTextInputLayout();
        if (textInputLayout != null && textInputLayout.F && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            ((TextView)this).setHint((CharSequence)"");
        }
    }
    
    @Override
    public final InputConnection onCreateInputConnection(final EditorInfo editorInfo) {
        final InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = this.getHintFromLayout();
        }
        return onCreateInputConnection;
    }
    
    public final void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.getTextInputLayout();
    }
    
    public final boolean requestRectangleOnScreen(final Rect rect) {
        final boolean requestRectangleOnScreen = super.requestRectangleOnScreen(rect);
        final TextInputLayout textInputLayout = this.getTextInputLayout();
        if (textInputLayout != null && this.l) {
            this.k.set(0, ((View)textInputLayout).getHeight() - ((View)this).getResources().getDimensionPixelOffset(2131166240), ((View)textInputLayout).getWidth(), ((View)textInputLayout).getHeight());
            ((View)textInputLayout).requestRectangleOnScreen(this.k, true);
        }
        return requestRectangleOnScreen;
    }
    
    public void setTextInputLayoutFocusedRectEnabled(final boolean l) {
        this.l = l;
    }
}
