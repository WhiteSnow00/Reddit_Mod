// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import b5.k;
import com.microsoft.thrifty.ThriftException;
import et.b;
import java.io.IOException;
import ft.e;
import et.a;

public final class PWA
{
    public static final a<PWA, Builder> ADAPTER;
    public final Long install_timestamp;
    public final Boolean installable;
    public final Boolean installed;
    
    static {
        ADAPTER = (a)new PWAAdapter(null);
    }
    
    private PWA(final Builder builder) {
        this.installable = Builder.access$100(builder);
        this.installed = Builder.access$200(builder);
        this.install_timestamp = Builder.access$300(builder);
    }
    
    public PWA(final Builder builder, final PWA$1 object) {
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
        if (!(o instanceof PWA)) {
            return false;
        }
        final PWA pwa = (PWA)o;
        final Boolean installable = this.installable;
        final Boolean installable2 = pwa.installable;
        if (installable == installable2 || (installable != null && installable.equals(installable2))) {
            final Boolean installed = this.installed;
            final Boolean installed2 = pwa.installed;
            if (installed == installed2 || (installed != null && installed.equals(installed2))) {
                final Long install_timestamp = this.install_timestamp;
                final Long install_timestamp2 = pwa.install_timestamp;
                boolean b2 = b;
                if (install_timestamp == install_timestamp2) {
                    return b2;
                }
                if (install_timestamp != null && install_timestamp.equals(install_timestamp2)) {
                    b2 = b;
                    return b2;
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final Boolean installable = this.installable;
        int hashCode = 0;
        int hashCode2;
        if (installable == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = installable.hashCode();
        }
        final Boolean installed = this.installed;
        int hashCode3;
        if (installed == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = installed.hashCode();
        }
        final Long install_timestamp = this.install_timestamp;
        if (install_timestamp != null) {
            hashCode = install_timestamp.hashCode();
        }
        return (((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("PWA{installable=");
        t.append(this.installable);
        t.append(", installed=");
        t.append(this.installed);
        t.append(", install_timestamp=");
        return d.l(t, this.install_timestamp, "}");
    }
    
    public void write(final e e) throws IOException {
        PWA.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<PWA>
    {
        private Long install_timestamp;
        private Boolean installable;
        private Boolean installed;
        
        public Builder() {
        }
        
        public Builder(final PWA pwa) {
            this.installable = pwa.installable;
            this.installed = pwa.installed;
            this.install_timestamp = pwa.install_timestamp;
        }
        
        public static Boolean access$100(final Builder builder) {
            return builder.installable;
        }
        
        public static Boolean access$200(final Builder builder) {
            return builder.installed;
        }
        
        public static Long access$300(final Builder builder) {
            return builder.install_timestamp;
        }
        
        public PWA build() {
            return new PWA(this, null);
        }
        
        public /* bridge */ Object build() {
            return this.build();
        }
        
        public Builder install_timestamp(final Long install_timestamp) {
            this.install_timestamp = install_timestamp;
            return this;
        }
        
        public Builder installable(final Boolean installable) {
            this.installable = installable;
            return this;
        }
        
        public Builder installed(final Boolean installed) {
            this.installed = installed;
            return this;
        }
        
        public void reset() {
            this.installable = null;
            this.installed = null;
            this.install_timestamp = null;
        }
    }
    
    public static final class PWAAdapter implements a<PWA, Builder>
    {
        private PWAAdapter() {
        }
        
        public PWAAdapter(final PWA$1 object) {
            this();
        }
        
        public PWA read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public PWA read(final e e, final Builder builder) throws IOException {
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
                        if (b != 3) {
                            ht.a.a(e, a);
                        }
                        else if (a == 10) {
                            builder.install_timestamp(e.v());
                        }
                        else {
                            ht.a.a(e, a);
                        }
                    }
                    else if (a == 2) {
                        builder.installed(e.b());
                    }
                    else {
                        ht.a.a(e, a);
                    }
                }
                else if (a == 2) {
                    builder.installable(e.b());
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
        
        public void write(final e e, final PWA pwa) throws IOException {
            e.X();
            if (pwa.installable != null) {
                e.O(1, (byte)2);
                android.support.v4.media.a.A(pwa.installable, e);
            }
            if (pwa.installed != null) {
                e.O(2, (byte)2);
                android.support.v4.media.a.A(pwa.installed, e);
            }
            if (pwa.install_timestamp != null) {
                e.O(3, (byte)10);
                k.w(pwa.install_timestamp, e);
            }
            e.R();
            e.Y();
        }
        
        public /* bridge */ void write(final e e, final Object o) throws IOException {
            this.write(e, (PWA)o);
        }
    }
}
