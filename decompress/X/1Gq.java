// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View;
import java.util.Collections;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class 1gq extends 1B2 implements 0Ir.c
{
    public static final 0FM.e<0J7<?>> LJIIIZ;
    public final 1Ay LJ;
    public final 0Ir LJFF;
    public final 0J4 LJI;
    public final List<0Ig> LJII;
    public int LJIIIIZZ;
    
    static {
        Covode.recordClassIndex(2182);
        LJIIIZ = new 1B7();
    }
    
    public 1gq(final 0J4 lji, final Handler handler) {
        final 1Ay lj = new 1Ay();
        this.LJ = lj;
        this.LJII = new ArrayList<0Ig>();
        this.LJI = lji;
        this.LJFF = new 0Ir(handler, (0Ir.c)this, 1gq.LJIIIZ);
        ((RecyclerView.a)this).registerAdapterDataObserver(lj);
    }
    
    @Override
    public final int LIZ(final 0J7<?> 0j7) {
        for (int size = this.LJFF.LJFF.size(), i = 0; i < size; ++i) {
            if (((0J7)this.LJFF.LJFF.get(i)).LIZ == 0j7.LIZ) {
                return i;
            }
        }
        return -1;
    }
    
    @Override
    public final List<? extends 0J7<?>> LIZ() {
        return this.LJFF.LJFF;
    }
    
    @Override
    public final void LIZ(final 0Ix 0Ix) {
        this.LJIIIIZZ = 0Ix.LIZIZ.size();
        this.LJ.LIZ = true;
        final 173 173 = new 173(this);
        if (0Ix.LIZJ != null) {
            0Ix.LIZJ.LIZ(173);
        }
        else if (0Ix.LIZIZ.isEmpty() && !0Ix.LIZ.isEmpty()) {
            173.LIZIZ(0, 0Ix.LIZ.size());
        }
        else if (!0Ix.LIZIZ.isEmpty() && 0Ix.LIZ.isEmpty()) {
            173.LIZ(0, 0Ix.LIZIZ.size());
        }
        this.LJ.LIZ = false;
        for (int i = this.LJII.size() - 1; i >= 0; --i) {
            this.LJII.get(i);
        }
    }
    
    public final void LIZ(final 1B4 1b4) {
        MethodCollector.i(15883);
        final List<? extends 0J7<?>> ljff = this.LJFF.LJFF;
        if (!ljff.isEmpty()) {
            int i = 0;
            if (((0J7)ljff.get(0)).LIZLLL()) {
                while (i < ljff.size()) {
                    ((0J7)ljff.get(i)).LIZ("The model was changed between being bound and when models were rebuilt", i);
                    ++i;
                }
            }
        }
        final 0Ir ljff2 = this.LJFF;
        monitorenter(ljff2);
        try {
            final int liz = ljff2.LIZLLL.LIZ();
            final List<? extends 0J7<?>> lj = ljff2.LJ;
            monitorexit(ljff2);
            if (1b4 == lj) {
                List<? extends 0J7<?>> emptyList;
                if ((emptyList = lj) == null) {
                    emptyList = Collections.emptyList();
                }
                ljff2.LIZ(liz, 1b4, new 0Ix(emptyList, emptyList, null));
                MethodCollector.o(15883);
                return;
            }
            if (1b4 == null || 1b4.isEmpty()) {
                0Ix 0Ix;
                if (lj != null && !lj.isEmpty()) {
                    0Ix = new 0Ix(lj, Collections.EMPTY_LIST, null);
                }
                else {
                    0Ix = null;
                }
                ljff2.LIZ(liz, null, 0Ix);
                MethodCollector.o(15883);
                return;
            }
            if (lj == null || lj.isEmpty()) {
                ljff2.LIZ(liz, 1b4, new 0Ix(Collections.EMPTY_LIST, 1b4, null));
                MethodCollector.o(15883);
                return;
            }
            ljff2.LIZ.execute(new 0In(ljff2, new 0Ir.a(lj, 1b4, ljff2.LIZJ), liz, 1b4, lj));
            MethodCollector.o(15883);
        }
        finally {
            monitorexit(ljff2);
            MethodCollector.o(15883);
        }
    }
    
    @Override
    public final void LIZ(final 1BD 1bd) {
        super.LIZ(1bd);
        this.LJI.onViewAttachedToWindow(1bd, 1bd.LIZIZ());
    }
    
    @Override
    public final void LIZ(final 1BD 1bd, final 0J7<?> 0j7) {
        this.LJI.onModelUnbound(1bd, 0j7);
    }
    
    @Override
    public final void LIZ(final 1BD 1bd, final 0J7<?> 0j7, final int n, final 0J7<?> 0j8) {
        this.LJI.onModelBound(1bd, 0j7, n, 0j8);
    }
    
    @Override
    public final void LIZ(final View view) {
        this.LJI.setupStickyHeaderView(view);
    }
    
    @Override
    public final void LIZ(final RuntimeException ex) {
        this.LJI.onExceptionSwallowed(ex);
    }
    
    @Override
    public final void LIZIZ(final 1BD 1bd) {
        super.LIZIZ(1bd);
        this.LJI.onViewDetachedFromWindow(1bd, 1bd.LIZIZ());
    }
    
    @Override
    public final void LIZIZ(final View view) {
        this.LJI.teardownStickyHeaderView(view);
    }
    
    @Override
    public final boolean LIZIZ() {
        return true;
    }
    
    @Override
    public final boolean LIZIZ(final int n) {
        return this.LJI.isStickyHeader(n);
    }
    
    @Override
    public final 0It LIZJ() {
        return super.LIZJ();
    }
    
    @Override
    public final int getItemCount() {
        return this.LJIIIIZZ;
    }
    
    @Override
    public final void onAttachedToRecyclerView(final RecyclerView recyclerView) {
        this.LJI.onAttachedToRecyclerViewInternal(recyclerView);
    }
    
    @Override
    public final void onDetachedFromRecyclerView(final RecyclerView recyclerView) {
        this.LJI.onDetachedFromRecyclerViewInternal(recyclerView);
    }
}
