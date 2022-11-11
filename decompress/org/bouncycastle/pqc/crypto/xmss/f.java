// 
// Decompiled by Procyon v0.6.0
// 

package org.bouncycastle.pqc.crypto.xmss;

import rm2.a;
import hm2.k;
import androidx.lifecycle.w;

public final class f
{
    public static XMSSNode a(final d d, final w w, final b b) {
        final int c = d.a.c;
        final byte[][] c2 = k.c((byte[][])w.g);
        final XMSSNode[] array = new XMSSNode[c2.length];
        for (int i = 0; i < c2.length; ++i) {
            array[i] = new XMSSNode(0, c2[i]);
        }
        final b$a b$a = ((e.a<b$a>)((e.a<b$a>)new b$a()).c(((e)b).a)).d(((e)b).b);
        b$a.e = b.e;
        b$a.f = 0;
        b$a.g = b.g;
        Object o = ((e.a)b$a).b(((e)b).d);
        int n = c;
        while (true) {
            final b$a b$a2 = (b$a)o;
            b$a2.getClass();
            b b2 = new b(b$a2);
            if (n <= 1) {
                break;
            }
            int g = 0;
            double n2;
            while (true) {
                n2 = n / 2;
                if (g >= (int)Math.floor(n2)) {
                    break;
                }
                final b$a b$a3 = ((e.a<b$a>)((e.a<b$a>)new b$a()).c(((e)b2).a)).d(((e)b2).b);
                b$a3.e = b2.e;
                b$a3.f = b2.f;
                b$a3.g = g;
                final b$a b$a4 = ((e.a<b$a>)b$a3).b(((e)b2).d);
                b$a4.getClass();
                b2 = new b(b$a4);
                final int n3 = g * 2;
                array[g] = b(d, array[n3], array[n3 + 1], (e)b2);
                ++g;
            }
            if (n % 2 == 1) {
                array[(int)Math.floor(n2)] = array[n - 1];
            }
            n = (int)Math.ceil(n / 2.0);
            final b$a b$a5 = ((e.a<b$a>)((e.a<b$a>)new b$a()).c(((e)b2).a)).d(((e)b2).b);
            b$a5.e = b2.e;
            b$a5.f = b2.f + 1;
            b$a5.g = b2.g;
            o = ((e.a<b$a>)b$a5).b(((e)b2).d);
        }
        return array[0];
    }
    
    public static XMSSNode b(final d d, final XMSSNode xmssNode, final XMSSNode xmssNode2, final e e) {
        if (xmssNode == null) {
            throw new NullPointerException("left == null");
        }
        if (xmssNode2 == null) {
            throw new NullPointerException("right == null");
        }
        if (xmssNode.getHeight() != xmssNode2.getHeight()) {
            throw new IllegalStateException("height of both nodes must be equal");
        }
        final byte[] a = rm2.a.a(d.d);
        final boolean b = e instanceof b;
        final int n = 0;
        Object o2 = null;
        Label_0223: {
            Object o;
            if (b) {
                final b b2 = (b)e;
                final b$a b$a = ((e.a<b$a>)((e.a<b$a>)new b$a()).c(((e)b2).a)).d(((e)b2).b);
                b$a.e = b2.e;
                b$a.f = b2.f;
                b$a.g = b2.g;
                final b$a b$a2 = ((e.a<b$a>)b$a).b(0);
                b$a2.getClass();
                o = new b(b$a2);
            }
            else {
                o2 = e;
                if (!(e instanceof org.bouncycastle.pqc.crypto.xmss.a)) {
                    break Label_0223;
                }
                final org.bouncycastle.pqc.crypto.xmss.a a2 = (org.bouncycastle.pqc.crypto.xmss.a)e;
                final a$a a$a = ((e.a<a$a>)((e.a<a$a>)new a$a()).c(((e)a2).a)).d(((e)a2).b);
                a$a.e = a2.e;
                a$a.f = a2.f;
                final a$a a$a2 = ((e.a<a$a>)a$a).b(0);
                a$a2.getClass();
                o = new org.bouncycastle.pqc.crypto.xmss.a(a$a2);
            }
            o2 = o;
        }
        final byte[] a3 = d.b.a(a, ((e)o2).a());
        Object o3;
        if (o2 instanceof b) {
            final b b3 = (b)o2;
            final b$a b$a3 = ((e.a<b$a>)((e.a<b$a>)new b$a()).c(((e)b3).a)).d(((e)b3).b);
            b$a3.e = b3.e;
            b$a3.f = b3.f;
            b$a3.g = b3.g;
            final b$a b$a4 = ((e.a<b$a>)b$a3).b(1);
            b$a4.getClass();
            o3 = new b(b$a4);
        }
        else {
            o3 = o2;
            if (o2 instanceof org.bouncycastle.pqc.crypto.xmss.a) {
                final org.bouncycastle.pqc.crypto.xmss.a a4 = (org.bouncycastle.pqc.crypto.xmss.a)o2;
                final a$a a$a3 = ((e.a<a$a>)((e.a<a$a>)new a$a()).c(((e)a4).a)).d(((e)a4).b);
                a$a3.e = a4.e;
                a$a3.f = a4.f;
                final a$a a$a4 = ((e.a<a$a>)a$a3).b(1);
                a$a4.getClass();
                o3 = new org.bouncycastle.pqc.crypto.xmss.a(a$a4);
            }
        }
        final byte[] a5 = d.b.a(a, ((e)o3).a());
        Object o5 = null;
        Label_0631: {
            Object o4;
            if (o3 instanceof b) {
                final b b4 = (b)o3;
                final b$a b$a5 = ((e.a<b$a>)((e.a<b$a>)new b$a()).c(((e)b4).a)).d(((e)b4).b);
                b$a5.e = b4.e;
                b$a5.f = b4.f;
                b$a5.g = b4.g;
                final b$a b$a6 = ((e.a<b$a>)b$a5).b(2);
                b$a6.getClass();
                o4 = new b(b$a6);
            }
            else {
                o5 = o3;
                if (!(o3 instanceof org.bouncycastle.pqc.crypto.xmss.a)) {
                    break Label_0631;
                }
                final org.bouncycastle.pqc.crypto.xmss.a a6 = (org.bouncycastle.pqc.crypto.xmss.a)o3;
                final a$a a$a5 = ((e.a<a$a>)((e.a<a$a>)new a$a()).c(((e)a6).a)).d(((e)a6).b);
                a$a5.e = a6.e;
                a$a5.f = a6.f;
                final a$a a$a6 = ((e.a<a$a>)a$a5).b(2);
                a$a6.getClass();
                o4 = new org.bouncycastle.pqc.crypto.xmss.a(a$a6);
            }
            o5 = o4;
        }
        final byte[] a7 = d.b.a(a, ((e)o5).a());
        final int a8 = d.a.a;
        final int n2 = a8 * 2;
        final byte[] array = new byte[n2];
        int n3 = 0;
        int i;
        while (true) {
            i = n;
            if (n3 >= a8) {
                break;
            }
            array[n3] = (byte)(xmssNode.getValue()[n3] ^ a5[n3]);
            ++n3;
        }
        while (i < a8) {
            array[i + a8] = (byte)(xmssNode2.getValue()[i] ^ a7[i]);
            ++i;
        }
        final a2.e b5 = d.b;
        b5.getClass();
        final int length = a3.length;
        final int g = b5.g;
        if (length != g) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (n2 == g * 2) {
            return new XMSSNode(xmssNode.getHeight(), b5.c(a3, 1, array));
        }
        throw new IllegalArgumentException("wrong in length");
    }
}
