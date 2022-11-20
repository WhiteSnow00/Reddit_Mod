// 
// Decompiled by Procyon v0.6.0
// 

package ki2;

import java.util.Set;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import kotlin.collections.EmptyList;
import ch2.v;
import cg.d;
import eh2.e$a;
import pi2.g$a;
import eh2.c$a;
import eh2.a$a;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer;
import oi2.j0;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.e;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import eh2.b;
import ch2.w;
import ci2.g;
import dh2.c;
import ch2.t;

public final class h
{
    public final ni2.h a;
    public final t b;
    public final i c;
    public final f d;
    public final a<c, g<?>> e;
    public final w f;
    public final q g;
    public final m h;
    public final jh2.c i;
    public final n j;
    public final Iterable<b> k;
    public final NotFoundClasses l;
    public final ki2.g m;
    public final eh2.a n;
    public final eh2.c o;
    public final e p;
    public final pi2.g q;
    public final eh2.e r;
    public final List<j0> s;
    public final ClassDeserializer t;
    
    public h(final ni2.h a, final t b, final f d, final a e, final w f, final m h, final n j, final Iterable k, final NotFoundClasses l, eh2.a a2, eh2.c a3, final e p16, pi2.h b2, final gi2.b b3, List l2, final int n) {
        final i.a a4 = ki2.i.a.a;
        final q$a a5 = q$a.a;
        final jh2.c.a a6 = jh2.c.a.a;
        final ki2.g a7 = ki2.g.a.a;
        if ((n & 0x2000) != 0x0) {
            a2 = (eh2.a)a$a.a;
        }
        if ((n & 0x4000) != 0x0) {
            a3 = (eh2.c)c$a.a;
        }
        if ((0x10000 & n) != 0x0) {
            pi2.g.b.getClass();
            b2 = g$a.b;
        }
        Object a8;
        if ((0x40000 & n) != 0x0) {
            a8 = e$a.a;
        }
        else {
            a8 = null;
        }
        if ((n & 0x80000) != 0x0) {
            l2 = cg.d.l3((Object)oi2.i.a);
        }
        ng2.e.f((Object)a, "storageManager");
        ng2.e.f((Object)b, "moduleDescriptor");
        ng2.e.f((Object)f, "packageFragmentProvider");
        ng2.e.f((Object)k, "fictitiousClassDescriptorFactories");
        ng2.e.f((Object)a2, "additionalClassPartsProvider");
        ng2.e.f((Object)a3, "platformDependentDeclarationFilter");
        ng2.e.f((Object)p16, "extensionRegistryLite");
        ng2.e.f((Object)b2, "kotlinTypeChecker");
        ng2.e.f(a8, "platformDependentTypeTransformer");
        ng2.e.f((Object)l2, "typeAttributeTranslators");
        this.a = a;
        this.b = b;
        this.c = a4;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = (q)a5;
        this.h = h;
        this.i = a6;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = a7;
        this.n = a2;
        this.o = a3;
        this.p = p16;
        this.q = (pi2.g)b2;
        this.r = (eh2.e)a8;
        this.s = l2;
        this.t = new ClassDeserializer(this);
    }
    
    public final j a(final v v, final wh2.c c, final wh2.e e, final wh2.f f, final wh2.a a, final mi2.d d) {
        ng2.e.f((Object)v, "descriptor");
        ng2.e.f((Object)c, "nameResolver");
        ng2.e.f((Object)f, "versionRequirementTable");
        ng2.e.f((Object)a, "metadataVersion");
        return new j(this, c, (ch2.g)v, e, f, a, d, null, (List<ProtoBuf$TypeParameter>)EmptyList.INSTANCE);
    }
    
    public final ch2.c b(final yh2.b b) {
        ng2.e.f((Object)b, "classId");
        final ClassDeserializer t = this.t;
        final Set c = ClassDeserializer.c;
        return t.a(b, (ki2.e)null);
    }
}
