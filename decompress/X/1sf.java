// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdk.model.FeedItem;
import android.os.SystemClock;
import android.util.Pair;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.base.model.feed.FeedExtra;

public abstract class 1sf<DataKey, V, CacheKey> extends 1g6<DataKey, V> implements 0Av.b
{
    public CacheKey LJ;
    public 0bW<CacheKey, V> LJFF;
    public 0bU<CacheKey, FeedExtra> LJI;
    public 15z<0bu> LJII;
    public 15z<0bu> LJIIIIZZ;
    public 15z<Boolean> LJIIIZ;
    public 15z<Boolean> LJIIJ;
    public Runnable LJIIJJI;
    public final 1Hv<CacheKey, V> LJIIL;
    public long LJIILIIL;
    public final FH6 LJIILJJIL;
    
    static {
        Covode.recordClassIndex(5828);
    }
    
    public 1sf(final 1Hv<CacheKey, V> ljiil) {
        this.LJIILJJIL = new FH6();
        this.LJ = ljiil.LJIIJ;
        this.LJFF = ljiil.LJIIJJI;
        this.LJI = ljiil.LJIIL;
        this.LJIIIIZZ = ljiil.LIZIZ;
        this.LJII = ljiil.LIZ;
        this.LJIIIZ = ljiil.LIZJ;
        this.LJIIJ = ljiil.LIZLLL;
        this.LJIIL = ljiil;
        this.LJIILIIL = ljiil.LJIIIZ.incrementAndGet();
        this.LIZ(((FBF)ljiil.LJFF).LIZ((2d6)new 1Hw(this), 1Hx.LIZ));
        this.LIZ(((FBF)ljiil.LJ).LIZ(F8U.LIZ(F8V.LIZ)).LIZ((2d6)new 1Hy(this, ljiil), 1Hz.LIZ));
        this.LIZ(((FBF)ljiil.LJI).LIZLLL((2d6)new 1I0(this)));
        this.LIZ((0Av.b)this);
    }
    
    private List<V> LIZ(final List<V> list, final FeedExtra feedExtra) {
        this.LJI.LIZ(this.LJ, feedExtra);
        return this.LJFF.LIZ(this.LJ, new ArrayList<V>((Collection<? extends V>)list));
    }
    
    private void LIZ(final 2fc 2fc) {
        this.LJIILJJIL.LIZ(2fc);
    }
    
    private void LIZLLL() {
        if (!this.LJIIL.LJII) {
            return;
        }
        this.LJ();
        this.LJIIL.LJII = false;
    }
    
    private void LJ() {
        this.LJFF.LIZLLL(this.LJ);
        this.LJI.LIZIZ(this.LJ);
    }
    
    private boolean LJFF() {
        synchronized (this.LJIIL) {
            return this.LJIILIIL == this.LJIIL.LJIIIZ.get();
        }
    }
    
    public abstract FBF<Fyw<Pair<List<V>, FeedExtra>>> LIZ(final boolean p0, final DataKey p1);
    
    public abstract DataKey LIZ(final FeedExtra p0);
    
    @Override
    public final void LIZ() {
        this.LJIILJJIL.LIZ();
        this.LIZIZ((0Av.b)this);
    }
    
    @Override
    public final void LIZ(final e<DataKey> e, final 1g6.c<DataKey, V> c) {
        if (!this.LJFF()) {
            0ba.LIZ(3, "RxCacheDataSource", "load initial not my generation ");
            return;
        }
        final boolean ljiiiizz = this.LJIIL.LJIIIIZZ;
        boolean b = false;
        if (ljiiiizz) {
            this.LJIIL.LJIIIIZZ = false;
            this.LJIIL.LJII = true;
        }
        this.LJIIIIZZ.postValue(0bu.LIZIZ);
        this.LJII.postValue(0bu.LIZIZ);
        this.LJIIIZ.postValue(true);
        this.LJIIJJI = null;
        final List<V> liziz = this.LJFF.LIZIZ(this.LJ);
        if (!Fhk.LIZ((List)liziz)) {
            final FeedExtra feedExtra = this.LJI.LIZJ(this.LJ);
            c.LIZ(new ArrayList<V>((Collection<? extends V>)liziz), this.LIZ(feedExtra));
            if (!this.LJIIL.LJII) {
                this.LJIIJ.postValue(false);
                final 15z<Boolean> ljiiiz = this.LJIIIZ;
                if (this.LIZ(feedExtra) != null) {
                    b = true;
                }
                ljiiiz.postValue(b);
                this.LJIIIIZZ.postValue(0bu.LIZJ);
                this.LJII.postValue(0bu.LIZJ);
                return;
            }
        }
        final FBF<Fyw<Pair<List<V>, FeedExtra>>> liz = this.LIZ(true, null);
        if (liz == null) {
            this.LJIIIIZZ.postValue(0bu.LIZJ);
            this.LJII.postValue(0bu.LIZJ);
            return;
        }
        this.LIZ(liz.LIZIZ(FAr.LIZIZ(FGw.LIZJ)).LIZ(F8U.LIZ(F8V.LIZ)).LIZ((2d6)new 1I1(this, System.currentTimeMillis(), SystemClock.elapsedRealtime(), c), (2d6)new 1I2(this, e, c)));
    }
    
    @Override
    public final void LIZ(final f<DataKey> f, final 1g6.a<DataKey, V> a) {
        if (this.LIZIZ()) {
            return;
        }
        this.LJII.postValue(0bu.LIZIZ);
        this.LJIIJJI = null;
        this.LIZ(this.LIZ(false, f.LIZ).LIZIZ(FAr.LIZIZ(FGw.LIZJ)).LIZ(F8U.LIZ(F8V.LIZ)).LIZ((2d6)new 1I3(this, System.currentTimeMillis(), a), (2d6)new 1I4(this, f, a)));
    }
    
    public final boolean LIZIZ() {
        return this.LJIIL.LJII;
    }
}
