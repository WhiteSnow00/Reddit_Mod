// 
// Decompiled by Procyon v0.6.0
// 

package h9;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.graphics.drawable.Animatable;
import i9.d;
import android.widget.ImageView;

public abstract class f<Z> extends l<ImageView, Z> implements d.a
{
    public Animatable l;
    
    public f(final ImageView imageView) {
        super((View)imageView);
    }
    
    public void d(final Z b, final d<? super Z> d) {
        if (d != null && d.a(b, (d.a)this)) {
            if (b instanceof Animatable) {
                (this.l = (Animatable)b).start();
            }
            else {
                this.l = null;
            }
        }
        else {
            this.j(b);
            if (b instanceof Animatable) {
                (this.l = (Animatable)b).start();
            }
            else {
                this.l = null;
            }
        }
    }
    
    @Override
    public final void e(final Drawable imageDrawable) {
        super.e(imageDrawable);
        final Animatable l = this.l;
        if (l != null) {
            l.stop();
        }
        this.j(null);
        this.l = null;
        ((ImageView)super.g).setImageDrawable(imageDrawable);
    }
    
    @Override
    public final void g(final Drawable imageDrawable) {
        this.a();
        this.j(null);
        this.l = null;
        ((ImageView)super.g).setImageDrawable(imageDrawable);
    }
    
    public void h(final Drawable imageDrawable) {
        this.j(null);
        this.l = null;
        ((ImageView)super.g).setImageDrawable(imageDrawable);
    }
    
    public abstract void j(final Z p0);
    
    public final void onStart() {
        final Animatable l = this.l;
        if (l != null) {
            l.start();
        }
    }
    
    public final void onStop() {
        final Animatable l = this.l;
        if (l != null) {
            l.stop();
        }
    }
}
