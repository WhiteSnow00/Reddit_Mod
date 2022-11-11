// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.common.android;

import android.app.Activity;

public interface FragmentActivityAccessor<FRAGMENT_ACTIVITY extends Activity, FRAGMENT_MANAGER>
{
    FRAGMENT_MANAGER getFragmentManager(final FRAGMENT_ACTIVITY p0);
}
