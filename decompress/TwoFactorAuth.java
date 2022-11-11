// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import ft.e;
import et.a;

public final class TwoFactorAuth
{
    public static final a<TwoFactorAuth, TwoFactorAuth.TwoFactorAuth$Builder> ADAPTER;
    public final Boolean backup_code_used;
    public final String device_algorithm;
    public final Integer device_backup_codes_remaining;
    public final Boolean device_exists;
    public final String device_name;
    public final Long device_previous_remaining_backup_codes;
    public final Boolean otp_embedded_in_password;
    
    static {
        ADAPTER = (a)new TwoFactorAuth.TwoFactorAuth$TwoFactorAuthAdapter((TwoFactorAuth$1)null);
    }
    
    private TwoFactorAuth(final TwoFactorAuth.TwoFactorAuth$Builder twoFactorAuth$Builder) {
        this.device_previous_remaining_backup_codes = TwoFactorAuth.TwoFactorAuth$Builder.access$100(twoFactorAuth$Builder);
        this.device_name = TwoFactorAuth.TwoFactorAuth$Builder.access$200(twoFactorAuth$Builder);
        this.device_exists = TwoFactorAuth.TwoFactorAuth$Builder.access$300(twoFactorAuth$Builder);
        this.device_algorithm = TwoFactorAuth.TwoFactorAuth$Builder.access$400(twoFactorAuth$Builder);
        this.device_backup_codes_remaining = TwoFactorAuth.TwoFactorAuth$Builder.access$500(twoFactorAuth$Builder);
        this.backup_code_used = TwoFactorAuth.TwoFactorAuth$Builder.access$600(twoFactorAuth$Builder);
        this.otp_embedded_in_password = TwoFactorAuth.TwoFactorAuth$Builder.access$700(twoFactorAuth$Builder);
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
        if (!(o instanceof TwoFactorAuth)) {
            return false;
        }
        final TwoFactorAuth twoFactorAuth = (TwoFactorAuth)o;
        final Long device_previous_remaining_backup_codes = this.device_previous_remaining_backup_codes;
        final Long device_previous_remaining_backup_codes2 = twoFactorAuth.device_previous_remaining_backup_codes;
        if (device_previous_remaining_backup_codes == device_previous_remaining_backup_codes2 || (device_previous_remaining_backup_codes != null && device_previous_remaining_backup_codes.equals(device_previous_remaining_backup_codes2))) {
            final String device_name = this.device_name;
            final String device_name2 = twoFactorAuth.device_name;
            if (device_name == device_name2 || (device_name != null && device_name.equals(device_name2))) {
                final Boolean device_exists = this.device_exists;
                final Boolean device_exists2 = twoFactorAuth.device_exists;
                if (device_exists == device_exists2 || (device_exists != null && device_exists.equals(device_exists2))) {
                    final String device_algorithm = this.device_algorithm;
                    final String device_algorithm2 = twoFactorAuth.device_algorithm;
                    if (device_algorithm == device_algorithm2 || (device_algorithm != null && device_algorithm.equals(device_algorithm2))) {
                        final Integer device_backup_codes_remaining = this.device_backup_codes_remaining;
                        final Integer device_backup_codes_remaining2 = twoFactorAuth.device_backup_codes_remaining;
                        if (device_backup_codes_remaining == device_backup_codes_remaining2 || (device_backup_codes_remaining != null && device_backup_codes_remaining.equals(device_backup_codes_remaining2))) {
                            final Boolean backup_code_used = this.backup_code_used;
                            final Boolean backup_code_used2 = twoFactorAuth.backup_code_used;
                            if (backup_code_used == backup_code_used2 || (backup_code_used != null && backup_code_used.equals(backup_code_used2))) {
                                final Boolean otp_embedded_in_password = this.otp_embedded_in_password;
                                final Boolean otp_embedded_in_password2 = twoFactorAuth.otp_embedded_in_password;
                                boolean b2 = b;
                                if (otp_embedded_in_password == otp_embedded_in_password2) {
                                    return b2;
                                }
                                if (otp_embedded_in_password != null && otp_embedded_in_password.equals(otp_embedded_in_password2)) {
                                    b2 = b;
                                    return b2;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final Long device_previous_remaining_backup_codes = this.device_previous_remaining_backup_codes;
        int hashCode = 0;
        int hashCode2;
        if (device_previous_remaining_backup_codes == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = device_previous_remaining_backup_codes.hashCode();
        }
        final String device_name = this.device_name;
        int hashCode3;
        if (device_name == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = device_name.hashCode();
        }
        final Boolean device_exists = this.device_exists;
        int hashCode4;
        if (device_exists == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = device_exists.hashCode();
        }
        final String device_algorithm = this.device_algorithm;
        int hashCode5;
        if (device_algorithm == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = device_algorithm.hashCode();
        }
        final Integer device_backup_codes_remaining = this.device_backup_codes_remaining;
        int hashCode6;
        if (device_backup_codes_remaining == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = device_backup_codes_remaining.hashCode();
        }
        final Boolean backup_code_used = this.backup_code_used;
        int hashCode7;
        if (backup_code_used == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = backup_code_used.hashCode();
        }
        final Boolean otp_embedded_in_password = this.otp_embedded_in_password;
        if (otp_embedded_in_password != null) {
            hashCode = otp_embedded_in_password.hashCode();
        }
        return (((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("TwoFactorAuth{device_previous_remaining_backup_codes=");
        r.append(this.device_previous_remaining_backup_codes);
        r.append(", device_name=");
        r.append(this.device_name);
        r.append(", device_exists=");
        r.append(this.device_exists);
        r.append(", device_algorithm=");
        r.append(this.device_algorithm);
        r.append(", device_backup_codes_remaining=");
        r.append(this.device_backup_codes_remaining);
        r.append(", backup_code_used=");
        r.append(this.backup_code_used);
        r.append(", otp_embedded_in_password=");
        r.append(this.otp_embedded_in_password);
        r.append("}");
        return r.toString();
    }
    
    public void write(final e e) throws IOException {
        TwoFactorAuth.ADAPTER.write(e, (Object)this);
    }
}
