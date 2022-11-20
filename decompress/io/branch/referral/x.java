// 
// Decompiled by Procyon v0.6.0
// 

package io.branch.referral;

import ai2.h;

public final class x extends h
{
    public static x.x$a b;
    public static boolean c;
    public static boolean d;
    public static Long e;
    public static Long f;
    public static String g;
    
    static {
        x.f = (x.e = Long.MIN_VALUE);
        x.g = null;
    }
    
    public static void r0() {
        final x.x$a b = x.b;
        if (b != null) {
            final Branch branch = (Branch)b;
            branch.f.e(ServerRequest$PROCESS_WAIT_LOCK.GOOGLE_INSTALL_REFERRER_FETCH_WAIT_LOCK);
            branch.p = false;
            branch.t();
            x.b = null;
        }
    }
}
