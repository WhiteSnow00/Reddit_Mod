// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

public final class bi<ResponseBody>
{
    public final AtomicBoolean AFInAppEventParameterName;
    public final bj AFInAppEventType;
    public final bn<ResponseBody> AFKeystoreWrapper;
    public final v valueOf;
    public final ExecutorService values;
    
    static {
        Covode.recordClassIndex(2640);
    }
    
    public bi(final v valueOf, final ExecutorService values, final bj afInAppEventType, final bn<ResponseBody> afKeystoreWrapper) {
        this.AFInAppEventParameterName = new AtomicBoolean(false);
        this.valueOf = valueOf;
        this.values = values;
        this.AFInAppEventType = afInAppEventType;
        this.AFKeystoreWrapper = afKeystoreWrapper;
    }
}
