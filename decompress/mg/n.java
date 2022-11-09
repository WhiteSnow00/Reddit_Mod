// 
// Decompiled by Procyon v0.6.0
// 

package mg;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.Enumeration;
import java.util.Collection;
import android.os.Build;
import java.util.HashSet;
import android.util.Log;
import java.util.zip.ZipEntry;
import java.util.Set;
import java.util.HashMap;
import java.util.zip.ZipFile;
import java.io.IOException;
import java.util.regex.Pattern;

public final class n
{
    public static final Pattern b;
    public final f a;
    
    static {
        b = Pattern.compile("lib/([^/]+)/(.*\\.so)$");
    }
    
    public n(final f a) throws IOException {
        this.a = a;
    }
    
    public static void b(final q ex, final k k) throws IOException {
        ZipFile zipFile2;
        try {
            final ZipFile zipFile = new ZipFile(((q)ex).a());
            try {
                final String b = ((q)ex).b();
                final HashMap<String, Set> hashMap = new HashMap<String, Set>();
                final Enumeration<? extends ZipEntry> entries = zipFile.entries();
                while (entries.hasMoreElements()) {
                    final ZipEntry zipEntry = (ZipEntry)entries.nextElement();
                    final Matcher matcher = n.b.matcher(zipEntry.getName());
                    if (matcher.matches()) {
                        final String group = matcher.group(1);
                        final String group2 = matcher.group(2);
                        Log.d("SplitCompat", String.format("NativeLibraryExtractor: split '%s' has native library '%s' for ABI '%s'", b, group2, group));
                        Set set;
                        if ((set = hashMap.get(group)) == null) {
                            set = new HashSet();
                            hashMap.put(group, set);
                        }
                        set.add(new m(zipEntry, group2));
                    }
                }
                final HashMap<String, m> hashMap2 = new HashMap<String, m>();
                for (final String s : Build.SUPPORTED_ABIS) {
                    if (hashMap.containsKey(s)) {
                        Log.d("SplitCompat", String.format("NativeLibraryExtractor: there are native libraries for supported ABI %s; will use this ABI", s));
                        for (final m m : hashMap.get(s)) {
                            if (hashMap2.containsKey(m.a)) {
                                Log.d("SplitCompat", String.format("NativeLibraryExtractor: skipping library %s for ABI %s; already present for a better ABI", m.a, s));
                            }
                            else {
                                hashMap2.put(m.a, m);
                                Log.d("SplitCompat", String.format("NativeLibraryExtractor: using library %s for ABI %s", m.a, s));
                            }
                        }
                    }
                    else {
                        Log.d("SplitCompat", String.format("NativeLibraryExtractor: there are no native libraries for supported ABI %s", s));
                    }
                }
                k.a(zipFile, new HashSet(hashMap2.values()));
                zipFile.close();
                return;
            }
            catch (final IOException ex) {
                zipFile2 = zipFile;
            }
        }
        catch (final IOException ex) {
            zipFile2 = null;
        }
        Label_0444: {
            if (zipFile2 == null) {
                break Label_0444;
            }
            try {
                zipFile2.close();
                throw ex;
            }
            catch (final IOException ex2) {
                throw ex;
            }
        }
    }
    
    public final HashSet a() throws IOException {
        Log.d("SplitCompat", "NativeLibraryExtractor: synchronizing native libraries");
        final HashSet b = this.a.b();
        final f a = this.a;
        a.getClass();
        final ArrayList list = new ArrayList();
        final File file = new File(a.h(), "native-libraries");
        f.f(file);
        final File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (final File file2 : listFiles) {
                if (file2.isDirectory()) {
                    list.add(file2.getName());
                }
            }
        }
    Label_0110:
        for (final String s : list) {
            final Iterator iterator2 = b.iterator();
            while (iterator2.hasNext()) {
                if (((q)iterator2.next()).b().equals(s)) {
                    continue Label_0110;
                }
            }
            Log.i("SplitCompat", String.format("NativeLibraryExtractor: extracted split '%s' has no corresponding split; deleting", s));
            final f a2 = this.a;
            a2.getClass();
            final File file3 = new File(a2.h(), "native-libraries");
            f.f(file3);
            final File e = f.e(file3, s);
            f.f(e);
            f.d(e);
        }
        final HashSet set = new HashSet();
        for (final q q : b) {
            final HashSet set2 = new HashSet();
            b(q, new i(this, set2, q));
            final f a3 = this.a;
            final String b2 = q.b();
            a3.getClass();
            final HashSet<File> set3 = new HashSet<File>();
            final File file4 = new File(a3.h(), "native-libraries");
            f.f(file4);
            final File e2 = f.e(file4, b2);
            f.f(e2);
            final File[] listFiles2 = e2.listFiles();
            if (listFiles2 != null) {
                for (final File file5 : listFiles2) {
                    if (file5.isFile()) {
                        set3.add(file5);
                    }
                }
            }
            for (final File file6 : set3) {
                if (!set2.contains(file6)) {
                    Log.i("SplitCompat", String.format("NativeLibraryExtractor: file '%s' found in split '%s' that is not in the split file '%s'; removing", file6.getAbsolutePath(), q.b(), q.a().getAbsolutePath()));
                    final f a4 = this.a;
                    a4.getClass();
                    final File parentFile = file6.getParentFile().getParentFile();
                    final File file7 = new File(a4.h(), "native-libraries");
                    f.f(file7);
                    if (!parentFile.equals(file7)) {
                        throw new IllegalStateException("File to remove is not a native library");
                    }
                    f.d(file6);
                }
            }
            set.addAll(set2);
        }
        return set;
    }
    
    public final void c(final q q, final HashSet set, final l l) throws IOException {
        for (final m m : set) {
            final f a = this.a;
            final String b = q.b();
            final String a2 = m.a;
            a.getClass();
            final File file = new File(a.h(), "native-libraries");
            f.f(file);
            final File e = f.e(file, b);
            f.f(e);
            final File e2 = f.e(e, a2);
            final boolean exists = e2.exists();
            boolean b2 = true;
            if (!exists || e2.length() != m.b.getSize() || !(e2.canWrite() ^ true)) {
                b2 = false;
            }
            l.a(m, e2, b2);
        }
    }
}
