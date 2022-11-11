// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.actionhandler;

import java.util.Map;
import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import X.0Vq;

public interface IActionHandlerService extends 0Vq
{
    default static {
        Covode.recordClassIndex(4826);
    }
    
    boolean canHandle(final Uri p0);
    
    boolean handle(final Context p0, final Uri p1);
    
    boolean handle(final Context p0, final String p1);
    
    boolean handleWithoutHost(final Context p0, final Uri p1, final Map<String, String> p2);
    
    boolean handleWithoutHost(final Context p0, final String p1);
    
    void postReportReason(final long p0, final long p1, final long p2, final String p3);
    
    boolean showUserProfile(final long p0);
    
    boolean showUserProfile(final long p0, final String p1, final Map<String, String> p2);
}
