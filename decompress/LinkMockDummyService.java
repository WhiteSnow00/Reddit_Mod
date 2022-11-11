// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.linkmock.api;

import X.Hf4;
import X.0cB;
import java.util.LinkedHashMap;
import java.util.Map;
import com.bytedance.covode.number.Covode;

public class LinkMockDummyService implements ILinkMockService
{
    static {
        Covode.recordClassIndex(7005);
    }
    
    @Override
    public Map<String, String> getAllUserToken() {
        return new LinkedHashMap<String, String>();
    }
    
    @Override
    public String getEntranceString() {
        return "";
    }
    
    @Override
    public void onInit() {
    }
    
    @Override
    public void setUserToken(final String s, final String s2) {
    }
    
    @Override
    public void showMockLoginFragment() {
        Hf4.LIZ(0cB.LJ(), "Please add \"add_virtual_env_only_module=1\" in local.properties so that you can show the fragment.", 0L);
    }
    
    @Override
    public void showVirtualLinkFragment() {
        Hf4.LIZ(0cB.LJ(), "Please add \"add_virtual_env_only_module=1\" in local.properties so that you can show the fragment.", 0L);
    }
}
