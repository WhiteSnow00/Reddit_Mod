// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.net.Uri;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import X.04J;
import android.widget.ImageView;

public class AppCompatImageView extends ImageView
{
    public final 04J mBackgroundTintHelper;
    public final m mImageHelper;
    
    static {
        Covode.recordClassIndex(405);
    }
    
    public AppCompatImageView(final Context context) {
        this(context, null);
    }
    
    public AppCompatImageView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public AppCompatImageView(final Context context, final AttributeSet set, final int n) {
        an.LIZ(context);
        super(context, set, n);
        (this.mBackgroundTintHelper = new 04J((View)this)).LIZ(set, n);
        (this.mImageHelper = new m(this)).LIZ(set, n);
    }
    
    public void drawableStateChanged() {
        super.drawableStateChanged();
        final 04J mBackgroundTintHelper = this.mBackgroundTintHelper;
        if (mBackgroundTintHelper != null) {
            mBackgroundTintHelper.LIZLLL();
        }
        final m mImageHelper = this.mImageHelper;
        if (mImageHelper != null) {
            mImageHelper.LIZLLL();
        }
    }
    
    public ColorStateList getSupportBackgroundTintList() {
        final 04J mBackgroundTintHelper = this.mBackgroundTintHelper;
        if (mBackgroundTintHelper != null) {
            return mBackgroundTintHelper.LIZIZ();
        }
        return null;
    }
    
    public PorterDuff$Mode getSupportBackgroundTintMode() {
        final 04J mBackgroundTintHelper = this.mBackgroundTintHelper;
        if (mBackgroundTintHelper != null) {
            return mBackgroundTintHelper.LIZJ();
        }
        return null;
    }
    
    public ColorStateList getSupportImageTintList() {
        final m mImageHelper = this.mImageHelper;
        if (mImageHelper != null) {
            return mImageHelper.LIZIZ();
        }
        return null;
    }
    
    public PorterDuff$Mode getSupportImageTintMode() {
        final m mImageHelper = this.mImageHelper;
        if (mImageHelper != null) {
            return mImageHelper.LIZJ();
        }
        return null;
    }
    
    public boolean hasOverlappingRendering() {
        return this.mImageHelper.LIZ() && super.hasOverlappingRendering();
    }
    
    public void setBackgroundDrawable(final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
        final 04J mBackgroundTintHelper = this.mBackgroundTintHelper;
        if (mBackgroundTintHelper != null) {
            mBackgroundTintHelper.LIZ();
        }
    }
    
    public void setBackgroundResource(final int backgroundResource) {
        super.setBackgroundResource(backgroundResource);
        final 04J mBackgroundTintHelper = this.mBackgroundTintHelper;
        if (mBackgroundTintHelper != null) {
            mBackgroundTintHelper.LIZ(backgroundResource);
        }
    }
    
    public void setImageBitmap(final Bitmap imageBitmap) {
        super.setImageBitmap(imageBitmap);
        final m mImageHelper = this.mImageHelper;
        if (mImageHelper != null) {
            mImageHelper.LIZLLL();
        }
    }
    
    public void setImageDrawable(final Drawable imageDrawable) {
        super.setImageDrawable(imageDrawable);
        final m mImageHelper = this.mImageHelper;
        if (mImageHelper != null) {
            mImageHelper.LIZLLL();
        }
    }
    
    public void setImageResource(final int n) {
        final m mImageHelper = this.mImageHelper;
        if (mImageHelper != null) {
            mImageHelper.LIZ(n);
        }
    }
    
    public void setImageURI(final Uri imageURI) {
        super.setImageURI(imageURI);
        final m mImageHelper = this.mImageHelper;
        if (mImageHelper != null) {
            mImageHelper.LIZLLL();
        }
    }
    
    public void setSupportBackgroundTintList(final ColorStateList list) {
        final 04J mBackgroundTintHelper = this.mBackgroundTintHelper;
        if (mBackgroundTintHelper != null) {
            mBackgroundTintHelper.LIZ(list);
        }
    }
    
    public void setSupportBackgroundTintMode(final PorterDuff$Mode porterDuff$Mode) {
        final 04J mBackgroundTintHelper = this.mBackgroundTintHelper;
        if (mBackgroundTintHelper != null) {
            mBackgroundTintHelper.LIZ(porterDuff$Mode);
        }
    }
    
    public void setSupportImageTintList(final ColorStateList list) {
        final m mImageHelper = this.mImageHelper;
        if (mImageHelper != null) {
            mImageHelper.LIZ(list);
        }
    }
    
    public void setSupportImageTintMode(final PorterDuff$Mode porterDuff$Mode) {
        final m mImageHelper = this.mImageHelper;
        if (mImageHelper != null) {
            mImageHelper.LIZ(porterDuff$Mode);
        }
    }
}
