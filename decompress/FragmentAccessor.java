// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.common.android;

import android.view.View;
import android.content.res.Resources;

public interface FragmentAccessor<FRAGMENT, FRAGMENT_MANAGER>
{
    public static final int NO_ID = 0;
    
    FRAGMENT_MANAGER getChildFragmentManager(final FRAGMENT p0);
    
    FRAGMENT_MANAGER getFragmentManager(final FRAGMENT p0);
    
    int getId(final FRAGMENT p0);
    
    Resources getResources(final FRAGMENT p0);
    
    String getTag(final FRAGMENT p0);
    
    View getView(final FRAGMENT p0);
}
