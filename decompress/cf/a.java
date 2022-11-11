// 
// Decompiled by Procyon v0.6.0
// 

package cf;

import a4.t1;
import java.util.WeakHashMap;
import a4.q0$d;
import a4.q0;
import android.graphics.drawable.Drawable$ConstantState;
import r3.a$b;
import b4.c$a;
import b4.c$c;
import b4.c;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.View;
import androidx.appcompat.widget.d1;
import android.text.TextUtils;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j$a;
import android.widget.FrameLayout;

public final class a extends FrameLayout implements j$a
{
    public static final int[] n;
    public int f;
    public boolean g;
    public int h;
    public g i;
    public ColorStateList j;
    public Drawable k;
    public Drawable l;
    public ze.a m;
    
    static {
        n = new int[] { 16842912 };
    }
    
    public final void b(final g i) {
        this.i = i;
        this.setCheckable(i.isCheckable());
        this.setChecked(i.isChecked());
        this.setEnabled(i.isEnabled());
        this.setIcon(i.getIcon());
        this.setTitle(i.e);
        ((View)this).setId(i.a);
        if (!TextUtils.isEmpty(i.q)) {
            ((View)this).setContentDescription(i.q);
        }
        CharSequence charSequence;
        if (!TextUtils.isEmpty(i.r)) {
            charSequence = i.r;
        }
        else {
            charSequence = i.e;
        }
        d1.a((View)this, charSequence);
        int visibility;
        if (i.isVisible()) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)this).setVisibility(visibility);
    }
    
    public ze.a getBadge() {
        return this.m;
    }
    
    public g getItemData() {
        return this.i;
    }
    
    public int getItemPosition() {
        return this.h;
    }
    
    public final int[] onCreateDrawableState(final int n) {
        final int[] onCreateDrawableState = super.onCreateDrawableState(n + 1);
        final g i = this.i;
        if (i != null && i.isCheckable() && this.i.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, a.n);
        }
        return onCreateDrawableState;
    }
    
    public final void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        final ze.a m = this.m;
        if (m != null && ((Drawable)m).isVisible()) {
            final g i = this.i;
            CharSequence charSequence = i.e;
            if (!TextUtils.isEmpty(i.q)) {
                charSequence = this.i.q;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append((Object)charSequence);
            sb.append(", ");
            sb.append((Object)this.m.c());
            accessibilityNodeInfo.setContentDescription((CharSequence)sb.toString());
        }
        final c c = new c(accessibilityNodeInfo);
        c.p(c$c.a(0, 1, this.getItemPosition(), 1, false, ((View)this).isSelected()));
        if (((View)this).isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            c.k(c$a.g);
        }
        c.s(((View)this).getResources().getString(2131954179));
    }
    
    public void setBadge(final ze.a m) {
        this.m = m;
    }
    
    public void setCheckable(final boolean b) {
        ((View)this).refreshDrawableState();
    }
    
    public void setChecked(final boolean b) {
        throw null;
    }
    
    public void setEnabled(final boolean enabled) {
        super.setEnabled(enabled);
        throw null;
    }
    
    public void setIcon(Drawable drawable) {
        if (drawable == this.k) {
            return;
        }
        if ((this.k = drawable) != null) {
            final Drawable$ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            final Drawable mutate = drawable.mutate();
            this.l = mutate;
            final ColorStateList j = this.j;
            if (j != null) {
                a$b.h(mutate, j);
            }
        }
        throw null;
    }
    
    public void setIconSize(final int n) {
        throw null;
    }
    
    public void setIconTintList(final ColorStateList j) {
        this.j = j;
        if (this.i != null) {
            final Drawable l = this.l;
            if (l != null) {
                a$b.h(l, j);
                this.l.invalidateSelf();
            }
        }
    }
    
    public void setItemBackground(final int n) {
        Drawable drawable;
        if (n == 0) {
            drawable = null;
        }
        else {
            drawable = n3.a.getDrawable(((View)this).getContext(), n);
        }
        this.setItemBackground(drawable);
    }
    
    public void setItemBackground(final Drawable drawable) {
        Drawable mutate = drawable;
        if (drawable != null) {
            mutate = drawable;
            if (drawable.getConstantState() != null) {
                mutate = drawable.getConstantState().newDrawable().mutate();
            }
        }
        final WeakHashMap<View, t1> a = q0.a;
        q0$d.q((View)this, mutate);
    }
    
    public void setItemPosition(final int h) {
        this.h = h;
    }
    
    public void setLabelVisibilityMode(int f) {
        if (this.f != f) {
            this.f = f;
            final g i = this.i;
            if (i != null) {
                f = 1;
            }
            else {
                f = 0;
            }
            if (f != 0) {
                this.setChecked(i.isChecked());
            }
        }
    }
    
    public void setShifting(final boolean g) {
        if (this.g != g) {
            this.g = g;
            final g i = this.i;
            if (i != null) {
                this.setChecked(i.isChecked());
            }
        }
    }
    
    public void setTextAppearanceActive(final int n) {
        throw null;
    }
    
    public void setTextAppearanceInactive(final int n) {
        throw null;
    }
    
    public void setTextColor(final ColorStateList list) {
        if (list == null) {
            return;
        }
        throw null;
    }
    
    public void setTitle(final CharSequence charSequence) {
        throw null;
    }
}
