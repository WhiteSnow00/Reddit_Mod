// 
// Decompiled by Procyon v0.6.0
// 

package com.apollographql.apollo.api;

import h7.d;
import ng2.e;
import kotlin.Metadata;
import mg2.p;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n" }, d2 = { "Lcom/apollographql/apollo/api/a;", "acc", "Lcom/apollographql/apollo/api/a$b;", "element", "<anonymous>" }, k = 3, mv = { 1, 5, 1 })
final class ExecutionContext$plus$1 extends Lambda implements p<a, a.b, a>
{
    public static final ExecutionContext$plus$1 INSTANCE;
    
    static {
        INSTANCE = new ExecutionContext$plus$1();
    }
    
    public ExecutionContext$plus$1() {
        super(2);
    }
    
    public final a invoke(a a, a.b b) {
        e.g((Object)a, "acc");
        e.g((Object)b, "element");
        a = a.a((a$c)b.getKey());
        if (a != d.b) {
            b = (a.b)new h7.a(a, b);
        }
        return (a)b;
    }
    
    public /* bridge */ Object invoke(final Object o, final Object o2) {
        return this.invoke((a)o, (a.b)o2);
    }
}
