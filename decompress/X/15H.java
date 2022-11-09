// 
// Decompiled by Procyon v0.6.0
// 

package X;

import androidx.lifecycle.af;
import android.os.Bundle;
import android.app.Activity;
import com.bytedance.covode.number.Covode;

public final class 15h extends 0C5
{
    public final /* synthetic */ 15i LIZ;
    
    static {
        Covode.recordClassIndex(1227);
    }
    
    public 15h(final 15i liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void onActivityCreated(final Activity activity, final Bundle bundle) {
        ((af)activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).LIZ = this.LIZ.LJII;
    }
    
    @Override
    public final void onActivityPaused(final Activity activity) {
        final 15i liz = this.LIZ;
        --liz.LIZIZ;
        if (liz.LIZIZ == 0) {
            liz.LJ.postDelayed(liz.LJI, 700L);
        }
    }
    
    @Override
    public final void onActivityStopped(final Activity activity) {
        final 15i liz = this.LIZ;
        --liz.LIZ;
        liz.LIZIZ();
    }
}
