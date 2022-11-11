// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.InputStream;
import com.bytedance.covode.number.Covode;
import java.io.FilterInputStream;

public final class cq extends FilterInputStream
{
    public final int AFInAppEventParameterName;
    public byte[] AFInAppEventType;
    public byte[] AFKeystoreWrapper;
    public int[] AFLogger$LogLevel;
    public int AFVersionDeclaration;
    public int AppsFlyer2dXConversionCallback;
    public int getLevel;
    public int init;
    public cn valueOf;
    public byte[] values;
    
    static {
        Covode.recordClassIndex(2685);
    }
    
    public cq(final InputStream inputStream, final int[] array, final byte[] array2, int min, final boolean b, final int getLevel) {
        super(inputStream);
        MethodCollector.i(4104);
        this.AFVersionDeclaration = Integer.MAX_VALUE;
        min = Math.min(Math.max(min, 3), 16);
        this.AFInAppEventParameterName = min;
        this.AFInAppEventType = new byte[8];
        final byte[] values = new byte[8];
        this.values = values;
        this.AFKeystoreWrapper = new byte[8];
        this.AFLogger$LogLevel = new int[2];
        this.init = 8;
        this.AppsFlyer2dXConversionCallback = 8;
        this.getLevel = getLevel;
        if (getLevel == 2) {
            System.arraycopy(array2, 0, values, 0, 8);
        }
        this.valueOf = new cn(array, min, true, false);
        MethodCollector.o(4104);
    }
    
    private int AFInAppEventType() {
        MethodCollector.i(3925);
        if (this.AFVersionDeclaration == Integer.MAX_VALUE) {
            this.AFVersionDeclaration = super.in.read();
        }
        final int init = this.init;
        final int n = 8;
        if (init == 8) {
            final byte[] afInAppEventType = this.AFInAppEventType;
            final int afVersionDeclaration = this.AFVersionDeclaration;
            afInAppEventType[0] = (byte)afVersionDeclaration;
            if (afVersionDeclaration < 0) {
                final IllegalStateException ex = new IllegalStateException("unexpected block size");
                MethodCollector.o(3925);
                throw ex;
            }
            int n2 = 1;
            int n3;
            do {
                final int read = super.in.read(this.AFInAppEventType, n2, 8 - n2);
                n3 = n2;
                if (read <= 0) {
                    break;
                }
                n3 = n2 + read;
            } while ((n2 = n3) < 8);
            if (n3 < 8) {
                final IllegalStateException ex2 = new IllegalStateException("unexpected block size");
                MethodCollector.o(3925);
                throw ex2;
            }
            this.AFKeystoreWrapper();
            final int read2 = super.in.read();
            this.AFVersionDeclaration = read2;
            this.init = 0;
            int appsFlyer2dXConversionCallback = n;
            if (read2 < 0) {
                appsFlyer2dXConversionCallback = 8 - (this.AFInAppEventType[7] & 0xFF);
            }
            this.AppsFlyer2dXConversionCallback = appsFlyer2dXConversionCallback;
        }
        final int appsFlyer2dXConversionCallback2 = this.AppsFlyer2dXConversionCallback;
        MethodCollector.o(3925);
        return appsFlyer2dXConversionCallback2;
    }
    
    private void AFKeystoreWrapper() {
        if (this.getLevel == 2) {
            final byte[] afInAppEventType = this.AFInAppEventType;
            System.arraycopy(afInAppEventType, 0, this.AFKeystoreWrapper, 0, afInAppEventType.length);
        }
        final byte[] afInAppEventType2 = this.AFInAppEventType;
        cv.AFInAppEventParameterName((afInAppEventType2[0] << 24 & 0xFF000000) + (afInAppEventType2[1] << 16 & 0xFF0000) + (afInAppEventType2[2] << 8 & 0xFF00) + (afInAppEventType2[3] & 0xFF), (0xFF000000 & afInAppEventType2[4] << 24) + (0xFF0000 & afInAppEventType2[5] << 16) + (0xFF00 & afInAppEventType2[6] << 8) + (afInAppEventType2[7] & 0xFF), false, this.AFInAppEventParameterName, this.valueOf.valueOf, this.valueOf.values, this.AFLogger$LogLevel);
        final int[] afLogger$LogLevel = this.AFLogger$LogLevel;
        final int n = afLogger$LogLevel[0];
        final int n2 = afLogger$LogLevel[1];
        final byte[] afInAppEventType3 = this.AFInAppEventType;
        afInAppEventType3[0] = (byte)(n >> 24);
        afInAppEventType3[1] = (byte)(n >> 16);
        afInAppEventType3[2] = (byte)(n >> 8);
        afInAppEventType3[3] = (byte)n;
        afInAppEventType3[4] = (byte)(n2 >> 24);
        afInAppEventType3[5] = (byte)(n2 >> 16);
        afInAppEventType3[6] = (byte)(n2 >> 8);
        afInAppEventType3[7] = (byte)n2;
        if (this.getLevel == 2) {
            int n3 = 0;
            do {
                final byte[] afInAppEventType4 = this.AFInAppEventType;
                afInAppEventType4[n3] ^= this.values[n3];
            } while (++n3 < 8);
            final byte[] afKeystoreWrapper = this.AFKeystoreWrapper;
            System.arraycopy(afKeystoreWrapper, 0, this.values, 0, afKeystoreWrapper.length);
        }
    }
    
    @Override
    public final int available() {
        this.AFInAppEventType();
        return this.AppsFlyer2dXConversionCallback - this.init;
    }
    
    @Override
    public final boolean markSupported() {
        return false;
    }
    
    @Override
    public final int read() {
        this.AFInAppEventType();
        final int init = this.init;
        if (init >= this.AppsFlyer2dXConversionCallback) {
            return -1;
        }
        final byte[] afInAppEventType = this.AFInAppEventType;
        this.init = init + 1;
        return afInAppEventType[init] & 0xFF;
    }
    
    @Override
    public final int read(final byte[] array, final int n, final int n2) {
        final int n3 = n + n2;
        int i = n;
        while (i < n3) {
            this.AFInAppEventType();
            final int init = this.init;
            if (init >= this.AppsFlyer2dXConversionCallback) {
                if (i == n) {
                    return -1;
                }
                return n2 - (n3 - i);
            }
            else {
                final byte[] afInAppEventType = this.AFInAppEventType;
                this.init = init + 1;
                array[i] = afInAppEventType[init];
                ++i;
            }
        }
        return n2;
    }
    
    @Override
    public final long skip(final long n) {
        MethodCollector.i(1413);
        long n2;
        for (n2 = 0L; n2 < n && this.read() != -1; ++n2) {}
        MethodCollector.o(1413);
        return n2;
    }
}
