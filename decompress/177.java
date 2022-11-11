// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import java.util.ArrayList;
import com.bytedance.covode.number.Covode;
import java.util.IdentityHashMap;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.List;

public final class 177 implements 0Fg.a
{
    public final 176 LIZ;
    public final 0Eo LIZIZ;
    public List<WeakReference<RecyclerView>> LIZJ;
    public final IdentityHashMap<RecyclerView.ViewHolder, 0Fg> LIZLLL;
    public List<0Fg> LJ;
    public a LJFF;
    public final 176.a.b LJI;
    public final 0Eg LJII;
    
    static {
        Covode.recordClassIndex(1607);
    }
    
    public 177(final 176 liz, final 176.a a) {
        this.LIZJ = new ArrayList<WeakReference<RecyclerView>>();
        this.LIZLLL = new IdentityHashMap<RecyclerView.ViewHolder, 0Fg>();
        this.LJ = new ArrayList<0Fg>();
        this.LJFF = new a();
        this.LIZ = liz;
        if (a.LIZ) {
            this.LIZIZ = new 0Eo.a();
        }
        else {
            this.LIZIZ = new 0Eo.b();
        }
        this.LJI = a.LIZIZ;
        if (a.LIZIZ == 176.a.b.NO_STABLE_IDS) {
            this.LJII = new 0Eg.b();
            return;
        }
        if (a.LIZIZ == 176.a.b.ISOLATED_STABLE_IDS) {
            this.LJII = new 0Eg.a();
            return;
        }
        if (a.LIZIZ == 176.a.b.SHARED_STABLE_IDS) {
            this.LJII = new 0Eg.c();
            return;
        }
        throw new IllegalArgumentException("unknown stable id mode");
    }
    
    private 0Fg LIZJ(final RecyclerView.a<RecyclerView.ViewHolder> a) {
        final int liz = this.LIZ(a);
        if (liz == -1) {
            return null;
        }
        return this.LJ.get(liz);
    }
    
    private RecyclerView.a.a LJ() {
        for (final 0Fg 0Fg : this.LJ) {
            final RecyclerView.a.a mStateRestorationPolicy = 0Fg.LIZJ.mStateRestorationPolicy;
            if (mStateRestorationPolicy == RecyclerView.a.a.PREVENT) {
                return RecyclerView.a.a.PREVENT;
            }
            if (mStateRestorationPolicy == RecyclerView.a.a.PREVENT_WHEN_EMPTY && 0Fg.LJ == 0) {
                return RecyclerView.a.a.PREVENT;
            }
        }
        return RecyclerView.a.a.ALLOW;
    }
    
    public final int LIZ(final RecyclerView.a<RecyclerView.ViewHolder> a) {
        for (int size = this.LJ.size(), i = 0; i < size; ++i) {
            if (this.LJ.get(i).LIZJ == a) {
                return i;
            }
        }
        return -1;
    }
    
    public final int LIZ(final 0Fg 0Fg) {
        final Iterator<0Fg> iterator = this.LJ.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final 0Fg 0Fg2 = iterator.next();
            if (0Fg2 == 0Fg) {
                break;
            }
            n += 0Fg2.LJ;
        }
        return n;
    }
    
    public final a LIZ(final int n) {
        a ljff;
        if (this.LJFF.LIZJ) {
            ljff = new a();
        }
        else {
            this.LJFF.LIZJ = true;
            ljff = this.LJFF;
        }
        final Iterator<0Fg> iterator = this.LJ.iterator();
        int liziz = n;
        while (iterator.hasNext()) {
            final 0Fg liz = iterator.next();
            if (liz.LJ > liziz) {
                ljff.LIZ = liz;
                ljff.LIZIZ = liziz;
                break;
            }
            liziz -= liz.LJ;
        }
        if (ljff.LIZ != null) {
            return ljff;
        }
        throw new IllegalArgumentException("Cannot find wrapper for ".concat(String.valueOf(n)));
    }
    
    public final 0Fg LIZ(final RecyclerView.ViewHolder viewHolder) {
        final 0Fg 0Fg = this.LIZLLL.get(viewHolder);
        if (0Fg != null) {
            return 0Fg;
        }
        final StringBuilder sb = new StringBuilder("Cannot find wrapper for ");
        sb.append(viewHolder);
        sb.append(", seems like it is not bound by this adapter: ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }
    
    @Override
    public final void LIZ() {
        ((RecyclerView.a)this.LIZ).notifyDataSetChanged();
        this.LIZJ();
    }
    
    public final void LIZ(final a ljff) {
        ljff.LIZJ = false;
        ljff.LIZ = null;
        ljff.LIZIZ = -1;
        this.LJFF = ljff;
    }
    
    @Override
    public final void LIZ(final 0Fg 0Fg, final int n, final int n2) {
        ((RecyclerView.a)this.LIZ).notifyItemRangeInserted(n + this.LIZ(0Fg), n2);
    }
    
    @Override
    public final void LIZ(final 0Fg 0Fg, final int n, final int n2, final Object o) {
        ((RecyclerView.a)this.LIZ).notifyItemRangeChanged(n + this.LIZ(0Fg), n2, o);
    }
    
    public final boolean LIZ(final int n, final RecyclerView.a<RecyclerView.ViewHolder> a) {
        if (n < 0 || n > this.LJ.size()) {
            final StringBuilder sb = new StringBuilder("Index must be between 0 and ");
            sb.append(this.LJ.size());
            sb.append(". Given:");
            sb.append(n);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (this.LIZLLL()) {
            07U.LIZ(a.mHasStableIds, (Object)"All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS");
        }
        if (this.LIZJ(a) != null) {
            return false;
        }
        final 0Fg 0Fg = new 0Fg(a, (0Fg.a)this, this.LIZIZ, this.LJII.LIZ());
        this.LJ.add(n, 0Fg);
        final Iterator<WeakReference<RecyclerView>> iterator = this.LIZJ.iterator();
        while (iterator.hasNext()) {
            final RecyclerView recyclerView = iterator.next().get();
            if (recyclerView != null) {
                a.onAttachedToRecyclerView(recyclerView);
            }
        }
        if (0Fg.LJ > 0) {
            ((RecyclerView.a)this.LIZ).notifyItemRangeInserted(this.LIZ(0Fg), 0Fg.LJ);
        }
        this.LIZJ();
        return true;
    }
    
    @Override
    public final void LIZIZ() {
        this.LIZJ();
    }
    
    @Override
    public final void LIZIZ(final 0Fg 0Fg, final int n, final int n2) {
        ((RecyclerView.a)this.LIZ).notifyItemRangeRemoved(n + this.LIZ(0Fg), n2);
    }
    
    public final boolean LIZIZ(final RecyclerView.a<RecyclerView.ViewHolder> a) {
        return this.LIZ(this.LJ.size(), a);
    }
    
    public final void LIZJ() {
        final RecyclerView.a.a lj = this.LJ();
        if (lj != this.LIZ.mStateRestorationPolicy) {
            this.LIZ.LIZ(lj);
        }
    }
    
    @Override
    public final void LIZJ(final 0Fg 0Fg, final int n, final int n2) {
        final int liz = this.LIZ(0Fg);
        ((RecyclerView.a)this.LIZ).notifyItemMoved(n + liz, n2 + liz);
    }
    
    public final boolean LIZLLL() {
        return this.LJI != 176.a.b.NO_STABLE_IDS;
    }
    
    public static final class a
    {
        public 0Fg LIZ;
        public int LIZIZ;
        public boolean LIZJ;
        
        static {
            Covode.recordClassIndex(1608);
        }
    }
}
