// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.io.PrintStream;
import android.animation.Animator;
import android.animation.Animator$AnimatorListener;
import kotlin.jvm.internal.n;
import android.animation.ObjectAnimator;
import android.view.View;
import android.animation.AnimatorSet;
import android.util.Log;
import com.bytedance.covode.number.Covode;

public final class 0nz implements Runnable
{
    public final /* synthetic */ 0oD LIZ;
    
    static {
        Covode.recordClassIndex(7964);
    }
    
    public 0nz(final 0oD liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void run() {
        final AnimatorSet ljiiiizz = this.LIZ.LJIIIIZZ;
        if (ljiiiizz != null) {
            if (!7rv.LIZ.LIZ()) {
                ljiiiizz.removeAllListeners();
            }
            else {
                final PrintStream err = System.err;
                final StringBuilder sb = new StringBuilder("AnimatorLancet:::");
                sb.append(Log.getStackTraceString((Throwable)new Exception()));
                err.println(sb.toString());
                ljiiiizz.removeAllListeners();
            }
        }
        final AnimatorSet ljiiiizz2 = this.LIZ.LJIIIIZZ;
        if (ljiiiizz2 != null) {
            ljiiiizz2.cancel();
        }
        final 0oD liz = this.LIZ;
        final AnimatorSet ljiiiizz3 = new AnimatorSet();
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)liz.LIZIZ(2131367935), View.ALPHA, new float[] { 1.0f, 0.0f });
        n.LIZIZ((Object)ofFloat, "");
        ((Animator)ofFloat).addListener((Animator$AnimatorListener)new 0nu());
        ((Animator)ofFloat).setDuration(200L);
        final ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object)liz.LIZIZ(2131367935), View.ALPHA, new float[] { 0.0f, 1.0f });
        n.LIZIZ((Object)ofFloat2, "");
        ((Animator)ofFloat2).setDuration(200L);
        ljiiiizz3.playSequentially(new Animator[] { (Animator)ofFloat, (Animator)ofFloat2 });
        liz.LJIIIIZZ = ljiiiizz3;
        final AnimatorSet ljiiiizz4 = this.LIZ.LJIIIIZZ;
        if (ljiiiizz4 != null) {
            ljiiiizz4.start();
        }
    }
}
