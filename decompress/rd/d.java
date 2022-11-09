// 
// Decompiled by Procyon v0.6.0
// 

package rd;

import java.util.Iterator;
import java.util.Collection;
import java.util.HashSet;
import java.util.Collections;
import j0.b;
import android.view.View;
import com.google.android.gms.common.api.a;
import java.util.Map;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import android.accounts.Account;

public final class d
{
    public final Account a;
    public final Set<Scope> b;
    public final Set<Scope> c;
    public final Map<com.google.android.gms.common.api.a<?>, u> d;
    public final View e;
    public final String f;
    public final String g;
    public final ue.a h;
    public Integer i;
    
    public d(final Account a, final Set set, final b b, final String f, final String g, final ue.a a2) {
        this.a = a;
        Set<Object> b2;
        if (set == null) {
            b2 = Collections.emptySet();
        }
        else {
            b2 = Collections.unmodifiableSet((Set<?>)set);
        }
        this.b = (Set<Scope>)b2;
        Object emptyMap = b;
        if (b == null) {
            emptyMap = Collections.emptyMap();
        }
        this.d = (Map<com.google.android.gms.common.api.a<?>, u>)emptyMap;
        this.e = null;
        this.f = f;
        this.g = g;
        ue.a f2;
        if ((f2 = a2) == null) {
            f2 = ue.a.f;
        }
        this.h = f2;
        final HashSet set2 = new HashSet(b2);
        final Iterator<u> iterator = ((Map<com.google.android.gms.common.api.a<?>, u>)emptyMap).values().iterator();
        while (iterator.hasNext()) {
            iterator.next().getClass();
            set2.addAll(null);
        }
        this.c = Collections.unmodifiableSet((Set<? extends Scope>)set2);
    }
    
    public static final class a
    {
        public Account a;
        public j0.d<Scope> b;
        public String c;
        public String d;
    }
}
