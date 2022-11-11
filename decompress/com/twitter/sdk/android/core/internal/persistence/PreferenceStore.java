// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal.persistence;

import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;

public interface PreferenceStore
{
    SharedPreferences$Editor edit();
    
    SharedPreferences get();
    
    boolean save(final SharedPreferences$Editor p0);
}
