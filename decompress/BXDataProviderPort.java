// 
// Decompiled by Procyon v0.6.0
// 

package com.benchmark.strategy.nativePort;

import com.benchmark.ByteBenchBundle;
import android.os.Bundle;
import X.0NC;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import X.1CR;
import com.bytedance.covode.number.Covode;

public class BXDataProviderPort
{
    static {
        Covode.recordClassIndex(3016);
    }
    
    private boolean ifEnableNativeEnvironment() {
        return 1CR.LIZ;
    }
    
    private native void native_clearRepo(final int p0);
    
    private native void native_closeRepo(final int p0);
    
    private native boolean native_deleteRepo(final int p0);
    
    private native void native_dumpRepo(final int p0);
    
    private native boolean native_getBoolean(final int p0, final String p1, final boolean p2);
    
    private native int native_getDeviceFeature(final int p0, final long p1);
    
    private native float native_getFloat(final int p0, final String p1, final float p2);
    
    private native int native_getInt(final int p0, final String p1, final int p2);
    
    private native long native_getLong(final int p0, final String p1, final long p2);
    
    private native String native_getString(final int p0, final String p1);
    
    private native boolean native_hasValue(final int p0, final String p1);
    
    private native int native_init(final String p0);
    
    private native void native_isOpenRuntimeDecision(final boolean p0);
    
    private native void native_openRepo(final int p0);
    
    private native void native_storeBoolean(final int p0, final String p1, final boolean p2, final boolean p3);
    
    private native void native_storeDeviceFeatureFloat(final String p0, final float p1);
    
    private native void native_storeFloat(final int p0, final String p1, final boolean p2, final float p3);
    
    private native void native_storeInt(final int p0, final String p1, final boolean p2, final int p3);
    
    private native void native_storeLong(final int p0, final String p1, final boolean p2, final long p3);
    
    private native void native_storeStrategy(final int p0, final String p1);
    
    private native void native_storeString(final int p0, final String p1, final boolean p2, final String p3);
    
    public void clearRepo(final int n) {
        MethodCollector.i(14704);
        if (this.ifEnableNativeEnvironment()) {
            this.native_clearRepo(n);
        }
        MethodCollector.o(14704);
    }
    
    public void closeRepo(final int n) {
        MethodCollector.i(14701);
        if (this.ifEnableNativeEnvironment()) {
            this.native_closeRepo(n);
        }
        MethodCollector.o(14701);
    }
    
    public Boolean deleteRepo(final int n) {
        this.ifEnableNativeEnvironment();
        return false;
    }
    
    public void dumpRepo(final int n) {
        MethodCollector.i(14724);
        if (this.ifEnableNativeEnvironment()) {
            this.native_dumpRepo(n);
        }
        MethodCollector.o(14724);
    }
    
    public boolean getBoolean(final int n, final String s, final boolean b) {
        MethodCollector.i(14741);
        if (!this.ifEnableNativeEnvironment()) {
            MethodCollector.o(14741);
            return b;
        }
        final boolean native_getBoolean = this.native_getBoolean(n, s, b);
        MethodCollector.o(14741);
        return native_getBoolean;
    }
    
    public void getDeviceFeature(int i, final 0NC[] array, final Bundle bundle) {
        MethodCollector.i(14744);
        if (!this.ifEnableNativeEnvironment()) {
            MethodCollector.o(14744);
            return;
        }
        final ByteBenchBundle obtain = ByteBenchBundle.obtain();
        this.native_getDeviceFeature(i, obtain.getHandle());
        int length;
        0NC 0nc;
        int n;
        for (length = array.length, i = 0; i < length; ++i) {
            0nc = array[i];
            n = BXDataProviderPort$1.LIZ[0nc.LJIIIIZZ.ordinal()];
            if (n != 1) {
                if (n != 2) {
                    if (n == 3) {
                        bundle.putBoolean(0nc.LJII, obtain.getBool(0nc.LJII));
                    }
                }
                else {
                    bundle.putString(0nc.LJII, obtain.getString(0nc.LJII));
                }
            }
            else {
                bundle.putFloat(0nc.LJII, obtain.getFloat(0nc.LJII));
            }
        }
        obtain.recycle();
        MethodCollector.o(14744);
    }
    
    public float getFloat(final int n, final String s, float native_getFloat) {
        MethodCollector.i(14737);
        if (!this.ifEnableNativeEnvironment()) {
            MethodCollector.o(14737);
            return native_getFloat;
        }
        native_getFloat = this.native_getFloat(n, s, native_getFloat);
        MethodCollector.o(14737);
        return native_getFloat;
    }
    
    public int getInt(int native_getInt, final String s, final int n) {
        MethodCollector.i(14730);
        if (!this.ifEnableNativeEnvironment()) {
            MethodCollector.o(14730);
            return n;
        }
        native_getInt = this.native_getInt(native_getInt, s, n);
        MethodCollector.o(14730);
        return native_getInt;
    }
    
    public long getLong(final int n, final String s, long native_getLong) {
        MethodCollector.i(14733);
        if (!this.ifEnableNativeEnvironment()) {
            MethodCollector.o(14733);
            return native_getLong;
        }
        native_getLong = this.native_getLong(n, s, native_getLong);
        MethodCollector.o(14733);
        return native_getLong;
    }
    
    public String getString(final int n, String native_getString) {
        MethodCollector.i(14728);
        if (!this.ifEnableNativeEnvironment()) {
            MethodCollector.o(14728);
            return null;
        }
        native_getString = this.native_getString(n, native_getString);
        MethodCollector.o(14728);
        return native_getString;
    }
    
    public boolean hasValue(final int n, final String s) {
        MethodCollector.i(14726);
        if (!this.ifEnableNativeEnvironment()) {
            MethodCollector.o(14726);
            return false;
        }
        final boolean native_hasValue = this.native_hasValue(n, s);
        MethodCollector.o(14726);
        return native_hasValue;
    }
    
    public int init(final String s) {
        MethodCollector.i(13526);
        if (!this.ifEnableNativeEnvironment()) {
            MethodCollector.o(13526);
            return -1;
        }
        final int native_init = this.native_init(s);
        MethodCollector.o(13526);
        return native_init;
    }
    
    public void isOpenRuntimeDecision(final boolean b) {
        MethodCollector.i(14697);
        if (this.ifEnableNativeEnvironment()) {
            this.native_isOpenRuntimeDecision(b);
        }
        MethodCollector.o(14697);
    }
    
    public void openRepo(final int n) {
        MethodCollector.i(14699);
        if (this.ifEnableNativeEnvironment()) {
            this.native_openRepo(n);
        }
        MethodCollector.o(14699);
    }
    
    public void storeBoolean(final int n, final String s, final boolean b, final boolean b2) {
        MethodCollector.i(15965);
        if (!this.ifEnableNativeEnvironment()) {
            MethodCollector.o(15965);
            return;
        }
        this.native_storeBoolean(n, s, b, b2);
        MethodCollector.o(15965);
    }
    
    public void storeDeviceFeatureFloat(final String s, final float n) {
        MethodCollector.i(15972);
        if (!this.ifEnableNativeEnvironment()) {
            MethodCollector.o(15972);
            return;
        }
        this.native_storeDeviceFeatureFloat(s, n);
        MethodCollector.o(15972);
    }
    
    public void storeFloat(final int n, final String s, final boolean b, final float n2) {
        MethodCollector.i(15967);
        if (!this.ifEnableNativeEnvironment()) {
            MethodCollector.o(15967);
            return;
        }
        this.native_storeFloat(n, s, b, n2);
        MethodCollector.o(15967);
    }
    
    public void storeInt(final int n, final String s, final boolean b, final int n2) {
        MethodCollector.i(15959);
        if (!this.ifEnableNativeEnvironment()) {
            MethodCollector.o(15959);
            return;
        }
        this.native_storeInt(n, s, b, n2);
        MethodCollector.o(15959);
    }
    
    public void storeLong(final int n, final String s, final boolean b, final long n2) {
        MethodCollector.i(15962);
        if (!this.ifEnableNativeEnvironment()) {
            MethodCollector.o(15962);
            return;
        }
        this.native_storeLong(n, s, b, n2);
        MethodCollector.o(15962);
    }
    
    public void storeStrategy(final int n, final String s) {
        MethodCollector.i(15969);
        if (!this.ifEnableNativeEnvironment()) {
            MethodCollector.o(15969);
            return;
        }
        this.native_storeStrategy(n, s);
        MethodCollector.o(15969);
    }
    
    public void storeString(final int n, final String s, final boolean b, final String s2) {
        MethodCollector.i(15964);
        if (!this.ifEnableNativeEnvironment()) {
            MethodCollector.o(15964);
            return;
        }
        this.native_storeString(n, s, b, s2);
        MethodCollector.o(15964);
    }
}
