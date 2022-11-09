// 
// Decompiled by Procyon v0.6.0
// 

package com.bef.effectsdk.text;

import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.TypeFaceLancet;
import com.bytedance.sysoptimizer.TypeFaceOptimizer;
import java.io.File;
import com.bytedance.covode.number.Covode;
import java.util.LinkedList;
import android.graphics.Typeface;
import java.util.Hashtable;

public class FontCache
{
    public static Hashtable<String, Typeface> fontCache;
    public static LinkedList<String> lruQueue;
    
    static {
        Covode.recordClassIndex(2840);
        FontCache.fontCache = new Hashtable<String, Typeface>();
        FontCache.lruQueue = new LinkedList<String>();
    }
    
    public static Typeface INVOKESTATIC_com_bef_effectsdk_text_FontCache_com_bytedance_sysoptimizer_TypeFaceLancet_createFromFile(final File file) {
        if (TypeFaceOptimizer.getSwitch()) {
            final String path = file.getPath();
            if (path != null) {
                if (TypeFaceLancet.cache.contains(path)) {
                    return (Typeface)TypeFaceLancet.cache.get(path);
                }
                final Typeface fromFile = Typeface.createFromFile(file);
                if (fromFile != null) {
                    TypeFaceLancet.cache.put(path, fromFile);
                    return fromFile;
                }
            }
        }
        return Typeface.createFromFile(file);
    }
    
    public static Typeface getFromFile(final String s, String s2) {
        synchronized (FontCache.class) {
            MethodCollector.i(1942);
            final StringBuilder sb = new StringBuilder("FILE_");
            sb.append(s);
            sb.append("_");
            sb.append(s2);
            final String string = sb.toString();
            final Typeface typeface = FontCache.fontCache.get(string);
            Typeface invokestatic_com_bef_effectsdk_text_FontCache_com_bytedance_sysoptimizer_TypeFaceLancet_createFromFile = null;
            Label_0156: {
                Label_0088: {
                    if (typeface == null) {
                        Label_0108: {
                            try {
                                invokestatic_com_bef_effectsdk_text_FontCache_com_bytedance_sysoptimizer_TypeFaceLancet_createFromFile = INVOKESTATIC_com_bef_effectsdk_text_FontCache_com_bytedance_sysoptimizer_TypeFaceLancet_createFromFile(new File(s, s2));
                                break Label_0108;
                            }
                            catch (final Exception ex) {
                                MethodCollector.o(1942);
                                return null;
                            }
                            break Label_0088;
                        }
                        if (FontCache.lruQueue.size() >= 32) {
                            s2 = FontCache.lruQueue.removeLast();
                            FontCache.fontCache.remove(s2);
                            System.gc();
                        }
                        FontCache.fontCache.put(string, invokestatic_com_bef_effectsdk_text_FontCache_com_bytedance_sysoptimizer_TypeFaceLancet_createFromFile);
                        FontCache.lruQueue.addFirst(string);
                        break Label_0156;
                    }
                }
                FontCache.lruQueue.remove(string);
                FontCache.lruQueue.addFirst(string);
                invokestatic_com_bef_effectsdk_text_FontCache_com_bytedance_sysoptimizer_TypeFaceLancet_createFromFile = typeface;
            }
            MethodCollector.o(1942);
            return invokestatic_com_bef_effectsdk_text_FontCache_com_bytedance_sysoptimizer_TypeFaceLancet_createFromFile;
        }
    }
    
    public static Typeface getFromSystem(final String s, final int n) {
        synchronized (FontCache.class) {
            MethodCollector.i(1969);
            final StringBuilder sb = new StringBuilder("SYSTEM_");
            sb.append(s);
            sb.append("_");
            sb.append(n);
            final String string = sb.toString();
            final Typeface typeface = FontCache.fontCache.get(string);
            Typeface create = null;
            Label_0147: {
                Label_0079: {
                    if (typeface == null) {
                        Label_0099: {
                            try {
                                create = Typeface.create(s, n);
                                break Label_0099;
                            }
                            catch (final Exception ex) {
                                MethodCollector.o(1969);
                                return null;
                            }
                            break Label_0079;
                        }
                        if (FontCache.lruQueue.size() >= 32) {
                            FontCache.fontCache.remove(FontCache.lruQueue.removeLast());
                            System.gc();
                        }
                        FontCache.fontCache.put(string, create);
                        FontCache.lruQueue.addFirst(string);
                        break Label_0147;
                    }
                }
                FontCache.lruQueue.remove(string);
                FontCache.lruQueue.addFirst(string);
                create = typeface;
            }
            MethodCollector.o(1969);
            return create;
        }
    }
}
