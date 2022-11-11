// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android.shadow.okhttp3.internal;

import java.io.IOException;
import lc2.u$b;
import oc2.e;
import lc2.w;
import lc2.d0;
import java.net.Socket;
import oc2.g;
import lc2.a;
import oc2.d;
import lc2.h;
import lc2.a0$a;
import javax.net.ssl.SSLSocket;
import lc2.i;
import lc2.q$a;
import lc2.u;

public abstract class Internal
{
    public static Internal instance;
    
    public static void initializeInstanceForTests() {
        new u();
    }
    
    public abstract void addLenient(final q$a p0, final String p1);
    
    public abstract void addLenient(final q$a p0, final String p1, final String p2);
    
    public abstract void apply(final i p0, final SSLSocket p1, final boolean p2);
    
    public abstract int code(final a0$a p0);
    
    public abstract boolean connectionBecameIdle(final h p0, final d p1);
    
    public abstract Socket deduplicate(final h p0, final a p1, final g p2);
    
    public abstract boolean equalsNonHost(final a p0, final a p1);
    
    public abstract d get(final h p0, final a p1, final g p2, final d0 p3);
    
    public abstract boolean isInvalidHttpUrlHost(final IllegalArgumentException p0);
    
    public abstract lc2.d newWebSocketCall(final u p0, final w p1);
    
    public abstract void put(final h p0, final d p1);
    
    public abstract e routeDatabase(final h p0);
    
    public abstract void setCache(final u$b p0, final nc2.e p1);
    
    public abstract g streamAllocation(final lc2.d p0);
    
    public abstract IOException timeoutExit(final lc2.d p0, final IOException p1);
}
