// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class UserDeactivationInfo
{
    public static final a<UserDeactivationInfo, Builder> ADAPTER;
    public final String external_identity_provider;
    public final String verification_source;
    
    static {
        ADAPTER = (a)new UserDeactivationInfoAdapter(null);
    }
    
    private UserDeactivationInfo(final Builder builder) {
        this.verification_source = Builder.access$100(builder);
        this.external_identity_provider = Builder.access$200(builder);
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
        if (!(o instanceof UserDeactivationInfo)) {
            return false;
        }
        final UserDeactivationInfo userDeactivationInfo = (UserDeactivationInfo)o;
        final String verification_source = this.verification_source;
        final String verification_source2 = userDeactivationInfo.verification_source;
        if (verification_source == verification_source2 || (verification_source != null && verification_source.equals(verification_source2))) {
            final String external_identity_provider = this.external_identity_provider;
            final String external_identity_provider2 = userDeactivationInfo.external_identity_provider;
            boolean b2 = b;
            if (external_identity_provider == external_identity_provider2) {
                return b2;
            }
            if (external_identity_provider != null && external_identity_provider.equals(external_identity_provider2)) {
                b2 = b;
                return b2;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final String verification_source = this.verification_source;
        int hashCode = 0;
        int hashCode2;
        if (verification_source == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = verification_source.hashCode();
        }
        final String external_identity_provider = this.external_identity_provider;
        if (external_identity_provider != null) {
            hashCode = external_identity_provider.hashCode();
        }
        return ((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("UserDeactivationInfo{verification_source=");
        k.append(this.verification_source);
        k.append(", external_identity_provider=");
        return b.j(k, this.external_identity_provider, "}");
    }
    
    public void write(final e e) throws IOException {
        UserDeactivationInfo.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements jt.b<UserDeactivationInfo>
    {
        private String external_identity_provider;
        private String verification_source;
        
        public Builder() {
        }
        
        public Builder(final UserDeactivationInfo userDeactivationInfo) {
            this.verification_source = userDeactivationInfo.verification_source;
            this.external_identity_provider = userDeactivationInfo.external_identity_provider;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.verification_source;
        }
        
        public static /* synthetic */ String access$200(final Builder builder) {
            return builder.external_identity_provider;
        }
        
        public UserDeactivationInfo build() {
            return new UserDeactivationInfo(this, null);
        }
        
        public Builder external_identity_provider(final String external_identity_provider) {
            this.external_identity_provider = external_identity_provider;
            return this;
        }
        
        public void reset() {
            this.verification_source = null;
            this.external_identity_provider = null;
        }
        
        public Builder verification_source(final String verification_source) {
            this.verification_source = verification_source;
            return this;
        }
    }
    
    public static final class UserDeactivationInfoAdapter implements a<UserDeactivationInfo, Builder>
    {
        private UserDeactivationInfoAdapter() {
        }
        
        public UserDeactivationInfo read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public UserDeactivationInfo read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final kt.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                final short b = q.b;
                if (b != 1) {
                    if (b != 2) {
                        mt.a.a(e, a);
                    }
                    else if (a == 11) {
                        builder.external_identity_provider(e.F());
                    }
                    else {
                        mt.a.a(e, a);
                    }
                }
                else if (a == 11) {
                    builder.verification_source(e.F());
                }
                else {
                    mt.a.a(e, a);
                }
                e.r();
            }
            e.J();
            return builder.build();
        }
        
        public void write(final e e, final UserDeactivationInfo userDeactivationInfo) throws IOException {
            e.a0();
            if (userDeactivationInfo.verification_source != null) {
                e.N(1, (byte)11);
                e.Z(userDeactivationInfo.verification_source);
                e.O();
            }
            if (userDeactivationInfo.external_identity_provider != null) {
                e.N(2, (byte)11);
                e.Z(userDeactivationInfo.external_identity_provider);
                e.O();
            }
            e.P();
            e.b0();
        }
    }
}
