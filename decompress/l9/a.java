// 
// Decompiled by Procyon v0.6.0
// 

package l9;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

public final class a
{
    public static final AtomicReference<byte[]> a;
    
    static {
        a = new AtomicReference<byte[]>();
    }
    
    public static MappedByteBuffer a(final File p0) throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore_1       
        //     2: aload_0        
        //     3: invokevirtual   java/io/File.length:()J
        //     6: lstore_2       
        //     7: lload_2        
        //     8: ldc2_w          2147483647
        //    11: lcmp           
        //    12: ifgt            97
        //    15: lload_2        
        //    16: lconst_0       
        //    17: lcmp           
        //    18: ifeq            85
        //    21: new             Ljava/io/RandomAccessFile;
        //    24: astore          4
        //    26: aload           4
        //    28: aload_0        
        //    29: ldc             "r"
        //    31: invokespecial   java/io/RandomAccessFile.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    34: aload           4
        //    36: invokevirtual   java/io/RandomAccessFile.getChannel:()Ljava/nio/channels/FileChannel;
        //    39: astore          5
        //    41: aload           5
        //    43: getstatic       java/nio/channels/FileChannel$MapMode.READ_ONLY:Ljava/nio/channels/FileChannel$MapMode;
        //    46: lconst_0       
        //    47: lload_2        
        //    48: invokevirtual   java/nio/channels/FileChannel.map:(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
        //    51: invokevirtual   java/nio/MappedByteBuffer.load:()Ljava/nio/MappedByteBuffer;
        //    54: astore_0       
        //    55: aload           5
        //    57: invokevirtual   java/nio/channels/spi/AbstractInterruptibleChannel.close:()V
        //    60: aload           4
        //    62: invokevirtual   java/io/RandomAccessFile.close:()V
        //    65: aload_0        
        //    66: areturn        
        //    67: astore_0       
        //    68: goto            75
        //    71: astore_0       
        //    72: aconst_null    
        //    73: astore          5
        //    75: aload           5
        //    77: astore_1       
        //    78: aload           4
        //    80: astore          5
        //    82: goto            113
        //    85: new             Ljava/io/IOException;
        //    88: astore_0       
        //    89: aload_0        
        //    90: ldc             "File unsuitable for memory mapping"
        //    92: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //    95: aload_0        
        //    96: athrow         
        //    97: new             Ljava/io/IOException;
        //   100: astore_0       
        //   101: aload_0        
        //   102: ldc             "File too large to map into memory"
        //   104: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   107: aload_0        
        //   108: athrow         
        //   109: astore_0       
        //   110: aconst_null    
        //   111: astore          5
        //   113: aload_1        
        //   114: ifnull          121
        //   117: aload_1        
        //   118: invokevirtual   java/nio/channels/spi/AbstractInterruptibleChannel.close:()V
        //   121: aload           5
        //   123: ifnull          131
        //   126: aload           5
        //   128: invokevirtual   java/io/RandomAccessFile.close:()V
        //   131: aload_0        
        //   132: athrow         
        //   133: astore          5
        //   135: goto            60
        //   138: astore          5
        //   140: goto            65
        //   143: astore_1       
        //   144: goto            121
        //   147: astore          5
        //   149: goto            131
        //    Exceptions:
        //  throws java.io.IOException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  2      7      109    113    Any
        //  21     34     109    113    Any
        //  34     41     71     75     Any
        //  41     55     67     71     Any
        //  55     60     133    138    Ljava/io/IOException;
        //  60     65     138    143    Ljava/io/IOException;
        //  85     97     109    113    Any
        //  97     109    109    113    Any
        //  117    121    143    147    Ljava/io/IOException;
        //  126    131    147    152    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 80, Size: 80
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
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
    
    public static void b(final ByteBuffer p0, final File p1) throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: iconst_0       
        //     2: invokevirtual   java/nio/ByteBuffer.position:(I)Ljava/nio/Buffer;
        //     5: pop            
        //     6: aconst_null    
        //     7: astore_2       
        //     8: aconst_null    
        //     9: astore_3       
        //    10: new             Ljava/io/RandomAccessFile;
        //    13: astore          4
        //    15: aload           4
        //    17: aload_1        
        //    18: ldc             "rw"
        //    20: invokespecial   java/io/RandomAccessFile.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    23: aload_3        
        //    24: astore_1       
        //    25: aload           4
        //    27: invokevirtual   java/io/RandomAccessFile.getChannel:()Ljava/nio/channels/FileChannel;
        //    30: astore_2       
        //    31: aload_2        
        //    32: astore_1       
        //    33: aload_2        
        //    34: aload_0        
        //    35: invokevirtual   java/nio/channels/FileChannel.write:(Ljava/nio/ByteBuffer;)I
        //    38: pop            
        //    39: aload_2        
        //    40: astore_1       
        //    41: aload_2        
        //    42: iconst_0       
        //    43: invokevirtual   java/nio/channels/FileChannel.force:(Z)V
        //    46: aload_2        
        //    47: astore_1       
        //    48: aload_2        
        //    49: invokevirtual   java/nio/channels/spi/AbstractInterruptibleChannel.close:()V
        //    52: aload_2        
        //    53: astore_1       
        //    54: aload           4
        //    56: invokevirtual   java/io/RandomAccessFile.close:()V
        //    59: aload_2        
        //    60: invokevirtual   java/nio/channels/spi/AbstractInterruptibleChannel.close:()V
        //    63: aload           4
        //    65: invokevirtual   java/io/RandomAccessFile.close:()V
        //    68: return         
        //    69: astore_0       
        //    70: aload_1        
        //    71: astore_2       
        //    72: aload           4
        //    74: astore_1       
        //    75: goto            81
        //    78: astore_0       
        //    79: aconst_null    
        //    80: astore_1       
        //    81: aload_2        
        //    82: ifnull          89
        //    85: aload_2        
        //    86: invokevirtual   java/nio/channels/spi/AbstractInterruptibleChannel.close:()V
        //    89: aload_1        
        //    90: ifnull          97
        //    93: aload_1        
        //    94: invokevirtual   java/io/RandomAccessFile.close:()V
        //    97: aload_0        
        //    98: athrow         
        //    99: astore_0       
        //   100: goto            63
        //   103: astore_0       
        //   104: goto            68
        //   107: astore_2       
        //   108: goto            89
        //   111: astore_1       
        //   112: goto            97
        //    Exceptions:
        //  throws java.io.IOException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  10     23     78     81     Any
        //  25     31     69     78     Any
        //  33     39     69     78     Any
        //  41     46     69     78     Any
        //  48     52     69     78     Any
        //  54     59     69     78     Any
        //  59     63     99     103    Ljava/io/IOException;
        //  63     68     103    107    Ljava/io/IOException;
        //  85     89     107    111    Ljava/io/IOException;
        //  93     97     111    115    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 70, Size: 70
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
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
    
    public static final class a extends InputStream
    {
        public final ByteBuffer f;
        public int g;
        
        public a(final ByteBuffer f) {
            this.g = -1;
            this.f = f;
        }
        
        @Override
        public final int available() {
            return this.f.remaining();
        }
        
        @Override
        public final void mark(final int n) {
            synchronized (this) {
                this.g = this.f.position();
            }
        }
        
        @Override
        public final boolean markSupported() {
            return true;
        }
        
        @Override
        public final int read() {
            if (!this.f.hasRemaining()) {
                return -1;
            }
            return this.f.get() & 0xFF;
        }
        
        @Override
        public final int read(final byte[] array, final int n, int min) throws IOException {
            if (!this.f.hasRemaining()) {
                return -1;
            }
            min = Math.min(min, this.available());
            this.f.get(array, n, min);
            return min;
        }
        
        @Override
        public final void reset() throws IOException {
            synchronized (this) {
                final int g = this.g;
                if (g != -1) {
                    this.f.position(g);
                    return;
                }
                throw new IOException("Cannot reset to unset mark position");
            }
        }
        
        @Override
        public final long skip(long min) throws IOException {
            if (!this.f.hasRemaining()) {
                return -1L;
            }
            min = Math.min(min, this.available());
            final ByteBuffer f = this.f;
            f.position((int)(f.position() + min));
            return min;
        }
    }
    
    public static final class b
    {
        public final int a;
        public final int b;
        public final byte[] c;
        
        public b(final byte[] c, final int a, final int b) {
            this.c = c;
            this.a = a;
            this.b = b;
        }
    }
}
