// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import vl.a;
import android.graphics.drawable.Drawable;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import e4.j;
import android.view.ActionMode$Callback;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.AutoCompleteTextView;

public class d extends AutoCompleteTextView
{
    public static final int[] i;
    public final e f;
    public final w g;
    public final k h;
    
    static {
        i = new int[] { 16843126 };
    }
    
    public d(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public d(final Context context, final AttributeSet set, int inputType) {
        v0.a(context);
        super(context, set, 2130968664);
        t0.a(((View)this).getContext(), (View)this);
        final y0 m = y0.m(((View)this).getContext(), set, d.i, 2130968664);
        if (m.l(0)) {
            this.setDropDownBackgroundDrawable(m.e(0));
        }
        m.n();
        (this.f = new e((View)this)).d(set, 2130968664);
        final w g = new w((TextView)this);
        (this.g = g).f(set, 2130968664);
        g.b();
        final k h = new k((EditText)this);
        (this.h = h).b(set, 2130968664);
        final KeyListener keyListener = ((TextView)this).getKeyListener();
        if (keyListener instanceof NumberKeyListener ^ true) {
            final boolean focusable = super.isFocusable();
            final boolean clickable = super.isClickable();
            final boolean longClickable = super.isLongClickable();
            inputType = super.getInputType();
            final KeyListener a = h.a(keyListener);
            if (a != keyListener) {
                super.setKeyListener(a);
                super.setRawInputType(inputType);
                super.setFocusable(focusable);
                super.setClickable(clickable);
                super.setLongClickable(longClickable);
            }
        }
    }
    
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        final e f = this.f;
        if (f != null) {
            f.a();
        }
        final w g = this.g;
        if (g != null) {
            g.b();
        }
    }
    
    public ActionMode$Callback getCustomSelectionActionModeCallback() {
        return j.e(super.getCustomSelectionActionModeCallback());
    }
    
    public ColorStateList getSupportBackgroundTintList() {
        final e f = this.f;
        ColorStateList b;
        if (f != null) {
            b = f.b();
        }
        else {
            b = null;
        }
        return b;
    }
    
    public PorterDuff$Mode getSupportBackgroundTintMode() {
        final e f = this.f;
        PorterDuff$Mode c;
        if (f != null) {
            c = f.c();
        }
        else {
            c = null;
        }
        return c;
    }
    
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.g.d();
    }
    
    public PorterDuff$Mode getSupportCompoundDrawablesTintMode() {
        return this.g.e();
    }
    
    public InputConnection onCreateInputConnection(final EditorInfo editorInfo) {
        final InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        cg.d.w3((View)this, editorInfo, onCreateInputConnection);
        return this.h.c(onCreateInputConnection, editorInfo);
    }
    
    public void setBackgroundDrawable(final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
        final e f = this.f;
        if (f != null) {
            f.e();
        }
    }
    
    public void setBackgroundResource(final int backgroundResource) {
        super.setBackgroundResource(backgroundResource);
        final e f = this.f;
        if (f != null) {
            f.f(backgroundResource);
        }
    }
    
    public final void setCompoundDrawables(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        final w g = this.g;
        if (g != null) {
            g.b();
        }
    }
    
    public final void setCompoundDrawablesRelative(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        final w g = this.g;
        if (g != null) {
            g.b();
        }
    }
    
    public void setCustomSelectionActionModeCallback(final ActionMode$Callback actionMode$Callback) {
        super.setCustomSelectionActionModeCallback(j.f(actionMode$Callback, (TextView)this));
    }
    
    public void setDropDownBackgroundResource(final int n) {
        this.setDropDownBackgroundDrawable(a.U1(((View)this).getContext(), n));
    }
    
    public void setEmojiCompatEnabled(final boolean b) {
        this.h.d(b);
    }
    
    public void setKeyListener(final KeyListener keyListener) {
        super.setKeyListener(this.h.a(keyListener));
    }
    
    public void setSupportBackgroundTintList(final ColorStateList list) {
        final e f = this.f;
        if (f != null) {
            f.h(list);
        }
    }
    
    public void setSupportBackgroundTintMode(final PorterDuff$Mode porterDuff$Mode) {
        final e f = this.f;
        if (f != null) {
            f.i(porterDuff$Mode);
        }
    }
    
    public void setSupportCompoundDrawablesTintList(final ColorStateList list) {
        this.g.k(list);
        this.g.b();
    }
    
    public void setSupportCompoundDrawablesTintMode(final PorterDuff$Mode porterDuff$Mode) {
        this.g.l(porterDuff$Mode);
        this.g.b();
    }
    
    public final void setTextAppearance(final Context context, final int n) {
        super.setTextAppearance(context, n);
        final w g = this.g;
        if (g != null) {
            g.g(n, context);
        }
    }
}
