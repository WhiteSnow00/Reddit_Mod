// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.covode.number.Covode;

public interface 0gk
{
    default static {
        Covode.recordClassIndex(6229);
    }
    
    void LIZ();
    
    void LIZ(final String p0, final b p1);
    
    void LIZ(final String p0, final LiveEffect p1, final a p2);
    
    boolean LIZ(final LiveEffect p0);
    
    public interface a
    {
        default static {
            Covode.recordClassIndex(6230);
        }
        
        void LIZ(final LiveEffect p0);
        
        void LIZ(final String p0, final LiveEffect p1);
        
        void LIZIZ(final String p0, final LiveEffect p1);
    }
    
    public interface b
    {
        default static {
            Covode.recordClassIndex(6231);
        }
        
        void LIZ();
        
        void LIZ(final EffectChannelResponse p0);
    }
}
