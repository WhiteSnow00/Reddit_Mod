// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import ft.e;
import et.a;

public final class UserDeactivationInfo
{
    public static final a<UserDeactivationInfo, UserDeactivationInfo.UserDeactivationInfo$Builder> ADAPTER;
    public final String external_identity_provider;
    public final String verification_source;
    
    static {
        ADAPTER = (a)new UserDeactivationInfo.UserDeactivationInfo$UserDeactivationInfoAdapter((UserDeactivationInfo$1)null);
    }
    
    private UserDeactivationInfo(final UserDeactivationInfo.UserDeactivationInfo$Builder userDeactivationInfo$Builder) {
        this.verification_source = UserDeactivationInfo.UserDeactivationInfo$Builder.access$100(userDeactivationInfo$Builder);
        this.external_identity_provider = UserDeactivationInfo.UserDeactivationInfo$Builder.access$200(userDeactivationInfo$Builder);
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
        final StringBuilder r = a.r("UserDeactivationInfo{verification_source=");
        r.append(this.verification_source);
        r.append(", external_identity_provider=");
        return a.o(r, this.external_identity_provider, "}");
    }
    
    public void write(final e e) throws IOException {
        UserDeactivationInfo.ADAPTER.write(e, (Object)this);
    }
}
