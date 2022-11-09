// 
// Decompiled by Procyon v0.6.0
// 

package r5;

import java.util.WeakHashMap;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import a4.p0;
import android.graphics.drawable.shapes.Shape;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import p2.e;
import android.content.Context;
import android.view.animation.Animation$AnimationListener;
import android.widget.ImageView;

public final class a extends ImageView
{
    public Animation$AnimationListener f;
    public int g;
    
    public a(final Context context) {
        super(context);
        final float density = ((View)this).getContext().getResources().getDisplayMetrics().density;
        final TypedArray obtainStyledAttributes = ((View)this).getContext().obtainStyledAttributes(e.h);
        this.g = obtainStyledAttributes.getColor(0, -328966);
        obtainStyledAttributes.recycle();
        final ShapeDrawable shapeDrawable = new ShapeDrawable((Shape)new OvalShape());
        final WeakHashMap a = p0.a;
        p0.i.s((View)this, density * 4.0f);
        shapeDrawable.getPaint().setColor(this.g);
        p0.d.q((View)this, (Drawable)shapeDrawable);
    }
    
    public final void onAnimationEnd() {
        super.onAnimationEnd();
        final Animation$AnimationListener f = this.f;
        if (f != null) {
            f.onAnimationEnd(((View)this).getAnimation());
        }
    }
    
    public final void onAnimationStart() {
        super.onAnimationStart();
        final Animation$AnimationListener f = this.f;
        if (f != null) {
            f.onAnimationStart(((View)this).getAnimation());
        }
    }
    
    public final void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
    }
    
    public final void setBackgroundColor(final int n) {
        if (((View)this).getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable)((View)this).getBackground()).getPaint().setColor(n);
            this.g = n;
        }
    }
}
