// 
// Decompiled by Procyon v0.6.0
// 

package tj2;

import rj2.d;
import kotlinx.serialization.json.internal.JsonDecodingException;
import rj2.c;
import kotlinx.serialization.descriptors.a;
import qj2.e;
import qj2.h;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.json.JsonNull;
import pj2.b;

public final class l implements b<JsonNull>
{
    public static final l a;
    public static final SerialDescriptorImpl b;
    
    static {
        a = new l();
        b = kotlinx.serialization.descriptors.a.c("kotlinx.serialization.json.JsonNull", (h)h.b.a, new e[0]);
    }
    
    public final Object deserialize(final c c) {
        sg2.e.f((Object)c, "decoder");
        f f;
        if (c instanceof f) {
            f = (f)c;
        }
        else {
            f = null;
        }
        if (f == null) {
            final StringBuilder r = a.r("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ");
            r.append(sg2.h.a((Class)c.getClass()));
            throw new IllegalStateException(r.toString());
        }
        if (!c.K()) {
            c.f();
            return JsonNull.f;
        }
        throw new JsonDecodingException("Expected 'null' literal");
    }
    
    public final e getDescriptor() {
        return l.b;
    }
    
    public final void serialize(final d d, final Object o) {
        final JsonNull jsonNull = (JsonNull)o;
        sg2.e.f((Object)d, "encoder");
        sg2.e.f((Object)jsonNull, "value");
        i i;
        if (d instanceof i) {
            i = (i)d;
        }
        else {
            i = null;
        }
        if (i != null) {
            d.O();
            return;
        }
        final StringBuilder r = a.r("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ");
        r.append(sg2.h.a((Class)d.getClass()));
        throw new IllegalStateException(r.toString());
    }
}
