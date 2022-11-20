// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.text.InputFilter;
import android.graphics.drawable.Drawable;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.widget.TextView;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ToggleButton;

public final class a0 extends ToggleButton
{
    public final e f;
    public final w g;
    public l h;
    
    public a0(final Context context, final AttributeSet set) {
        super(context, set, 16842827);
        t0.a(((View)this).getContext(), (View)this);
        (this.f = new e((View)this)).d(set, 16842827);
        (this.g = new w((TextView)this)).f(set, 16842827);
        this.getEmojiTextViewHelper().b(set, 16842827);
    }
    
    private l getEmojiTextViewHelper() {
        if (this.h == null) {
            this.h = new l((TextView)this);
        }
        return this.h;
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
    
    public void setAllCaps(final boolean allCaps) {
        super.setAllCaps(allCaps);
        this.getEmojiTextViewHelper().c(allCaps);
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
    
    public void setEmojiCompatEnabled(final boolean b) {
        this.getEmojiTextViewHelper().d(b);
    }
    
    public void setFilters(final InputFilter[] array) {
        super.setFilters(this.getEmojiTextViewHelper().a(array));
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
}
