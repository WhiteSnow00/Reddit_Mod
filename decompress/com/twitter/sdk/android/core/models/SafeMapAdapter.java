// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.models;

import oj.b;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import hj.u;
import nj.a;
import hj.h;
import hj.v;

public class SafeMapAdapter implements v
{
    public <T> u<T> create(final h h, final a<T> a) {
        return new u<T>(this, h.e((v)this, (a)a), a) {
            public final SafeMapAdapter this$0;
            public final u val$delegate;
            public final a val$tokenType;
            
            public T read(final oj.a a) throws IOException {
                Object o2;
                final Object o = o2 = this.val$delegate.read(a);
                if (Map.class.isAssignableFrom(this.val$tokenType.a)) {
                    if (o == null) {
                        return (T)Collections.EMPTY_MAP;
                    }
                    o2 = Collections.unmodifiableMap((Map<?, ?>)o);
                }
                return (T)o2;
            }
            
            public void write(final b b, final T t) throws IOException {
                this.val$delegate.write(b, (Object)t);
            }
        };
    }
}
