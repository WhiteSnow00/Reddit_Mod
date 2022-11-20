// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault;

import com.squareup.moshi.JsonAdapter;
import okhttp3.Call$Factory;
import com.reddit.vault.model.LearnMoreCopyResponse;
import r82.t;
import java.util.Iterator;
import java.util.List;
import com.reddit.vault.model.IntroCopyResponse;
import com.reddit.vault.model.CopySectionResponse;
import java.util.ArrayList;
import dg2.m;
import r82.s;
import java.io.FileOutputStream;
import okhttp3.ResponseBody;
import fk2.b0;
import java.io.FileInputStream;
import java.io.Writer;
import java.io.PrintWriter;
import java.io.StringWriter;
import fk2.e0;
import java.io.OutputStream;
import com.reddit.vault.model.ErrorResponseAdapter;
import za2.q;
import ku2.w;
import ku2.j$a;
import java.util.Objects;
import ku2.x$b;
import com.reddit.vault.di.module.MoshiInstanceHolder;
import com.squareup.moshi.y;
import java.io.Closeable;
import fk2.f;
import fk2.g0;
import java.io.InputStream;
import fk2.u;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import cg2.j;
import gg2.c;
import com.reddit.vault.model.ClaimCtaCopyResponse;
import r82.d;
import r82.h0;
import javax.inject.Inject;
import ng2.e;
import r82.n0;
import android.content.Context;
import android.content.SharedPreferences;
import mg2.a;
import kotlinx.coroutines.flow.StateFlowImpl;
import com.reddit.vault.model.CopyResponse;
import okhttp3.OkHttpClient;

public final class VaultTextManagerImpl implements l
{
    public final OkHttpClient a;
    public final b b;
    public CopyResponse c;
    public final StateFlowImpl d;
    public String e;
    
    @Inject
    public VaultTextManagerImpl(final OkHttpClient a, final a<? extends SharedPreferences> a2, final Context context, final n0 n0) {
        ng2.e.f((Object)a, "okHttpClient");
        ng2.e.f((Object)a2, "sharedPreferences");
        ng2.e.f((Object)context, "context");
        ng2.e.f((Object)n0, "user");
        this.a = a;
        this.b = new b(context, n0.f, (a)a2);
        this.d = xd.a.h((Object)Boolean.FALSE);
    }
    
    public final String a() {
        return this.e;
    }
    
    public final d b(final h0 h0) {
        final CopyResponse c = this.c;
        ng2.e.c((Object)c);
        final ClaimCtaCopyResponse d = c.d;
        ng2.e.f((Object)d, "<this>");
        return new d(cg.d.J3(d.a, h0), cg.d.J3(d.b, h0));
    }
    
    public final Object c(String s, c<? super j> o) {
        Object r = s;
        Label_0054: {
            if (o instanceof VaultTextManagerImpl$updateCopy$1) {
                final VaultTextManagerImpl$updateCopy$1 vaultTextManagerImpl$updateCopy$1 = (VaultTextManagerImpl$updateCopy$1)o;
                final int label = vaultTextManagerImpl$updateCopy$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    vaultTextManagerImpl$updateCopy$1.label = label + Integer.MIN_VALUE;
                    o = vaultTextManagerImpl$updateCopy$1;
                    break Label_0054;
                }
            }
            o = new VaultTextManagerImpl$updateCopy$1(this, (c)o);
        }
        Object o2 = ((VaultTextManagerImpl$updateCopy$1)o).result;
        Object o3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((VaultTextManagerImpl$updateCopy$1)o).label;
        String s2 = null;
        final int n = 1;
        Label_1040: {
            Label_1016: {
                if (label2 != 0) {
                    if (label2 == 1) {
                        r = ((VaultTextManagerImpl$updateCopy$1)o).L$1;
                        s = (String)((VaultTextManagerImpl$updateCopy$1)o).L$0;
                        o3 = r;
                        o = s;
                        try {
                            cg.d.b4(o2);
                            break Label_1016;
                        }
                        catch (final Exception ex) {
                            break Label_1016;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cg.d.b4(o2);
                this.e = "updateCopy";
                final b b = this.b;
                b.getClass();
                ng2.e.f(r, "url");
                final boolean b2 = ((SharedPreferences)b.c.invoke()).getInt("copy_path", 0) == s.hashCode();
                if (b2 && this.c != null) {
                    this.e = "localUpToDate";
                    return j.a;
                }
                if (b2) {
                    final b b3 = this.b;
                    b3.getClass();
                    CopyResponse c = null;
                    try {
                        final Context a = b3.a;
                        final String b4 = b3.b;
                        final StringBuilder sb = new StringBuilder();
                        sb.append("vault_copy_1");
                        sb.append(b4);
                        sb.append(".json");
                        final FileInputStream openFileInput = a.openFileInput(sb.toString());
                        ng2.e.e((Object)openFileInput, "context.openFileInput(jsonFilename(userId))");
                        final b0 b5 = u.b((g0)u.g(openFileInput));
                        try {
                            final CopyResponse copyResponse = (CopyResponse)b3.d.fromJson((f)b5);
                            zd.b.u((Closeable)b5, null);
                        }
                        finally {
                            try {}
                            finally {
                                final Throwable t;
                                zd.b.u((Closeable)b5, t);
                            }
                        }
                    }
                    catch (final Exception ex2) {
                        c = null;
                    }
                    if (c != null) {
                        this.e = "cacheAvailable";
                        if (!ng2.e.a((Object)this.c, (Object)c)) {
                            this.c = c;
                            this.d.setValue((Object)Boolean.TRUE);
                        }
                        return j.a;
                    }
                }
                final y y = (y)MoshiInstanceHolder.a.getValue();
                final x$b x$b = new x$b();
                final OkHttpClient a2 = this.a;
                Objects.requireNonNull(a2, "factory == null");
                x$b.b = (Call$Factory)a2;
                if (xi2.j.I0((String)r, "http", false)) {
                    s = (String)r;
                }
                else {
                    s = b.l("https://", (String)r);
                }
                x$b.c(s);
                x$b.b((j$a)nu2.a.a(y));
                final RemoteCopyDataSource remoteCopyDataSource = (RemoteCopyDataSource)x$b.d().b((Class)RemoteCopyDataSource.class);
                try {
                    ((VaultTextManagerImpl$updateCopy$1)o).L$0 = this;
                    ((VaultTextManagerImpl$updateCopy$1)o).L$1 = r;
                    ((VaultTextManagerImpl$updateCopy$1)o).label = 1;
                    o2 = remoteCopyDataSource.fetchCopy((c)o);
                    if (o2 == o3) {
                        return o3;
                    }
                    s = (String)this;
                    o3 = r;
                    final w w = (w)o2;
                    o3 = r;
                    if (w.c()) {
                        o3 = r;
                        Object o4 = j.a;
                        o3 = r;
                        if (!(o4 instanceof CopyResponse)) {
                            o3 = r;
                            o4 = w.b;
                            o3 = r;
                            ng2.e.c(o4);
                        }
                        o3 = r;
                        ng2.e.e(o4, "if (Unit is Body) {\n    \u2026  result.body()!!\n      }");
                        o3 = r;
                        o3 = r;
                        final Object o5 = new q(o4, w.a(), (String)null, (String)null, (String)null, (Exception)null);
                        o = s;
                        s = (String)o5;
                        break Label_1040;
                    }
                    String string;
                    try {
                        final ResponseBody c2 = w.c;
                        ng2.e.c((Object)c2);
                        string = c2.string();
                    }
                    catch (final Exception ex3) {
                        string = null;
                    }
                    int n2;
                    String b6;
                    try {
                        final Object fromJson = ((JsonAdapter)ErrorResponseAdapter.a).fromJson(string);
                        ng2.e.c(fromJson);
                        o3 = fromJson;
                        n2 = ((ra2.c)o3).a;
                        final String c3 = ((ra2.c)o3).c;
                        b6 = ((ra2.c)o3).b;
                        s2 = c3;
                    }
                    catch (final Exception ex4) {
                        o3 = r;
                        n2 = w.a();
                        b6 = null;
                    }
                    String string2;
                    if (s2 != null) {
                        o3 = r;
                        o3 = r;
                        final StringBuilder sb2 = new StringBuilder();
                        o3 = r;
                        sb2.append(n2);
                        o3 = r;
                        sb2.append(": ");
                        o3 = r;
                        sb2.append(s2);
                        o3 = r;
                        string2 = sb2.toString();
                    }
                    else {
                        string2 = null;
                    }
                    boolean b7 = false;
                    Label_0863: {
                        if (b6 != null) {
                            o3 = r;
                            if (xi2.j.I0(b6, "{", false)) {
                                b7 = true;
                                break Label_0863;
                            }
                        }
                        b7 = false;
                    }
                    Label_0976: {
                        if (!b7) {
                            boolean b8 = false;
                            Label_0898: {
                                if (b6 != null) {
                                    o3 = r;
                                    if (xi2.j.I0(b6, "[", false)) {
                                        b8 = true;
                                        break Label_0898;
                                    }
                                }
                                b8 = false;
                            }
                            if (!b8) {
                                boolean b9 = false;
                                Label_0933: {
                                    if (b6 != null) {
                                        o3 = r;
                                        if (kotlin.text.b.J0((CharSequence)b6, (CharSequence)"r2", false)) {
                                            b9 = true;
                                            break Label_0933;
                                        }
                                    }
                                    b9 = false;
                                }
                                if (!b9) {
                                    int n3 = 0;
                                    Label_0969: {
                                        if (b6 != null) {
                                            o3 = r;
                                            if (kotlin.text.b.J0((CharSequence)b6, (CharSequence)"xml", false)) {
                                                n3 = n;
                                                break Label_0969;
                                            }
                                        }
                                        n3 = 0;
                                    }
                                    if (n3 == 0) {
                                        break Label_0976;
                                    }
                                }
                            }
                        }
                        b6 = null;
                    }
                    o3 = r;
                    o3 = new q((Object)null, w.a(), string, b6, string2, (Exception)null);
                    o = s;
                    s = (String)o3;
                    break Label_1040;
                    r = o3;
                }
                catch (final Exception ex) {
                    o = this;
                }
            }
            final Exception ex;
            s = (String)new q((Object)null, 0, (String)null, (String)null, (String)null, ex);
        }
        Object o6 = ((q)s).a;
        Label_1271: {
            if (o6 == null) {
                break Label_1271;
            }
            o3 = ((VaultTextManagerImpl)o).b;
            final CopyResponse copyResponse2 = (CopyResponse)o6;
            o3.getClass();
            ng2.e.f(r, "url");
            final Context a3 = ((b)o3).a;
            final String b10 = ((b)o3).b;
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("vault_copy_1");
            sb3.append(b10);
            sb3.append(".json");
            final FileOutputStream openFileOutput = a3.openFileOutput(sb3.toString(), 0);
            ng2.e.e((Object)openFileOutput, "context.openFileOutput(j\u2026d), Context.MODE_PRIVATE)");
            o6 = u.a((e0)u.d(openFileOutput));
            while (true) {
                try {
                    try {
                        ((b)o3).d.toJson((fk2.e)o6, (Object)copyResponse2);
                        break Label_1174;
                    }
                    finally {
                        try {}
                        finally {
                            zd.b.u((Closeable)o6, (Throwable)o);
                        }
                        final j a4 = j.a;
                        zd.b.u((Closeable)o6, null);
                        ((SharedPreferences)((b)o3).c.invoke()).edit().putInt("copy_path", ((String)r).hashCode()).apply();
                        s = (String)((q)s).a;
                        iftrue(Label_1242:)(!ng2.e.a((Object)((VaultTextManagerImpl)o).c, (Object)s));
                        return j.a;
                        Label_1242: {
                            ((VaultTextManagerImpl)o).c = (CopyResponse)s;
                        }
                        ((VaultTextManagerImpl)o).d.setValue((Object)Boolean.TRUE);
                        return j.a;
                    }
                    o3 = ((q)s).e;
                    if (o3 != null) {
                        s = (String)o3;
                    }
                    else if (((q)s).c != null) {
                        r = d.r("error fetching copy: ", (String)r, ": ");
                        ((StringBuilder)r).append(((q)s).b);
                        ((StringBuilder)r).append(": ");
                        ((StringBuilder)r).append(((q)s).c);
                        s = ((StringBuilder)r).toString();
                    }
                    else {
                        o3 = new StringWriter();
                        s = (String)((q)s).f;
                        if (s != null) {
                            ((Throwable)s).printStackTrace(new PrintWriter((Writer)o3));
                        }
                        s = (String)new StringBuilder();
                        ((StringBuilder)s).append("error fetching copy: ");
                        ((StringBuilder)s).append((String)r);
                        ((StringBuilder)s).append(": ");
                        ((StringBuilder)s).append(o3);
                        s = ((StringBuilder)s).toString();
                    }
                    ((VaultTextManagerImpl)o).e = s;
                    return j.a;
                }
                catch (final Exception ex5) {
                    continue;
                }
                break;
            }
        }
    }
    
    public final s d(final h0 h0) {
        final CopyResponse c = this.c;
        ng2.e.c((Object)c);
        final IntroCopyResponse a = c.a;
        ng2.e.f((Object)a, "<this>");
        String s = a.a;
        if (h0 != null) {
            s = cg.d.J3(s, h0);
        }
        final List b = a.b;
        final ArrayList list = new ArrayList<r82.l>(m.u4((Iterable)b, 10));
        for (final CopySectionResponse copySectionResponse : b) {
            r82.l l;
            if (h0 != null) {
                ng2.e.f((Object)copySectionResponse, "<this>");
                final String a2 = copySectionResponse.a;
                final String j3 = cg.d.J3(copySectionResponse.b, h0);
                final String c2 = copySectionResponse.c;
                String j4;
                if (c2 != null) {
                    j4 = cg.d.J3(c2, h0);
                }
                else {
                    j4 = null;
                }
                l = new r82.l(a2, j3, j4);
            }
            else {
                ng2.e.f((Object)copySectionResponse, "<this>");
                l = new r82.l(copySectionResponse.a, copySectionResponse.b, copySectionResponse.c);
            }
            list.add(l);
        }
        return new s(s, list);
    }
    
    public final void e(final String e) {
        this.e = e;
    }
    
    public final t f() {
        final CopyResponse c = this.c;
        ng2.e.c((Object)c);
        final LearnMoreCopyResponse c2 = c.c;
        ng2.e.f((Object)c2, "<this>");
        final String a = c2.a;
        final List b = c2.b;
        final ArrayList list = new ArrayList<r82.l>(m.u4((Iterable)b, 10));
        for (final CopySectionResponse copySectionResponse : b) {
            ng2.e.f((Object)copySectionResponse, "<this>");
            list.add(new r82.l(copySectionResponse.a, copySectionResponse.b, copySectionResponse.c));
        }
        return new t(a, list);
    }
    
    public final StateFlowImpl isReady() {
        return this.d;
    }
}
