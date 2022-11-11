// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.Context;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.interact.model.LinkInRoomReplyResponse;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.covode.number.Covode;

public final class 0qb
{
    static {
        Covode.recordClassIndex(8434);
    }
    
    public abstract static class a extends 0xQ<b>
    {
        static {
            Covode.recordClassIndex(8435);
        }
        
        public abstract int LIZ();
        
        public abstract void LIZ(final int p0);
        
        public abstract void LIZ(final 1ZS p0);
        
        public abstract void LIZ(final LiveEffect p0);
        
        public abstract void LIZ(final String p0);
        
        public abstract String LIZIZ();
        
        public abstract void LIZIZ(final int p0);
        
        public abstract ImageModel LIZJ();
        
        public abstract boolean LIZLLL();
        
        public abstract void LJ();
    }
    
    public interface b extends 0xR
    {
        default static {
            Covode.recordClassIndex(8436);
        }
        
        void LIZ(final LinkInRoomReplyResponse p0, final boolean p1);
        
        void LIZ(final String p0);
        
        void LIZ(final Throwable p0);
        
        LiveDialogFragment LIZIZ();
        
        void LIZIZ(final Throwable p0);
        
        Context getContext();
    }
}
