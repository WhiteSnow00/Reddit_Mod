// 
// Decompiled by Procyon v0.6.0
// 

package qi2;

import cj2.j;
import di2.c;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import ai2.b;
import kotlin.reflect.jvm.internal.impl.protobuf.e;

public final class a extends oi2.a
{
    public static final a m;
    
    static {
        m = new a();
    }
    
    public a() {
        final e e = new e();
        b.a(e);
        final GeneratedMessageLite.e a = b.a;
        sg2.e.e((Object)a, "packageFqName");
        final GeneratedMessageLite.e c = b.c;
        sg2.e.e((Object)c, "constructorAnnotation");
        final GeneratedMessageLite.e b = ai2.b.b;
        sg2.e.e((Object)b, "classAnnotation");
        final GeneratedMessageLite.e d = ai2.b.d;
        sg2.e.e((Object)d, "functionAnnotation");
        final GeneratedMessageLite.e e2 = ai2.b.e;
        sg2.e.e((Object)e2, "propertyAnnotation");
        final GeneratedMessageLite.e f = ai2.b.f;
        sg2.e.e((Object)f, "propertyGetterAnnotation");
        final GeneratedMessageLite.e g = ai2.b.g;
        sg2.e.e((Object)g, "propertySetterAnnotation");
        final GeneratedMessageLite.e i = ai2.b.i;
        sg2.e.e((Object)i, "enumEntryAnnotation");
        final GeneratedMessageLite.e h = ai2.b.h;
        sg2.e.e((Object)h, "compileTimeValue");
        final GeneratedMessageLite.e j = ai2.b.j;
        sg2.e.e((Object)j, "parameterAnnotation");
        final GeneratedMessageLite.e k = ai2.b.k;
        sg2.e.e((Object)k, "typeAnnotation");
        final GeneratedMessageLite.e l = ai2.b.l;
        sg2.e.e((Object)l, "typeParameterAnnotation");
        super(e, a, c, b, d, e2, f, g, i, h, j, k, l);
    }
    
    public static String a(final c c) {
        sg2.e.f((Object)c, "fqName");
        final StringBuilder sb = new StringBuilder();
        final String b = c.b();
        sg2.e.e((Object)b, "fqName.asString()");
        sb.append(j.L0(b, '.', '/'));
        sb.append('/');
        final StringBuilder sb2 = new StringBuilder();
        String c2;
        if (c.d()) {
            c2 = "default-package";
        }
        else {
            c2 = c.f().c();
            sg2.e.e((Object)c2, "fqName.shortName().asString()");
        }
        sb2.append(c2);
        sb2.append(".kotlin_builtins");
        sb.append(sb2.toString());
        return sb.toString();
    }
}
