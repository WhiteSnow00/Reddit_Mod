// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.ss.avframework.livestreamv2.core.LiveCore;
import com.ss.avframework.livestreamv2.filter.IAudioFilterManager;
import com.ss.avframework.livestreamv2.filter.IFilterManager;
import java.util.List;
import com.ss.avframework.livestreamv2.ILiveStream$ITextureFrameAvailableListener;
import com.ss.avframework.livestreamv2.ILiveStream$ILiveStreamInfoListener;
import com.ss.avframework.livestreamv2.ILiveStream$ILiveStreamErrorListener;
import android.view.View;
import com.ss.avframework.livestreamv2.core.ILayerControl$CatchViewPic;
import com.ss.avframework.livestreamv2.ILiveStream$CatchVideoCallback;
import com.ss.avframework.livestreamv2.ILiveStream$CatchPicCallback;
import android.os.Bundle;
import android.graphics.Bitmap;
import com.bytedance.bpea.basics.Cert;
import com.ss.avframework.livestreamv2.core.interact.Client;
import com.ss.avframework.livestreamv2.core.interact.model.InteractConfig;
import com.bytedance.covode.number.Covode;

public interface 0Wa
{
    default static {
        Covode.recordClassIndex(5058);
    }
    
    Client LIZ(final InteractConfig p0);
    
    void LIZ();
    
    void LIZ(final int p0, final int p1, final int p2, final long p3);
    
    void LIZ(final int p0, final Cert p1);
    
    void LIZ(final 0Wb p0);
    
    void LIZ(final Bitmap p0, final Cert p1);
    
    void LIZ(final Bundle p0, final ILiveStream$CatchPicCallback p1);
    
    void LIZ(final Bundle p0, final ILiveStream$CatchVideoCallback p1);
    
    void LIZ(final Bundle p0, final ILayerControl$CatchViewPic p1);
    
    void LIZ(final View p0);
    
    void LIZ(final Cert p0);
    
    void LIZ(final ILiveStream$ILiveStreamErrorListener p0);
    
    void LIZ(final ILiveStream$ILiveStreamInfoListener p0);
    
    void LIZ(final ILiveStream$ITextureFrameAvailableListener p0);
    
    void LIZ(final String p0);
    
    void LIZ(final List<String> p0);
    
    void LIZ(final boolean p0, final Cert p1);
    
    boolean LIZ(final String p0, final String p1);
    
    IFilterManager LIZIZ();
    
    void LIZIZ(final Cert p0);
    
    IAudioFilterManager LIZJ();
    
    void LIZJ(final Cert p0);
    
    void LIZLLL();
    
    void LIZLLL(final Cert p0);
    
    LiveCore LJ();
    
    void LJ(final Cert p0);
    
    void LJFF(final Cert p0);
    
    void LJI(final Cert p0);
    
    void LJII(final Cert p0);
    
    void LJIIIIZZ(final Cert p0);
    
    void LJIIIZ(final Cert p0);
    
    void LJIIJ(final Cert p0);
}
