// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.play.core.assetpacks;

import java.io.SequenceInputStream;
import java.util.Collection;
import java.io.FileInputStream;
import java.util.Enumeration;
import eg.z0;
import java.util.Collections;
import eg.v;
import java.io.InputStream;
import java.util.Map;
import java.io.IOException;
import java.util.Iterator;
import java.util.ArrayList;
import java.io.File;
import java.util.TreeMap;
import ig.i0;

public final class d extends i0
{
    public final TreeMap f;
    
    public d(File file, final File file2) throws IOException {
        this.f = new TreeMap();
        final ArrayList a = p.a(file, file2);
        if (!a.isEmpty()) {
            final Iterator iterator = a.iterator();
            long n = 0L;
            while (iterator.hasNext()) {
                file = (File)iterator.next();
                this.f.put(n, file);
                n += file.length();
            }
            return;
        }
        throw new zzck(String.format("Virtualized slice archive empty for %s, %s", file, file2));
    }
    
    public final long b() {
        final Map.Entry<K, File> lastEntry = this.f.lastEntry();
        return lastEntry.getValue().length() + lastEntry.getKey();
    }
    
    public final void close() {
    }
    
    public final InputStream f(final long n, final long n2) throws IOException {
        if (n < 0L || n2 < 0L) {
            throw new zzck(String.format("Invalid input parameters %s, %s", n, n2));
        }
        final long n3 = n + n2;
        if (n3 > this.b()) {
            throw new zzck(String.format("Trying to access archive out of bounds. Archive ends at: %s. Tried accessing: %s", this.b(), n3));
        }
        final Long n4 = this.f.floorKey(n);
        final Long n5 = this.f.floorKey(n3);
        if (n4.equals(n5)) {
            return (InputStream)new v(this.h(n, n4), n2);
        }
        final ArrayList list = new ArrayList();
        list.add(this.h(n, n4));
        final Collection<Object> values = this.f.subMap(n4, false, n5, false).values();
        if (!values.isEmpty()) {
            list.add(new z0((Enumeration)Collections.enumeration(values)));
        }
        list.add(new v(new FileInputStream(this.f.get(n5)), n2 - (n5 - n)));
        return new SequenceInputStream((Enumeration<? extends InputStream>)Collections.enumeration((Collection<Object>)list));
    }
    
    public final FileInputStream h(final long n, final Long n2) throws IOException {
        final FileInputStream fileInputStream = new FileInputStream(this.f.get(n2));
        if (fileInputStream.skip(n - n2) == n - n2) {
            return fileInputStream;
        }
        throw new zzck(String.format("Virtualized slice archive corrupt, could not skip in file with key %s", n2));
    }
}
