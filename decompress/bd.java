// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.covode.number.Covode;

public final class bd
{
    public ad AFInAppEventParameterName;
    public boolean values;
    
    static {
        Covode.recordClassIndex(2635);
    }
    
    public final boolean AFInAppEventType() {
        return this.values;
    }
    
    public final ad valueOf() {
        synchronized (this) {
            MethodCollector.i(4880);
            final ad afInAppEventParameterName = this.AFInAppEventParameterName;
            MethodCollector.o(4880);
            return afInAppEventParameterName;
        }
    }
    
    public final void valueOf(final ad afInAppEventParameterName) {
        synchronized (this) {
            MethodCollector.i(45);
            this.AFInAppEventParameterName = afInAppEventParameterName;
            this.values = true;
            MethodCollector.o(45);
        }
    }
}
