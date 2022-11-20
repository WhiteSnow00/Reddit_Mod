// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.net.Uri;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ImageView;

public class AppCompatImageView extends ImageView
{
    private final e mBackgroundTintHelper;
    private boolean mHasLevel;
    private final m mImageHelper;
    
    public AppCompatImageView(final Context context) {
        this(context, null);
    }
    
    public AppCompatImageView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public AppCompatImageView(final Context context, final AttributeSet set, final int n) {
        v0.a(context);
        super(context, set, n);
        this.mHasLevel = false;
        t0.a(((View)this).getContext(), (View)this);
        (this.mBackgroundTintHelper = new e((View)this)).d(set, n);
        (this.mImageHelper = new m((ImageView)this)).b(set, n);
    }
    
    public void drawableStateChanged() {
        super.drawableStateChanged();
        final e mBackgroundTintHelper = this.mBackgroundTintHelper;
        if (mBackgroundTintHelper != null) {
            mBackgroundTintHelper.a();
        }
        final m mImageHelper = this.mImageHelper;
        if (mImageHelper != null) {
            mImageHelper.a();
        }
    }
    
    public ColorStateList getSupportBackgroundTintList() {
        final e mBackgroundTintHelper = this.mBackgroundTintHelper;
        ColorStateList b;
        if (mBackgroundTintHelper != null) {
            b = mBackgroundTintHelper.b();
        }
        else {
            b = null;
        }
        return b;
    }
    
    public PorterDuff$Mode getSupportBackgroundTintMode() {
        final e mBackgroundTintHelper = this.mBackgroundTintHelper;
        PorterDuff$Mode c;
        if (mBackgroundTintHelper != null) {
            c = mBackgroundTintHelper.c();
        }
        else {
            c = null;
        }
        return c;
    }
    
    public ColorStateList getSupportImageTintList() {
        final m mImageHelper = this.mImageHelper;
        ColorStateList a = null;
        if (mImageHelper != null) {
            final w0 b = mImageHelper.b;
            a = a;
            if (b != null) {
                a = b.a;
            }
        }
        return a;
    }
    
    public PorterDuff$Mode getSupportImageTintMode() {
        final m mImageHelper = this.mImageHelper;
        PorterDuff$Mode b = null;
        if (mImageHelper != null) {
            final w0 b2 = mImageHelper.b;
            b = b;
            if (b2 != null) {
                b = b2.b;
            }
        }
        return b;
    }
    
    public boolean hasOverlappingRendering() {
        final boolean b = ((View)this.mImageHelper.a).getBackground() instanceof RippleDrawable;
        boolean b2 = true;
        if (!(b ^ true) || !super.hasOverlappingRendering()) {
            b2 = false;
        }
        return b2;
    }
    
    public void setBackgroundDrawable(final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
        final e mBackgroundTintHelper = this.mBackgroundTintHelper;
        if (mBackgroundTintHelper != null) {
            mBackgroundTintHelper.e();
        }
    }
    
    public void setBackgroundResource(final int backgroundResource) {
        super.setBackgroundResource(backgroundResource);
        final e mBackgroundTintHelper = this.mBackgroundTintHelper;
        if (mBackgroundTintHelper != null) {
            mBackgroundTintHelper.f(backgroundResource);
        }
    }
    
    public void setImageBitmap(final Bitmap imageBitmap) {
        super.setImageBitmap(imageBitmap);
        final m mImageHelper = this.mImageHelper;
        if (mImageHelper != null) {
            mImageHelper.a();
        }
    }
    
    public void setImageDrawable(final Drawable imageDrawable) {
        final m mImageHelper = this.mImageHelper;
        if (mImageHelper != null && imageDrawable != null && !this.mHasLevel) {
            mImageHelper.c = imageDrawable.getLevel();
        }
        super.setImageDrawable(imageDrawable);
        final m mImageHelper2 = this.mImageHelper;
        if (mImageHelper2 != null) {
            mImageHelper2.a();
            if (!this.mHasLevel) {
                final m mImageHelper3 = this.mImageHelper;
                if (mImageHelper3.a.getDrawable() != null) {
                    mImageHelper3.a.getDrawable().setLevel(mImageHelper3.c);
                }
            }
        }
    }
    
    public void setImageLevel(final int imageLevel) {
        super.setImageLevel(imageLevel);
        this.mHasLevel = true;
    }
    
    public void setImageResource(final int n) {
        final m mImageHelper = this.mImageHelper;
        if (mImageHelper != null) {
            mImageHelper.c(n);
        }
    }
    
    public void setImageURI(final Uri imageURI) {
        super.setImageURI(imageURI);
        final m mImageHelper = this.mImageHelper;
        if (mImageHelper != null) {
            mImageHelper.a();
        }
    }
    
    public void setSupportBackgroundTintList(final ColorStateList list) {
        final e mBackgroundTintHelper = this.mBackgroundTintHelper;
        if (mBackgroundTintHelper != null) {
            mBackgroundTintHelper.h(list);
        }
    }
    
    public void setSupportBackgroundTintMode(final PorterDuff$Mode porterDuff$Mode) {
        final e mBackgroundTintHelper = this.mBackgroundTintHelper;
        if (mBackgroundTintHelper != null) {
            mBackgroundTintHelper.i(porterDuff$Mode);
        }
    }
    
    public void setSupportImageTintList(final ColorStateList a) {
        final m mImageHelper = this.mImageHelper;
        if (mImageHelper != null) {
            if (mImageHelper.b == null) {
                mImageHelper.b = new w0();
            }
            final w0 b = mImageHelper.b;
            b.a = a;
            b.d = true;
            mImageHelper.a();
        }
    }
    
    public void setSupportImageTintMode(final PorterDuff$Mode b) {
        final m mImageHelper = this.mImageHelper;
        if (mImageHelper != null) {
            if (mImageHelper.b == null) {
                mImageHelper.b = new w0();
            }
            final w0 b2 = mImageHelper.b;
            b2.b = b;
            b2.c = true;
            mImageHelper.a();
        }
    }
}
