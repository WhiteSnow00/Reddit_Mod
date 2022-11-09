// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Arrays;
import java.io.FilterOutputStream;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Map;
import java.util.Iterator;
import java.io.EOFException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.FileInputStream;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.PrintStream;
import java.io.IOException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import java.io.Writer;
import java.io.File;
import java.io.OutputStream;
import java.util.regex.Pattern;
import java.io.Closeable;

public final class 0bQ implements Closeable
{
    public static final Pattern LIZ;
    public static final OutputStream LJI;
    public final File LIZIZ;
    public final int LIZJ;
    public Writer LIZLLL;
    public int LJ;
    public final ExecutorService LJFF;
    public final File LJII;
    public final File LJIIIIZZ;
    public final File LJIIIZ;
    public final int LJIIJ;
    public long LJIIJJI;
    public long LJIIL;
    public final LinkedHashMap<String, b> LJIILIIL;
    public long LJIILJJIL;
    public final Callable<Void> LJIILL;
    
    static {
        Covode.recordClassIndex(5635);
        LIZ = Pattern.compile("[a-z0-9_-]{1,120}");
        LJI = new 0bL();
    }
    
    public 0bQ(final File liziz) {
        this.LJIILIIL = new LinkedHashMap<String, b>(0, 0.75f, true);
        this.LJIILJJIL = 0L;
        this.LJFF = (ExecutorService)new PThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, (BlockingQueue)new LinkedBlockingQueue(), (ThreadFactory)new DefaultThreadFactory("/DiskLruCache"));
        this.LJIILL = new 0bK(this);
        this.LIZIZ = liziz;
        this.LJIIJ = 100;
        this.LJII = new File(liziz, "journal");
        this.LJIIIIZZ = new File(liziz, "journal.tmp");
        this.LJIIIZ = new File(liziz, "journal.bkp");
        this.LIZJ = 1;
        this.LJIIJJI = 400L;
    }
    
    public static 0bQ LIZ(final File file) {
        final File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            final File file3 = new File(file, "journal");
            if (file3.exists()) {
                LIZIZ(file2);
            }
            else {
                LIZ(file2, file3, false);
            }
        }
        final 0bQ 0bQ = new 0bQ(file);
        if (0bQ.LJII.exists()) {
            try {
                0bQ.LIZLLL();
                0bQ.LJ();
                return 0bQ;
            }
            catch (final IOException ex) {
                final PrintStream out = System.out;
                final StringBuilder sb = new StringBuilder("DiskLruCache ");
                sb.append(file);
                sb.append(" is corrupt: ");
                sb.append(ex.getMessage());
                sb.append(", removing");
                out.println(sb.toString());
                0bQ.close();
                0bR.LIZ(0bQ.LIZIZ);
            }
        }
        file.mkdirs();
        final 0bQ 0bQ2 = new 0bQ(file);
        0bQ2.LIZ();
        return 0bQ2;
    }
    
    public static void LIZ(final File file, final File file2, final boolean b) {
        MethodCollector.i(14246);
        if (b) {
            LIZJ(file2);
        }
        if (file.renameTo(file2)) {
            MethodCollector.o(14246);
            return;
        }
        final IOException ex = new IOException();
        MethodCollector.o(14246);
        throw ex;
    }
    
    public static boolean LIZIZ(final File file) {
        MethodCollector.i(13024);
        while (true) {
            try {
                609 liz;
                if (NIJ.LIZIZ()) {
                    liz = (609)SettingsManager.LIZ().LIZ("storage_intercepter_key", (Class)609.class, (Object)4F0.LIZ);
                }
                else {
                    liz = 4F0.LIZ;
                }
                if (608.LIZ(file.getAbsolutePath(), liz)) {
                    608.LIZ(file, (Throwable)new RuntimeException(), "exception_delete_log", 608.LIZ(liz));
                }
                if (608.LIZJ(file.getAbsolutePath(), liz)) {
                    608.LIZ(file, (Throwable)new RuntimeException(), "exception_handle", 608.LIZ(liz));
                    MethodCollector.o(13024);
                    return false;
                }
                final boolean delete = file.delete();
                MethodCollector.o(13024);
                return delete;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static void LIZJ(final File file) {
        if (!file.exists() || LIZIZ(file)) {
            return;
        }
        throw new IOException();
    }
    
    private void LIZLLL() {
        MethodCollector.i(13028);
        final 0bT 0bT = new 0bT(new FileInputStream(this.LJII), 0bR.LIZ);
        try {
            final String liz = 0bT.LIZ();
            final String liz2 = 0bT.LIZ();
            final String liz3 = 0bT.LIZ();
            final String liz4 = 0bT.LIZ();
            final String liz5 = 0bT.LIZ();
            if ("libcore.io.DiskLruCache".equals(liz) && "1".equals(liz2) && Integer.toString(this.LJIIJ).equals(liz3) && Integer.toString(this.LIZJ).equals(liz4) && "".equals(liz5)) {
                int n = 0;
                try {
                    String liz6 = null;
                    Label_0426: {
                        while (true) {
                            liz6 = 0bT.LIZ();
                            final int index = liz6.indexOf(32);
                            if (index == -1) {
                                break Label_0426;
                            }
                            final int n2 = index + 1;
                            final int index2 = liz6.indexOf(32, n2);
                            Label_0391: {
                                String s2;
                                if (index2 == -1) {
                                    final String s = s2 = liz6.substring(n2);
                                    if (index == 6) {
                                        s2 = s;
                                        if (liz6.startsWith("REMOVE")) {
                                            this.LJIILIIL.remove(s);
                                            break Label_0391;
                                        }
                                    }
                                }
                                else {
                                    s2 = liz6.substring(n2, index2);
                                }
                                b b;
                                if ((b = this.LJIILIIL.get(s2)) == null) {
                                    b = new b(s2, (byte)0);
                                    this.LJIILIIL.put(s2, b);
                                }
                                Label_0375: {
                                    if (index2 != -1) {
                                        if (index == 5 && liz6.startsWith("CLEAN")) {
                                            final String[] split = liz6.substring(index2 + 1).split(" ");
                                            b.LIZJ = true;
                                            b.LIZLLL = null;
                                            b.LIZ(split);
                                            break Label_0391;
                                        }
                                        if (index2 != -1) {
                                            if (index2 == -1) {
                                                break Label_0375;
                                            }
                                            break;
                                        }
                                    }
                                    if (index == 5) {
                                        if (liz6.startsWith("DIRTY")) {
                                            b.LIZLLL = new a(b, (byte)0);
                                            break Label_0391;
                                        }
                                        break;
                                    }
                                }
                                if (index != 4 || !liz6.startsWith("READ")) {
                                    break;
                                }
                            }
                            ++n;
                        }
                        final IOException ex = new IOException("unexpected journal line: ".concat(String.valueOf(liz6)));
                        MethodCollector.o(13028);
                        throw ex;
                    }
                    final IOException ex2 = new IOException("unexpected journal line: ".concat(String.valueOf(liz6)));
                    MethodCollector.o(13028);
                    throw ex2;
                }
                catch (final EOFException ex3) {
                    this.LJ = n - this.LJIILIIL.size();
                    if (0bT.LIZIZ == -1) {
                        this.LIZ();
                    }
                    else {
                        this.LIZLLL = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.LJII, true), 0bR.LIZ));
                    }
                    return;
                }
            }
            final StringBuilder sb = new StringBuilder("unexpected journal header: [");
            sb.append(liz);
            sb.append(", ");
            sb.append(liz2);
            sb.append(", ");
            sb.append(liz4);
            sb.append(", ");
            sb.append(liz5);
            sb.append("]");
            final IOException ex4 = new IOException(sb.toString());
            MethodCollector.o(13028);
            throw ex4;
        }
        finally {
            0bR.LIZ(0bT);
            MethodCollector.o(13028);
        }
    }
    
    private void LIZLLL(final String s) {
        if (0bQ.LIZ.matcher(s).matches()) {
            return;
        }
        final StringBuilder sb = new StringBuilder("keys must match regex [a-z0-9_-]{1,120}: \"");
        sb.append(s);
        sb.append("\"");
        throw new IllegalArgumentException(sb.toString());
    }
    
    private void LJ() {
        LIZJ(this.LJIIIIZZ);
        final Iterator<b> iterator = this.LJIILIIL.values().iterator();
        while (iterator.hasNext()) {
            final b b = iterator.next();
            final a lizlll = b.LIZLLL;
            final int n = 0;
            int i = 0;
            if (lizlll == null) {
                while (i < this.LIZJ) {
                    this.LJIIL += b.LIZIZ[i];
                    ++i;
                }
            }
            else {
                b.LIZLLL = null;
                for (int j = n; j < this.LIZJ; ++j) {
                    LIZJ(b.LIZ(j));
                    LIZJ(b.LIZIZ(j));
                }
                iterator.remove();
            }
        }
    }
    
    private void LJFF() {
        if (this.LIZLLL != null) {
            return;
        }
        throw new IllegalStateException("cache is closed");
    }
    
    public final c LIZ(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: monitorenter   
        //     2: sipush          14250
        //     5: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.i:(I)V
        //     8: aload_0        
        //     9: invokespecial   X/0bQ.LJFF:()V
        //    12: aload_0        
        //    13: aload_1        
        //    14: invokespecial   X/0bQ.LIZLLL:(Ljava/lang/String;)V
        //    17: aload_0        
        //    18: getfield        X/0bQ.LJIILIIL:Ljava/util/LinkedHashMap;
        //    21: aload_1        
        //    22: invokevirtual   java/util/LinkedHashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    25: checkcast       LX/0bO;
        //    28: astore_2       
        //    29: aload_2        
        //    30: ifnonnull       43
        //    33: sipush          14250
        //    36: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //    39: aload_0        
        //    40: monitorexit    
        //    41: aconst_null    
        //    42: areturn        
        //    43: aload_2        
        //    44: getfield        X/0bO.LIZJ:Z
        //    47: ifne            60
        //    50: sipush          14250
        //    53: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //    56: aload_0        
        //    57: monitorexit    
        //    58: aconst_null    
        //    59: areturn        
        //    60: aload_0        
        //    61: getfield        X/0bQ.LIZJ:I
        //    64: anewarray       Ljava/io/InputStream;
        //    67: astore_3       
        //    68: iconst_0       
        //    69: istore          4
        //    71: iconst_0       
        //    72: istore          5
        //    74: iload           5
        //    76: aload_0        
        //    77: getfield        X/0bQ.LIZJ:I
        //    80: if_icmpge       106
        //    83: aload_3        
        //    84: iload           5
        //    86: new             Ljava/io/FileInputStream;
        //    89: dup            
        //    90: aload_2        
        //    91: iload           5
        //    93: invokevirtual   X/0bO.LIZ:(I)Ljava/io/File;
        //    96: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //    99: aastore        
        //   100: iinc            5, 1
        //   103: goto            74
        //   106: aload_0        
        //   107: aload_0        
        //   108: getfield        X/0bQ.LJ:I
        //   111: iconst_1       
        //   112: iadd           
        //   113: putfield        X/0bQ.LJ:I
        //   116: aload_0        
        //   117: getfield        X/0bQ.LIZLLL:Ljava/io/Writer;
        //   120: astore          6
        //   122: new             Ljava/lang/StringBuilder;
        //   125: astore_2       
        //   126: aload_2        
        //   127: ldc_w           "READ "
        //   130: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   133: aload_2        
        //   134: aload_1        
        //   135: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   138: pop            
        //   139: aload_2        
        //   140: bipush          10
        //   142: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   145: pop            
        //   146: aload           6
        //   148: aload_2        
        //   149: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   152: invokevirtual   java/io/Writer.append:(Ljava/lang/CharSequence;)Ljava/io/Writer;
        //   155: pop            
        //   156: aload_0        
        //   157: invokevirtual   X/0bQ.LIZIZ:()Z
        //   160: ifeq            177
        //   163: aload_0        
        //   164: getfield        X/0bQ.LJFF:Ljava/util/concurrent/ExecutorService;
        //   167: aload_0        
        //   168: getfield        X/0bQ.LJIILL:Ljava/util/concurrent/Callable;
        //   171: invokeinterface java/util/concurrent/ExecutorService.submit:(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
        //   176: pop            
        //   177: new             LX/0bP;
        //   180: astore_1       
        //   181: aload_1        
        //   182: aload_3        
        //   183: iconst_0       
        //   184: invokespecial   X/0bP.<init>:([Ljava/io/InputStream;B)V
        //   187: sipush          14250
        //   190: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   193: aload_0        
        //   194: monitorexit    
        //   195: aload_1        
        //   196: areturn        
        //   197: iload           5
        //   199: aload_0        
        //   200: getfield        X/0bQ.LIZJ:I
        //   203: if_icmpge       226
        //   206: aload_3        
        //   207: iload           5
        //   209: aaload         
        //   210: ifnull          226
        //   213: aload_3        
        //   214: iload           5
        //   216: aaload         
        //   217: invokestatic    X/0bR.LIZ:(Ljava/io/Closeable;)V
        //   220: iinc            5, 1
        //   223: goto            197
        //   226: sipush          14250
        //   229: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   232: aload_0        
        //   233: monitorexit    
        //   234: aconst_null    
        //   235: areturn        
        //   236: astore_1       
        //   237: aload_0        
        //   238: monitorexit    
        //   239: aload_1        
        //   240: athrow         
        //   241: astore_1       
        //   242: iload           4
        //   244: istore          5
        //   246: goto            197
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  2      29     236    241    Any
        //  33     39     236    241    Any
        //  43     56     236    241    Any
        //  60     68     236    241    Any
        //  74     100    241    236    Ljava/io/FileNotFoundException;
        //  74     100    236    241    Any
        //  106    177    236    241    Any
        //  177    193    236    241    Any
        //  197    206    236    241    Any
        //  213    220    236    241    Any
        //  226    232    236    241    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0074:
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
    
    public final void LIZ() {
        synchronized (this) {
            MethodCollector.i(13949);
            final Writer lizlll = this.LIZLLL;
            if (lizlll != null) {
                lizlll.close();
            }
            Closeable closeable = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.LJIIIIZZ), 0bR.LIZ));
            try {
                ((Writer)closeable).write("libcore.io.DiskLruCache");
                ((Writer)closeable).write("\n");
                ((Writer)closeable).write("1");
                ((Writer)closeable).write("\n");
                ((Writer)closeable).write(Integer.toString(this.LJIIJ));
                ((Writer)closeable).write("\n");
                ((Writer)closeable).write(Integer.toString(this.LIZJ));
                ((Writer)closeable).write("\n");
                ((Writer)closeable).write("\n");
                for (final b b : this.LJIILIIL.values()) {
                    if (b.LIZLLL != null) {
                        final StringBuilder sb = new StringBuilder("DIRTY ");
                        sb.append(b.LIZ);
                        sb.append('\n');
                        ((Writer)closeable).write(sb.toString());
                    }
                    else {
                        final StringBuilder sb2 = new StringBuilder("CLEAN ");
                        sb2.append(b.LIZ);
                        sb2.append(b.LIZ());
                        sb2.append('\n');
                        ((Writer)closeable).write(sb2.toString());
                    }
                }
                ((Writer)closeable).close();
                if (this.LJII.exists()) {
                    LIZ(this.LJII, this.LJIIIZ, true);
                }
                LIZ(this.LJIIIIZZ, this.LJII, false);
                LIZIZ(this.LJIIIZ);
                closeable = new FileOutputStream(this.LJII, true);
                this.LIZLLL = new BufferedWriter(new OutputStreamWriter((OutputStream)closeable, 0bR.LIZ));
                MethodCollector.o(13949);
            }
            finally {
                ((Writer)closeable).close();
                MethodCollector.o(13949);
            }
        }
    }
    
    public final void LIZ(final a a, final boolean b) {
        synchronized (this) {
            MethodCollector.i(14256);
            final b liz = a.LIZ;
            if (liz.LIZLLL == a) {
                int i;
                final int n = i = 0;
                if (b) {
                    i = n;
                    if (!liz.LIZJ) {
                        int n2 = 0;
                        while (true) {
                            i = n;
                            if (n2 >= this.LIZJ) {
                                break;
                            }
                            if (!a.LIZIZ[n2]) {
                                a.LIZIZ();
                                final IllegalStateException ex = new IllegalStateException("Newly created entry didn't create value for index ".concat(String.valueOf(n2)));
                                MethodCollector.o(14256);
                                throw ex;
                            }
                            if (!liz.LIZIZ(n2).exists()) {
                                a.LIZIZ();
                                MethodCollector.o(14256);
                                return;
                            }
                            ++n2;
                        }
                    }
                }
                while (i < this.LIZJ) {
                    final File liziz = liz.LIZIZ(i);
                    if (b) {
                        if (liziz.exists()) {
                            final File liz2 = liz.LIZ(i);
                            liziz.renameTo(liz2);
                            final long n3 = liz.LIZIZ[i];
                            final long length = liz2.length();
                            liz.LIZIZ[i] = length;
                            this.LJIIL = this.LJIIL - n3 + length;
                        }
                    }
                    else {
                        LIZJ(liziz);
                    }
                    ++i;
                }
                ++this.LJ;
                liz.LIZLLL = null;
                if (liz.LIZJ | b) {
                    liz.LIZJ = true;
                    final Writer lizlll = this.LIZLLL;
                    if (lizlll != null) {
                        final StringBuilder sb = new StringBuilder("CLEAN ");
                        sb.append(liz.LIZ);
                        sb.append(liz.LIZ());
                        sb.append('\n');
                        lizlll.write(sb.toString());
                    }
                    if (b) {
                        final long ljiiljjil = this.LJIILJJIL;
                        this.LJIILJJIL = 1L + ljiiljjil;
                        liz.LJ = ljiiljjil;
                    }
                }
                else {
                    this.LJIILIIL.remove(liz.LIZ);
                    final Writer lizlll2 = this.LIZLLL;
                    if (lizlll2 != null) {
                        final StringBuilder sb2 = new StringBuilder("REMOVE ");
                        sb2.append(liz.LIZ);
                        sb2.append('\n');
                        lizlll2.write(sb2.toString());
                    }
                }
                final Writer lizlll3 = this.LIZLLL;
                if (lizlll3 != null) {
                    lizlll3.flush();
                }
                if (this.LJIIL > this.LJIIJJI || this.LIZIZ()) {
                    this.LJFF.submit(this.LJIILL);
                }
                MethodCollector.o(14256);
                return;
            }
            final IllegalStateException ex2 = new IllegalStateException();
            MethodCollector.o(14256);
            throw ex2;
        }
    }
    
    public final a LIZIZ(final String s) {
        synchronized (this) {
            MethodCollector.i(14253);
            this.LJFF();
            this.LIZLLL(s);
            final b b = this.LJIILIIL.get(s);
            b b2;
            if (b == null) {
                b2 = new b(s, (byte)0);
                this.LJIILIIL.put(s, b2);
            }
            else {
                b2 = b;
                if (b.LIZLLL != null) {
                    MethodCollector.o(14253);
                    return null;
                }
            }
            final a lizlll = new a(b2, (byte)0);
            b2.LIZLLL = lizlll;
            final Writer lizlll2 = this.LIZLLL;
            final StringBuilder sb = new StringBuilder("DIRTY ");
            sb.append(s);
            sb.append('\n');
            lizlll2.write(sb.toString());
            this.LIZLLL.flush();
            MethodCollector.o(14253);
            return lizlll;
        }
    }
    
    public final boolean LIZIZ() {
        final int lj = this.LJ;
        return lj >= 2000 && lj >= this.LJIILIIL.size();
    }
    
    public final void LIZJ() {
        while (this.LJIIL > this.LJIIJJI) {
            this.LIZJ(((Map.Entry)this.LJIILIIL.entrySet().iterator().next()).getKey());
        }
    }
    
    public final boolean LIZJ(final String s) {
        synchronized (this) {
            MethodCollector.i(15136);
            this.LJFF();
            this.LIZLLL(s);
            final b b = this.LJIILIIL.get(s);
            int i = 0;
            if (b == null || b.LIZLLL != null) {
                MethodCollector.o(15136);
                return false;
            }
            while (i < this.LIZJ) {
                final File liz = b.LIZ(i);
                if (liz.exists() && !LIZIZ(liz)) {
                    final IOException ex = new IOException("failed to delete ".concat(String.valueOf(liz)));
                    MethodCollector.o(15136);
                    throw ex;
                }
                this.LJIIL -= b.LIZIZ[i];
                b.LIZIZ[i] = 0L;
                ++i;
            }
            ++this.LJ;
            final Writer lizlll = this.LIZLLL;
            final StringBuilder sb = new StringBuilder("REMOVE ");
            sb.append(s);
            sb.append('\n');
            lizlll.append((CharSequence)sb.toString());
            this.LJIILIIL.remove(s);
            if (this.LIZIZ()) {
                this.LJFF.submit(this.LJIILL);
            }
            MethodCollector.o(15136);
            return true;
        }
    }
    
    @Override
    public final void close() {
        synchronized (this) {
            MethodCollector.i(15140);
            if (this.LIZLLL == null) {
                MethodCollector.o(15140);
                return;
            }
            for (final b b : new ArrayList(this.LJIILIIL.values())) {
                if (b.LIZLLL != null) {
                    b.LIZLLL.LIZIZ();
                }
            }
            this.LIZJ();
            this.LIZLLL.close();
            this.LIZLLL = null;
            MethodCollector.o(15140);
        }
    }
    
    public final class a
    {
        public final b LIZ;
        public final boolean[] LIZIZ;
        public boolean LIZJ;
        
        static {
            Covode.recordClassIndex(5638);
        }
        
        public a(final b liz) {
            this.LIZ = liz;
            boolean[] liziz;
            if (liz.LIZJ) {
                liziz = null;
            }
            else {
                liziz = new boolean[0bQ.this.LIZJ];
            }
            this.LIZIZ = liziz;
        }
        
        public final OutputStream LIZ() {
            MethodCollector.i(8604);
            if (0bQ.this.LIZJ > 0) {
                final 0bQ lizlll = 0bQ.this;
                monitorenter(lizlll);
                try {
                    if (this.LIZ.LIZLLL == this) {
                        if (!this.LIZ.LIZJ) {
                            this.LIZIZ[0] = true;
                        }
                        final File liziz = this.LIZ.LIZIZ(0);
                        Label_0093: {
                            try {
                                final FileOutputStream fileOutputStream = new FileOutputStream(liziz);
                                break Label_0093;
                            }
                            catch (final FileNotFoundException ex) {
                                0bQ.this.LIZIZ.mkdirs();
                                try {
                                    final FileOutputStream fileOutputStream = new FileOutputStream(liziz);
                                    return new 0bQ.a.a(fileOutputStream, (byte)0);
                                }
                                catch (final FileNotFoundException ex2) {
                                    return 0bQ.LJI;
                                }
                            }
                        }
                    }
                    final IllegalStateException ex3 = new IllegalStateException();
                    MethodCollector.o(8604);
                    throw ex3;
                }
                finally {
                    monitorexit(lizlll);
                    MethodCollector.o(8604);
                }
            }
            final StringBuilder sb = new StringBuilder("Expected index 0 to be greater than 0 and less than the maximum value count of ");
            sb.append(0bQ.this.LIZJ);
            final IllegalArgumentException ex4 = new IllegalArgumentException(sb.toString());
            MethodCollector.o(8604);
            throw ex4;
        }
        
        public final void LIZIZ() {
            0bQ.this.LIZ(this, false);
        }
        
        public final class a extends FilterOutputStream
        {
            static {
                Covode.recordClassIndex(5639);
            }
            
            public a(final OutputStream outputStream) {
                super(outputStream);
                MethodCollector.i(8557);
                MethodCollector.o(8557);
            }
            
            @Override
            public final void close() {
                try {
                    this.out.close();
                }
                catch (final IOException ex) {
                    0bQ.a.this.LIZJ = true;
                }
            }
            
            @Override
            public final void flush() {
                try {
                    this.out.flush();
                }
                catch (final IOException ex) {
                    0bQ.a.this.LIZJ = true;
                }
            }
            
            @Override
            public final void write(final int n) {
                MethodCollector.i(8560);
                try {
                    this.out.write(n);
                    MethodCollector.o(8560);
                }
                catch (final IOException ex) {
                    0bQ.a.this.LIZJ = true;
                    MethodCollector.o(8560);
                }
            }
            
            @Override
            public final void write(final byte[] array, final int n, final int n2) {
                MethodCollector.i(8564);
                try {
                    this.out.write(array, n, n2);
                    MethodCollector.o(8564);
                }
                catch (final IOException ex) {
                    0bQ.a.this.LIZJ = true;
                    MethodCollector.o(8564);
                }
            }
        }
    }
    
    public final class b
    {
        public final String LIZ;
        public final long[] LIZIZ;
        public boolean LIZJ;
        public 0bQ.a LIZLLL;
        public long LJ;
        
        static {
            Covode.recordClassIndex(5640);
        }
        
        public b(final String liz) {
            this.LIZ = liz;
            this.LIZIZ = new long[0bQ.this.LIZJ];
        }
        
        private IOException LIZIZ(final String[] array) {
            final StringBuilder sb = new StringBuilder("unexpected journal line: ");
            sb.append(Arrays.toString(array));
            throw new IOException(sb.toString());
        }
        
        public final File LIZ(final int n) {
            final File liziz = 0bQ.this.LIZIZ;
            final StringBuilder sb = new StringBuilder();
            sb.append(this.LIZ);
            sb.append(".");
            sb.append(n);
            return new File(liziz, sb.toString());
        }
        
        public final String LIZ() {
            final StringBuilder sb = new StringBuilder();
            for (final long n : this.LIZIZ) {
                sb.append(' ');
                sb.append(n);
            }
            return sb.toString();
        }
        
        public final void LIZ(final String[] array) {
            if (array.length == 0bQ.this.LIZJ) {
                int i = 0;
                try {
                    while (i < array.length) {
                        this.LIZIZ[i] = Long.parseLong(array[i]);
                        ++i;
                    }
                    return;
                }
                catch (final NumberFormatException ex) {
                    throw this.LIZIZ(array);
                }
            }
            throw this.LIZIZ(array);
        }
        
        public final File LIZIZ(final int n) {
            final File liziz = 0bQ.this.LIZIZ;
            final StringBuilder sb = new StringBuilder();
            sb.append(this.LIZ);
            sb.append(".");
            sb.append(n);
            sb.append(".tmp");
            return new File(liziz, sb.toString());
        }
    }
    
    public final class c implements Closeable
    {
        public final InputStream[] LIZ;
        
        static {
            Covode.recordClassIndex(5641);
        }
        
        public c(final InputStream[] liz) {
            this.LIZ = liz;
        }
        
        @Override
        public final void close() {
            final InputStream[] liz = this.LIZ;
            for (int length = liz.length, i = 0; i < length; ++i) {
                0bR.LIZ(liz[i]);
            }
        }
    }
}
