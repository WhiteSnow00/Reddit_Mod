// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import com.bytedance.covode.number.Covode;

public final class bp extends Exception
{
    static {
        Covode.recordClassIndex(2648);
    }
    
    public bp() {
        super("Data was not received from server yet.");
    }
}
