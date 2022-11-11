// 
// Decompiled by Procyon v0.6.0
// 

package X;

import androidx.appcompat.widget.AppCompatImageView;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.os.Vibrator;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveBattleScoreAnimationTimeThresholdSetting;
import android.widget.LinearLayout;
import kotlin.jvm.internal.n;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.reflect.Field;
import android.os.Handler;
import android.os.Looper;
import android.content.ClipboardManager;
import android.os.Build$VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;

public final class 0mM extends FrameLayout
{
    public AnimatorSet LIZ;
    public 1si LIZIZ;
    public HashMap LIZJ;
    
    static {
        Covode.recordClassIndex(7544);
    }
    
    public 0mM(final Context context, final AttributeSet set) {
        this(context, set, (byte)0);
    }
    
    public 0mM(final Context context, final AttributeSet set, final char c) {
        CTM.LIZ((Object)context);
        super(context, set, 0);
        MethodCollector.i(10887);
        0II.LIZ(LayoutInflater.from(context), 2131562190, (ViewGroup)this, true);
        this.LIZIZ = (1si)this.findViewById(2131366964);
        MethodCollector.o(10887);
    }
    
    private View LIZ(final int n) {
        if (this.LIZJ == null) {
            this.LIZJ = new HashMap();
        }
        View viewById;
        if ((viewById = this.LIZJ.get(n)) == null) {
            viewById = ((View)this).findViewById(n);
            this.LIZJ.put(n, viewById);
        }
        return viewById;
    }
    
    public static Object LIZ(Context context, String ex) {
        MethodCollector.i(10867);
    Label_0161_Outer:
        while (true) {
            if (Build$VERSION.SDK_INT <= 27 && "clipboard".equals(ex)) {
                if (!2JT.LIZ) {
                    break Label_0161_Outer;
                }
                monitorenter(ClipboardManager.class);
                try {
                    final Object systemService = context.getSystemService((String)ex);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            final Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            ex = (Exception)declaredField.get(systemService);
                            declaredField.set(systemService, new 2Lq((Handler)ex));
                        }
                        catch (final Exception ex) {
                            6Nw.LIZ((Throwable)ex, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    2JT.LIZ = false;
                    monitorexit(ClipboardManager.class);
                    break Label_0176;
                }
                finally {
                    monitorexit(ClipboardManager.class);
                    MethodCollector.o(10867);
                }
            }
            while (true) {
                if (2JT.LIZIZ || !"connectivity".equals(ex)) {
                    break Label_0161;
                }
                try {
                    new 6G9().LIZ();
                    2JT.LIZIZ = true;
                    context = (Context)context.getSystemService((String)ex);
                    MethodCollector.o(10867);
                    return context;
                    context = (Context)context.getSystemService((String)ex);
                    continue Label_0161_Outer;
                    context = (Context)context.getSystemService((String)ex);
                    continue Label_0161_Outer;
                }
                finally {
                    continue;
                }
                break;
            }
            break;
        }
    }
    
    public final void LIZ() {
        0cb.LIZ((View)this.LIZIZ, "tiktok_live_interaction_resource", "ttlive_icon_in_likmic.webp");
    }
    
    public final void LIZ(final long n) {
        final ConstraintLayout constraintLayout = (ConstraintLayout)this.LIZ(2131367312);
        n.LIZIZ((Object)constraintLayout, "");
        constraintLayout.setVisibility(0);
        final LinearLayout linearLayout = (LinearLayout)this.LIZ(2131367313);
        n.LIZIZ((Object)linearLayout, "");
        linearLayout.setVisibility(8);
        final 1si 1si = (1si)this.LIZ(2131366964);
        n.LIZIZ((Object)1si, "");
        1si.setVisibility(8);
        final 1ib 1ib = (1ib)this.LIZ(2131373399);
        n.LIZIZ((Object)1ib, "");
        1ib.setAlpha(1.0f);
        final long value = LiveBattleScoreAnimationTimeThresholdSetting.INSTANCE.getValue();
        Label_0436: {
            if (n > value) {
                break Label_0436;
            }
            ((1ib)this.LIZ(2131373399)).setTextColor(06x.LIZJ(this.getContext(), 2131100221));
            final float textSize = (value - n) / (float)value * 6.0f + 14.0f;
            final 1ib 1ib2 = (1ib)this.LIZ(2131373399);
            n.LIZIZ((Object)1ib2, "");
            1ib2.setTextSize(textSize);
            ((AppCompatTextView)this.LIZ(2131373399)).setTextSize(0, (float)0cB.LIZ(textSize));
            final 1ib 1ib3 = (1ib)this.LIZ(2131373399);
            n.LIZIZ((Object)1ib3, "");
            1ib3.setGravity(17);
            final 1ib 1ib4 = (1ib)this.LIZ(2131373399);
            n.LIZIZ((Object)1ib4, "");
            1ib4.setText((CharSequence)String.valueOf(n));
            ((AppCompatTextView)this.LIZ(2131373399)).setTextSize(0, (float)0cB.LIZ(19.0f));
            while (true) {
                if (n != 10L) {
                    break Label_0297;
                }
                final Context context = this.getContext();
                try {
                    final Object liz = LIZ(context, "vibrator");
                    if (liz == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.os.Vibrator");
                    }
                    ((Vibrator)liz).vibrate(50L);
                    final 1ib 1ib5 = (1ib)this.LIZ(2131373399);
                    n.LIZIZ((Object)1ib5, "");
                    final 1wh 1wh = new 1wh(this);
                    final 1wi 1wi = new 1wi((View)1ib5);
                    final 1wj 1wj = new 1wj((View)1ib5);
                    final 1wk 1wk = new 1wk(1wi);
                    final 1wl 1wl = new 1wl(1wi);
                    final 1wm 1wm = new 1wm(1wj);
                    final 1wn 1wn = new 1wn(1wj);
                    final 1wo 1wo = new 1wo(this, 1wh, 1wk, 1wm);
                    final 1wp 1wp = new 1wp(this, 1wh, 1wl, 1wn);
                    if (n == 0L) {
                        1wo.LIZ();
                        return;
                    }
                    1wp.LIZ();
                    return;
                    ((1ib)this.LIZ(2131373399)).setTextColor(06x.LIZJ(this.getContext(), 2131100609));
                    ((AppCompatTextView)this.LIZ(2131373399)).setTextSize(0, (float)0cB.LIZ(14.0f));
                    final 1ib 1ib6 = (1ib)this.LIZ(2131373399);
                    n.LIZIZ((Object)1ib6, "");
                    1ib6.setGravity(17);
                    final 1ib 1ib7 = (1ib)this.LIZ(2131373399);
                    n.LIZIZ((Object)1ib7, "");
                    1ib7.setText((CharSequence)Gl0.LIZIZ(n));
                }
                catch (final Exception ex) {
                    continue;
                }
                break;
            }
        }
    }
    
    public final void LIZIZ() {
        final ConstraintLayout constraintLayout = (ConstraintLayout)this.LIZ(2131367312);
        n.LIZIZ((Object)constraintLayout, "");
        constraintLayout.setVisibility(0);
        final LinearLayout linearLayout = (LinearLayout)this.LIZ(2131367313);
        n.LIZIZ((Object)linearLayout, "");
        linearLayout.setVisibility(8);
        final 1si 1si = (1si)this.LIZ(2131366964);
        n.LIZIZ((Object)1si, "");
        1si.setVisibility(8);
        final 1ib 1ib = (1ib)this.LIZ(2131373399);
        n.LIZIZ((Object)1ib, "");
        1ib.setAlpha(1.0f);
        final 1ib 1ib2 = (1ib)this.LIZ(2131373399);
        n.LIZIZ((Object)1ib2, "");
        1ib2.setText((CharSequence)0cB.LIZ(2131835746));
        ((1ib)this.LIZ(2131373399)).setTextColor(06x.LIZJ(this.getContext(), 2131100609));
        ((AppCompatTextView)this.LIZ(2131373399)).setTextSize(0, (float)0cB.LIZ(14.0f));
        final 1ib 1ib3 = (1ib)this.LIZ(2131373399);
        n.LIZIZ((Object)1ib3, "");
        1ib3.setGravity(17);
    }
    
    public final void LIZIZ(final long n) {
        final ConstraintLayout constraintLayout = (ConstraintLayout)this.LIZ(2131367312);
        n.LIZIZ((Object)constraintLayout, "");
        constraintLayout.setVisibility(8);
        final LinearLayout linearLayout = (LinearLayout)this.LIZ(2131367313);
        n.LIZIZ((Object)linearLayout, "");
        linearLayout.setVisibility(0);
        final 1si 1si = (1si)this.LIZ(2131366964);
        n.LIZIZ((Object)1si, "");
        1si.setVisibility(8);
        final 1ib 1ib = (1ib)this.LIZ(2131373400);
        n.LIZIZ((Object)1ib, "");
        1ib.setText((CharSequence)Gl0.LIZIZ(n));
    }
    
    public final void LIZJ() {
        final ConstraintLayout constraintLayout = (ConstraintLayout)this.LIZ(2131367312);
        n.LIZIZ((Object)constraintLayout, "");
        constraintLayout.setVisibility(8);
        final LinearLayout linearLayout = (LinearLayout)this.LIZ(2131367313);
        n.LIZIZ((Object)linearLayout, "");
        linearLayout.setVisibility(8);
        final 1si 1si = (1si)this.LIZ(2131366964);
        n.LIZIZ((Object)1si, "");
        1si.setVisibility(0);
    }
    
    public final AnimatorSet LIZLLL() {
        final AnimatorSet set = new AnimatorSet();
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)this.LIZ(2131373399), View.ALPHA, new float[] { 1.0f, 0.0f });
        n.LIZIZ((Object)ofFloat, "");
        ofFloat.setDuration(100L);
        final ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object)this.LIZ(2131367059), View.ALPHA, new float[] { 1.0f, 0.0f });
        n.LIZIZ((Object)ofFloat2, "");
        ofFloat2.setDuration(100L);
        final ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat((Object)this.LIZ(2131367312), View.ALPHA, new float[] { 1.0f, 0.0f });
        n.LIZIZ((Object)ofFloat3, "");
        ofFloat3.setDuration(100L);
        ofFloat3.setStartDelay(100L);
        set.playTogether(new Animator[] { (Animator)ofFloat, (Animator)ofFloat2, (Animator)ofFloat3 });
        return set;
    }
    
    public final void LJ() {
        final 1ib 1ib = (1ib)this.LIZ(2131373399);
        n.LIZIZ((Object)1ib, "");
        1ib.setAlpha(1.0f);
        final AppCompatImageView appCompatImageView = (AppCompatImageView)this.LIZ(2131367059);
        n.LIZIZ((Object)appCompatImageView, "");
        appCompatImageView.setAlpha(1.0f);
        final ConstraintLayout constraintLayout = (ConstraintLayout)this.LIZ(2131367312);
        n.LIZIZ((Object)constraintLayout, "");
        constraintLayout.setAlpha(1.0f);
    }
    
    public final void LJFF() {
        GTi.LIZ(this.LIZ(2131367313));
    }
}
