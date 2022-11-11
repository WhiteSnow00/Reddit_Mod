// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide;

import com.bumptech.glide.load.data.e;
import java.util.Collections;
import u8.p$a$a;
import u8.n;
import com.bumptech.glide.load.ImageHeaderParser;
import f9.c$a;
import o8.h;
import f9.d$a;
import o8.i;
import u8.r;
import u8.r$b;
import u8.o;
import java.util.Iterator;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import z3.g;
import l9.a$c;
import z0.c1;
import s6.b;
import com.bumptech.glide.load.data.f;
import f9.d;
import f9.c;
import f9.a;
import u8.p;

public final class Registry
{
    public final p a;
    public final a b;
    public final c c;
    public final d d;
    public final f e;
    public final c9.c f;
    public final b g;
    public final c1 h;
    public final f9.b i;
    public final a$c j;
    
    public Registry() {
        this.h = new c1(5);
        this.i = new f9.b();
        final a$c j = new a$c(new g(20), (l9.a.b)new l9.b(), (l9.a.e)new l9.c());
        this.j = j;
        this.a = new p(j);
        this.b = new a();
        this.c = new c();
        this.d = new d();
        this.e = new f();
        this.f = new c9.c();
        this.g = new b(2);
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
                final r$b r$b = new r$b(clazz, clazz2, o);
                final ArrayList a3 = a2.a;
                a3.add(a3.size(), r$b);
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
        final b g = this.g;
        synchronized (g) {
            final List a = g.a;
            monitorexit(g);
            if (!a.isEmpty()) {
                return a;
            }
            throw new Registry.Registry$NoImageHeaderParserException();
        }
    }
    
    public final <Model> List<n<Model, ?>> e(final Model model) {
        p a = this.a;
        a.getClass();
        final Class<?> class1 = model.getClass();
        synchronized (a) {
            final p$a$a p$a$a = a.b.a.get(class1);
            List a2;
            if (p$a$a == null) {
                a2 = null;
            }
            else {
                a2 = p$a$a.a;
            }
            List<Object> unmodifiableList = a2;
            if (a2 == null) {
                unmodifiableList = Collections.unmodifiableList((List<?>)a.a.a((Class)class1));
                a.b.a((Class)class1, (List)unmodifiableList);
            }
            monitorexit(a);
            if (unmodifiableList.isEmpty()) {
                throw new Registry.Registry$NoModelLoaderAvailableException((Object)model);
            }
            final int size = unmodifiableList.size();
            Object emptyList = Collections.emptyList();
            int n = 1;
            int n3;
            for (int i = 0; i < size; ++i, emptyList = a, n = n3) {
                final n n2 = unmodifiableList.get(i);
                a = (p)emptyList;
                n3 = n;
                if (n2.handles((Object)model)) {
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
    
    public final void g(final e.a a) {
        final f e = this.e;
        synchronized (e) {
            e.a.put(a.a(), a);
        }
    }
    
    public final void h(final Class clazz, final Class clazz2, final c9.b b) {
        final c9.c f = this.f;
        synchronized (f) {
            f.a.add(new c9.c.a(clazz, clazz2, b));
        }
    }
    
    public final void i(final Class p0, final o p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/bumptech/glide/Registry.a:Lu8/p;
        //     4: astore_3       
        //     5: aload_3        
        //     6: monitorenter   
        //     7: aload_3        
        //     8: getfield        u8/p.a:Lu8/r;
        //    11: astore          4
        //    13: aload           4
        //    15: monitorenter   
        //    16: aload           4
        //    18: aload_1        
        //    19: invokevirtual   u8/r.e:(Ljava/lang/Class;)Ljava/util/ArrayList;
        //    22: astore          5
        //    24: aload           4
        //    26: monitorenter   
        //    27: new             Lu8/r$b;
        //    30: astore          6
        //    32: aload           6
        //    34: ldc_w           Lu8/f;.class
        //    37: aload_1        
        //    38: aload_2        
        //    39: invokespecial   u8/r$b.<init>:(Ljava/lang/Class;Ljava/lang/Class;Lu8/o;)V
        //    42: aload           4
        //    44: getfield        u8/r.a:Ljava/util/ArrayList;
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
        //    85: checkcast       Lu8/o;
        //    88: invokeinterface u8/o.teardown:()V
        //    93: goto            70
        //    96: aload_3        
        //    97: getfield        u8/p.b:Lu8/p$a;
        //   100: getfield        u8/p$a.a:Ljava/util/HashMap;
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
