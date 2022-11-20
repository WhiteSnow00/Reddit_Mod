// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.content.res.TypedArray;
import mg.d0;
import android.util.AttributeSet;
import android.content.Context;
import android.view.LayoutInflater;
import java.lang.ref.WeakReference;
import android.view.View;

public final class ViewStubCompat extends View
{
    public int f;
    public int g;
    public WeakReference<View> h;
    public LayoutInflater i;
    
    public ViewStubCompat(final Context context, final AttributeSet set) {
        super(context, set, 0);
        this.f = 0;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, d0.Y, 0, 0);
        this.g = obtainStyledAttributes.getResourceId(2, -1);
        this.f = obtainStyledAttributes.getResourceId(1, 0);
        this.setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        this.setVisibility(8);
        this.setWillNotDraw(true);
    }
    
    public final View a() {
        final ViewParent parent = this.getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f != 0) {
            final ViewGroup viewGroup = (ViewGroup)parent;
            LayoutInflater layoutInflater = this.i;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(this.getContext());
            }
            final View inflate = layoutInflater.inflate(this.f, viewGroup, false);
            final int g = this.g;
            if (g != -1) {
                inflate.setId(g);
            }
            final int indexOfChild = viewGroup.indexOfChild((View)this);
            viewGroup.removeViewInLayout((View)this);
            final ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            }
            else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.h = new WeakReference<View>(inflate);
            return inflate;
        }
        throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
    }
    
    public final void dispatchDraw(final Canvas canvas) {
    }
    
    public final void draw(final Canvas canvas) {
    }
    
    public int getInflatedId() {
        return this.g;
    }
    
    public LayoutInflater getLayoutInflater() {
        return this.i;
    }
    
    public int getLayoutResource() {
        return this.f;
    }
    
    public final void onMeasure(final int n, final int n2) {
        this.setMeasuredDimension(0, 0);
    }
    
    public void setInflatedId(final int g) {
        this.g = g;
    }
    
    public void setLayoutInflater(final LayoutInflater i) {
        this.i = i;
    }
    
    public void setLayoutResource(final int f) {
        this.f = f;
    }
    
    public void setOnInflateListener(final a a) {
    }
    
    public void setVisibility(final int n) {
        final WeakReference<View> h = this.h;
        if (h != null) {
            final View view = h.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(n);
        }
        else {
            super.setVisibility(n);
            if (n == 0 || n == 4) {
                this.a();
            }
        }
    }
    
    public interface a
    {
        void a();
    }
}
