// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal.persistence;

import android.content.SharedPreferences$Editor;
import android.content.Context;
import android.content.SharedPreferences;

public class PreferenceStoreImpl implements PreferenceStore
{
    private final SharedPreferences sharedPreferences;
    
    public PreferenceStoreImpl(final Context context, final String s) {
        if (context != null) {
            this.sharedPreferences = context.getSharedPreferences(s, 0);
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
    
    public SharedPreferences$Editor edit() {
        return this.sharedPreferences.edit();
    }
    
    public SharedPreferences get() {
        return this.sharedPreferences;
    }
    
    public boolean save(final SharedPreferences$Editor sharedPreferences$Editor) {
        sharedPreferences$Editor.apply();
        return true;
    }
}
