// 
// Decompiled by Procyon v0.6.0
// 

package com.davemorrissey.labs.subscaleview.decoder;

import java.lang.reflect.InvocationTargetException;
import android.graphics.Bitmap$Config;

public class CompatDecoderFactory<T> implements DecoderFactory<T>
{
    private final Bitmap$Config bitmapConfig;
    private final Class<? extends T> clazz;
    
    public CompatDecoderFactory(final Class<? extends T> clazz) {
        this(clazz, null);
    }
    
    public CompatDecoderFactory(final Class<? extends T> clazz, final Bitmap$Config bitmapConfig) {
        this.clazz = clazz;
        this.bitmapConfig = bitmapConfig;
    }
    
    public T make() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        if (this.bitmapConfig == null) {
            return (T)this.clazz.newInstance();
        }
        return (T)this.clazz.getConstructor(Bitmap$Config.class).newInstance(this.bitmapConfig);
    }
}
