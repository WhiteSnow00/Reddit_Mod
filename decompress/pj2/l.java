// 
// Decompiled by Procyon v0.6.0
// 

package pj2;

import nj2.d;
import kotlinx.serialization.json.internal.JsonDecodingException;
import nj2.c;
import mj2.h;
import kotlinx.serialization.descriptors.a;
import mj2.e;
import mj2.h$b;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.json.JsonNull;
import lj2.b;

public final class l implements b<JsonNull>
{
    public static final l a;
    public static final SerialDescriptorImpl b;
    
    static {
        a = new l();
        b = kotlinx.serialization.descriptors.a.c("kotlinx.serialization.json.JsonNull", (h)h$b.a, new e[0]);
    }
    
    public final Object deserialize(final c c) {
        ng2.e.f((Object)c, "decoder");
        f f;
        if (c instanceof f) {
            f = (f)c;
        }
        else {
            f = null;
        }
        if (f == null) {
            final StringBuilder t = a.t("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ");
            t.append(ng2.h.a((Class)c.getClass()));
            throw new IllegalStateException(t.toString());
        }
        if (!c.W()) {
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
        ng2.e.f((Object)d, "encoder");
        ng2.e.f((Object)jsonNull, "value");
        i i;
        if (d instanceof i) {
            i = (i)d;
        }
        else {
            i = null;
        }
        if (i != null) {
            d.z();
            return;
        }
        final StringBuilder t = a.t("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ");
        t.append(ng2.h.a((Class)d.getClass()));
        throw new IllegalStateException(t.toString());
    }
}
