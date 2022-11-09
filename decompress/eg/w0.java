// 
// Decompiled by Procyon v0.6.0
// 

package eg;

import android.os.BaseBundle;
import java.io.FilenameFilter;
import android.content.Intent;
import java.util.Collection;
import java.security.NoSuchAlgorithmException;
import java.io.IOException;
import java.util.Arrays;
import xl0.d;
import android.os.Bundle;
import java.io.FileNotFoundException;
import com.google.android.play.core.common.LocalTestingException;
import android.os.ParcelFileDescriptor;
import ig.p0;
import java.util.List;
import qg.e;
import java.util.ArrayList;
import qg.n;
import java.util.HashMap;
import android.os.Looper;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;
import android.os.Handler;
import java.util.concurrent.Executor;
import ig.k0;
import android.content.Context;
import com.google.android.play.core.assetpacks.b;
import dg.k;

public final class w0 implements u1
{
    public static final k g;
    public final String a;
    public final b b;
    public final Context c;
    public final f1 d;
    public final k0<Executor> e;
    public final Handler f;
    
    static {
        g = new k("FakeAssetPackService");
        new AtomicInteger(1);
    }
    
    public w0(final File file, final b b, final Context c, final f1 d, final k0 e) {
        this.f = new Handler(Looper.getMainLooper());
        this.a = file.getAbsolutePath();
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = (k0<Executor>)e;
    }
    
    public final void a() {
        w0.g.j("keepAlive", new Object[0]);
    }
    
    public final void b(final int n, final String s) {
        w0.g.j("notifyModuleCompleted", new Object[0]);
        ((Executor)this.e.zza()).execute((Runnable)new v0(this, n, s));
    }
    
    public final void c(final int n) {
        w0.g.j("notifySessionFailed", new Object[0]);
    }
    
    public final n d(final HashMap hashMap) {
        w0.g.j("syncPacks()", new Object[0]);
        return qg.e.c((Object)new ArrayList());
    }
    
    public final void e(final List<String> list) {
        w0.g.j("cancelDownload(%s)", new Object[] { list });
    }
    
    public final n f(int i, int length, final String s, final String s2) {
        w0.g.j("getChunkFileDescriptor(session=%d, %s, %s, %d)", new Object[] { i, s, s2, length });
        final qg.k k = new qg.k();
        Label_0365: {
            try {
                final File[] j = this.i(s);
                File file;
                ParcelFileDescriptor open;
                n a;
                for (length = j.length, i = 0; i < length; ++i) {
                    file = j[i];
                    if (p0.a(file).equals(s2)) {
                        open = ParcelFileDescriptor.open(file, 268435456);
                        a = k.a;
                        synchronized (a.a) {
                            if (a.c ^ true) {
                                a.c = true;
                                a.d = open;
                                monitorexit(a.a);
                                a.b.b(a);
                                break Label_0365;
                            }
                            throw new IllegalStateException("Task is already complete");
                        }
                    }
                }
                throw new LocalTestingException(String.format("Local testing slice for '%s' not found.", s2));
            }
            catch (final LocalTestingException e) {
                w0.g.k("getChunkFileDescriptor failed", new Object[] { e });
                final n a2 = k.a;
                synchronized (a2.a) {
                    if (a2.c ^ true) {
                        a2.c = true;
                        a2.e = e;
                        monitorexit(a2.a);
                        a2.b.b(a2);
                        break Label_0365;
                    }
                    throw new IllegalStateException("Task is already complete");
                }
            }
            catch (final FileNotFoundException ex) {
                w0.g.k("getChunkFileDescriptor failed", new Object[] { ex });
                final LocalTestingException e2 = new LocalTestingException("Asset Slice file not found.", ex);
                final n a3 = k.a;
                synchronized (a3.a) {
                    if (a3.c ^ true) {
                        a3.c = true;
                        a3.e = e2;
                        monitorexit(a3.a);
                        a3.b.b(a3);
                        return k.a;
                    }
                    throw new IllegalStateException("Task is already complete");
                }
            }
        }
    }
    
    public final void g(final int n, final int n2, final String s, final String s2) {
        w0.g.j("notifyChunkTransferred", new Object[0]);
    }
    
    public final void h(int i, final String s) throws LocalTestingException {
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putInt("app_version_code", this.d.a());
        ((BaseBundle)bundle).putInt("session_id", i);
        final File[] j = this.i(s);
        final ArrayList list = new ArrayList();
        final int length = j.length;
        long n = 0L;
        i = 0;
        while (i < length) {
            final File file = j[i];
            n += file.length();
            final ArrayList list2 = new ArrayList();
            list2.add(null);
            final String a = p0.a(file);
            bundle.putParcelableArrayList(xl0.d.p("chunk_intents", s, a), list2);
            final String p2 = xl0.d.p("uncompressed_hash_sha256", s, a);
            try {
                ((BaseBundle)bundle).putString(p2, y0.b(Arrays.asList(file)));
                ((BaseBundle)bundle).putLong(xl0.d.p("uncompressed_size", s, a), file.length());
                list.add(a);
                ++i;
                continue;
            }
            catch (final IOException ex) {
                throw new LocalTestingException(String.format("Could not digest file: %s.", file), ex);
            }
            catch (final NoSuchAlgorithmException ex2) {
                throw new LocalTestingException("SHA256 algorithm not supported.", ex2);
            }
            break;
        }
        bundle.putStringArrayList(xl0.d.n("slice_ids", s), list);
        ((BaseBundle)bundle).putLong(xl0.d.n("pack_version", s), (long)this.d.a());
        ((BaseBundle)bundle).putInt(xl0.d.n("status", s), 4);
        ((BaseBundle)bundle).putInt(xl0.d.n("error_code", s), 0);
        ((BaseBundle)bundle).putLong(xl0.d.n("bytes_downloaded", s), n);
        ((BaseBundle)bundle).putLong(xl0.d.n("total_bytes_to_download", s), n);
        bundle.putStringArrayList("pack_names", new ArrayList((Collection<? extends E>)Arrays.asList(s)));
        ((BaseBundle)bundle).putLong("bytes_downloaded", n);
        ((BaseBundle)bundle).putLong("total_bytes_to_download", n);
        this.f.post((Runnable)new r(1, (Object)this, (Object)new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle)));
    }
    
    public final File[] i(final String s) throws LocalTestingException {
        final File file = new File(this.a);
        if (!file.isDirectory()) {
            throw new LocalTestingException(String.format("Local testing directory '%s' not found.", file));
        }
        final File[] listFiles = file.listFiles((FilenameFilter)new u0(s));
        if (listFiles == null) {
            throw new LocalTestingException(String.format("Failed fetching APKs for pack '%s'.", s));
        }
        final int length = listFiles.length;
        if (length != 0) {
            for (int i = 0; i < length; ++i) {
                if (p0.a(listFiles[i]).equals(s)) {
                    return listFiles;
                }
            }
            throw new LocalTestingException(String.format("No master slice available for pack '%s'.", s));
        }
        throw new LocalTestingException(String.format("No APKs available for pack '%s'.", s));
    }
}
