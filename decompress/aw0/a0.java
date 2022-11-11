// 
// Decompiled by Procyon v0.6.0
// 

package aw0;

import ff2.t;
import kf2.g;
import nq.n;
import kf2.o;
import sg2.e;
import if2.a;
import java.util.ArrayDeque;
import io.reactivex.subjects.PublishSubject;
import ff2.b0;

public final class a0
{
    public final b0 a;
    public final PublishSubject<Integer> b;
    public final PublishSubject<aw0.b0> c;
    public final ArrayDeque<z> d;
    public final a e;
    
    public a0() {
        final b0 a = eg2.a.a();
        sg2.e.e((Object)a, "computation()");
        this.a = a;
        final PublishSubject<Integer> create = PublishSubject.create();
        sg2.e.e((Object)create, "create()");
        this.b = create;
        final PublishSubject<Object> create2 = (PublishSubject<Object>)PublishSubject.create();
        sg2.e.e((Object)create2, "create()");
        this.c = (PublishSubject<aw0.b0>)create2;
        this.d = new ArrayDeque<z>();
        final a subscribe = ((t)create).flatMap((o)new su.e((Object)this, 25)).observeOn(hf2.a.a()).subscribe((g)new n((Object)this, 22));
        sg2.e.e((Object)subscribe, "sleepyPubSub\n      .flat\u2026tItem))\n        }\n      }");
        this.e = subscribe;
    }
}
