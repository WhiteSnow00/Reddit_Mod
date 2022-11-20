// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.text.InputFilter;
import vl.a;
import android.graphics.drawable.Drawable;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.widget.TextView;
import android.widget.CompoundButton;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.CheckBox;

public class f extends CheckBox
{
    public final h f;
    public final e g;
    public final w h;
    public l i;
    
    public f(final Context context, final AttributeSet set) {
        this(context, set, 2130968760);
    }
    
    public f(final Context context, final AttributeSet set, final int n) {
        v0.a(context);
        super(context, set, n);
        t0.a(((View)this).getContext(), (View)this);
        (this.f = new h((CompoundButton)this)).b(set, n);
        (this.g = new e((View)this)).d(set, n);
        (this.h = new w((TextView)this)).f(set, n);
        this.getEmojiTextViewHelper().b(set, n);
    }
    
    private l getEmojiTextViewHelper() {
        if (this.i == null) {
            this.i = new l((TextView)this);
        }
        return this.i;
    }
    
    public void drawableStateChanged() {
        super.drawableStateChanged();
        final e g = this.g;
        if (g != null) {
            g.a();
        }
        final w h = this.h;
        if (h != null) {
            h.b();
        }
    }
    
    public int getCompoundPaddingLeft() {
        final int compoundPaddingLeft = super.getCompoundPaddingLeft();
        final h f = this.f;
        if (f != null) {
            f.getClass();
        }
        return compoundPaddingLeft;
    }
    
    public ColorStateList getSupportBackgroundTintList() {
        final e g = this.g;
        ColorStateList b;
        if (g != null) {
            b = g.b();
        }
        else {
            b = null;
        }
        return b;
    }
    
    public PorterDuff$Mode getSupportBackgroundTintMode() {
        final e g = this.g;
        PorterDuff$Mode c;
        if (g != null) {
            c = g.c();
        }
        else {
            c = null;
        }
        return c;
    }
    
    public ColorStateList getSupportButtonTintList() {
        final h f = this.f;
        ColorStateList b;
        if (f != null) {
            b = f.b;
        }
        else {
            b = null;
        }
        return b;
    }
    
    public PorterDuff$Mode getSupportButtonTintMode() {
        final h f = this.f;
        PorterDuff$Mode c;
        if (f != null) {
            c = f.c;
        }
        else {
            c = null;
        }
        return c;
    }
    
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.h.d();
    }
    
    public PorterDuff$Mode getSupportCompoundDrawablesTintMode() {
        return this.h.e();
    }
    
    public void setAllCaps(final boolean allCaps) {
        super.setAllCaps(allCaps);
        this.getEmojiTextViewHelper().c(allCaps);
    }
    
    public void setBackgroundDrawable(final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
        final e g = this.g;
        if (g != null) {
            g.e();
        }
    }
    
    public void setBackgroundResource(final int backgroundResource) {
        super.setBackgroundResource(backgroundResource);
        final e g = this.g;
        if (g != null) {
            g.f(backgroundResource);
        }
    }
    
    public void setButtonDrawable(final int n) {
        this.setButtonDrawable(a.U1(((View)this).getContext(), n));
    }
    
    public void setButtonDrawable(final Drawable buttonDrawable) {
        super.setButtonDrawable(buttonDrawable);
        final h f = this.f;
        if (f != null) {
            if (f.f) {
                f.f = false;
            }
            else {
                f.f = true;
                f.a();
            }
        }
    }
    
    public void setCompoundDrawables(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        final w h = this.h;
        if (h != null) {
            h.b();
        }
    }
    
    public void setCompoundDrawablesRelative(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        final w h = this.h;
        if (h != null) {
            h.b();
        }
    }
    
    public void setEmojiCompatEnabled(final boolean b) {
        this.getEmojiTextViewHelper().d(b);
    }
    
    public void setFilters(final InputFilter[] array) {
        super.setFilters(this.getEmojiTextViewHelper().a(array));
    }
    
    public void setSupportBackgroundTintList(final ColorStateList list) {
        final e g = this.g;
        if (g != null) {
            g.h(list);
        }
    }
    
    public void setSupportBackgroundTintMode(final PorterDuff$Mode porterDuff$Mode) {
        final e g = this.g;
        if (g != null) {
            g.i(porterDuff$Mode);
        }
    }
    
    public void setSupportButtonTintList(final ColorStateList b) {
        final h f = this.f;
        if (f != null) {
            f.b = b;
            f.d = true;
            f.a();
        }
    }
    
    public void setSupportButtonTintMode(final PorterDuff$Mode c) {
        final h f = this.f;
        if (f != null) {
            f.c = c;
            f.e = true;
            f.a();
        }
    }
    
    public void setSupportCompoundDrawablesTintList(final ColorStateList list) {
        this.h.k(list);
        this.h.b();
    }
    
    public void setSupportCompoundDrawablesTintMode(final PorterDuff$Mode porterDuff$Mode) {
        this.h.l(porterDuff$Mode);
        this.h.b();
    }
}
