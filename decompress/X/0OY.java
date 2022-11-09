// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.animation.Animator;
import android.text.SpannableStringBuilder;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattlePrompt;
import com.bytedance.android.live.base.model.ImageModel;
import android.animation.Animator$AnimatorListener;
import android.animation.ObjectAnimator;
import kotlin.n.y;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import kotlin.jvm.internal.n;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTaskGiftAmountGuide;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.HorizontalScrollView;
import android.widget.FrameLayout;

public final class 0oy extends FrameLayout
{
    public boolean LIZ;
    public HorizontalScrollView LIZIZ;
    public LinearLayout LIZJ;
    public View LIZLLL;
    public View LJ;
    public Runnable LJFF;
    public Runnable LJI;
    public ValueAnimator LJII;
    public DataChannel LJIIIIZZ;
    public long LJIIIZ;
    public 1si LJIIJ;
    public 1si LJIIJJI;
    public 1sp LJIIL;
    public 1sp LJIILIIL;
    public BattleTaskGiftAmountGuide LJIILJJIL;
    public boolean LJIILL;
    
    static {
        Covode.recordClassIndex(8042);
    }
    
    public 0oy(final Context context) {
        CTM.LIZ((Object)context);
        boolean ljiill = false;
        super(context, (AttributeSet)null, 0);
        MethodCollector.i(9443);
        this.LJIILL = true;
        this.LJIIIZ = 5000L;
        final 44V s = GST.s;
        n.LIZIZ((Object)s, "");
        final Long n = (Long)((44T)s).LIZ();
        if (n < 3L) {
            ljiill = true;
        }
        this.LJIILL = ljiill;
        final LayoutInflater from = LayoutInflater.from(context);
        int n2;
        if (this.LJIILL) {
            n2 = 2131562147;
        }
        else {
            n2 = 2131562148;
        }
        0II.LIZ(from, n2, (ViewGroup)this, true);
        if (n <= 3L) {
            final 44V s2 = GST.s;
            kotlin.jvm.internal.n.LIZIZ((Object)s2, "");
            ((44T)s2).LIZ((Object)(n + 1L));
        }
        MethodCollector.o(9443);
    }
    
    public final void LIZ(BattleTaskGiftAmountGuide ljiiljjil, DataChannel ljiiiizz) {
        this.LJIILJJIL = ljiiljjil;
        final ImageModel imageModel = null;
        BattlePrompt liz;
        if (ljiiljjil != null) {
            liz = ljiiljjil.LIZ;
        }
        else {
            liz = null;
        }
        if (liz == null) {
            this.setVisibility(8);
            return;
        }
        Boolean value;
        if (ljiiiizz != null) {
            value = GTi.LIZJ(ljiiiizz);
        }
        else {
            value = null;
        }
        if (GTi.LIZJ(value)) {
            return;
        }
        this.LJIIIIZZ = ljiiiizz;
        ljiiljjil = this.LJIILJJIL;
        BattlePrompt liz2;
        if (ljiiljjil != null) {
            liz2 = ljiiljjil.LIZ;
        }
        else {
            liz2 = null;
        }
        final SpannableStringBuilder liz3 = 0nW.LIZ(liz2);
        if (y.LIZ((CharSequence)liz3)) {
            this.setVisibility(8);
            return;
        }
        ljiiiizz = this.LJIIIIZZ;
        if (ljiiiizz != null) {
            int n;
            if (this.LJIILL) {
                n = 1;
            }
            else {
                n = 2;
            }
            ljiiiizz.LIZIZ((Class)2EL.class, (Object)n);
        }
        final BattleTaskGiftAmountGuide ljiiljjil2 = this.LJIILJJIL;
        long ljiiiz = 0L;
        Label_0181: {
            if (ljiiljjil2 != null && Long.valueOf(ljiiljjil2.LIZJ) != null) {
                final BattleTaskGiftAmountGuide ljiiljjil3 = this.LJIILJJIL;
                if (ljiiljjil3 != null) {
                    final Long value2 = ljiiljjil3.LIZJ;
                    if (value2 != null) {
                        ljiiiz = value2.longValue() * 1000L;
                        break Label_0181;
                    }
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            if (this.LJIILL) {
                ljiiiz = 8000L;
            }
            else {
                ljiiiz = 5000L;
            }
        }
        this.LJIIIZ = ljiiiz;
        final 1sp ljiil = this.LJIIL;
        if (ljiil != null) {
            ljiil.setText((CharSequence)liz3);
        }
        final BattleTaskGiftAmountGuide ljiiljjil4 = this.LJIILJJIL;
        ImageModel lizlll = imageModel;
        if (ljiiljjil4 != null) {
            lizlll = ljiiljjil4.LIZLLL;
        }
        if (lizlll == null) {
            final 1si ljiij = this.LJIIJ;
            if (ljiij != null) {
                ljiij.setVisibility(4);
            }
        }
        else {
            final 1si ljiij2 = this.LJIIJ;
            if (ljiij2 != null) {
                ljiij2.setVisibility(0);
            }
            final G18 liz4 = 0cp.LIZ();
            0cq.LIZ(liz4, lizlll);
            liz4.LIZ((View)this.LJIIJ);
        }
        ljiiljjil = this.LJIILJJIL;
        Label_0268: {
            if (ljiiljjil != null) {
                final ImageModel lj = ljiiljjil.LJ;
                if (lj != null) {
                    final 1si ljiijji = this.LJIIJJI;
                    if (ljiijji != null) {
                        ljiijji.setVisibility(0);
                    }
                    final G18 liz5 = 0cp.LIZ();
                    0cq.LIZ(liz5, lj);
                    liz5.LIZ((View)this.LJIIJJI);
                    break Label_0268;
                }
            }
            final 1si ljiijji2 = this.LJIIJJI;
            if (ljiijji2 != null) {
                ljiijji2.setVisibility(8);
            }
        }
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)this, View.ALPHA, new float[] { 0.0f, 1.0f });
        ofFloat.setDuration(300L);
        ((Animator)ofFloat).addListener((Animator$AnimatorListener)new 0or(this));
        ofFloat.start();
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LIZ = true;
        this.setAlpha(0.0f);
        this.findViewById(2131372122);
        this.LJIIJ = (1si)this.findViewById(2131367148);
        this.LJIIJJI = (1si)this.findViewById(2131367147);
        this.LIZIZ = (HorizontalScrollView)this.findViewById(2131370783);
        this.LJIIL = (1sp)this.findViewById(2131373625);
        this.LJIILIIL = (1sp)this.findViewById(2131373624);
        this.LIZJ = (LinearLayout)this.findViewById(2131367922);
        this.LIZLLL = this.findViewById(2131374148);
        this.LJ = this.findViewById(2131374149);
        if (this.LJIILL) {
            final 1sp ljiiliil = this.LJIILIIL;
            if (ljiiliil != null) {
                ljiiliil.setVisibility(0);
            }
            return;
        }
        final 1sp ljiiliil2 = this.LJIILIIL;
        if (ljiiliil2 != null) {
            ljiiliil2.setVisibility(8);
        }
    }
    
    public final void onDetachedFromWindow() {
        this.LIZ = false;
        super.onDetachedFromWindow();
        this.removeCallbacks(this.LJFF);
        this.removeCallbacks(this.LJI);
        final ValueAnimator ljii = this.LJII;
        if (ljii != null) {
            ljii.removeAllUpdateListeners();
        }
        this.LJFF = null;
        this.LJI = null;
        this.LJII = null;
        this.LJIILJJIL = null;
        final DataChannel ljiiiizz = this.LJIIIIZZ;
        if (ljiiiizz != null) {
            final Integer n = (Integer)ljiiiizz.LIZIZ((Class)2EL.class);
            if (n != null && n > 0) {
                final DataChannel ljiiiizz2 = this.LJIIIIZZ;
                if (ljiiiizz2 != null) {
                    ljiiiizz2.LIZIZ((Class)2EL.class, (Object)0);
                }
            }
        }
    }
}
