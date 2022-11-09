// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.io.File;
import org.json.JSONException;
import java.util.Map;
import android.text.TextUtils;
import org.json.JSONObject;
import android.content.Context;
import java.util.Iterator;
import java.util.HashMap;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class 0Ma
{
    public static ArrayList<String> LIZ;
    public static String[] LIZIZ;
    public static String[] LIZJ;
    public static String[] LIZLLL;
    
    static {
        Covode.recordClassIndex(2745);
        0Ma.LIZ = new ArrayList<String>();
        0Ma.LIZIZ = new String[] { "/cache/picture/im_fresco_cache/", "/cache/picture/fresco_cache/", "/files/awcn_strategy/pushservice/", "/files/keva/repo/", "/files/live_kv/", "/files/effect/", "/files/music/", "/files/logs/", "/files/ALOG/", "/cache/cachev2/", "/cache/runnableCache/", "/files/robust/", "/files/tt_file_st/", "/cache/feedCache/", "/files/leakcanary/", "/cache/ttnet_storage/", "/files/MiPushLog/", "/cache/picture/", "/cache/ttnet_storage/", "/cache/cjpayWebData/", "/cache/awemeCache/", "/files/font/", "/files/npth/", "/files/.msdata/", "/files/.dynamic/", "/files/bdp/", "/files/a/", "/cache/WebView/", "/files/webview_bytedance/", "/files/.patchs/", "/files/.envelope/", "/files/.emitter/", "/files/.umeng/", "/files/.bak/", "/files/.pre_download/", "/files/.imprint/", "/shared_prefs/", "/app_sslcache/", "/app_webview/", "/lib-main/", "/splashCache/", "/awemeSplashCache/", "/app_SGLib/", "/app_assets/", "/small_emoji_res/", "/system_emoji_res/", "/files/draft/", "/files/Download/", "/files/rhea/", "/files/speed_ml/", "/databases/", "/files/filters/", "/files/extract_shot/", "/files/effectmodel/", "/files/extract_custom_sticker/", "/covode/", "/app_hws_webview/", "/files/Pictures/CJPayImageLoader/", "/cache/Universal_activity", "/files/audio-effect/", "/files/mvtheme/", "/files/origin_sound/", "/files/ve_frame_cache2/", "/files/hdr_filter/", "/files/hianalytics/" };
        0Ma.LIZJ = new String[] { "/files/plugins/", "/cache/Universal_activity/", "/files/appbrand/" };
        0Ma.LIZLLL = new String[] { "/files/offlineX/", "/files/offline/", "/files/live_sdk_gecko/" };
    }
    
    public static HashMap<String, Integer> LIZ(final String s) {
        final HashMap<String, Integer> liziz = LIZIZ(s);
        if (liziz != null) {
            final HashMap<String, Integer> lizj = liziz;
            if (!liziz.isEmpty()) {
                return lizj;
            }
        }
        try {
            return LIZJ(s);
        }
        finally {
            return liziz;
        }
    }
    
    public static HashMap<String, Integer> LIZ(final HashMap<String, Integer> hashMap) {
        if (hashMap == null) {
            return null;
        }
        final HashMap hashMap2 = new HashMap();
    Label_0024:
        for (final String s : hashMap.keySet()) {
            final String[] liziz = 0Ma.LIZIZ;
            final int length = liziz.length;
            final int n = 0;
            for (int i = 0; i < length; ++i) {
                if (s.startsWith(liziz[i])) {
                    continue Label_0024;
                }
            }
            final Iterator<String> iterator2 = 0Ma.LIZ.iterator();
            while (iterator2.hasNext()) {
                if (s.startsWith(iterator2.next())) {
                    continue Label_0024;
                }
            }
            final String[] lizj = 0Ma.LIZJ;
            for (int length2 = lizj.length, j = 0; j < length2; ++j) {
                if (s.startsWith(lizj[j]) && s.split("/").length != 4) {
                    continue Label_0024;
                }
            }
            final String[] lizlll = 0Ma.LIZLLL;
            for (int length3 = lizlll.length, k = n; k < length3; ++k) {
                final String s2 = lizlll[k];
                if (s.startsWith(s2) && s.split("/").length == 4) {
                    hashMap2.put(s, hashMap.get(s));
                    continue Label_0024;
                }
                if (s.startsWith(s2) && s.split("/").length == 5) {
                    hashMap2.put(s, hashMap.get(s));
                    continue Label_0024;
                }
            }
            hashMap2.put(s.replaceAll("\\d+", "*"), hashMap.get(s));
        }
        return hashMap2;
    }
    
    public static void LIZ(final Context context, final JSONObject jsonObject) {
        final String packageName = context.getPackageName();
        final ArrayList<String> liz = 0Ma.LIZ;
        final StringBuilder sb = new StringBuilder("/cache/webviewbytedance_");
        sb.append(packageName);
        sb.append(":miniapp0/");
        liz.add(sb.toString());
        final ArrayList<String> liz2 = 0Ma.LIZ;
        final StringBuilder sb2 = new StringBuilder("/cache/webviewbytedance_");
        sb2.append(packageName);
        sb2.append("/");
        liz2.add(sb2.toString());
        final ArrayList<String> liz3 = 0Ma.LIZ;
        final StringBuilder sb3 = new StringBuilder("/app_webviewbytedance_");
        sb3.append(packageName);
        sb3.append(":miniapp0/");
        liz3.add(sb3.toString());
        final ArrayList<String> liz4 = 0Ma.LIZ;
        final StringBuilder sb4 = new StringBuilder("/app_webview_");
        sb4.append(packageName);
        sb4.append(":miniapp0/");
        liz4.add(sb4.toString());
        final ArrayList<String> liz5 = 0Ma.LIZ;
        final StringBuilder sb5 = new StringBuilder("/cache/webview_");
        sb5.append(packageName);
        sb5.append(":miniapp0/");
        liz5.add(sb5.toString());
        final ArrayList<String> liz6 = 0Ma.LIZ;
        final StringBuilder sb6 = new StringBuilder("/app_webviewbytedance_");
        sb6.append(packageName);
        sb6.append("/");
        liz6.add(sb6.toString());
        final ArrayList<String> liz7 = 0Ma.LIZ;
        final StringBuilder sb7 = new StringBuilder("/app_webviewbytedance_ttwebview_bytedance_");
        sb7.append(packageName);
        sb7.append("/");
        liz7.add(sb7.toString());
        final ArrayList<String> liz8 = 0Ma.LIZ;
        final StringBuilder sb8 = new StringBuilder("/app_hws_webview_");
        sb8.append(packageName);
        sb8.append(":miniapp0/");
        liz8.add(sb8.toString());
        if (5ek.LIZJ == null || !5ek.LJ) {
            5ek.LIZJ = context.getFilesDir();
        }
        final HashMap<String, Integer> liz9 = LIZ(LIZ(5ek.LIZJ.getParent()));
        File file;
        if (!TextUtils.isEmpty((CharSequence)"")) {
            file = context.getExternalFilesDir("");
        }
        else {
            if (5ek.LIZLLL == null || !5ek.LJ) {
                5ek.LIZLLL = context.getExternalFilesDir("");
            }
            file = 5ek.LIZLLL;
        }
        final HashMap<String, Integer> liz10 = LIZ(LIZ(file.getParent()));
        Label_0499: {
            if (liz9 == null) {
                break Label_0499;
            }
            try {
                for (final Map.Entry entry : liz9.entrySet()) {
                    final StringBuilder sb9 = new StringBuilder("internal");
                    sb9.append((String)entry.getKey());
                    jsonObject.put(sb9.toString(), entry.getValue());
                }
                if (liz10 != null) {
                    for (final Map.Entry entry2 : liz10.entrySet()) {
                        final StringBuilder sb10 = new StringBuilder("external");
                        sb10.append((String)entry2.getKey());
                        jsonObject.put(sb10.toString(), entry2.getValue());
                    }
                }
            }
            catch (final JSONException ex) {}
        }
    }
    
    public static HashMap<String, Integer> LIZIZ(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.i:(I)V
        //     6: aload_0        
        //     7: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    10: ifeq            21
        //    13: sipush          18853
        //    16: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //    19: aconst_null    
        //    20: areturn        
        //    21: new             Ljava/util/HashMap;
        //    24: dup            
        //    25: invokespecial   java/util/HashMap.<init>:()V
        //    28: astore_1       
        //    29: invokestatic    java/lang/Runtime.getRuntime:()Ljava/lang/Runtime;
        //    32: ldc_w           "du -a -d 4 "
        //    35: aload_0        
        //    36: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //    39: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //    42: invokevirtual   java/lang/Runtime.exec:(Ljava/lang/String;)Ljava/lang/Process;
        //    45: astore_2       
        //    46: new             Ljava/io/BufferedReader;
        //    49: astore_3       
        //    50: new             Ljava/io/InputStreamReader;
        //    53: astore          4
        //    55: aload           4
        //    57: aload_2        
        //    58: invokevirtual   java/lang/Process.getInputStream:()Ljava/io/InputStream;
        //    61: invokespecial   java/io/InputStreamReader.<init>:(Ljava/io/InputStream;)V
        //    64: aload_3        
        //    65: aload           4
        //    67: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;)V
        //    70: aload_3        
        //    71: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
        //    74: astore          4
        //    76: aload           4
        //    78: ifnull          142
        //    81: aload           4
        //    83: ldc_w           "\t"
        //    86: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //    89: astore          5
        //    91: aload           5
        //    93: arraylength    
        //    94: iconst_2       
        //    95: if_icmpne       70
        //    98: aload           5
        //   100: iconst_1       
        //   101: aaload         
        //   102: aload_0        
        //   103: ldc_w           ""
        //   106: invokevirtual   java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
        //   109: astore_2       
        //   110: aload_2        
        //   111: astore          4
        //   113: aload_2        
        //   114: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   117: ifeq            125
        //   120: ldc_w           "DiskTotal"
        //   123: astore          4
        //   125: aload_1        
        //   126: aload           4
        //   128: aload           5
        //   130: iconst_0       
        //   131: aaload         
        //   132: invokestatic    java/lang/Integer.valueOf:(Ljava/lang/String;)Ljava/lang/Integer;
        //   135: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   138: pop            
        //   139: goto            70
        //   142: aload_3        
        //   143: invokevirtual   java/io/BufferedReader.close:()V
        //   146: aload_3        
        //   147: invokevirtual   java/io/BufferedReader.close:()V
        //   150: sipush          18853
        //   153: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   156: aload_1        
        //   157: areturn        
        //   158: astore_0       
        //   159: aconst_null    
        //   160: astore_0       
        //   161: aload_0        
        //   162: invokevirtual   java/io/BufferedReader.close:()V
        //   165: sipush          18853
        //   168: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   171: aconst_null    
        //   172: areturn        
        //   173: astore_0       
        //   174: aload_3        
        //   175: astore_0       
        //   176: goto            161
        //   179: astore_0       
        //   180: goto            150
        //   183: astore_0       
        //   184: goto            165
        //    Signature:
        //  (Ljava/lang/String;)Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Integer;>;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  29     70     158    161    Any
        //  70     76     173    179    Any
        //  81     110    173    179    Any
        //  113    120    173    179    Any
        //  125    139    173    179    Any
        //  142    146    173    179    Any
        //  146    150    179    183    Ljava/io/IOException;
        //  161    165    183    187    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 92, Size: 92
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
    
    public static HashMap<String, Integer> LIZJ(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.i:(I)V
        //     6: aload_0        
        //     7: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    10: ifne            21
        //    13: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    16: bipush          24
        //    18: if_icmplt       29
        //    21: sipush          18855
        //    24: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //    27: aconst_null    
        //    28: areturn        
        //    29: getstatic       X/0MY.LIZ:Z
        //    32: ifne            43
        //    35: sipush          18855
        //    38: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //    41: aconst_null    
        //    42: areturn        
        //    43: new             Ljava/util/HashMap;
        //    46: dup            
        //    47: invokespecial   java/util/HashMap.<init>:()V
        //    50: astore_1       
        //    51: invokestatic    java/lang/Runtime.getRuntime:()Ljava/lang/Runtime;
        //    54: ldc_w           "du -a "
        //    57: aload_0        
        //    58: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //    61: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //    64: invokevirtual   java/lang/Runtime.exec:(Ljava/lang/String;)Ljava/lang/Process;
        //    67: astore_2       
        //    68: new             Ljava/io/BufferedReader;
        //    71: astore_3       
        //    72: new             Ljava/io/InputStreamReader;
        //    75: astore          4
        //    77: aload           4
        //    79: aload_2        
        //    80: invokevirtual   java/lang/Process.getInputStream:()Ljava/io/InputStream;
        //    83: invokespecial   java/io/InputStreamReader.<init>:(Ljava/io/InputStream;)V
        //    86: aload_3        
        //    87: aload           4
        //    89: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;)V
        //    92: aload_3        
        //    93: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
        //    96: astore_2       
        //    97: aload_2        
        //    98: ifnull          163
        //   101: aload_2        
        //   102: ldc_w           "\t"
        //   105: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //   108: astore          4
        //   110: aload           4
        //   112: arraylength    
        //   113: iconst_2       
        //   114: if_icmpne       153
        //   117: aload           4
        //   119: iconst_1       
        //   120: aaload         
        //   121: aload_0        
        //   122: ldc_w           ""
        //   125: invokevirtual   java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
        //   128: astore_2       
        //   129: aload_2        
        //   130: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   133: ifeq            170
        //   136: ldc_w           "DiskTotal"
        //   139: astore_2       
        //   140: aload_1        
        //   141: aload_2        
        //   142: aload           4
        //   144: iconst_0       
        //   145: aaload         
        //   146: invokestatic    java/lang/Integer.valueOf:(Ljava/lang/String;)Ljava/lang/Integer;
        //   149: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   152: pop            
        //   153: aload_1        
        //   154: invokevirtual   java/util/HashMap.size:()I
        //   157: sipush          5000
        //   160: if_icmplt       92
        //   163: aload_3        
        //   164: invokevirtual   java/io/BufferedReader.close:()V
        //   167: goto            193
        //   170: aload_2        
        //   171: ldc             "/"
        //   173: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //   176: astore          5
        //   178: aload           5
        //   180: ifnull          92
        //   183: aload           5
        //   185: arraylength    
        //   186: iconst_5       
        //   187: if_icmpgt       92
        //   190: goto            140
        //   193: aload_3        
        //   194: invokevirtual   java/io/BufferedReader.close:()V
        //   197: sipush          18855
        //   200: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   203: aload_1        
        //   204: areturn        
        //   205: astore_0       
        //   206: aconst_null    
        //   207: astore_0       
        //   208: aload_0        
        //   209: ifnull          216
        //   212: aload_0        
        //   213: invokevirtual   java/io/BufferedReader.close:()V
        //   216: sipush          18855
        //   219: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   222: aconst_null    
        //   223: areturn        
        //   224: astore_0       
        //   225: aload_3        
        //   226: astore_0       
        //   227: goto            208
        //   230: astore_0       
        //   231: goto            197
        //   234: astore_0       
        //   235: goto            216
        //    Signature:
        //  (Ljava/lang/String;)Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Integer;>;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  51     92     205    208    Any
        //  92     97     224    230    Any
        //  101    136    224    230    Any
        //  140    153    224    230    Any
        //  153    163    224    230    Any
        //  163    167    224    230    Any
        //  170    178    224    230    Any
        //  183    190    224    230    Any
        //  193    197    230    234    Ljava/io/IOException;
        //  212    216    234    238    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 116, Size: 116
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
}
