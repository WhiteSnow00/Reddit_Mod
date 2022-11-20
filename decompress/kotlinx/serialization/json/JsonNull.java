// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.serialization.json;

import kotlin.a;
import kotlin.LazyThreadSafetyMode;
import lj2.b;
import cg2.f;
import pj2.l;
import lj2.e;
import pj2.m;

@e(with = l.class)
public final class JsonNull extends m
{
    public static final JsonNull f;
    public static final String g;
    public static final f<b<Object>> h;
    
    static {
        f = new JsonNull();
        g = "null";
        h = a.a(LazyThreadSafetyMode.PUBLICATION, (mg2.a)JsonNull$$cachedSerializer$delegate$1.INSTANCE);
    }
    
    public final String a() {
        return JsonNull.g;
    }
}
