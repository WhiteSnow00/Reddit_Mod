// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ExecutorService;

public final class y
{
    public final bj AFInAppEventType;
    public final ExecutorService AFKeystoreWrapper;
    
    static {
        Covode.recordClassIndex(2718);
    }
    
    public y() {
    }
    
    public y(final bj afInAppEventType, final ExecutorService afKeystoreWrapper) {
        this.AFInAppEventType = afInAppEventType;
        this.AFKeystoreWrapper = afKeystoreWrapper;
    }
    
    public interface a
    {
        default static {
            Covode.recordClassIndex(2720);
        }
        
        void AFInAppEventType(final String p0, final String p1);
        
        void AFKeystoreWrapper(final String p0, final Exception p1);
    }
}
