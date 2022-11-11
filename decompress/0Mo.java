// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.os.Bundle;
import android.app.Activity;
import com.bytedance.covode.number.Covode;
import android.app.Application$ActivityLifecycleCallbacks;

public final class 0Mo implements Application$ActivityLifecycleCallbacks
{
    static {
        Covode.recordClassIndex(2759);
    }
    
    public final void onActivityCreated(final Activity activity, final Bundle bundle) {
    }
    
    public final void onActivityDestroyed(final Activity activity) {
    }
    
    public final void onActivityPaused(final Activity activity) {
    }
    
    public final void onActivityResumed(final Activity activity) {
        MethodCollector.i(3198);
        System.currentTimeMillis();
        if (!0Mp.LIZ) {
            MethodCollector.o(3198);
            return;
        }
        final ViewGroup viewGroup = (ViewGroup)activity.getWindow().getDecorView();
        while (true) {
            for (int i = 0; i < viewGroup.getChildCount(); ++i) {
                if (viewGroup.getChildAt(i) instanceof 0Ms) {
                    MethodCollector.o(3198);
                    return;
                }
            }
            final 0Ms 0Ms = new 0Ms((Context)activity);
            0Ms.setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1));
            while (viewGroup.getChildCount() > 0) {
                final View child = viewGroup.getChildAt(0);
                viewGroup.removeView(child);
                0Ms.addView(child);
            }
            viewGroup.addView((View)0Ms, 0);
            continue;
        }
    }
    
    public final void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
    }
    
    public final void onActivityStarted(final Activity activity) {
    }
    
    public final void onActivityStopped(final Activity activity) {
    }
}
