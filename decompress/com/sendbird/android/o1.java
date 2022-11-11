// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android;

import zc2.a;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.c;
import java.util.Collection;
import java.util.ArrayList;

public final class o1 implements Runnable
{
    public final /* synthetic */ a1 f;
    
    public o1(final a1 f) {
        this.f = f;
    }
    
    @Override
    public final void run() {
        for (final SendBird$j sendBird$j : new ArrayList(SendBird.e().e.values())) {
            final a d = this.f.d;
            final int a = d.a;
            c.h1((Map)d.d);
            sendBird$j.getClass();
        }
    }
}
