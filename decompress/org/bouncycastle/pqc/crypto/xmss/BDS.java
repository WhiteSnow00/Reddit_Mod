// 
// Decompiled by Procyon v0.6.0
// 

package org.bouncycastle.pqc.crypto.xmss;

import hm2.k;
import androidx.lifecycle.w;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import hm2.e;
import ok2.m;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.Collection;
import java.util.ArrayList;
import hm2.i;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Map;
import java.util.List;
import java.io.Serializable;

public final class BDS implements Serializable
{
    private static final long serialVersionUID = 1L;
    private List<XMSSNode> authenticationPath;
    public transient d f;
    public transient int g;
    private int index;
    private int k;
    private Map<Integer, XMSSNode> keep;
    private Map<Integer, LinkedList<XMSSNode>> retain;
    private XMSSNode root;
    private Stack<XMSSNode> stack;
    private final List<BDSTreeHash> treeHashInstances;
    private final int treeHeight;
    private boolean used;
    
    public BDS(final i i, final int g, final int index) {
        this(new d(i.h), i.b, i.c, index);
        this.g = g;
        this.index = index;
        this.used = true;
    }
    
    public BDS(final i i, final byte[] array, final byte[] array2, final c c) {
        final d d = new d(i.h);
        final int b = i.b;
        this(d, b, i.c, (1 << b) - 1);
        this.a(array, array2, c);
    }
    
    public BDS(final i i, final byte[] array, final byte[] array2, final c c, final int n) {
        final d d = new d(i.h);
        final int b = i.b;
        this(d, b, i.c, (1 << b) - 1);
        this.a(array, array2, c);
        while (this.index < n) {
            this.b(array, array2, c);
            this.used = false;
        }
    }
    
    public BDS(final BDS bds) {
        this.f = new d(bds.f.a);
        this.treeHeight = bds.treeHeight;
        this.k = bds.k;
        this.root = bds.root;
        (this.authenticationPath = new ArrayList<XMSSNode>()).addAll(bds.authenticationPath);
        this.retain = new TreeMap<Integer, LinkedList<XMSSNode>>();
        for (final Integer n : bds.retain.keySet()) {
            this.retain.put(n, (LinkedList)bds.retain.get(n).clone());
        }
        (this.stack = new Stack<XMSSNode>()).addAll((Collection<?>)bds.stack);
        this.treeHashInstances = new ArrayList<BDSTreeHash>();
        final Iterator<BDSTreeHash> iterator2 = bds.treeHashInstances.iterator();
        while (iterator2.hasNext()) {
            this.treeHashInstances.add(iterator2.next().clone());
        }
        this.keep = new TreeMap<Integer, XMSSNode>(bds.keep);
        this.index = bds.index;
        this.g = bds.g;
        this.used = bds.used;
    }
    
    public BDS(final BDS bds, final int g, final m m) {
        this.f = new d(new e(m));
        this.treeHeight = bds.treeHeight;
        this.k = bds.k;
        this.root = bds.root;
        (this.authenticationPath = new ArrayList<XMSSNode>()).addAll(bds.authenticationPath);
        this.retain = new TreeMap<Integer, LinkedList<XMSSNode>>();
        for (final Integer n : bds.retain.keySet()) {
            this.retain.put(n, (LinkedList)bds.retain.get(n).clone());
        }
        (this.stack = new Stack<XMSSNode>()).addAll((Collection<?>)bds.stack);
        this.treeHashInstances = new ArrayList<BDSTreeHash>();
        final Iterator<BDSTreeHash> iterator2 = bds.treeHashInstances.iterator();
        while (iterator2.hasNext()) {
            this.treeHashInstances.add(iterator2.next().clone());
        }
        this.keep = new TreeMap<Integer, XMSSNode>(bds.keep);
        this.index = bds.index;
        this.g = g;
        this.used = bds.used;
        this.c();
    }
    
    public BDS(final BDS bds, final m m) {
        this.f = new d(new e(m));
        this.treeHeight = bds.treeHeight;
        this.k = bds.k;
        this.root = bds.root;
        (this.authenticationPath = new ArrayList<XMSSNode>()).addAll(bds.authenticationPath);
        this.retain = new TreeMap<Integer, LinkedList<XMSSNode>>();
        for (final Integer n : bds.retain.keySet()) {
            this.retain.put(n, (LinkedList)bds.retain.get(n).clone());
        }
        (this.stack = new Stack<XMSSNode>()).addAll((Collection<?>)bds.stack);
        this.treeHashInstances = new ArrayList<BDSTreeHash>();
        final Iterator<BDSTreeHash> iterator2 = bds.treeHashInstances.iterator();
        while (iterator2.hasNext()) {
            this.treeHashInstances.add(iterator2.next().clone());
        }
        this.keep = new TreeMap<Integer, XMSSNode>(bds.keep);
        this.index = bds.index;
        this.g = bds.g;
        this.used = bds.used;
        this.c();
    }
    
    public BDS(final BDS bds, final byte[] array, final byte[] array2, final c c) {
        this.f = new d(bds.f.a);
        this.treeHeight = bds.treeHeight;
        this.k = bds.k;
        this.root = bds.root;
        (this.authenticationPath = new ArrayList<XMSSNode>()).addAll(bds.authenticationPath);
        this.retain = new TreeMap<Integer, LinkedList<XMSSNode>>();
        for (final Integer n : bds.retain.keySet()) {
            this.retain.put(n, (LinkedList)bds.retain.get(n).clone());
        }
        (this.stack = new Stack<XMSSNode>()).addAll((Collection<?>)bds.stack);
        this.treeHashInstances = new ArrayList<BDSTreeHash>();
        final Iterator<BDSTreeHash> iterator2 = bds.treeHashInstances.iterator();
        while (iterator2.hasNext()) {
            this.treeHashInstances.add(iterator2.next().clone());
        }
        this.keep = new TreeMap<Integer, XMSSNode>(bds.keep);
        this.index = bds.index;
        this.g = bds.g;
        this.used = false;
        this.b(array, array2, c);
    }
    
    public BDS(final d f, int i, int k, final int g) {
        this.f = f;
        this.treeHeight = i;
        this.g = g;
        this.k = k;
        if (k <= i && k >= 2) {
            k = i - k;
            if (k % 2 == 0) {
                this.authenticationPath = new ArrayList<XMSSNode>();
                this.retain = new TreeMap<Integer, LinkedList<XMSSNode>>();
                this.stack = new Stack<XMSSNode>();
                this.treeHashInstances = new ArrayList<BDSTreeHash>();
                for (i = 0; i < k; ++i) {
                    this.treeHashInstances.add(new BDSTreeHash(i));
                }
                this.keep = new TreeMap<Integer, XMSSNode>();
                this.index = 0;
                this.used = false;
                return;
            }
        }
        throw new IllegalArgumentException("illegal value for BDS parameter k");
    }
    
    private void readObject(final ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int int1;
        if (objectInputStream.available() != 0) {
            int1 = objectInputStream.readInt();
        }
        else {
            int1 = (1 << this.treeHeight) - 1;
        }
        this.g = int1;
        final int g = this.g;
        if (g <= (1 << this.treeHeight) - 1 && this.index <= g + 1 && objectInputStream.available() == 0) {
            return;
        }
        throw new IOException("inconsistent BDS data detected");
    }
    
    private void writeObject(final ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.g);
    }
    
    public final void a(final byte[] array, final byte[] array2, final c c) {
        if (c != null) {
            b b = (b)((org.bouncycastle.pqc.crypto.xmss.e.a<b$a>)((org.bouncycastle.pqc.crypto.xmss.e.a<b$a>)new b$a()).c(((org.bouncycastle.pqc.crypto.xmss.e)c).a)).d(((org.bouncycastle.pqc.crypto.xmss.e)c).b).e();
            final a a = (a)((org.bouncycastle.pqc.crypto.xmss.e.a<a$a>)((org.bouncycastle.pqc.crypto.xmss.e.a<a$a>)new a$a()).c(((org.bouncycastle.pqc.crypto.xmss.e)c).a)).d(((org.bouncycastle.pqc.crypto.xmss.e)c).b).e();
            int i = 0;
            c c2 = c;
            Object o = a;
            while (i < 1 << this.treeHeight) {
                final c$a c$a = ((org.bouncycastle.pqc.crypto.xmss.e.a<c$a>)((org.bouncycastle.pqc.crypto.xmss.e.a<c$a>)new c$a()).c(((org.bouncycastle.pqc.crypto.xmss.e)c2).a)).d(((org.bouncycastle.pqc.crypto.xmss.e)c2).b);
                c$a.e = i;
                c$a.f = c2.f;
                c$a.g = c2.g;
                c2 = (c)((org.bouncycastle.pqc.crypto.xmss.e.a<c$a>)c$a).b(((org.bouncycastle.pqc.crypto.xmss.e)c2).d).e();
                final d f = this.f;
                f.d(f.c(array2, c2), array);
                final w b2 = this.f.b(c2);
                final b$a b$a = ((org.bouncycastle.pqc.crypto.xmss.e.a<b$a>)((org.bouncycastle.pqc.crypto.xmss.e.a<b$a>)new b$a()).c(((org.bouncycastle.pqc.crypto.xmss.e)b).a)).d(((org.bouncycastle.pqc.crypto.xmss.e)b).b);
                b$a.e = i;
                b$a.f = b.f;
                b$a.g = b.g;
                final b b3 = (b)((org.bouncycastle.pqc.crypto.xmss.e.a<b$a>)b$a).b(((org.bouncycastle.pqc.crypto.xmss.e)b).d).e();
                XMSSNode a2 = org.bouncycastle.pqc.crypto.xmss.f.a(this.f, b2, b3);
                final a$a a$a = ((org.bouncycastle.pqc.crypto.xmss.e.a<a$a>)((org.bouncycastle.pqc.crypto.xmss.e.a<a$a>)new a$a()).c(((org.bouncycastle.pqc.crypto.xmss.e)o).a)).d(((org.bouncycastle.pqc.crypto.xmss.e)o).b);
                a$a.f = i;
                o = ((org.bouncycastle.pqc.crypto.xmss.e.a<a$a>)a$a).b(((org.bouncycastle.pqc.crypto.xmss.e)o).d).e();
                while (!this.stack.isEmpty() && this.stack.peek().getHeight() == a2.getHeight()) {
                    final int n = i / (1 << a2.getHeight());
                    if (n == 1) {
                        this.authenticationPath.add(a2);
                    }
                    if (n == 3 && a2.getHeight() < this.treeHeight - this.k) {
                        this.treeHashInstances.get(a2.getHeight()).setNode(a2);
                    }
                    if (n >= 3 && (n & 0x1) == 0x1 && a2.getHeight() >= this.treeHeight - this.k && a2.getHeight() <= this.treeHeight - 2) {
                        if (this.retain.get(a2.getHeight()) == null) {
                            final LinkedList<XMSSNode> list = new LinkedList<XMSSNode>();
                            list.add(a2);
                            this.retain.put(a2.getHeight(), list);
                        }
                        else {
                            this.retain.get(a2.getHeight()).add(a2);
                        }
                    }
                    final a$a a$a2 = ((org.bouncycastle.pqc.crypto.xmss.e.a<a$a>)((org.bouncycastle.pqc.crypto.xmss.e.a<a$a>)new a$a()).c(((org.bouncycastle.pqc.crypto.xmss.e)o).a)).d(((org.bouncycastle.pqc.crypto.xmss.e)o).b);
                    a$a2.e = ((a)o).e;
                    a$a2.f = (((a)o).f - 1) / 2;
                    final a a3 = (a)((org.bouncycastle.pqc.crypto.xmss.e.a<a$a>)a$a2).b(((org.bouncycastle.pqc.crypto.xmss.e)o).d).e();
                    final XMSSNode b4 = org.bouncycastle.pqc.crypto.xmss.f.b(this.f, this.stack.pop(), a2, (org.bouncycastle.pqc.crypto.xmss.e)a3);
                    a2 = new XMSSNode(b4.getHeight() + 1, b4.getValue());
                    final a$a a$a3 = ((org.bouncycastle.pqc.crypto.xmss.e.a<a$a>)((org.bouncycastle.pqc.crypto.xmss.e.a<a$a>)new a$a()).c(((org.bouncycastle.pqc.crypto.xmss.e)a3).a)).d(((org.bouncycastle.pqc.crypto.xmss.e)a3).b);
                    a$a3.e = a3.e + 1;
                    a$a3.f = a3.f;
                    o = ((org.bouncycastle.pqc.crypto.xmss.e.a<a$a>)a$a3).b(((org.bouncycastle.pqc.crypto.xmss.e)a3).d).e();
                }
                this.stack.push(a2);
                ++i;
                b = b3;
            }
            this.root = this.stack.pop();
            return;
        }
        throw new NullPointerException("otsHashAddress == null");
    }
    
    public final void b(final byte[] array, final byte[] array2, final c c) {
        if (c == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        if (this.used) {
            throw new IllegalStateException("index already used");
        }
        final int index = this.index;
        if (index <= this.g - 1) {
            final int treeHeight = this.treeHeight;
            final int n = 0;
            while (true) {
                for (int i = 0; i < treeHeight; ++i) {
                    if ((index >> i & 0x1) == 0x0) {
                        if ((this.index >> i + 1 & 0x1) == 0x0 && i < this.treeHeight - 1) {
                            this.keep.put(i, this.authenticationPath.get(i));
                        }
                        final b b = (b)((org.bouncycastle.pqc.crypto.xmss.e.a<b$a>)((org.bouncycastle.pqc.crypto.xmss.e.a<b$a>)new b$a()).c(((org.bouncycastle.pqc.crypto.xmss.e)c).a)).d(((org.bouncycastle.pqc.crypto.xmss.e)c).b).e();
                        final a a = (a)((org.bouncycastle.pqc.crypto.xmss.e.a<a$a>)((org.bouncycastle.pqc.crypto.xmss.e.a<a$a>)new a$a()).c(((org.bouncycastle.pqc.crypto.xmss.e)c).a)).d(((org.bouncycastle.pqc.crypto.xmss.e)c).b).e();
                        c c2;
                        int j;
                        if (i == 0) {
                            final c$a c$a = ((org.bouncycastle.pqc.crypto.xmss.e.a<c$a>)((org.bouncycastle.pqc.crypto.xmss.e.a<c$a>)new c$a()).c(((org.bouncycastle.pqc.crypto.xmss.e)c).a)).d(((org.bouncycastle.pqc.crypto.xmss.e)c).b);
                            c$a.e = this.index;
                            c$a.f = c.f;
                            c$a.g = c.g;
                            c2 = (c)((org.bouncycastle.pqc.crypto.xmss.e.a<c$a>)c$a).b(((org.bouncycastle.pqc.crypto.xmss.e)c).d).e();
                            final d f = this.f;
                            f.d(f.c(array2, c2), array);
                            final w b2 = this.f.b(c2);
                            final b$a b$a = ((org.bouncycastle.pqc.crypto.xmss.e.a<b$a>)((org.bouncycastle.pqc.crypto.xmss.e.a<b$a>)new b$a()).c(((org.bouncycastle.pqc.crypto.xmss.e)b).a)).d(((org.bouncycastle.pqc.crypto.xmss.e)b).b);
                            b$a.e = this.index;
                            b$a.f = b.f;
                            b$a.g = b.g;
                            this.authenticationPath.set(0, org.bouncycastle.pqc.crypto.xmss.f.a(this.f, b2, (b)((org.bouncycastle.pqc.crypto.xmss.e.a<b$a>)b$a).b(((org.bouncycastle.pqc.crypto.xmss.e)b).d).e()));
                            j = n;
                        }
                        else {
                            final a$a a$a = ((org.bouncycastle.pqc.crypto.xmss.e.a<a$a>)((org.bouncycastle.pqc.crypto.xmss.e.a<a$a>)new a$a()).c(((org.bouncycastle.pqc.crypto.xmss.e)a).a)).d(((org.bouncycastle.pqc.crypto.xmss.e)a).b);
                            final int e = i - 1;
                            a$a.e = e;
                            a$a.f = this.index >> i;
                            final a a2 = (a)((org.bouncycastle.pqc.crypto.xmss.e.a<a$a>)a$a).b(((org.bouncycastle.pqc.crypto.xmss.e)a).d).e();
                            final d f2 = this.f;
                            f2.d(f2.c(array2, c), array);
                            final XMSSNode b3 = org.bouncycastle.pqc.crypto.xmss.f.b(this.f, this.authenticationPath.get(e), this.keep.get(e), (org.bouncycastle.pqc.crypto.xmss.e)a2);
                            this.authenticationPath.set(i, new XMSSNode(b3.getHeight() + 1, b3.getValue()));
                            this.keep.remove(e);
                            for (int k = 0; k < i; ++k) {
                                List<XMSSNode> list;
                                XMSSNode xmssNode;
                                if (k < this.treeHeight - this.k) {
                                    list = this.authenticationPath;
                                    xmssNode = this.treeHashInstances.get(k).getTailNode();
                                }
                                else {
                                    list = this.authenticationPath;
                                    xmssNode = this.retain.get(k).removeFirst();
                                }
                                list.set(k, xmssNode);
                            }
                            final int min = Math.min(i, this.treeHeight - this.k);
                            int n2 = 0;
                            while (true) {
                                j = n;
                                c2 = c;
                                if (n2 >= min) {
                                    break;
                                }
                                final int n3 = (1 << n2) * 3 + (this.index + 1);
                                if (n3 < 1 << this.treeHeight) {
                                    this.treeHashInstances.get(n2).initialize(n3);
                                }
                                ++n2;
                            }
                        }
                        while (j < this.treeHeight - this.k >> 1) {
                            final Iterator<BDSTreeHash> iterator = this.treeHashInstances.iterator();
                            BDSTreeHash bdsTreeHash = null;
                            while (iterator.hasNext()) {
                                final BDSTreeHash bdsTreeHash2 = iterator.next();
                                if (!bdsTreeHash2.isFinished()) {
                                    if (!bdsTreeHash2.isInitialized()) {
                                        continue;
                                    }
                                    if (bdsTreeHash != null) {
                                        if (bdsTreeHash2.getHeight() >= bdsTreeHash.getHeight()) {
                                            if (bdsTreeHash2.getHeight() != bdsTreeHash.getHeight() || bdsTreeHash2.getIndexLeaf() >= bdsTreeHash.getIndexLeaf()) {
                                                continue;
                                            }
                                        }
                                    }
                                    bdsTreeHash = bdsTreeHash2;
                                }
                            }
                            if (bdsTreeHash != null) {
                                bdsTreeHash.update(this.stack, this.f, array, array2, c2);
                            }
                            ++j;
                        }
                        ++this.index;
                        return;
                    }
                }
                int i = 0;
                continue;
            }
        }
        throw new IllegalStateException("index out of bounds");
    }
    
    public final void c() {
        if (this.authenticationPath == null) {
            throw new IllegalStateException("authenticationPath == null");
        }
        if (this.retain == null) {
            throw new IllegalStateException("retain == null");
        }
        if (this.stack == null) {
            throw new IllegalStateException("stack == null");
        }
        if (this.treeHashInstances == null) {
            throw new IllegalStateException("treeHashInstances == null");
        }
        if (this.keep == null) {
            throw new IllegalStateException("keep == null");
        }
        if (hm2.k.h(this.treeHeight, (long)this.index)) {
            return;
        }
        throw new IllegalStateException("index in BDS state out of bounds");
    }
    
    public List<XMSSNode> getAuthenticationPath() {
        final ArrayList list = new ArrayList();
        final Iterator<XMSSNode> iterator = this.authenticationPath.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
        return list;
    }
    
    public int getIndex() {
        return this.index;
    }
    
    public int getMaxIndex() {
        return this.g;
    }
    
    public BDS getNextState(final byte[] array, final byte[] array2, final c c) {
        return new BDS(this, array, array2, c);
    }
    
    public XMSSNode getRoot() {
        return this.root;
    }
    
    public int getTreeHeight() {
        return this.treeHeight;
    }
    
    public boolean isUsed() {
        return this.used;
    }
    
    public void markUsed() {
        this.used = true;
    }
    
    public BDS withMaxIndex(final int n, final m m) {
        return new BDS(this, n, m);
    }
    
    public BDS withWOTSDigest(final m m) {
        return new BDS(this, m);
    }
}
