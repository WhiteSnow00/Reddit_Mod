// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import kf2.n;
import kf2.m;
import kf2.l;
import kf2.k;
import kf2.j;
import kf2.i;
import kf2.h;
import kf2.c;
import java.util.Comparator;
import java.util.Set;
import java.util.concurrent.Callable;

public final class Functions
{
    public static final Functions.Functions$v a;
    public static final r b;
    public static final Functions.Functions$o c;
    public static final Functions.Functions$p d;
    public static final Functions.Functions$e0 e;
    public static final Functions.Functions$q f;
    public static final Functions.Functions$j0 g;
    public static final Functions.Functions$t h;
    public static final d0 i;
    public static final z j;
    public static final Functions.Functions$y k;
    
    static {
        a = new Functions.Functions$v();
        b = new r();
        c = new Functions.Functions$o();
        d = new Functions.Functions$p();
        e = new Functions.Functions$e0();
        f = new Functions.Functions$q();
        g = new Functions.Functions$j0();
        h = new Functions.Functions$t();
        i = new d0();
        j = new z();
        k = new Functions.Functions$y();
    }
    
    public static <T> Callable<Set<T>> a() {
        return (Callable<Set<T>>)HashSetCallable.INSTANCE;
    }
    
    public static <T> Comparator<T> b() {
        return (Comparator<T>)NaturalComparator.INSTANCE;
    }
    
    public static Functions.Functions$b c(final c c) {
        if (c != null) {
            return new Functions.Functions$b(c);
        }
        throw new NullPointerException("f is null");
    }
    
    public static Functions.Functions$c d(final h h) {
        if (h != null) {
            return new Functions.Functions$c(h);
        }
        throw new NullPointerException("f is null");
    }
    
    public static Functions.Functions$d e(final i i) {
        if (i != null) {
            return new Functions.Functions$d(i);
        }
        throw new NullPointerException("f is null");
    }
    
    public static Functions.Functions$e f(final kf2.j j) {
        if (j != null) {
            return new Functions.Functions$e(j);
        }
        throw new NullPointerException("f is null");
    }
    
    public static Functions.Functions$f g(final k k) {
        if (k != null) {
            return new Functions.Functions$f(k);
        }
        throw new NullPointerException("f is null");
    }
    
    public static Functions.Functions$g h(final l l) {
        if (l != null) {
            return new Functions.Functions$g(l);
        }
        throw new NullPointerException("f is null");
    }
    
    public static Functions.Functions$h i(final m m) {
        if (m != null) {
            return new Functions.Functions$h(m);
        }
        throw new NullPointerException("f is null");
    }
    
    public static Functions.Functions$i j(final n n) {
        if (n != null) {
            return new Functions.Functions$i(n);
        }
        throw new NullPointerException("f is null");
    }
    
    public enum HashSetCallable implements Callable<Set<Object>>
    {
        INSTANCE;
        
        @Override
        public Set<Object> call() throws Exception {
            return new HashSet<Object>();
        }
    }
    
    public enum NaturalComparator implements Comparator<Object>
    {
        INSTANCE;
        
        @Override
        public int compare(final Object o, final Object o2) {
            return ((Comparable)o).compareTo(o2);
        }
    }
    
    public static final class d0 implements Callable<Object>
    {
        @Override
        public final Object call() {
            return null;
        }
    }
    
    public static final class j<T> implements Callable<List<T>>
    {
        public final int f;
        
        public j(final int f) {
            this.f = f;
        }
        
        @Override
        public final Object call() throws Exception {
            return new ArrayList(this.f);
        }
    }
    
    public static final class r implements Runnable
    {
        @Override
        public final void run() {
        }
        
        @Override
        public final String toString() {
            return "EmptyRunnable";
        }
    }
    
    public static final class z implements Comparator<Object>
    {
        @Override
        public final int compare(final Object o, final Object o2) {
            return ((Comparable)o).compareTo(o2);
        }
    }
}
