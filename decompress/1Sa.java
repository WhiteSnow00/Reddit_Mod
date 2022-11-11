// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;

public final class 1sa extends Ql1
{
    public final /* synthetic */ Qom LIZ;
    public final /* synthetic */ HGV LIZIZ;
    
    static {
        Covode.recordClassIndex(5749);
    }
    
    public 1sa(final Qom liz, final HGV liziz) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    public final void LIZ(Bitmap bitmap) {
        MethodCollector.i(10556);
        if (this.LIZ.LIZIZ() && bitmap != null) {
            bitmap = Bitmap.createBitmap(bitmap);
            0ch.LIZ(new 0ci(this.LIZIZ, bitmap));
        }
        else if (this.LIZIZ != null) {
            0ch.LIZ(new 0cj(this.LIZIZ));
        }
        this.LIZ.LJI();
        MethodCollector.o(10556);
    }
    
    public final void LJ(final Qom<S0P<S5q>> qom) {
        if (qom != null) {
            qom.LJI();
        }
        if (this.LIZIZ != null) {
            0ch.LIZ(new 0ck(this.LIZIZ));
        }
    }
}
