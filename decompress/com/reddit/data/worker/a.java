// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.worker;

import xd0.m;
import javax.inject.Provider;
import se2.d;

public final class a implements d<EmailRequirementWorker$a>
{
    public final Provider<m> a;
    
    public a(final Provider<m> a) {
        this.a = a;
    }
    
    public final Object get() {
        return new EmailRequirementWorker$a((m)this.a.get());
    }
}
