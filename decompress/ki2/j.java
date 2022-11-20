// 
// Decompiled by Procyon v0.6.0
// 

package ki2;

import fh2.o;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import mi2.d;
import wh2.a;
import wh2.f;
import wh2.e;
import ch2.g;
import wh2.c;

public final class j
{
    public final h a;
    public final c b;
    public final g c;
    public final e d;
    public final f e;
    public final a f;
    public final d g;
    public final TypeDeserializer h;
    public final MemberDeserializer i;
    
    public j(final h a, final c b, final g c, final e d, final f e, final a f, final d g, final TypeDeserializer typeDeserializer, final List<ProtoBuf$TypeParameter> list) {
        ng2.e.f((Object)a, "components");
        ng2.e.f((Object)b, "nameResolver");
        ng2.e.f((Object)c, "containingDeclaration");
        ng2.e.f((Object)d, "typeTable");
        ng2.e.f((Object)e, "versionRequirementTable");
        ng2.e.f((Object)f, "metadataVersion");
        ng2.e.f((Object)list, "typeParameters");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        final StringBuilder t = a.t("Deserializer for \"");
        t.append(c.getName());
        t.append('\"');
        final String string = t.toString();
        String a2;
        if (g == null || (a2 = g.a()) == null) {
            a2 = "[container not found]";
        }
        this.h = new TypeDeserializer(this, typeDeserializer, (List)list, string, a2);
        this.i = new MemberDeserializer(this);
    }
    
    public static j b(final j j, final o o, final List list) {
        return j.a((g)o, list, j.b, j.d, j.e, j.f);
    }
    
    public final j a(final g g, final List<ProtoBuf$TypeParameter> list, final c c, final e e, f e2, final a a) {
        ng2.e.f((Object)g, "descriptor");
        ng2.e.f((Object)list, "typeParameterProtos");
        ng2.e.f((Object)c, "nameResolver");
        ng2.e.f((Object)e, "typeTable");
        ng2.e.f((Object)e2, "versionRequirementTable");
        ng2.e.f((Object)a, "metadataVersion");
        final h a2 = this.a;
        final int b = a.b;
        boolean b2 = true;
        if (b != 1 || a.c < 4) {
            b2 = false;
        }
        if (!b2) {
            e2 = this.e;
        }
        return new j(a2, c, g, e, e2, a, this.g, this.h, list);
    }
}
