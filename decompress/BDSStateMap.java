// 
// Decompiled by Procyon v0.6.0
// 

package org.bouncycastle.pqc.crypto.xmss;

import ok2.m;
import hm2.i;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Iterator;
import hm2.f;
import java.util.TreeMap;
import java.util.Map;
import java.io.Serializable;

public class BDSStateMap implements Serializable
{
    private static final long serialVersionUID = -3464451825208522308L;
    private final Map<Integer, BDS> bdsState;
    public transient long f;
    
    public BDSStateMap(final long f) {
        this.bdsState = new TreeMap<Integer, BDS>();
        this.f = f;
    }
    
    public BDSStateMap(final f f, final long n, final byte[] array, final byte[] array2) {
        this.bdsState = new TreeMap<Integer, BDS>();
        this.f = (1L << f.c) - 1L;
        for (long n2 = 0L; n2 < n; ++n2) {
            this.updateState(f, n2, array, array2);
        }
    }
    
    public BDSStateMap(final BDSStateMap bdsStateMap, final long f) {
        this.bdsState = new TreeMap<Integer, BDS>();
        for (final Integer n : bdsStateMap.bdsState.keySet()) {
            this.bdsState.put(n, new BDS(bdsStateMap.bdsState.get(n)));
        }
        this.f = f;
    }
    
    private void readObject(final ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        long long1;
        if (objectInputStream.available() != 0) {
            long1 = objectInputStream.readLong();
        }
        else {
            long1 = 0L;
        }
        this.f = long1;
    }
    
    private void writeObject(final ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(this.f);
    }
    
    public BDS get(final int n) {
        return this.bdsState.get(n);
    }
    
    public long getMaxIndex() {
        return this.f;
    }
    
    public boolean isEmpty() {
        return this.bdsState.isEmpty();
    }
    
    public void put(final int n, final BDS bds) {
        this.bdsState.put(n, bds);
    }
    
    public BDS update(final int n, final byte[] array, final byte[] array2, final c c) {
        return this.bdsState.put(n, this.bdsState.get(n).getNextState(array, array2, c));
    }
    
    public void updateState(final f f, final long n, final byte[] array, final byte[] array2) {
        final i b = f.b;
        final int b2 = b.b;
        long n2 = n >> b2;
        final long n3 = (1L << b2) - 1L;
        final int e = (int)(n & n3);
        final c$a c$a = ((e.a<c$a>)new c$a()).d(n2);
        c$a.e = e;
        final c c = new c(c$a);
        final int n4 = 1 << b2;
        final int n5 = n4 - 1;
        if (e < n5) {
            if (this.get(0) == null || e == 0) {
                this.put(0, new BDS(b, array, array2, c));
            }
            this.update(0, array, array2, c);
        }
        for (int i = 1; i < f.d; ++i) {
            final int e2 = (int)(n2 & n3);
            n2 >>= b2;
            final c$a c$a2 = ((e.a<c$a>)((e.a<c$a>)new c$a()).c(i)).d(n2);
            c$a2.e = e2;
            final c c2 = new c(c$a2);
            Label_0295: {
                if (this.bdsState.get(i) != null) {
                    boolean b3 = false;
                    Label_0257: {
                        if (n != 0L) {
                            if (n % (long)Math.pow(n4, i + 1) == 0L) {
                                b3 = true;
                                break Label_0257;
                            }
                        }
                        b3 = false;
                    }
                    if (!b3) {
                        break Label_0295;
                    }
                }
                this.bdsState.put(i, new BDS(b, array, array2, c2));
            }
            if (e2 < n5) {
                boolean b4 = false;
                Label_0339: {
                    if (n != 0L) {
                        if ((n + 1L) % (long)Math.pow(n4, i) == 0L) {
                            b4 = true;
                            break Label_0339;
                        }
                    }
                    b4 = false;
                }
                if (b4) {
                    this.update(i, array, array2, c2);
                }
            }
        }
    }
    
    public BDSStateMap withWOTSDigest(final m m) {
        final BDSStateMap bdsStateMap = new BDSStateMap(this.f);
        for (final Integer n : this.bdsState.keySet()) {
            bdsStateMap.bdsState.put(n, this.bdsState.get(n).withWOTSDigest(m));
        }
        return bdsStateMap;
    }
}
