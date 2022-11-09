// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.play.core.assetpacks;

import java.util.Iterator;
import java.util.HashMap;
import java.io.InputStream;
import java.io.FileInputStream;
import java.util.Properties;
import java.io.IOException;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.io.File;
import java.util.concurrent.TimeUnit;
import eg.f1;
import android.content.Context;
import dg.k;

public final class c
{
    public static final k c;
    public final Context a;
    public final f1 b;
    
    static {
        c = new k("AssetPackStorage");
        final TimeUnit days = TimeUnit.DAYS;
        days.toMillis(14L);
        days.toMillis(28L);
    }
    
    public c(final Context a, final f1 b) {
        this.a = a;
        this.b = b;
    }
    
    public static long b(File file, final boolean b) {
        if (!file.exists()) {
            return -1L;
        }
        final ArrayList list = new ArrayList();
        if (b && file.listFiles().length > 1) {
            com.google.android.play.core.assetpacks.c.c.k("Multiple pack versions found, using highest version code.", new Object[0]);
        }
        try {
            final File[] listFiles = file.listFiles();
            for (int length = listFiles.length, i = 0; i < length; ++i) {
                file = listFiles[i];
                if (!file.getName().equals("stale.tmp")) {
                    list.add(Long.valueOf(file.getName()));
                }
            }
        }
        catch (final NumberFormatException ex) {
            com.google.android.play.core.assetpacks.c.c.i((Exception)ex, "Corrupt asset pack directories.", new Object[0]);
        }
        if (list.isEmpty()) {
            return -1L;
        }
        Collections.sort((List<Comparable>)list);
        return (long)list.get(list.size() - 1);
    }
    
    public static void f(final File file) {
        if (file.listFiles() != null) {
            if (file.listFiles().length > 1) {
                int i = 0;
                final long b = b(file, false);
                for (File[] listFiles = file.listFiles(); i < listFiles.length; ++i) {
                    final File file2 = listFiles[i];
                    if (!file2.getName().equals(String.valueOf(b)) && !file2.getName().equals("stale.tmp")) {
                        g(file2);
                    }
                }
            }
        }
    }
    
    public static boolean g(final File file) {
        final File[] listFiles = file.listFiles();
        int n = 1;
        int n2 = 1;
        if (listFiles != null) {
            final int length = listFiles.length;
            int n3 = 0;
            while (true) {
                n = n2;
                if (n3 >= length) {
                    break;
                }
                n2 &= (g(listFiles[n3]) ? 1 : 0);
                ++n3;
            }
        }
        return file.delete() && n;
    }
    
    public final void a(final int n, final String s, final long n2) {
        final File file = new File(this.d(), s);
        if (!file.exists()) {
            return;
        }
        for (final File file2 : file.listFiles()) {
            if (!file2.getName().equals(String.valueOf(n)) && !file2.getName().equals("stale.tmp")) {
                g(file2);
            }
            else if (file2.getName().equals(String.valueOf(n))) {
                for (final File file3 : file2.listFiles()) {
                    if (!file3.getName().equals(String.valueOf(n2))) {
                        g(file3);
                    }
                }
            }
        }
    }
    
    public final File c(final int n, final String s, final long n2) {
        return new File(new File(new File(new File(this.d(), "_tmp"), s), String.valueOf(n)), String.valueOf(n2));
    }
    
    public final File d() {
        return new File(this.a.getFilesDir(), "assetpacks");
    }
    
    public final ArrayList e() {
        final ArrayList list = new ArrayList();
        try {
            if (!this.d().exists() || this.d().listFiles() == null) {
                return list;
            }
            for (final File file : this.d().listFiles()) {
                if (!file.getCanonicalPath().equals(new File(this.d(), "_tmp").getCanonicalPath())) {
                    list.add(file);
                }
            }
        }
        catch (final IOException ex) {
            com.google.android.play.core.assetpacks.c.c.h("Could not process directory while scanning installed packs. %s", new Object[] { ex });
        }
        return list;
    }
    
    public final int h(int int1, String ex, final long n) throws IOException {
        final File file = new File(new File(this.c(int1, (String)ex, n), "_packs"), "merge.tmp");
        if (!file.exists()) {
            return 0;
        }
        final Properties properties = new Properties();
        ex = (NumberFormatException)new FileInputStream(file);
        try {
            properties.load((InputStream)ex);
            ((InputStream)ex).close();
            if (properties.getProperty("numberOfMerges") != null) {
                try {
                    int1 = Integer.parseInt(properties.getProperty("numberOfMerges"));
                    return int1;
                }
                catch (final NumberFormatException ex) {
                    throw new zzck("Merge checkpoint file corrupt.", ex);
                }
            }
            throw new zzck("Merge checkpoint file corrupt.");
        }
        finally {
            try {
                ((InputStream)ex).close();
            }
            finally {}
        }
    }
    
    public final long i(final String s) {
        return b(new File(new File(this.d(), s), String.valueOf((int)b(new File(this.d(), s), true))), true);
    }
    
    public final File j(final int n, final String s, final long n2) {
        return new File(new File(new File(this.d(), s), String.valueOf(n)), String.valueOf(n2));
    }
    
    public final File k(final int n, final String s, final String s2, final long n2) {
        return new File(new File(new File(this.c(n, s, n2), "_slices"), "_unverified"), s2);
    }
    
    public final File l(final int n, final String s, final String s2, final long n2) {
        return new File(new File(new File(this.c(n, s, n2), "_slices"), "_verified"), s2);
    }
    
    public final String m(final String s) throws IOException {
        final File file = new File(this.d(), s);
        if (!file.exists()) {
            com.google.android.play.core.assetpacks.c.c.g("Pack not found with pack name: %s", new Object[] { s });
            return null;
        }
        final File file2 = new File(file, String.valueOf(this.b.a()));
        if (!file2.exists()) {
            com.google.android.play.core.assetpacks.c.c.g("Pack not found with pack name: %s app version: %s", new Object[] { s, this.b.a() });
            return null;
        }
        final File[] listFiles = file2.listFiles();
        if (listFiles != null) {
            final int length = listFiles.length;
            if (length != 0) {
                if (length > 1) {
                    com.google.android.play.core.assetpacks.c.c.h("Multiple pack versions found for pack name: %s app version: %s", new Object[] { s, this.b.a() });
                    return null;
                }
                return listFiles[0].getCanonicalPath();
            }
        }
        com.google.android.play.core.assetpacks.c.c.g("No pack version found for pack name: %s app version: %s", new Object[] { s, this.b.a() });
        return null;
    }
    
    public final HashMap n() {
        final HashMap hashMap = new HashMap();
        final Iterator iterator = this.e().iterator();
        while (iterator.hasNext()) {
            final String name = ((File)iterator.next()).getName();
            final int n = (int)b(new File(this.d(), name), true);
            final long b = b(new File(new File(this.d(), name), String.valueOf(n)), true);
            if (this.j(n, name, b).exists()) {
                hashMap.put(name, b);
            }
        }
        return hashMap;
    }
}
