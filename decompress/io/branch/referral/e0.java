// 
// Decompiled by Procyon v0.6.0
// 

package io.branch.referral;

import ai2.h;

public final class e0 extends h
{
    public static e0.e0$a b;
    public static boolean c;
    public static boolean d;
    public static Long e;
    public static Long f;
    public static String g;
    
    static {
        e0.f = (e0.e = Long.MIN_VALUE);
        e0.g = null;
    }
    
    public static void r0() {
        final e0.e0$a b = e0.b;
        if (b != null) {
            final Branch branch = (Branch)b;
            branch.f.e(ServerRequest$PROCESS_WAIT_LOCK.XIAOMI_INSTALL_REFERRER_FETCH_WAIT_LOCK);
            branch.r = false;
            branch.t();
            e0.b = null;
        }
    }
}
