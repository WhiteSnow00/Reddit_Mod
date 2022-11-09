// 
// Decompiled by Procyon v0.6.0
// 

package u5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.Animator$AnimatorPauseListener;
import android.animation.Animator$AnimatorListener;
import android.animation.PropertyValuesHolder;
import android.animation.ObjectAnimator;
import android.view.animation.BaseInterpolator;
import android.view.View;

public final class u
{
    public static ObjectAnimator a(final View view, final t t, final int n, final int n2, float translationX, float translationY, final float n3, final float n4, final BaseInterpolator interpolator, final m m) {
        final float translationX2 = view.getTranslationX();
        final float translationY2 = view.getTranslationY();
        final int[] array = (int[])t.b.getTag(2131431878);
        if (array != null) {
            translationX = array[0] - n + translationX2;
            translationY = array[1] - n2 + translationY2;
        }
        final int round = Math.round(translationX - translationX2);
        final int round2 = Math.round(translationY - translationY2);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        if (translationX == n3 && translationY == n4) {
            return null;
        }
        final ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder((Object)view, new PropertyValuesHolder[] { PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[] { translationX, n3 }), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[] { translationY, n4 }) });
        final a a = new a(view, t.b, round + n, round2 + n2, translationX2, translationY2);
        m.a((m.d)a);
        ((Animator)ofPropertyValuesHolder).addListener((Animator$AnimatorListener)a);
        ((Animator)ofPropertyValuesHolder).addPauseListener((Animator$AnimatorPauseListener)a);
        ((Animator)ofPropertyValuesHolder).setInterpolator((TimeInterpolator)interpolator);
        return ofPropertyValuesHolder;
    }
    
    public static final class a extends AnimatorListenerAdapter implements d
    {
        public final View a;
        public final View b;
        public final int c;
        public final int d;
        public int[] e;
        public float f;
        public float g;
        public final float h;
        public final float i;
        
        public a(final View b, final View a, final int n, final int n2, final float h, final float i) {
            this.b = b;
            this.a = a;
            this.c = n - Math.round(b.getTranslationX());
            this.d = n2 - Math.round(b.getTranslationY());
            this.h = h;
            this.i = i;
            final int[] e = (int[])a.getTag(2131431878);
            this.e = e;
            if (e != null) {
                a.setTag(2131431878, (Object)null);
            }
        }
        
        public final void a(final m m) {
            this.b.setTranslationX(this.h);
            this.b.setTranslationY(this.i);
            m.y((m.d)this);
        }
        
        public final void b(final m m) {
        }
        
        public final void c(final m m) {
        }
        
        public final void d(final m m) {
        }
        
        public final void e(final m m) {
        }
        
        public final void onAnimationCancel(final Animator animator) {
            if (this.e == null) {
                this.e = new int[2];
            }
            this.e[0] = Math.round(this.b.getTranslationX() + this.c);
            this.e[1] = Math.round(this.b.getTranslationY() + this.d);
            this.a.setTag(2131431878, (Object)this.e);
        }
        
        public final void onAnimationPause(final Animator animator) {
            this.f = this.b.getTranslationX();
            this.g = this.b.getTranslationY();
            this.b.setTranslationX(this.h);
            this.b.setTranslationY(this.i);
        }
        
        public final void onAnimationResume(final Animator animator) {
            this.b.setTranslationX(this.f);
            this.b.setTranslationY(this.g);
        }
    }
}
