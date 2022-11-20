// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import et.b;
import java.io.IOException;
import ft.e;
import et.a;

public final class RES
{
    public static final a<RES, Builder> ADAPTER;
    public final Boolean night_mode;
    public final String version;
    
    static {
        ADAPTER = (a)new RESAdapter(null);
    }
    
    private RES(final Builder builder) {
        this.version = Builder.access$100(builder);
        this.night_mode = Builder.access$200(builder);
    }
    
    public RES(final Builder builder, final RES$1 object) {
        this(builder);
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = true;
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof RES)) {
            return false;
        }
        final RES res = (RES)o;
        final String version = this.version;
        final String version2 = res.version;
        if (version == version2 || (version != null && version.equals(version2))) {
            final Boolean night_mode = this.night_mode;
            final Boolean night_mode2 = res.night_mode;
            boolean b2 = b;
            if (night_mode == night_mode2) {
                return b2;
            }
            if (night_mode != null && night_mode.equals(night_mode2)) {
                b2 = b;
                return b2;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final String version = this.version;
        int hashCode = 0;
        int hashCode2;
        if (version == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = version.hashCode();
        }
        final Boolean night_mode = this.night_mode;
        if (night_mode != null) {
            hashCode = night_mode.hashCode();
        }
        return ((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("RES{version=");
        t.append(this.version);
        t.append(", night_mode=");
        t.append(this.night_mode);
        t.append("}");
        return t.toString();
    }
    
    public void write(final e e) throws IOException {
        RES.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<RES>
    {
        private Boolean night_mode;
        private String version;
        
        public Builder() {
        }
        
        public Builder(final RES res) {
            this.version = res.version;
            this.night_mode = res.night_mode;
        }
        
        public static String access$100(final Builder builder) {
            return builder.version;
        }
        
        public static Boolean access$200(final Builder builder) {
            return builder.night_mode;
        }
        
        public RES build() {
            return new RES(this, null);
        }
        
        public /* bridge */ Object build() {
            return this.build();
        }
        
        public Builder night_mode(final Boolean night_mode) {
            this.night_mode = night_mode;
            return this;
        }
        
        public void reset() {
            this.version = null;
            this.night_mode = null;
        }
        
        public Builder version(final String version) {
            this.version = version;
            return this;
        }
    }
    
    public static final class RESAdapter implements a<RES, Builder>
    {
        private RESAdapter() {
        }
        
        public RESAdapter(final RES$1 object) {
            this();
        }
        
        public RES read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public RES read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final ft.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                final short b = q.b;
                if (b != 1) {
                    if (b != 2) {
                        ht.a.a(e, a);
                    }
                    else if (a == 2) {
                        builder.night_mode(e.b());
                    }
                    else {
                        ht.a.a(e, a);
                    }
                }
                else if (a == 11) {
                    builder.version(e.F());
                }
                else {
                    ht.a.a(e, a);
                }
                e.r();
            }
            e.I();
            return builder.build();
        }
        
        public /* bridge */ Object read(final e e) throws ThriftException, IOException {
            return this.read(e);
        }
        
        public /* bridge */ Object read(final e e, final b b) throws ThriftException, IOException {
            return this.read(e, (Builder)b);
        }
        
        public void write(final e e, final RES res) throws IOException {
            e.X();
            if (res.version != null) {
                e.O(1, (byte)11);
                e.W(res.version);
                e.P();
            }
            if (res.night_mode != null) {
                e.O(2, (byte)2);
                android.support.v4.media.a.A(res.night_mode, e);
            }
            e.R();
            e.Y();
        }
        
        public /* bridge */ void write(final e e, final Object o) throws IOException {
            this.write(e, (RES)o);
        }
    }
}
