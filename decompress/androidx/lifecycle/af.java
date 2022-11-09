// 
// Decompiled by Procyon v0.6.0
// 

package androidx.lifecycle;

import android.os.Bundle;
import X.15u;
import X.0CH;
import X.15v;
import android.app.FragmentManager;
import android.app.Activity;
import android.os.Build$VERSION;
import X.0CC;
import com.bytedance.covode.number.Covode;
import android.app.Fragment;

public final class af extends Fragment
{
    public af.a LIZ;
    
    static {
        Covode.recordClassIndex(1228);
    }
    
    private void LIZ(final 0CC.a a) {
        if (Build$VERSION.SDK_INT < 29) {
            LIZ(this.getActivity(), a);
        }
    }
    
    public static void LIZ(final Activity activity) {
        if (Build$VERSION.SDK_INT >= 29) {
            af.b.registerIn(activity);
        }
        final FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add((Fragment)new af(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
    
    public static void LIZ(final Activity activity, final 0CC.a a) {
        if (activity instanceof 15v) {
            ((15v)activity).LIZ().LIZ(a);
            return;
        }
        if (activity instanceof 0CH) {
            final 0CC lifecycle = ((0CH)activity).getLifecycle();
            if (lifecycle instanceof 15u) {
                ((15u)lifecycle).LIZ(a);
            }
        }
    }
    
    public final void onActivityCreated(final Bundle bundle) {
        super.onActivityCreated(bundle);
        this.LIZ(0CC.a.ON_CREATE);
    }
    
    public final void onDestroy() {
        super.onDestroy();
        this.LIZ(0CC.a.ON_DESTROY);
        this.LIZ = null;
    }
    
    public final void onPause() {
        super.onPause();
        this.LIZ(0CC.a.ON_PAUSE);
    }
    
    public final void onResume() {
        super.onResume();
        final af.a liz = this.LIZ;
        if (liz != null) {
            liz.LIZIZ();
        }
        this.LIZ(0CC.a.ON_RESUME);
    }
    
    public final void onStart() {
        super.onStart();
        final af.a liz = this.LIZ;
        if (liz != null) {
            liz.LIZ();
        }
        this.LIZ(0CC.a.ON_START);
    }
    
    public final void onStop() {
        super.onStop();
        this.LIZ(0CC.a.ON_STOP);
    }
}
