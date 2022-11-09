// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.elements.android.window;

import android.view.View;
import java.util.List;
import com.facebook.stetho.common.Util;
import android.content.Context;

public abstract class WindowRootViewCompat
{
    private static WindowRootViewCompat sInstance;
    
    public static WindowRootViewCompat get(final Context context) {
        final WindowRootViewCompat sInstance = WindowRootViewCompat.sInstance;
        if (sInstance != null) {
            return sInstance;
        }
        Util.throwIfNull(context);
        return WindowRootViewCompat.sInstance = new WindowRootViewCompactV19Impl();
    }
    
    public abstract List<View> getRootViews();
}
