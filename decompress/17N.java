// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ViewGroup;
import java.util.WeakHashMap;
import java.util.Map;
import android.view.accessibility.AccessibilityEvent;
import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import androidx.recyclerview.widget.RecyclerView;

public class 17N extends 07k
{
    public final RecyclerView LIZIZ;
    public final a LIZJ;
    
    static {
        Covode.recordClassIndex(1670);
    }
    
    public 17N(final RecyclerView liziz) {
        this.LIZIZ = liziz;
        final a lizj = this.LIZJ;
        if (lizj != null && lizj instanceof a) {
            this.LIZJ = lizj;
            return;
        }
        this.LIZJ = new a(this);
    }
    
    @Override
    public final void LIZ(final View view, final 07e 07e) {
        super.LIZ(view, 07e);
        if (!this.LIZIZ.LJIILIIL() && this.LIZIZ.getLayoutManager() != null) {
            final RecyclerView.i layoutManager = this.LIZIZ.getLayoutManager();
            final RecyclerView.o lj = layoutManager.LJIL.LJ;
            final RecyclerView.t ljjij = layoutManager.LJIL.LJJIJ;
            if (layoutManager.LJIL.canScrollVertically(-1) || layoutManager.LJIL.canScrollHorizontally(-1)) {
                07e.LIZ(8192);
                07e.LJIIIZ(true);
            }
            if (layoutManager.LJIL.canScrollVertically(1) || layoutManager.LJIL.canScrollHorizontally(1)) {
                07e.LIZ(4096);
                07e.LJIIIZ(true);
            }
            07e.LIZ(07e.b.LIZ(layoutManager.LIZ(lj, ljjij), layoutManager.LIZIZ(lj, ljjij), 0));
        }
    }
    
    @Override
    public final boolean LIZ(final View view, int n, final Bundle bundle) {
        if (super.LIZ(view, n, bundle)) {
            return true;
        }
        if (this.LIZIZ.LJIILIIL() || this.LIZIZ.getLayoutManager() == null) {
            return false;
        }
        final RecyclerView.i layoutManager = this.LIZIZ.getLayoutManager();
        if (layoutManager.LJIL == null) {
            return false;
        }
        while (true) {
            int n2 = 0;
            Label_0199: {
                if (n != 4096) {
                    if (n == 8192) {
                        if (layoutManager.LJIL.canScrollVertically(-1)) {
                            n = -(layoutManager.LJJIJL - layoutManager.LJIJJLI() - layoutManager.LJJ());
                        }
                        else {
                            n = 0;
                        }
                        n2 = n;
                        if (layoutManager.LJIL.canScrollHorizontally(-1)) {
                            final int n3 = -(layoutManager.LJJIJIL - layoutManager.LJIJJ() - layoutManager.LJIL());
                            break Label_0187;
                        }
                        break Label_0199;
                    }
                }
                else {
                    if (layoutManager.LJIL.canScrollVertically(1)) {
                        n = layoutManager.LJJIJL - layoutManager.LJIJJLI() - layoutManager.LJJ();
                    }
                    else {
                        n = 0;
                    }
                    n2 = n;
                    if (layoutManager.LJIL.canScrollHorizontally(1)) {
                        final int n3 = layoutManager.LJJIJIL - layoutManager.LJIJJ() - layoutManager.LJIL();
                        break Label_0187;
                    }
                    break Label_0199;
                }
                return false;
                int n3 = 0;
                if (n == 0 && n3 == 0) {
                    return false;
                }
                layoutManager.LJIL.LIZ(n3, n, true);
                return true;
            }
            final int n3 = 0;
            n = n2;
            continue;
        }
    }
    
    @Override
    public final void LIZLLL(final View view, final AccessibilityEvent accessibilityEvent) {
        super.LIZLLL(view, accessibilityEvent);
        if (view instanceof RecyclerView && !this.LIZIZ.LJIILIIL()) {
            final RecyclerView recyclerView = (RecyclerView)view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().LIZ(accessibilityEvent);
            }
        }
    }
    
    public static final class a extends 07k
    {
        public final 17N LIZIZ;
        public Map<View, 07k> LIZJ;
        
        static {
            Covode.recordClassIndex(1671);
        }
        
        public a(final 17N liziz) {
            this.LIZJ = new WeakHashMap<View, 07k>();
            this.LIZIZ = liziz;
        }
        
        @Override
        public final 07g LIZ(final View view) {
            final 07k 07k = this.LIZJ.get(view);
            if (07k != null) {
                return 07k.LIZ(view);
            }
            return super.LIZ(view);
        }
        
        @Override
        public final void LIZ(final View view, final int n) {
            final 07k 07k = this.LIZJ.get(view);
            if (07k != null) {
                07k.LIZ(view, n);
                return;
            }
            super.LIZ(view, n);
        }
        
        @Override
        public final void LIZ(final View view, final 07e 07e) {
            if (this.LIZIZ.LIZIZ.LJIILIIL() || this.LIZIZ.LIZIZ.getLayoutManager() == null) {
                super.LIZ(view, 07e);
                return;
            }
            this.LIZIZ.LIZIZ.getLayoutManager().LIZ(view, 07e);
            final 07k 07k = this.LIZJ.get(view);
            if (07k != null) {
                07k.LIZ(view, 07e);
                return;
            }
            super.LIZ(view, 07e);
        }
        
        @Override
        public final void LIZ(final View view, final AccessibilityEvent accessibilityEvent) {
            final 07k 07k = this.LIZJ.get(view);
            if (07k != null) {
                07k.LIZ(view, accessibilityEvent);
                return;
            }
            super.LIZ(view, accessibilityEvent);
        }
        
        @Override
        public final boolean LIZ(final View view, final int n, final Bundle bundle) {
            if (!this.LIZIZ.LIZIZ.LJIILIIL() && this.LIZIZ.LIZIZ.getLayoutManager() != null) {
                final 07k 07k = this.LIZJ.get(view);
                if (07k != null) {
                    if (07k.LIZ(view, n, bundle)) {
                        return true;
                    }
                }
                else if (super.LIZ(view, n, bundle)) {
                    return true;
                }
                this.LIZIZ.LIZIZ.getLayoutManager();
                return false;
            }
            return super.LIZ(view, n, bundle);
        }
        
        @Override
        public final boolean LIZ(final ViewGroup viewGroup, final View view, final AccessibilityEvent accessibilityEvent) {
            final 07k 07k = this.LIZJ.get(viewGroup);
            if (07k != null) {
                return 07k.LIZ(viewGroup, view, accessibilityEvent);
            }
            return super.LIZ(viewGroup, view, accessibilityEvent);
        }
        
        @Override
        public final boolean LIZIZ(final View view, final AccessibilityEvent accessibilityEvent) {
            final 07k 07k = this.LIZJ.get(view);
            if (07k != null) {
                return 07k.LIZIZ(view, accessibilityEvent);
            }
            return super.LIZIZ(view, accessibilityEvent);
        }
        
        public final 07k LIZJ(final View view) {
            return this.LIZJ.remove(view);
        }
        
        @Override
        public final void LIZJ(final View view, final AccessibilityEvent accessibilityEvent) {
            final 07k 07k = this.LIZJ.get(view);
            if (07k != null) {
                07k.LIZJ(view, accessibilityEvent);
                return;
            }
            super.LIZJ(view, accessibilityEvent);
        }
        
        @Override
        public final void LIZLLL(final View view, final AccessibilityEvent accessibilityEvent) {
            final 07k 07k = this.LIZJ.get(view);
            if (07k != null) {
                07k.LIZLLL(view, accessibilityEvent);
                return;
            }
            super.LIZLLL(view, accessibilityEvent);
        }
    }
}
