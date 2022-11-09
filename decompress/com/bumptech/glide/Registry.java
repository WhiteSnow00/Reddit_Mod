// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide;

import com.bumptech.glide.load.data.e$a;
import java.util.Collections;
import v8.n;
import com.bumptech.glide.load.ImageHeaderParser;
import g9.c$a;
import p8.h;
import g9.d$a;
import p8.i;
import v8.r;
import v8.o;
import java.util.Iterator;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import z3.g;
import g9.b;
import z0.c1;
import com.bumptech.glide.load.data.f;
import g9.d;
import g9.c;
import g9.a;
import v8.p;

public final class Registry
{
    public final p a;
    public final a b;
    public final c c;
    public final d d;
    public final f e;
    public final d9.d f;
    public final oc.d g;
    public final c1 h;
    public final b i;
    public final m9.a.c j;
    
    public Registry() {
        this.h = new c1(5);
        this.i = new b();
        final m9.a.c j = new m9.a.c(new g(20), new m9.b(), new m9.c());
        this.j = j;
        this.a = new p(j);
        this.b = new a();
        this.c = new c();
        this.d = new d();
        this.e = new f();
        this.f = new d9.d();
        this.g = new oc.d(2);
        final List<String> list = Arrays.asList("Gif", "Bitmap", "BitmapDrawable");
        final ArrayList list2 = new ArrayList<String>(list.size());
        list2.add("legacy_prepend_all");
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add((String)iterator.next());
        }
        list2.add("legacy_append");
        final c c = this.c;
        synchronized (c) {
            final ArrayList list3 = new ArrayList(c.a);
            c.a.clear();
            final Iterator<String> iterator2 = list2.iterator();
            while (iterator2.hasNext()) {
                c.a.add(iterator2.next());
            }
            for (final String s : list3) {
                if (!list2.contains(s)) {
                    c.a.add(s);
                }
            }
        }
    }
    
    public final void a(final Class clazz, final Class clazz2, final o o) {
        final p a = this.a;
        synchronized (a) {
            final r a2 = a.a;
            synchronized (a2) {
                final r.b b = new r.b(clazz, clazz2, o);
                final ArrayList a3 = a2.a;
                a3.add(a3.size(), b);
                monitorexit(a2);
                a.b.a.clear();
            }
        }
    }
    
    public final void b(final Class clazz, final i i) {
        final d d = this.d;
        synchronized (d) {
            d.a.add(new d$a(clazz, i));
        }
    }
    
    public final void c(final h h, final Class clazz, final Class clazz2, final String s) {
        final c c = this.c;
        synchronized (c) {
            c.a(s).add(new c$a(clazz, clazz2, h));
        }
    }
    
    public final List<ImageHeaderParser> d() {
        final oc.d g = this.g;
        synchronized (g) {
            final List f = g.f;
            monitorexit(g);
            if (!f.isEmpty()) {
                return f;
            }
            throw new Registry.Registry$NoImageHeaderParserException();
        }
    }
    
    public final <Model> List<n<Model, ?>> e(final Model model) {
        p a = this.a;
        a.getClass();
        final Class<?> class1 = model.getClass();
        synchronized (a) {
            final p.a.a a2 = (p.a.a)a.b.a.get(class1);
            List<n<Model, ?>> a3;
            if (a2 == null) {
                a3 = null;
            }
            else {
                a3 = a2.a;
            }
            Object unmodifiableList = a3;
            if (a3 == null) {
                unmodifiableList = Collections.unmodifiableList((List<?>)a.a.a(class1));
                a.b.a((Class<Object>)class1, (List<n<Object, ?>>)unmodifiableList);
            }
            monitorexit(a);
            if (((List)unmodifiableList).isEmpty()) {
                throw new Registry.Registry$NoModelLoaderAvailableException((Object)model);
            }
            final int size = ((List)unmodifiableList).size();
            Object emptyList = Collections.emptyList();
            int n = 1;
            int n3;
            for (int i = 0; i < size; ++i, emptyList = a, n = n3) {
                final n n2 = ((List<n>)unmodifiableList).get(i);
                a = (p)emptyList;
                n3 = n;
                if (n2.handles(model)) {
                    if ((n3 = n) != 0) {
                        emptyList = new ArrayList<n>(size - i);
                        n3 = 0;
                    }
                    ((List)emptyList).add(n2);
                    a = (p)emptyList;
                }
            }
            if (!((List)a).isEmpty()) {
                return (List<n<Model, ?>>)a;
            }
            throw new Registry.Registry$NoModelLoaderAvailableException((Object)model, (List)unmodifiableList);
        }
    }
    
    public final void f(final h h, final Class clazz, final Class clazz2, final String s) {
        final c c = this.c;
        synchronized (c) {
            c.a(s).add(0, new c$a(clazz, clazz2, h));
        }
    }
    
    public final void g(final e$a e$a) {
        final f e = this.e;
        synchronized (e) {
            e.a.put(e$a.a(), e$a);
        }
    }
    
    public final void h(final Class clazz, final Class clazz2, final d9.c c) {
        final d9.d f = this.f;
        synchronized (f) {
            f.a.add(new d9.d$a(clazz, clazz2, c));
        }
    }
    
    public final void i(final Class p0, final o p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/bumptech/glide/Registry.a:Lv8/p;
        //     4: astore_3       
        //     5: aload_3        
        //     6: monitorenter   
        //     7: aload_3        
        //     8: getfield        v8/p.a:Lv8/r;
        //    11: astore          4
        //    13: aload           4
        //    15: monitorenter   
        //    16: aload           4
        //    18: aload_1        
        //    19: invokevirtual   v8/r.e:(Ljava/lang/Class;)Ljava/util/ArrayList;
        //    22: astore          5
        //    24: aload           4
        //    26: monitorenter   
        //    27: new             Lv8/r$b;
        //    30: astore          6
        //    32: aload           6
        //    34: ldc_w           Lv8/f;.class
        //    37: aload_1        
        //    38: aload_2        
        //    39: invokespecial   v8/r$b.<init>:(Ljava/lang/Class;Ljava/lang/Class;Lv8/o;)V
        //    42: aload           4
        //    44: getfield        v8/r.a:Ljava/util/ArrayList;
        //    47: astore_1       
        //    48: aload_1        
        //    49: aload_1        
        //    50: invokevirtual   java/util/ArrayList.size:()I
        //    53: aload           6
        //    55: invokevirtual   java/util/ArrayList.add:(ILjava/lang/Object;)V
        //    58: aload           4
        //    60: monitorexit    
        //    61: aload           4
        //    63: monitorexit    
        //    64: aload           5
        //    66: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //    69: astore_1       
        //    70: aload_1        
        //    71: invokeinterface java/util/Iterator.hasNext:()Z
        //    76: ifeq            96
        //    79: aload_1        
        //    80: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    85: checkcast       Lv8/o;
        //    88: invokeinterface v8/o.teardown:()V
        //    93: goto            70
        //    96: aload_3        
        //    97: getfield        v8/p.b:Lv8/p$a;
        //   100: getfield        v8/p$a.a:Ljava/util/HashMap;
        //   103: invokevirtual   java/util/HashMap.clear:()V
        //   106: aload_3        
        //   107: monitorexit    
        //   108: return         
        //   109: astore_1       
        //   110: goto            119
        //   113: astore_1       
        //   114: aload           4
        //   116: monitorexit    
        //   117: aload_1        
        //   118: athrow         
        //   119: aload           4
        //   121: monitorexit    
        //   122: aload_1        
        //   123: athrow         
        //   124: astore_1       
        //   125: aload_3        
        //   126: monitorexit    
        //   127: aload_1        
        //   128: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  7      16     124    129    Any
        //  16     27     109    113    Any
        //  27     58     113    119    Any
        //  58     61     109    113    Any
        //  61     70     124    129    Any
        //  70     93     124    129    Any
        //  96     106    124    129    Any
        //  114    119    109    113    Any
        //  119    124    124    129    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0070:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static class MissingComponentException extends RuntimeException
    {
        public MissingComponentException(final String s) {
            super(s);
        }
    }
}
