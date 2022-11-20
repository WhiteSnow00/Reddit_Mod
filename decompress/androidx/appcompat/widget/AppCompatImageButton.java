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
import android.widget.ImageView;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ImageButton;

public class AppCompatImageButton extends ImageButton
{
    public final e f;
    public final m g;
    public boolean h;
    
    public AppCompatImageButton(final Context context, final AttributeSet set) {
        this(context, set, 2130969138);
    }
    
    public AppCompatImageButton(final Context context, final AttributeSet set, final int n) {
        v0.a(context);
        super(context, set, n);
        this.h = false;
        t0.a(((View)this).getContext(), (View)this);
        (this.f = new e((View)this)).d(set, n);
        (this.g = new m((ImageView)this)).b(set, n);
    }
    
    public void drawableStateChanged() {
        super.drawableStateChanged();
        final e f = this.f;
        if (f != null) {
            f.a();
        }
        final m g = this.g;
        if (g != null) {
            g.a();
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
    
    public ColorStateList getSupportImageTintList() {
        final m g = this.g;
        ColorStateList a = null;
        if (g != null) {
            final w0 b = g.b;
            a = a;
            if (b != null) {
                a = b.a;
            }
        }
        return a;
    }
    
    public PorterDuff$Mode getSupportImageTintMode() {
        final m g = this.g;
        PorterDuff$Mode b = null;
        if (g != null) {
            final w0 b2 = g.b;
            b = b;
            if (b2 != null) {
                b = b2.b;
            }
        }
        return b;
    }
    
    public final boolean hasOverlappingRendering() {
        final boolean b = ((View)this.g.a).getBackground() instanceof RippleDrawable;
        boolean b2 = true;
        if (!(b ^ true) || !super.hasOverlappingRendering()) {
            b2 = false;
        }
        return b2;
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
    
    public void setImageBitmap(final Bitmap imageBitmap) {
        super.setImageBitmap(imageBitmap);
        final m g = this.g;
        if (g != null) {
            g.a();
        }
    }
    
    public void setImageDrawable(final Drawable imageDrawable) {
        final m g = this.g;
        if (g != null && imageDrawable != null && !this.h) {
            g.c = imageDrawable.getLevel();
        }
        super.setImageDrawable(imageDrawable);
        final m g2 = this.g;
        if (g2 != null) {
            g2.a();
            if (!this.h) {
                final m g3 = this.g;
                if (g3.a.getDrawable() != null) {
                    g3.a.getDrawable().setLevel(g3.c);
                }
            }
        }
    }
    
    public void setImageLevel(final int imageLevel) {
        super.setImageLevel(imageLevel);
        this.h = true;
    }
    
    public void setImageResource(final int n) {
        this.g.c(n);
    }
    
    public void setImageURI(final Uri imageURI) {
        super.setImageURI(imageURI);
        final m g = this.g;
        if (g != null) {
            g.a();
        }
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
    
    public void setSupportImageTintList(final ColorStateList a) {
        final m g = this.g;
        if (g != null) {
            if (g.b == null) {
                g.b = new w0();
            }
            final w0 b = g.b;
            b.a = a;
            b.d = true;
            g.a();
        }
    }
    
    public void setSupportImageTintMode(final PorterDuff$Mode b) {
        final m g = this.g;
        if (g != null) {
            if (g.b == null) {
                g.b = new w0();
            }
            final w0 b2 = g.b;
            b2.b = b;
            b2.c = true;
            g.a();
        }
    }
}
