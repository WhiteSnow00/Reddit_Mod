// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.common.android;

import android.view.View;
import android.view.ViewGroup;

public final class ViewGroupUtil
{
    private ViewGroupUtil() {
    }
    
    public static int findChildIndex(final ViewGroup viewGroup, final View view) {
        for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
            if (viewGroup.getChildAt(i) == view) {
                return i;
            }
        }
        return -1;
    }
}
