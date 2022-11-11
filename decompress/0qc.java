// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;

public final class 0qc
{
    static {
        Covode.recordClassIndex(8437);
    }
    
    public abstract static class a extends 0xQ<b>
    {
        static {
            Covode.recordClassIndex(8438);
        }
        
        public abstract User LIZ();
        
        public abstract void LIZ(final int p0, final long p1);
        
        public abstract void LIZ(final LinkPlayerInfo p0);
        
        public abstract void LIZIZ();
        
        public abstract long LIZJ();
        
        public abstract String LIZLLL();
        
        public abstract boolean LJ();
        
        public abstract boolean LJFF();
    }
    
    public interface b extends 0xR
    {
        default static {
            Covode.recordClassIndex(8439);
        }
        
        void LIZ(final int p0, final long p1);
        
        void LIZ(final User p0);
        
        void LIZ(final boolean p0);
        
        void setVisibility(final boolean p0);
    }
}
