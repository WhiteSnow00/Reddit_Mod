// 
// Decompiled by Procyon v0.6.0
// 

package ki2;

import ch2.e0;
import wh2.a;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import wh2.c;

public final class e
{
    public final c a;
    public final ProtoBuf$Class b;
    public final a c;
    public final e0 d;
    
    public e(final c a, final ProtoBuf$Class b, final a c, final e0 d) {
        ng2.e.f((Object)a, "nameResolver");
        ng2.e.f((Object)b, "classProto");
        ng2.e.f((Object)c, "metadataVersion");
        ng2.e.f((Object)d, "sourceElement");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof e)) {
            return false;
        }
        final e e = (e)o;
        return ng2.e.a((Object)this.a, (Object)e.a) && ng2.e.a((Object)this.b, (Object)e.b) && ng2.e.a((Object)this.c, (Object)e.c) && ng2.e.a((Object)this.d, (Object)e.d);
    }
    
    @Override
    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 31) * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("ClassData(nameResolver=");
        t.append(this.a);
        t.append(", classProto=");
        t.append(this.b);
        t.append(", metadataVersion=");
        t.append(this.c);
        t.append(", sourceElement=");
        t.append(this.d);
        t.append(')');
        return t.toString();
    }
}
