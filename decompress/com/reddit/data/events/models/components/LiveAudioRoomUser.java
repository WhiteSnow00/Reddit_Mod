// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class LiveAudioRoomUser
{
    public static final a<LiveAudioRoomUser, Builder> ADAPTER;
    public final String platform_id;
    public final String role;
    public final String speaker_eligibility;
    
    static {
        ADAPTER = (a)new LiveAudioRoomUserAdapter(null);
    }
    
    private LiveAudioRoomUser(final Builder builder) {
        this.platform_id = Builder.access$100(builder);
        this.role = Builder.access$200(builder);
        this.speaker_eligibility = Builder.access$300(builder);
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
        if (!(o instanceof LiveAudioRoomUser)) {
            return false;
        }
        final LiveAudioRoomUser liveAudioRoomUser = (LiveAudioRoomUser)o;
        final String platform_id = this.platform_id;
        final String platform_id2 = liveAudioRoomUser.platform_id;
        if (platform_id == platform_id2 || (platform_id != null && platform_id.equals(platform_id2))) {
            final String role = this.role;
            final String role2 = liveAudioRoomUser.role;
            if (role == role2 || (role != null && role.equals(role2))) {
                final String speaker_eligibility = this.speaker_eligibility;
                final String speaker_eligibility2 = liveAudioRoomUser.speaker_eligibility;
                boolean b2 = b;
                if (speaker_eligibility == speaker_eligibility2) {
                    return b2;
                }
                if (speaker_eligibility != null && speaker_eligibility.equals(speaker_eligibility2)) {
                    b2 = b;
                    return b2;
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final String platform_id = this.platform_id;
        int hashCode = 0;
        int hashCode2;
        if (platform_id == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = platform_id.hashCode();
        }
        final String role = this.role;
        int hashCode3;
        if (role == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = role.hashCode();
        }
        final String speaker_eligibility = this.speaker_eligibility;
        if (speaker_eligibility != null) {
            hashCode = speaker_eligibility.hashCode();
        }
        return (((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("LiveAudioRoomUser{platform_id=");
        k.append(this.platform_id);
        k.append(", role=");
        k.append(this.role);
        k.append(", speaker_eligibility=");
        return b.j(k, this.speaker_eligibility, "}");
    }
    
    public void write(final e e) throws IOException {
        LiveAudioRoomUser.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements jt.b<LiveAudioRoomUser>
    {
        private String platform_id;
        private String role;
        private String speaker_eligibility;
        
        public Builder() {
        }
        
        public Builder(final LiveAudioRoomUser liveAudioRoomUser) {
            this.platform_id = liveAudioRoomUser.platform_id;
            this.role = liveAudioRoomUser.role;
            this.speaker_eligibility = liveAudioRoomUser.speaker_eligibility;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.platform_id;
        }
        
        public static /* synthetic */ String access$200(final Builder builder) {
            return builder.role;
        }
        
        public static /* synthetic */ String access$300(final Builder builder) {
            return builder.speaker_eligibility;
        }
        
        public LiveAudioRoomUser build() {
            return new LiveAudioRoomUser(this, null);
        }
        
        public Builder platform_id(final String platform_id) {
            this.platform_id = platform_id;
            return this;
        }
        
        public void reset() {
            this.platform_id = null;
            this.role = null;
            this.speaker_eligibility = null;
        }
        
        public Builder role(final String role) {
            this.role = role;
            return this;
        }
        
        public Builder speaker_eligibility(final String speaker_eligibility) {
            this.speaker_eligibility = speaker_eligibility;
            return this;
        }
    }
    
    public static final class LiveAudioRoomUserAdapter implements a<LiveAudioRoomUser, Builder>
    {
        private LiveAudioRoomUserAdapter() {
        }
        
        public LiveAudioRoomUser read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public LiveAudioRoomUser read(final e e, final Builder builder) throws IOException {
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
                        if (b != 3) {
                            mt.a.a(e, a);
                        }
                        else if (a == 11) {
                            builder.speaker_eligibility(e.F());
                        }
                        else {
                            mt.a.a(e, a);
                        }
                    }
                    else if (a == 11) {
                        builder.role(e.F());
                    }
                    else {
                        mt.a.a(e, a);
                    }
                }
                else if (a == 11) {
                    builder.platform_id(e.F());
                }
                else {
                    mt.a.a(e, a);
                }
                e.r();
            }
            e.J();
            return builder.build();
        }
        
        public void write(final e e, final LiveAudioRoomUser liveAudioRoomUser) throws IOException {
            e.a0();
            if (liveAudioRoomUser.platform_id != null) {
                e.N(1, (byte)11);
                e.Z(liveAudioRoomUser.platform_id);
                e.O();
            }
            if (liveAudioRoomUser.role != null) {
                e.N(2, (byte)11);
                e.Z(liveAudioRoomUser.role);
                e.O();
            }
            if (liveAudioRoomUser.speaker_eligibility != null) {
                e.N(3, (byte)11);
                e.Z(liveAudioRoomUser.speaker_eligibility);
                e.O();
            }
            e.P();
            e.b0();
        }
    }
}
