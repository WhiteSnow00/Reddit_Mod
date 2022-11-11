// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.core.paging.viewmodel;

import X.1IA;
import X.1I9;
import X.1I8;
import X.1I7;
import X.1I6;
import X.1I5;
import com.bytedance.covode.number.Covode;
import X.0Bf;
import X.0dM;
import X.0BD;
import X.0bu;
import X.15z;
import com.bytedance.android.livesdk.util.rxutils.RxViewModel;

public class PagingViewModel<T> extends RxViewModel
{
    public 15z<0bu> LIZ;
    public 15z<0bu> LIZIZ;
    public 15z<Boolean> LIZJ;
    public 15z<Boolean> LIZLLL;
    public 15z<Integer> LJ;
    public 15z<0BD<T>> LJFF;
    public 0dM<T> LJI;
    public final 0Bf<0bu> LJII;
    public final 0Bf<0bu> LJIIIIZZ;
    public final 0Bf<0BD<T>> LJIIIZ;
    public final 0Bf<Boolean> LJIIJ;
    public final 0Bf<Boolean> LJIIJJI;
    public final 0Bf<Integer> LJIIL;
    
    static {
        Covode.recordClassIndex(5842);
    }
    
    public PagingViewModel() {
        this.LIZ = new 15z<0bu>();
        this.LIZIZ = new 15z<0bu>();
        this.LIZJ = new 15z<Boolean>();
        this.LIZLLL = new 15z<Boolean>();
        this.LJ = new 15z<Integer>();
        this.LJFF = new 15z<0BD<T>>();
        this.LJII = new 1I5(this);
        this.LJIIIIZZ = new 1I6(this);
        this.LJIIIZ = new 1I7(this);
        this.LJIIJ = new 1I8(this);
        this.LJIIJJI = new 1I9(this);
        this.LJIIL = new 1IA(this);
    }
    
    public final void LIZ(final 0dM<T> lji) {
        final 0dM<T> lji2 = this.LJI;
        if (lji2 != null) {
            lji2.LIZIZ().removeObserver(this.LJII);
            this.LJI.LIZJ().removeObserver(this.LJIIIIZZ);
            this.LJI.LIZ().removeObserver(this.LJIIIZ);
            this.LJI.LJ().removeObserver(this.LJIIJ);
            this.LJI.LIZLLL().removeObserver(this.LJIIJJI);
            this.LJI.LJIIIIZZ().removeObserver(this.LJIIL);
        }
        if ((this.LJI = lji) != null) {
            lji.LIZIZ().observeForever(this.LJII);
            this.LJI.LIZJ().observeForever(this.LJIIIIZZ);
            this.LJI.LIZ().observeForever(this.LJIIIZ);
            this.LJI.LJ().observeForever(this.LJIIJ);
            this.LJI.LIZLLL().observeForever(this.LJIIJJI);
            this.LJI.LJIIIIZZ().observeForever(this.LJIIL);
        }
    }
    
    public boolean LIZ() {
        if (this.LIZIZ.getValue() != null && this.LIZIZ.getValue().LIZIZ()) {
            return false;
        }
        final 0dM<T> lji = this.LJI;
        if (lji != null) {
            lji.LJFF();
            return true;
        }
        return false;
    }
    
    public void LIZIZ() {
        final 0dM<T> lji = this.LJI;
        if (lji != null) {
            lji.LJI();
        }
    }
}
