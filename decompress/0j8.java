// 
// Decompiled by Procyon v0.6.0
// 

package X;

import androidx.fragment.app.Fragment;
import android.view.MotionEvent;
import com.bytedance.ies.sdk.widgets.Layer2PriorityManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.android.livesdk.model.message.RemindMessage;
import com.bytedance.covode.number.Covode;

public interface 0j8
{
    default static {
        Covode.recordClassIndex(6864);
    }
    
    void LIZ();
    
    void LIZ(final int p0);
    
    void LIZ(final RemindMessage p0);
    
    void LIZ(final DataChannel p0, final 0j1 p1);
    
    void LIZ(final Layer2PriorityManager p0);
    
    void LIZ(final Runnable p0);
    
    boolean LIZ(final MotionEvent p0);
    
    boolean LIZ(final MotionEvent p0, final MotionEvent p1);
    
    boolean LIZ(final MotionEvent p0, final MotionEvent p1, final float p2);
    
    Fragment LIZIZ();
    
    boolean LIZIZ(final MotionEvent p0);
    
    void LIZJ();
    
    void LIZLLL();
    
    void LJ();
}
