// 
// Decompiled by Procyon v0.6.0
// 

package androidx.activity;

import X.0CG;
import X.15t;
import X.01f;
import X.0CC;
import X.0CH;
import java.util.Iterator;
import com.bytedance.covode.number.Covode;
import X.01j;
import java.util.ArrayDeque;

public final class OnBackPressedDispatcher
{
    public final ArrayDeque<01j> LIZ;
    public final Runnable LIZIZ;
    
    static {
        Covode.recordClassIndex(205);
    }
    
    public OnBackPressedDispatcher() {
        this(null);
    }
    
    public OnBackPressedDispatcher(final Runnable liziz) {
        this.LIZ = new ArrayDeque<01j>();
        this.LIZIZ = liziz;
    }
    
    public final void LIZ() {
        final Iterator<01j> descendingIterator = this.LIZ.descendingIterator();
        while (descendingIterator.hasNext()) {
            final 01j 01j = descendingIterator.next();
            if (01j.LIZ) {
                01j.LIZIZ();
                return;
            }
        }
        final Runnable liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.run();
        }
    }
    
    public final void LIZ(final 0CH 0ch, final 01j 01j) {
        final 0CC lifecycle = 0ch.getLifecycle();
        if (lifecycle.LIZ() == 0CC.b.DESTROYED) {
            return;
        }
        01j.LIZ(new LifecycleOnBackPressedCancellable(lifecycle, 01j));
    }
    
    public class LifecycleOnBackPressedCancellable implements 01f, 15t
    {
        public final 0CC LIZIZ;
        public final 01j LIZJ;
        public 01f LIZLLL;
        
        static {
            Covode.recordClassIndex(206);
        }
        
        public LifecycleOnBackPressedCancellable(final 0CC liziz, final 01j lizj) {
            this.LIZIZ = liziz;
            this.LIZJ = lizj;
            liziz.LIZ(this);
        }
        
        @Override
        public final void LIZ() {
            this.LIZIZ.LIZIZ(this);
            this.LIZJ.LIZIZ(this);
            final 01f lizlll = this.LIZLLL;
            if (lizlll != null) {
                lizlll.LIZ();
                this.LIZLLL = null;
            }
        }
        
        @Override
        public void onStateChanged(final 0CH 0ch, final 0CC.a a) {
            if (a == 0CC.a.ON_START) {
                final OnBackPressedDispatcher liz = OnBackPressedDispatcher.this;
                final 01j lizj = this.LIZJ;
                liz.LIZ.add(lizj);
                final a lizlll = liz.new a(lizj);
                lizj.LIZ(lizlll);
                this.LIZLLL = lizlll;
                return;
            }
            if (a == 0CC.a.ON_STOP) {
                final 01f lizlll2 = this.LIZLLL;
                if (lizlll2 != null) {
                    lizlll2.LIZ();
                }
            }
            else if (a == 0CC.a.ON_DESTROY) {
                this.LIZ();
            }
        }
    }
}
