// 
// Decompiled by Procyon v0.6.0
// 

package od;

import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import android.app.Activity;

public interface h
{
    Activity a0();
    
    void d0(final String p0, final LifecycleCallback p1);
    
    LifecycleCallback i(final Class p0, final String p1);
    
    void startActivityForResult(final Intent p0, final int p1);
}
