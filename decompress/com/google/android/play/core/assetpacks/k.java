// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.play.core.assetpacks;

import java.util.Dictionary;
import eg.s0;
import java.io.IOException;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import eg.b1;
import a2.b;
import java.io.File;

public final class k
{
    public static final dg.k b;
    public final c a;
    
    static {
        b = new dg.k("MergeSliceTaskHandler");
    }
    
    public k(final c a) {
        this.a = a;
    }
    
    public static void b(final File file, final File file2) {
        if (file.isDirectory()) {
            file2.mkdirs();
            for (final File file3 : file.listFiles()) {
                b(file3, new File(file2, file3.getName()));
            }
            if (!file.delete()) {
                final String value = String.valueOf(file);
                throw new zzck(a2.b.j(new StringBuilder(value.length() + 28), "Unable to delete directory: ", value));
            }
        }
        else {
            if (file2.exists()) {
                final String value2 = String.valueOf(file2);
                throw new zzck(a2.b.j(new StringBuilder(value2.length() + 51), "File clashing with existing file from other slice: ", value2));
            }
            if (!file.renameTo(file2)) {
                final String value3 = String.valueOf(file);
                throw new zzck(a2.b.j(new StringBuilder(value3.length() + 21), "Unable to move file: ", value3));
            }
        }
    }
    
    public final void a(final b1 b1) {
        final File l = this.a.l(b1.d, ((s0)b1).b, b1.f, b1.e);
        if (l.exists()) {
            final c a = this.a;
            final String b2 = ((s0)b1).b;
            final int d = b1.d;
            final long e = b1.e;
            a.getClass();
            final File file = new File(a.c(d, b2, e), "_packs");
            if (!file.exists()) {
                file.mkdirs();
            }
            b(l, file);
            try {
                final int h = this.a.h(b1.d, ((s0)b1).b, b1.e);
                final c a2 = this.a;
                final String b3 = ((s0)b1).b;
                final int d2 = b1.d;
                final long e2 = b1.e;
                a2.getClass();
                final File file2 = new File(new File(a2.c(d2, b3, e2), "_packs"), "merge.tmp");
                final Properties properties = new Properties();
                ((Dictionary<String, String>)properties).put("numberOfMerges", String.valueOf(h + 1));
                file2.getParentFile().mkdirs();
                file2.createNewFile();
                final FileOutputStream fileOutputStream = new FileOutputStream(file2);
                properties.store(fileOutputStream, null);
                fileOutputStream.close();
                return;
            }
            catch (final IOException ex) {
                k.b.h("Writing merge checkpoint failed with %s.", new Object[] { ex.getMessage() });
                throw new zzck("Writing merge checkpoint failed.", ex, ((s0)b1).c);
            }
        }
        throw new zzck(String.format("Cannot find verified files for slice %s.", b1.f), ((s0)b1).c);
    }
}
