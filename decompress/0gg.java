// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.List;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;

public interface 0gg<T extends LiveEffect>
{
    default static {
        Covode.recordClassIndex(6225);
    }
    
    float LIZ(final int p0);
    
    List<T> LIZ();
    
    void LIZ(final a<? super LiveEffect> p0);
    
    void LIZ(final b p0);
    
    void LIZ(final T p0);
    
    void LIZIZ(final int p0);
    
    void LIZIZ(final a<? super LiveEffect> p0);
    
    void LIZIZ(final b p0);
    
    boolean LIZIZ(final T p0);
    
    boolean LIZJ(final T p0);
    
    float LIZLLL(final T p0);
    
    public interface a<T>
    {
        default static {
            Covode.recordClassIndex(6226);
        }
        
        void LIZ(final int p0);
        
        void LIZ(final T p0, final float p1);
    }
    
    public interface b
    {
        default static {
            Covode.recordClassIndex(6227);
        }
        
        void LIZ(final boolean p0);
    }
}
