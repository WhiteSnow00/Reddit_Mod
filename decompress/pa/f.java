// 
// Decompiled by Procyon v0.6.0
// 

package pa;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Collections;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.b$a;
import com.google.android.datatransport.Priority;
import ta.a;
import javax.inject.Provider;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import ma.b;

public final class f implements b<SchedulerConfig>
{
    public final Provider<a> a;
    
    public f() {
        final ta.b a = ta.b.a.a;
        this.a = (Provider<a>)a;
    }
    
    public final Object get() {
        final a a = (a)this.a.get();
        final SchedulerConfig.a a2 = new SchedulerConfig.a();
        final Priority default1 = Priority.DEFAULT;
        final b$a b$a = new b$a();
        final Set<Object> emptySet = Collections.emptySet();
        if (emptySet == null) {
            throw new NullPointerException("Null flags");
        }
        b$a.c = emptySet;
        b$a.a = 30000L;
        b$a.b = 86400000L;
        a2.b.put(default1, b$a.a());
        final Priority highest = Priority.HIGHEST;
        final b$a b$a2 = new b$a();
        final Set<Object> emptySet2 = Collections.emptySet();
        if (emptySet2 == null) {
            throw new NullPointerException("Null flags");
        }
        b$a2.c = emptySet2;
        b$a2.a = 1000L;
        b$a2.b = 86400000L;
        a2.b.put(highest, b$a2.a());
        final Priority very_LOW = Priority.VERY_LOW;
        final b$a b$a3 = new b$a();
        final Set<Object> emptySet3 = Collections.emptySet();
        if (emptySet3 == null) {
            throw new NullPointerException("Null flags");
        }
        b$a3.c = emptySet3;
        b$a3.a = 86400000L;
        b$a3.b = 86400000L;
        final Set<Object> unmodifiableSet = Collections.unmodifiableSet((Set<?>)new HashSet<Object>(Arrays.asList(SchedulerConfig.Flag.NETWORK_UNMETERED, SchedulerConfig.Flag.DEVICE_IDLE)));
        if (unmodifiableSet == null) {
            throw new NullPointerException("Null flags");
        }
        b$a3.c = unmodifiableSet;
        a2.b.put(very_LOW, b$a3.a());
        if ((a2.a = a) == null) {
            throw new NullPointerException("missing required property: clock");
        }
        if (a2.b.keySet().size() >= Priority.values().length) {
            final HashMap b = a2.b;
            a2.b = new HashMap();
            return new com.google.android.datatransport.runtime.scheduling.jobscheduling.a(a2.a, (Map)b);
        }
        throw new IllegalStateException("Not all priorities have been configured");
    }
}
