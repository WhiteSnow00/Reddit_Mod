// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.models;

import oj.b;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import hj.u;
import nj.a;
import hj.h;
import hj.v;

public class SafeListAdapter implements v
{
    public <T> u<T> create(final h h, final a<T> a) {
        return new u<T>(this, h.e((v)this, (a)a), a) {
            public final SafeListAdapter this$0;
            public final u val$delegate;
            public final a val$tokenType;
            
            public T read(final oj.a a) throws IOException {
                Object o2;
                final Object o = o2 = this.val$delegate.read(a);
                if (List.class.isAssignableFrom(this.val$tokenType.a)) {
                    if (o == null) {
                        return (T)Collections.EMPTY_LIST;
                    }
                    o2 = Collections.unmodifiableList((List<?>)o);
                }
                return (T)o2;
            }
            
            public void write(final b b, final T t) throws IOException {
                this.val$delegate.write(b, (Object)t);
            }
        };
    }
}
