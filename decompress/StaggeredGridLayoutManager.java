// 
// Decompiled by Procyon v0.6.0
// 

package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import java.util.ArrayList;
import java.util.List;
import android.graphics.PointF;
import X.17G;
import android.view.accessibility.AccessibilityEvent;
import android.os.Parcelable;
import java.util.Arrays;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import X.0Ee;
import android.view.View$MeasureSpec;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.graphics.Rect;
import java.util.BitSet;
import X.0Fd;
import X.0Fj;

public class StaggeredGridLayoutManager extends i implements s.b
{
    public int LIZ;
    public c[] LIZIZ;
    public 0Fj LIZJ;
    public 0Fj LIZLLL;
    public int LJ;
    public boolean LJFF;
    public boolean LJI;
    public int LJII;
    public int LJIIIIZZ;
    public LazySpanLookup LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public final 0Fd LJIIL;
    public BitSet LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public SavedState LJIILLIIL;
    public int LJIIZILJ;
    public final Rect LJIJ;
    public final StaggeredGridLayoutManager.a LJIJI;
    public boolean LJIJJ;
    public boolean LJJIJLIJ;
    public int[] LJJIL;
    public final Runnable LJJIZ;
    
    static {
        Covode.recordClassIndex(1552);
    }
    
    public StaggeredGridLayoutManager(final int n, final int lj) {
        this.LIZ = -1;
        this.LJII = -1;
        this.LJIIIIZZ = Integer.MIN_VALUE;
        this.LJIIIZ = new LazySpanLookup();
        this.LJIIJ = 2;
        this.LJIJ = new Rect();
        this.LJIJI = new StaggeredGridLayoutManager.a(this);
        this.LJIJJ = false;
        this.LJJIJLIJ = true;
        this.LJJIZ = new Runnable() {
            static {
                Covode.recordClassIndex(1553);
            }
            
            @Override
            public final void run() {
                StaggeredGridLayoutManager.this.LJII();
            }
        };
        this.LJ = lj;
        this.LIZ(n);
        this.LJIIL = new 0Fd();
        this.LJIIJJI();
    }
    
    public StaggeredGridLayoutManager(final Context context, final AttributeSet set, int liz, final int n) {
        this.LIZ = -1;
        this.LJII = -1;
        this.LJIIIIZZ = Integer.MIN_VALUE;
        this.LJIIIZ = new LazySpanLookup();
        this.LJIIJ = 2;
        this.LJIJ = new Rect();
        this.LJIJI = new StaggeredGridLayoutManager.a(this);
        this.LJIJJ = false;
        this.LJJIJLIJ = true;
        this.LJJIZ = new Runnable() {
            static {
                Covode.recordClassIndex(1553);
            }
            
            @Override
            public final void run() {
                StaggeredGridLayoutManager.this.LJII();
            }
        };
        final i.b liz2 = i.LIZ(context, set, liz, n);
        liz = liz2.LIZ;
        if (liz == 0 || liz == 1) {
            ((RecyclerView.i)this).LIZ((String)null);
            if (liz != this.LJ) {
                this.LJ = liz;
                final 0Fj lizj = this.LIZJ;
                this.LIZJ = this.LIZLLL;
                this.LIZLLL = lizj;
                ((RecyclerView.i)this).LJIILJJIL();
            }
            this.LIZ(liz2.LIZIZ);
            this.LIZ(liz2.LIZJ);
            this.LJIIL = new 0Fd();
            this.LJIIJJI();
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }
    
    private int LIZ(final o o, final 0Fd 0Fd, final t t) {
        this.LJIILIIL.set(0, this.LIZ, true);
        int n;
        if (this.LJIIL.LJIIIIZZ) {
            if (0Fd.LJ == 1) {
                n = Integer.MAX_VALUE;
            }
            else {
                n = Integer.MIN_VALUE;
            }
        }
        else if (0Fd.LJ == 1) {
            n = 0Fd.LJI + 0Fd.LIZIZ;
        }
        else {
            n = 0Fd.LJFF - 0Fd.LIZIZ;
        }
        this.LJ(0Fd.LJ, n);
        int n2;
        if (this.LJI) {
            n2 = this.LIZJ.LIZJ();
        }
        else {
            n2 = this.LIZJ.LIZIZ();
        }
        boolean b = false;
        while (0Fd.LIZ(t) && (this.LJIIL.LJIIIIZZ || !this.LJIILIIL.isEmpty())) {
            final View liz = 0Fd.LIZ(o);
            final StaggeredGridLayoutManager.b b2 = (StaggeredGridLayoutManager.b)liz.getLayoutParams();
            final int layoutPosition = ((j)b2).LIZJ.getLayoutPosition();
            final int lizj = this.LJIIIZ.LIZJ(layoutPosition);
            boolean b3;
            c liz2;
            if (lizj == -1) {
                b3 = true;
                if (b2.LIZIZ) {
                    liz2 = this.LIZIZ[0];
                }
                else {
                    liz2 = this.LIZ(0Fd);
                }
                this.LJIIIZ.LIZ(layoutPosition, liz2);
            }
            else {
                b3 = false;
                liz2 = this.LIZIZ[lizj];
            }
            b2.LIZ = liz2;
            if (0Fd.LJ == 1) {
                ((RecyclerView.i)this).LJ(liz);
            }
            else {
                ((RecyclerView.i)this).LIZ(liz, 0);
            }
            this.LIZ(liz, b2);
            int n5;
            int n6;
            if (0Fd.LJ == 1) {
                int n3;
                if (b2.LIZIZ) {
                    n3 = this.LJIILJJIL(n2);
                }
                else {
                    n3 = liz2.LIZIZ(n2);
                }
                final int n4 = n5 = this.LIZJ.LJ(liz) + n3;
                n6 = n3;
                if (b3) {
                    n5 = n4;
                    n6 = n3;
                    if (b2.LIZIZ) {
                        final FullSpanItem ljiij = this.LJIIJ(n3);
                        ljiij.LIZIZ = -1;
                        ljiij.LIZ = layoutPosition;
                        this.LJIIIZ.LIZ(ljiij);
                        n6 = n3;
                        n5 = n4;
                    }
                }
            }
            else {
                int n7;
                if (b2.LIZIZ) {
                    n7 = this.LJIILIIL(n2);
                }
                else {
                    n7 = liz2.LIZ(n2);
                }
                final int n8 = n7 - this.LIZJ.LJ(liz);
                n5 = n7;
                n6 = n8;
                if (b3) {
                    n5 = n7;
                    n6 = n8;
                    if (b2.LIZIZ) {
                        final FullSpanItem ljiijji = this.LJIIJJI(n7);
                        ljiijji.LIZIZ = 1;
                        ljiijji.LIZ = layoutPosition;
                        this.LJIIIZ.LIZ(ljiijji);
                        n5 = n7;
                        n6 = n8;
                    }
                }
            }
            Label_0369: {
                if (b2.LIZIZ && 0Fd.LIZLLL == -1) {
                    if (!b3) {
                        boolean b4;
                        if (0Fd.LJ == 1) {
                            b4 = this.LJJIJ();
                        }
                        else {
                            b4 = this.LJJIJIIJI();
                        }
                        if (!(b4 ^ true)) {
                            break Label_0369;
                        }
                        final FullSpanItem lizlll = this.LJIIIZ.LIZLLL(layoutPosition);
                        if (lizlll != null) {
                            lizlll.LIZLLL = true;
                        }
                    }
                    this.LJIJJ = true;
                }
            }
            this.LIZ(liz, b2, 0Fd);
            int n10;
            int liziz;
            if (this.LJJIIZI() && this.LJ == 1) {
                int lizj2;
                if (b2.LIZIZ) {
                    lizj2 = this.LIZLLL.LIZJ();
                }
                else {
                    lizj2 = this.LIZLLL.LIZJ() - (this.LIZ - 1 - liz2.LJ) * this.LJIIJJI;
                }
                final int n9 = lizj2 - this.LIZLLL.LJ(liz);
                n10 = lizj2;
                liziz = n9;
            }
            else {
                if (b2.LIZIZ) {
                    liziz = this.LIZLLL.LIZIZ();
                }
                else {
                    liziz = liz2.LJ * this.LJIIJJI + this.LIZLLL.LIZIZ();
                }
                n10 = this.LIZLLL.LJ(liz) + liziz;
            }
            if (this.LJ == 1) {
                ((RecyclerView.i)this).LIZIZ(liz, liziz, n6, n10, n5);
            }
            else {
                ((RecyclerView.i)this).LIZIZ(liz, n6, liziz, n5, n10);
            }
            if (b2.LIZIZ) {
                this.LJ(this.LJIIL.LJ, n);
            }
            else {
                this.LIZ(liz2, this.LJIIL.LJ, n);
            }
            this.LIZ(o, this.LJIIL);
            if (this.LJIIL.LJII && liz.hasFocusable()) {
                if (b2.LIZIZ) {
                    this.LJIILIIL.clear();
                }
                else {
                    this.LJIILIIL.set(liz2.LJ, false);
                }
            }
            b = true;
        }
        if (!b) {
            this.LIZ(o, this.LJIIL);
        }
        int n11;
        if (this.LJIIL.LJ == -1) {
            n11 = this.LIZJ.LIZIZ() - this.LJIILIIL(this.LIZJ.LIZIZ());
        }
        else {
            n11 = this.LJIILJJIL(this.LIZJ.LIZJ()) - this.LIZJ.LIZJ();
        }
        if (n11 > 0) {
            return Math.min(0Fd.LIZIZ, n11);
        }
        return 0;
    }
    
    private c LIZ(final 0Fd 0Fd) {
        final boolean ljiilliil = this.LJIILLIIL(0Fd.LJ);
        int liz = -1;
        int i;
        int n;
        if (ljiilliil) {
            i = this.LIZ - 1;
            n = -1;
        }
        else {
            i = 0;
            liz = this.LIZ;
            n = 1;
        }
        final int lj = 0Fd.LJ;
        final c c = null;
        c c2 = null;
        if (lj == 1) {
            int n2 = Integer.MAX_VALUE;
            final int liziz = this.LIZJ.LIZIZ();
            while (i != liz) {
                final c c3 = this.LIZIZ[i];
                final int liziz2 = c3.LIZIZ(liziz);
                int n3;
                if (liziz2 < (n3 = n2)) {
                    c2 = c3;
                    n3 = liziz2;
                }
                i += n;
                n2 = n3;
            }
            return c2;
        }
        int n4 = Integer.MIN_VALUE;
        final int lizj = this.LIZJ.LIZJ();
        c c4 = c;
        while (i != liz) {
            final c c5 = this.LIZIZ[i];
            final int liz2 = c5.LIZ(lizj);
            int n5;
            if (liz2 > (n5 = n4)) {
                c4 = c5;
                n5 = liz2;
            }
            i += n;
            n4 = n5;
        }
        return c4;
    }
    
    private void LIZ(int lj, final t t) {
        final 0Fd ljiil = this.LJIIL;
        final boolean b = false;
        ljiil.LIZIZ = 0;
        this.LJIIL.LIZJ = lj;
        while (true) {
            Label_0221: {
                if (!((RecyclerView.i)this).LJIILLIIL()) {
                    break Label_0221;
                }
                final int liz = t.LIZ;
                if (liz == -1) {
                    break Label_0221;
                }
                int lj2 = 0;
                Label_0073: {
                    if (this.LJI != liz < lj) {
                        lj2 = this.LIZJ.LJ();
                        lj = 0;
                        break Label_0073;
                    }
                    lj = this.LIZJ.LJ();
                    lj2 = 0;
                }
                if (((RecyclerView.i)this).LJIILL()) {
                    this.LJIIL.LJFF = this.LIZJ.LIZIZ() - lj2;
                    this.LJIIL.LJI = this.LIZJ.LIZJ() + lj;
                }
                else {
                    this.LJIIL.LJI = this.LIZJ.LIZLLL() + lj;
                    this.LJIIL.LJFF = -lj2;
                }
                this.LJIIL.LJII = false;
                this.LJIIL.LIZ = true;
                final 0Fd ljiil2 = this.LJIIL;
                boolean ljiiiizz = b;
                if (this.LIZJ.LJI() == 0) {
                    ljiiiizz = b;
                    if (this.LIZJ.LIZLLL() == 0) {
                        ljiiiizz = true;
                    }
                }
                ljiil2.LJIIIIZZ = ljiiiizz;
                return;
            }
            lj = 0;
            continue;
        }
    }
    
    private void LIZ(final o o, final int n) {
        while (((RecyclerView.i)this).LJIJI() > 0) {
            final int n2 = 0;
            final View lji = ((RecyclerView.i)this).LJI(0);
            if (this.LIZJ.LIZIZ(lji) > n || this.LIZJ.LIZJ(lji) > n) {
                break;
            }
            final StaggeredGridLayoutManager.b b = (StaggeredGridLayoutManager.b)lji.getLayoutParams();
            if (b.LIZIZ) {
                int n3 = 0;
                int i;
                while (true) {
                    i = n2;
                    if (n3 >= this.LIZ) {
                        break;
                    }
                    if (this.LIZIZ[n3].LIZ.size() == 1) {
                        return;
                    }
                    ++n3;
                }
                while (i < this.LIZ) {
                    this.LIZIZ[i].LJ();
                    ++i;
                }
            }
            else {
                if (b.LIZ.LIZ.size() == 1) {
                    return;
                }
                b.LIZ.LJ();
            }
            ((RecyclerView.i)this).LIZ(lji, o);
        }
    }
    
    private void LIZ(final o o, final t t, final boolean b) {
        final int ljiiljjil = this.LJIILJJIL(Integer.MIN_VALUE);
        if (ljiiljjil == Integer.MIN_VALUE) {
            return;
        }
        final int n = this.LIZJ.LIZJ() - ljiiljjil;
        if (n > 0) {
            final int n2 = n - -this.LIZJ(-n, o, t);
            if (b && n2 > 0) {
                this.LIZJ.LIZ(n2);
            }
        }
    }
    
    private void LIZ(final o o, final 0Fd 0Fd) {
        if (0Fd.LIZ && !0Fd.LJIIIIZZ) {
            if (0Fd.LIZIZ == 0) {
                if (0Fd.LJ == -1) {
                    this.LIZIZ(o, 0Fd.LJI);
                    return;
                }
                this.LIZ(o, 0Fd.LJFF);
            }
            else {
                if (0Fd.LJ == -1) {
                    final int n = 0Fd.LJFF - this.LJIIL(0Fd.LJFF);
                    int lji;
                    if (n < 0) {
                        lji = 0Fd.LJI;
                    }
                    else {
                        lji = 0Fd.LJI - Math.min(n, 0Fd.LIZIZ);
                    }
                    this.LIZIZ(o, lji);
                    return;
                }
                final int n2 = this.LJIILL(0Fd.LJI) - 0Fd.LJI;
                int ljff;
                if (n2 < 0) {
                    ljff = 0Fd.LJFF;
                }
                else {
                    ljff = Math.min(n2, 0Fd.LIZIZ) + 0Fd.LJFF;
                }
                this.LIZ(o, ljff);
            }
        }
    }
    
    private void LIZ(final c c, final int n, final int n2) {
        final int lizlll = c.LIZLLL;
        if (n == -1) {
            if (c.LIZ() + lizlll <= n2) {
                this.LJIILIIL.set(c.LJ, false);
            }
            return;
        }
        if (c.LIZIZ() - lizlll >= n2) {
            this.LJIILIIL.set(c.LJ, false);
        }
    }
    
    private void LIZ(final View view) {
        for (int i = this.LIZ - 1; i >= 0; --i) {
            this.LIZIZ[i].LIZIZ(view);
        }
    }
    
    private void LIZ(final View view, int liziz, int liziz2) {
        ((RecyclerView.i)this).LIZIZ(view, this.LJIJ);
        final StaggeredGridLayoutManager.b b = (StaggeredGridLayoutManager.b)view.getLayoutParams();
        liziz = this.LIZIZ(liziz, b.leftMargin + this.LJIJ.left, b.rightMargin + this.LJIJ.right);
        liziz2 = this.LIZIZ(liziz2, b.topMargin + this.LJIJ.top, b.bottomMargin + this.LJIJ.bottom);
        if (((RecyclerView.i)this).LIZIZ(view, liziz, liziz2, (j)b)) {
            view.measure(liziz, liziz2);
        }
    }
    
    private void LIZ(final View view, final StaggeredGridLayoutManager.b b) {
        if (b.LIZIZ) {
            if (this.LJ == 1) {
                this.LIZ(view, this.LJIIZILJ, RecyclerView.i.LIZ(super.LJJIJL, super.LJJIJIIJIL, ((RecyclerView.i)this).LJIJJLI() + ((RecyclerView.i)this).LJJ(), b.height, true));
                return;
            }
            this.LIZ(view, RecyclerView.i.LIZ(super.LJJIJIL, super.LJJIJIIJI, ((RecyclerView.i)this).LJIJJ() + ((RecyclerView.i)this).LJIL(), b.width, true), this.LJIIZILJ);
        }
        else {
            if (this.LJ == 1) {
                this.LIZ(view, RecyclerView.i.LIZ(this.LJIIJJI, super.LJJIJIIJI, 0, b.width, false), RecyclerView.i.LIZ(super.LJJIJL, super.LJJIJIIJIL, ((RecyclerView.i)this).LJIJJLI() + ((RecyclerView.i)this).LJJ(), b.height, true));
                return;
            }
            this.LIZ(view, RecyclerView.i.LIZ(super.LJJIJIL, super.LJJIJIIJI, ((RecyclerView.i)this).LJIJJ() + ((RecyclerView.i)this).LJIL(), b.width, true), RecyclerView.i.LIZ(this.LJIIJJI, super.LJJIJIIJIL, 0, b.height, false));
        }
    }
    
    private void LIZ(final View view, final StaggeredGridLayoutManager.b b, final 0Fd 0Fd) {
        if (0Fd.LJ == 1) {
            if (b.LIZIZ) {
                this.LIZ(view);
                return;
            }
            b.LIZ.LIZIZ(view);
        }
        else {
            if (b.LIZIZ) {
                this.LIZIZ(view);
                return;
            }
            b.LIZ.LIZ(view);
        }
    }
    
    private void LIZ(final boolean b) {
        ((RecyclerView.i)this).LIZ((String)null);
        final SavedState ljiilliil = this.LJIILLIIL;
        if (ljiilliil != null && ljiilliil.LJII != b) {
            this.LJIILLIIL.LJII = b;
        }
        this.LJFF = b;
        ((RecyclerView.i)this).LJIILJJIL();
    }
    
    private boolean LIZ(final c c) {
        if (this.LJI) {
            if (c.LIZIZ() < this.LIZJ.LIZJ()) {
                return !((StaggeredGridLayoutManager.b)c.LIZ.get(c.LIZ.size() - 1).getLayoutParams()).LIZIZ;
            }
        }
        else if (c.LIZ() > this.LIZJ.LIZIZ() && !((StaggeredGridLayoutManager.b)c.LIZ.get(0).getLayoutParams()).LIZIZ) {
            return true;
        }
        return false;
    }
    
    private int LIZIZ(final int n, final int n2, final int n3) {
        if (n2 == 0 && n3 == 0) {
            return n;
        }
        final int mode = View$MeasureSpec.getMode(n);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return View$MeasureSpec.makeMeasureSpec(Math.max(0, View$MeasureSpec.getSize(n) - n2 - n3), mode);
        }
        return n;
    }
    
    private View LIZIZ(final boolean b) {
        final int liziz = this.LIZJ.LIZIZ();
        final int lizj = this.LIZJ.LIZJ();
        final int ljiji = ((RecyclerView.i)this).LJIJI();
        View view = null;
        View view2;
        for (int i = 0; i < ljiji; ++i, view = view2) {
            final View lji = ((RecyclerView.i)this).LJI(i);
            final int liz = this.LIZJ.LIZ(lji);
            view2 = view;
            if (this.LIZJ.LIZIZ(lji) > liziz) {
                view2 = view;
                if (liz < lizj) {
                    if (liz >= liziz || !b) {
                        return lji;
                    }
                    if ((view2 = view) == null) {
                        view2 = lji;
                    }
                }
            }
        }
        return view;
    }
    
    private void LIZIZ(final int n) {
        this.LJIIJJI = n / this.LIZ;
        this.LJIIZILJ = View$MeasureSpec.makeMeasureSpec(n, this.LIZLLL.LJI());
    }
    
    private void LIZIZ(final int n, final t t) {
        int n2;
        int n3;
        if (n > 0) {
            n2 = this.LJJIJIIJIL();
            n3 = 1;
        }
        else {
            n2 = this.LJJIJIL();
            n3 = -1;
        }
        this.LJIIL.LIZ = true;
        this.LIZ(n2, t);
        this.LJFF(n3);
        final 0Fd ljiil = this.LJIIL;
        ljiil.LIZJ = n2 + ljiil.LIZLLL;
        this.LJIIL.LIZIZ = Math.abs(n);
    }
    
    private void LIZIZ(final o o, final int n) {
        for (int i = ((RecyclerView.i)this).LJIJI() - 1; i >= 0; --i) {
            final View lji = ((RecyclerView.i)this).LJI(i);
            if (this.LIZJ.LIZ(lji) < n || this.LIZJ.LIZLLL(lji) < n) {
                break;
            }
            final StaggeredGridLayoutManager.b b = (StaggeredGridLayoutManager.b)lji.getLayoutParams();
            if (b.LIZIZ) {
                final int n2 = 0;
                int n3 = 0;
                int j;
                while (true) {
                    j = n2;
                    if (n3 >= this.LIZ) {
                        break;
                    }
                    if (this.LIZIZ[n3].LIZ.size() == 1) {
                        return;
                    }
                    ++n3;
                }
                while (j < this.LIZ) {
                    this.LIZIZ[j].LIZLLL();
                    ++j;
                }
            }
            else {
                if (b.LIZ.LIZ.size() == 1) {
                    return;
                }
                b.LIZ.LIZLLL();
            }
            ((RecyclerView.i)this).LIZ(lji, o);
        }
    }
    
    private void LIZIZ(final o o, final t t, final boolean b) {
        final int ljiiliil = this.LJIILIIL(Integer.MAX_VALUE);
        if (ljiiliil == Integer.MAX_VALUE) {
            return;
        }
        final int n = ljiiliil - this.LIZJ.LIZIZ();
        if (n > 0) {
            final int n2 = n - this.LIZJ(n, o, t);
            if (b && n2 > 0) {
                this.LIZJ.LIZ(-n2);
            }
        }
    }
    
    private void LIZIZ(final View view) {
        for (int i = this.LIZ - 1; i >= 0; --i) {
            this.LIZIZ[i].LIZ(view);
        }
    }
    
    private int LIZJ(int n, final o o, final t t) {
        if (((RecyclerView.i)this).LJIJI() == 0 || n == 0) {
            return 0;
        }
        this.LIZIZ(n, t);
        final int liz = this.LIZ(o, this.LJIIL, t);
        if (this.LJIIL.LIZIZ >= liz) {
            if (n < 0) {
                n = -liz;
            }
            else {
                n = liz;
            }
        }
        this.LIZJ.LIZ(-n);
        this.LJIILJJIL = this.LJI;
        this.LJIIL.LIZIZ = 0;
        this.LIZ(o, this.LJIIL);
        return n;
    }
    
    private View LIZJ(final boolean b) {
        final int liziz = this.LIZJ.LIZIZ();
        final int lizj = this.LIZJ.LIZJ();
        int i = ((RecyclerView.i)this).LJIJI() - 1;
        View view = null;
        while (i >= 0) {
            final View lji = ((RecyclerView.i)this).LJI(i);
            final int liz = this.LIZJ.LIZ(lji);
            final int liziz2 = this.LIZJ.LIZIZ(lji);
            View view2 = view;
            if (liziz2 > liziz) {
                view2 = view;
                if (liz < lizj) {
                    if (liziz2 <= lizj || !b) {
                        return lji;
                    }
                    if ((view2 = view) == null) {
                        view2 = lji;
                    }
                }
            }
            --i;
            view = view2;
        }
        return view;
    }
    
    private void LIZJ(int n, final int n2, final int n3) {
        int n4;
        if (this.LJI) {
            n4 = this.LJJIJIIJIL();
        }
        else {
            n4 = this.LJJIJIL();
        }
        int n5 = 0;
        int n6 = 0;
        Label_0040: {
            int n7;
            if (n3 == 8) {
                if (n >= n2) {
                    n5 = n + 1;
                    n6 = n2;
                    break Label_0040;
                }
                n7 = n2 + 1;
            }
            else {
                n7 = n + n2;
            }
            final int n8 = n;
            n5 = n7;
            n6 = n8;
        }
        this.LJIIIZ.LIZIZ(n6);
        if (n3 != 1) {
            if (n3 != 2) {
                if (n3 == 8) {
                    this.LJIIIZ.LIZ(n, 1);
                    this.LJIIIZ.LIZIZ(n2, 1);
                }
            }
            else {
                this.LJIIIZ.LIZ(n, n2);
            }
        }
        else {
            this.LJIIIZ.LIZIZ(n, n2);
        }
        if (n5 <= n4) {
            return;
        }
        if (this.LJI) {
            n = this.LJJIJIL();
        }
        else {
            n = this.LJJIJIIJIL();
        }
        if (n6 <= n) {
            ((RecyclerView.i)this).LJIILJJIL();
        }
    }
    
    private void LJ(final int n, final int n2) {
        for (int i = 0; i < this.LIZ; ++i) {
            if (!this.LIZIZ[i].LIZ.isEmpty()) {
                this.LIZ(this.LIZIZ[i], n, n2);
            }
        }
    }
    
    private void LJFF(int n) {
        this.LJIIL.LJ = n;
        final 0Fd ljiil = this.LJIIL;
        final boolean lji = this.LJI;
        final int n2 = 1;
        if (lji == (n == -1)) {
            n = n2;
        }
        else {
            n = -1;
        }
        ljiil.LIZLLL = n;
    }
    
    private int LJII(final t t) {
        if (((RecyclerView.i)this).LJIJI() == 0) {
            return 0;
        }
        return 0Ee.LIZ(t, this.LIZJ, this.LIZIZ(this.LJJIJLIJ ^ true), this.LIZJ(this.LJJIJLIJ ^ true), this, this.LJJIJLIJ, this.LJI);
    }
    
    private int LJIIIIZZ(final t t) {
        if (((RecyclerView.i)this).LJIJI() == 0) {
            return 0;
        }
        return 0Ee.LIZ(t, this.LIZJ, this.LIZIZ(this.LJJIJLIJ ^ true), this.LIZJ(this.LJJIJLIJ ^ true), this, this.LJJIJLIJ);
    }
    
    private int LJIIIZ(final t t) {
        if (((RecyclerView.i)this).LJIJI() == 0) {
            return 0;
        }
        return 0Ee.LIZIZ(t, this.LIZJ, this.LIZIZ(this.LJJIJLIJ ^ true), this.LIZJ(this.LJJIJLIJ ^ true), this, this.LJJIJLIJ);
    }
    
    private FullSpanItem LJIIJ(final int n) {
        final FullSpanItem fullSpanItem = new FullSpanItem();
        fullSpanItem.LIZJ = new int[this.LIZ];
        for (int i = 0; i < this.LIZ; ++i) {
            fullSpanItem.LIZJ[i] = n - this.LIZIZ[i].LIZIZ(n);
        }
        return fullSpanItem;
    }
    
    private FullSpanItem LJIIJJI(final int n) {
        final FullSpanItem fullSpanItem = new FullSpanItem();
        fullSpanItem.LIZJ = new int[this.LIZ];
        for (int i = 0; i < this.LIZ; ++i) {
            fullSpanItem.LIZJ[i] = this.LIZIZ[i].LIZ(n) - n;
        }
        return fullSpanItem;
    }
    
    private void LJIIJJI() {
        this.LIZJ = 0Fj.LIZ(this, this.LJ);
        this.LIZLLL = 0Fj.LIZ(this, 1 - this.LJ);
    }
    
    private int LJIIL(final int n) {
        int liz = this.LIZIZ[0].LIZ(n);
        int n2;
        for (int i = 1; i < this.LIZ; ++i, liz = n2) {
            final int liz2 = this.LIZIZ[i].LIZ(n);
            if (liz2 > (n2 = liz)) {
                n2 = liz2;
            }
        }
        return liz;
    }
    
    private View LJIIL() {
        int n = ((RecyclerView.i)this).LJIJI() - 1;
        final BitSet set = new BitSet(this.LIZ);
        set.set(0, this.LIZ, true);
        final int lj = this.LJ;
        int n2 = -1;
        int n3;
        if (lj == 1 && this.LJJIIZI()) {
            n3 = 1;
        }
        else {
            n3 = -1;
        }
        int n4;
        if (this.LJI) {
            n4 = -1;
        }
        else {
            n4 = n + 1;
            n = 0;
        }
        int i = n;
        if (n < n4) {
            n2 = 1;
            i = n;
        }
        while (i != n4) {
            final View lji = ((RecyclerView.i)this).LJI(i);
            final StaggeredGridLayoutManager.b b = (StaggeredGridLayoutManager.b)lji.getLayoutParams();
            if (set.get(b.LIZ.LJ)) {
                if (this.LIZ(b.LIZ)) {
                    return lji;
                }
                set.clear(b.LIZ.LJ);
            }
            Label_0311: {
                if (!b.LIZIZ) {
                    final int n5 = i + n2;
                    if (n5 != n4) {
                        final View lji2 = ((RecyclerView.i)this).LJI(n5);
                        if (this.LJI) {
                            final int liziz = this.LIZJ.LIZIZ(lji);
                            final int liziz2 = this.LIZJ.LIZIZ(lji2);
                            if (liziz < liziz2) {
                                return lji;
                            }
                            if (liziz != liziz2) {
                                break Label_0311;
                            }
                        }
                        else {
                            final int liz = this.LIZJ.LIZ(lji);
                            final int liz2 = this.LIZJ.LIZ(lji2);
                            if (liz > liz2) {
                                return lji;
                            }
                            if (liz != liz2) {
                                break Label_0311;
                            }
                        }
                        int n6;
                        if (b.LIZ.LJ - ((StaggeredGridLayoutManager.b)lji2.getLayoutParams()).LIZ.LJ < 0) {
                            n6 = 1;
                        }
                        else {
                            n6 = 0;
                        }
                        int n7;
                        if (n3 < 0) {
                            n7 = 1;
                        }
                        else {
                            n7 = 0;
                        }
                        if (n6 != n7) {
                            return lji;
                        }
                    }
                }
            }
            i += n2;
        }
        return null;
    }
    
    private int LJIILIIL(final int n) {
        int liz = this.LIZIZ[0].LIZ(n);
        int n2;
        for (int i = 1; i < this.LIZ; ++i, liz = n2) {
            final int liz2 = this.LIZIZ[i].LIZ(n);
            if (liz2 < (n2 = liz)) {
                n2 = liz2;
            }
        }
        return liz;
    }
    
    private void LJIILIIL() {
        final int lj = this.LJ;
        boolean ljff = true;
        if (lj == 1 || !this.LJJIIZI()) {
            ljff = this.LJFF;
        }
        else if (this.LJFF) {
            ljff = false;
        }
        this.LJI = ljff;
    }
    
    private int LJIILJJIL(final int n) {
        int liziz = this.LIZIZ[0].LIZIZ(n);
        int n2;
        for (int i = 1; i < this.LIZ; ++i, liziz = n2) {
            final int liziz2 = this.LIZIZ[i].LIZIZ(n);
            if (liziz2 > (n2 = liziz)) {
                n2 = liziz2;
            }
        }
        return liziz;
    }
    
    private int LJIILL(final int n) {
        int liziz = this.LIZIZ[0].LIZIZ(n);
        int n2;
        for (int i = 1; i < this.LIZ; ++i, liziz = n2) {
            final int liziz2 = this.LIZIZ[i].LIZIZ(n);
            if (liziz2 < (n2 = liziz)) {
                n2 = liziz2;
            }
        }
        return liziz;
    }
    
    private boolean LJIILLIIL(final int n) {
        if (this.LJ == 0) {
            return n == -1 != this.LJI;
        }
        return n == -1 == this.LJI == this.LJJIIZI();
    }
    
    private int LJIIZILJ(final int n) {
        if (((RecyclerView.i)this).LJIJI() == 0) {
            if (this.LJI) {
                return 1;
            }
            return -1;
        }
        else {
            if (n < this.LJJIJIL() != this.LJI) {
                return -1;
            }
            return 1;
        }
    }
    
    private boolean LJJIIZI() {
        return ((RecyclerView.i)this).LJIIZILJ() == 1;
    }
    
    private boolean LJJIJ() {
        final int liziz = this.LIZIZ[0].LIZIZ(Integer.MIN_VALUE);
        for (int i = 1; i < this.LIZ; ++i) {
            if (this.LIZIZ[i].LIZIZ(Integer.MIN_VALUE) != liziz) {
                return false;
            }
        }
        return true;
    }
    
    private boolean LJJIJIIJI() {
        final int liz = this.LIZIZ[0].LIZ(Integer.MIN_VALUE);
        for (int i = 1; i < this.LIZ; ++i) {
            if (this.LIZIZ[i].LIZ(Integer.MIN_VALUE) != liz) {
                return false;
            }
        }
        return true;
    }
    
    private int LJJIJIIJIL() {
        final int ljiji = ((RecyclerView.i)this).LJIJI();
        if (ljiji == 0) {
            return 0;
        }
        return ((RecyclerView.i)this).LJI(((RecyclerView.i)this).LJI(ljiji - 1));
    }
    
    private int LJJIJIL() {
        if (((RecyclerView.i)this).LJIJI() == 0) {
            return 0;
        }
        return ((RecyclerView.i)this).LJI(((RecyclerView.i)this).LJI(0));
    }
    
    @Override
    public final int LIZ(final int n, final o o, final t t) {
        return this.LIZJ(n, o, t);
    }
    
    @Override
    public final j LIZ(final Context context, final AttributeSet set) {
        return (j)new StaggeredGridLayoutManager.b(context, set);
    }
    
    @Override
    public final j LIZ(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (viewGroup$LayoutParams instanceof ViewGroup$MarginLayoutParams) {
            return (j)new StaggeredGridLayoutManager.b((ViewGroup$MarginLayoutParams)viewGroup$LayoutParams);
        }
        return (j)new StaggeredGridLayoutManager.b(viewGroup$LayoutParams);
    }
    
    @Override
    public final View LIZ(View ljiiiizz, int i, final o o, final t t) {
        if (((RecyclerView.i)this).LJIJI() == 0) {
            return null;
        }
        ljiiiizz = ((RecyclerView.i)this).LJIIIIZZ(ljiiiizz);
        if (ljiiiizz == null) {
            return null;
        }
        this.LJIILIIL();
        Label_0147: {
            Label_0145: {
                Label_0132: {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 17) {
                                if (i != 33) {
                                    if (i != 66) {
                                        if (i == 130 && this.LJ == 1) {
                                            break Label_0145;
                                        }
                                    }
                                    else if (this.LJ == 0) {
                                        break Label_0145;
                                    }
                                }
                                else if (this.LJ == 1) {
                                    break Label_0132;
                                }
                            }
                            else if (this.LJ == 0) {
                                break Label_0132;
                            }
                            return null;
                        }
                        if (this.LJ == 1) {
                            break Label_0145;
                        }
                        if (!this.LJJIIZI()) {
                            break Label_0145;
                        }
                    }
                    else if (this.LJ != 1) {
                        if (this.LJJIIZI()) {
                            break Label_0145;
                        }
                    }
                }
                i = -1;
                break Label_0147;
            }
            i = 1;
        }
        final StaggeredGridLayoutManager.b b = (StaggeredGridLayoutManager.b)ljiiiizz.getLayoutParams();
        final boolean liziz = b.LIZIZ;
        final c liz = b.LIZ;
        int n;
        if (i == 1) {
            n = this.LJJIJIIJIL();
        }
        else {
            n = this.LJJIJIL();
        }
        this.LIZ(n, t);
        this.LJFF(i);
        final 0Fd ljiil = this.LJIIL;
        ljiil.LIZJ = ljiil.LIZLLL + n;
        this.LJIIL.LIZIZ = (int)(this.LIZJ.LJ() * 0.33333334f);
        this.LJIIL.LJII = true;
        final 0Fd ljiil2 = this.LJIIL;
        final int n2 = 0;
        ljiil2.LIZ = false;
        this.LIZ(o, this.LJIIL, t);
        this.LJIILJJIL = this.LJI;
        if (!liziz) {
            final View liz2 = liz.LIZ(n, i);
            if (liz2 != null && liz2 != ljiiiizz) {
                return liz2;
            }
        }
        if (this.LJIILLIIL(i)) {
            for (int j = this.LIZ - 1; j >= 0; --j) {
                final View liz3 = this.LIZIZ[j].LIZ(n, i);
                if (liz3 != null && liz3 != ljiiiizz) {
                    return liz3;
                }
            }
        }
        else {
            for (int k = 0; k < this.LIZ; ++k) {
                final View liz4 = this.LIZIZ[k].LIZ(n, i);
                if (liz4 != null && liz4 != ljiiiizz) {
                    return liz4;
                }
            }
        }
        boolean b2;
        if ((this.LJFF ^ true) == (i == -1)) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        if (!liziz) {
            int n3;
            if (b2) {
                n3 = liz.LJFF();
            }
            else {
                n3 = liz.LJI();
            }
            final View lizj = ((RecyclerView.i)this).LIZJ(n3);
            if (lizj != null && lizj != ljiiiizz) {
                return lizj;
            }
        }
        int l = n2;
        if (this.LJIILLIIL(i)) {
            int n4;
            View lizj2;
            for (i = this.LIZ - 1; i >= 0; --i) {
                if (i != liz.LJ) {
                    if (b2) {
                        n4 = this.LIZIZ[i].LJFF();
                    }
                    else {
                        n4 = this.LIZIZ[i].LJI();
                    }
                    lizj2 = ((RecyclerView.i)this).LIZJ(n4);
                    if (lizj2 != null && lizj2 != ljiiiizz) {
                        return lizj2;
                    }
                }
            }
        }
        else {
            while (l < this.LIZ) {
                if (b2) {
                    i = this.LIZIZ[l].LJFF();
                }
                else {
                    i = this.LIZIZ[l].LJI();
                }
                final View lizj3 = ((RecyclerView.i)this).LIZJ(i);
                if (lizj3 != null && lizj3 != ljiiiizz) {
                    return lizj3;
                }
                ++l;
            }
        }
        return null;
    }
    
    public final void LIZ(int i) {
        ((RecyclerView.i)this).LIZ((String)null);
        if (i != this.LIZ) {
            this.LJIIJ();
            this.LIZ = i;
            this.LJIILIIL = new BitSet(this.LIZ);
            this.LIZIZ = new c[this.LIZ];
            for (i = 0; i < this.LIZ; ++i) {
                this.LIZIZ[i] = new c(i);
            }
            ((RecyclerView.i)this).LJIILJJIL();
        }
    }
    
    public final void LIZ(final int ljii, final int ljiiiizz) {
        final SavedState ljiilliil = this.LJIILLIIL;
        if (ljiilliil != null) {
            ljiilliil.LIZIZ();
        }
        this.LJII = ljii;
        this.LJIIIIZZ = ljiiiizz;
        ((RecyclerView.i)this).LJIILJJIL();
    }
    
    public final void LIZ(int n, int i, final t t, final i.a a) {
        if (this.LJ != 0) {
            n = i;
        }
        if (((RecyclerView.i)this).LJIJI() != 0 && n != 0) {
            this.LIZIZ(n, t);
            final int[] ljjil = this.LJJIL;
            if (ljjil == null || ljjil.length < this.LIZ) {
                this.LJJIL = new int[this.LIZ];
            }
            final int n2 = 0;
            i = 0;
            n = 0;
            while (i < this.LIZ) {
                int n3;
                int n4;
                if (this.LJIIL.LIZLLL == -1) {
                    n3 = this.LJIIL.LJFF;
                    n4 = this.LIZIZ[i].LIZ(this.LJIIL.LJFF);
                }
                else {
                    n3 = this.LIZIZ[i].LIZIZ(this.LJIIL.LJI);
                    n4 = this.LJIIL.LJI;
                }
                final int n5 = n3 - n4;
                int n6 = n;
                if (n5 >= 0) {
                    this.LJJIL[n] = n5;
                    n6 = n + 1;
                }
                ++i;
                n = n6;
            }
            Arrays.sort(this.LJJIL, 0, n);
            0Fd ljiil;
            for (i = n2; i < n && this.LJIIL.LIZ(t); ++i) {
                a.LIZ(this.LJIIL.LIZJ, this.LJJIL[i]);
                ljiil = this.LJIIL;
                ljiil.LIZJ += this.LJIIL.LIZLLL;
            }
        }
    }
    
    @Override
    public final void LIZ(final RecyclerView.a a, final RecyclerView.a a2) {
        this.LJIIIZ.LIZ();
        for (int i = 0; i < this.LIZ; ++i) {
            this.LIZIZ[i].LIZJ();
        }
    }
    
    @Override
    public void LIZ(final t t) {
        super.LIZ(t);
        this.LJII = -1;
        this.LJIIIIZZ = Integer.MIN_VALUE;
        this.LJIILLIIL = null;
        this.LJIJI.LIZ();
    }
    
    @Override
    public final void LIZ(final Rect rect, int n, int n2) {
        final int n3 = ((RecyclerView.i)this).LJIJJ() + ((RecyclerView.i)this).LJIL();
        final int n4 = ((RecyclerView.i)this).LJIJJLI() + ((RecyclerView.i)this).LJJ();
        if (this.LJ == 1) {
            n2 = RecyclerView.i.LIZ(n2, rect.height() + n4, ((RecyclerView.i)this).LJJIIJZLJL());
            n = RecyclerView.i.LIZ(n, this.LJIIJJI * this.LIZ + n3, ((RecyclerView.i)this).LJJIIJ());
        }
        else {
            n = RecyclerView.i.LIZ(n, rect.width() + n3, ((RecyclerView.i)this).LJJIIJ());
            n2 = RecyclerView.i.LIZ(n2, this.LJIIJJI * this.LIZ + n4, ((RecyclerView.i)this).LJJIIJZLJL());
        }
        ((RecyclerView.i)this).LIZLLL(n, n2);
    }
    
    @Override
    public final void LIZ(final Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            final SavedState ljiilliil = (SavedState)parcelable;
            this.LJIILLIIL = ljiilliil;
            if (this.LJII != -1) {
                ljiilliil.LIZIZ();
                this.LJIILLIIL.LIZ();
            }
            ((RecyclerView.i)this).LJIILJJIL();
        }
    }
    
    @Override
    public final void LIZ(final AccessibilityEvent accessibilityEvent) {
        super.LIZ(accessibilityEvent);
        if (((RecyclerView.i)this).LJIJI() > 0) {
            final View liziz = this.LIZIZ(false);
            final View lizj = this.LIZJ(false);
            if (liziz != null && lizj != null) {
                final int lji = ((RecyclerView.i)this).LJI(liziz);
                final int lji2 = ((RecyclerView.i)this).LJI(lizj);
                if (lji < lji2) {
                    accessibilityEvent.setFromIndex(lji);
                    accessibilityEvent.setToIndex(lji2);
                    return;
                }
                accessibilityEvent.setFromIndex(lji2);
                accessibilityEvent.setToIndex(lji);
            }
        }
    }
    
    @Override
    public final void LIZ(final RecyclerView recyclerView, final int n, final int n2) {
        this.LIZJ(n, n2, 1);
    }
    
    @Override
    public final void LIZ(final RecyclerView recyclerView, final int n, final int n2, final int n3) {
        this.LIZJ(n, n2, 8);
    }
    
    @Override
    public final void LIZ(final RecyclerView recyclerView, final int n, final int n2, final Object o) {
        this.LIZJ(n, n2, 4);
    }
    
    @Override
    public void LIZ(final RecyclerView recyclerView, final o o) {
        super.LIZ(recyclerView, o);
        ((RecyclerView.i)this).LIZ(this.LJJIZ);
        for (int i = 0; i < this.LIZ; ++i) {
            this.LIZIZ[i].LIZJ();
        }
        recyclerView.requestLayout();
    }
    
    @Override
    public final void LIZ(final RecyclerView recyclerView, final t t, final int lji) {
        final 17G 17G = new 17G(recyclerView.getContext());
        17G.LJI = lji;
        ((RecyclerView.i)this).LIZ(17G);
    }
    
    @Override
    public final void LIZ(final String s) {
        if (this.LJIILLIIL == null) {
            super.LIZ(s);
        }
    }
    
    @Override
    public final boolean LIZ(final j j) {
        return j instanceof StaggeredGridLayoutManager.b;
    }
    
    public final int[] LIZ(int[] array) {
        if (array == null) {
            array = new int[this.LIZ];
        }
        else if (array.length < this.LIZ) {
            final StringBuilder sb = new StringBuilder("Provided int[]'s size must be more than or equal to span count. Expected:");
            sb.append(this.LIZ);
            sb.append(", array size:");
            sb.append(array.length);
            throw new IllegalArgumentException(sb.toString());
        }
        for (int i = 0; i < this.LIZ; ++i) {
            final c c = this.LIZIZ[i];
            int n;
            if (c.LJFF.LJFF) {
                n = c.LIZ(c.LIZ.size() - 1, -1, false);
            }
            else {
                n = c.LIZ(0, c.LIZ.size(), false);
            }
            array[i] = n;
        }
        return array;
    }
    
    @Override
    public int LIZIZ(final int n, final o o, final t t) {
        return this.LIZJ(n, o, t);
    }
    
    @Override
    public final int LIZIZ(final t t) {
        return this.LJIIIZ(t);
    }
    
    @Override
    public final j LIZIZ() {
        if (this.LJ == 0) {
            return (j)new StaggeredGridLayoutManager.b(-2, -1);
        }
        return (j)new StaggeredGridLayoutManager.b(-1, -2);
    }
    
    @Override
    public final void LIZIZ(final RecyclerView recyclerView, final int n, final int n2) {
        this.LIZJ(n, n2, 2);
    }
    
    public final int[] LIZIZ(int[] array) {
        if (array == null) {
            array = new int[this.LIZ];
        }
        else if (array.length < this.LIZ) {
            final StringBuilder sb = new StringBuilder("Provided int[]'s size must be more than or equal to span count. Expected:");
            sb.append(this.LIZ);
            sb.append(", array size:");
            sb.append(array.length);
            throw new IllegalArgumentException(sb.toString());
        }
        for (int i = 0; i < this.LIZ; ++i) {
            final c c = this.LIZIZ[i];
            int n;
            if (c.LJFF.LJFF) {
                n = c.LIZ(0, c.LIZ.size(), false);
            }
            else {
                n = c.LIZ(c.LIZ.size() - 1, -1, false);
            }
            array[i] = n;
        }
        return array;
    }
    
    @Override
    public final int LIZJ(final t t) {
        return this.LJIIIZ(t);
    }
    
    @Override
    public void LIZJ(final o o, final t t) {
        int n = 1;
    Label_2040_Outer:
        while (true) {
            final StaggeredGridLayoutManager.a ljiji = this.LJIJI;
            if ((this.LJIILLIIL != null || this.LJII != -1) && t.LIZ() == 0) {
                ((RecyclerView.i)this).LIZJ(o);
                ljiji.LIZ();
                return;
            }
            boolean b;
            if (!ljiji.LJ || this.LJII != -1 || this.LJIILLIIL != null) {
                b = true;
            }
            else {
                b = false;
            }
            if (b) {
                ljiji.LIZ();
                final SavedState ljiilliil = this.LJIILLIIL;
                if (ljiilliil != null) {
                    if (ljiilliil.LIZJ > 0) {
                        if (this.LJIILLIIL.LIZJ == this.LIZ) {
                            for (int i = 0; i < this.LIZ; ++i) {
                                this.LIZIZ[i].LIZJ();
                                final int n2 = this.LJIILLIIL.LIZLLL[i];
                                int n3;
                                if ((n3 = n2) != Integer.MIN_VALUE) {
                                    int n4;
                                    if (this.LJIILLIIL.LJIIIIZZ) {
                                        n4 = this.LIZJ.LIZJ();
                                    }
                                    else {
                                        n4 = this.LIZJ.LIZIZ();
                                    }
                                    n3 = n2 + n4;
                                }
                                this.LIZIZ[i].LIZJ(n3);
                            }
                        }
                        else {
                            this.LJIILLIIL.LIZ();
                            final SavedState ljiilliil2 = this.LJIILLIIL;
                            ljiilliil2.LIZ = ljiilliil2.LIZIZ;
                        }
                    }
                    this.LJIILL = this.LJIILLIIL.LJIIIZ;
                    this.LIZ(this.LJIILLIIL.LJII);
                    this.LJIILIIL();
                    if (this.LJIILLIIL.LIZ != -1) {
                        this.LJII = this.LJIILLIIL.LIZ;
                        ljiji.LIZJ = this.LJIILLIIL.LJIIIIZZ;
                    }
                    else {
                        ljiji.LIZJ = this.LJI;
                    }
                    if (this.LJIILLIIL.LJ > 1) {
                        this.LJIIIZ.LIZ = this.LJIILLIIL.LJFF;
                        this.LJIIIZ.LIZIZ = this.LJIILLIIL.LJI;
                    }
                }
                else {
                    this.LJIILIIL();
                    ljiji.LIZJ = this.LJI;
                }
                Label_0454: {
                    if (!t.LJI) {
                        final int ljii = this.LJII;
                        if (ljii != -1) {
                            if (ljii < 0 || ljii >= t.LIZ()) {
                                this.LJII = -1;
                                this.LJIIIIZZ = Integer.MIN_VALUE;
                            }
                            else {
                                final SavedState ljiilliil3 = this.LJIILLIIL;
                                if (ljiilliil3 != null && ljiilliil3.LIZ != -1 && this.LJIILLIIL.LIZJ > 0) {
                                    ljiji.LIZIZ = Integer.MIN_VALUE;
                                    ljiji.LIZ = this.LJII;
                                    break Label_0454;
                                }
                                final View lizj = ((RecyclerView.i)this).LIZJ(this.LJII);
                                if (lizj == null) {
                                    ljiji.LIZ = this.LJII;
                                    final int ljiiiizz = this.LJIIIIZZ;
                                    if (ljiiiizz == Integer.MIN_VALUE) {
                                        ljiji.LIZJ = (this.LJIIZILJ(ljiji.LIZ) == 1);
                                        int liziz;
                                        if (ljiji.LIZJ) {
                                            liziz = ljiji.LJI.LIZJ.LIZJ();
                                        }
                                        else {
                                            liziz = ljiji.LJI.LIZJ.LIZIZ();
                                        }
                                        ljiji.LIZIZ = liziz;
                                    }
                                    else if (ljiji.LIZJ) {
                                        ljiji.LIZIZ = ljiji.LJI.LIZJ.LIZJ() - ljiiiizz;
                                    }
                                    else {
                                        ljiji.LIZIZ = ljiji.LJI.LIZJ.LIZIZ() + ljiiiizz;
                                    }
                                    ljiji.LIZLLL = true;
                                    break Label_0454;
                                }
                                int liz;
                                if (this.LJI) {
                                    liz = this.LJJIJIIJIL();
                                }
                                else {
                                    liz = this.LJJIJIL();
                                }
                                ljiji.LIZ = liz;
                                if (this.LJIIIIZZ != Integer.MIN_VALUE) {
                                    if (ljiji.LIZJ) {
                                        ljiji.LIZIZ = this.LIZJ.LIZJ() - this.LJIIIIZZ - this.LIZJ.LIZIZ(lizj);
                                        break Label_0454;
                                    }
                                    ljiji.LIZIZ = this.LIZJ.LIZIZ() + this.LJIIIIZZ - this.LIZJ.LIZ(lizj);
                                    break Label_0454;
                                }
                                else {
                                    if (this.LIZJ.LJ(lizj) > this.LIZJ.LJ()) {
                                        int liziz2;
                                        if (ljiji.LIZJ) {
                                            liziz2 = this.LIZJ.LIZJ();
                                        }
                                        else {
                                            liziz2 = this.LIZJ.LIZIZ();
                                        }
                                        ljiji.LIZIZ = liziz2;
                                        break Label_0454;
                                    }
                                    final int n5 = this.LIZJ.LIZ(lizj) - this.LIZJ.LIZIZ();
                                    if (n5 < 0) {
                                        ljiji.LIZIZ = -n5;
                                        break Label_0454;
                                    }
                                    final int liziz3 = this.LIZJ.LIZJ() - this.LIZJ.LIZIZ(lizj);
                                    if (liziz3 < 0) {
                                        ljiji.LIZIZ = liziz3;
                                        break Label_0454;
                                    }
                                    ljiji.LIZIZ = Integer.MIN_VALUE;
                                    break Label_0454;
                                }
                            }
                        }
                    }
                Label_0440:
                    while (true) {
                        Label_0663: {
                            if (this.LJIILJJIL) {
                                final int liz2 = t.LIZ();
                                for (int j = ((RecyclerView.i)this).LJIJI() - 1; j >= 0; --j) {
                                    final int lji = ((RecyclerView.i)this).LJI(((RecyclerView.i)this).LJI(j));
                                    if (lji >= 0 && lji < liz2) {
                                        final int liz3 = lji;
                                        break Label_0440;
                                    }
                                }
                                break Label_0663;
                            }
                            final int liz4 = t.LIZ();
                            for (int ljiji2 = ((RecyclerView.i)this).LJIJI(), k = 0; k < ljiji2; ++k) {
                                final int lji2 = ((RecyclerView.i)this).LJI(((RecyclerView.i)this).LJI(k));
                                if (lji2 >= 0 && lji2 < liz4) {
                                    final int liz3 = lji2;
                                    break Label_0440;
                                }
                            }
                            break Label_0663;
                            int liz3 = 0;
                            ljiji.LIZ = liz3;
                            ljiji.LIZIZ = Integer.MIN_VALUE;
                            break Label_0454;
                        }
                        final int liz3 = 0;
                        continue Label_0440;
                    }
                }
                ljiji.LJ = true;
            }
            if (this.LJIILLIIL == null && this.LJII == -1 && (ljiji.LIZJ != this.LJIILJJIL || this.LJJIIZI() != this.LJIILL)) {
                this.LJIIIZ.LIZ();
                ljiji.LIZLLL = true;
            }
            if (((RecyclerView.i)this).LJIJI() > 0) {
                final SavedState ljiilliil4 = this.LJIILLIIL;
                if (ljiilliil4 == null || ljiilliil4.LIZJ <= 0) {
                    if (ljiji.LIZLLL) {
                        for (int l = 0; l < this.LIZ; ++l) {
                            this.LIZIZ[l].LIZJ();
                            if (ljiji.LIZIZ != Integer.MIN_VALUE) {
                                this.LIZIZ[l].LIZJ(ljiji.LIZIZ);
                            }
                        }
                    }
                    else if (b || this.LJIJI.LJFF == null) {
                        for (int n6 = 0; n6 < this.LIZ; ++n6) {
                            final c c = this.LIZIZ[n6];
                            final boolean lji3 = this.LJI;
                            final int liziz4 = ljiji.LIZIZ;
                            int n7;
                            if (lji3) {
                                n7 = c.LIZIZ(Integer.MIN_VALUE);
                            }
                            else {
                                n7 = c.LIZ(Integer.MIN_VALUE);
                            }
                            c.LIZJ();
                            if (n7 != Integer.MIN_VALUE) {
                                if (lji3) {
                                    if (n7 < c.LJFF.LIZJ.LIZJ()) {
                                        continue Label_2040_Outer;
                                    }
                                }
                                else if (n7 > c.LJFF.LIZJ.LIZIZ()) {
                                    continue Label_2040_Outer;
                                }
                                int n8 = n7;
                                if (liziz4 != Integer.MIN_VALUE) {
                                    n8 = n7 + liziz4;
                                }
                                c.LIZJ = n8;
                                c.LIZIZ = n8;
                            }
                        }
                        final StaggeredGridLayoutManager.a ljiji3 = this.LJIJI;
                        final c[] liziz5 = this.LIZIZ;
                        final int length = liziz5.length;
                        if (ljiji3.LJFF == null || ljiji3.LJFF.length < length) {
                            ljiji3.LJFF = new int[ljiji3.LJI.LIZIZ.length];
                        }
                        for (int n9 = 0; n9 < length; ++n9) {
                            ljiji3.LJFF[n9] = liziz5[n9].LIZ(Integer.MIN_VALUE);
                        }
                    }
                    else {
                        for (int n10 = 0; n10 < this.LIZ; ++n10) {
                            final c c2 = this.LIZIZ[n10];
                            c2.LIZJ();
                            c2.LIZJ(this.LJIJI.LJFF[n10]);
                        }
                    }
                }
            }
            ((RecyclerView.i)this).LIZ(o);
            this.LJIIL.LIZ = false;
            this.LJIJJ = false;
            this.LIZIZ(this.LIZLLL.LJ());
            this.LIZ(ljiji.LIZ, t);
            if (ljiji.LIZJ) {
                this.LJFF(-1);
                this.LIZ(o, this.LJIIL, t);
                this.LJFF(1);
                this.LJIIL.LIZJ = ljiji.LIZ + this.LJIIL.LIZLLL;
                this.LIZ(o, this.LJIIL, t);
            }
            else {
                this.LJFF(1);
                this.LIZ(o, this.LJIIL, t);
                this.LJFF(-1);
                this.LJIIL.LIZJ = ljiji.LIZ + this.LJIIL.LIZLLL;
                this.LIZ(o, this.LJIIL, t);
            }
            if (this.LIZLLL.LJI() != 1073741824) {
                float n11 = 0.0f;
                final int ljiji4 = ((RecyclerView.i)this).LJIJI();
                float max;
                for (int n12 = 0; n12 < ljiji4; ++n12, n11 = max) {
                    final View lji4 = ((RecyclerView.i)this).LJI(n12);
                    final float n13 = (float)this.LIZLLL.LJ(lji4);
                    max = n11;
                    if (n13 >= n11) {
                        float n14 = n13;
                        if (((StaggeredGridLayoutManager.b)lji4.getLayoutParams()).LIZIZ) {
                            n14 = n13 * 1.0f / this.LIZ;
                        }
                        max = Math.max(n11, n14);
                    }
                }
                final int ljiijji = this.LJIIJJI;
                int n15 = Math.round(n11 * this.LIZ);
                if (this.LIZLLL.LJI() == Integer.MIN_VALUE) {
                    n15 = Math.min(n15, this.LIZLLL.LJ());
                }
                this.LIZIZ(n15);
                if (this.LJIIJJI != ljiijji) {
                    for (int n16 = 0; n16 < ljiji4; ++n16) {
                        final View lji5 = ((RecyclerView.i)this).LJI(n16);
                        final StaggeredGridLayoutManager.b b2 = (StaggeredGridLayoutManager.b)lji5.getLayoutParams();
                        if (!b2.LIZIZ) {
                            if (this.LJJIIZI() && this.LJ == 1) {
                                lji5.offsetLeftAndRight(-(this.LIZ - 1 - b2.LIZ.LJ) * this.LJIIJJI - -(this.LIZ - 1 - b2.LIZ.LJ) * ljiijji);
                            }
                            else {
                                final int n17 = b2.LIZ.LJ * this.LJIIJJI;
                                final int n18 = b2.LIZ.LJ * ljiijji;
                                if (this.LJ == 1) {
                                    lji5.offsetLeftAndRight(n17 - n18);
                                }
                                else {
                                    lji5.offsetTopAndBottom(n17 - n18);
                                }
                            }
                        }
                    }
                }
            }
            if (((RecyclerView.i)this).LJIJI() > 0) {
                if (this.LJI) {
                    this.LIZ(o, t, true);
                    this.LIZIZ(o, t, false);
                }
                else {
                    this.LIZIZ(o, t, true);
                    this.LIZ(o, t, false);
                }
            }
            while (true) {
                Label_2088: {
                    if (n == 0 || t.LJI || this.LJIIJ == 0 || ((RecyclerView.i)this).LJIJI() <= 0 || (!this.LJIJJ && this.LJIIL() == null)) {
                        break Label_2088;
                    }
                    ((RecyclerView.i)this).LIZ(this.LJJIZ);
                    if (!this.LJII()) {
                        break Label_2088;
                    }
                    final int n19 = 1;
                    if (t.LJI) {
                        this.LJIJI.LIZ();
                    }
                    this.LJIILJJIL = ljiji.LIZJ;
                    this.LJIILL = this.LJJIIZI();
                    if (n19 != 0) {
                        this.LJIJI.LIZ();
                        n = 0;
                        continue Label_2040_Outer;
                    }
                    return;
                }
                final int n19 = 0;
                continue;
            }
        }
    }
    
    @Override
    public final int LIZLLL(final t t) {
        return this.LJII(t);
    }
    
    @Override
    public final PointF LIZLLL(int ljiizilj) {
        ljiizilj = this.LJIIZILJ(ljiizilj);
        final PointF pointF = new PointF();
        if (ljiizilj == 0) {
            return null;
        }
        if (this.LJ == 0) {
            pointF.x = (float)ljiizilj;
            pointF.y = 0.0f;
        }
        else {
            pointF.x = 0.0f;
            pointF.y = (float)ljiizilj;
        }
        return pointF;
    }
    
    @Override
    public final int LJ(final t t) {
        return this.LJII(t);
    }
    
    @Override
    public final Parcelable LJ() {
        if (this.LJIILLIIL != null) {
            return (Parcelable)new SavedState(this.LJIILLIIL);
        }
        final SavedState savedState = new SavedState();
        savedState.LJII = this.LJFF;
        savedState.LJIIIIZZ = this.LJIILJJIL;
        savedState.LJIIIZ = this.LJIILL;
        final LazySpanLookup ljiiiz = this.LJIIIZ;
        int i = 0;
        if (ljiiiz != null && ljiiiz.LIZ != null) {
            savedState.LJFF = this.LJIIIZ.LIZ;
            savedState.LJ = savedState.LJFF.length;
            savedState.LJI = this.LJIIIZ.LIZIZ;
        }
        else {
            savedState.LJ = 0;
        }
        final int ljiji = ((RecyclerView.i)this).LJIJI();
        final int n = -1;
        if (ljiji > 0) {
            int liz;
            if (this.LJIILJJIL) {
                liz = this.LJJIJIIJIL();
            }
            else {
                liz = this.LJJIJIL();
            }
            savedState.LIZ = liz;
            View view;
            if (this.LJI) {
                view = this.LIZJ(true);
            }
            else {
                view = this.LIZIZ(true);
            }
            int lji;
            if (view == null) {
                lji = n;
            }
            else {
                lji = ((RecyclerView.i)this).LJI(view);
            }
            savedState.LIZIZ = lji;
            savedState.LIZJ = this.LIZ;
            savedState.LIZLLL = new int[this.LIZ];
            while (i < this.LIZ) {
                int n3 = 0;
                Label_0233: {
                    int n2;
                    int n4;
                    if (this.LJIILJJIL) {
                        n2 = this.LIZIZ[i].LIZIZ(Integer.MIN_VALUE);
                        if ((n3 = n2) == Integer.MIN_VALUE) {
                            break Label_0233;
                        }
                        n4 = this.LIZJ.LIZJ();
                    }
                    else {
                        n2 = this.LIZIZ[i].LIZ(Integer.MIN_VALUE);
                        if ((n3 = n2) == Integer.MIN_VALUE) {
                            break Label_0233;
                        }
                        n4 = this.LIZJ.LIZIZ();
                    }
                    n3 = n2 - n4;
                }
                savedState.LIZLLL[i] = n3;
                ++i;
            }
        }
        else {
            savedState.LIZ = -1;
            savedState.LIZIZ = -1;
            savedState.LIZJ = 0;
        }
        return (Parcelable)savedState;
    }
    
    @Override
    public final void LJ(final int ljii) {
        final SavedState ljiilliil = this.LJIILLIIL;
        if (ljiilliil != null && ljiilliil.LIZ != ljii) {
            this.LJIILLIIL.LIZIZ();
        }
        this.LJII = ljii;
        this.LJIIIIZZ = Integer.MIN_VALUE;
        ((RecyclerView.i)this).LJIILJJIL();
    }
    
    @Override
    public final int LJFF(final t t) {
        return this.LJIIIIZZ(t);
    }
    
    @Override
    public final boolean LJFF() {
        return this.LJ == 0;
    }
    
    @Override
    public final int LJI(final t t) {
        return this.LJIIIIZZ(t);
    }
    
    @Override
    public boolean LJI() {
        return this.LJ == 1;
    }
    
    @Override
    public final void LJII(final int n) {
        super.LJII(n);
        for (int i = 0; i < this.LIZ; ++i) {
            this.LIZIZ[i].LIZLLL(n);
        }
    }
    
    public final boolean LJII() {
        if (((RecyclerView.i)this).LJIJI() == 0 || this.LJIIJ == 0 || !super.LJJIII) {
            return false;
        }
        int n;
        int n2;
        if (this.LJI) {
            n = this.LJJIJIIJIL();
            n2 = this.LJJIJIL();
        }
        else {
            n = this.LJJIJIL();
            n2 = this.LJJIJIIJIL();
        }
        if (n == 0 && this.LJIIL() != null) {
            this.LJIIIZ.LIZ();
            super.LJJII = true;
            ((RecyclerView.i)this).LJIILJJIL();
            return true;
        }
        if (!this.LJIJJ) {
            return false;
        }
        int n3;
        if (this.LJI) {
            n3 = -1;
        }
        else {
            n3 = 1;
        }
        final LazySpanLookup ljiiiz = this.LJIIIZ;
        ++n2;
        final FullSpanItem liz = ljiiiz.LIZ(n, n2, n3);
        if (liz == null) {
            this.LJIJJ = false;
            this.LJIIIZ.LIZ(n2);
            return false;
        }
        final FullSpanItem liz2 = this.LJIIIZ.LIZ(n, liz.LIZ, n3 * -1);
        if (liz2 == null) {
            this.LJIIIZ.LIZ(liz.LIZ);
        }
        else {
            this.LJIIIZ.LIZ(liz2.LIZ + 1);
        }
        super.LJJII = true;
        ((RecyclerView.i)this).LJIILJJIL();
        return true;
    }
    
    public final void LJIIIIZZ() {
        ((RecyclerView.i)this).LIZ((String)null);
        if (this.LJIIJ == 0) {
            return;
        }
        this.LJIIJ = 0;
        ((RecyclerView.i)this).LJIILJJIL();
    }
    
    @Override
    public final void LJIIIIZZ(final int n) {
        super.LJIIIIZZ(n);
        for (int i = 0; i < this.LIZ; ++i) {
            this.LIZIZ[i].LIZLLL(n);
        }
    }
    
    @Override
    public final void LJIIIZ(final int n) {
        if (n == 0) {
            this.LJII();
        }
    }
    
    public final void LJIIJ() {
        this.LJIIIZ.LIZ();
        ((RecyclerView.i)this).LJIILJJIL();
    }
    
    @Override
    public final boolean ak_() {
        return this.LJIIJ != 0;
    }
    
    @Override
    public boolean al_() {
        return this.LJIILLIIL == null;
    }
    
    @Override
    public final void am_() {
        this.LJIIIZ.LIZ();
        ((RecyclerView.i)this).LJIILJJIL();
    }
    
    public static final class LazySpanLookup
    {
        public int[] LIZ;
        public List<FullSpanItem> LIZIZ;
        
        static {
            Covode.recordClassIndex(1554);
        }
        
        private void LIZJ(final int n, final int n2) {
            final List<FullSpanItem> liziz = this.LIZIZ;
            if (liziz == null) {
                return;
            }
            for (int i = liziz.size() - 1; i >= 0; --i) {
                final FullSpanItem fullSpanItem = this.LIZIZ.get(i);
                if (fullSpanItem.LIZ >= n) {
                    if (fullSpanItem.LIZ < n + n2) {
                        this.LIZIZ.remove(i);
                    }
                    else {
                        fullSpanItem.LIZ -= n2;
                    }
                }
            }
        }
        
        private void LIZLLL(final int n, final int n2) {
            final List<FullSpanItem> liziz = this.LIZIZ;
            if (liziz == null) {
                return;
            }
            for (int i = liziz.size() - 1; i >= 0; --i) {
                final FullSpanItem fullSpanItem = this.LIZIZ.get(i);
                if (fullSpanItem.LIZ >= n) {
                    fullSpanItem.LIZ += n2;
                }
            }
        }
        
        private int LJ(final int n) {
            int i;
            for (i = this.LIZ.length; i <= n; i *= 2) {}
            return i;
        }
        
        private void LJFF(final int n) {
            final int[] liz = this.LIZ;
            if (liz == null) {
                Arrays.fill(this.LIZ = new int[Math.max(n, 10) + 1], -1);
                return;
            }
            if (n >= liz.length) {
                System.arraycopy(liz, 0, this.LIZ = new int[this.LJ(n)], 0, liz.length);
                final int[] liz2 = this.LIZ;
                Arrays.fill(liz2, liz.length, liz2.length, -1);
            }
        }
        
        private int LJI(final int n) {
            if (this.LIZIZ == null) {
                return -1;
            }
            final FullSpanItem lizlll = this.LIZLLL(n);
            if (lizlll != null) {
                this.LIZIZ.remove(lizlll);
            }
            final int size = this.LIZIZ.size();
            int i = 0;
            while (i < size) {
                if (this.LIZIZ.get(i).LIZ >= n) {
                    if (i != -1) {
                        final FullSpanItem fullSpanItem = this.LIZIZ.get(i);
                        this.LIZIZ.remove(i);
                        return fullSpanItem.LIZ;
                    }
                    break;
                }
                else {
                    ++i;
                }
            }
            return -1;
        }
        
        public final int LIZ(final int n) {
            final List<FullSpanItem> liziz = this.LIZIZ;
            if (liziz != null) {
                for (int i = liziz.size() - 1; i >= 0; --i) {
                    if (this.LIZIZ.get(i).LIZ >= n) {
                        this.LIZIZ.remove(i);
                    }
                }
            }
            return this.LIZIZ(n);
        }
        
        public final FullSpanItem LIZ(final int n, final int n2, final int n3) {
            final List<FullSpanItem> liziz = this.LIZIZ;
            if (liziz == null) {
                return null;
            }
            for (int size = liziz.size(), i = 0; i < size; ++i) {
                final FullSpanItem fullSpanItem = this.LIZIZ.get(i);
                if (fullSpanItem.LIZ >= n2) {
                    return null;
                }
                if (fullSpanItem.LIZ >= n && (n3 == 0 || fullSpanItem.LIZIZ == n3 || fullSpanItem.LIZLLL)) {
                    return fullSpanItem;
                }
            }
            return null;
        }
        
        public final void LIZ() {
            final int[] liz = this.LIZ;
            if (liz != null) {
                Arrays.fill(liz, -1);
            }
            this.LIZIZ = null;
        }
        
        public final void LIZ(final int n, final int n2) {
            final int[] liz = this.LIZ;
            if (liz != null && n < liz.length) {
                final int n3 = n + n2;
                this.LJFF(n3);
                final int[] liz2 = this.LIZ;
                System.arraycopy(liz2, n3, liz2, n, liz2.length - n - n2);
                final int[] liz3 = this.LIZ;
                Arrays.fill(liz3, liz3.length - n2, liz3.length, -1);
                this.LIZJ(n, n2);
            }
        }
        
        public final void LIZ(final int n, final c c) {
            this.LJFF(n);
            this.LIZ[n] = c.LJ;
        }
        
        public final void LIZ(final FullSpanItem fullSpanItem) {
            if (this.LIZIZ == null) {
                this.LIZIZ = new ArrayList<FullSpanItem>();
            }
            for (int size = this.LIZIZ.size(), i = 0; i < size; ++i) {
                final FullSpanItem fullSpanItem2 = this.LIZIZ.get(i);
                if (fullSpanItem2.LIZ == fullSpanItem.LIZ) {
                    this.LIZIZ.remove(i);
                }
                if (fullSpanItem2.LIZ >= fullSpanItem.LIZ) {
                    this.LIZIZ.add(i, fullSpanItem);
                    return;
                }
            }
            this.LIZIZ.add(fullSpanItem);
        }
        
        public final int LIZIZ(final int n) {
            final int[] liz = this.LIZ;
            if (liz == null) {
                return -1;
            }
            if (n >= liz.length) {
                return -1;
            }
            final int lji = this.LJI(n);
            if (lji == -1) {
                final int[] liz2 = this.LIZ;
                Arrays.fill(liz2, n, liz2.length, -1);
                return this.LIZ.length;
            }
            final int min = Math.min(lji + 1, this.LIZ.length);
            Arrays.fill(this.LIZ, n, min, -1);
            return min;
        }
        
        public final void LIZIZ(final int n, final int n2) {
            final int[] liz = this.LIZ;
            if (liz != null && n < liz.length) {
                final int n3 = n + n2;
                this.LJFF(n3);
                final int[] liz2 = this.LIZ;
                System.arraycopy(liz2, n, liz2, n3, liz2.length - n - n2);
                Arrays.fill(this.LIZ, n, n3, -1);
                this.LIZLLL(n, n2);
            }
        }
        
        public final int LIZJ(final int n) {
            final int[] liz = this.LIZ;
            if (liz == null || n >= liz.length) {
                return -1;
            }
            return liz[n];
        }
        
        public final FullSpanItem LIZLLL(final int n) {
            final List<FullSpanItem> liziz = this.LIZIZ;
            if (liziz == null) {
                return null;
            }
            for (int i = liziz.size() - 1; i >= 0; --i) {
                final FullSpanItem fullSpanItem = this.LIZIZ.get(i);
                if (fullSpanItem.LIZ == n) {
                    return fullSpanItem;
                }
            }
            return null;
        }
        
        public static class FullSpanItem implements Parcelable
        {
            public static final Parcelable$Creator<FullSpanItem> CREATOR;
            public int LIZ;
            public int LIZIZ;
            public int[] LIZJ;
            public boolean LIZLLL;
            
            static {
                Covode.recordClassIndex(1555);
                CREATOR = (Parcelable$Creator)new Parcelable$Creator<FullSpanItem>() {
                    static {
                        Covode.recordClassIndex(1556);
                    }
                };
            }
            
            public FullSpanItem() {
            }
            
            public FullSpanItem(final Parcel parcel) {
                this.LIZ = parcel.readInt();
                this.LIZIZ = parcel.readInt();
                final int int1 = parcel.readInt();
                boolean lizlll = true;
                if (int1 != 1) {
                    lizlll = false;
                }
                this.LIZLLL = lizlll;
                final int int2 = parcel.readInt();
                if (int2 > 0) {
                    parcel.readIntArray(this.LIZJ = new int[int2]);
                }
            }
            
            public final int LIZ(final int n) {
                final int[] lizj = this.LIZJ;
                if (lizj == null) {
                    return 0;
                }
                return lizj[n];
            }
            
            public int describeContents() {
                return 0;
            }
            
            @Override
            public String toString() {
                final StringBuilder sb = new StringBuilder("FullSpanItem{mPosition=");
                sb.append(this.LIZ);
                sb.append(", mGapDir=");
                sb.append(this.LIZIZ);
                sb.append(", mHasUnwantedGapAfter=");
                sb.append(this.LIZLLL);
                sb.append(", mGapPerSpan=");
                sb.append(Arrays.toString(this.LIZJ));
                sb.append('}');
                return sb.toString();
            }
            
            public void writeToParcel(final Parcel parcel, final int n) {
                parcel.writeInt(this.LIZ);
                parcel.writeInt(this.LIZIZ);
                parcel.writeInt((int)(this.LIZLLL ? 1 : 0));
                final int[] lizj = this.LIZJ;
                if (lizj != null && lizj.length > 0) {
                    parcel.writeInt(lizj.length);
                    parcel.writeIntArray(this.LIZJ);
                    return;
                }
                parcel.writeInt(0);
            }
        }
    }
    
    public static class SavedState implements Parcelable
    {
        public static final Parcelable$Creator<SavedState> CREATOR;
        public int LIZ;
        public int LIZIZ;
        public int LIZJ;
        public int[] LIZLLL;
        public int LJ;
        public int[] LJFF;
        public List<FullSpanItem> LJI;
        public boolean LJII;
        public boolean LJIIIIZZ;
        public boolean LJIIIZ;
        
        static {
            Covode.recordClassIndex(1557);
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<SavedState>() {
                static {
                    Covode.recordClassIndex(1558);
                }
            };
        }
        
        public SavedState() {
        }
        
        public SavedState(final Parcel parcel) {
            this.LIZ = parcel.readInt();
            this.LIZIZ = parcel.readInt();
            final int int1 = parcel.readInt();
            this.LIZJ = int1;
            if (int1 > 0) {
                parcel.readIntArray(this.LIZLLL = new int[int1]);
            }
            final int int2 = parcel.readInt();
            if ((this.LJ = int2) > 0) {
                parcel.readIntArray(this.LJFF = new int[int2]);
            }
            final int int3 = parcel.readInt();
            final boolean b = false;
            this.LJII = (int3 == 1);
            this.LJIIIIZZ = (parcel.readInt() == 1);
            boolean ljiiiz = b;
            if (parcel.readInt() == 1) {
                ljiiiz = true;
            }
            this.LJIIIZ = ljiiiz;
            this.LJI = parcel.readArrayList(FullSpanItem.class.getClassLoader());
        }
        
        public SavedState(final SavedState savedState) {
            this.LIZJ = savedState.LIZJ;
            this.LIZ = savedState.LIZ;
            this.LIZIZ = savedState.LIZIZ;
            this.LIZLLL = savedState.LIZLLL;
            this.LJ = savedState.LJ;
            this.LJFF = savedState.LJFF;
            this.LJII = savedState.LJII;
            this.LJIIIIZZ = savedState.LJIIIIZZ;
            this.LJIIIZ = savedState.LJIIIZ;
            this.LJI = savedState.LJI;
        }
        
        public final void LIZ() {
            this.LIZLLL = null;
            this.LIZJ = 0;
            this.LJ = 0;
            this.LJFF = null;
            this.LJI = null;
        }
        
        public final void LIZIZ() {
            this.LIZLLL = null;
            this.LIZJ = 0;
            this.LIZ = -1;
            this.LIZIZ = -1;
        }
        
        public int describeContents() {
            return 0;
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            parcel.writeInt(this.LIZ);
            parcel.writeInt(this.LIZIZ);
            parcel.writeInt(this.LIZJ);
            if (this.LIZJ > 0) {
                parcel.writeIntArray(this.LIZLLL);
            }
            parcel.writeInt(this.LJ);
            if (this.LJ > 0) {
                parcel.writeIntArray(this.LJFF);
            }
            parcel.writeInt((int)(this.LJII ? 1 : 0));
            parcel.writeInt((int)(this.LJIIIIZZ ? 1 : 0));
            parcel.writeInt((int)(this.LJIIIZ ? 1 : 0));
            parcel.writeList((List)this.LJI);
        }
    }
}
