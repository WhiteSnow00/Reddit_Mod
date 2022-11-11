// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.exceptions;

import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public final class CompositeException extends RuntimeException
{
    private static final long serialVersionUID = 3026362227162912146L;
    private Throwable cause;
    private final List<Throwable> exceptions;
    private final String message;
    
    public CompositeException(final Iterable<? extends Throwable> iterable) {
        final LinkedHashSet set = new LinkedHashSet();
        final ArrayList list = new ArrayList();
        if (iterable != null) {
            for (final Throwable t : iterable) {
                if (t instanceof CompositeException) {
                    set.addAll(((CompositeException)t).getExceptions());
                }
                else if (t != null) {
                    set.add(t);
                }
                else {
                    set.add(new NullPointerException("Throwable was null!"));
                }
            }
        }
        else {
            set.add(new NullPointerException("errors was null"));
        }
        if (!set.isEmpty()) {
            list.addAll(set);
            final List<Object> unmodifiableList = Collections.unmodifiableList((List<?>)list);
            this.exceptions = (List<Throwable>)unmodifiableList;
            final StringBuilder sb = new StringBuilder();
            sb.append(unmodifiableList.size());
            sb.append(" exceptions occurred. ");
            this.message = sb.toString();
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }
    
    public CompositeException(final Throwable... array) {
        Object o;
        if (array == null) {
            o = Collections.singletonList(new NullPointerException("exceptions was null"));
        }
        else {
            o = Arrays.asList(array);
        }
        this((Iterable<? extends Throwable>)o);
    }
    
    public static void a(final StringBuilder sb, final Throwable t, final String s) {
        sb.append(s);
        sb.append(t);
        sb.append('\n');
        for (final StackTraceElement stackTraceElement : t.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        if (t.getCause() != null) {
            sb.append("\tCaused by: ");
            a(sb, t.getCause(), "");
        }
    }
    
    public final void b(final a a) {
        final StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append('\n');
        for (final StackTraceElement stackTraceElement : this.getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        final Iterator<Throwable> iterator = this.exceptions.iterator();
        int n = 1;
        while (iterator.hasNext()) {
            final Throwable t = iterator.next();
            sb.append("  ComposedException ");
            sb.append(n);
            sb.append(" :\n");
            a(sb, t, "\t");
            ++n;
        }
        a.a(sb.toString());
    }
    
    @Override
    public Throwable getCause() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: monitorenter   
        //     2: aload_0        
        //     3: getfield        io/reactivex/exceptions/CompositeException.cause:Ljava/lang/Throwable;
        //     6: ifnonnull       240
        //     9: new             Lio/reactivex/exceptions/CompositeException$CompositeExceptionCausalChain;
        //    12: astore_1       
        //    13: aload_1        
        //    14: invokespecial   io/reactivex/exceptions/CompositeException$CompositeExceptionCausalChain.<init>:()V
        //    17: new             Ljava/util/HashSet;
        //    20: astore_2       
        //    21: aload_2        
        //    22: invokespecial   java/util/HashSet.<init>:()V
        //    25: aload_0        
        //    26: getfield        io/reactivex/exceptions/CompositeException.exceptions:Ljava/util/List;
        //    29: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    34: astore_3       
        //    35: aload_1        
        //    36: astore          4
        //    38: aload_3        
        //    39: invokeinterface java/util/Iterator.hasNext:()Z
        //    44: ifeq            235
        //    47: aload_3        
        //    48: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    53: checkcast       Ljava/lang/Throwable;
        //    56: astore          5
        //    58: aload_2        
        //    59: aload           5
        //    61: invokevirtual   java/util/HashSet.contains:(Ljava/lang/Object;)Z
        //    64: ifeq            70
        //    67: goto            38
        //    70: aload_2        
        //    71: aload           5
        //    73: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //    76: pop            
        //    77: new             Ljava/util/ArrayList;
        //    80: astore          6
        //    82: aload           6
        //    84: invokespecial   java/util/ArrayList.<init>:()V
        //    87: aload           5
        //    89: invokevirtual   java/lang/Throwable.getCause:()Ljava/lang/Throwable;
        //    92: astore          7
        //    94: aload           7
        //    96: ifnull          150
        //    99: aload           7
        //   101: astore          8
        //   103: aload           7
        //   105: aload           5
        //   107: if_acmpne       113
        //   110: goto            150
        //   113: aload           6
        //   115: aload           8
        //   117: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   120: pop            
        //   121: aload           8
        //   123: invokevirtual   java/lang/Throwable.getCause:()Ljava/lang/Throwable;
        //   126: astore          7
        //   128: aload           7
        //   130: ifnull          150
        //   133: aload           7
        //   135: aload           8
        //   137: if_acmpne       143
        //   140: goto            150
        //   143: aload           7
        //   145: astore          8
        //   147: goto            113
        //   150: aload           6
        //   152: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   155: astore          7
        //   157: aload           5
        //   159: astore          8
        //   161: aload           7
        //   163: invokeinterface java/util/Iterator.hasNext:()Z
        //   168: ifeq            216
        //   171: aload           7
        //   173: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   178: checkcast       Ljava/lang/Throwable;
        //   181: astore          5
        //   183: aload_2        
        //   184: aload           5
        //   186: invokevirtual   java/util/HashSet.contains:(Ljava/lang/Object;)Z
        //   189: ifeq            206
        //   192: new             Ljava/lang/RuntimeException;
        //   195: dup            
        //   196: ldc             "Duplicate found in causal chain so cropping to prevent loop ..."
        //   198: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //   201: astore          8
        //   203: goto            161
        //   206: aload_2        
        //   207: aload           5
        //   209: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //   212: pop            
        //   213: goto            161
        //   216: aload           4
        //   218: aload           8
        //   220: invokevirtual   java/lang/Throwable.initCause:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   223: pop            
        //   224: aload_0        
        //   225: aload           4
        //   227: invokevirtual   io/reactivex/exceptions/CompositeException.getRootCause:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   230: astore          4
        //   232: goto            38
        //   235: aload_0        
        //   236: aload_1        
        //   237: putfield        io/reactivex/exceptions/CompositeException.cause:Ljava/lang/Throwable;
        //   240: aload_0        
        //   241: getfield        io/reactivex/exceptions/CompositeException.cause:Ljava/lang/Throwable;
        //   244: astore          4
        //   246: aload_0        
        //   247: monitorexit    
        //   248: aload           4
        //   250: areturn        
        //   251: astore          4
        //   253: aload_0        
        //   254: monitorexit    
        //   255: aload           4
        //   257: athrow         
        //   258: astore          8
        //   260: goto            224
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  2      35     251    258    Any
        //  38     67     251    258    Any
        //  70     94     251    258    Any
        //  113    128    251    258    Any
        //  150    157    251    258    Any
        //  161    203    251    258    Any
        //  206    213    251    258    Any
        //  216    224    258    263    Any
        //  224    232    251    258    Any
        //  235    240    251    258    Any
        //  240    246    251    258    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0216:
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
    
    public List<Throwable> getExceptions() {
        return this.exceptions;
    }
    
    @Override
    public String getMessage() {
        return this.message;
    }
    
    public Throwable getRootCause(Throwable cause) {
        final Throwable cause2 = cause.getCause();
        Throwable t;
        if (cause2 != null && cause != (t = cause2)) {
            while (true) {
                cause = t.getCause();
                if (cause == null || cause == t) {
                    break;
                }
                t = cause;
            }
            return t;
        }
        return cause;
    }
    
    @Override
    public void printStackTrace() {
        this.printStackTrace(System.err);
    }
    
    @Override
    public void printStackTrace(final PrintStream printStream) {
        this.b((a)new CompositeException.CompositeException$b(printStream));
    }
    
    @Override
    public void printStackTrace(final PrintWriter printWriter) {
        this.b((a)new CompositeException.CompositeException$c(printWriter));
    }
    
    public int size() {
        return this.exceptions.size();
    }
    
    public static final class CompositeExceptionCausalChain extends RuntimeException
    {
        public static final String MESSAGE = "Chain of Causes for CompositeException In Order Received =>";
        private static final long serialVersionUID = 3875212506787802066L;
        
        @Override
        public String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }
    }
    
    public abstract static class a
    {
        public abstract void a(final String p0);
    }
}
