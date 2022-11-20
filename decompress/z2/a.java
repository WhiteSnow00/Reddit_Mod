// 
// Decompiled by Procyon v0.6.0
// 

package z2;

import androidx.fragment.app.j0;
import android.util.Log;
import androidx.fragment.app.c0;
import androidx.fragment.app.f0;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Iterator;
import androidx.fragment.app.k0;
import java.util.Collection;
import java.util.Collections;
import androidx.fragment.app.Fragment;
import com.google.firebase.database.tubesock.WebSocketException;
import android.util.Base64;
import java.net.URI;
import java.util.HashMap;
import androidx.constraintlayout.core.SolverVariable;
import a2.c;
import java.util.HashSet;
import java.util.ArrayList;
import j0.i;
import z3.f;

public final class a
{
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    
    public a(final int n) {
        if (n == 1) {
            this.a = new f(10);
            this.b = new i();
            this.c = new ArrayList();
            this.d = new HashSet();
            return;
        }
        if (n != 2) {
            this.a = new c(256, 1);
            this.b = new c(256, 1);
            this.c = new c(256, 1);
            this.d = new SolverVariable[32];
            return;
        }
        this.a = new ArrayList();
        this.b = new HashMap();
        this.c = new HashMap();
    }
    
    public a(final URI a, final HashMap d) {
        this.c = null;
        this.a = a;
        this.b = null;
        this.d = d;
        final byte[] array = new byte[16];
        for (int i = 0; i < 16; ++i) {
            array[i] = (byte)(Math.random() * 255 + 0);
        }
        this.c = Base64.encodeToString(array, 2);
    }
    
    public static void m(final HashMap hashMap) {
        if (!"websocket".equals(hashMap.get("upgrade"))) {
            throw new WebSocketException("connection failed: missing header field in server handshake: Upgrade");
        }
        if ("upgrade".equals(hashMap.get("connection"))) {
            return;
        }
        throw new WebSocketException("connection failed: missing header field in server handshake: Connection");
    }
    
    public static void n(final String s) {
        final int int1 = Integer.parseInt(s.substring(9, 12));
        if (int1 == 407) {
            throw new WebSocketException("connection failed: proxy authentication not supported");
        }
        if (int1 == 404) {
            throw new WebSocketException("connection failed: 404 not found");
        }
        if (int1 == 101) {
            return;
        }
        throw new WebSocketException(d.h("connection failed: unknown status code ", int1));
    }
    
    public final void a(final Fragment fragment) {
        if (!((ArrayList)this.a).contains(fragment)) {
            synchronized ((ArrayList)this.a) {
                ((ArrayList)this.a).add(fragment);
                monitorexit((ArrayList)this.a);
                fragment.mAdded = true;
                return;
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment already added: ");
        sb.append(fragment);
        throw new IllegalStateException(sb.toString());
    }
    
    public final void b() {
        ((HashMap)this.b).values().removeAll(Collections.singleton((Object)null));
    }
    
    public final void c(final Object o, final ArrayList list, final HashSet set) {
        if (list.contains(o)) {
            return;
        }
        if (!set.contains(o)) {
            set.add(o);
            final ArrayList list2 = (ArrayList)((i)this.b).getOrDefault(o, (Object)null);
            if (list2 != null) {
                for (int i = 0; i < list2.size(); ++i) {
                    this.c(list2.get(i), list, set);
                }
            }
            set.remove(o);
            list.add(o);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }
    
    public final Fragment d(final String s) {
        final k0 k0 = ((HashMap)this.b).get(s);
        if (k0 != null) {
            return k0.c;
        }
        return null;
    }
    
    public final Fragment e(final String s) {
        for (final k0 k0 : ((HashMap)this.b).values()) {
            if (k0 != null) {
                final Fragment fragmentByWho = k0.c.findFragmentByWho(s);
                if (fragmentByWho != null) {
                    return fragmentByWho;
                }
                continue;
            }
        }
        return null;
    }
    
    public final ArrayList f() {
        final ArrayList list = new ArrayList();
        for (final k0 k0 : ((HashMap)this.b).values()) {
            if (k0 != null) {
                list.add(k0);
            }
        }
        return list;
    }
    
    public final ArrayList g() {
        final ArrayList list = new ArrayList();
        for (final k0 k0 : ((HashMap)this.b).values()) {
            if (k0 != null) {
                list.add(k0.c);
            }
            else {
                list.add(null);
            }
        }
        return list;
    }
    
    public final List h() {
        if (((ArrayList)this.a).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized ((ArrayList)this.a) {
            return new ArrayList((Collection)this.a);
        }
    }
    
    public final byte[] i() {
        final String path = ((URI)this.a).getPath();
        final String query = ((URI)this.a).getQuery();
        final StringBuilder t = a.t(path);
        String l;
        if (query == null) {
            l = "";
        }
        else {
            l = b.l("?", query);
        }
        t.append(l);
        final String string = t.toString();
        String s = ((URI)this.a).getHost();
        if (((URI)this.a).getPort() != -1) {
            final StringBuilder q = android.support.v4.media.a.q(s, ":");
            q.append(((URI)this.a).getPort());
            s = q.toString();
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Host", s);
        linkedHashMap.put("Upgrade", "websocket");
        linkedHashMap.put("Connection", "Upgrade");
        linkedHashMap.put("Sec-WebSocket-Version", "13");
        linkedHashMap.put("Sec-WebSocket-Key", this.c);
        final Object b = this.b;
        if (b != null) {
            linkedHashMap.put("Sec-WebSocket-Protocol", b);
        }
        final Object d = this.d;
        if (d != null) {
            for (final String s2 : ((Map)d).keySet()) {
                if (!linkedHashMap.containsKey(s2)) {
                    linkedHashMap.put(s2, ((Map)this.d).get(s2));
                }
            }
        }
        final StringBuilder t2 = a.t(a.n("GET ", string, " HTTP/1.1\r\n"));
        String f = new String();
        for (final String s3 : linkedHashMap.keySet()) {
            f = ph0.a.f(d.r(f, s3, ": "), (String)linkedHashMap.get(s3), "\r\n");
        }
        t2.append(f);
        final byte[] bytes = b.l(t2.toString(), "\r\n").getBytes(Charset.defaultCharset());
        final byte[] array = new byte[bytes.length];
        System.arraycopy(bytes, 0, array, 0, bytes.length);
        return array;
    }
    
    public final void j(final k0 k0) {
        final Fragment c = k0.c;
        if (((HashMap)this.b).get(c.mWho) != null) {
            return;
        }
        ((HashMap)this.b).put(c.mWho, k0);
        if (c.mRetainInstanceChangedWhileDetached) {
            if (c.mRetainInstance) {
                ((f0)this.d).c(c);
            }
            else {
                ((f0)this.d).f(c);
            }
            c.mRetainInstanceChangedWhileDetached = false;
        }
        if (c0.M(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Added fragment to active set ");
            sb.append(c);
            Log.v("FragmentManager", sb.toString());
        }
    }
    
    public final void k(final k0 k0) {
        final Fragment c = k0.c;
        if (c.mRetainInstance) {
            ((f0)this.d).f(c);
        }
        if (((HashMap)this.b).put(c.mWho, null) == null) {
            return;
        }
        if (c0.M(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Removed fragment from active set ");
            sb.append(c);
            Log.v("FragmentManager", sb.toString());
        }
    }
    
    public final j0 l(final String s, final j0 j0) {
        if (j0 != null) {
            return ((HashMap)this.c).put(s, j0);
        }
        return ((HashMap)this.c).remove(s);
    }
}
