// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import androidx.lifecycle.LiveData;

public class 1Hs<T> implements 0dM<T>
{
    public LiveData<0BD<T>> LIZ;
    public 15z<0bu> LIZIZ;
    public 15z<0bu> LIZJ;
    public 15z<Boolean> LIZLLL;
    public FHp<Object> LJ;
    public FHp<Object> LJFF;
    public FHp<Object> LJI;
    public 15z<Integer> LJII;
    public 15z<Boolean> LJIIIIZZ;
    
    static {
        Covode.recordClassIndex(5804);
    }
    
    public 1Hs(final 0dL<T> 0dL, final LiveData<0BD<T>> liz) {
        this.LIZIZ = 0dL.LIZ();
        this.LIZJ = 0dL.LIZIZ();
        this.LJIIIIZZ = 0dL.LIZJ();
        this.LJ = 0dL.LJ();
        this.LJFF = 0dL.LJFF();
        this.LJI = 0dL.LJI();
        this.LIZ = liz;
        this.LIZLLL = 0dL.LIZLLL();
        this.LJII = 0dL.LJII();
    }
    
    @Override
    public final LiveData<0BD<T>> LIZ() {
        return this.LIZ;
    }
    
    @Override
    public final LiveData<0bu> LIZIZ() {
        return this.LIZIZ;
    }
    
    @Override
    public final LiveData<0bu> LIZJ() {
        return this.LIZJ;
    }
    
    @Override
    public final LiveData<Boolean> LIZLLL() {
        return this.LJIIIIZZ;
    }
    
    @Override
    public final LiveData<Boolean> LJ() {
        return this.LIZLLL;
    }
    
    @Override
    public final void LJFF() {
        this.LJ.onNext(FIe.LIZJ);
    }
    
    @Override
    public final void LJI() {
        this.LJFF.onNext(FIe.LIZJ);
    }
    
    @Override
    public final void LJII() {
        this.LJI.onNext(FIe.LIZJ);
    }
    
    @Override
    public final LiveData<Integer> LJIIIIZZ() {
        return this.LJII;
    }
    
    @Override
    public void LJIIIZ() {
        throw new RuntimeException("unsupported operation");
    }
    
    @Override
    public int LJIIJ() {
        throw new RuntimeException("unsupported operation");
    }
}
