// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.actionhandler;

import X.CTM;
import java.util.Map;
import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;

public class ActionHandlerServiceDummy implements IActionHandlerService
{
    static {
        Covode.recordClassIndex(4825);
    }
    
    @Override
    public boolean canHandle(final Uri uri) {
        return false;
    }
    
    @Override
    public boolean handle(final Context context, final Uri uri) {
        return false;
    }
    
    @Override
    public boolean handle(final Context context, final String s) {
        return false;
    }
    
    @Override
    public boolean handleWithoutHost(final Context context, final Uri uri, final Map<String, String> map) {
        CTM.LIZ((Object)context, (Object)uri, (Object)map);
        return false;
    }
    
    @Override
    public boolean handleWithoutHost(final Context context, final String s) {
        return false;
    }
    
    @Override
    public void onInit() {
    }
    
    @Override
    public void postReportReason(final long n, final long n2, final long n3, final String s) {
    }
    
    @Override
    public boolean showUserProfile(final long n) {
        return false;
    }
    
    @Override
    public boolean showUserProfile(final long n, final String s, final Map<String, String> map) {
        return false;
    }
}
