// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import java.util.Arrays;
import android.hardware.SensorEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import android.hardware.Sensor;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;
import android.hardware.SensorEventListener;

public final class w implements SensorEventListener
{
    public long AFInAppEventParameterName;
    public final float[][] AFInAppEventType;
    public double AFKeystoreWrapper;
    public final Executor AFVersionDeclaration;
    public final int AppsFlyer2dXConversionCallback;
    public final String getLevel;
    public final String init;
    public final int valueOf;
    public final long[] values;
    
    static {
        Covode.recordClassIndex(2714);
    }
    
    public w(final Sensor sensor, final Executor afVersionDeclaration) {
        this.AFInAppEventType = new float[2][];
        this.values = new long[2];
        this.AFVersionDeclaration = afVersionDeclaration;
        final int type = sensor.getType();
        this.valueOf = type;
        final String name = sensor.getName();
        final String s = "";
        String init = name;
        if (name == null) {
            init = "";
        }
        this.init = init;
        String vendor = sensor.getVendor();
        if (vendor == null) {
            vendor = s;
        }
        this.getLevel = vendor;
        this.AppsFlyer2dXConversionCallback = ((type + 31) * 31 + init.hashCode()) * 31 + vendor.hashCode();
    }
    
    private Map<String, Object> AFInAppEventParameterName() {
        final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", this.valueOf);
        concurrentHashMap.put("sN", this.init);
        concurrentHashMap.put("sV", this.getLevel);
        final float[] array = this.AFInAppEventType[0];
        if (array != null) {
            concurrentHashMap.put("sVS", valueOf(array));
        }
        final float[] array2 = this.AFInAppEventType[1];
        if (array2 != null) {
            concurrentHashMap.put("sVE", valueOf(array2));
        }
        return concurrentHashMap;
    }
    
    private boolean AFKeystoreWrapper() {
        return this.AFInAppEventType[0] != null;
    }
    
    private boolean AFKeystoreWrapper(final int n, final String s, final String s2) {
        return this.valueOf == n && this.init.equals(s) && this.getLevel.equals(s2);
    }
    
    public static List<Float> valueOf(final float[] array) {
        final ArrayList list = new ArrayList(array.length);
        for (int length = array.length, i = 0; i < length; ++i) {
            list.add(array[i]);
        }
        return list;
    }
    
    public static /* synthetic */ double values(final float[] array, final float[] array2) {
        final int min = Math.min(array.length, array2.length);
        double n = 0.0;
        for (int i = 0; i < min; ++i) {
            n += StrictMath.pow(array[i] - array2[i], 2.0);
        }
        return Math.sqrt(n);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof w) {
            final w w = (w)o;
            return this.AFKeystoreWrapper(w.valueOf, w.init, w.getLevel);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.AppsFlyer2dXConversionCallback;
    }
    
    public final void onAccuracyChanged(final Sensor sensor, final int n) {
    }
    
    public final void onSensorChanged(final SensorEvent sensorEvent) {
        this.AFVersionDeclaration.execute(new Runnable() {
            public /* synthetic */ long AFInAppEventType = sensorEvent.timestamp;
            public /* synthetic */ float[] values = sensorEvent.values;
            
            static {
                Covode.recordClassIndex(2715);
            }
            
            @Override
            public final void run() {
                final long currentTimeMillis = System.currentTimeMillis();
                final float[] array = w.this.AFInAppEventType[0];
                if (array == null) {
                    final float[][] afInAppEventType = w.this.AFInAppEventType;
                    final float[] values = this.values;
                    afInAppEventType[0] = Arrays.copyOf(values, values.length);
                    w.this.values[0] = currentTimeMillis;
                    return;
                }
                final float[] array2 = w.this.AFInAppEventType[1];
                if (array2 == null) {
                    final float[] values2 = this.values;
                    final float[] copy = Arrays.copyOf(values2, values2.length);
                    w.this.AFInAppEventType[1] = copy;
                    w.this.values[1] = currentTimeMillis;
                    w.this.AFKeystoreWrapper = w.values(array, copy);
                    return;
                }
                if (50000000L <= this.AFInAppEventType - w.this.AFInAppEventParameterName) {
                    w.this.AFInAppEventParameterName = this.AFInAppEventType;
                    if (Arrays.equals(array2, this.values)) {
                        w.this.values[1] = currentTimeMillis;
                        return;
                    }
                    final double values3 = w.values(array, this.values);
                    if (values3 > w.this.AFKeystoreWrapper) {
                        final float[][] afInAppEventType2 = w.this.AFInAppEventType;
                        final float[] values4 = this.values;
                        afInAppEventType2[1] = Arrays.copyOf(values4, values4.length);
                        w.this.values[1] = currentTimeMillis;
                        w.this.AFKeystoreWrapper = values3;
                    }
                }
            }
        });
    }
    
    public final void values(final Map<w, Map<String, Object>> map, final boolean b) {
        if (this.AFKeystoreWrapper()) {
            map.put(this, this.AFInAppEventParameterName());
            if (b) {
                final int length = this.AFInAppEventType.length;
                final int n = 0;
                for (int i = 0; i < length; ++i) {
                    this.AFInAppEventType[i] = null;
                }
                for (int length2 = this.values.length, j = n; j < length2; ++j) {
                    this.values[j] = 0L;
                }
                this.AFKeystoreWrapper = 0.0;
                this.AFInAppEventParameterName = 0L;
            }
        }
        else if (!map.containsKey(this)) {
            map.put(this, this.AFInAppEventParameterName());
        }
    }
}
