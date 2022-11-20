// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core;

import com.google.gson.internal.LinkedTreeMap;
import oj.b;
import kj.g;
import hj.o;
import hj.r;
import com.google.gson.JsonParseException;
import hj.p;
import oj.a;
import kj.f;
import hj.q;
import hj.l;
import java.lang.reflect.Type;
import hj.n;
import java.util.Iterator;
import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;
import com.twitter.sdk.android.core.internal.oauth.OAuth2Token;
import java.util.HashMap;
import hj.h;
import java.util.Map;
import hj.m;
import hj.s;

public class AuthTokenAdapter implements s<AuthToken>, m<AuthToken>
{
    private static final String AUTH_TOKEN = "auth_token";
    private static final String AUTH_TYPE = "auth_type";
    public static final Map<String, Class<? extends AuthToken>> authTypeRegistry;
    private final h gson;
    
    static {
        final HashMap authTypeRegistry2 = new HashMap();
        (authTypeRegistry = authTypeRegistry2).put("oauth1a", TwitterAuthToken.class);
        authTypeRegistry2.put("oauth2", OAuth2Token.class);
        authTypeRegistry2.put("guest", GuestAuthToken.class);
    }
    
    public AuthTokenAdapter() {
        this.gson = new h();
    }
    
    public static String getAuthTypeString(final Class<? extends AuthToken> clazz) {
        for (final Map.Entry<K, Class<?>> entry : AuthTokenAdapter.authTypeRegistry.entrySet()) {
            if (entry.getValue().equals(clazz)) {
                return (String)entry.getKey();
            }
        }
        return "";
    }
    
    public AuthToken deserialize(final n n, final Type type, final l l) throws JsonParseException {
        final p a = n.a();
        final String d = ((q)a.f.get((Object)"auth_type")).d();
        final n f = a.f("auth_token");
        final h gson = this.gson;
        final Class clazz = AuthTokenAdapter.authTypeRegistry.get(d);
        gson.getClass();
        Object c;
        if (f == null) {
            c = null;
        }
        else {
            c = gson.c((a)new f(f), (Type)clazz);
        }
        return (AuthToken)vl.a.z3((Class)clazz).cast(c);
    }
    
    public /* bridge */ Object deserialize(final n n, final Type type, final l l) throws JsonParseException {
        return this.deserialize(n, type, l);
    }
    
    public n serialize(final AuthToken authToken, final Type type, final r r) {
        final p p3 = new p();
        final String authTypeString = getAuthTypeString(authToken.getClass());
        Object f;
        if (authTypeString == null) {
            f = o.f;
        }
        else {
            f = new q(authTypeString);
        }
        final LinkedTreeMap f2 = p3.f;
        Object f3 = f;
        if (f == null) {
            f3 = o.f;
        }
        f2.put((Object)"auth_type", f3);
        final h gson = this.gson;
        gson.getClass();
        final Class<? extends AuthToken> class1 = authToken.getClass();
        final g g = new g();
        gson.j((Object)authToken, (Class)class1, (b)g);
        final n m = g.M();
        final LinkedTreeMap f4 = p3.f;
        Object f5;
        if ((f5 = m) == null) {
            f5 = o.f;
        }
        f4.put((Object)"auth_token", f5);
        return (n)p3;
    }
    
    public /* bridge */ n serialize(final Object o, final Type type, final r r) {
        return this.serialize((AuthToken)o, type, r);
    }
}
