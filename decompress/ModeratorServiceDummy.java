// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.moderator;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;

public class ModeratorServiceDummy implements IModeratorService
{
    static {
        Covode.recordClassIndex(10419);
    }
    
    @Override
    public Fragment getAddModeratorFragment() {
        return null;
    }
    
    @Override
    public Fragment getEditModeratorPermissionFragment() {
        return null;
    }
    
    @Override
    public Fragment getModeratorListFragment() {
        return null;
    }
    
    @Override
    public void onInit() {
    }
}
