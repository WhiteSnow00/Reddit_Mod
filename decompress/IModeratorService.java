// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.moderator;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import X.0Vq;

public interface IModeratorService extends 0Vq
{
    default static {
        Covode.recordClassIndex(10418);
    }
    
    Fragment getAddModeratorFragment();
    
    Fragment getEditModeratorPermissionFragment();
    
    Fragment getModeratorListFragment();
}
