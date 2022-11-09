// 
// Decompiled by Procyon v0.6.0
// 

package X;

import org.json.JSONObject;
import android.os.Bundle;
import android.app.Activity;
import com.bytedance.covode.number.Covode;
import android.app.Application$ActivityLifecycleCallbacks;

public final class 0Pr implements Application$ActivityLifecycleCallbacks
{
    static {
        Covode.recordClassIndex(4215);
    }
    
    public final void onActivityCreated(final Activity activity, final Bundle bundle) {
        CTM.LIZ((Object)activity);
    }
    
    public final void onActivityDestroyed(final Activity activity) {
        CTM.LIZ((Object)activity);
    }
    
    public final void onActivityPaused(final Activity activity) {
        CTM.LIZ((Object)activity);
    }
    
    public final void onActivityResumed(final Activity activity) {
        CTM.LIZ((Object)activity);
    }
    
    public final void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
        CTM.LIZ((Object)activity, (Object)bundle);
    }
    
    public final void onActivityStarted(final Activity activity) {
        CTM.LIZ((Object)activity);
        if (++0Pt.LJ == 1) {
            0Pt.LJFF = 0Pq.Foreground;
            0Pt.LJI.LIZ(new 1DG(0Pp.Foreground, null, 0L, 6));
        }
    }
    
    public final void onActivityStopped(final Activity activity) {
        CTM.LIZ((Object)activity);
        if (--0Pt.LJ == 0) {
            0Pt.LJFF = 0Pq.Background;
            0Pt.LJI.LIZ(new 1DG(0Pp.Background, null, 0L, 6));
        }
    }
}
