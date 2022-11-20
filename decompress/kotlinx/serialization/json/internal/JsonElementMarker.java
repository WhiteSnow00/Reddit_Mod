// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.serialization.json.internal;

import mg2.p;
import mj2.e;
import oj2.v;

public final class JsonElementMarker
{
    public final v a;
    public boolean b;
    
    public JsonElementMarker(final e e) {
        ng2.e.f((Object)e, "descriptor");
        this.a = new v(e, (p)new JsonElementMarker$origin$1((Object)this));
    }
}
