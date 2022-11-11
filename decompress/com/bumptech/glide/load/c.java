// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.load;

import java.io.IOException;
import r8.b;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;

public final class c implements a
{
    public final /* synthetic */ ParcelFileDescriptorRewinder a;
    public final /* synthetic */ b b;
    
    public c(final ParcelFileDescriptorRewinder a, final b b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final ImageHeaderParser.ImageType a(final ImageHeaderParser p0) throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore_2       
        //     4: new             Ljava/io/FileInputStream;
        //     7: astore_3       
        //     8: aload_3        
        //     9: aload_0        
        //    10: getfield        com/bumptech/glide/load/c.a:Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;
        //    13: invokevirtual   com/bumptech/glide/load/data/ParcelFileDescriptorRewinder.c:()Landroid/os/ParcelFileDescriptor;
        //    16: invokevirtual   android/os/ParcelFileDescriptor.getFileDescriptor:()Ljava/io/FileDescriptor;
        //    19: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/FileDescriptor;)V
        //    22: aload_2        
        //    23: aload_3        
        //    24: aload_0        
        //    25: getfield        com/bumptech/glide/load/c.b:Lr8/b;
        //    28: invokespecial   com/bumptech/glide/load/resource/bitmap/RecyclableBufferedInputStream.<init>:(Ljava/io/InputStream;Lr8/b;)V
        //    31: aload_1        
        //    32: aload_2        
        //    33: invokeinterface com/bumptech/glide/load/ImageHeaderParser.a:(Ljava/io/InputStream;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;
        //    38: astore_1       
        //    39: aload_2        
        //    40: invokevirtual   com/bumptech/glide/load/resource/bitmap/RecyclableBufferedInputStream.close:()V
        //    43: aload_0        
        //    44: getfield        com/bumptech/glide/load/c.a:Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;
        //    47: invokevirtual   com/bumptech/glide/load/data/ParcelFileDescriptorRewinder.c:()Landroid/os/ParcelFileDescriptor;
        //    50: pop            
        //    51: aload_1        
        //    52: areturn        
        //    53: astore_1       
        //    54: goto            60
        //    57: astore_1       
        //    58: aconst_null    
        //    59: astore_2       
        //    60: aload_2        
        //    61: ifnull          68
        //    64: aload_2        
        //    65: invokevirtual   com/bumptech/glide/load/resource/bitmap/RecyclableBufferedInputStream.close:()V
        //    68: aload_0        
        //    69: getfield        com/bumptech/glide/load/c.a:Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;
        //    72: invokevirtual   com/bumptech/glide/load/data/ParcelFileDescriptorRewinder.c:()Landroid/os/ParcelFileDescriptor;
        //    75: pop            
        //    76: aload_1        
        //    77: athrow         
        //    78: astore_2       
        //    79: goto            43
        //    82: astore_2       
        //    83: goto            68
        //    Exceptions:
        //  throws java.io.IOException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      31     57     60     Any
        //  31     39     53     57     Any
        //  39     43     78     82     Ljava/io/IOException;
        //  64     68     82     86     Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0043:
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
}
