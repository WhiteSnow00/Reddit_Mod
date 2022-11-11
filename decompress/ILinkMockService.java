// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.linkmock.api;

import java.util.Map;
import com.bytedance.covode.number.Covode;
import X.0Vq;

public interface ILinkMockService extends 0Vq
{
    default static {
        Covode.recordClassIndex(7004);
    }
    
    Map<String, String> getAllUserToken();
    
    String getEntranceString();
    
    void setUserToken(final String p0, final String p1);
    
    void showMockLoginFragment();
    
    void showVirtualLinkFragment();
}
