// 
// Decompiled by Procyon v0.6.0
// 

package t5;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.Animator$AnimatorPauseListener;
import android.animation.Animator$AnimatorListener;
import android.animation.PropertyValuesHolder;
import android.animation.ObjectAnimator;
import android.view.animation.BaseInterpolator;
import android.view.View;

public final class v
{
    public static ObjectAnimator a(final View view, final t t, final int n, final int n2, float translationX, float translationY, final float n3, final float n4, final BaseInterpolator interpolator, final m m) {
        final float translationX2 = view.getTranslationX();
        final float translationY2 = view.getTranslationY();
        final int[] array = (int[])t.b.getTag(2131431886);
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
        final v.v$a v$a = new v.v$a(view, t.b, round + n, round2 + n2, translationX2, translationY2);
        m.a((m.d)v$a);
        ((Animator)ofPropertyValuesHolder).addListener((Animator$AnimatorListener)v$a);
        ((Animator)ofPropertyValuesHolder).addPauseListener((Animator$AnimatorPauseListener)v$a);
        ((Animator)ofPropertyValuesHolder).setInterpolator((TimeInterpolator)interpolator);
        return ofPropertyValuesHolder;
    }
}
