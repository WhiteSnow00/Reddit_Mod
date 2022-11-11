// 
// Decompiled by Procyon v0.6.0
// 

package zc;

import java.util.Iterator;
import java.util.Set;
import java.io.DataOutputStream;
import java.util.Map;
import java.util.Arrays;
import ad.c0;
import java.io.IOException;
import al0.f0;
import java.io.DataInputStream;
import java.io.File;
import ya.c;
import android.util.SparseBooleanArray;
import android.util.SparseArray;
import java.util.HashMap;

public final class g
{
    public final HashMap<String, f> a;
    public final SparseArray<String> b;
    public final SparseBooleanArray c;
    public final SparseBooleanArray d;
    public c e;
    public c f;
    
    public g(final ya.c c, final File file) {
        this.a = new HashMap<String, f>();
        this.b = (SparseArray<String>)new SparseArray();
        this.c = new SparseBooleanArray();
        this.d = new SparseBooleanArray();
        final g.g$a e = new g.g$a(c);
        final g.g$b f = new g.g$b(new File(file, "cached_content_index.exi"));
        this.e = (c)e;
        this.f = (c)f;
    }
    
    public static j a(final DataInputStream dataInputStream) throws IOException {
        final int int1 = dataInputStream.readInt();
        final HashMap hashMap = new HashMap();
        for (int i = 0; i < int1; ++i) {
            final String utf = dataInputStream.readUTF();
            final int int2 = dataInputStream.readInt();
            if (int2 < 0) {
                throw new IOException(f0.f(31, "Invalid value size: ", int2));
            }
            int n = Math.min(int2, 10485760);
            byte[] array = c0.f;
            int n2;
            for (int j = 0; j != int2; j = n2) {
                n2 = j + n;
                array = Arrays.copyOf(array, n2);
                dataInputStream.readFully(array, j, n);
                n = Math.min(int2 - n2, 10485760);
            }
            hashMap.put(utf, array);
        }
        return new j((Map)hashMap);
    }
    
    public static void b(final j j, final DataOutputStream dataOutputStream) throws IOException {
        final Set entrySet = j.b.entrySet();
        dataOutputStream.writeInt(entrySet.size());
        for (final Map.Entry<String, V> entry : entrySet) {
            dataOutputStream.writeUTF(entry.getKey());
            final byte[] array = (Object)entry.getValue();
            dataOutputStream.writeInt(array.length);
            dataOutputStream.write(array);
        }
    }
    
    public final f c(final String s) {
        return this.a.get(s);
    }
    
    public final f d(final String s) {
        f f;
        if ((f = this.a.get(s)) == null) {
            final SparseArray<String> b = this.b;
            final int size = b.size();
            final int n = 0;
            int n2;
            if (size == 0) {
                n2 = 0;
            }
            else {
                n2 = b.keyAt(size - 1) + 1;
            }
            int n3 = n2;
            if (n2 < 0) {
                int n4;
                for (n4 = n; n4 < size && n4 == b.keyAt(n4); ++n4) {}
                n3 = n4;
            }
            f = new f(n3, s, j.c);
            this.a.put(s, f);
            this.b.put(n3, (Object)s);
            this.d.put(n3, true);
            this.e.d(f);
        }
        return f;
    }
    
    public final void e(final long n) throws IOException {
        this.e.a(n);
        final c f = this.f;
        if (f != null) {
            f.a(n);
        }
        Label_0106: {
            if (!this.e.exists()) {
                final c f2 = this.f;
                if (f2 != null && f2.exists()) {
                    this.f.f(this.a, this.b);
                    this.e.c(this.a);
                    break Label_0106;
                }
            }
            this.e.f(this.a, this.b);
        }
        final c f3 = this.f;
        if (f3 != null) {
            f3.delete();
            this.f = null;
        }
    }
    
    public final void f(final String s) {
        final f f = this.a.get(s);
        if (f != null && f.c.isEmpty() && f.d.isEmpty()) {
            this.a.remove(s);
            final int a = f.a;
            final boolean value = this.d.get(a);
            this.e.b(f, value);
            if (value) {
                this.b.remove(a);
                this.d.delete(a);
            }
            else {
                this.b.put(a, (Object)null);
                this.c.put(a, true);
            }
        }
    }
    
    public final void g() throws IOException {
        this.e.e(this.a);
        for (int size = this.c.size(), i = 0; i < size; ++i) {
            this.b.remove(this.c.keyAt(i));
        }
        this.c.clear();
        this.d.clear();
    }
    
    public interface c
    {
        void a(final long p0);
        
        void b(final f p0, final boolean p1);
        
        void c(final HashMap<String, f> p0) throws IOException;
        
        void d(final f p0);
        
        void delete() throws IOException;
        
        void e(final HashMap<String, f> p0) throws IOException;
        
        boolean exists() throws IOException;
        
        void f(final HashMap<String, f> p0, final SparseArray<String> p1) throws IOException;
    }
}
