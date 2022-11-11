// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import a4.i0;
import android.view.animation.Transformation;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationSet;
import android.animation.Animator;
import android.view.animation.Animation;
import android.content.res.TypedArray;
import android.content.Context;

public final class s
{
    public static int a(int resourceId, final Context context) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[] { resourceId });
        resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }
    
    public static final class a
    {
        public final Animation a;
        public final Animator b;
        
        public a(final Animator b) {
            this.a = null;
            this.b = b;
        }
        
        public a(final Animation a) {
            this.a = a;
            this.b = null;
        }
    }
    
    public static final class b extends AnimationSet implements Runnable
    {
        public final ViewGroup f;
        public final View g;
        public boolean h;
        public boolean i;
        public boolean j;
        
        public b(final Animation animation, final ViewGroup f, final View g) {
            super(false);
            this.j = true;
            this.f = f;
            this.g = g;
            this.addAnimation(animation);
            ((View)f).post((Runnable)this);
        }
        
        public final boolean getTransformation(final long n, final Transformation transformation) {
            this.j = true;
            if (this.h) {
                return this.i ^ true;
            }
            if (!super.getTransformation(n, transformation)) {
                this.h = true;
                i0.a((View)this.f, this);
            }
            return true;
        }
        
        public final boolean getTransformation(final long n, final Transformation transformation, final float n2) {
            this.j = true;
            if (this.h) {
                return this.i ^ true;
            }
            if (!super.getTransformation(n, transformation, n2)) {
                this.h = true;
                i0.a((View)this.f, this);
            }
            return true;
        }
        
        public final void run() {
            if (!this.h && this.j) {
                this.j = false;
                ((View)this.f).post((Runnable)this);
            }
            else {
                this.f.endViewTransition(this.g);
                this.i = true;
            }
        }
    }
}
