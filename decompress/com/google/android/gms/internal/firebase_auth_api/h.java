// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import org.json.JSONException;
import org.json.JSONObject;
import java.util.Iterator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import he.fa;
import he.p9;
import he.bb;
import java.util.regex.Pattern;
import he.kc;
import he.ha;
import mg.d0;
import he.q8;
import he.o1;
import he.bc;
import he.l5;

public final class h implements l5, bc
{
    public final Object f;
    public final Object g;
    
    public h(final o1 g) {
        final q8 b = q8.b;
        this.g = g;
        this.f = b;
    }
    
    public h(final String f, final String g) {
        d0.v(f);
        this.f = f;
        this.g = g;
    }
    
    public h(final byte[] array, final byte[] array2) {
        this.f = ha.a(array);
        this.g = ha.a(array2);
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.h a() {
        final int a = kc.a;
        final zzt zzt = new zzt(Pattern.compile("[.-]"));
        if (((bb)zzt.zza("")).a.matches() ^ true) {
            return (com.google.android.gms.internal.firebase-auth-api.h)new h((o1)new p9(zzt));
        }
        throw new IllegalArgumentException(fa.f("The pattern may not match the empty string: %s", new Object[] { zzt }));
    }
    
    public final List b(final CharSequence charSequence) {
        charSequence.getClass();
        final Iterator b = ((o1)this.g).b((com.google.android.gms.internal.firebase-auth-api.h)this, charSequence);
        final ArrayList list = new ArrayList();
        while (b.hasNext()) {
            list.add(b.next());
        }
        return Collections.unmodifiableList((List<?>)list);
    }
    
    public final ha r() {
        return (ha)this.g;
    }
    
    public final ha zza() {
        return (ha)this.f;
    }
    
    public final String zza() throws JSONException {
        final JSONObject jsonObject = new JSONObject();
        jsonObject.put("token", (Object)this.f);
        jsonObject.put("returnSecureToken", true);
        final String s = (String)this.g;
        if (s != null) {
            jsonObject.put("tenantId", (Object)s);
        }
        return jsonObject.toString();
    }
}
