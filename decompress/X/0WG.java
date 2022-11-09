// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import android.view.ViewGroup$LayoutParams;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.covode.number.Covode;

public interface 0Wg
{
    default static {
        Covode.recordClassIndex(5066);
    }
    
    void LIZ(final int p0);
    
    void LIZ(final Cert p0);
    
    void LIZ(final boolean p0);
    
    void LIZ(final boolean p0, final Cert p1);
    
    boolean LIZ();
    
    void LIZIZ(final boolean p0, final Cert p1);
    
    Object getAttachedComposerManager();
    
    0Wa getLiveStream();
    
    void setCurrentLayoutParam(final ViewGroup$LayoutParams p0);
    
    void setStreamCallback(final 0Wb p0);
    
    public static class a
    {
        public int LIZ;
        public LiveEffect LIZIZ;
        public int LIZJ;
        public boolean LIZLLL;
        public boolean LJ;
        
        static {
            Covode.recordClassIndex(5067);
        }
        
        public a() {
            this.LIZJ = 1;
            this.LJ = true;
        }
    }
}
