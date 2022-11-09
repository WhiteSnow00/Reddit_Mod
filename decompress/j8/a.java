// 
// Decompiled by Procyon v0.6.0
// 

package j8;

import java.util.Map;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import ak0.m;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.io.PrintStream;
import android.os.StrictMode$ThreadPolicy;
import a4.u;
import android.os.StrictMode$ThreadPolicy$Builder;
import android.os.StrictMode;
import android.os.Build$VERSION;
import java.io.IOException;
import java.io.Writer;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.LinkedHashMap;
import java.io.BufferedWriter;
import java.io.File;
import java.io.Closeable;

public final class a implements Closeable
{
    public final File f;
    public final File g;
    public final File h;
    public final File i;
    public final int j;
    public long k;
    public final int l;
    public long m;
    public BufferedWriter n;
    public final LinkedHashMap<String, d> o;
    public int p;
    public long q;
    public final ThreadPoolExecutor r;
    public final a$a s;
    
    public a(final File f, final long k) {
        this.m = 0L;
        this.o = new LinkedHashMap<String, d>(0, 0.75f, true);
        this.q = 0L;
        this.r = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), new b());
        this.s = new Callable<Void>() {
            @Override
            public final Object call() throws Exception {
                synchronized (a.this) {
                    final a f = a.this;
                    if (f.n == null) {
                        monitorexit(a.this);
                    }
                    else {
                        f.y();
                        if (a.this.q()) {
                            a.this.w();
                            a.this.p = 0;
                        }
                    }
                    return null;
                }
            }
        };
        this.f = f;
        this.j = 1;
        this.g = new File(f, "journal");
        this.h = new File(f, "journal.tmp");
        this.i = new File(f, "journal.bkp");
        this.l = 1;
        this.k = k;
    }
    
    public static void a(final a a, final c c, final boolean b) throws IOException {
        synchronized (a) {
            final d a2 = c.a;
            if (a2.f == c) {
                int i;
                final int n = i = 0;
                if (b) {
                    i = n;
                    if (!a2.e) {
                        int n2 = 0;
                        while (true) {
                            i = n;
                            if (n2 >= a.l) {
                                break;
                            }
                            if (!c.b[n2]) {
                                c.a();
                                final StringBuilder sb = new StringBuilder();
                                sb.append("Newly created entry didn't create value for index ");
                                sb.append(n2);
                                throw new IllegalStateException(sb.toString());
                            }
                            if (!a2.d[n2].exists()) {
                                c.a();
                                monitorexit(a);
                                return;
                            }
                            ++n2;
                        }
                    }
                }
                while (i < a.l) {
                    final File file = a2.d[i];
                    if (b) {
                        if (file.exists()) {
                            final File file2 = a2.c[i];
                            file.renameTo(file2);
                            final long n3 = a2.b[i];
                            final long length = file2.length();
                            a2.b[i] = length;
                            a.m = a.m - n3 + length;
                        }
                    }
                    else {
                        f(file);
                    }
                    ++i;
                }
                ++a.p;
                a2.f = null;
                if (a2.e | b) {
                    a2.e = true;
                    a.n.append((CharSequence)"CLEAN");
                    a.n.append(' ');
                    a.n.append((CharSequence)a2.a);
                    a.n.append((CharSequence)a2.a());
                    a.n.append('\n');
                    if (b) {
                        ++a.q;
                        a2.getClass();
                    }
                }
                else {
                    a.o.remove(a2.a);
                    a.n.append((CharSequence)"REMOVE");
                    a.n.append(' ');
                    a.n.append((CharSequence)a2.a);
                    a.n.append('\n');
                }
                k(a.n);
                if (a.m > a.k || a.q()) {
                    a.r.submit((Callable<Object>)a.s);
                }
                return;
            }
            throw new IllegalStateException();
        }
    }
    
    public static void b(final Writer writer) throws IOException {
        if (Build$VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        final StrictMode$ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(u.c(new StrictMode$ThreadPolicy$Builder(threadPolicy)).build());
        try {
            writer.close();
        }
        finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
    
    public static void f(final File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }
    
    public static void k(final Writer writer) throws IOException {
        if (Build$VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        final StrictMode$ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(u.c(new StrictMode$ThreadPolicy$Builder(threadPolicy)).build());
        try {
            writer.flush();
        }
        finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
    
    public static a r(final File file, final long n) throws IOException {
        if (n > 0L) {
            final File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                final File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                }
                else {
                    x(file2, file3, false);
                }
            }
            final a a = new a(file, n);
            if (a.g.exists()) {
                try {
                    a.t();
                    a.s();
                    return a;
                }
                catch (final IOException ex) {
                    final PrintStream out = System.out;
                    final StringBuilder sb = new StringBuilder();
                    sb.append("DiskLruCache ");
                    sb.append(file);
                    sb.append(" is corrupt: ");
                    sb.append(ex.getMessage());
                    sb.append(", removing");
                    out.println(sb.toString());
                    a.close();
                    j8.c.a(a.f);
                }
            }
            file.mkdirs();
            final a a2 = new a(file, n);
            a2.w();
            return a2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }
    
    public static void x(final File file, final File file2, final boolean b) throws IOException {
        if (b) {
            f(file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        throw new IOException();
    }
    
    @Override
    public final void close() throws IOException {
        synchronized (this) {
            if (this.n == null) {
                return;
            }
            final Iterator iterator = new ArrayList(this.o.values()).iterator();
            while (iterator.hasNext()) {
                final c f = ((d)iterator.next()).f;
                if (f != null) {
                    f.a();
                }
            }
            this.y();
            b(this.n);
            this.n = null;
        }
    }
    
    public final c h(final String s) throws IOException {
        monitorenter(this);
        Label_0153: {
            try {
                if (this.n != null) {
                    d d = this.o.get(s);
                    final c c = null;
                    if (d == null) {
                        d = new d(s);
                        this.o.put(s, d);
                    }
                    else if (d.f != null) {
                        monitorexit(this);
                        return c;
                    }
                    final c f = new c(d);
                    d.f = f;
                    this.n.append((CharSequence)"DIRTY");
                    this.n.append(' ');
                    this.n.append((CharSequence)s);
                    this.n.append('\n');
                    k(this.n);
                    monitorexit(this);
                    return f;
                }
            }
            finally {
                break Label_0153;
            }
            throw new IllegalStateException("cache is closed");
        }
        monitorexit(this);
    }
    
    public final e o(final String s) throws IOException {
        monitorenter(this);
        Label_0188: {
            try {
                if (this.n != null) {
                    final d d = this.o.get(s);
                    if (d == null) {
                        monitorexit(this);
                        return null;
                    }
                    if (!d.e) {
                        monitorexit(this);
                        return null;
                    }
                    final File[] c = d.c;
                    for (int length = c.length, i = 0; i < length; ++i) {
                        if (!c[i].exists()) {
                            monitorexit(this);
                            return null;
                        }
                    }
                    ++this.p;
                    this.n.append((CharSequence)"READ");
                    this.n.append(' ');
                    this.n.append((CharSequence)s);
                    this.n.append('\n');
                    if (this.q()) {
                        this.r.submit((Callable<Object>)this.s);
                    }
                    final e e = new e(d.c);
                    monitorexit(this);
                    return e;
                }
            }
            finally {
                break Label_0188;
            }
            throw new IllegalStateException("cache is closed");
        }
        monitorexit(this);
    }
    
    public final boolean q() {
        final int p = this.p;
        return p >= 2000 && p >= this.o.size();
    }
    
    public final void s() throws IOException {
        f(this.h);
        final Iterator<d> iterator = this.o.values().iterator();
        while (iterator.hasNext()) {
            final d d = iterator.next();
            final c f = d.f;
            final int n = 0;
            int i = 0;
            if (f == null) {
                while (i < this.l) {
                    this.m += d.b[i];
                    ++i;
                }
            }
            else {
                d.f = null;
                for (int j = n; j < this.l; ++j) {
                    f(d.c[j]);
                    f(d.d[j]);
                }
                iterator.remove();
            }
        }
    }
    
    public final void t() throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: new             Ljava/io/FileInputStream;
        //     7: dup            
        //     8: aload_0        
        //     9: getfield        j8/a.g:Ljava/io/File;
        //    12: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //    15: getstatic       j8/c.a:Ljava/nio/charset/Charset;
        //    18: invokespecial   j8/b.<init>:(Ljava/io/FileInputStream;Ljava/nio/charset/Charset;)V
        //    21: astore_1       
        //    22: aload_1        
        //    23: invokevirtual   j8/b.b:()Ljava/lang/String;
        //    26: astore_2       
        //    27: aload_1        
        //    28: invokevirtual   j8/b.b:()Ljava/lang/String;
        //    31: astore_3       
        //    32: aload_1        
        //    33: invokevirtual   j8/b.b:()Ljava/lang/String;
        //    36: astore          4
        //    38: aload_1        
        //    39: invokevirtual   j8/b.b:()Ljava/lang/String;
        //    42: astore          5
        //    44: aload_1        
        //    45: invokevirtual   j8/b.b:()Ljava/lang/String;
        //    48: astore          6
        //    50: ldc_w           "libcore.io.DiskLruCache"
        //    53: aload_2        
        //    54: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    57: ifeq            236
        //    60: ldc_w           "1"
        //    63: aload_3        
        //    64: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    67: ifeq            236
        //    70: aload_0        
        //    71: getfield        j8/a.j:I
        //    74: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //    77: aload           4
        //    79: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    82: ifeq            236
        //    85: aload_0        
        //    86: getfield        j8/a.l:I
        //    89: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //    92: aload           5
        //    94: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    97: ifeq            236
        //   100: ldc_w           ""
        //   103: aload           6
        //   105: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   108: istore          7
        //   110: iload           7
        //   112: ifeq            236
        //   115: iconst_0       
        //   116: istore          8
        //   118: iconst_0       
        //   119: istore          9
        //   121: aload_0        
        //   122: aload_1        
        //   123: invokevirtual   j8/b.b:()Ljava/lang/String;
        //   126: invokevirtual   j8/a.v:(Ljava/lang/String;)V
        //   129: iinc            9, 1
        //   132: goto            121
        //   135: astore          6
        //   137: aload_0        
        //   138: iload           9
        //   140: aload_0        
        //   141: getfield        j8/a.o:Ljava/util/LinkedHashMap;
        //   144: invokevirtual   java/util/AbstractMap.size:()I
        //   147: isub           
        //   148: putfield        j8/a.p:I
        //   151: iload           8
        //   153: istore          9
        //   155: aload_1        
        //   156: getfield        j8/b.j:I
        //   159: iconst_m1      
        //   160: if_icmpne       166
        //   163: iconst_1       
        //   164: istore          9
        //   166: iload           9
        //   168: ifeq            178
        //   171: aload_0        
        //   172: invokevirtual   j8/a.w:()V
        //   175: goto            223
        //   178: new             Ljava/io/BufferedWriter;
        //   181: astore          5
        //   183: new             Ljava/io/OutputStreamWriter;
        //   186: astore_2       
        //   187: new             Ljava/io/FileOutputStream;
        //   190: astore          6
        //   192: aload           6
        //   194: aload_0        
        //   195: getfield        j8/a.g:Ljava/io/File;
        //   198: iconst_1       
        //   199: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;Z)V
        //   202: aload_2        
        //   203: aload           6
        //   205: getstatic       j8/c.a:Ljava/nio/charset/Charset;
        //   208: invokespecial   java/io/OutputStreamWriter.<init>:(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V
        //   211: aload           5
        //   213: aload_2        
        //   214: invokespecial   java/io/BufferedWriter.<init>:(Ljava/io/Writer;)V
        //   217: aload_0        
        //   218: aload           5
        //   220: putfield        j8/a.n:Ljava/io/BufferedWriter;
        //   223: aload_1        
        //   224: invokevirtual   j8/b.close:()V
        //   227: return         
        //   228: astore_1       
        //   229: aload_1        
        //   230: athrow         
        //   231: astore          6
        //   233: goto            339
        //   236: new             Ljava/io/IOException;
        //   239: astore          4
        //   241: new             Ljava/lang/StringBuilder;
        //   244: astore          10
        //   246: aload           10
        //   248: invokespecial   java/lang/StringBuilder.<init>:()V
        //   251: aload           10
        //   253: ldc_w           "unexpected journal header: ["
        //   256: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   259: pop            
        //   260: aload           10
        //   262: aload_2        
        //   263: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   266: pop            
        //   267: aload           10
        //   269: ldc_w           ", "
        //   272: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   275: pop            
        //   276: aload           10
        //   278: aload_3        
        //   279: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   282: pop            
        //   283: aload           10
        //   285: ldc_w           ", "
        //   288: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   291: pop            
        //   292: aload           10
        //   294: aload           5
        //   296: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   299: pop            
        //   300: aload           10
        //   302: ldc_w           ", "
        //   305: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   308: pop            
        //   309: aload           10
        //   311: aload           6
        //   313: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   316: pop            
        //   317: aload           10
        //   319: ldc_w           "]"
        //   322: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   325: pop            
        //   326: aload           4
        //   328: aload           10
        //   330: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   333: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   336: aload           4
        //   338: athrow         
        //   339: aload_1        
        //   340: invokevirtual   j8/b.close:()V
        //   343: aload           6
        //   345: athrow         
        //   346: astore_1       
        //   347: aload_1        
        //   348: athrow         
        //   349: astore_1       
        //   350: goto            227
        //   353: astore_1       
        //   354: goto            343
        //    Exceptions:
        //  throws java.io.IOException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  22     110    231    349    Any
        //  121    129    135    231    Ljava/io/EOFException;
        //  121    129    231    349    Any
        //  137    151    231    349    Any
        //  155    163    231    349    Any
        //  171    175    231    349    Any
        //  178    223    231    349    Any
        //  223    227    228    231    Ljava/lang/RuntimeException;
        //  223    227    349    353    Ljava/lang/Exception;
        //  236    339    231    349    Any
        //  339    343    346    349    Ljava/lang/RuntimeException;
        //  339    343    353    357    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 170, Size: 170
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3611)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:112)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
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
    
    public final void v(String split) throws IOException {
        final int index = split.indexOf(32);
        if (index != -1) {
            final int n = index + 1;
            final int index2 = split.indexOf(32, n);
            String s2;
            if (index2 == -1) {
                final String s = s2 = split.substring(n);
                if (index == 6) {
                    s2 = s;
                    if (split.startsWith("REMOVE")) {
                        this.o.remove(s);
                        return;
                    }
                }
            }
            else {
                s2 = split.substring(n, index2);
            }
            d d;
            if ((d = this.o.get(s2)) == null) {
                d = new d(s2);
                this.o.put(s2, d);
            }
            if (index2 != -1 && index == 5 && split.startsWith("CLEAN")) {
                split = (String)(Object)split.substring(index2 + 1).split(" ");
                d.e = true;
                d.f = null;
                if (split.length == d.g.l) {
                    int i = 0;
                    try {
                        while (i < split.length) {
                            d.b[i] = Long.parseLong(split[i]);
                            ++i;
                        }
                        return;
                    }
                    catch (final NumberFormatException ex) {
                        final StringBuilder k = a.k("unexpected journal line: ");
                        k.append(Arrays.toString((Object[])(Object)split));
                        throw new IOException(k.toString());
                    }
                }
                final StringBuilder j = a.k("unexpected journal line: ");
                j.append(Arrays.toString((Object[])(Object)split));
                throw new IOException(j.toString());
            }
            if (index2 == -1 && index == 5 && split.startsWith("DIRTY")) {
                d.f = new c(d);
            }
            else if (index2 != -1 || index != 4 || !split.startsWith("READ")) {
                throw new IOException(ak0.m.l("unexpected journal line: ", split));
            }
            return;
        }
        throw new IOException(ak0.m.l("unexpected journal line: ", split));
    }
    
    public final void w() throws IOException {
        synchronized (this) {
            final BufferedWriter n = this.n;
            if (n != null) {
                b(n);
            }
            Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.h), j8.c.a));
            try {
                writer.write("libcore.io.DiskLruCache");
                writer.write("\n");
                writer.write("1");
                writer.write("\n");
                writer.write(Integer.toString(this.j));
                writer.write("\n");
                writer.write(Integer.toString(this.l));
                writer.write("\n");
                writer.write("\n");
                for (final d d : this.o.values()) {
                    if (d.f != null) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("DIRTY ");
                        sb.append(d.a);
                        sb.append('\n');
                        writer.write(sb.toString());
                    }
                    else {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("CLEAN ");
                        sb2.append(d.a);
                        sb2.append(d.a());
                        sb2.append('\n');
                        writer.write(sb2.toString());
                    }
                }
                b(writer);
                if (this.g.exists()) {
                    x(this.g, this.i, true);
                }
                x(this.h, this.g, false);
                this.i.delete();
                writer = new OutputStreamWriter(new FileOutputStream(this.g, true), j8.c.a);
                this.n = new BufferedWriter(writer);
            }
            finally {
                b(writer);
            }
        }
    }
    
    public final void y() throws IOException {
        while (this.m > this.k) {
            final String s = ((Map.Entry)this.o.entrySet().iterator().next()).getKey();
            monitorenter(this);
            Label_0292: {
                try {
                    if (this.n != null) {
                        final d d = this.o.get(s);
                        int i = 0;
                        if (d != null && d.f == null) {
                            while (i < this.l) {
                                final File file = d.c[i];
                                if (file.exists() && !file.delete()) {
                                    final StringBuilder sb = new StringBuilder();
                                    sb.append("failed to delete ");
                                    sb.append(file);
                                    throw new IOException(sb.toString());
                                }
                                final long m = this.m;
                                final long[] b = d.b;
                                this.m = m - b[i];
                                b[i] = 0L;
                                ++i;
                            }
                            ++this.p;
                            this.n.append((CharSequence)"REMOVE");
                            this.n.append(' ');
                            this.n.append((CharSequence)s);
                            this.n.append('\n');
                            this.o.remove(s);
                            if (this.q()) {
                                this.r.submit((Callable<Object>)this.s);
                            }
                            monitorexit(this);
                            continue;
                        }
                        monitorexit(this);
                        continue;
                    }
                }
                finally {
                    break Label_0292;
                }
                throw new IllegalStateException("cache is closed");
            }
            monitorexit(this);
        }
    }
    
    public static final class b implements ThreadFactory
    {
        @Override
        public final Thread newThread(final Runnable runnable) {
            synchronized (this) {
                final Thread thread = new Thread(runnable, "glide-disk-lru-cache-thread");
                thread.setPriority(1);
                return thread;
            }
        }
    }
    
    public final class c
    {
        public final d a;
        public final boolean[] b;
        public boolean c;
        
        public c(final d a) {
            this.a = a;
            boolean[] b;
            if (a.e) {
                b = null;
            }
            else {
                b = new boolean[j8.a.this.l];
            }
            this.b = b;
        }
        
        public final void a() throws IOException {
            j8.a.a(j8.a.this, this, false);
        }
        
        public final File b() throws IOException {
            synchronized (j8.a.this) {
                final d a = this.a;
                if (a.f == this) {
                    if (!a.e) {
                        this.b[0] = true;
                    }
                    final File file = a.d[0];
                    j8.a.this.f.mkdirs();
                    return file;
                }
                throw new IllegalStateException();
            }
        }
    }
    
    public final class d
    {
        public final String a;
        public final long[] b;
        public File[] c;
        public File[] d;
        public boolean e;
        public c f;
        public final /* synthetic */ a g;
        
        public d(final String a) {
            this.a = a;
            final int l = j8.a.this.l;
            this.b = new long[l];
            this.c = new File[l];
            this.d = new File[l];
            final StringBuilder sb = new StringBuilder(a);
            sb.append('.');
            final int length = sb.length();
            for (int i = 0; i < j8.a.this.l; ++i) {
                sb.append(i);
                this.c[i] = new File(j8.a.this.f, sb.toString());
                sb.append(".tmp");
                this.d[i] = new File(j8.a.this.f, sb.toString());
                sb.setLength(length);
            }
        }
        
        public final String a() throws IOException {
            final StringBuilder sb = new StringBuilder();
            for (final long n : this.b) {
                sb.append(' ');
                sb.append(n);
            }
            return sb.toString();
        }
    }
    
    public final class e
    {
        public final File[] a;
        
        public e(final File[] a) {
            this.a = a;
        }
    }
}
