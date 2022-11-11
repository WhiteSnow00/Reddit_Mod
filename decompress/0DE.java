// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.transition.TransitionManager;
import android.content.res.TypedArray;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.transition.Transition;
import android.transition.Fade;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.transition.TransitionSet;
import android.view.View;
import java.util.Map;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;

public class 0de extends FrameLayout implements View$OnClickListener
{
    public boolean LIZ;
    public boolean LIZIZ;
    public final Map<String, View> LIZJ;
    public final Map<View, String> LIZLLL;
    public final Map<String, a> LJ;
    public String LJFF;
    public View LJI;
    public final View LJII;
    public final View LJIIIIZZ;
    public final View LJIIIZ;
    public TransitionSet LJIIJ;
    public TransitionSet LJIIJJI;
    
    static {
        Covode.recordClassIndex(5874);
    }
    
    public 0de(final Context context, final AttributeSet set) {
        this(context, set, (byte)0);
    }
    
    public 0de(final Context context, final AttributeSet set, final byte b) {
        super(context, set, 0);
        MethodCollector.i(10046);
        this.LIZJ = new 13j<String, View>();
        this.LIZLLL = new 13j<View, String>();
        this.LJ = new 13j<String, a>();
        this.LJI = (View)new FrameLayout(context);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, new int[] { 2130969395, 2130969508, 2130969509, 2130969525, 2130969528, 2130970599, 2130970704, 2130970705, 2130971659, 2130971661 }, 0, 0);
        this.setLoadingViewSrc(obtainStyledAttributes.getResourceId(5, -1));
        this.setContentViewSrc(obtainStyledAttributes.getResourceId(0, -1));
        this.setEmptyViewSrc(obtainStyledAttributes.getResourceId(2, -1));
        this.setErrorViewSrc(obtainStyledAttributes.getResourceId(4, -1));
        this.setOfflineViewSrc(obtainStyledAttributes.getResourceId(7, -1));
        this.LJII = this.findViewById(obtainStyledAttributes.getResourceId(1, 0));
        this.LJIIIIZZ = this.findViewById(obtainStyledAttributes.getResourceId(3, 0));
        this.LJIIIZ = this.findViewById(obtainStyledAttributes.getResourceId(6, 0));
        this.LIZ = obtainStyledAttributes.getBoolean(8, true);
        this.LIZIZ = obtainStyledAttributes.getBoolean(9, false);
        obtainStyledAttributes.recycle();
        this.LJIIJ = new TransitionSet().addTransition((Transition)new Fade(1)).setDuration(300L).setInterpolator((TimeInterpolator)new AccelerateInterpolator());
        this.LJIIJJI = new TransitionSet().addTransition((Transition)new Fade(2)).setDuration(300L).setInterpolator((TimeInterpolator)new DecelerateInterpolator());
        MethodCollector.o(10046);
    }
    
    private void LIZ(final String s, final View view) {
        this.LIZJ.put(s, view);
        view.setVisibility(8);
        if (view.getParent() == this) {
            return;
        }
        this.addView(view);
        if (this.LJ.containsKey(s)) {
            view.setOnClickListener((View$OnClickListener)this);
        }
    }
    
    public final void LIZ(final String ljff) {
        if (ljff.equals(this.LJFF)) {
            return;
        }
        if (this.LIZJ.containsKey(this.LJFF)) {
            if (this.LIZIZ && this.LJIIJJI != null) {
                TransitionManager.beginDelayedTransition((ViewGroup)this, (Transition)new TransitionSet().addTransition((Transition)this.LJIIJJI).addTarget((View)this.LIZJ.get(this.LJFF)));
            }
            this.LIZJ.get(this.LJFF).setVisibility(8);
        }
        if (this.LIZJ.containsKey(ljff)) {
            if (this.LIZ && this.LJIIJ != null) {
                TransitionManager.beginDelayedTransition((ViewGroup)this, (Transition)new TransitionSet().addTransition((Transition)this.LJIIJ).addTarget((View)this.LIZJ.get(ljff)));
            }
            this.LIZJ.get(ljff).setVisibility(0);
        }
        this.LJFF = ljff;
    }
    
    public final void LIZ(final String s, final int n) {
        if (n == -1) {
            this.LIZ(s, this.LJI);
            return;
        }
        this.LIZ(s, 0II.LIZ(LayoutInflater.from(this.getContext()), n, (ViewGroup)this, false));
    }
    
    public void onClick(final View view) {
        final a a = this.LJ.get(this.LIZLLL.get(view));
        if (a != null) {
            a.LIZ();
        }
    }
    
    public void setContentView(final View view) {
        this.LIZ("CONTENT", view);
    }
    
    public void setContentViewSrc(final int n) {
        this.LIZ("CONTENT", n);
    }
    
    public void setEmptyClickListener(final a a) {
        this.LJ.put("EMPTY", a);
        final View ljii = this.LJII;
        if (ljii == null) {
            if (this.LIZJ.containsKey("EMPTY")) {
                this.LIZJ.get("EMPTY").setOnClickListener((View$OnClickListener)this);
                this.LIZLLL.put(this.LIZJ.get("EMPTY"), "EMPTY");
            }
        }
        else {
            ljii.setOnClickListener((View$OnClickListener)this);
            this.LIZLLL.put(this.LJII, "EMPTY");
        }
    }
    
    public void setEmptyView(final View view) {
        this.LIZ("EMPTY", view);
    }
    
    public void setEmptyViewSrc(final int n) {
        this.LIZ("EMPTY", n);
    }
    
    public void setErrorClickListener(final a a) {
        this.LJ.put("ERROR", a);
        final View ljiiiizz = this.LJIIIIZZ;
        if (ljiiiizz == null) {
            if (this.LIZJ.containsKey("ERROR")) {
                this.LIZJ.get("ERROR").setOnClickListener((View$OnClickListener)this);
                this.LIZLLL.put(this.LIZJ.get("ERROR"), "ERROR");
            }
        }
        else {
            ljiiiizz.setOnClickListener((View$OnClickListener)this);
            this.LIZLLL.put(this.LJIIIIZZ, "ERROR");
        }
    }
    
    public void setErrorView(final View view) {
        this.LIZ("ERROR", view);
    }
    
    public void setErrorViewSrc(final int n) {
        this.LIZ("ERROR", n);
    }
    
    public void setInTransition(final TransitionSet ljiij) {
        this.LJIIJ = ljiij;
    }
    
    public void setLoadingView(final View view) {
        this.LIZ("LOADING", view);
    }
    
    public void setLoadingViewSrc(final int n) {
        this.LIZ("LOADING", n);
    }
    
    public void setOfflineClickListener(final a a) {
        this.LJ.put("OFFLINE", a);
        final View ljiiiz = this.LJIIIZ;
        if (ljiiiz == null) {
            if (this.LIZJ.containsKey("OFFLINE")) {
                this.LIZJ.get("OFFLINE").setOnClickListener((View$OnClickListener)this);
                this.LIZLLL.put(this.LIZJ.get("OFFLINE"), "OFFLINE");
            }
        }
        else {
            ljiiiz.setOnClickListener((View$OnClickListener)this);
            this.LIZLLL.put(this.LJIIIZ, "OFFLINE");
        }
    }
    
    public void setOfflineView(final View view) {
        this.LIZ("OFFLINE", view);
    }
    
    public void setOfflineViewSrc(final int n) {
        this.LIZ("OFFLINE", n);
    }
    
    public void setOutTransition(final TransitionSet ljiijji) {
        this.LJIIJJI = ljiijji;
    }
    
    public interface a
    {
        default static {
            Covode.recordClassIndex(5875);
        }
        
        void LIZ();
    }
}
