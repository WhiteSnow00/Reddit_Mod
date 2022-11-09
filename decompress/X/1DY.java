// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.lang.reflect.ParameterizedType;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.io.IOException;
import com.bytedance.android.livesdk.livesetting.message.UsePbObjectJsonPassThroughSetting;
import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import java.util.List;
import com.google.gson.j;
import com.bytedance.android.livesdk.livesetting.message.LiveMtPbRequestsSetting;
import com.google.gson.m;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.InputStream;
import android.text.TextUtils;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.retrofit2.mime.TypedInput;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.covode.number.Covode;

public final class 1dY extends 7AP
{
    public ThreadLocal<0Ta> LIZ;
    public 7EM LIZIZ;
    
    static {
        Covode.recordClassIndex(10443);
    }
    
    public 1dY(final 7EM liziz) {
        this.LIZ = new ThreadLocal<0Ta>();
        this.LIZIZ = liziz;
    }
    
    private 0z4 LIZ(final Class clazz, final Class clazz2, final 0Ta 0Ta, final 0z1 0z1) {
        final 0z4 0z2 = new 0z4();
        0z2.statusCode = 0z1.LIZ;
        if (0z1.LIZ == 0) {
            final long liz = 0Ta.LIZ();
            while (true) {
                final int liziz = 0Ta.LIZIZ();
                if (liziz == -1) {
                    break;
                }
                if (liziz != 1) {
                    if (liziz != 2) {
                        0Tb.LIZJ(0Ta);
                    }
                    else {
                        LIZ(0z2.extra = 0ys.LIZ().LIZ((Class<R>)clazz2).LIZIZ(0Ta), 0z1);
                    }
                }
                else if (this.LIZ(clazz, 0Ta)) {
                    0z2.data = 0ys.LIZ().LIZ((Class<T>)clazz).LIZIZ(0Ta);
                }
                else if (clazz == Void.class) {
                    0z2.data = null;
                }
                else if (clazz == 2P9.class) {
                    0z2.data = (T)2P9.LIZ;
                }
                else {
                    0z2.data = (T)new Object();
                }
            }
            0Ta.LIZ(liz);
        }
        else {
            0z2.error = LIZ(0z1);
            0z2.extra = LIZ(0z1, (Class<R>)clazz2);
        }
        return 0z2;
    }
    
    public static 1dY LIZ(final 7EM 7em) {
        return new 1dY(7em);
    }
    
    private 1dk LIZ(final Class clazz, final 0Ta 0Ta, final 0z1 0z1) {
        final 1dk 1dk = new 1dk();
        1dk.LIZ = 0z1.LIZ;
        final Extra lizj = new Extra();
        LIZ(lizj, 0z1);
        1dk.LIZJ = (R)lizj;
        1dk.LIZIZ = (List<T>)new ArrayList<Object>();
        if (0z1.LIZ == 0) {
            final long liz = 0Ta.LIZ();
            while (true) {
                final int liziz = 0Ta.LIZIZ();
                if (liziz == -1) {
                    break;
                }
                if (liziz == 1) {
                    if (!this.LIZ(clazz, 0Ta)) {
                        continue;
                    }
                    1dk.LIZIZ.add(0ys.LIZ().LIZ((Class<T>)clazz).LIZIZ(0Ta));
                }
                else {
                    0Tb.LIZJ(0Ta);
                }
            }
            0Ta.LIZ(liz);
        }
        else {
            1dk.LJI = LIZ(0z1);
        }
        return 1dk;
    }
    
    private 7At<TypedInput, ?> LIZ(final Type type, final Annotation[] array, final 7A7 7a7) {
        return (7At<TypedInput, ?>)((7AP)this.LIZIZ).responseBodyConverter(type, array, 7a7);
    }
    
    public static RequestError LIZ(final 0z1 0z1) {
        final RequestError requestError = new RequestError();
        requestError.message = 0z1.LIZIZ;
        requestError.prompts = 0z1.LIZJ;
        requestError.alert = 0z1.LIZLLL;
        return requestError;
    }
    
    public static <T extends Extra> T LIZ(final 0z1 0z1, final Class<T> clazz) {
        if (TextUtils.isEmpty((CharSequence)0z1.LJFF)) {
            return null;
        }
        return (T)0b8.a.LIZIZ.LIZ(0z1.LJFF, (Class)clazz);
    }
    
    private <T, S> Object LIZ(final int n, final T t, final S n2, final String s, final Type type, final Annotation[] array, final 7A7 7a7) {
        public final class 1dX implements TypedInput
        {
            public final /* synthetic */ InputStream LIZ;
            
            static {
                Covode.recordClassIndex(10444);
            }
            
            public 1dX(final InputStream liz) {
                this.LIZ = liz;
            }
            
            public final InputStream in() {
                return this.LIZ;
            }
            
            public final long length() {
                return this.LIZ.available();
            }
            
            public final String mimeType() {
                return "application/json";
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.i:(I)V
        //     6: new             Lcom/google/gson/m;
        //     9: dup            
        //    10: invokespecial   com/google/gson/m.<init>:()V
        //    13: astore          8
        //    15: aload           8
        //    17: ldc             "status_code"
        //    19: iload_1        
        //    20: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    23: invokevirtual   com/google/gson/m.LIZ:(Ljava/lang/String;Ljava/lang/Number;)V
        //    26: aload           8
        //    28: ldc             "data"
        //    30: getstatic       X/0yt.LIZ:LX/0yt;
        //    33: invokevirtual   X/0yt.LIZ:()Lcom/google/gson/Gson;
        //    36: aload_2        
        //    37: invokevirtual   com/google/gson/Gson.LIZ:(Ljava/lang/Object;)Lcom/google/gson/j;
        //    40: invokevirtual   com/google/gson/m.LIZ:(Ljava/lang/String;Lcom/google/gson/j;)V
        //    43: aload           8
        //    45: ldc             "extra"
        //    47: getstatic       X/0yt.LIZ:LX/0yt;
        //    50: invokevirtual   X/0yt.LIZ:()Lcom/google/gson/Gson;
        //    53: aload_3        
        //    54: invokevirtual   com/google/gson/Gson.LIZ:(Ljava/lang/Object;)Lcom/google/gson/j;
        //    57: invokevirtual   com/google/gson/m.LIZ:(Ljava/lang/String;Lcom/google/gson/j;)V
        //    60: invokestatic    X/0ys.LIZ:()LX/0ys;
        //    63: astore_3       
        //    64: new             Ljava/lang/StringBuilder;
        //    67: dup            
        //    68: invokespecial   java/lang/StringBuilder.<init>:()V
        //    71: astore_2       
        //    72: aload_2        
        //    73: getstatic       com/bytedance/android/livesdk/livesetting/message/LiveMtPbRequestsSetting.INSTANCE:Lcom/bytedance/android/livesdk/livesetting/message/LiveMtPbRequestsSetting;
        //    76: invokevirtual   com/bytedance/android/livesdk/livesetting/message/LiveMtPbRequestsSetting.getValue:()Lcom/bytedance/android/live/network/model/RequestPb;
        //    79: invokevirtual   com/bytedance/android/live/network/model/RequestPb.getPassThroughApi:()Ljava/lang/String;
        //    82: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    85: pop            
        //    86: aload_2        
        //    87: aload           4
        //    89: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    92: pop            
        //    93: new             Ljava/io/ByteArrayInputStream;
        //    96: dup            
        //    97: new             Ljava/lang/String;
        //   100: dup            
        //   101: aload_3        
        //   102: aload_2        
        //   103: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   106: new             Ljava/util/ArrayList;
        //   109: dup            
        //   110: invokespecial   java/util/ArrayList.<init>:()V
        //   113: ldc             "application/json"
        //   115: getstatic       X/0yt.LIZ:LX/0yt;
        //   118: invokevirtual   X/0yt.LIZ:()Lcom/google/gson/Gson;
        //   121: aload           8
        //   123: invokevirtual   com/google/gson/Gson.LIZ:(Lcom/google/gson/j;)Ljava/lang/String;
        //   126: invokevirtual   java/lang/String.getBytes:()[B
        //   129: invokevirtual   X/0ys.LIZ:(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;[B)LX/H0J;
        //   132: invokeinterface X/H0J.LIZ:()Ljava/lang/Object;
        //   137: checkcast       LX/7F6;
        //   140: getfield        X/7F6.LJ:[B
        //   143: invokespecial   java/lang/String.<init>:([B)V
        //   146: ldc_w           "UTF-8"
        //   149: invokestatic    java/nio/charset/Charset.forName:(Ljava/lang/String;)Ljava/nio/charset/Charset;
        //   152: invokevirtual   java/lang/String.getBytes:(Ljava/nio/charset/Charset;)[B
        //   155: invokespecial   java/io/ByteArrayInputStream.<init>:([B)V
        //   158: astore_2       
        //   159: aload_0        
        //   160: aload           5
        //   162: aload           6
        //   164: aload           7
        //   166: invokespecial   X/1dY.LIZ:(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;LX/7A7;)LX/7At;
        //   169: new             LX/1dX;
        //   172: dup            
        //   173: aload_2        
        //   174: invokespecial   X/1dX.<init>:(Ljava/io/InputStream;)V
        //   177: invokeinterface X/7At.convert:(Ljava/lang/Object;)Ljava/lang/Object;
        //   182: astore_2       
        //   183: sipush          15070
        //   186: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   189: aload_2        
        //   190: areturn        
        //    Signature:
        //  <T:Ljava/lang/Object;S:Ljava/lang/Object;>(ITT;TS;Ljava/lang/String;Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;LX/7A7;)Ljava/lang/Object;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:419)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:207)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1106)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:993)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:548)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:548)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:377)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:213)
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
    
    public static void LIZ(final Extra extra, final 0z1 0z1) {
        extra.now = 0z1.LJ;
    }
    
    private boolean LIZ(final Class<?> clazz, final 0Ta 0Ta) {
        if (clazz != null && clazz != Void.class && clazz != Object.class && clazz != 2P9.class) {
            return true;
        }
        final long liz = 0Ta.LIZ();
        while (0Ta.LIZIZ() != -1) {
            0Tb.LIZJ(0Ta);
        }
        0Ta.LIZ(liz);
        return false;
    }
    
    private 0z3 LIZIZ(final Class clazz, final Class clazz2, final 0Ta 0Ta, final 0z1 0z1) {
        final 0z3 0z2 = new 0z3();
        0z2.LIZ = 0z1.LIZ;
        if (0z1.LIZ == 0) {
            0z2.LIZIZ = (List<T>)new ArrayList<Object>();
            final long liz = 0Ta.LIZ();
            while (true) {
                final int liziz = 0Ta.LIZIZ();
                if (liziz == -1) {
                    break;
                }
                if (liziz != 1) {
                    if (liziz != 2) {
                        0Tb.LIZJ(0Ta);
                    }
                    else {
                        LIZ(0z2.LIZJ = 0ys.LIZ().LIZ((Class<R>)clazz2).LIZIZ(0Ta), 0z1);
                    }
                }
                else {
                    if (!this.LIZ(clazz, 0Ta)) {
                        continue;
                    }
                    0z2.LIZIZ.add(0ys.LIZ().LIZ((Class<T>)clazz).LIZIZ(0Ta));
                }
            }
            0Ta.LIZ(liz);
        }
        else {
            0z2.LJI = LIZ(0z1);
            0z2.LIZJ = LIZ(0z1, (Class<R>)clazz2);
        }
        return 0z2;
    }
    
    private 1dj LIZIZ(final Class clazz, final 0Ta 0Ta, final 0z1 0z1) {
        final 1dj 1dj = new 1dj();
        1dj.statusCode = 0z1.LIZ;
        final Extra extra = new Extra();
        LIZ(extra, 0z1);
        1dj.extra = (R)extra;
        if (0z1.LIZ == 0) {
            if (this.LIZ(clazz, 0Ta)) {
                1dj.data = 0ys.LIZ().LIZ((Class<T>)clazz).LIZIZ(0Ta);
            }
            else if (clazz == Void.class) {
                1dj.data = null;
            }
            else if (clazz == 2P9.class) {
                1dj.data = (T)2P9.LIZ;
            }
            else {
                1dj.data = (T)new Object();
            }
        }
        else {
            1dj.error = LIZ(0z1);
        }
        return 1dj;
    }
    
    public final 7At<?, TypedOutput> requestBodyConverter(final Type type, final Annotation[] array, final Annotation[] array2, final 7A7 7a7) {
        return (7At<?, TypedOutput>)((7AP)this.LIZIZ).requestBodyConverter(type, array, array2, 7a7);
    }
    
    public final 7At<TypedInput, ?> responseBodyConverter(final Type type, final Annotation[] array, final 7A7 7a7) {
        if (!(type instanceof ParameterizedType)) {
            return this.LIZ(type, array, 7a7);
        }
        final ParameterizedType parameterizedType = (ParameterizedType)type;
        final Type rawType = parameterizedType.getRawType();
        if (!(rawType instanceof Class)) {
            return this.LIZ(type, array, 7a7);
        }
        final Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        final Class[] array2 = new Class[2];
        final int length = actualTypeArguments.length;
        int n = 0;
        if (length > 0) {
            if (!(actualTypeArguments[0] instanceof Class)) {
                return this.LIZ(type, array, 7a7);
            }
            array2[0] = (Class)actualTypeArguments[0];
        }
        if (actualTypeArguments.length == 2) {
            if (!(actualTypeArguments[1] instanceof Class)) {
                return this.LIZ(type, array, 7a7);
            }
            array2[1] = (Class)actualTypeArguments[1];
        }
        else if (actualTypeArguments.length > 2) {
            return this.LIZ(type, array, 7a7);
        }
        final Class clazz = (Class)rawType;
        if (clazz != 1dl.class && clazz != 1dk.class && clazz != 0z4.class && clazz != 0z3.class && clazz != 1dj.class) {
            return this.LIZ(type, array, 7a7);
        }
        final String s = null;
        final int length2 = array.length;
        while (true) {
            Annotation annotation = null;
            Block_16: {
                String s2;
                while (true) {
                    s2 = s;
                    if (n >= length2) {
                        break;
                    }
                    annotation = array[n];
                    if (annotation instanceof 7B9) {
                        s2 = ((7B9)annotation).LIZ();
                        break;
                    }
                    if (annotation instanceof 7BB) {
                        break Block_16;
                    }
                    ++n;
                }
                String s3 = s2;
                if (TextUtils.isEmpty((CharSequence)s2)) {
                    s3 = "/";
                }
                return (7At<TypedInput, ?>)new 1dZ(this, clazz, array2, s3, type, array, 7a7);
            }
            String s2 = ((7BB)annotation).LIZ();
            continue;
        }
    }
}
