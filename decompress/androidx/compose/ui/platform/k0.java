// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import android.os.BaseBundle;
import java.util.Collection;
import android.content.Context;
import android.content.pm.PackageManager$NameNotFoundException;
import dg.p1;
import android.util.Log;
import java.io.IOException;
import we.g;
import com.twilio.live.player.PlayerException;
import org.json.JSONObject;
import xd2.h;
import java.util.Iterator;
import java.util.List;
import kotlin.TypeCastException;
import java.util.ArrayList;
import com.tonyodev.fetch2.Download;
import u2.k;
import u2.j;
import qe.j4;
import qe.k5;
import android.text.TextUtils;
import android.os.Bundle;
import nm2.c;
import qe.c7;
import he.bd;
import he.cc;
import android.database.sqlite.SQLiteDatabase;
import n40.f;
import java.util.Set;
import java.lang.reflect.Field;
import id2.i;
import com.reddit.carousel.view.CarouselRecyclerView;
import java.io.ByteArrayOutputStream;
import ng2.e;
import android.os.Parcel;
import java.util.Map;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import android.util.SparseArray;
import cg.d;
import hp.b;
import we.a;
import hg.m0;
import qe.j3;
import qe.i7;
import he.jc;
import he.j2;

public final class k0 implements j2, jc, i7, j3, m0, a, b
{
    public final int f;
    public Object g;
    
    public k0() {
        this.f = 20;
        this(new d());
    }
    
    public k0(final int f) {
        this.f = f;
        if (f == 3) {
            this.g = new SparseArray();
            return;
        }
        if (f == 13) {
            this.g = Collections.newSetFromMap(new ConcurrentHashMap<Object, Boolean>());
            return;
        }
        switch (f) {
            default: {
                final Parcel obtain = Parcel.obtain();
                e.e((Object)obtain, "obtain()");
                this.g = obtain;
                return;
            }
            case 23: {
                this.g = null;
                return;
            }
            case 22: {
                this.g = new ByteArrayOutputStream();
                return;
            }
            case 21: {
                this.g = new io.michaelrocks.libphonenumber.android.internal.a();
            }
        }
    }
    
    public k0(final int f, final int n) {
        this.f = f;
    }
    
    public k0(final d g) {
        this.f = 20;
        e.f((Object)g, "jwtDecoder");
        this.g = g;
    }
    
    public k0(final CarouselRecyclerView g) {
        this.f = 17;
        this.g = g;
    }
    
    public k0(final jc g) {
        this.f = 5;
        this.g = g;
    }
    
    public k0(final i g) {
        this.f = 19;
        this.g = g;
    }
    
    public k0(final Object g, final int f) {
        this.f = f;
        this.g = g;
    }
    
    public k0(final Field g) {
        this.f = 12;
        g.getClass();
        this.g = g;
    }
    
    public k0(final Set g) {
        this.f = 15;
        ((Collection)(this.g = g)).isEmpty();
    }
    
    public k0(final ky.b g) {
        this.f = 16;
        e.f((Object)g, "country");
        this.g = g;
    }
    
    public k0(final f g) {
        this.f = 18;
        e.f((Object)g, "eventSender");
        this.g = g;
    }
    
    public static k0 h() {
        return new k0(22);
    }
    
    public final void a(final String s) {
        ((jc)this.g).a(s);
    }
    
    public final void b(final SQLiteDatabase sqLiteDatabase) {
        final b[] array = (b[])this.g;
        if (array.length == 0) {
            new hp.a().b(sqLiteDatabase);
        }
        else {
            for (int length = array.length, i = 0; i < length; ++i) {
                array[i].b(sqLiteDatabase);
            }
        }
    }
    
    public final /* bridge */ void c(final cc cc) {
        ((jc)this.g).c((cc)cc);
    }
    
    public final void d(final String s, final int n, final Throwable t, final byte[] array, final Map map) {
        ((c7)this.g).k(s, n, t, array, map);
    }
    
    public final byte[] e() {
        return ((ByteArrayOutputStream)this.g).toByteArray();
    }
    
    public final void f(final c c) {
        try {
            ((ByteArrayOutputStream)this.g).write(c.getEncoded());
        }
        catch (final Exception ex) {
            throw new RuntimeException(ex.getMessage(), ex);
        }
    }
    
    public final void g(final byte[] array) {
        try {
            ((ByteArrayOutputStream)this.g).write(array);
        }
        catch (final Exception ex) {
            throw new RuntimeException(ex.getMessage(), ex);
        }
    }
    
    public final void i(final byte b) {
        ((Parcel)this.g).writeByte(b);
    }
    
    public final void j(final float n) {
        ((Parcel)this.g).writeFloat(n);
    }
    
    public final void k(final Bundle bundle, final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            final k5 k5 = (k5)this.g;
            ((j4)((cg.j)k5).g).s.getClass();
            k5.y("auto", "_err", bundle, true, true, System.currentTimeMillis());
            return;
        }
        this.g.getClass();
        throw new IllegalStateException("Unexpected call on client side");
    }
    
    public final void l(final long n) {
        final long b = j.b(n);
        final boolean a = k.a(b, 0L);
        byte b2 = 0;
        if (!a) {
            if (k.a(b, 4294967296L)) {
                b2 = 1;
            }
            else if (k.a(b, 8589934592L)) {
                b2 = 2;
            }
        }
        this.i(b2);
        if (!k.a(j.b(n), 0L)) {
            this.j(j.c(n));
        }
    }
    
    public final ArrayList m(int n, final Download download) {
        e.g((Object)download, "download");
        final List p2 = ((i)this.g).p1(n);
        if (p2 != null) {
            final ArrayList list = (ArrayList)p2;
            final Iterator iterator = list.iterator();
            n = 0;
            while (true) {
                while (iterator.hasNext()) {
                    if (((Download)iterator.next()).getId() == download.getId()) {
                        if (n != -1) {
                            list.set(n, download);
                        }
                        return list;
                    }
                    ++n;
                }
                n = -1;
                continue;
            }
        }
        throw new TypeCastException("null cannot be cast to non-null type java.util.ArrayList<com.tonyodev.fetch2.Download>");
    }
    
    public final h n(String string) {
        e.f((Object)string, "accessToken");
        try {
            this.g.getClass();
            final Object value = new JSONObject(d.G1(string)).get("grants");
            if (value != null) {
                final JSONObject jsonObject = ((JSONObject)value).getJSONObject("player");
                string = jsonObject.getString("playbackUrl");
                e.e((Object)string, "playbackGrant.getString(\"playbackUrl\")");
                final String string2 = jsonObject.getString("playerStreamerSid");
                e.e((Object)string2, "playbackGrant.getString(\"playerStreamerSid\")");
                return new h(string, string2);
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        catch (final Exception ex) {
            throw new PlayerException(20101, "Twilio was unable to validate your Access Token", null, ex);
        }
    }
    
    public final void o(final int n) {
        while (((ByteArrayOutputStream)this.g).size() < n) {
            ((ByteArrayOutputStream)this.g).write(0);
        }
    }
    
    public final void p() {
        switch (this.f) {
            default: {
                ((SparseArray)this.g).clear();
                return;
            }
            case 0: {
                ((Parcel)this.g).recycle();
                final Parcel obtain = Parcel.obtain();
                e.e((Object)obtain, "obtain()");
                this.g = obtain;
            }
        }
    }
    
    public final void q(final int n) {
        ((ByteArrayOutputStream)this.g).write((byte)(n >>> 24));
        ((ByteArrayOutputStream)this.g).write((byte)(n >>> 16));
        ((ByteArrayOutputStream)this.g).write((byte)(n >>> 8));
        ((ByteArrayOutputStream)this.g).write((byte)n);
    }
    
    public final Object then(final g g) {
        this.g.getClass();
        final Bundle bundle = (Bundle)g.k((Class)IOException.class);
        if (bundle != null) {
            String s = ((BaseBundle)bundle).getString("registration_id");
            if (s == null) {
                s = ((BaseBundle)bundle).getString("unregistered");
                if (s == null) {
                    final String string = ((BaseBundle)bundle).getString("error");
                    if ("RST".equals(string)) {
                        throw new IOException("INSTANCE_ID_RESET");
                    }
                    if (string != null) {
                        throw new IOException(string);
                    }
                    final String value = String.valueOf(bundle);
                    Log.w("FirebaseInstanceId", ph0.a.f(new StringBuilder(value.length() + 21), "Unexpected response: ", value), new Throwable());
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
            }
            return s;
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }
    
    public final Object zza() {
        final Context a = ((p1)this.g).a();
        Object string = null;
        try {
            final Bundle metaData = a.getPackageManager().getApplicationInfo(a.getPackageName(), 128).metaData;
            if (metaData != null) {
                string = ((BaseBundle)metaData).getString("local_testing_dir");
            }
            return string;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            return string;
        }
    }
}
