// 
// Decompiled by Procyon v0.6.0
// 

package io.branch.referral;

import ai2.h;

public final class b0 extends h
{
    public static b0.b0$a b;
    public static boolean c;
    public static boolean d;
    public static Long e;
    public static Long f;
    public static String g;
    
    static {
        b0.f = (b0.e = Long.MIN_VALUE);
        b0.g = null;
    }
    
    public static void r0() {
        final b0.b0$a b = b0.b;
        if (b != null) {
            final Branch branch = (Branch)b;
            branch.f.e(ServerRequest$PROCESS_WAIT_LOCK.SAMSUNG_INSTALL_REFERRER_FETCH_WAIT_LOCK);
            branch.q = false;
            branch.t();
            b0.b = null;
        }
    }
}
