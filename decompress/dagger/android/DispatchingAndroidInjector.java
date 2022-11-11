// 
// Decompiled by Procyon v0.6.0
// 

package dagger.android;

import java.util.ArrayList;
import ui.b;
import javax.inject.Inject;
import java.util.Iterator;
import java.util.Collections;
import java.util.LinkedHashMap;
import com.google.common.collect.ImmutableMap;
import javax.inject.Provider;
import java.util.Map;

public final class DispatchingAndroidInjector<T> implements a<T>
{
    public final Map<String, Provider<a$a<?>>> a;
    
    @Inject
    public DispatchingAndroidInjector(final Map map, ImmutableMap unmodifiableMap) {
        if (!map.isEmpty()) {
            int n = ((Map)unmodifiableMap).size() + map.size();
            if (n < 3) {
                ++n;
            }
            else if (n < 1073741824) {
                n = (int)(n / 0.75f + 1.0f);
            }
            else {
                n = Integer.MAX_VALUE;
            }
            final LinkedHashMap linkedHashMap = new LinkedHashMap(n);
            linkedHashMap.putAll((Map)unmodifiableMap);
            for (final Map.Entry<Class, V> entry : map.entrySet()) {
                linkedHashMap.put((Object)entry.getKey().getName(), (Object)entry.getValue());
            }
            unmodifiableMap = (ImmutableMap)Collections.unmodifiableMap((Map<?, ?>)linkedHashMap);
        }
        this.a = (Map<String, Provider<a$a<?>>>)unmodifiableMap;
    }
    
    public final void inject(T o) {
        Object o2 = this.a.get(o.getClass().getName());
        Label_0069: {
            if (o2 == null) {
                final boolean b = false;
                break Label_0069;
            }
            o2 = ((Provider)o2).get();
            try {
                final a create = ((a$a)o2).create(o);
                b.l(create, "%s.create(I) should not return null.", (Class)((a$a)o2).getClass());
                create.inject(o);
                final boolean b = true;
                if (!b) {
                    final ArrayList<String> list = new ArrayList<String>();
                    for (o2 = o.getClass(); o2 != null; o2 = ((Class)o2).getSuperclass()) {
                        if (this.a.containsKey(((Class)o2).getCanonicalName())) {
                            list.add(((Class)o2).getCanonicalName());
                        }
                    }
                    if (list.isEmpty()) {
                        o = String.format("No injector factory bound for Class<%s>", o.getClass().getCanonicalName());
                    }
                    else {
                        o = String.format("No injector factory bound for Class<%1$s>. Injector factories were bound for supertypes of %1$s: %2$s. Did you mean to bind an injector factory for the subtype?", o.getClass().getCanonicalName(), list);
                    }
                    throw new IllegalArgumentException((String)o);
                }
            }
            catch (final ClassCastException ex) {
                throw new DispatchingAndroidInjector.DispatchingAndroidInjector$InvalidInjectorBindingException(String.format("%s does not implement AndroidInjector.Factory<%s>", ((Class)o2).getClass().getCanonicalName(), o.getClass().getCanonicalName()), ex);
            }
        }
    }
}
