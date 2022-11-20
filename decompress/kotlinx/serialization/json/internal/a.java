// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.serialization.json.internal;

import kotlinx.serialization.json.JsonNull;
import pj2.m;
import java.util.ArrayList;
import ng2.k;
import kotlin.Result;
import mg2.q;
import kotlinx.serialization.json.JsonObject;
import pj2.g;
import cg2.j;
import cg.d;
import java.util.LinkedHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import gg2.c;
import cg2.b;
import pj2.e;

public final class a
{
    public final qj2.a a;
    public final boolean b;
    public int c;
    
    public a(final e e, final qj2.a a) {
        ng2.e.f((Object)e, "configuration");
        ng2.e.f((Object)a, "lexer");
        this.a = a;
        this.b = e.c;
    }
    
    public static final Object a(a a, final b b, final c c) {
        a.getClass();
        JsonTreeReader$readObject$2 jsonTreeReader$readObject$3 = null;
        Label_0056: {
            if (c instanceof JsonTreeReader$readObject$2) {
                final JsonTreeReader$readObject$2 jsonTreeReader$readObject$2 = (JsonTreeReader$readObject$2)c;
                final int label = jsonTreeReader$readObject$2.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    jsonTreeReader$readObject$2.label = label + Integer.MIN_VALUE;
                    jsonTreeReader$readObject$3 = jsonTreeReader$readObject$2;
                    break Label_0056;
                }
            }
            jsonTreeReader$readObject$3 = new JsonTreeReader$readObject$2(a, c);
        }
        Object result = jsonTreeReader$readObject$3.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = jsonTreeReader$readObject$3.label;
        byte b3 = 0;
        a a2 = null;
        LinkedHashMap linkedHashMap3 = null;
        Label_0394: {
            LinkedHashMap l$2 = null;
            while (true) {
                String s = null;
                g g = null;
                Label_0326: {
                    c c2;
                    b l$0;
                    a l$3;
                    g g3;
                    if (label2 != 0) {
                        if (label2 == 1) {
                            s = (String)jsonTreeReader$readObject$3.L$3;
                            final LinkedHashMap linkedHashMap = (LinkedHashMap)jsonTreeReader$readObject$3.L$2;
                            a = (a)jsonTreeReader$readObject$3.L$1;
                            final b b2 = (b)jsonTreeReader$readObject$3.L$0;
                            d.b4(result);
                            g = (g)coroutine_SUSPENDED;
                            c2 = (c)jsonTreeReader$readObject$3;
                            l$0 = b2;
                            l$2 = linkedHashMap;
                            break Label_0326;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        d.b4(result);
                        b3 = a.a.h((byte)6);
                        if (a.a.t() == 4) {
                            a.p(a.a, "Unexpected leading comma", 0, null, 6);
                            throw null;
                        }
                        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        final g g2 = (g)coroutine_SUSPENDED;
                        c2 = (c)jsonTreeReader$readObject$3;
                        l$0 = b;
                        l$2 = linkedHashMap2;
                        l$3 = a;
                        g3 = g2;
                    }
                    a2 = l$3;
                    linkedHashMap3 = l$2;
                    if (!l$3.a.b()) {
                        break Label_0394;
                    }
                    String l$4;
                    if (l$3.b) {
                        l$4 = l$3.a.l();
                    }
                    else {
                        l$4 = l$3.a.k();
                    }
                    l$3.a.h((byte)5);
                    final j a3 = j.a;
                    ((JsonTreeReader$readObject$2)c2).L$0 = l$0;
                    ((JsonTreeReader$readObject$2)c2).L$1 = l$3;
                    ((JsonTreeReader$readObject$2)c2).L$2 = l$2;
                    ((JsonTreeReader$readObject$2)c2).L$3 = l$4;
                    ((JsonTreeReader$readObject$2)c2).label = 1;
                    final CoroutineSingletons a4 = l$0.a(a3, c2);
                    if (a4 == g3) {
                        return g3;
                    }
                    final a a5 = l$3;
                    s = l$4;
                    g = g3;
                    result = a4;
                    a = a5;
                }
                l$2.put(s, result);
                b3 = a.a.g();
                if (b3 == 4) {
                    final a a6 = a;
                    final g g3 = g;
                    final a l$3 = a6;
                    continue;
                }
                break;
            }
            if (b3 != 7) {
                a.p(a.a, "Expected end of the object or comma", 0, null, 6);
                throw null;
            }
            a2 = a;
            linkedHashMap3 = l$2;
        }
        if (b3 == 6) {
            a2.a.h((byte)7);
        }
        else if (b3 == 4) {
            a.p(a2.a, "Unexpected trailing comma", 0, null, 6);
            throw null;
        }
        return new JsonObject(linkedHashMap3);
    }
    
    public final g b() {
        final byte t = this.a.t();
        Object o;
        if (t == 1) {
            o = this.d(true);
        }
        else if (t == 0) {
            o = this.d(false);
        }
        else if (t == 6) {
            if (++this.c == 200) {
                final cg.j j = new cg.j((q)new JsonTreeReader$readDeepRecursive$1(this, (c)null));
                final j a = cg2.j.a;
                final Object a2 = cg2.a.a;
                final cg2.c c = new cg2.c(a, (q)j.g);
                Object i;
                while (true) {
                    i = c.i;
                    final c h = c.h;
                    if (h == null) {
                        break;
                    }
                    final Object a3 = cg2.a.a;
                    if (Result.equals-impl0(a3, i)) {
                        try {
                            final q f = c.f;
                            final Object g = c.g;
                            ng2.e.d((Object)f, "null cannot be cast to non-null type kotlin.Function3<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.startCoroutineUninterceptedOrReturn, P of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.startCoroutineUninterceptedOrReturn, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.startCoroutineUninterceptedOrReturn>, kotlin.Any?>");
                            k.e(3, (Object)f);
                            final Object invoke = f.invoke((Object)c, g, (Object)h);
                            if (invoke == CoroutineSingletons.COROUTINE_SUSPENDED) {
                                continue;
                            }
                            h.resumeWith(Result.constructor-impl(invoke));
                        }
                        finally {
                            final Throwable t2;
                            h.resumeWith(Result.constructor-impl((Object)d.B1(t2)));
                        }
                    }
                    else {
                        c.i = a3;
                        h.resumeWith(i);
                    }
                }
                d.b4(i);
                o = i;
            }
            else {
                byte b = this.a.h((byte)6);
                if (this.a.t() == 4) {
                    qj2.a.p(this.a, "Unexpected leading comma", 0, null, 6);
                    throw null;
                }
                final LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (this.a.b()) {
                    String s;
                    if (this.b) {
                        s = this.a.l();
                    }
                    else {
                        s = this.a.k();
                    }
                    this.a.h((byte)5);
                    linkedHashMap.put(s, this.b());
                    final byte b2 = b = this.a.g();
                    if (b2 != 4) {
                        if (b2 == 7) {
                            b = b2;
                            break;
                        }
                        qj2.a.p(this.a, "Expected end of the object or comma", 0, null, 6);
                        throw null;
                    }
                }
                if (b == 6) {
                    this.a.h((byte)7);
                }
                else if (b == 4) {
                    qj2.a.p(this.a, "Unexpected trailing comma", 0, null, 6);
                    throw null;
                }
                o = new JsonObject(linkedHashMap);
            }
            --this.c;
        }
        else {
            if (t != 8) {
                qj2.a.p(this.a, d.h("Cannot begin reading element, unexpected token: ", (int)t), 0, null, 6);
                throw null;
            }
            o = this.c();
        }
        return (g)o;
    }
    
    public final pj2.b c() {
        byte g = this.a.g();
        if (this.a.t() != 4) {
            final ArrayList list = new ArrayList();
            while (this.a.b()) {
                list.add(this.b());
                final byte g2 = this.a.g();
                if ((g = g2) != 4) {
                    final qj2.a a = this.a;
                    final boolean b = g2 == 9;
                    final int a2 = a.a;
                    if (!b) {
                        qj2.a.p(a, "Expected end of the array or comma", a2, null, 4);
                        throw null;
                    }
                    g = g2;
                }
            }
            if (g == 8) {
                this.a.h((byte)9);
            }
            else if (g == 4) {
                qj2.a.p(this.a, "Unexpected trailing comma", 0, null, 6);
                throw null;
            }
            return new pj2.b(list);
        }
        qj2.a.p(this.a, "Unexpected leading comma", 0, null, 6);
        throw null;
    }
    
    public final m d(final boolean b) {
        String s;
        if (!this.b && b) {
            s = this.a.k();
        }
        else {
            s = this.a.l();
        }
        if (!b && ng2.e.a((Object)s, (Object)"null")) {
            return JsonNull.f;
        }
        return new pj2.j(s, b);
    }
}
