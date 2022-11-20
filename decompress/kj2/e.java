// 
// Decompiled by Procyon v0.6.0
// 

package kj2;

import xd.a;
import ej2.t;

public final class e
{
    public static final int a;
    public static final t b;
    public static final t c;
    public static final t d;
    public static final t e;
    public static final int f;
    
    static {
        a = xd.a.s1("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12);
        b = new t("PERMIT");
        c = new t("TAKEN");
        d = new t("BROKEN");
        e = new t("CANCELLED");
        f = xd.a.s1("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12);
    }
}
