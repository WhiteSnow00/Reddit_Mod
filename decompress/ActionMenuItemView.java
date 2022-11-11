// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.view.menu;

import androidx.appcompat.widget.c;
import l.f;
import androidx.appcompat.widget.g0;
import android.view.MotionEvent;
import android.os.Parcelable;
import android.view.View$MeasureSpec;
import android.widget.Button;
import android.view.View;
import androidx.appcompat.widget.d1;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.content.res.TypedArray;
import android.content.res.Resources;
import gn.a;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionMenuView$a;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatTextView;

public class ActionMenuItemView extends AppCompatTextView implements j$a, View$OnClickListener, ActionMenuView$a
{
    public g m;
    public CharSequence n;
    public Drawable o;
    public MenuBuilder$b p;
    public a q;
    public ActionMenuItemView.ActionMenuItemView$b r;
    public boolean s;
    public boolean t;
    public int u;
    public int v;
    public int w;
    
    public ActionMenuItemView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public ActionMenuItemView(final Context context, final AttributeSet set, final int n) {
        super(context, set, 0);
        final Resources resources = context.getResources();
        this.s = this.f();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, gn.a.S, 0, 0);
        this.u = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.w = (int)(resources.getDisplayMetrics().density * 32.0f + 0.5f);
        ((View)this).setOnClickListener((View$OnClickListener)this);
        this.v = -1;
        ((View)this).setSaveEnabled(false);
    }
    
    public final void b(final g m) {
        this.m = m;
        this.setIcon(m.getIcon());
        this.setTitle(m.getTitleCondensed());
        ((View)this).setId(m.a);
        int visibility;
        if (m.isVisible()) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)this).setVisibility(visibility);
        ((View)this).setEnabled(m.isEnabled());
        if (m.hasSubMenu() && this.q == null) {
            this.q = new a();
        }
    }
    
    public final boolean c() {
        return TextUtils.isEmpty(this.getText()) ^ true;
    }
    
    public final boolean d() {
        return this.c();
    }
    
    public final boolean e() {
        return this.c() && this.m.getIcon() == null;
    }
    
    public final boolean f() {
        final Configuration configuration = ((View)this).getContext().getResources().getConfiguration();
        final int screenWidthDp = configuration.screenWidthDp;
        final int screenHeightDp = configuration.screenHeightDp;
        return screenWidthDp >= 480 || (screenWidthDp >= 640 && screenHeightDp >= 480) || configuration.orientation == 2;
    }
    
    public final void g() {
        final boolean empty = TextUtils.isEmpty(this.n);
        boolean b2;
        final boolean b = b2 = true;
        Label_0066: {
            if (this.o != null) {
                if ((this.m.y & 0x4) == 0x4) {
                    b2 = b;
                    if (this.s) {
                        break Label_0066;
                    }
                    if (this.t) {
                        b2 = b;
                        break Label_0066;
                    }
                }
                b2 = false;
            }
        }
        final boolean b3 = (empty ^ true) & b2;
        final CharSequence charSequence = null;
        CharSequence n;
        if (b3) {
            n = this.n;
        }
        else {
            n = null;
        }
        this.setText(n);
        final CharSequence q = this.m.q;
        if (TextUtils.isEmpty(q)) {
            CharSequence e;
            if (b3) {
                e = null;
            }
            else {
                e = this.m.e;
            }
            ((View)this).setContentDescription(e);
        }
        else {
            ((View)this).setContentDescription(q);
        }
        final CharSequence r = this.m.r;
        if (TextUtils.isEmpty(r)) {
            CharSequence e2;
            if (b3) {
                e2 = charSequence;
            }
            else {
                e2 = this.m.e;
            }
            d1.a((View)this, e2);
        }
        else {
            d1.a((View)this, r);
        }
    }
    
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }
    
    public g getItemData() {
        return this.m;
    }
    
    public final void onClick(final View view) {
        final MenuBuilder$b p = this.p;
        if (p != null) {
            p.c(this.m);
        }
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.s = this.f();
        this.g();
    }
    
    @Override
    public final void onMeasure(int n, final int n2) {
        final boolean c = this.c();
        if (c) {
            final int v = this.v;
            if (v >= 0) {
                super.setPadding(v, ((View)this).getPaddingTop(), ((View)this).getPaddingRight(), ((View)this).getPaddingBottom());
            }
        }
        super.onMeasure(n, n2);
        final int mode = View$MeasureSpec.getMode(n);
        n = View$MeasureSpec.getSize(n);
        final int measuredWidth = ((View)this).getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            n = Math.min(n, this.u);
        }
        else {
            n = this.u;
        }
        if (mode != 1073741824 && this.u > 0 && measuredWidth < n) {
            super.onMeasure(View$MeasureSpec.makeMeasureSpec(n, 1073741824), n2);
        }
        if (!c && this.o != null) {
            super.setPadding((((View)this).getMeasuredWidth() - this.o.getBounds().width()) / 2, ((View)this).getPaddingTop(), ((View)this).getPaddingRight(), ((View)this).getPaddingBottom());
        }
    }
    
    public final void onRestoreInstanceState(final Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable)null);
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        if (this.m.hasSubMenu()) {
            final a q = this.q;
            if (q != null && q.onTouch((View)this, motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
    
    public void setCheckable(final boolean b) {
    }
    
    public void setChecked(final boolean b) {
    }
    
    public void setExpandedFormat(final boolean t) {
        if (this.t != t) {
            this.t = t;
            final g m = this.m;
            if (m != null) {
                m.n.onItemActionRequestChanged(m);
            }
        }
    }
    
    public void setIcon(final Drawable o) {
        this.o = o;
        if (o != null) {
            final int intrinsicWidth = o.getIntrinsicWidth();
            final int intrinsicHeight = o.getIntrinsicHeight();
            int w = this.w;
            int n = intrinsicWidth;
            int n2 = intrinsicHeight;
            if (intrinsicWidth > w) {
                n2 = (int)(intrinsicHeight * (w / (float)intrinsicWidth));
                n = w;
            }
            if (n2 > w) {
                n *= (int)(w / (float)n2);
            }
            else {
                w = n2;
            }
            o.setBounds(0, 0, n, w);
        }
        this.setCompoundDrawables(o, null, null, null);
        this.g();
    }
    
    public void setItemInvoker(final MenuBuilder$b p) {
        this.p = p;
    }
    
    public final void setPadding(final int v, final int n, final int n2, final int n3) {
        super.setPadding(this.v = v, n, n2, n3);
    }
    
    public void setPopupCallback(final ActionMenuItemView.ActionMenuItemView$b r) {
        this.r = r;
    }
    
    public void setTitle(final CharSequence n) {
        this.n = n;
        this.g();
    }
    
    public final class a extends g0
    {
        public a() {
            super((View)ActionMenuItemView.this);
        }
        
        @Override
        public final f b() {
            final ActionMenuItemView.ActionMenuItemView$b r = ActionMenuItemView.this.r;
            Object a;
            final Object o = a = null;
            if (r != null) {
                final c.a z = ((c.b)r).a.z;
                a = o;
                if (z != null) {
                    a = z.a();
                }
            }
            return (f)a;
        }
        
        @Override
        public final boolean c() {
            final ActionMenuItemView o = ActionMenuItemView.this;
            final MenuBuilder$b p = o.p;
            boolean b2;
            final boolean b = b2 = false;
            if (p != null) {
                b2 = b;
                if (p.c(o.m)) {
                    final f b3 = this.b();
                    b2 = b;
                    if (b3 != null) {
                        b2 = b;
                        if (b3.a()) {
                            b2 = true;
                        }
                    }
                }
            }
            return b2;
        }
    }
}
