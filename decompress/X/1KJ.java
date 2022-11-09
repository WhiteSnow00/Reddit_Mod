// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.jvm.internal.n;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

public abstract class 1kJ extends GpV<0qt.a> implements 0mc
{
    public 1Uo LIZ;
    public 1Tr LIZIZ;
    public final Room LIZJ;
    public 1XD LIZLLL;
    
    static {
        Covode.recordClassIndex(7604);
    }
    
    public 1kJ(final Room lizj, final DataChannel dataChannel) {
        CTM.LIZ((Object)lizj, (Object)dataChannel);
        this.LIZJ = lizj;
    }
    
    public 1Uo LIZIZ() {
        final 1Uo liz = this.LIZ;
        if (liz == null) {
            n.LIZ("");
        }
        return liz;
    }
    
    public 1Tr LIZJ() {
        final 1Tr liziz = this.LIZIZ;
        if (liziz == null) {
            n.LIZ("");
        }
        return liziz;
    }
    
    public 1XD LJI() {
        return this.LIZLLL;
    }
    
    public abstract 2P9 LJII();
    
    public abstract void LJIIIIZZ();
    
    public abstract void LJIIIZ();
    
    public abstract void LJIIJ();
    
    public abstract DataChannel LJIIJJI();
}
