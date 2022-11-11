// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import android.view.View;
import a4.p0;
import qf.a;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;

public class CheckableImageButton extends AppCompatImageButton implements Checkable
{
    public static final int[] l;
    public boolean i;
    public boolean j;
    public boolean k;
    
    static {
        l = new int[] { 16842912 };
    }
    
    public CheckableImageButton(final Context context, final AttributeSet set) {
        super(context, set, 2130969143);
        this.j = true;
        this.k = true;
        p0.l((View)this, (a4.a)new qf.a(this));
    }
    
    public final boolean isChecked() {
        return this.i;
    }
    
    public final int[] onCreateDrawableState(final int n) {
        if (this.i) {
            return View.mergeDrawableStates(super.onCreateDrawableState(n + 1), CheckableImageButton.l);
        }
        return super.onCreateDrawableState(n);
    }
    
    public final void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final a a = (a)parcelable;
        super.onRestoreInstanceState(a.f);
        this.setChecked(a.h);
    }
    
    public final Parcelable onSaveInstanceState() {
        final a a = new a(super.onSaveInstanceState());
        a.h = this.i;
        return (Parcelable)a;
    }
    
    public void setCheckable(final boolean j) {
        if (this.j != j) {
            this.j = j;
            ((View)this).sendAccessibilityEvent(0);
        }
    }
    
    public void setChecked(final boolean i) {
        if (this.j && this.i != i) {
            this.i = i;
            ((View)this).refreshDrawableState();
            ((View)this).sendAccessibilityEvent(2048);
        }
    }
    
    public void setPressable(final boolean k) {
        this.k = k;
    }
    
    public void setPressed(final boolean pressed) {
        if (this.k) {
            super.setPressed(pressed);
        }
    }
    
    public final void toggle() {
        this.setChecked(this.i ^ true);
    }
    
    public static final class a extends h4.a
    {
        public static final Parcelable$Creator<a> CREATOR;
        public boolean h;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$ClassLoaderCreator<a>() {
                public final Object createFromParcel(final Parcel parcel) {
                    return new a(parcel, null);
                }
                
                public final Object createFromParcel(final Parcel parcel, final ClassLoader classLoader) {
                    return new a(parcel, classLoader);
                }
                
                public final Object[] newArray(final int n) {
                    return new a[n];
                }
            };
        }
        
        public a(final Parcel parcel, final ClassLoader classLoader) {
            super(parcel, classLoader);
            final int int1 = parcel.readInt();
            boolean h = true;
            if (int1 != 1) {
                h = false;
            }
            this.h = h;
        }
        
        public a(final Parcelable parcelable) {
            super(parcelable);
        }
        
        public final void writeToParcel(final Parcel parcel, final int n) {
            parcel.writeParcelable(super.f, n);
            parcel.writeInt((int)(this.h ? 1 : 0));
        }
    }
}
