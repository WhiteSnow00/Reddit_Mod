// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Objects;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Iterator;
import android.animation.Animator$AnimatorListener;
import kotlin.jvm.internal.n;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.TimeInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.content.res.TypedArray;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.Random;
import android.view.View;
import android.animation.ValueAnimator;
import java.util.ArrayList;
import android.widget.LinearLayout;

public final class 0if extends LinearLayout
{
    public final ArrayList<ValueAnimator> LIZ;
    public int LIZIZ;
    public final ArrayList<View> LIZJ;
    public Random LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public long LJIIIZ;
    
    static {
        Covode.recordClassIndex(6765);
    }
    
    public 0if(final Context context, final AttributeSet set) {
        CTM.LIZ((Object)context);
        this(context, set, (byte)0);
    }
    
    public 0if(final Context context, final AttributeSet set, final byte b) {
        CTM.LIZ((Object)context);
        super(context, set, 0);
        MethodCollector.i(4597);
        this.LIZJ = new ArrayList<View>();
        this.LIZ = new ArrayList<ValueAnimator>();
        this.LIZLLL = new Random();
        if (set != null) {
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, new int[] { 2130971684, 2130971685, 2130971686, 2130971687, 2130971688, 2130971689, 2130971693 });
            if (obtainStyledAttributes != null) {
                this.LJ = (int)obtainStyledAttributes.getDimension(4, I4y.LIZIZ(context, 24.0f));
                this.LIZIZ = (int)obtainStyledAttributes.getDimension(5, I4y.LIZIZ(context, 4.0f));
                this.LJFF = (int)obtainStyledAttributes.getDimension(3, I4y.LIZIZ(context, 4.0f));
                this.LJI = (int)obtainStyledAttributes.getDimension(6, I4y.LIZIZ(context, 2.0f));
                this.LJII = (int)obtainStyledAttributes.getDimension(1, I4y.LIZIZ(context, 1.0f));
                this.LJIIIIZZ = obtainStyledAttributes.getInt(2, 13);
                this.LJIIIZ = obtainStyledAttributes.getInt(0, 600);
                obtainStyledAttributes.recycle();
            }
        }
        this.LIZ(context);
        MethodCollector.o(4597);
    }
    
    private final void LIZ(final Context context) {
        MethodCollector.i(4556);
        for (int ljiiiizz = this.LJIIIIZZ, i = 0; i < ljiiiizz; ++i) {
            final View view = new View(context);
            final LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(this.LJI, this.LIZIZ);
            final int ljff = this.LJFF;
            layoutParams.setMargins(ljff >> 1, 0, ljff >> 1, 0);
            view.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
            final GradientDrawable background = new GradientDrawable();
            background.setCornerRadius((float)this.LJII);
            background.setColor(-1);
            view.setBackground((Drawable)background);
            this.LIZJ.add(view);
            this.addView(view);
            final ArrayList<ValueAnimator> liz = this.LIZ;
            final ValueAnimator ofInt = ValueAnimator.ofInt(new int[] { 1, 2 });
            ofInt.setRepeatCount(-1);
            ofInt.setDuration(this.LJIIIZ);
            ofInt.setInterpolator((TimeInterpolator)new AccelerateDecelerateInterpolator());
            ofInt.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new b(view));
            n.LIZIZ((Object)ofInt, "");
            ofInt.addListener((Animator$AnimatorListener)new a.a(this, ofInt));
            liz.add(ofInt);
        }
        MethodCollector.o(4556);
    }
    
    public final void LIZ() {
        final Iterator<ValueAnimator> iterator = this.LIZ.iterator();
        while (iterator.hasNext()) {
            iterator.next().cancel();
        }
    }
    
    public final int getViewAnimatorHeight() {
        final float n = this.LIZLLL.nextInt(10) / 10.0f;
        final double n2 = n;
        if (n2 > 0.9) {
            return this.LJ;
        }
        if (n2 < 0.2) {
            return this.LIZIZ;
        }
        final int lj = this.LJ;
        final int liziz = this.LIZIZ;
        return RjR.LIZLLL((int)((lj - liziz) * n + liziz), lj);
    }
    
    public final void onVisibilityChanged(final View view, final int n) {
        CTM.LIZ((Object)view);
        if (n != 0) {
            this.LIZ();
        }
    }
    
    public static final class a
    {
        static {
            Covode.recordClassIndex(6766);
        }
        
        public static final class a extends AnimatorListenerAdapter
        {
            public final 0if LIZ;
            public final ValueAnimator LIZIZ;
            
            static {
                Covode.recordClassIndex(6767);
            }
            
            public a(final 0if liz, final ValueAnimator liziz) {
                CTM.LIZ((Object)liz, (Object)liziz);
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
            
            public final void onAnimationRepeat(final Animator animator) {
                this.LIZIZ.setIntValues(new int[] { this.LIZ.LIZIZ, this.LIZ.getViewAnimatorHeight(), this.LIZ.LIZIZ });
            }
        }
        
        public static final class b implements ValueAnimator$AnimatorUpdateListener
        {
            public final View LIZ;
            
            static {
                Covode.recordClassIndex(6768);
            }
            
            public b(final View liz) {
                CTM.LIZ((Object)liz);
                this.LIZ = liz;
            }
            
            public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
                CTM.LIZ((Object)valueAnimator);
                final View liz = this.LIZ;
                final ViewGroup$LayoutParams layoutParams = liz.getLayoutParams();
                final Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                layoutParams.height = (int)animatedValue;
                liz.requestLayout();
            }
        }
    }
}
