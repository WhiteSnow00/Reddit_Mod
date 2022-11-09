// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import jt.b;
import java.io.IOException;
import kt.e;
import jt.a;

public final class TwoFactorAuth
{
    public static final a<TwoFactorAuth, Builder> ADAPTER;
    public final Boolean backup_code_used;
    public final String device_algorithm;
    public final Integer device_backup_codes_remaining;
    public final Boolean device_exists;
    public final String device_name;
    public final Long device_previous_remaining_backup_codes;
    public final Boolean otp_embedded_in_password;
    
    static {
        ADAPTER = (a)new TwoFactorAuthAdapter(null);
    }
    
    private TwoFactorAuth(final Builder builder) {
        this.device_previous_remaining_backup_codes = Builder.access$100(builder);
        this.device_name = Builder.access$200(builder);
        this.device_exists = Builder.access$300(builder);
        this.device_algorithm = Builder.access$400(builder);
        this.device_backup_codes_remaining = Builder.access$500(builder);
        this.backup_code_used = Builder.access$600(builder);
        this.otp_embedded_in_password = Builder.access$700(builder);
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
        final StringBuilder k = a.k("TwoFactorAuth{device_previous_remaining_backup_codes=");
        k.append(this.device_previous_remaining_backup_codes);
        k.append(", device_name=");
        k.append(this.device_name);
        k.append(", device_exists=");
        k.append(this.device_exists);
        k.append(", device_algorithm=");
        k.append(this.device_algorithm);
        k.append(", device_backup_codes_remaining=");
        k.append(this.device_backup_codes_remaining);
        k.append(", backup_code_used=");
        k.append(this.backup_code_used);
        k.append(", otp_embedded_in_password=");
        k.append(this.otp_embedded_in_password);
        k.append("}");
        return k.toString();
    }
    
    public void write(final e e) throws IOException {
        TwoFactorAuth.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<TwoFactorAuth>
    {
        private Boolean backup_code_used;
        private String device_algorithm;
        private Integer device_backup_codes_remaining;
        private Boolean device_exists;
        private String device_name;
        private Long device_previous_remaining_backup_codes;
        private Boolean otp_embedded_in_password;
        
        public Builder() {
        }
        
        public Builder(final TwoFactorAuth twoFactorAuth) {
            this.device_previous_remaining_backup_codes = twoFactorAuth.device_previous_remaining_backup_codes;
            this.device_name = twoFactorAuth.device_name;
            this.device_exists = twoFactorAuth.device_exists;
            this.device_algorithm = twoFactorAuth.device_algorithm;
            this.device_backup_codes_remaining = twoFactorAuth.device_backup_codes_remaining;
            this.backup_code_used = twoFactorAuth.backup_code_used;
            this.otp_embedded_in_password = twoFactorAuth.otp_embedded_in_password;
        }
        
        public static /* synthetic */ Long access$100(final Builder builder) {
            return builder.device_previous_remaining_backup_codes;
        }
        
        public static /* synthetic */ String access$200(final Builder builder) {
            return builder.device_name;
        }
        
        public static /* synthetic */ Boolean access$300(final Builder builder) {
            return builder.device_exists;
        }
        
        public static /* synthetic */ String access$400(final Builder builder) {
            return builder.device_algorithm;
        }
        
        public static /* synthetic */ Integer access$500(final Builder builder) {
            return builder.device_backup_codes_remaining;
        }
        
        public static /* synthetic */ Boolean access$600(final Builder builder) {
            return builder.backup_code_used;
        }
        
        public static /* synthetic */ Boolean access$700(final Builder builder) {
            return builder.otp_embedded_in_password;
        }
        
        public Builder backup_code_used(final Boolean backup_code_used) {
            this.backup_code_used = backup_code_used;
            return this;
        }
        
        public TwoFactorAuth build() {
            return new TwoFactorAuth(this, null);
        }
        
        public Builder device_algorithm(final String device_algorithm) {
            this.device_algorithm = device_algorithm;
            return this;
        }
        
        public Builder device_backup_codes_remaining(final Integer device_backup_codes_remaining) {
            this.device_backup_codes_remaining = device_backup_codes_remaining;
            return this;
        }
        
        public Builder device_exists(final Boolean device_exists) {
            this.device_exists = device_exists;
            return this;
        }
        
        public Builder device_name(final String device_name) {
            this.device_name = device_name;
            return this;
        }
        
        public Builder device_previous_remaining_backup_codes(final Long device_previous_remaining_backup_codes) {
            this.device_previous_remaining_backup_codes = device_previous_remaining_backup_codes;
            return this;
        }
        
        public Builder otp_embedded_in_password(final Boolean otp_embedded_in_password) {
            this.otp_embedded_in_password = otp_embedded_in_password;
            return this;
        }
        
        public void reset() {
            this.device_previous_remaining_backup_codes = null;
            this.device_name = null;
            this.device_exists = null;
            this.device_algorithm = null;
            this.device_backup_codes_remaining = null;
            this.backup_code_used = null;
            this.otp_embedded_in_password = null;
        }
    }
    
    public static final class TwoFactorAuthAdapter implements a<TwoFactorAuth, Builder>
    {
        private TwoFactorAuthAdapter() {
        }
        
        public TwoFactorAuth read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public TwoFactorAuth read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final kt.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                switch (q.b) {
                    default: {
                        mt.a.a(e, a);
                        break;
                    }
                    case 7: {
                        if (a == 2) {
                            builder.otp_embedded_in_password(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 2) {
                            builder.backup_code_used(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 8) {
                            builder.device_backup_codes_remaining(e.t());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 11) {
                            builder.device_algorithm(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 2) {
                            builder.device_exists(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 11) {
                            builder.device_name(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 10) {
                            builder.device_previous_remaining_backup_codes(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                }
                e.r();
            }
            e.J();
            return builder.build();
        }
        
        public void write(final e e, final TwoFactorAuth twoFactorAuth) throws IOException {
            e.a0();
            if (twoFactorAuth.device_previous_remaining_backup_codes != null) {
                e.N(1, (byte)10);
                a.r(twoFactorAuth.device_previous_remaining_backup_codes, e);
            }
            if (twoFactorAuth.device_name != null) {
                e.N(2, (byte)11);
                e.Z(twoFactorAuth.device_name);
                e.O();
            }
            if (twoFactorAuth.device_exists != null) {
                e.N(3, (byte)2);
                d.z(twoFactorAuth.device_exists, e);
            }
            if (twoFactorAuth.device_algorithm != null) {
                e.N(4, (byte)11);
                e.Z(twoFactorAuth.device_algorithm);
                e.O();
            }
            if (twoFactorAuth.device_backup_codes_remaining != null) {
                e.N(5, (byte)8);
                b.r(twoFactorAuth.device_backup_codes_remaining, e);
            }
            if (twoFactorAuth.backup_code_used != null) {
                e.N(6, (byte)2);
                d.z(twoFactorAuth.backup_code_used, e);
            }
            if (twoFactorAuth.otp_embedded_in_password != null) {
                e.N(7, (byte)2);
                d.z(twoFactorAuth.otp_embedded_in_password, e);
            }
            e.P();
            e.b0();
        }
    }
}
