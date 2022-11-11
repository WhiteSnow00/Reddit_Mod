// 
// Decompiled by Procyon v0.6.0
// 

package org.bouncycastle.pqc.crypto.xmss;

import java.util.Stack;
import java.io.Serializable;

class BDSTreeHash implements Serializable, Cloneable
{
    private static final long serialVersionUID = 1L;
    private boolean finished;
    private int height;
    private final int initialHeight;
    private boolean initialized;
    private int nextIndex;
    private XMSSNode tailNode;
    
    public BDSTreeHash(final int initialHeight) {
        this.initialHeight = initialHeight;
        this.initialized = false;
        this.finished = false;
    }
    
    public BDSTreeHash clone() {
        final BDSTreeHash bdsTreeHash = new BDSTreeHash(this.initialHeight);
        bdsTreeHash.tailNode = this.tailNode;
        bdsTreeHash.height = this.height;
        bdsTreeHash.nextIndex = this.nextIndex;
        bdsTreeHash.initialized = this.initialized;
        bdsTreeHash.finished = this.finished;
        return bdsTreeHash;
    }
    
    public int getHeight() {
        if (this.initialized && !this.finished) {
            return this.height;
        }
        return Integer.MAX_VALUE;
    }
    
    public int getIndexLeaf() {
        return this.nextIndex;
    }
    
    public XMSSNode getTailNode() {
        return this.tailNode;
    }
    
    public void initialize(final int nextIndex) {
        this.tailNode = null;
        this.height = this.initialHeight;
        this.nextIndex = nextIndex;
        this.initialized = true;
        this.finished = false;
    }
    
    public boolean isFinished() {
        return this.finished;
    }
    
    public boolean isInitialized() {
        return this.initialized;
    }
    
    public void setNode(final XMSSNode tailNode) {
        this.tailNode = tailNode;
        final int height = tailNode.getHeight();
        this.height = height;
        if (height == this.initialHeight) {
            this.finished = true;
        }
    }
    
    public void update(final Stack<XMSSNode> stack, final d d, final byte[] array, final byte[] array2, final c c) {
        if (c == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        if (!this.finished && this.initialized) {
            final c$a c$a = ((e.a<c$a>)((e.a<c$a>)new c$a()).c(((e)c).a)).d(((e)c).b);
            c$a.e = this.nextIndex;
            c$a.f = c.f;
            c$a.g = c.g;
            final c c2 = (c)((e.a<c$a>)c$a).b(((e)c).d).e();
            final b$a b$a = ((e.a<b$a>)((e.a<b$a>)new b$a()).c(((e)c2).a)).d(((e)c2).b);
            b$a.e = this.nextIndex;
            final b b = (b)b$a.e();
            final a$a a$a = ((e.a<a$a>)((e.a<a$a>)new a$a()).c(((e)c2).a)).d(((e)c2).b);
            a$a.f = this.nextIndex;
            final a a = (a)a$a.e();
            d.d(d.c(array2, c2), array);
            XMSSNode a2 = f.a(d, d.b(c2), b);
            Object o = a;
            while (!stack.isEmpty() && stack.peek().getHeight() == a2.getHeight() && stack.peek().getHeight() != this.initialHeight) {
                final a$a a$a2 = ((e.a<a$a>)((e.a<a$a>)new a$a()).c(((e)o).a)).d(((e)o).b);
                a$a2.e = ((a)o).e;
                a$a2.f = (((a)o).f - 1) / 2;
                final a a3 = (a)((e.a<a$a>)a$a2).b(((e)o).d).e();
                final XMSSNode b2 = f.b(d, stack.pop(), a2, (e)a3);
                a2 = new XMSSNode(b2.getHeight() + 1, b2.getValue());
                final a$a a$a3 = ((e.a<a$a>)((e.a<a$a>)new a$a()).c(((e)a3).a)).d(((e)a3).b);
                a$a3.e = a3.e + 1;
                a$a3.f = a3.f;
                o = ((e.a<a$a>)a$a3).b(((e)a3).d).e();
            }
            final XMSSNode tailNode = this.tailNode;
            if (tailNode == null) {
                this.tailNode = a2;
            }
            else if (tailNode.getHeight() == a2.getHeight()) {
                final a$a a$a4 = ((e.a<a$a>)((e.a<a$a>)new a$a()).c(((e)o).a)).d(((e)o).b);
                a$a4.e = ((a)o).e;
                a$a4.f = (((a)o).f - 1) / 2;
                final a a4 = (a)((e.a<a$a>)a$a4).b(((e)o).d).e();
                a2 = new XMSSNode(this.tailNode.getHeight() + 1, f.b(d, this.tailNode, a2, (e)a4).getValue());
                this.tailNode = a2;
                final a$a a$a5 = ((e.a<a$a>)((e.a<a$a>)new a$a()).c(((e)a4).a)).d(((e)a4).b);
                a$a5.e = a4.e + 1;
                a$a5.f = a4.f;
                ((e.a<a$a>)a$a5).b(((e)a4).d).e();
            }
            else {
                stack.push(a2);
            }
            if (this.tailNode.getHeight() == this.initialHeight) {
                this.finished = true;
            }
            else {
                this.height = a2.getHeight();
                ++this.nextIndex;
            }
            return;
        }
        throw new IllegalStateException("finished or not initialized");
    }
}
