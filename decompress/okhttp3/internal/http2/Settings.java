// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.http2;

import ng2.e;
import dg2.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0015\n\u0002\b\u000b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0019\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0086\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004J\u0011\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002J\u0006\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bJ\u0006\u0010\u000e\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0000R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001f" }, d2 = { "Lokhttp3/internal/http2/Settings;", "", "Lcg2/j;", "clear", "", "id", "value", "set", "", "isSet", "get", "size", "defaultValue", "getEnablePush", "getMaxConcurrentStreams", "getMaxFrameSize", "getMaxHeaderListSize", "other", "merge", "I", "", "values", "[I", "getHeaderTableSize", "()I", "headerTableSize", "getInitialWindowSize", "initialWindowSize", "<init>", "()V", "Companion", "okhttp" }, k = 1, mv = { 1, 6, 0 })
public final class Settings
{
    public static final int COUNT = 10;
    public static final Companion Companion;
    public static final int DEFAULT_INITIAL_WINDOW_SIZE = 65535;
    public static final int ENABLE_PUSH = 2;
    public static final int HEADER_TABLE_SIZE = 1;
    public static final int INITIAL_WINDOW_SIZE = 7;
    public static final int MAX_CONCURRENT_STREAMS = 4;
    public static final int MAX_FRAME_SIZE = 5;
    public static final int MAX_HEADER_LIST_SIZE = 6;
    private int set;
    private final int[] values;
    
    static {
        Companion = new Companion(null);
    }
    
    public Settings() {
        this.values = new int[10];
    }
    
    public final void clear() {
        this.set = 0;
        j.W1(this.values, 0);
    }
    
    public final int get(final int n) {
        return this.values[n];
    }
    
    public final boolean getEnablePush(boolean b) {
        if ((this.set & 0x4) != 0x0) {
            if (this.values[2] == 1) {
                b = true;
            }
            else {
                b = false;
            }
        }
        return b;
    }
    
    public final int getHeaderTableSize() {
        int n;
        if ((this.set & 0x2) != 0x0) {
            n = this.values[1];
        }
        else {
            n = -1;
        }
        return n;
    }
    
    public final int getInitialWindowSize() {
        int n;
        if ((this.set & 0x80) != 0x0) {
            n = this.values[7];
        }
        else {
            n = 65535;
        }
        return n;
    }
    
    public final int getMaxConcurrentStreams() {
        int n;
        if ((this.set & 0x10) != 0x0) {
            n = this.values[4];
        }
        else {
            n = Integer.MAX_VALUE;
        }
        return n;
    }
    
    public final int getMaxFrameSize(int n) {
        if ((this.set & 0x20) != 0x0) {
            n = this.values[5];
        }
        return n;
    }
    
    public final int getMaxHeaderListSize(int n) {
        if ((this.set & 0x40) != 0x0) {
            n = this.values[6];
        }
        return n;
    }
    
    public final boolean isSet(final int n) {
        boolean b = true;
        if ((1 << n & this.set) == 0x0) {
            b = false;
        }
        return b;
    }
    
    public final void merge(final Settings settings) {
        e.f((Object)settings, "other");
        for (int i = 0; i < 10; ++i) {
            if (settings.isSet(i)) {
                this.set(i, settings.get(i));
            }
        }
    }
    
    public final Settings set(final int n, final int n2) {
        if (n >= 0) {
            final int[] values = this.values;
            if (n < values.length) {
                this.set |= 1 << n;
                values[n] = n2;
            }
        }
        return this;
    }
    
    public final int size() {
        return Integer.bitCount(this.set);
    }
    
    @Metadata(d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f" }, d2 = { "Lokhttp3/internal/http2/Settings$Companion;", "", "()V", "COUNT", "", "DEFAULT_INITIAL_WINDOW_SIZE", "ENABLE_PUSH", "HEADER_TABLE_SIZE", "INITIAL_WINDOW_SIZE", "MAX_CONCURRENT_STREAMS", "MAX_FRAME_SIZE", "MAX_HEADER_LIST_SIZE", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public Companion(final DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
