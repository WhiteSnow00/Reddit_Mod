// 
// Decompiled by Procyon v0.6.0
// 

package androidx.lifecycle;

import android.os.BaseBundle;
import java.util.Set;
import java.util.Iterator;
import hj2.s;
import bg.d;
import kotlin.Pair;
import kotlin.collections.c;
import sg2.e;
import java.util.Map;
import java.util.HashMap;
import androidx.fragment.app.c0;
import android.util.SizeF;
import android.util.Size;
import android.util.SparseArray;
import java.io.Serializable;
import android.os.Parcelable;
import java.util.ArrayList;
import android.os.Bundle;
import android.os.Binder;
import m5.b;
import java.util.LinkedHashMap;

public final class f0
{
    public static final Class<?>[] f;
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public final b.b e;
    
    static {
        f = new Class[] { Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class };
    }
    
    public f0() {
        this.a = new LinkedHashMap();
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new c0(this, 1);
    }
    
    public f0(final HashMap hashMap) {
        final LinkedHashMap a = new LinkedHashMap();
        this.a = a;
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new e0(this);
        a.putAll(hashMap);
    }
    
    public static Bundle a(final f0 f0) {
        e.f((Object)f0, "this$0");
        final Iterator iterator = c.h1((Map)f0.b).entrySet().iterator();
        while (true) {
            final boolean hasNext = iterator.hasNext();
            final int n = 0;
            if (!hasNext) {
                final Set keySet = f0.a.keySet();
                final ArrayList list = new ArrayList(keySet.size());
                final ArrayList list2 = new ArrayList<Object>(list.size());
                for (final String s : keySet) {
                    list.add((Object)s);
                    list2.add(f0.a.get(s));
                }
                return d.J(new Pair[] { new Pair((Object)"keys", (Object)list), new Pair((Object)"values", (Object)list2) });
            }
            final Map.Entry<String, V> entry = (Map.Entry<String, V>)iterator.next();
            final String s2 = entry.getKey();
            final Bundle d = ((b.b)entry.getValue()).D();
            e.f((Object)s2, "key");
            int n3 = 0;
            Label_0144: {
                if (d != null) {
                    final Class<?>[] f2 = f0.f;
                    int n2 = 0;
                    while (true) {
                        n3 = n;
                        if (n2 >= 29) {
                            break Label_0144;
                        }
                        final Class<?> clazz = f2[n2];
                        e.c((Object)clazz);
                        if (clazz.isInstance(d)) {
                            break;
                        }
                        ++n2;
                    }
                }
                n3 = 1;
            }
            if (n3 == 0) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Can't put value with type ");
                e.c((Object)d);
                sb.append(d.getClass());
                sb.append(" into saved state");
                throw new IllegalArgumentException(sb.toString());
            }
            final Object value = f0.c.get(s2);
            x x;
            if (value instanceof x) {
                x = (x)value;
            }
            else {
                x = null;
            }
            if (x != null) {
                x.k((Object)d);
            }
            else {
                f0.a.put(s2, d);
            }
            final s s3 = f0.d.get(s2);
            if (s3 == null) {
                continue;
            }
            s3.setValue((Object)d);
        }
    }
    
    public static final class a
    {
        public static f0 a(final Bundle bundle, final Bundle bundle2) {
            if (bundle == null) {
                f0 f0;
                if (bundle2 == null) {
                    f0 = new f0();
                }
                else {
                    final HashMap hashMap = new HashMap();
                    for (final String s : ((BaseBundle)bundle2).keySet()) {
                        e.e((Object)s, "key");
                        hashMap.put(s, ((BaseBundle)bundle2).get(s));
                    }
                    f0 = new f0(hashMap);
                }
                return f0;
            }
            final ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            final ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            final int n = 0;
            if (parcelableArrayList != null && parcelableArrayList2 != null && parcelableArrayList.size() == parcelableArrayList2.size()) {
                final LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (int size = parcelableArrayList.size(), i = n; i < size; ++i) {
                    final Object value = parcelableArrayList.get(i);
                    if (value == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    linkedHashMap.put(value, parcelableArrayList2.get(i));
                }
                return new f0(linkedHashMap);
            }
            throw new IllegalStateException("Invalid bundle passed as restored state".toString());
        }
    }
}
