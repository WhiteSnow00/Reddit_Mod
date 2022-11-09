// 
// Decompiled by Procyon v0.6.0
// 

package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.view.ViewGroup$LayoutParams;
import android.graphics.PointF;
import X.17G;
import android.view.accessibility.AccessibilityEvent;
import android.os.Parcelable;
import java.util.List;
import X.0Ee;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import X.0Fj;
import X.17E;

public class LinearLayoutManager extends i implements s.b, d
{
    public LinearLayoutManager.c LIZ;
    public boolean LIZIZ;
    public final LinearLayoutManager.b LIZJ;
    public int[] LIZLLL;
    public int LJIIIZ;
    public 0Fj LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public boolean LJIIZILJ;
    public SavedState LJIJ;
    public final LinearLayoutManager.a LJIJI;
    public int LJIJJ;
    
    static {
        Covode.recordClassIndex(1501);
    }
    
    public LinearLayoutManager() {
        this(1, false);
    }
    
    public LinearLayoutManager(final int n, final boolean b) {
        this.LJIIIZ = 1;
        this.LJIILJJIL = true;
        this.LJIILL = -1;
        this.LJIILLIIL = Integer.MIN_VALUE;
        this.LJIJI = new LinearLayoutManager.a();
        this.LIZJ = new LinearLayoutManager.b();
        this.LJIJJ = 2;
        this.LIZLLL = new int[2];
        this.LIZIZ(n);
        this.LIZIZ(b);
    }
    
    public LinearLayoutManager(final Context context, final AttributeSet set, final int n, final int n2) {
        this.LJIIIZ = 1;
        this.LJIILJJIL = true;
        this.LJIILL = -1;
        this.LJIILLIIL = Integer.MIN_VALUE;
        this.LJIJI = new LinearLayoutManager.a();
        this.LIZJ = new LinearLayoutManager.b();
        this.LJIJJ = 2;
        this.LIZLLL = new int[2];
        final i.b liz = i.LIZ(context, set, n, n2);
        this.LIZIZ(liz.LIZ);
        this.LIZIZ(liz.LIZJ);
        this.LIZ(liz.LIZLLL);
    }
    
    private int LIZ(int n, final o o, final t t, final boolean b) {
        final int n2 = this.LJIIJ.LIZJ() - n;
        if (n2 > 0) {
            final int n3 = -this.LIZJ(-n2, o, t);
            if (b) {
                n = this.LJIIJ.LIZJ() - (n + n3);
                if (n > 0) {
                    this.LJIIJ.LIZ(n);
                    return n + n3;
                }
            }
            return n3;
        }
        return 0;
    }
    
    private int LIZ(final o o, final LinearLayoutManager.c c, final t t, final boolean b) {
        final int lizj = c.LIZJ;
        if (c.LJI != Integer.MIN_VALUE) {
            if (c.LIZJ < 0) {
                c.LJI += c.LIZJ;
            }
            this.LIZ(o, c);
        }
        int n = c.LIZJ + c.LJII;
        final LinearLayoutManager.b lizj2 = this.LIZJ;
        while ((c.LJIIJJI || n > 0) && c.LIZ(t)) {
            lizj2.LIZ();
            this.LIZ(o, t, c, lizj2);
            if (lizj2.LIZIZ) {
                break;
            }
            c.LIZIZ += lizj2.LIZ * c.LJFF;
            int n2 = 0;
            Label_0169: {
                if (lizj2.LIZJ && c.LJIIJ == null) {
                    n2 = n;
                    if (t.LJI) {
                        break Label_0169;
                    }
                }
                c.LIZJ -= lizj2.LIZ;
                n2 = n - lizj2.LIZ;
            }
            if (c.LJI != Integer.MIN_VALUE) {
                c.LJI += lizj2.LIZ;
                if (c.LIZJ < 0) {
                    c.LJI += c.LIZJ;
                }
                this.LIZ(o, c);
            }
            n = n2;
            if (!b) {
                continue;
            }
            n = n2;
            if (lizj2.LIZLLL) {
                break;
            }
        }
        return lizj - c.LIZJ;
    }
    
    private View LIZ(final int n, final int n2, final boolean b, final boolean b2) {
        this.LJIIIIZZ();
        int n3 = 320;
        int n4;
        if (b) {
            n4 = 24579;
        }
        else {
            n4 = 320;
        }
        if (!b2) {
            n3 = 0;
        }
        if (this.LJIIIZ == 0) {
            return super.LJJ.LIZ(n, n2, n4, n3);
        }
        return super.LJJI.LIZ(n, n2, n4, n3);
    }
    
    private void LIZ(int lji, final int lizj, final boolean b, final t t) {
        this.LIZ.LJIIJJI = this.LJJIJ();
        this.LIZ.LJFF = lji;
        final int[] lizlll = this.LIZLLL;
        boolean b2 = false;
        lizlll[0] = 0;
        final int n = 1;
        final int n2 = 1;
        lizlll[1] = 0;
        this.LIZ(t, lizlll);
        final int max = Math.max(0, this.LIZLLL[0]);
        int max2 = Math.max(0, this.LIZLLL[1]);
        if (lji == 1) {
            b2 = true;
        }
        final LinearLayoutManager.c liz = this.LIZ;
        if (b2) {
            lji = max2;
        }
        else {
            lji = max;
        }
        liz.LJII = lji;
        final LinearLayoutManager.c liz2 = this.LIZ;
        if (b2) {
            max2 = max;
        }
        liz2.LJIIIIZZ = max2;
        if (b2) {
            final LinearLayoutManager.c liz3 = this.LIZ;
            liz3.LJII += this.LJIIJ.LJFF();
            final View ljjijiijil = this.LJJIJIIJIL();
            final LinearLayoutManager.c liz4 = this.LIZ;
            lji = n2;
            if (this.LJIIL) {
                lji = -1;
            }
            liz4.LJ = lji;
            this.LIZ.LIZLLL = ((RecyclerView.i)this).LJI(ljjijiijil) + this.LIZ.LJ;
            this.LIZ.LIZIZ = this.LJIIJ.LIZIZ(ljjijiijil);
            lji = this.LJIIJ.LIZIZ(ljjijiijil) - this.LJIIJ.LIZJ();
        }
        else {
            final View ljjijiiji = this.LJJIJIIJI();
            final LinearLayoutManager.c liz5 = this.LIZ;
            liz5.LJII += this.LJIIJ.LIZIZ();
            final LinearLayoutManager.c liz6 = this.LIZ;
            if (this.LJIIL) {
                lji = n;
            }
            else {
                lji = -1;
            }
            liz6.LJ = lji;
            this.LIZ.LIZLLL = ((RecyclerView.i)this).LJI(ljjijiiji) + this.LIZ.LJ;
            this.LIZ.LIZIZ = this.LJIIJ.LIZ(ljjijiiji);
            lji = -this.LJIIJ.LIZ(ljjijiiji) + this.LJIIJ.LIZIZ();
        }
        this.LIZ.LIZJ = lizj;
        if (b) {
            final LinearLayoutManager.c liz7 = this.LIZ;
            liz7.LIZJ -= lji;
        }
        this.LIZ.LJI = lji;
    }
    
    private void LIZ(final LinearLayoutManager.a a) {
        this.LJ(a.LIZIZ, a.LIZJ);
    }
    
    private void LIZ(final o o, final int n, int i) {
        if (n == i) {
            return;
        }
        int j;
        if (i > (j = n)) {
            --i;
            while (i >= n) {
                ((RecyclerView.i)this).LIZ(i, o);
                --i;
            }
            return;
        }
        while (j > i) {
            ((RecyclerView.i)this).LIZ(j, o);
            --j;
        }
    }
    
    private void LIZ(final o o, final LinearLayoutManager.c c) {
        if (c.LIZ && !c.LJIIJJI) {
            final int lji = c.LJI;
            final int ljiiiizz = c.LJIIIIZZ;
            if (c.LJFF == -1) {
                int ljiji = ((RecyclerView.i)this).LJIJI();
                if (lji >= 0) {
                    final int n = this.LJIIJ.LIZLLL() - lji + ljiiiizz;
                    if (this.LJIIL) {
                        for (int i = 0; i < ljiji; ++i) {
                            final View lji2 = ((RecyclerView.i)this).LJI(i);
                            if (this.LJIIJ.LIZ(lji2) < n || this.LJIIJ.LIZLLL(lji2) < n) {
                                this.LIZ(o, 0, i);
                                break;
                            }
                        }
                        return;
                    }
                    for (int j = --ljiji; j >= 0; --j) {
                        final View lji3 = ((RecyclerView.i)this).LJI(j);
                        if (this.LJIIJ.LIZ(lji3) < n || this.LJIIJ.LIZLLL(lji3) < n) {
                            this.LIZ(o, ljiji, j);
                            break;
                        }
                    }
                }
                return;
            }
            if (lji >= 0) {
                final int n2 = lji - ljiiiizz;
                int ljiji2 = ((RecyclerView.i)this).LJIJI();
                if (this.LJIIL) {
                    for (int k = --ljiji2; k >= 0; --k) {
                        final View lji4 = ((RecyclerView.i)this).LJI(k);
                        if (this.LJIIJ.LIZIZ(lji4) > n2 || this.LJIIJ.LIZJ(lji4) > n2) {
                            this.LIZ(o, ljiji2, k);
                            break;
                        }
                    }
                    return;
                }
                for (int l = 0; l < ljiji2; ++l) {
                    final View lji5 = ((RecyclerView.i)this).LJI(l);
                    if (this.LJIIJ.LIZIZ(lji5) > n2 || this.LJIIJ.LIZJ(lji5) > n2) {
                        this.LIZ(o, 0, l);
                        break;
                    }
                }
            }
        }
    }
    
    private void LIZ(final t t, final int[] array) {
        int lj;
        if (t.LIZ != -1) {
            lj = this.LJIIJ.LJ();
        }
        else {
            lj = 0;
        }
        int n;
        if (this.LIZ.LJFF == -1) {
            n = 0;
        }
        else {
            final int n2 = 0;
            n = lj;
            lj = n2;
        }
        array[0] = lj;
        array[1] = n;
    }
    
    private int LIZIZ(int n, final o o, final t t, final boolean b) {
        final int n2 = n - this.LJIIJ.LIZIZ();
        if (n2 > 0) {
            int n4;
            final int n3 = n4 = -this.LIZJ(n2, o, t);
            if (b) {
                n = n + n3 - this.LJIIJ.LIZIZ();
                n4 = n3;
                if (n > 0) {
                    this.LJIIJ.LIZ(-n);
                    n4 = n3 - n;
                }
            }
            return n4;
        }
        return 0;
    }
    
    private void LIZIZ(final LinearLayoutManager.a a) {
        this.LJFF(a.LIZIZ, a.LIZJ);
    }
    
    private int LIZJ(int ljiiiz, final o o, final t t) {
        if (((RecyclerView.i)this).LJIJI() == 0 || ljiiiz == 0) {
            return 0;
        }
        this.LJIIIIZZ();
        this.LIZ.LIZ = true;
        int n;
        if (ljiiiz > 0) {
            n = 1;
        }
        else {
            n = -1;
        }
        final int abs = Math.abs(ljiiiz);
        this.LIZ(n, abs, true, t);
        final int n2 = this.LIZ.LJI + this.LIZ(o, this.LIZ, t, false);
        if (n2 < 0) {
            return 0;
        }
        if (abs > n2) {
            ljiiiz = n * n2;
        }
        this.LJIIJ.LIZ(-ljiiiz);
        return this.LIZ.LJIIIZ = ljiiiz;
    }
    
    private void LJ(final int lizlll, final int liziz) {
        this.LIZ.LIZJ = this.LJIIJ.LIZJ() - liziz;
        final LinearLayoutManager.c liz = this.LIZ;
        int lj;
        if (this.LJIIL) {
            lj = -1;
        }
        else {
            lj = 1;
        }
        liz.LJ = lj;
        this.LIZ.LIZLLL = lizlll;
        this.LIZ.LJFF = 1;
        this.LIZ.LIZIZ = liziz;
        this.LIZ.LJI = Integer.MIN_VALUE;
    }
    
    private void LJFF(int n, final int liziz) {
        this.LIZ.LIZJ = liziz - this.LJIIJ.LIZIZ();
        this.LIZ.LIZLLL = n;
        final LinearLayoutManager.c liz = this.LIZ;
        if (this.LJIIL) {
            n = 1;
        }
        else {
            n = -1;
        }
        liz.LJ = n;
        this.LIZ.LJFF = -1;
        this.LIZ.LIZIZ = liziz;
        this.LIZ.LJI = Integer.MIN_VALUE;
    }
    
    private View LJI(final int n, final int n2) {
        this.LJIIIIZZ();
        if (n2 <= n && n2 >= n) {
            return ((RecyclerView.i)this).LJI(n);
        }
        int n3;
        int n4;
        if (this.LJIIJ.LIZ(((RecyclerView.i)this).LJI(n)) < this.LJIIJ.LIZIZ()) {
            n3 = 16644;
            n4 = 16388;
        }
        else {
            n3 = 4161;
            n4 = 4097;
        }
        if (this.LJIIIZ == 0) {
            return super.LJJ.LIZ(n, n2, n3, n4);
        }
        return super.LJJI.LIZ(n, n2, n3, n4);
    }
    
    private int LJII(final t t) {
        if (((RecyclerView.i)this).LJIJI() == 0) {
            return 0;
        }
        this.LJIIIIZZ();
        return 0Ee.LIZ(t, this.LJIIJ, this.LIZJ(this.LJIILJJIL ^ true), this.LIZLLL(this.LJIILJJIL ^ true), this, this.LJIILJJIL, this.LJIIL);
    }
    
    private int LJIIIIZZ(final t t) {
        if (((RecyclerView.i)this).LJIJI() == 0) {
            return 0;
        }
        this.LJIIIIZZ();
        return 0Ee.LIZ(t, this.LJIIJ, this.LIZJ(this.LJIILJJIL ^ true), this.LIZLLL(this.LJIILJJIL ^ true), this, this.LJIILJJIL);
    }
    
    private int LJIIIZ(final t t) {
        if (((RecyclerView.i)this).LJIJI() == 0) {
            return 0;
        }
        this.LJIIIIZZ();
        return 0Ee.LIZIZ(t, this.LJIIJ, this.LIZJ(this.LJIILJJIL ^ true), this.LIZLLL(this.LJIILJJIL ^ true), this, this.LJIILJJIL);
    }
    
    private void LJJIIZI() {
        final int ljiiiz = this.LJIIIZ;
        boolean ljiijji = true;
        if (ljiiiz == 1 || !this.LJII()) {
            ljiijji = this.LJIIJJI;
        }
        else if (this.LJIIJJI) {
            ljiijji = false;
        }
        this.LJIIL = ljiijji;
    }
    
    private boolean LJJIJ() {
        return this.LJIIJ.LJI() == 0 && this.LJIIJ.LIZLLL() == 0;
    }
    
    private View LJJIJIIJI() {
        int n;
        if (this.LJIIL) {
            n = ((RecyclerView.i)this).LJIJI() - 1;
        }
        else {
            n = 0;
        }
        return ((RecyclerView.i)this).LJI(n);
    }
    
    private View LJJIJIIJIL() {
        int n;
        if (this.LJIIL) {
            n = 0;
        }
        else {
            n = ((RecyclerView.i)this).LJIJI() - 1;
        }
        return ((RecyclerView.i)this).LJI(n);
    }
    
    private View LJJIJIL() {
        return this.LJI(0, ((RecyclerView.i)this).LJIJI());
    }
    
    private View LJJIJL() {
        return this.LJI(((RecyclerView.i)this).LJIJI() - 1, -1);
    }
    
    @Override
    public int LIZ(final int n, final o o, final t t) {
        if (this.LJIIIZ == 1) {
            return 0;
        }
        return this.LIZJ(n, o, t);
    }
    
    public View LIZ(final o o, final t t, final boolean b, final boolean b2) {
        this.LJIIIIZZ();
        final int ljiji = ((RecyclerView.i)this).LJIJI();
        int n = -1;
        int i;
        int n2;
        if (b2) {
            i = ((RecyclerView.i)this).LJIJI() - 1;
            n2 = -1;
        }
        else {
            n = ljiji;
            i = 0;
            n2 = 1;
        }
        final int liz = t.LIZ();
        final int liziz = this.LJIIJ.LIZIZ();
        final int lizj = this.LJIIJ.LIZJ();
        View view = null;
        View view3;
        View view2 = view3 = null;
        while (i != n) {
            final View lji = ((RecyclerView.i)this).LJI(i);
            final int lji2 = ((RecyclerView.i)this).LJI(lji);
            final int liz2 = this.LJIIJ.LIZ(lji);
            final int liziz2 = this.LJIIJ.LIZIZ(lji);
            View view4 = view3;
            View view5 = view2;
            View view6 = view;
            Label_0179: {
                if (lji2 >= 0) {
                    view4 = view3;
                    view5 = view2;
                    view6 = view;
                    if (lji2 < liz) {
                        if (((j)lji.getLayoutParams()).LIZJ.isRemoved()) {
                            view4 = view3;
                            view5 = view2;
                            view6 = view;
                            if (view3 == null) {
                                view6 = view;
                                view5 = view2;
                                view4 = lji;
                            }
                        }
                        else {
                            boolean b3;
                            if (liziz2 <= liziz && liz2 < liziz) {
                                b3 = true;
                            }
                            else {
                                b3 = false;
                            }
                            boolean b4;
                            if (liz2 >= lizj && liziz2 > lizj) {
                                b4 = true;
                            }
                            else {
                                b4 = false;
                            }
                            if (!b3 && !b4) {
                                return lji;
                            }
                            Label_0319: {
                                if (b) {
                                    if (!b4) {
                                        view4 = view3;
                                        view5 = view2;
                                        if ((view6 = view) == null) {
                                            break Label_0319;
                                        }
                                        break Label_0179;
                                    }
                                }
                                else if (!b3) {
                                    view4 = view3;
                                    view5 = view2;
                                    if ((view6 = view) == null) {
                                        break Label_0319;
                                    }
                                    break Label_0179;
                                }
                                view4 = view3;
                                view5 = lji;
                                view6 = view;
                                break Label_0179;
                            }
                            view4 = view3;
                            view5 = view2;
                            view6 = lji;
                        }
                    }
                }
            }
            i += n2;
            view3 = view4;
            view2 = view5;
            view = view6;
        }
        if (view != null) {
            return view;
        }
        if (view2 != null) {
            return view2;
        }
        return view3;
    }
    
    @Override
    public View LIZ(View view, int ljff, final o o, final t t) {
        this.LJJIIZI();
        if (((RecyclerView.i)this).LJIJI() == 0) {
            return null;
        }
        ljff = this.LJFF(ljff);
        if (ljff == Integer.MIN_VALUE) {
            return null;
        }
        this.LJIIIIZZ();
        this.LIZ(ljff, (int)(this.LJIIJ.LJ() * 0.33333334f), false, t);
        this.LIZ.LJI = Integer.MIN_VALUE;
        this.LIZ.LIZ = false;
        this.LIZ(o, this.LIZ, t, true);
        View view2 = null;
        Label_0104: {
            if (ljff == -1) {
                if (this.LJIIL) {
                    view = this.LJJIJL();
                }
                else {
                    view = this.LJJIJIL();
                }
            }
            else {
                if (this.LJIIL) {
                    view = this.LJJIJIL();
                }
                else {
                    view = this.LJJIJL();
                }
                if (ljff != -1) {
                    view2 = this.LJJIJIIJIL();
                    break Label_0104;
                }
            }
            view2 = this.LJJIJIIJI();
        }
        if (!view2.hasFocusable()) {
            return view;
        }
        if (view == null) {
            return null;
        }
        return view2;
    }
    
    public void LIZ(final int ljiill, final int ljiilliil) {
        this.LJIILL = ljiill;
        this.LJIILLIIL = ljiilliil;
        final SavedState ljij = this.LJIJ;
        if (ljij != null) {
            ljij.LIZ = -1;
        }
        ((RecyclerView.i)this).LJIILJJIL();
    }
    
    public final void LIZ(int n, int n2, final t t, final i.a a) {
        if (this.LJIIIZ != 0) {
            n = n2;
        }
        if (((RecyclerView.i)this).LJIJI() != 0 && n != 0) {
            this.LJIIIIZZ();
            if (n > 0) {
                n2 = 1;
            }
            else {
                n2 = -1;
            }
            this.LIZ(n2, Math.abs(n), true, t);
            this.LIZ(t, this.LIZ, a);
        }
    }
    
    public final void LIZ(final int n, final i.a a) {
        final SavedState ljij = this.LJIJ;
        final int n2 = -1;
        while (true) {
            int n4 = 0;
            Label_0145: {
                int lizj;
                int liz;
                if (ljij != null && ljij.LIZ()) {
                    lizj = (this.LJIJ.LIZJ ? 1 : 0);
                    liz = this.LJIJ.LIZ;
                }
                else {
                    this.LJJIIZI();
                    final boolean ljiil = this.LJIIL;
                    final int ljiill = this.LJIILL;
                    lizj = (ljiil ? 1 : 0);
                    if ((liz = ljiill) == -1) {
                        if (ljiil) {
                            liz = n - 1;
                            final int n3 = n2;
                            break Label_0050;
                        }
                        n4 = 0;
                        break Label_0145;
                    }
                }
                n4 = liz;
                if (lizj == 0) {
                    break Label_0145;
                }
                final int n3 = n2;
                for (int n5 = 0; n5 < this.LJIJJ && liz >= 0 && liz < n; liz += n3, ++n5) {
                    a.LIZ(liz, 0);
                }
                return;
            }
            final int n6 = 1;
            int liz = n4;
            final int n3 = n6;
            continue;
        }
    }
    
    public void LIZ(final o o, final t t, final LinearLayoutManager.a a, final int n) {
    }
    
    public void LIZ(final o o, final t t, final LinearLayoutManager.c c, final LinearLayoutManager.b b) {
        final View liz = c.LIZ(o);
        if (liz == null) {
            b.LIZIZ = true;
            return;
        }
        final j j = (j)liz.getLayoutParams();
        final List ljiij = c.LJIIJ;
        int n = false ? 1 : 0;
        if (ljiij == null) {
            if (this.LJIIL == (c.LJFF == -1)) {
                ((RecyclerView.i)this).LJ(liz);
            }
            else {
                ((RecyclerView.i)this).LIZ(liz, 0);
            }
        }
        else {
            final boolean ljiil = this.LJIIL;
            if (c.LJFF == -1) {
                n = (true ? 1 : 0);
            }
            if ((ljiil ? 1 : 0) == n) {
                ((RecyclerView.i)this).LIZJ(liz);
            }
            else {
                ((RecyclerView.i)this).LIZLLL(liz);
            }
        }
        ((RecyclerView.i)this).LJIILIIL(liz);
        b.LIZ = this.LJIIJ.LJ(liz);
        int liziz;
        int n2;
        int liziz2;
        int n3;
        if (this.LJIIIZ == 1) {
            if (this.LJII()) {
                liziz = super.LJJIJIL - ((RecyclerView.i)this).LJIL();
                n2 = liziz - this.LJIIJ.LJFF(liz);
            }
            else {
                n2 = ((RecyclerView.i)this).LJIJJ();
                liziz = this.LJIIJ.LJFF(liz) + n2;
            }
            if (c.LJFF == -1) {
                liziz2 = c.LIZIZ;
                n3 = c.LIZIZ - b.LIZ;
            }
            else {
                n3 = c.LIZIZ;
                liziz2 = c.LIZIZ + b.LIZ;
            }
        }
        else {
            n3 = ((RecyclerView.i)this).LJIJJLI();
            liziz2 = this.LJIIJ.LJFF(liz) + n3;
            if (c.LJFF == -1) {
                liziz = c.LIZIZ;
                n2 = c.LIZIZ - b.LIZ;
            }
            else {
                n2 = c.LIZIZ;
                liziz = c.LIZIZ + b.LIZ;
            }
        }
        ((RecyclerView.i)this).LIZIZ(liz, n2, n3, liziz, liziz2);
        if (j.LIZJ.isRemoved() || j.LIZJ.isUpdated()) {
            b.LIZJ = true;
        }
        b.LIZLLL = liz.hasFocusable();
    }
    
    @Override
    public void LIZ(final t t) {
        super.LIZ(t);
        this.LJIJ = null;
        this.LJIILL = -1;
        this.LJIILLIIL = Integer.MIN_VALUE;
        this.LJIJI.LIZ();
    }
    
    public void LIZ(final t t, final LinearLayoutManager.c c, final i.a a) {
        final int lizlll = c.LIZLLL;
        if (lizlll >= 0 && lizlll < t.LIZ()) {
            a.LIZ(lizlll, Math.max(0, c.LJI));
        }
    }
    
    @Override
    public void LIZ(final Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            final SavedState ljij = (SavedState)parcelable;
            this.LJIJ = ljij;
            if (this.LJIILL != -1) {
                ljij.LIZ = -1;
            }
            ((RecyclerView.i)this).LJIILJJIL();
        }
    }
    
    @Override
    public final void LIZ(final View view, final View view2) {
        ((RecyclerView.i)this).LIZ("Cannot drop a view during a scroll or layout calculation");
        this.LJIIIIZZ();
        this.LJJIIZI();
        final int lji = ((RecyclerView.i)this).LJI(view);
        final int lji2 = ((RecyclerView.i)this).LJI(view2);
        int n;
        if (lji < lji2) {
            n = 1;
        }
        else {
            n = -1;
        }
        if (this.LJIIL) {
            if (n == 1) {
                this.LIZ(lji2, this.LJIIJ.LIZJ() - (this.LJIIJ.LIZ(view2) + this.LJIIJ.LJ(view)));
                return;
            }
            this.LIZ(lji2, this.LJIIJ.LIZJ() - this.LJIIJ.LIZIZ(view2));
        }
        else {
            if (n == -1) {
                this.LIZ(lji2, this.LJIIJ.LIZ(view2));
                return;
            }
            this.LIZ(lji2, this.LJIIJ.LIZIZ(view2) - this.LJIIJ.LJ(view));
        }
    }
    
    @Override
    public final void LIZ(final AccessibilityEvent accessibilityEvent) {
        super.LIZ(accessibilityEvent);
        if (((RecyclerView.i)this).LJIJI() > 0) {
            accessibilityEvent.setFromIndex(this.LJIIJ());
            accessibilityEvent.setToIndex(this.LJIIL());
        }
    }
    
    @Override
    public void LIZ(final RecyclerView recyclerView, final o o) {
        super.LIZ(recyclerView, o);
        if (this.LJIIZILJ) {
            ((RecyclerView.i)this).LIZJ(o);
            o.LIZ();
        }
    }
    
    @Override
    public void LIZ(final RecyclerView recyclerView, final t t, final int lji) {
        final 17G 17G = new 17G(recyclerView.getContext());
        17G.LJI = lji;
        ((RecyclerView.i)this).LIZ(17G);
    }
    
    @Override
    public void LIZ(final String s) {
        if (this.LJIJ == null) {
            super.LIZ(s);
        }
    }
    
    public void LIZ(final boolean ljiiliil) {
        ((RecyclerView.i)this).LIZ((String)null);
        if (this.LJIILIIL == ljiiliil) {
            return;
        }
        this.LJIILIIL = ljiiliil;
        ((RecyclerView.i)this).LJIILJJIL();
    }
    
    @Override
    public int LIZIZ(final int n, final o o, final t t) {
        if (this.LJIIIZ == 0) {
            return 0;
        }
        return this.LIZJ(n, o, t);
    }
    
    @Override
    public int LIZIZ(final t t) {
        return this.LJIIIZ(t);
    }
    
    @Override
    public j LIZIZ() {
        return new RecyclerView.j(-2, -2);
    }
    
    public final void LIZIZ(final int ljiiiz) {
        if (ljiiiz == 0 || ljiiiz == 1) {
            ((RecyclerView.i)this).LIZ((String)null);
            if (ljiiiz != this.LJIIIZ || this.LJIIJ == null) {
                final 0Fj liz = 0Fj.LIZ(this, ljiiiz);
                this.LJIIJ = liz;
                this.LJIJI.LIZ = liz;
                this.LJIIIZ = ljiiiz;
                ((RecyclerView.i)this).LJIILJJIL();
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:".concat(String.valueOf(ljiiiz)));
    }
    
    public final void LIZIZ(final boolean ljiijji) {
        ((RecyclerView.i)this).LIZ((String)null);
        if (ljiijji == this.LJIIJJI) {
            return;
        }
        this.LJIIJJI = ljiijji;
        ((RecyclerView.i)this).LJIILJJIL();
    }
    
    @Override
    public int LIZJ(final t t) {
        return this.LJIIIZ(t);
    }
    
    @Override
    public final View LIZJ(final int n) {
        final int ljiji = ((RecyclerView.i)this).LJIJI();
        if (ljiji == 0) {
            return null;
        }
        final int n2 = n - ((RecyclerView.i)this).LJI(((RecyclerView.i)this).LJI(0));
        if (n2 >= 0 && n2 < ljiji) {
            final View lji = ((RecyclerView.i)this).LJI(n2);
            if (((RecyclerView.i)this).LJI(lji) == n) {
                return lji;
            }
        }
        return super.LIZJ(n);
    }
    
    public final View LIZJ(final boolean b) {
        if (this.LJIIL) {
            return this.LIZ(((RecyclerView.i)this).LJIJI() - 1, -1, b, true);
        }
        return this.LIZ(0, ((RecyclerView.i)this).LJIJI(), b, true);
    }
    
    @Override
    public void LIZJ(final o o, final t t) {
        if ((this.LJIJ != null || this.LJIILL != -1) && t.LIZ() == 0) {
            ((RecyclerView.i)this).LIZJ(o);
            return;
        }
        final SavedState ljij = this.LJIJ;
        if (ljij != null && ljij.LIZ()) {
            this.LJIILL = this.LJIJ.LIZ;
        }
        this.LJIIIIZZ();
        this.LIZ.LIZ = false;
        this.LJJIIZI();
        final View ljjii = ((RecyclerView.i)this).LJJII();
        if (!this.LJIJI.LJ || this.LJIILL != -1 || this.LJIJ != null) {
            this.LJIJI.LIZ();
            this.LJIJI.LIZLLL = (this.LJIIL ^ this.LJIILIIL);
            final LinearLayoutManager.a ljiji = this.LJIJI;
            Label_0225: {
                if (!t.LJI) {
                    final int ljiill = this.LJIILL;
                    if (ljiill != -1) {
                        if (ljiill < 0 || ljiill >= t.LIZ()) {
                            this.LJIILL = -1;
                            this.LJIILLIIL = Integer.MIN_VALUE;
                        }
                        else {
                            ljiji.LIZIZ = this.LJIILL;
                            final SavedState ljij2 = this.LJIJ;
                            if (ljij2 != null && ljij2.LIZ()) {
                                ljiji.LIZLLL = this.LJIJ.LIZJ;
                                if (ljiji.LIZLLL) {
                                    ljiji.LIZJ = this.LJIIJ.LIZJ() - this.LJIJ.LIZIZ;
                                    break Label_0225;
                                }
                                ljiji.LIZJ = this.LJIIJ.LIZIZ() + this.LJIJ.LIZIZ;
                                break Label_0225;
                            }
                            else if (this.LJIILLIIL == Integer.MIN_VALUE) {
                                final View lizj = ((RecyclerView.i)this).LIZJ(this.LJIILL);
                                if (lizj == null) {
                                    if (((RecyclerView.i)this).LJIJI() > 0) {
                                        ljiji.LIZLLL = (this.LJIILL < ((RecyclerView.i)this).LJI(((RecyclerView.i)this).LJI(0)) == this.LJIIL);
                                    }
                                    ljiji.LIZIZ();
                                    break Label_0225;
                                }
                                if (this.LJIIJ.LJ(lizj) > this.LJIIJ.LJ()) {
                                    ljiji.LIZIZ();
                                    break Label_0225;
                                }
                                if (this.LJIIJ.LIZ(lizj) - this.LJIIJ.LIZIZ() < 0) {
                                    ljiji.LIZJ = this.LJIIJ.LIZIZ();
                                    ljiji.LIZLLL = false;
                                    break Label_0225;
                                }
                                if (this.LJIIJ.LIZJ() - this.LJIIJ.LIZIZ(lizj) < 0) {
                                    ljiji.LIZJ = this.LJIIJ.LIZJ();
                                    ljiji.LIZLLL = true;
                                    break Label_0225;
                                }
                                int liz;
                                if (ljiji.LIZLLL) {
                                    liz = this.LJIIJ.LIZIZ(lizj) + this.LJIIJ.LIZ();
                                }
                                else {
                                    liz = this.LJIIJ.LIZ(lizj);
                                }
                                ljiji.LIZJ = liz;
                                break Label_0225;
                            }
                            else {
                                ljiji.LIZLLL = this.LJIIL;
                                if (this.LJIIL) {
                                    ljiji.LIZJ = this.LJIIJ.LIZJ() - this.LJIILLIIL;
                                    break Label_0225;
                                }
                                ljiji.LIZJ = this.LJIIJ.LIZIZ() + this.LJIILLIIL;
                                break Label_0225;
                            }
                        }
                    }
                }
                if (((RecyclerView.i)this).LJIJI() != 0) {
                    final View ljjii2 = ((RecyclerView.i)this).LJJII();
                    if (ljjii2 != null) {
                        final j j = (j)ljjii2.getLayoutParams();
                        if (!j.LIZJ.isRemoved() && j.LIZJ.getLayoutPosition() >= 0 && j.LIZJ.getLayoutPosition() < t.LIZ()) {
                            ljiji.LIZ(ljjii2, ((RecyclerView.i)this).LJI(ljjii2));
                            break Label_0225;
                        }
                    }
                    if (this.LIZIZ == this.LJIILIIL) {
                        final View liz2 = this.LIZ(o, t, ljiji.LIZLLL, this.LJIILIIL);
                        if (liz2 != null) {
                            ljiji.LIZIZ(liz2, ((RecyclerView.i)this).LJI(liz2));
                            if (t.LJI || !((RecyclerView.i)this).al_()) {
                                break Label_0225;
                            }
                            final int liz3 = this.LJIIJ.LIZ(liz2);
                            final int liziz = this.LJIIJ.LIZIZ(liz2);
                            final int liziz2 = this.LJIIJ.LIZIZ();
                            final int lizj2 = this.LJIIJ.LIZJ();
                            boolean b;
                            if (liziz <= liziz2 && liz3 < liziz2) {
                                b = true;
                            }
                            else {
                                b = false;
                            }
                            boolean b2;
                            if (liz3 >= lizj2 && liziz > lizj2) {
                                b2 = true;
                            }
                            else {
                                b2 = false;
                            }
                            if (b || b2) {
                                int lizj3 = liziz2;
                                if (ljiji.LIZLLL) {
                                    lizj3 = lizj2;
                                }
                                ljiji.LIZJ = lizj3;
                            }
                            break Label_0225;
                        }
                    }
                }
                ljiji.LIZIZ();
                int liziz3;
                if (this.LJIILIIL) {
                    liziz3 = t.LIZ() - 1;
                }
                else {
                    liziz3 = 0;
                }
                ljiji.LIZIZ = liziz3;
            }
            this.LJIJI.LJ = true;
        }
        else if (ljjii != null && (this.LJIIJ.LIZ(ljjii) >= this.LJIIJ.LIZJ() || this.LJIIJ.LIZIZ(ljjii) <= this.LJIIJ.LIZIZ())) {
            this.LJIJI.LIZ(ljjii, ((RecyclerView.i)this).LJI(ljjii));
        }
        final LinearLayoutManager.c liz4 = this.LIZ;
        int ljff;
        if (liz4.LJIIIZ >= 0) {
            ljff = 1;
        }
        else {
            ljff = -1;
        }
        liz4.LJFF = ljff;
        final int[] lizlll = this.LIZLLL;
        lizlll[1] = (lizlll[0] = 0);
        this.LIZ(t, lizlll);
        final int n = Math.max(0, this.LIZLLL[0]) + this.LJIIJ.LIZIZ();
        int ljii;
        final int n2 = ljii = Math.max(0, this.LIZLLL[1]) + this.LJIIJ.LJFF();
        int ljii2 = n;
        if (t.LJI) {
            final int ljiill2 = this.LJIILL;
            ljii = n2;
            ljii2 = n;
            if (ljiill2 != -1) {
                ljii = n2;
                ljii2 = n;
                if (this.LJIILLIIL != Integer.MIN_VALUE) {
                    final View lizj4 = ((RecyclerView.i)this).LIZJ(ljiill2);
                    ljii = n2;
                    ljii2 = n;
                    if (lizj4 != null) {
                        int ljiilliil;
                        int ljiilliil2;
                        if (this.LJIIL) {
                            ljiilliil = this.LJIIJ.LIZJ() - this.LJIIJ.LIZIZ(lizj4);
                            ljiilliil2 = this.LJIILLIIL;
                        }
                        else {
                            ljiilliil2 = this.LJIIJ.LIZ(lizj4) - this.LJIIJ.LIZIZ();
                            ljiilliil = this.LJIILLIIL;
                        }
                        final int n3 = ljiilliil - ljiilliil2;
                        if (n3 > 0) {
                            ljii2 = n + n3;
                            ljii = n2;
                        }
                        else {
                            ljii = n2 - n3;
                            ljii2 = n;
                        }
                    }
                }
            }
        }
        while (true) {
            Label_1385: {
                if (this.LJIJI.LIZLLL) {
                    if (!this.LJIIL) {
                        break Label_1385;
                    }
                }
                else if (this.LJIIL) {
                    break Label_1385;
                }
                final int n4 = 1;
                this.LIZ(o, t, this.LJIJI, n4);
                ((RecyclerView.i)this).LIZ(o);
                this.LIZ.LJIIJJI = this.LJJIJ();
                this.LIZ.LJIIIIZZ = 0;
                int n6;
                int liziz5;
                if (this.LJIJI.LIZLLL) {
                    this.LIZIZ(this.LJIJI);
                    this.LIZ.LJII = ljii2;
                    this.LIZ(o, this.LIZ, t, false);
                    final int liziz4 = this.LIZ.LIZIZ;
                    final int lizlll2 = this.LIZ.LIZLLL;
                    int ljii3 = ljii;
                    if (this.LIZ.LIZJ > 0) {
                        ljii3 = ljii + this.LIZ.LIZJ;
                    }
                    this.LIZ(this.LJIJI);
                    this.LIZ.LJII = ljii3;
                    final LinearLayoutManager.c liz5 = this.LIZ;
                    liz5.LIZLLL += this.LIZ.LJ;
                    this.LIZ(o, this.LIZ, t, false);
                    final int n5 = n6 = this.LIZ.LIZIZ;
                    liziz5 = liziz4;
                    if (this.LIZ.LIZJ > 0) {
                        final int lizj5 = this.LIZ.LIZJ;
                        this.LJFF(lizlll2, liziz4);
                        this.LIZ.LJII = lizj5;
                        this.LIZ(o, this.LIZ, t, false);
                        liziz5 = this.LIZ.LIZIZ;
                        n6 = n5;
                    }
                }
                else {
                    this.LIZ(this.LJIJI);
                    this.LIZ.LJII = ljii;
                    this.LIZ(o, this.LIZ, t, false);
                    final int liziz6 = this.LIZ.LIZIZ;
                    final int lizlll3 = this.LIZ.LIZLLL;
                    int ljii4 = ljii2;
                    if (this.LIZ.LIZJ > 0) {
                        ljii4 = ljii2 + this.LIZ.LIZJ;
                    }
                    this.LIZIZ(this.LJIJI);
                    this.LIZ.LJII = ljii4;
                    final LinearLayoutManager.c liz6 = this.LIZ;
                    liz6.LIZLLL += this.LIZ.LJ;
                    this.LIZ(o, this.LIZ, t, false);
                    final int liziz7 = this.LIZ.LIZIZ;
                    n6 = liziz6;
                    liziz5 = liziz7;
                    if (this.LIZ.LIZJ > 0) {
                        final int lizj6 = this.LIZ.LIZJ;
                        this.LJ(lizlll3, liziz6);
                        this.LIZ.LJII = lizj6;
                        this.LIZ(o, this.LIZ, t, false);
                        n6 = this.LIZ.LIZIZ;
                        liziz5 = liziz7;
                    }
                }
                int n7 = n6;
                int n8 = liziz5;
                if (((RecyclerView.i)this).LJIJI() > 0) {
                    int n9;
                    int n10;
                    int n11;
                    if (this.LJIIL ^ this.LJIILIIL) {
                        final int liz7 = this.LIZ(n6, o, t, true);
                        n9 = liziz5 + liz7;
                        n10 = n6 + liz7;
                        n11 = this.LIZIZ(n9, o, t, false);
                    }
                    else {
                        final int liziz8 = this.LIZIZ(liziz5, o, t, true);
                        n9 = liziz5 + liziz8;
                        n10 = n6 + liziz8;
                        n11 = this.LIZ(n10, o, t, false);
                    }
                    n8 = n9 + n11;
                    n7 = n10 + n11;
                }
                if (t.LJIIJ && ((RecyclerView.i)this).LJIJI() != 0 && !t.LJI && ((RecyclerView.i)this).al_()) {
                    final List<ViewHolder> lizlll4 = o.LIZLLL;
                    final int size = lizlll4.size();
                    final int lji = ((RecyclerView.i)this).LJI(((RecyclerView.i)this).LJI(0));
                    int i = 0;
                    int ljii5 = 0;
                    int ljii6 = 0;
                    while (i < size) {
                        final ViewHolder viewHolder = lizlll4.get(i);
                        int n12 = ljii6;
                        int n13 = ljii5;
                        if (!viewHolder.isRemoved()) {
                            if (viewHolder.getLayoutPosition() < lji != this.LJIIL) {
                                n13 = ljii5 + this.LJIIJ.LJ(viewHolder.itemView);
                                n12 = ljii6;
                            }
                            else {
                                n12 = ljii6 + this.LJIIJ.LJ(viewHolder.itemView);
                                n13 = ljii5;
                            }
                        }
                        ++i;
                        ljii6 = n12;
                        ljii5 = n13;
                    }
                    this.LIZ.LJIIJ = lizlll4;
                    if (ljii5 > 0) {
                        this.LJFF(((RecyclerView.i)this).LJI(this.LJJIJIIJI()), n8);
                        this.LIZ.LJII = ljii5;
                        this.LIZ.LIZJ = 0;
                        this.LIZ.LIZ((View)null);
                        this.LIZ(o, this.LIZ, t, false);
                    }
                    if (ljii6 > 0) {
                        this.LJ(((RecyclerView.i)this).LJI(this.LJJIJIIJIL()), n7);
                        this.LIZ.LJII = ljii6;
                        this.LIZ.LIZJ = 0;
                        this.LIZ.LIZ((View)null);
                        this.LIZ(o, this.LIZ, t, false);
                    }
                    this.LIZ.LJIIJ = null;
                }
                if (!t.LJI) {
                    final 0Fj ljiij = this.LJIIJ;
                    ljiij.LIZIZ = ljiij.LJ();
                }
                else {
                    this.LJIJI.LIZ();
                }
                this.LIZIZ = this.LJIILIIL;
                return;
            }
            final int n4 = -1;
            continue;
        }
    }
    
    @Override
    public int LIZLLL(final t t) {
        return this.LJII(t);
    }
    
    @Override
    public PointF LIZLLL(int n) {
        if (((RecyclerView.i)this).LJIJI() == 0) {
            return null;
        }
        boolean b = false;
        final int lji = ((RecyclerView.i)this).LJI(((RecyclerView.i)this).LJI(0));
        final int n2 = 1;
        if (n < lji) {
            b = true;
        }
        n = n2;
        if (b != this.LJIIL) {
            n = -1;
        }
        if (this.LJIIIZ == 0) {
            return new PointF((float)n, 0.0f);
        }
        return new PointF(0.0f, (float)n);
    }
    
    public final View LIZLLL(final boolean b) {
        if (this.LJIIL) {
            return this.LIZ(0, ((RecyclerView.i)this).LJIJI(), b, true);
        }
        return this.LIZ(((RecyclerView.i)this).LJIJI() - 1, -1, b, true);
    }
    
    @Override
    public int LJ(final t t) {
        return this.LJII(t);
    }
    
    @Override
    public Parcelable LJ() {
        if (this.LJIJ != null) {
            return (Parcelable)new SavedState(this.LJIJ);
        }
        final SavedState savedState = new SavedState();
        if (((RecyclerView.i)this).LJIJI() > 0) {
            this.LJIIIIZZ();
            final boolean lizj = this.LIZIZ ^ this.LJIIL;
            savedState.LIZJ = lizj;
            if (lizj) {
                final View ljjijiijil = this.LJJIJIIJIL();
                savedState.LIZIZ = this.LJIIJ.LIZJ() - this.LJIIJ.LIZIZ(ljjijiijil);
                savedState.LIZ = ((RecyclerView.i)this).LJI(ljjijiijil);
            }
            else {
                final View ljjijiiji = this.LJJIJIIJI();
                savedState.LIZ = ((RecyclerView.i)this).LJI(ljjijiiji);
                savedState.LIZIZ = this.LJIIJ.LIZ(ljjijiiji) - this.LJIIJ.LIZIZ();
            }
        }
        else {
            savedState.LIZ = -1;
        }
        return (Parcelable)savedState;
    }
    
    @Override
    public void LJ(final int ljiill) {
        this.LJIILL = ljiill;
        this.LJIILLIIL = Integer.MIN_VALUE;
        final SavedState ljij = this.LJIJ;
        if (ljij != null) {
            ljij.LIZ = -1;
        }
        ((RecyclerView.i)this).LJIILJJIL();
    }
    
    public final int LJFF(final int n) {
        if (n != 1) {
            if (n != 2) {
                if (n != 17) {
                    if (n != 33) {
                        if (n != 66) {
                            if (n != 130) {
                                return Integer.MIN_VALUE;
                            }
                            if (this.LJIIIZ == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        }
                        else {
                            if (this.LJIIIZ == 0) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        }
                    }
                    else {
                        if (this.LJIIIZ == 1) {
                            return -1;
                        }
                        return Integer.MIN_VALUE;
                    }
                }
                else {
                    if (this.LJIIIZ == 0) {
                        return -1;
                    }
                    return Integer.MIN_VALUE;
                }
            }
            else {
                if (this.LJIIIZ == 1) {
                    return 1;
                }
                if (this.LJII()) {
                    return -1;
                }
                return 1;
            }
        }
        else {
            if (this.LJIIIZ == 1) {
                return -1;
            }
            if (this.LJII()) {
                return 1;
            }
            return -1;
        }
    }
    
    @Override
    public int LJFF(final t t) {
        return this.LJIIIIZZ(t);
    }
    
    @Override
    public boolean LJFF() {
        return this.LJIIIZ == 0;
    }
    
    @Override
    public int LJI(final t t) {
        return this.LJIIIIZZ(t);
    }
    
    @Override
    public boolean LJI() {
        return this.LJIIIZ == 1;
    }
    
    public final boolean LJII() {
        return ((View)super.LJIL).getLayoutDirection() == 1;
    }
    
    public final void LJIIIIZZ() {
        if (this.LIZ == null) {
            this.LIZ = new LinearLayoutManager.c();
        }
    }
    
    public final int LJIIJ() {
        final View liz = this.LIZ(0, ((RecyclerView.i)this).LJIJI(), false, true);
        if (liz == null) {
            return -1;
        }
        return ((RecyclerView.i)this).LJI(liz);
    }
    
    public final int LJIIJJI() {
        final View liz = this.LIZ(0, ((RecyclerView.i)this).LJIJI(), true, false);
        if (liz == null) {
            return -1;
        }
        return ((RecyclerView.i)this).LJI(liz);
    }
    
    public final int LJIIL() {
        final View liz = this.LIZ(((RecyclerView.i)this).LJIJI() - 1, -1, false, true);
        if (liz == null) {
            return -1;
        }
        return ((RecyclerView.i)this).LJI(liz);
    }
    
    public final int LJIILIIL() {
        final View liz = this.LIZ(((RecyclerView.i)this).LJIJI() - 1, -1, true, false);
        if (liz == null) {
            return -1;
        }
        return ((RecyclerView.i)this).LJI(liz);
    }
    
    @Override
    public final boolean ak_() {
        return true;
    }
    
    @Override
    public boolean al_() {
        return this.LJIJ == null && this.LIZIZ == this.LJIILIIL;
    }
    
    @Override
    public final boolean an_() {
        if (super.LJJIJIIJIL != 1073741824 && super.LJJIJIIJI != 1073741824) {
            for (int ljiji = ((RecyclerView.i)this).LJIJI(), i = 0; i < ljiji; ++i) {
                final ViewGroup$LayoutParams layoutParams = ((RecyclerView.i)this).LJI(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static class SavedState implements Parcelable
    {
        public static final Parcelable$Creator<SavedState> CREATOR;
        public int LIZ;
        public int LIZIZ;
        public boolean LIZJ;
        
        static {
            Covode.recordClassIndex(1502);
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<SavedState>() {
                static {
                    Covode.recordClassIndex(1503);
                }
            };
        }
        
        public SavedState() {
        }
        
        public SavedState(final Parcel parcel) {
            this.LIZ = parcel.readInt();
            this.LIZIZ = parcel.readInt();
            final int int1 = parcel.readInt();
            boolean lizj = true;
            if (int1 != 1) {
                lizj = false;
            }
            this.LIZJ = lizj;
        }
        
        public SavedState(final SavedState savedState) {
            this.LIZ = savedState.LIZ;
            this.LIZIZ = savedState.LIZIZ;
            this.LIZJ = savedState.LIZJ;
        }
        
        public final boolean LIZ() {
            return this.LIZ >= 0;
        }
        
        public int describeContents() {
            return 0;
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            parcel.writeInt(this.LIZ);
            parcel.writeInt(this.LIZIZ);
            parcel.writeInt((int)(this.LIZJ ? 1 : 0));
        }
    }
}
